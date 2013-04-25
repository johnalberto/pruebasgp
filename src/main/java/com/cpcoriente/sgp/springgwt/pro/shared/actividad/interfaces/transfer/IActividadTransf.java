package com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ActividadDO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ActividadTO;

public interface IActividadTransf {
	
	public abstract ActividadDO transferirTODO(ActividadTO actividadTO);
	public abstract ActividadTO transferirDOTO(ActividadDO actividadDO);

}
