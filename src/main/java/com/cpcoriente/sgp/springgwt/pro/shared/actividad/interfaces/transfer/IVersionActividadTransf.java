/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionActividadDO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.VersionActividadTO;

/**
 * @author CPC-04
 *
 */
public interface IVersionActividadTransf {

	public abstract VersionActividadDO transferirTODO(VersionActividadTO versionActividadTO);
	public abstract VersionActividadTO transferirDOTO(VersionActividadDO versionActividadDO);
	
}
