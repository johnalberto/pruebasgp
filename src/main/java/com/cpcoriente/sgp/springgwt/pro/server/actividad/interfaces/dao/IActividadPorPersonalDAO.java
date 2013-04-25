/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ActividadPorPersonalDO;

/**
 * @author CPC-04
 *
 */
public interface IActividadPorPersonalDAO {
	
	
	public abstract ActividadPorPersonalDO cargar(Long idActividadPorPersonal);
	public abstract ActividadPorPersonalDO persistir(ActividadPorPersonalDO actividadPorPersonal) ;
	public abstract ActividadPorPersonalDO modificar(ActividadPorPersonalDO actividadPorPersonal) ;
	public abstract boolean eliminar(Long idActividadPorPersonal);
	public abstract List<ActividadPorPersonalDO> listarTodoPorProducto(Long idProducto);
	public abstract List<ActividadPorPersonalDO> seleccionPorPersona(Long idProyecto, String parteNombreCedula);
	

}
