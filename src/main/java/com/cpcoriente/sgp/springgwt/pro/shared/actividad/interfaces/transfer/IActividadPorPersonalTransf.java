/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ActividadPorPersonalDO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ActividadPorPersonalTO;

/**
 * @author CPC-04
 *
 */
public interface IActividadPorPersonalTransf {
	
	public abstract ActividadPorPersonalDO transferirTODO(ActividadPorPersonalTO actividadPorPersonalTO);
	public abstract ActividadPorPersonalTO transferirDOTO(ActividadPorPersonalDO actividadPorPersonalDO);

}
