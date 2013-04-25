/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.EntidadDO;


/**
 * @author CPC-04
 *
 */
public interface IEntidadDAO {
	
	public abstract EntidadDO cargar(Long idEntidad);
	public abstract EntidadDO persistir(EntidadDO entidad) ;
	public abstract EntidadDO modificar(EntidadDO entidad) ;
	public abstract boolean eliminar(Long idEntidad);
	public abstract List<EntidadDO> listarTodo();
	public abstract List<EntidadDO> seleccionPorNombre(String parteNombre);
	public abstract List<EntidadDO> seleccionPorCiudad(Long idCiudad);
	public abstract List<EntidadDO> buscarEntidadPorTipDocNumDoc(String numDoc,Integer tipDoc);
	public abstract List<EntidadDO> selecEntidadPorUsuario(String username);
	public abstract List<EntidadDO> seleccionPorNumDoc(String parteNumDoc);
	
}
