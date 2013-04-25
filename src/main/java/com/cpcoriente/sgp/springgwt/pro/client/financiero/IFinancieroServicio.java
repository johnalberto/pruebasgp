package com.cpcoriente.sgp.springgwt.pro.client.financiero;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.ActividadEconomicaTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.ConvocatoriaTO;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RecursoDetalleTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RecursoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RubroProyectoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RubroTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.UnidadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.VersionRecursoDetalleTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.VersionRecursoTO;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


@RemoteServiceRelativePath("financiero")
public interface IFinancieroServicio extends RemoteService {

	public abstract Long crearRecurso(RecursoTO recurso) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearRecursoDetalle(RecursoDetalleTO detalle) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearRubro(RubroTO rubro) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearRubroProyecto(RubroProyectoTO rubroProyecto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearUnidad(UnidadTO unidad) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearVersionRecurso(VersionRecursoTO verRecurso) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearVersionRecursoDetalle(VersionRecursoDetalleTO verDetRecurso) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;

	public abstract boolean modificarRecurso(RecursoTO recurso) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarRecursoDetalle(RecursoDetalleTO detalle) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarRubro(RubroTO rubro) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarRubroProyecto(RubroProyectoTO rubroProyecto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarUnidad(UnidadTO unidad) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;

	public abstract boolean eliminarRecurso(Long idRecurso) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarRecursoDetalle(Long idDetalle) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarRubro(Long idRubro) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarRubroProyecto(Long idRubroProyecto) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarUnidad(Long idUnidad) throws ValidacionExcepcion, PrecondicionExcepcion;
	
	
	public abstract RecursoTO cargarRecurso(Long idRecurso) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract RecursoDetalleTO cargarRecursoDetalle(Long idDetalle) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract RubroTO cargarRubro(Long idRubro) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract RubroProyectoTO cargarRubroProyecto(Long idRubroProyecto) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract UnidadTO cargarUnidad(Long idUnidad) throws ValidacionExcepcion, PrecondicionExcepcion;
	
	public abstract List<RecursoTO> listarRecursosPorProyecto(Long idProyecto) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<RecursoTO> listarRecursosSelecGeneral(Long  idRubro, Long  idActividad,
			String descripcion, Long idProyecto) throws ValidacionExcepcion, PrecondicionExcepcion;

	public abstract List<RubroTO> listarTodoRubros() throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<RubroTO> listarRubrosPorEntidad(Long idEntidad) throws ValidacionExcepcion, PrecondicionExcepcion;

	public abstract List<UnidadTO> listarTodosUnidad() throws ValidacionExcepcion, PrecondicionExcepcion;


	
	
}
