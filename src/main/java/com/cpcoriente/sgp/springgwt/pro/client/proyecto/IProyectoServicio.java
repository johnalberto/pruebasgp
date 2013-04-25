package com.cpcoriente.sgp.springgwt.pro.client.proyecto;

import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.ActividadEconomicaTO;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.enumerador.EstadoProyectoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.ContactoProyectoEntidadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.DocProyectoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.ProyectoEntidadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.ProyectoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.VersionProyectoTO;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


@RemoteServiceRelativePath("proyecto")
public interface IProyectoServicio extends RemoteService {
	
	
	
	
	
	public abstract Long crearContactoProyectoEntidad(ContactoProyectoEntidadTO contacto) 
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearDocProyecto(DocProyectoTO documento) 
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearProyecto(ProyectoTO proyecto) 
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearProyectoEntidad(ProyectoEntidadTO proyEnt) 
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract long crearVersionProyecto(VersionProyectoTO version)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;

	public abstract boolean modificarContactoEntidad(ContactoProyectoEntidadTO contacto) 
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarDocProyecto(DocProyectoTO documento) 
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarProyecto(ProyectoTO proyecto) 
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarProyectoEntidad(ProyectoEntidadTO proyEntidad) 
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarVersionProyecto(VersionProyectoTO proyEntidad) 
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	
	public abstract boolean eliminarContactoEntidad(Long idContacto) 
			throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarDocProyecto(Long idDocProyecto) 
			throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarProyecto(Long idProyecto) 
			throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarProyectoEntidad(Long idProyEntidad) 
			throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarVersionProyecto(Long idVersion) 
			throws ValidacionExcepcion, PrecondicionExcepcion;
	
	
	public abstract List<ContactoProyectoEntidadTO> listarTodoContactoProyecto() 
			throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<ContactoProyectoEntidadTO> listarContactoProyectoPorNombre(String parteNombre) 
			throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<ContactoProyectoEntidadTO> listarContactoPorProyecto(Long idProyecto) 
			throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<ContactoProyectoEntidadTO> listarContactoPorProyectoPorEntidad(Long idProyecto,Long idEntidad) 
			throws ValidacionExcepcion, PrecondicionExcepcion;
	
	public abstract List<DocProyectoTO> listarDocumentoProyectoPorProyecto(Long idProyecto) 
			throws ValidacionExcepcion, PrecondicionExcepcion;
	
	public abstract List<ProyectoTO> listarProyectoPorDivision(Long idDivision) 
			throws ValidacionExcepcion, PrecondicionExcepcion;
	
	public abstract List<ProyectoTO> listarProyectoPorTitulo(String titulo) 
			throws ValidacionExcepcion, PrecondicionExcepcion;
	
	public abstract List<ProyectoTO> listarProyectoPorCodigo(String codigo) 
			throws ValidacionExcepcion, PrecondicionExcepcion;
	
	public abstract List<ProyectoTO> listarProyectoPorFechaInicioFechaFin(Date fechaInicio,Date fechaFin) 
			throws ValidacionExcepcion, PrecondicionExcepcion;
	
	public abstract List<ProyectoTO> listarProyectoPorConvocatoria(Long idConvocatoria) 
			throws ValidacionExcepcion, PrecondicionExcepcion;
	
	public abstract List<ProyectoTO> listarProyectoPorEstado(EstadoProyectoEnum estado) 
			throws ValidacionExcepcion, PrecondicionExcepcion;
	
	public abstract List<VersionProyectoTO> listarVersionProyectoPorFechaProyecto(Long idProyecto,Date fechaInicio,Date fechaFin ) 
			throws ValidacionExcepcion, PrecondicionExcepcion;
	
	public abstract List<VersionProyectoTO> listarVersionProyectoPorProyecto(Long idProyecto ) 
			throws ValidacionExcepcion, PrecondicionExcepcion;
	
	
	public abstract List<ProyectoTO> seleccionPorGeneralProyecto(String codigo, String  titulo,
			Long idConvocatoria, int estado,Date fechaIni, Date fechaFin,Long idEmpresa)
			throws ValidacionExcepcion, PrecondicionExcepcion;

	
	public abstract ContactoProyectoEntidadTO cargarContactoProyecto(Long idContacto) throws ValidacionExcepcion, PrecondicionExcepcion;

	public abstract DocProyectoTO cargarDocumentoProyecto(Long idDocumento) throws ValidacionExcepcion, PrecondicionExcepcion;

	public abstract ProyectoTO cargarProyecto(Long idProyecto) throws ValidacionExcepcion, PrecondicionExcepcion;

	public abstract ProyectoEntidadTO cargarProyectoEntidad(Long idProyectoEntidad) throws ValidacionExcepcion, PrecondicionExcepcion;

	public abstract VersionProyectoTO cargarVersionProyecto(Long idVersionProyecto) throws ValidacionExcepcion, PrecondicionExcepcion;

	
}
