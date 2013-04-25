package com.cpcoriente.sgp.springgwt.pro.client.financiero;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RecursoDetalleTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RecursoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RubroProyectoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RubroTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.UnidadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.VersionRecursoDetalleTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.VersionRecursoTO;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface IFinancieroServicioAsync {

	void cargarRecurso(Long idRecurso, AsyncCallback<RecursoTO> callback);

	void cargarRecursoDetalle(Long idDetalle,
			AsyncCallback<RecursoDetalleTO> callback);

	void cargarRubro(Long idRubro, AsyncCallback<RubroTO> callback);

	void cargarRubroProyecto(Long idRubroProyecto,
			AsyncCallback<RubroProyectoTO> callback);

	void cargarUnidad(Long idUnidad, AsyncCallback<UnidadTO> callback);

	void crearRecurso(RecursoTO recurso, AsyncCallback<Long> callback);

	void crearRecursoDetalle(RecursoDetalleTO detalle,
			AsyncCallback<Long> callback);

	void crearRubro(RubroTO rubro, AsyncCallback<Long> callback);

	void crearRubroProyecto(RubroProyectoTO rubroProyecto,
			AsyncCallback<Long> callback);

	void crearUnidad(UnidadTO unidad, AsyncCallback<Long> callback);

	void crearVersionRecurso(VersionRecursoTO verRecurso,
			AsyncCallback<Long> callback);

	void crearVersionRecursoDetalle(VersionRecursoDetalleTO verDetRecurso,
			AsyncCallback<Long> callback);

	void eliminarRecurso(Long idRecurso, AsyncCallback<Boolean> callback);

	void eliminarRecursoDetalle(Long idDetalle, AsyncCallback<Boolean> callback);

	void eliminarRubro(Long idRubro, AsyncCallback<Boolean> callback);

	void eliminarRubroProyecto(Long idRubroProyecto,
			AsyncCallback<Boolean> callback);

	void eliminarUnidad(Long idUnidad, AsyncCallback<Boolean> callback);

	void listarRecursosPorProyecto(Long idProyecto,
			AsyncCallback<List<RecursoTO>> callback);

	void listarRecursosSelecGeneral(Long idRubro, Long idActividad,
			String descripcion, Long idProyecto,
			AsyncCallback<List<RecursoTO>> callback);

	void listarRubrosPorEntidad(Long idEntidad,
			AsyncCallback<List<RubroTO>> callback);

	void listarTodoRubros(AsyncCallback<List<RubroTO>> callback);

	void listarTodosUnidad(AsyncCallback<List<UnidadTO>> callback);

	void modificarRecurso(RecursoTO recurso, AsyncCallback<Boolean> callback);

	void modificarRecursoDetalle(RecursoDetalleTO detalle,
			AsyncCallback<Boolean> callback);

	void modificarRubro(RubroTO rubro, AsyncCallback<Boolean> callback);

	void modificarRubroProyecto(RubroProyectoTO rubroProyecto,
			AsyncCallback<Boolean> callback);

	void modificarUnidad(UnidadTO unidad, AsyncCallback<Boolean> callback);

}
