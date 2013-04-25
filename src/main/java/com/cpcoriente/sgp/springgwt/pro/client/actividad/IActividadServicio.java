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
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


@RemoteServiceRelativePath("actividad")
public interface IActividadServicio extends RemoteService {
	
	
	public abstract ActividadTO cargarActividad(Long idActividad) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearActividad(ActividadTO actividad)  throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarActividad(ActividadTO actividad, VersionActividadTO versionActividad)  throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarActividad(Long idActividad) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<ActividadTO> listarTodoActividad(Long idProducto) throws PrecondicionExcepcion, ValidacionExcepcion;
	public abstract List<ActividadTO> seleccionPorNombreActividadCodigo(Long idProducto, String parteNombreCodigo) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<ActividadTO> seleccionPorProductoPorEstadoActividad(Long idProducto,int estado) throws ValidacionExcepcion, PrecondicionExcepcion;
	
	public abstract List<ActividadTO> seleccionPorNombreCodigoPadreActividad(Long idPadre, String parteNombreCodigo) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<ActividadTO> seleccionPorPadreActividad(Long idPadre) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<ActividadTO> seleccionPadresActividad(Long idProducto) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<ActividadTO> seleccionPadresPorNomCodActividad(Long idProducto, String parteNombreCodigo) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<ActividadTO> seleccionPorRangofechasActividad(Long idProducto, Date fechaInicio, Date fechaFin) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<ActividadTO> seleccionPorFechaInicialActividad(Long idProducto, Date fechaInicio) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<ActividadTO> seleccionPorFechaFinalActividad(Long idProducto, Date fechaFin) throws ValidacionExcepcion, PrecondicionExcepcion;
	
	public abstract ActividadPorPersonalTO cargarAPP(Long idActividadPorPersonal) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearAPP(ActividadPorPersonalTO actividadPorPersonal) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarAPP(ActividadPorPersonalTO actividadPorPersonal) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarAPP(Long idActividadPorPersonal) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<ActividadPorPersonalTO> listarTodoPorProductoAPP(Long idProducto)  throws PrecondicionExcepcion, ValidacionExcepcion;
	public abstract List<ActividadPorPersonalTO> seleccionPorPersonaAPP(Long idProyecto, String parteNombreCedula) throws ValidacionExcepcion, PrecondicionExcepcion;
	
	
	public abstract DocObjetivoTO cargarDocObjetivo(Long idDocObjetivo) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract List<DocObjetivoTO> crearDocObjetivo(List<DocObjetivoTO> docObjetivoList) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarDocObjetivo(DocObjetivoTO docObjetivo) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarDocObjetivo(List<Long> idDocObjetivoLista) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<DocObjetivoTO> seleccionPorObjetivoDocObjetivo(Long idObjetivo) throws ValidacionExcepcion, PrecondicionExcepcion;
	
	
	public abstract EntregableTO cargarEntregable(Long idEntregable) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearEntregable(EntregableTO entregable) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarEntregable(EntregableTO entregable, VersionEntregableTO versionEntregable) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarEntregable(Long idEntregable) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<EntregableTO> listarTodoEntregable(Long idActividad) throws PrecondicionExcepcion, ValidacionExcepcion;
	public abstract List<EntregableTO> seleccionPorNombreCodigoEntregable(Long idActividad, String parteNombreCodigo) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<EntregableTO> seleccionPorActividadPorEstadoEtregable(Long idActividad,int estado) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<EntregableTO> seleccionPorRangofechasEntregable(Long idActividad, Date fechaInicio, Date fechaFin) throws ValidacionExcepcion, PrecondicionExcepcion;
	
	public abstract ObjetivoTO cargarObjetivo(Long idObjetivo) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearObjetivo(ObjetivoTO objetivo) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarObjetivo(ObjetivoTO objetivo, VersionObjetivoTO versionObjetivo) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarObjetivo(Long idObjetivo) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<ObjetivoTO> listarTodoObjetivo(Long idProyecto) throws PrecondicionExcepcion, ValidacionExcepcion;
	public abstract List<ObjetivoTO> seleccionPorNombreCodigoObjetivo(Long idProyecto, String parteNombreCodigo) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<ObjetivoTO> seleccionPorProyectoPorEstadoObjetivo(Long idProyecto,int estado) throws ValidacionExcepcion, PrecondicionExcepcion;
	
	
	public abstract ProductoTO cargarProducto(Long idProducto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearProducto(ProductoTO producto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarProducto(ProductoTO producto, VersionProductoTO versionProducto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarProducto(Long idProducto) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<ProductoTO> listarTodoProducto(Long idObjetivo) throws PrecondicionExcepcion, ValidacionExcepcion;
	public abstract List<ProductoTO> seleccionPorNombreCodigoProducto(Long idObjetivo, String parteNombreCodigo) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<ProductoTO> seleccionPorObjetivoPorEstadoProducto(Long idObjetivo,int estado) throws ValidacionExcepcion, PrecondicionExcepcion;
	
	public abstract VersionActividadTO cargarVersionActividad(Long idVersionActividad) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract List<VersionActividadTO> seleccionPorFechaVersionActividad(Long idActividad, Date fechaInicio, Date fechaFin) throws ValidacionExcepcion, PrecondicionExcepcion;
	
	public abstract VersionEntregableTO cargarVersionEntregable(Long idVersionEntregable) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract List<VersionEntregableTO> seleccionPorFechaVersionEntregable(Long idEntregable, Date fechaInicio, Date fechaFin) throws ValidacionExcepcion, PrecondicionExcepcion;
	
	public abstract VersionObjetivoTO cargarVersionObjetivo(Long idVersionObjetivo) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract List<VersionObjetivoTO> seleccionPorFechaVersionObjetivo(Long idObjetivo, Date fechaInicio, Date fechaFin) throws ValidacionExcepcion, PrecondicionExcepcion;
	
	public abstract VersionProductoTO cargarVersionProducto(Long idVersionProducto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract List<VersionProductoTO> seleccionPorFechaVersionProducto(Long idProducto, Date fechaInicio, Date fechaFin) throws ValidacionExcepcion, PrecondicionExcepcion;
	

}
