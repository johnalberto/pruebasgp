package com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.ActividadEconomicaDO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.ActividadEconomicaTO;

public interface IActividadEconomicaTransf {

	public abstract ActividadEconomicaDO transferirTODO(ActividadEconomicaTO actividadTO);
	public abstract ActividadEconomicaTO transferirDOTO(ActividadEconomicaDO actividadDO);
}
