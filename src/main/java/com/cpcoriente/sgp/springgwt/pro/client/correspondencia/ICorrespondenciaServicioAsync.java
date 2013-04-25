package com.cpcoriente.sgp.springgwt.pro.client.correspondencia;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.objeto.MensajeTO;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ICorrespondenciaServicioAsync {

	void cargarMensaje(Long idMensaje, AsyncCallback<MensajeTO> callback);

	void crearMensaje(MensajeTO mensaje, AsyncCallback<Long> callback);

	void eliminarMensaje(Long idMensaje, AsyncCallback<Boolean> callback);

	void listarMensajesPorDestino(Long idUsuario,
			AsyncCallback<List<MensajeTO>> callback);

	void listarMensajesPorDestinoPorProyecto(Long idUsuario, Long idProyecto,
			AsyncCallback<List<MensajeTO>> callback);

	void listarMensajesPorUsuario(Long idUsuario,
			AsyncCallback<List<MensajeTO>> callback);

	void listarMensajesPorUsuarioPorProyecto(Long idUsuario, Long idProyecto,
			AsyncCallback<List<MensajeTO>> callback);

	void listarTodoProyecto(Long idProyecto,
			AsyncCallback<List<MensajeTO>> callback);

	void modificarMensaje(MensajeTO mensaje, AsyncCallback<Boolean> callback);

}
