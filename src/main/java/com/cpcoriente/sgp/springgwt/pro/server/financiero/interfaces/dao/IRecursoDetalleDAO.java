package com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao;

import java.util.Set;

import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RecursoDetalleDO;

public interface IRecursoDetalleDAO {
	
	public abstract RecursoDetalleDO cargar(Long idRecurso);
	public abstract RecursoDetalleDO persistir(RecursoDetalleDO recurso) ;
	public abstract RecursoDetalleDO modificar(RecursoDetalleDO recurso) ;
	public abstract boolean eliminar(Long idRecurso);
	public abstract boolean persistirList(Set<RecursoDetalleDO> recDetList);


}
