/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.LogUsuarioDO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.LogUsuarioTO;

/**
 * @author CPC-04
 *
 */
public interface ILogUsuarioTransf {

	public abstract LogUsuarioDO transferirTODO(LogUsuarioTO logUsuarioTO);
	public abstract LogUsuarioTO transferirDOTO(LogUsuarioDO logUsuarioDO);
	
}
