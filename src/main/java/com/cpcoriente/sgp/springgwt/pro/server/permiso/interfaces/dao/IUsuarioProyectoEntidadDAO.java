package com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao;

import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioProyectoEntidadDO;

public interface IUsuarioProyectoEntidadDAO {
	
	public abstract UsuarioProyectoEntidadDO cargar(Long idusuProEnt);
	public abstract UsuarioProyectoEntidadDO persistir(UsuarioProyectoEntidadDO usuProEnt) ;
	public abstract UsuarioProyectoEntidadDO modificar(UsuarioProyectoEntidadDO usuProEnt) ;
	public abstract boolean eliminar(Long idusuProEnt);

}
