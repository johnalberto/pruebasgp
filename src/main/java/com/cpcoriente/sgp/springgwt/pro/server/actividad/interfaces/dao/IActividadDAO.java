/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao;

import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ActividadDO;

/**
 * @author CPC-04
 *
 */
public interface IActividadDAO {
	
	public abstract ActividadDO cargar(Long idActividad);
	public abstract ActividadDO persistir(ActividadDO actividad) ;
	public abstract ActividadDO modificar(ActividadDO actividad) ;
	public abstract boolean eliminar(Long idActividad);
	public abstract List<ActividadDO> listarTodo(Long idProducto);
	public abstract List<ActividadDO> seleccionPorNombreCodigo(Long idProducto, String parteNombreCodigo);
	public abstract List<ActividadDO> seleccionPorProductoPorEstado(Long idProducto,int estado);
	
	public abstract List<ActividadDO> seleccionPorNombreCodigoPadre(Long idPadre, String parteNombreCodigo);
	public abstract List<ActividadDO> seleccionPorPadre(Long idPadre);
	public abstract List<ActividadDO> seleccionPadres(Long idProducto);
	public abstract List<ActividadDO> seleccionPadresPorNomCod(Long idProducto, String parteNombreCodigo);
	public abstract List<ActividadDO> seleccionPorRangofechas(Long idProducto, Date fechaInicio, Date fechaFin);
	public abstract List<ActividadDO> seleccionPorFechaInicial(Long idProducto, Date fechaInicio);
	public abstract List<ActividadDO> seleccionPorFechaFinal(Long idProducto, Date fechaFin);
	

}
