/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.client.permiso;

import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.LogUsuarioTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.PermisoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioEntidadTipoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioProyectoEntidadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * @author CPC-04
 * @generated generated asynchronous callback interface to be used on the client side
 *
 */
public interface IPermisoServicioAsync {

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void crearUsuarioPorTipo(UsuarioPorTipoTO usuarioPorTipo,
			AsyncCallback<Long> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void crearUsuario(UsuarioTO usuario, AsyncCallback<Long> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void crearLogUsuario(LogUsuarioTO logUsuario, AsyncCallback<Long> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void crearPermiso(PermisoTO permiso, AsyncCallback<Long> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void crearUsuarioEntidadTipo(UsuarioEntidadTipoTO usuario,
			AsyncCallback<Long> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void crearListaUsuarioPorTipo(List<UsuarioPorTipoTO> usuarioList,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void crearUsuarioProyectoEntidad(UsuarioProyectoEntidadTO usuario,
			AsyncCallback<Long> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void modificarUsuario(UsuarioTO usuario, AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void modificarPermiso(PermisoTO permiso, AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void modificarUsuarioEntidadTipo(UsuarioEntidadTipoTO usuario,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void modificarUsuarioTipo(UsuarioPorTipoTO usuario,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void modificarUsuarioProyectoEntidad(UsuarioProyectoEntidadTO usuario,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void eliminarUsuarioPorTipo(Long idTipoUsuarioActual,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void eliminarUsuario(Long idUsuarioActual, AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void eliminarPermiso(Long idPermiso, AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void eliminarUsuarioEntidad(Long idUsuario, AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void eliminarUsuarioProyectoEntidad(Long idUsuario,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void listarTodosUsuario(AsyncCallback<List<UsuarioTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void buscarUsuarioPorNombre(String parteNombre,
			AsyncCallback<List<UsuarioTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void listarUsuarioPorCiudad(String idCiudad,
			AsyncCallback<List<UsuarioTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void listarUsuarioPorTercero(Long idTercero,
			AsyncCallback<List<UsuarioTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void listarUsuarioPorTipoUsuario(String idTipoUsuario,
			AsyncCallback<List<UsuarioTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void listarLogUsuarioGeneral(Long idEmpresa, Date fechaInicio,
			Date fechaFin, String idUsuario, String idPagina, String idAccion,
			AsyncCallback<List<LogUsuarioTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void listarUltimaFechaUsuario(Long idEmpresa, String userName,
			AsyncCallback<LogUsuarioTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarUsuario(Long usuarioId, AsyncCallback<UsuarioTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarLogUsuario(Long idLogUsuario,
			AsyncCallback<LogUsuarioTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarPermiso(Long idLogUsuario, AsyncCallback<PermisoTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarUsuarioEntidad(Long idUsarioEntidad,
			AsyncCallback<UsuarioEntidadTipoTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarUsuarioPorTipo(Long idUsuario,
			AsyncCallback<UsuarioPorTipoTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarUsuarioProyectoEntidad(Long idUsuario,
			AsyncCallback<UsuarioProyectoEntidadTO> callback);

}
