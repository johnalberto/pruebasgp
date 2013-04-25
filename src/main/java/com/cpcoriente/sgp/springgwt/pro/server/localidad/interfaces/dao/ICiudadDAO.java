/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.CiudadDO;


/**
 * @author CPC-04
 *
 */
public interface ICiudadDAO {
	public abstract CiudadDO cargar(Long idCiudad);
	public abstract CiudadDO persistir(CiudadDO ciudad) ;
	public abstract CiudadDO modificar(CiudadDO ciudad) ;
	public abstract boolean eliminar(Long idCiudad);
	public abstract List<CiudadDO> listarTodo();
	public abstract List<CiudadDO> seleccionPorNombre(Long idDpto, String parteNombre);
	public abstract List<CiudadDO> seleccionPorDpto(Long idDpto);
	public abstract boolean importarCiudades(String rutaArchivo);

}
