/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.parametro.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.parametro.entity.ParametroPorProyectoDO;

/**
 * @author CPC-04
 *
 */
public interface IParametroPorProyectoDAO {
	
	public abstract ParametroPorProyectoDO cargar(String idParametro);
	public abstract ParametroPorProyectoDO modificar(ParametroPorProyectoDO parametro) ;
	public abstract boolean eliminar(String idParametro);
	public abstract List<ParametroPorProyectoDO> listarTodo();
	public abstract List<ParametroPorProyectoDO> buscarPorDescripcion(String descripcion);

}
