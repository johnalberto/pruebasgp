/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.actividad.todo.transfer;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ActividadDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ProductoDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionProductoDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IObjetivoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador.EstadoProductoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IActividadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IProductoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IVersionProductoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ActividadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ProductoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.VersionProductoTO;



/**
 * @author CPC-04
 *
 */
public class ProductoTransf implements IProductoTransf {
	
	
private static final Logger log = Logger.getLogger(ProductoTransf.class.getName());
	

	
	private IActividadTransf getActividadTransf() {
		return TransfFactory.getInstance().getActividadTransf();
	}
	
	private IVersionProductoTransf getVersionProductoTransf() {
		return TransfFactory.getInstance().getVersionProductoTransf();
	}
	
	
	private IObjetivoDAO getObjetivoDAO() {
		return  DAOFactory.getInstance().getObjetivoDao();
	}
	
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IProductoTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ProductoTO)
	 */
	public ProductoDO transferirTODO(ProductoTO productoTO) {
		
		ProductoDO productoDO = new ProductoDO();
		
		if (productoTO.getId() != null) {
			productoDO.setId(productoTO.getId());
		}
		
		productoDO.setCodigo(productoTO.getCodigo());
		productoDO.setEstado(productoTO.getEstado().getValor());
		productoDO.setFechaInicio(productoTO.getFechaInicio());
		productoDO.setFechaFin(productoTO.getFechaFin());
		productoDO.setNombre(productoTO.getNombre());
		productoDO.setPorcenPeso(productoTO.getPorcenPeso());
		productoDO.setVersion(productoTO.getVersion());
		
	
		

		if(productoTO.getActividadList() != null && productoTO.getActividadList().size() > 0) {
			ActividadDO actividadCargado = null;
			Set<ActividadDO> actividadDOSet = new LinkedHashSet<ActividadDO>();
			for(ActividadTO actividad : productoTO.getActividadList()) {
				actividadCargado = getActividadTransf().transferirTODO(actividad);
                 if (actividadCargado != null) {
                	 actividadCargado.setProducto(productoDO);
                	 actividadDOSet.add(actividadCargado);
                 } else {
                     log.warning("esta tratando de cargar un actividad inexistente con id: " + actividad.getId());
                 }
			}
			if (actividadDOSet.size() > 0) {
				productoDO.setActividadSet(actividadDOSet);
			}
		}
		
		
		if(productoTO.getVersionProductoList() != null && productoTO.getVersionProductoList().size() > 0) {
			VersionProductoDO versionProductoCargado = null;
			Set<VersionProductoDO> versionProductoDOSet = new LinkedHashSet<VersionProductoDO>();
			for(VersionProductoTO versionProducto : productoTO.getVersionProductoList()) {
				versionProductoCargado = getVersionProductoTransf().transferirTODO(versionProducto);
                 if (versionProductoCargado != null) {
                	 versionProductoCargado.setProducto(productoDO);
                	 versionProductoDOSet.add(versionProductoCargado);
                 } else {
                     log.warning("esta tratando de cargar una version de Producto inexistente con id: " + versionProducto.getId());
                 }
			}
			if (versionProductoDOSet.size() > 0) {
				productoDO.setVersionSet(versionProductoDOSet);
			}
		}
		
		
		if (productoTO.getObjetivo() != null) {
			productoDO.setObjetivo(getObjetivoDAO().cargar(productoTO.getObjetivo().getId()));
		}
		
		
		
		return productoDO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IProductoTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ProductoDO)
	 */
	public ProductoTO transferirDOTO(ProductoDO productoDO) {

      ProductoTO productoTO = new ProductoTO();
		
		productoTO.setId(productoTO.getId());
				
		productoTO.setCodigo(productoDO.getCodigo());
		productoTO.setEstado(EstadoProductoEnum.tomarTipoPorValor(productoDO.getEstado()));
		productoTO.setFechaInicio(productoDO.getFechaInicio());
		productoTO.setFechaFin(productoDO.getFechaFin());
		productoTO.setNombre(productoDO.getNombre());
		productoTO.setPorcenPeso(productoDO.getPorcenPeso());
		productoTO.setVersion(productoDO.getVersion());
		
		
		
		if (productoDO.getActividadSet() != null && productoDO.getActividadSet().size() > 0) {
	    	List<ActividadTO> actividadTOLista = new ArrayList<ActividadTO>(productoDO.getActividadSet().size());
	    	ActividadTO actividadProv = null;
	    	for( ActividadDO actividad : productoDO.getActividadSet() ){
	    		actividadProv = getActividadTransf().transferirDOTO(actividad);
	    		actividadTOLista.add(actividadProv);
	    	}
	    	if (actividadTOLista.size() > 0){
	    		productoTO.setActividadList(actividadTOLista);
	    	}
	    }
		
		
		if (productoDO.getVersionSet() != null && productoDO.getVersionSet().size() > 0) {
	    	List<VersionProductoTO> versionProductoTOLista = new ArrayList<VersionProductoTO>(productoDO.getVersionSet().size());
	    	VersionProductoTO versionProductoProv = null;
	    	for( VersionProductoDO versionProducto : productoDO.getVersionSet() ){
	    		versionProductoProv = getVersionProductoTransf().transferirDOTO(versionProducto);
	    		versionProductoTOLista.add(versionProductoProv);
	    	}
	    	if (versionProductoTOLista.size() > 0){
	    		productoTO.setVersionProductoList(versionProductoTOLista);
	    	}
	    }
		
		
		
		return productoTO;
	}


}
