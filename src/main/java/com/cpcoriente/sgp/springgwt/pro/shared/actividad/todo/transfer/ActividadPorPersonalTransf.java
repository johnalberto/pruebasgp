/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.actividad.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ActividadPorPersonalDO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao.IPersonalDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IActividadPorPersonalTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IActividadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ActividadPorPersonalTO;

/**
 * @author CPC-04
 *
 */
public class ActividadPorPersonalTransf implements IActividadPorPersonalTransf {

	
	private IActividadTransf getActividadTransf() {
		return TransfFactory.getInstance().getActividadTransf();
	}	
	
	private IPersonalDAO getPersonalDAO() {
		return DAOFactory.getInstance().getPersonalDao();
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IActividadPorPersonalTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ActividadPorPersonalTO)
	 */
	public ActividadPorPersonalDO transferirTODO(ActividadPorPersonalTO actividadPorPersonalTO) {
		
		ActividadPorPersonalDO actividadPorPersonalDO = new ActividadPorPersonalDO();
		
		if (actividadPorPersonalTO.getId() != null) {
			actividadPorPersonalDO.setId(actividadPorPersonalTO.getId());
		}
		
		actividadPorPersonalDO.setPorcenAvance(actividadPorPersonalTO.getPorcenAvance());
		
		if (actividadPorPersonalTO.getActividad() != null) {
			actividadPorPersonalDO.setActividad(getActividadTransf().transferirTODO(actividadPorPersonalTO.getActividad()));
		}

		if (actividadPorPersonalTO.getPersona() != null) {
			actividadPorPersonalDO.setPersona(getPersonalDAO().cargar(actividadPorPersonalTO.getPersona().getId()));
		}
		
		
		return actividadPorPersonalDO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IActividadPorPersonalTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ActividadPorPersonalDO)
	 */
	public ActividadPorPersonalTO transferirDOTO(
			ActividadPorPersonalDO actividadPorPersonalDO) {


		ActividadPorPersonalTO actividadPorPersonalTO = new ActividadPorPersonalTO();
		
		actividadPorPersonalTO.setId(actividadPorPersonalDO.getId());
		actividadPorPersonalTO.setPorcenAvance(actividadPorPersonalDO.getPorcenAvance());
		
		if (actividadPorPersonalDO.getActividad() != null) {
			actividadPorPersonalTO.setActividad(getActividadTransf().transferirDOTO(actividadPorPersonalDO.getActividad()));
		}
		
		
		return actividadPorPersonalTO;
		
	}
	
	
	

}
