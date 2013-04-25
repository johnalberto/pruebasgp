package com.cpcoriente.sgp.springgwt.pro.client.proyecto;

import java.util.Date;
import java.util.List;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.enumerador.EstadoProyectoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.ContactoProyectoEntidadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.DocProyectoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.ProyectoEntidadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.ProyectoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.VersionProyectoTO;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface IProyectoServicioAsync {

	void crearContactoProyectoEntidad(ContactoProyectoEntidadTO contacto,
			AsyncCallback<Long> callback);

	void crearDocProyecto(DocProyectoTO documento, AsyncCallback<Long> callback);

	void crearProyecto(ProyectoTO proyecto, AsyncCallback<Long> callback);

	void crearProyectoEntidad(ProyectoEntidadTO proyEnt,
			AsyncCallback<Long> callback);

	void crearVersionProyecto(VersionProyectoTO version,
			AsyncCallback<Long> callback);

	void eliminarContactoEntidad(Long idContacto,
			AsyncCallback<Boolean> callback);

	void eliminarDocProyecto(Long idDocProyecto, AsyncCallback<Boolean> callback);

	void eliminarProyecto(Long idProyecto, AsyncCallback<Boolean> callback);

	void eliminarProyectoEntidad(Long idProyEntidad,
			AsyncCallback<Boolean> callback);

	void eliminarVersionProyecto(Long idVersion, AsyncCallback<Boolean> callback);

	void listarContactoPorProyecto(Long idProyecto,
			AsyncCallback<List<ContactoProyectoEntidadTO>> callback);

	void listarContactoPorProyectoPorEntidad(Long idProyecto, Long idEntidad,
			AsyncCallback<List<ContactoProyectoEntidadTO>> callback);

	void listarContactoProyectoPorNombre(String parteNombre,
			AsyncCallback<List<ContactoProyectoEntidadTO>> callback);

	void listarDocumentoProyectoPorProyecto(Long idProyecto,
			AsyncCallback<List<DocProyectoTO>> callback);

	void listarProyectoPorCodigo(String codigo,
			AsyncCallback<List<ProyectoTO>> callback);

	void listarProyectoPorConvocatoria(Long idConvocatoria,
			AsyncCallback<List<ProyectoTO>> callback);

	void listarProyectoPorDivision(Long idDivision,
			AsyncCallback<List<ProyectoTO>> callback);

	void listarProyectoPorEstado(EstadoProyectoEnum estado,
			AsyncCallback<List<ProyectoTO>> callback);

	void listarProyectoPorFechaInicioFechaFin(Date fechaInicio, Date fechaFin,
			AsyncCallback<List<ProyectoTO>> callback);

	void listarProyectoPorTitulo(String titulo,
			AsyncCallback<List<ProyectoTO>> callback);

	void listarTodoContactoProyecto(
			AsyncCallback<List<ContactoProyectoEntidadTO>> callback);

	void listarVersionProyectoPorFechaProyecto(Long idProyecto,
			Date fechaInicio, Date fechaFin,
			AsyncCallback<List<VersionProyectoTO>> callback);

	void listarVersionProyectoPorProyecto(Long idProyecto,
			AsyncCallback<List<VersionProyectoTO>> callback);

	void modificarContactoEntidad(ContactoProyectoEntidadTO contacto,
			AsyncCallback<Boolean> callback);

	void modificarDocProyecto(DocProyectoTO documento,
			AsyncCallback<Boolean> callback);

	void modificarProyecto(ProyectoTO proyecto, AsyncCallback<Boolean> callback);

	void modificarProyectoEntidad(ProyectoEntidadTO proyEntidad,
			AsyncCallback<Boolean> callback);

	void modificarVersionProyecto(VersionProyectoTO proyEntidad,
			AsyncCallback<Boolean> callback);

	void cargarContactoProyecto(Long idContacto,
			AsyncCallback<ContactoProyectoEntidadTO> callback);

	void cargarDocumentoProyecto(Long idDocumento,
			AsyncCallback<DocProyectoTO> callback);

	void cargarProyecto(Long idProyecto, AsyncCallback<ProyectoTO> callback);

	void cargarProyectoEntidad(Long idProyectoEntidad,
			AsyncCallback<ProyectoEntidadTO> callback);

	void cargarVersionProyecto(Long idVersionProyecto,
			AsyncCallback<VersionProyectoTO> callback);

	void seleccionPorGeneralProyecto(String codigo, String titulo,
			Long idConvocatoria, int estado, Date fechaIni, Date fechaFin,
			Long idEmpresa, AsyncCallback<List<ProyectoTO>> callback);

	

	
	
	
	
}
