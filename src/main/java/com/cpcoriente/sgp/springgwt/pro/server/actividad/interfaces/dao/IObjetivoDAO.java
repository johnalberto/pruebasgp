/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ObjetivoDO;


/**
 * @author CPC-04
 *
 */
public interface IObjetivoDAO {
	
	public abstract ObjetivoDO cargar(Long idObjetivo);
	public abstract ObjetivoDO persistir(ObjetivoDO objetivo) ;
	public abstract ObjetivoDO modificar(ObjetivoDO objetivo) ;
	public abstract boolean eliminar(Long idObjetivo);
	public abstract List<ObjetivoDO> listarTodo(Long idProyecto);
	public abstract List<ObjetivoDO> seleccionPorNombreCodigo(Long idProyecto, String parteNombreCodigo);
	public abstract List<ObjetivoDO> seleccionPorProyectoPorEstado(Long idProyecto,int estado);

}
