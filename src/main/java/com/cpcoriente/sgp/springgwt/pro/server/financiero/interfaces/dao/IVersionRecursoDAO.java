package com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao;

import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.VersionRecursoDO;

public interface IVersionRecursoDAO {
	
	public abstract VersionRecursoDO cargar(Long idVersion);
	public abstract VersionRecursoDO persistir(VersionRecursoDO version) ;
	public abstract VersionRecursoDO modificar(VersionRecursoDO version) ;
	public abstract boolean eliminar(Long idVersion);

}
