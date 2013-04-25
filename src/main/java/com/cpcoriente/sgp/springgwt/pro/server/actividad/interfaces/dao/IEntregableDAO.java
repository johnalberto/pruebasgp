/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao;

import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.EntregableDO;

/**
 * @author CPC-04
 *
 */
public interface IEntregableDAO {
	
	
	public abstract EntregableDO cargar(Long idEntregable);
	public abstract EntregableDO persistir(EntregableDO entregable) ;
	public abstract EntregableDO modificar(EntregableDO entregable) ;
	public abstract boolean eliminar(Long idEntregable);
	public abstract List<EntregableDO> listarTodo(Long idActividad);
	public abstract List<EntregableDO> seleccionPorNombreCodigo(Long idActividad, String parteNombreCodigo);
	public abstract List<EntregableDO> seleccionPorActividadPorEstado(Long idActividad,int estado);
	public abstract List<EntregableDO> seleccionPorRangofechas(Long idActividad, Date fechaInicio, Date fechaFin);

	

}
