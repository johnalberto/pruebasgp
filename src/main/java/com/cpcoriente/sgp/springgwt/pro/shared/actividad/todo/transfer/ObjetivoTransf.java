/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.actividad.todo.transfer;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ObjetivoDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ProductoDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionObjetivoDO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IProyectoDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador.EstadoObjetivoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IObjetivoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IProductoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IVersionObjetivoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ObjetivoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ProductoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.VersionObjetivoTO;


/**
 * @author CPC-04
 *
 */
public class ObjetivoTransf implements IObjetivoTransf {

private static final Logger log = Logger.getLogger(ObjetivoTransf.class.getName());
	

	
	private IProductoTransf getProductoTransf() {
		return TransfFactory.getInstance().getProductoTransf();
	}
	
	private IVersionObjetivoTransf getVersionObjetivoTransf() {
		return TransfFactory.getInstance().getVersionObjetivoTransf();
	}
	
	
	private IProyectoDAO getProyectoDAO() {
		return DAOFactory.getInstance().getProyectoDao();
	}
	
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IObjetivoTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ObjetivoTO)
	 */
	public ObjetivoDO transferirTODO(ObjetivoTO objetivoTO) {
		
		ObjetivoDO objetivoDO = new ObjetivoDO();
		
		if (objetivoTO.getId() != null) {
			objetivoDO.setId(objetivoTO.getId());
		}
		
		objetivoDO.setCodigo(objetivoTO.getCodigo());
		objetivoDO.setEstado(objetivoTO.getEstado().getValor());
		objetivoDO.setDescripcion(objetivoTO.getDescripcion());
		objetivoDO.setNombre(objetivoTO.getNombre());
		objetivoDO.setPorcenPeso(objetivoTO.getPorcenPeso());
		objetivoDO.setVersion(objetivoTO.getVersion());
		

		if(objetivoTO.getProductoList() != null && objetivoTO.getProductoList().size() > 0) {
			ProductoDO productoCargado = null;
			Set<ProductoDO> productoDOSet = new LinkedHashSet<ProductoDO>();
			for(ProductoTO producto : objetivoTO.getProductoList()) {
				productoCargado = getProductoTransf().transferirTODO(producto);
                 if (productoCargado != null) {
                	 productoCargado.setObjetivo(objetivoDO);
                	 productoDOSet.add(productoCargado);
                 } else {
                     log.warning("esta tratando de cargar un producto inexistente con id: " + producto.getId());
                 }
			}
			if (productoDOSet.size() > 0) {
				objetivoDO.setProductoSet(productoDOSet);
			}
		}
		
		
		if(objetivoTO.getVersionObjetivosList() != null && objetivoTO.getVersionObjetivosList().size() > 0) {
			VersionObjetivoDO versionObjetivoCargado = null;
			Set<VersionObjetivoDO> versionObjetivoDOSet = new LinkedHashSet<VersionObjetivoDO>();
			for(VersionObjetivoTO versionObjetivo : objetivoTO.getVersionObjetivosList()) {
				versionObjetivoCargado = getVersionObjetivoTransf().transferirTODO(versionObjetivo);
                 if (versionObjetivoCargado != null) {
                	 versionObjetivoCargado.setObjetivo(objetivoDO);
                	 versionObjetivoDOSet.add(versionObjetivoCargado);
                 } else {
                     log.warning("esta tratando de cargar una version de Objetivo inexistente con id: " + versionObjetivo.getId());
                 }
			}
			if (versionObjetivoDOSet.size() > 0) {
				objetivoDO.setVersionSet(versionObjetivoDOSet);
			}
		}
	
		
		
		if (objetivoTO.getProyecto() != null) {
			objetivoDO.setProyecto(getProyectoDAO().cargar(objetivoTO.getProyecto().getId()));
		}
		
		
		
		return objetivoDO;
	}

	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IObjetivoTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ObjetivoDO)
	 */
	public ObjetivoTO transferirDOTO(ObjetivoDO objetivoDO) {

      ObjetivoTO objetivoTO = new ObjetivoTO();
		
		objetivoTO.setId(objetivoTO.getId());
				
		objetivoTO.setCodigo(objetivoDO.getCodigo());
		objetivoTO.setEstado(EstadoObjetivoEnum.tomarTipoPorValor(objetivoDO.getEstado()));
		objetivoTO.setDescripcion(objetivoDO.getDescripcion());
		objetivoTO.setNombre(objetivoDO.getNombre());
		objetivoTO.setPorcenPeso(objetivoDO.getPorcenPeso());
		objetivoTO.setVersion(objetivoDO.getVersion());
		
		
		
		if (objetivoDO.getProductoSet() != null && objetivoDO.getProductoSet().size() > 0) {
	    	List<ProductoTO> productoTOLista = new ArrayList<ProductoTO>(objetivoDO.getProductoSet().size());
	    	ProductoTO productoProv = null;
	    	for (ProductoDO producto : objetivoDO.getProductoSet() ){
	    		productoProv = getProductoTransf().transferirDOTO(producto);
	    		productoTOLista.add(productoProv);
	    	}
	    	if (productoTOLista.size() > 0){
	    		objetivoTO.setProductoList(productoTOLista);
	    	}
	    }
		
		
		if (objetivoDO.getVersionSet() != null && objetivoDO.getVersionSet().size() > 0) {
	    	List<VersionObjetivoTO> versionObjetivoTOLista = new ArrayList<VersionObjetivoTO>(objetivoDO.getVersionSet().size());
	    	VersionObjetivoTO versionObjetivoProv = null;
	    	for( VersionObjetivoDO versionObjetivo : objetivoDO.getVersionSet() ){
	    		versionObjetivoProv = getVersionObjetivoTransf().transferirDOTO(versionObjetivo);
	    		versionObjetivoTOLista.add(versionObjetivoProv);
	    	}
	    	if (versionObjetivoTOLista.size() > 0){
	    		objetivoTO.setVersionObjetivosList(versionObjetivoTOLista);
	    	}
	    }
		
		
		
		
		return objetivoTO;
	}

}
