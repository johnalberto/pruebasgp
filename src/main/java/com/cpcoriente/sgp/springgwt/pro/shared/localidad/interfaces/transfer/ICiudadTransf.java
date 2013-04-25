/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.CiudadDO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO;

/**
 * @author CPC-04
 *
 */
public interface ICiudadTransf {
	public abstract CiudadDO transferirTODO(CiudadTO ciudadTO);
	public abstract CiudadTO transferirDOTO(CiudadDO ciudadDO);

}
