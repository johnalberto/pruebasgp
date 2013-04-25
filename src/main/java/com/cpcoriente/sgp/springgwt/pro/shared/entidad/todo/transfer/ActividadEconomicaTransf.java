package com.cpcoriente.sgp.springgwt.pro.shared.entidad.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.ActividadEconomicaDO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IActividadEconomicaTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.ActividadEconomicaTO;

public class ActividadEconomicaTransf implements IActividadEconomicaTransf {

	public ActividadEconomicaDO transferirTODO(ActividadEconomicaTO actividadTO) {
		
		ActividadEconomicaDO actividadDO = new ActividadEconomicaDO();
		
		if (actividadTO.getId() !=null) {
			
			actividadDO.setId(actividadTO.getId());
		}
		
		actividadDO.setCodigo(actividadTO.getCodigo());
		
		actividadDO.setNombre(actividadTO.getNombre());
		
		return actividadDO;
	}

	public ActividadEconomicaTO transferirDOTO(ActividadEconomicaDO actividadDO) {
		
		ActividadEconomicaTO actividadTO = new ActividadEconomicaTO();
		
		actividadTO.setId(actividadDO.getId());
		
		actividadTO.setCodigo(actividadDO.getCodigo());
		
		
		actividadTO.setNombre(actividadDO.getNombre());
		
		return actividadTO;
	}

}
