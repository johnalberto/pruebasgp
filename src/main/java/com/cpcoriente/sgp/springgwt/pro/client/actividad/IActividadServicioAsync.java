/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.client.actividad;

import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ActividadPorPersonalTO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ActividadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.DocObjetivoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.EntregableTO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ObjetivoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ProductoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.VersionActividadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.VersionEntregableTO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.VersionObjetivoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.VersionProductoTO;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * @author CPC-03
 * @generated generated asynchronous callback interface to be used on the client side
 *
 */
public interface IActividadServicioAsync {

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarActividad(Long idActividad, AsyncCallback<ActividadTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void crearActividad(ActividadTO actividad, AsyncCallback<Long> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void modificarActividad(ActividadTO actividad,
			VersionActividadTO versionActividad, AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void eliminarActividad(Long idActividad, AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void listarTodoActividad(Long idProducto,
			AsyncCallback<List<ActividadTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorNombreActividadCodigo(Long idProducto,
			String parteNombreCodigo, AsyncCallback<List<ActividadTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorProductoPorEstadoActividad(Long idProducto, int estado,
			AsyncCallback<List<ActividadTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorNombreCodigoPadreActividad(Long idPadre,
			String parteNombreCodigo, AsyncCallback<List<ActividadTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorPadreActividad(Long idPadre,
			AsyncCallback<List<ActividadTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPadresActividad(Long idProducto,
			AsyncCallback<List<ActividadTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPadresPorNomCodActividad(Long idProducto,
			String parteNombreCodigo, AsyncCallback<List<ActividadTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorRangofechasActividad(Long idProducto, Date fechaInicio,
			Date fechaFin, AsyncCallback<List<ActividadTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorFechaInicialActividad(Long idProducto, Date fechaInicio,
			AsyncCallback<List<ActividadTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorFechaFinalActividad(Long idProducto, Date fechaFin,
			AsyncCallback<List<ActividadTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarAPP(Long idActividadPorPersonal,
			AsyncCallback<ActividadPorPersonalTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void crearAPP(ActividadPorPersonalTO actividadPorPersonal,
			AsyncCallback<Long> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void modificarAPP(ActividadPorPersonalTO actividadPorPersonal,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void eliminarAPP(Long idActividadPorPersonal,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void listarTodoPorProductoAPP(Long idProducto,
			AsyncCallback<List<ActividadPorPersonalTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorPersonaAPP(Long idProyecto, String parteNombreCedula,
			AsyncCallback<List<ActividadPorPersonalTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarDocObjetivo(Long idDocObjetivo,
			AsyncCallback<DocObjetivoTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void crearDocObjetivo(List<DocObjetivoTO> docObjetivoList,
			AsyncCallback<List<DocObjetivoTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void modificarDocObjetivo(DocObjetivoTO docObjetivo,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void eliminarDocObjetivo(List<Long> idDocObjetivoLista,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorObjetivoDocObjetivo(Long idObjetivo,
			AsyncCallback<List<DocObjetivoTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarEntregable(Long idEntregable,
			AsyncCallback<EntregableTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void crearEntregable(EntregableTO entregable, AsyncCallback<Long> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void modificarEntregable(EntregableTO entregable,
			VersionEntregableTO versionEntregable,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void eliminarEntregable(Long idEntregable, AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void listarTodoEntregable(Long idActividad,
			AsyncCallback<List<EntregableTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorNombreCodigoEntregable(Long idActividad,
			String parteNombreCodigo, AsyncCallback<List<EntregableTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorActividadPorEstadoEtregable(Long idActividad, int estado,
			AsyncCallback<List<EntregableTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorRangofechasEntregable(Long idActividad, Date fechaInicio,
			Date fechaFin, AsyncCallback<List<EntregableTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarObjetivo(Long idObjetivo, AsyncCallback<ObjetivoTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void crearObjetivo(ObjetivoTO objetivo, AsyncCallback<Long> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void modificarObjetivo(ObjetivoTO objetivo,
			VersionObjetivoTO versionObjetivo, AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void eliminarObjetivo(Long idObjetivo, AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void listarTodoObjetivo(Long idProyecto,
			AsyncCallback<List<ObjetivoTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorNombreCodigoObjetivo(Long idProyecto,
			String parteNombreCodigo, AsyncCallback<List<ObjetivoTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorProyectoPorEstadoObjetivo(Long idProyecto, int estado,
			AsyncCallback<List<ObjetivoTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarProducto(Long idProducto, AsyncCallback<ProductoTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void crearProducto(ProductoTO producto, AsyncCallback<Long> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void modificarProducto(ProductoTO producto,
			VersionProductoTO versionProducto, AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void eliminarProducto(Long idProducto, AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void listarTodoProducto(Long idObjetivo,
			AsyncCallback<List<ProductoTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorNombreCodigoProducto(Long idObjetivo,
			String parteNombreCodigo, AsyncCallback<List<ProductoTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorObjetivoPorEstadoProducto(Long idObjetivo, int estado,
			AsyncCallback<List<ProductoTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarVersionActividad(Long idVersionActividad,
			AsyncCallback<VersionActividadTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorFechaVersionActividad(Long idActividad, Date fechaInicio,
			Date fechaFin, AsyncCallback<List<VersionActividadTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarVersionEntregable(Long idVersionEntregable,
			AsyncCallback<VersionEntregableTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorFechaVersionEntregable(Long idEntregable,
			Date fechaInicio, Date fechaFin,
			AsyncCallback<List<VersionEntregableTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarVersionObjetivo(Long idVersionObjetivo,
			AsyncCallback<VersionObjetivoTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorFechaVersionObjetivo(Long idObjetivo, Date fechaInicio,
			Date fechaFin, AsyncCallback<List<VersionObjetivoTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarVersionProducto(Long idVersionProducto,
			AsyncCallback<VersionProductoTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorFechaVersionProducto(Long idProducto, Date fechaInicio,
			Date fechaFin, AsyncCallback<List<VersionProductoTO>> callback);

}
