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
import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.EntregableDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionActividadDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IActividadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IProductoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador.EstadoProductoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IActividadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IEntregableTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IVersionActividadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ActividadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.EntregableTO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.VersionActividadTO;

/**
 * @author CPC-04
 *
 */
public class ActividadTransf implements IActividadTransf{

	
	private static final Logger log = Logger.getLogger(ActividadTransf.class.getName());
	
	private IActividadTransf getActividadTransf() {
		return TransfFactory.getInstance().getActividadTransf();
	}
	
	private IActividadDAO getActividadDAO() {
		return DAOFactory.getInstance().getActividadDao();
	}
	
	private IEntregableTransf getEntregableTransf() {
		return TransfFactory.getInstance().getEntregableTransf();
	}
	
	private IVersionActividadTransf getVersionActividadTransf() {
		return TransfFactory.getInstance().getVersionActividadTransf();
	}
	
	
	private IProductoDAO getProductoDAO() {
		return DAOFactory.getInstance().getProductoDao();
	}
	
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IActividadTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ActividadTO)
	 */
	public ActividadDO transferirTODO(ActividadTO actividadTO) {
		
		ActividadDO actividadDO = new ActividadDO();
		
		if (actividadTO.getId() != null) {
			actividadDO.setId(actividadTO.getId());
		}
		
		actividadDO.setCodigo(actividadTO.getCodigo());
		actividadDO.setEstado(actividadTO.getEstado().getValor());
		actividadDO.setFechaInicio(actividadTO.getFechaInicio());
		actividadDO.setFechaFinal(actividadTO.getFechaFinal());
		actividadDO.setNombre(actividadTO.getNombre());
		actividadDO.setPorcenPeso(actividadTO.getPorcenPeso());
		actividadDO.setVersion(actividadTO.getVersion());
		
		
		if (actividadTO.getPadre() != null) {
			actividadDO.setPadre(getActividadDAO().cargar(actividadTO.getPadre().getId()));
		}
		

		if(actividadTO.getEntregableLista() != null && actividadTO.getEntregableLista().size() > 0) {
			EntregableDO entregableCargado = null;
			Set<EntregableDO> entregableDOSet = new LinkedHashSet<EntregableDO>();
			for(EntregableTO entregable : actividadTO.getEntregableLista()) {
				entregableCargado = getEntregableTransf().transferirTODO(entregable);
                 if (entregableCargado != null) {
                	 entregableCargado.setActividad(actividadDO);
                	 entregableDOSet.add(entregableCargado);
                 } else {
                     log.warning("esta tratando de cargar un entregable inexistente con id: " + entregable.getId());
                 }
			}
			if (entregableDOSet.size() > 0) {
				actividadDO.setEntregableSet(entregableDOSet);
			}
		}
		
		
		if(actividadTO.getVersionLista() != null && actividadTO.getVersionLista().size() > 0) {
			VersionActividadDO versionActividadCargado = null;
			Set<VersionActividadDO> versionActividadDOSet = new LinkedHashSet<VersionActividadDO>();
			for(VersionActividadTO versionActividad : actividadTO.getVersionLista()) {
				versionActividadCargado = getVersionActividadTransf().transferirTODO(versionActividad);
                 if (versionActividadCargado != null) {
                	 versionActividadCargado.setActividad(actividadDO);
                	 versionActividadDOSet.add(versionActividadCargado);
                 } else {
                     log.warning("esta tratando de cargar una version de Actividad inexistente con id: " + versionActividad.getId());
                 }
			}
			if (versionActividadDOSet.size() > 0) {
				actividadDO.setVersionSet(versionActividadDOSet);
			}
		}
		
		
		if (actividadTO.getProducto() != null) {
			actividadDO.setProducto(getProductoDAO().cargar(actividadTO.getProducto().getId()));
		}
		
		
		
		return actividadDO;
	}

	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IActividadTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ActividadDO)
	 */
	public ActividadTO transferirDOTO(ActividadDO actividadDO) {

      ActividadTO actividadTO = new ActividadTO();
		
		actividadTO.setId(actividadTO.getId());
				
		actividadTO.setCodigo(actividadDO.getCodigo());
		actividadTO.setEstado(EstadoProductoEnum.tomarTipoPorValor(actividadDO.getEstado()));
		actividadTO.setFechaInicio(actividadDO.getFechaInicio());
		actividadTO.setFechaFinal(actividadDO.getFechaFinal());
		actividadTO.setNombre(actividadDO.getNombre());
		actividadTO.setPorcenPeso(actividadDO.getPorcenPeso());
		actividadTO.setVersion(actividadDO.getVersion());
		
		if (actividadDO.getPadre() != null) {
			actividadTO.setPadre(getActividadTransf().transferirDOTO(actividadDO.getPadre()));
		}
		
		if (actividadDO.getEntregableSet() != null && actividadDO.getEntregableSet().size() > 0) {
	    	List<EntregableTO> entregableTOLista = new ArrayList<EntregableTO>(actividadDO.getEntregableSet().size());
	    	EntregableTO entregableProv = null;
	    	for( EntregableDO entregable : actividadDO.getEntregableSet() ){
	    		entregableProv = getEntregableTransf().transferirDOTO(entregable);
	    		entregableTOLista.add(entregableProv);
	    	}
	    	if (entregableTOLista.size() > 0){
	    		actividadTO.setEntregableLista(entregableTOLista);
	    	}
	    }
		
		
		if (actividadDO.getVersionSet() != null && actividadDO.getVersionSet().size() > 0) {
	    	List<VersionActividadTO> versionActividadTOLista = new ArrayList<VersionActividadTO>(actividadDO.getVersionSet().size());
	    	VersionActividadTO versionActividadProv = null;
	    	for( VersionActividadDO versionActividad : actividadDO.getVersionSet() ){
	    		versionActividadProv = getVersionActividadTransf().transferirDOTO(versionActividad);
	    		versionActividadTOLista.add(versionActividadProv);
	    	}
	    	if (versionActividadTOLista.size() > 0){
	    		actividadTO.setVersionLista(versionActividadTOLista);
	    	}
	    }
		
		
		
		
		return actividadTO;
	}

}
