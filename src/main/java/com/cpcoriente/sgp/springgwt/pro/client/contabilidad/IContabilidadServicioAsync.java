/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.client.contabilidad;

import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.ImpuestoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.MovimientoContableDetalleTO;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.MovimientoContableTO;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.PucPorProyectoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.PucTO;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * @author CPC-03
 * @generated generated asynchronous callback interface to be used on the client side
 *
 */
public interface IContabilidadServicioAsync {

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarImpuesto(Long idImpuesto, AsyncCallback<ImpuestoTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void persistirImpuesto(ImpuestoTO impuesto, AsyncCallback<Long> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void modificarImpuesto(ImpuestoTO impuesto, AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void eliminarImpuesto(Long idImpuesto, AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void listarTodoImpuesto(Long idEmpresa,
			AsyncCallback<List<ImpuestoTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorNombreImpuesto(Long idEmpresa, String parteNombre,
			AsyncCallback<List<ImpuestoTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarMovimientoContable(Long idMovimientoContable,
			AsyncCallback<MovimientoContableTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void persistirMovimientoContable(MovimientoContableTO movimientoContable,
			AsyncCallback<Long> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void listarTodoMovimientoContablePorProyecto(Long idProyecto,
			AsyncCallback<List<MovimientoContableTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorCuentaMovimientoContable(Long idProyecto,
			Long idCuentaPuc, AsyncCallback<List<MovimientoContableTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorRangofechasMovimientoContable(Long idProyecto,
			Date fechaInicio, Date fechaFin,
			AsyncCallback<List<MovimientoContableTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorEjecucionMovimientoContable(Long idProyecto,
			Long idEjecPres, AsyncCallback<List<MovimientoContableTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorRecursoDetMovimientoContable(Long idProyecto,
			Long idRecursoDet,
			AsyncCallback<List<MovimientoContableTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarMovimientoContableDetalle(Long idMovimientoContableDetalle,
			AsyncCallback<MovimientoContableDetalleTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarPUC(Long idPuc, AsyncCallback<PucTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void persistirPUC(PucTO puc, AsyncCallback<Long> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void modificarPUC(PucTO puc, AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void eliminarPUC(Long idPuc, AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void listarTodoPUC(Long idEntidad, AsyncCallback<List<PucTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorNombreCodigoPUC(Long idEntidad, String parteNombreCodigo,
			AsyncCallback<List<PucTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarPucPorProyecto(Long idPucPorProyecto,
			AsyncCallback<PucPorProyectoTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void persistirPucPorProyecto(List<PucPorProyectoTO> pucPorProyectoList,
			AsyncCallback<List<PucPorProyectoTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void eliminarPucPorProyecto(Long idPucPorProyecto,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void listarTodoPucPorProyecto(Long idProyecto,
			AsyncCallback<List<PucPorProyectoTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorNombreCodigoPucPorProyecto(Long idProyecto,
			String parteNombreCodigo,
			AsyncCallback<List<PucPorProyectoTO>> callback);

}
