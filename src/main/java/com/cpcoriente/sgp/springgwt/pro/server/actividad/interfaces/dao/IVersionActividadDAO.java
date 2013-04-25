/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao;

import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionActividadDO;

/**
 * @author CPC-04
 *
 */
public interface IVersionActividadDAO {
	
	
	public abstract VersionActividadDO cargar(Long idVersionActividad);
	public abstract VersionActividadDO persistir(VersionActividadDO versionActividad) ;
	public abstract List<VersionActividadDO> seleccionPorFecha(Long idActividad, Date fechaInicio, Date fechaFin);

}
