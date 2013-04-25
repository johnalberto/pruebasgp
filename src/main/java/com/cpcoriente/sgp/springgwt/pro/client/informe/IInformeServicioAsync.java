/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.client.informe;

import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.DocInformeTO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InfoInterEntregableDetalleTO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InfoInterProductoDetalleTO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InformeDetalleTO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InformeTO;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * @author CPC-03
 * @generated generated asynchronous callback interface to be used on the client side
 *
 */
public interface IInformeServicioAsync {

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarDocInforme(Long idDocInforme,
			AsyncCallback<DocInformeTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void crearDocInforme(List<DocInformeTO> docInformeList,
			AsyncCallback<List<DocInformeTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void modificarDocInforme(DocInformeTO docInforme,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void eliminarDocInforme(List<Long> idDocInformeLista,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void seleccionDocInformePorInforme(Long idInforme,
			AsyncCallback<List<DocInformeTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarInformeDetalle(Long idInformeDetalle,
			AsyncCallback<InformeDetalleTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void crearInformeDetalle(List<InformeDetalleTO> informeDetalleList,
			AsyncCallback<List<InformeDetalleTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void modificarInformeDetalle(InformeDetalleTO informeDetalle,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void eliminarInformeDetalle(Long idInformeDetalle,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarInforme(Long idInforme, AsyncCallback<InformeTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void crearInforme(InformeTO informe, AsyncCallback<Long> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void modificarInforme(InformeTO informe, AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void eliminarInforne(Long idInforme, AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void listarSeleccionGeneralInforme(Long idPersona, Long idActividad,
			Date fechaRegIni, Date fechaRegFin, Boolean vobo, String codigo,
			AsyncCallback<List<InformeTO>> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarInfoInterEntregableDetalle(Long idInfoInterEntregableDetalle,
			AsyncCallback<InfoInterEntregableDetalleTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void crearInfoInterEntregableDetalle(
			InfoInterEntregableDetalleTO infoInterEntregableDetalle,
			AsyncCallback<Long> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void modificarInfoInterEntregableDetalle(
			InfoInterEntregableDetalleTO infoInterEntregableDetalle,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void eliminarInfoInterEntregableDetalle(Long idInfoInterEntregableDetalle,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void cargarInfoInterProductoDetalle(Long idInfoInterProductoDetalle,
			AsyncCallback<InfoInterProductoDetalleTO> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void crearInfoInterProductoDetalle(
			InfoInterProductoDetalleTO infoInterProductoDetalle,
			AsyncCallback<Long> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void modificarInfoInterProductoDetalle(
			InfoInterProductoDetalleTO infoInterProductoDetalle,
			AsyncCallback<Boolean> callback);

	/**
	 * @param  callback the callback that will be called to receive the return value
	 * @generated generated method with asynchronous callback parameter to be used on the client side
	 */
	void eliminarInfoInterProductoDetalle(Long idInfoInterProductoDetalle,
			AsyncCallback<Boolean> callback);

}
