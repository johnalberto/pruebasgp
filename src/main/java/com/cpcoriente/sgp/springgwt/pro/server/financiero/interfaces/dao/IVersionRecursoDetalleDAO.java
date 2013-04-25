package com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao;

import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.VersionRecursoDetalleDO;

public interface IVersionRecursoDetalleDAO {
	
	public abstract VersionRecursoDetalleDO cargar(Long idRecurso);
	public abstract VersionRecursoDetalleDO persistir(VersionRecursoDetalleDO recurso) ;
	public abstract VersionRecursoDetalleDO modificar(VersionRecursoDetalleDO recurso) ;
	public abstract boolean eliminar(Long idRecurso);

}
