package com.cpcoriente.sgp.springgwt.pro.client.parametro;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.parametro.objeto.ParametroGeneralTO;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface IParametroServicioAsync {

	void modificarParametro(ParametroGeneralTO parametro,
			AsyncCallback<Boolean> callback);

	void eliminarParametro(String idParamatro, AsyncCallback<Boolean> callback);

	void listarTodosParametro(AsyncCallback<List<ParametroGeneralTO>> callback);

	void cargarParametro(String parametroId, AsyncCallback<ParametroGeneralTO> callback);

	void buscarParametrosPorDescripcion(String descripcion,
			AsyncCallback<List<ParametroGeneralTO>> callback);
	

}
