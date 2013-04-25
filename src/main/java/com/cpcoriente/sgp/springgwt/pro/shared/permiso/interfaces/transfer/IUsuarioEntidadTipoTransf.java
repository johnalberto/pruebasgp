package com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioEntidadTipoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioEntidadTipoTO;

public interface IUsuarioEntidadTipoTransf {
	
	public abstract UsuarioEntidadTipoDO transferirTODO(UsuarioEntidadTipoTO usuarioTO);
	public abstract UsuarioEntidadTipoTO transferirDOTO(UsuarioEntidadTipoDO usuarioDO);

}
