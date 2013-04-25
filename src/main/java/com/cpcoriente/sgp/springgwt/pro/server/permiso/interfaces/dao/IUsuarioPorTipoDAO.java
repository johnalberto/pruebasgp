package com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao;

import java.util.Set;

import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioPorTipoDO;

public interface IUsuarioPorTipoDAO {

	
	public abstract UsuarioPorTipoDO cargar(Long idUsuarioPorTipo);
	public abstract UsuarioPorTipoDO persistir(UsuarioPorTipoDO usuarioPorTipo) ;
	public abstract UsuarioPorTipoDO modificar(UsuarioPorTipoDO usuarioPorTipo) ;
	public abstract boolean eliminar(Long idUsuarioPorTipo);
	public boolean persistirList(Set<UsuarioPorTipoDO> usuarioPorTipoList);

}
