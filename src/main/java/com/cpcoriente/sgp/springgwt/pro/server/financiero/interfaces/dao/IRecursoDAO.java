package com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RecursoDO;

public interface IRecursoDAO {
	
	public abstract RecursoDO cargar(Long idRecurso);
	public abstract RecursoDO persistir(RecursoDO recurso) ;
	public abstract RecursoDO modificar(RecursoDO recurso) ;
	public abstract boolean eliminar(Long idRecurso);
	public abstract List<RecursoDO> ListarPorProyecto(Long idProyecto);
	public abstract List<RecursoDO> ListarPorActividad(Long idActividad);
	public abstract List<RecursoDO> ListarPorRubro(Long idRubro);
	public abstract List<RecursoDO> ListarPorProyectoDescripcion(Long idProyecto,String descripcion);
	public abstract List<RecursoDO> seleccionGeneral(Long  idRubro, Long  idActividad,
			String descripcion, Long idProyecto);
}
