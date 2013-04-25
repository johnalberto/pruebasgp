/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionProductoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.VersionProductoTO;

/**
 * @author CPC-04
 *
 */
public interface IVersionProductoTransf {

	public abstract VersionProductoDO transferirTODO(VersionProductoTO versionProductoTO);
	public abstract VersionProductoTO transferirDOTO(VersionProductoDO versionProductoDO);
	
}
