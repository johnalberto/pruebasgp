/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.client.ejecucion;

import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.objeto.DocEjecucionPresupuestoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.objeto.EjecucionPresupuestoTO;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * @author CPC-03
 * @generated generated asynchronous callback interface to be used on the client side
 *
 */
public interface IEjecucionServicioAsync {

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarDocEjecucion(Long idDocEjecucionPresupuesto,
			AsyncCallback<DocEjecucionPresupuestoTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void crearDocEjecucion(
			List<DocEjecucionPresupuestoTO> docEjecucionPresupuestoList,
			AsyncCallback<List<DocEjecucionPresupuestoTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void modificarDocEjecucion(
			DocEjecucionPresupuestoTO docEjecucionPresupuesto,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void eliminarDocEjecucion(List<Long> idDocEjecucionPresupuestoLista,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionDocPorEjecucionPresupuesto(Long idEjecucionPresupuesto,
			AsyncCallback<List<DocEjecucionPresupuestoTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarEjecucion(Long idEjecucionPresupuesto,
			AsyncCallback<EjecucionPresupuestoTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void crearEjecucion(EjecucionPresupuestoTO ejecucionPresupuesto,
			AsyncCallback<Long> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void modificarEjecucion(EjecucionPresupuestoTO ejecucionPresupuesto,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionGeneralEjecucion(Long idTercero, int tipoComprobante,
			String numComprobante, Date fechaRegIni, Date fechaRegFin,
			Date fechaEjecIni, Date fechaEjecFin, Boolean aprobado,
			Boolean ejecutado, Long idRecurso, Long idProyectoEntidad,
			AsyncCallback<List<EjecucionPresupuestoTO>> callback);

}
