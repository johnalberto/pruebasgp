/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.CargoPorPersonalDO;

/**
 * @author CPC-04
 *
 */
public interface ICargoPorPersonalDAO {

	
	public abstract CargoPorPersonalDO cargar(Long idCargoPorPersonal);
	public abstract CargoPorPersonalDO persistir(CargoPorPersonalDO cargoPorPersonalList);
	public abstract CargoPorPersonalDO modificar(CargoPorPersonalDO cargoPorPersonal);
	public abstract boolean eliminar(Long idCargoPorPersonalLista) ;
	public abstract List<CargoPorPersonalDO> listarPorProyectoEntidad(Long idProyectoEntidad);
	
}
