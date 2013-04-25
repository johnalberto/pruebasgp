/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.CargoDO;



/**
 * @author CPC-04
 *
 */
public interface ICargoDAO {
	
	
	public abstract CargoDO cargar(Long idCargo);
	public abstract CargoDO persistir(CargoDO cargoList);
	public abstract CargoDO modificar(CargoDO cargo);
	public abstract boolean eliminar(Long idCargoLista) ;
	public abstract List<CargoDO> listarPorProyectoEntidad(Long idProyectoEntidad);

}
