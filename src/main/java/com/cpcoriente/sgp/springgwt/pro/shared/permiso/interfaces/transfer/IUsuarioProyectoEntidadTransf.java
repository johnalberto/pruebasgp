package com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioProyectoEntidadDO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioProyectoEntidadTO;

public interface IUsuarioProyectoEntidadTransf {
	
	public abstract UsuarioProyectoEntidadDO transferirTODO(UsuarioProyectoEntidadTO usuarioProEntTO);
	public abstract UsuarioProyectoEntidadTO transferirDOTO(UsuarioProyectoEntidadDO usuarioProEntDO);

}
