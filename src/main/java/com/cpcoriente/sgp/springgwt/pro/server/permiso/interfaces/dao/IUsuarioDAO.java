/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioDO;





/**
 * @author CPC-04
 *
 */
public interface IUsuarioDAO {
	
	
	public abstract UsuarioDO cargar(Long idUsuario);
	public abstract UsuarioDO persistir(UsuarioDO usuario) ;
	public abstract UsuarioDO modificar(UsuarioDO usuario) ;
	public abstract boolean eliminar(Long idUsuario);
	public abstract List<UsuarioDO> listarTodo();
	public abstract List<UsuarioDO> seleccionPorNombre(String parteNombre);
	public abstract List<UsuarioDO> seleccionPorCiudad(String idCiudad);
	public abstract List<UsuarioDO> seleccionPorTercero(Long idTercero);
	public abstract List<UsuarioDO> seleccionPorTipoUsuario(String idTipoUsuario);
	public abstract UsuarioDO seleccionPorTipoYDocumento(String idTipoDocumento, String numDoc);
	public abstract UsuarioDO seleccionPorUsername(String username);
	public abstract UsuarioDO seleccionPorUsernamePorPassword(String username,String password);
}
