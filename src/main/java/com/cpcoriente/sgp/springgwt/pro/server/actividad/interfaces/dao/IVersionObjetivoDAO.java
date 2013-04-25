/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao;

import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionObjetivoDO;

/**
 * @author CPC-04
 *
 */
public interface IVersionObjetivoDAO {
	
	
	public abstract VersionObjetivoDO cargar(Long idVersionObjetivo);
	public abstract VersionObjetivoDO persistir(VersionObjetivoDO versionObjetivo) ;
	public abstract List<VersionObjetivoDO> seleccionPorFecha(Long idObjetivo, Date fechaInicio, Date fechaFin);

}
