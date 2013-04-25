package com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao;

import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioEntidadTipoDO;

public interface IUsuarioEntidadTipoDAO {
	
	public abstract UsuarioEntidadTipoDO cargar(Long idUsuario);
	public abstract UsuarioEntidadTipoDO persistir(UsuarioEntidadTipoDO usuario) ;
	public abstract UsuarioEntidadTipoDO modificar(UsuarioEntidadTipoDO usuario) ;
	public abstract boolean eliminar(Long idUsuario);

}
