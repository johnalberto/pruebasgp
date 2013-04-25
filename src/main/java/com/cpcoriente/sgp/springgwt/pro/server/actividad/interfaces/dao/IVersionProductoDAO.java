/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao;

import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionProductoDO;

/**
 * @author CPC-04
 *
 */
public interface IVersionProductoDAO {
	
	public abstract VersionProductoDO cargar(Long idVersionProducto);
	public abstract VersionProductoDO persistir(VersionProductoDO versionProducto) ;
	public abstract List<VersionProductoDO> seleccionPorFecha(Long idProducto, Date fechaInicio, Date fechaFin);
	

}
