/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.client.calendario;

import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.calendario.objeto.CalendarioNoLaboralTO;
import com.cpcoriente.sgp.springgwt.pro.shared.calendario.objeto.DiaNoLaboralTO;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * @author CPC-03
 * @generated generated asynchronous callback interface to be used on the client side
 *
 */
public interface ICalendarioServicioAsync {

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarCalendarioNoLaboral(Long idCalendarioNoLaboral,
			AsyncCallback<CalendarioNoLaboralTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void crearCalendarioNoLaboral(
			List<CalendarioNoLaboralTO> calendarioNoLaboralList,
			AsyncCallback<List<CalendarioNoLaboralTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void modificarCalendarioNoLaboral(
			CalendarioNoLaboralTO calendarioNoLaboral,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void eliminarCalendarioNoLaboral(Long idCalendarioNoLaboral,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void listarTodoCalendarioPorProyecto(Long idProyecto,
			AsyncCallback<List<CalendarioNoLaboralTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorRangofechasCalendario(Long idProyecto, Date fechaInicio,
			Date fechaFin, AsyncCallback<List<CalendarioNoLaboralTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarDiaNoLaboral(Long idDiaNoLaboral,
			AsyncCallback<DiaNoLaboralTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void crearDiaNoLaboral(List<DiaNoLaboralTO> diaNoLaboralList,
			AsyncCallback<List<DiaNoLaboralTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void modificarDiaNoLaboral(DiaNoLaboralTO diaNoLaboral,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void eliminarDiaNoLaboral(Long idDiaNoLaboral,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void listarTodoDiaPorEmpresa(Long idEmpresa,
			AsyncCallback<List<DiaNoLaboralTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionPorRangofechasDia(Long idEmpresa, Date fechaInicio,
			Date fechaFin, AsyncCallback<List<DiaNoLaboralTO>> callback);

}
