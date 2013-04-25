package com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao;

import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.PermisoDO;

public interface IPermisoDAO {
	
	public abstract PermisoDO cargar(Long idPermiso);
	public abstract PermisoDO persistir(PermisoDO permiso) ;
	public abstract PermisoDO modificar(PermisoDO permiso) ;
	public abstract boolean eliminar(Long idPermiso);

}
