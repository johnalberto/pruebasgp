package com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioPorTipoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO;

public interface IUsuarioPorTipoTransf {
	
	public abstract UsuarioPorTipoDO transferirTODO(UsuarioPorTipoTO usuarioTO);
	public abstract UsuarioPorTipoTO transferirDOTO(UsuarioPorTipoDO usuarioDO);


}
