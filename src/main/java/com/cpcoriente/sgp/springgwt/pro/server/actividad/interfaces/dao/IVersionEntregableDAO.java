/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao;

import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionEntregableDO;

/**
 * @author CPC-04
 *
 */
public interface IVersionEntregableDAO {
	
	public abstract VersionEntregableDO cargar(Long idVersionEntregable);
	public abstract VersionEntregableDO persistir(VersionEntregableDO versionEntregable) ;
	public abstract List<VersionEntregableDO> seleccionPorFecha(Long idEntregable, Date fechaInicio, Date fechaFin);

}
