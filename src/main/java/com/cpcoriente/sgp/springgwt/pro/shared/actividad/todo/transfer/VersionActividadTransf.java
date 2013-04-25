/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.actividad.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionActividadDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IActividadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador.EstadoProductoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IVersionActividadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.VersionActividadTO;

/**
 * @author CPC-04
 *
 */
public class VersionActividadTransf implements IVersionActividadTransf{

	
	private IActividadDAO getActividadDAO() {
		return DAOFactory.getInstance().getActividadDao();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IVersionActividadTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.VersionActividadTO)
	 */
	public VersionActividadDO transferirTODO(VersionActividadTO versionActividadTO) {
		

		VersionActividadDO versionActividadDO = new VersionActividadDO();
		
		if (versionActividadTO.getId() != null) {
			versionActividadDO.setId(versionActividadTO.getId());
		}
	
		versionActividadDO.setCodigo(versionActividadTO.getCodigo());
		versionActividadDO.setEstado(versionActividadTO.getEstado().getValor());
		versionActividadDO.setFechaInicio(versionActividadTO.getFechaInicio());
		versionActividadDO.setFechaFinal(versionActividadTO.getFechaFinal());
		versionActividadDO.setFechaRegistro(versionActividadTO.getFechaRegistro());
		versionActividadDO.setNombre(versionActividadTO.getNombre());
		versionActividadDO.setObservacion(versionActividadTO.getObservacion());
		versionActividadDO.setPorcenPeso(versionActividadTO.getPorcentajePeso());
		
		if (versionActividadTO.getActividad() != null) {
			versionActividadDO.setActividad(getActividadDAO().cargar(versionActividadTO.getActividad().getId()));
		}
		
		return versionActividadDO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IVersionActividadTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionActividadDO)
	 */
	public VersionActividadTO transferirDOTO(VersionActividadDO versionActividadDO) {
		
		VersionActividadTO versionActividadTO = new VersionActividadTO();
		
    	versionActividadTO.setId(versionActividadDO.getId());
	
		versionActividadTO.setCodigo(versionActividadDO.getCodigo());
		versionActividadTO.setEstado(EstadoProductoEnum.tomarTipoPorValor(versionActividadDO.getEstado()));
		versionActividadTO.setFechaInicio(versionActividadDO.getFechaInicio());
		versionActividadTO.setFechaFinal(versionActividadDO.getFechaFinal());
		versionActividadTO.setFechaRegistro(versionActividadDO.getFechaRegistro());
		versionActividadTO.setNombre(versionActividadDO.getNombre());
		versionActividadTO.setObservacion(versionActividadDO.getObservacion());
		versionActividadTO.setPorcentajePeso(versionActividadDO.getPorcenPeso());
		
		return versionActividadTO;
	}

}
