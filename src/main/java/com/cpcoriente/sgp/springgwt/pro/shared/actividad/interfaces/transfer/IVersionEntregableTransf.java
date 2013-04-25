/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionEntregableDO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.VersionEntregableTO;

/**
 * @author CPC-04
 *
 */
public interface IVersionEntregableTransf {

	public abstract VersionEntregableDO transferirTODO(VersionEntregableTO versionEntregableTO);
	public abstract VersionEntregableTO transferirDOTO(VersionEntregableDO versionEntregableDO);
	
	
}
