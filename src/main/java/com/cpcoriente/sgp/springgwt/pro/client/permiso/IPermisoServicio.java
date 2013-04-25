/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.client.permiso;

import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.LogUsuarioTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.PermisoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioEntidadTipoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioProyectoEntidadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


/**
 * @author CPC-04
 *
 */

@RemoteServiceRelativePath("permiso")
public interface IPermisoServicio extends RemoteService{


	public abstract Long crearUsuarioPorTipo(UsuarioPorTipoTO usuarioPorTipo) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearUsuario(UsuarioTO usuario) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearLogUsuario(LogUsuarioTO logUsuario) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearPermiso(PermisoTO permiso) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearUsuarioEntidadTipo(UsuarioEntidadTipoTO usuario) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean crearListaUsuarioPorTipo(List<UsuarioPorTipoTO> usuarioList) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearUsuarioProyectoEntidad(UsuarioProyectoEntidadTO usuario) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;

	
	public abstract boolean modificarUsuario(UsuarioTO usuario) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarPermiso(PermisoTO permiso) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarUsuarioEntidadTipo(UsuarioEntidadTipoTO usuario) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarUsuarioTipo(UsuarioPorTipoTO usuario) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarUsuarioProyectoEntidad(UsuarioProyectoEntidadTO usuario) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;

	
	public abstract boolean eliminarUsuarioPorTipo(Long idTipoUsuarioActual) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarUsuario(Long idUsuarioActual) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarPermiso(Long idPermiso) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarUsuarioEntidad(Long idUsuario) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarUsuarioProyectoEntidad(Long idUsuario) throws ValidacionExcepcion, PrecondicionExcepcion;


	
	public abstract List<UsuarioTO> listarTodosUsuario() throws PrecondicionExcepcion;
	public abstract List<UsuarioTO> buscarUsuarioPorNombre(String parteNombre) throws ValidacionExcepcion, PrecondicionExcepcion;
	
	
	
	public abstract List<UsuarioTO> listarUsuarioPorCiudad(String idCiudad) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<UsuarioTO> listarUsuarioPorTercero(Long idTercero) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<UsuarioTO> listarUsuarioPorTipoUsuario(String idTipoUsuario) throws ValidacionExcepcion, PrecondicionExcepcion;	
	public abstract List<LogUsuarioTO> listarLogUsuarioGeneral(Long idEmpresa,Date fechaInicio,Date fechaFin,String idUsuario,String idPagina,String idAccion) 
	throws ValidacionExcepcion, PrecondicionExcepcion;	
	public abstract LogUsuarioTO listarUltimaFechaUsuario(Long idEmpresa,String userName) 
			throws ValidacionExcepcion, PrecondicionExcepcion;
	
	
	public abstract UsuarioTO cargarUsuario(Long usuarioId) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract LogUsuarioTO cargarLogUsuario(Long idLogUsuario) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract PermisoTO cargarPermiso(Long idLogUsuario) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract UsuarioEntidadTipoTO cargarUsuarioEntidad(Long idUsarioEntidad) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract UsuarioPorTipoTO cargarUsuarioPorTipo(Long idUsuario) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract UsuarioProyectoEntidadTO cargarUsuarioProyectoEntidad(Long idUsuario) throws ValidacionExcepcion, PrecondicionExcepcion;

	
}
