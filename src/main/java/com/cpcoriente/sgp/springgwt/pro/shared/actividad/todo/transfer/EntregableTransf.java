/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.actividad.todo.transfer;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.EntregableDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionEntregableDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IActividadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador.EstadoEntregableEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador.TipoEntregableEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador.TipoResultadoEntregaEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IEntregableTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IVersionEntregableTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.EntregableTO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.VersionEntregableTO;



/**
 * @author CPC-04
 *
 */
public class EntregableTransf implements IEntregableTransf {
	
private static final Logger log = Logger.getLogger(EntregableTransf.class.getName());
	
	
	private IVersionEntregableTransf getVersionEntregableTransf() {
		return TransfFactory.getInstance().getVersionEntregableTransf();
	}
	
	
	private IActividadDAO getActividadDAO() {
		return DAOFactory.getInstance().getActividadDao();
	}
	
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IEntregableTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.EntregableTO)
	 */
	public EntregableDO transferirTODO(EntregableTO entregableTO) {
		
		EntregableDO entregableDO = new EntregableDO();
		
		if (entregableTO.getId() != null) {
			entregableDO.setId(entregableTO.getId());
		}
		
		entregableDO.setCodigo(entregableTO.getCodigo());
		entregableDO.setEstado(entregableTO.getEstado().getValor());
		entregableDO.setFechaEntrega(entregableTO.getFechaEntrega());
		entregableDO.setResultadoDe(entregableTO.getResultadoDe().getValor());
		entregableDO.setNombre(entregableTO.getNombre());
		entregableDO.setTipo(entregableTO.getTipoEntregable().getValor());
		entregableDO.setVersion(entregableTO.getVersion());
		
		
		
		
		if(entregableTO.getVersionEntregableLista() != null && entregableTO.getVersionEntregableLista().size() > 0) {
			VersionEntregableDO versionEntregableCargado = null;
			Set<VersionEntregableDO> versionEntregableDOSet = new LinkedHashSet<VersionEntregableDO>();
			for(VersionEntregableTO versionEntregable : entregableTO.getVersionEntregableLista()) {
				versionEntregableCargado = getVersionEntregableTransf().transferirTODO(versionEntregable);
                 if (versionEntregableCargado != null) {
                	 versionEntregableCargado.setEntregable(entregableDO);
                	 versionEntregableDOSet.add(versionEntregableCargado);
                 } else {
                     log.warning("esta tratando de cargar una version de Entregable inexistente con id: " + versionEntregable.getId());
                 }
			}
			if (versionEntregableDOSet.size() > 0) {
				entregableDO.setVersionEntregableSet(versionEntregableDOSet);
			}
		}
		
		
		if (entregableTO.getActividad() != null) {
			entregableDO.setActividad(getActividadDAO().cargar(entregableTO.getActividad().getId()));
		}
		
		
		
		return entregableDO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IEntregableTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.EntregableDO)
	 */
	public EntregableTO transferirDOTO(EntregableDO entregableDO) {

      EntregableTO entregableTO = new EntregableTO();
		
		entregableTO.setId(entregableDO.getId());
				
		entregableTO.setCodigo(entregableDO.getCodigo());
		entregableTO.setEstado(EstadoEntregableEnum.tomarTipoPorValor(entregableDO.getEstado()));
		entregableTO.setFechaEntrega(entregableDO.getFechaEntrega());
		entregableTO.setResultadoDe(TipoResultadoEntregaEnum.tomarTipoPorValor(entregableDO.getResultadoDe()));
		entregableTO.setNombre(entregableDO.getNombre());
		entregableTO.setTipoEntregable(TipoEntregableEnum.tomarTipoPorValor(entregableDO.getTipo()));
		entregableTO.setVersion(entregableDO.getVersion());
		
	
		
		if (entregableDO.getVersionEntregableSet() != null && entregableDO.getVersionEntregableSet().size() > 0) {
	    	List<VersionEntregableTO> versionEntregableTOLista = new ArrayList<VersionEntregableTO>(entregableDO.getVersionEntregableSet().size());
	    	VersionEntregableTO versionEntregableProv = null;
	    	for( VersionEntregableDO versionEntregable : entregableDO.getVersionEntregableSet() ){
	    		versionEntregableProv = getVersionEntregableTransf().transferirDOTO(versionEntregable);
	    		versionEntregableTOLista.add(versionEntregableProv);
	    	}
	    	if (versionEntregableTOLista.size() > 0){
	    		entregableTO.setVersionEntregableLista(versionEntregableTOLista);
	    	}
	    }
		
		
		
		
		return entregableTO;
	}

}
