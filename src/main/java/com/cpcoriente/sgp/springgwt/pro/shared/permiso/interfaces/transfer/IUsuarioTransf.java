/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioDO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO;



/**
 * @author CPC-04
 *
 */
public interface IUsuarioTransf {
	
	public abstract UsuarioDO transferirTODO(UsuarioTO usuarioTO);
	public abstract UsuarioTO transferirDOTO(UsuarioDO usuarioDO);

}
