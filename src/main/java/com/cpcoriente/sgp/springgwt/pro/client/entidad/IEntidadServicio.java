/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.client.entidad;


import java.util.List;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.ActividadEconomicaTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.ConvocatoriaTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DocTerminoConvocatoriaTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EmpresaTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.FotoEntidadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.TerminoConvocatoriaTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.VersionTerminoConvocatoriaTO;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


@RemoteServiceRelativePath("entidad")
public interface IEntidadServicio extends RemoteService {
	
	public abstract Long crearActividadEconomica(ActividadEconomicaTO actEconomica) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearConvocatoria(ConvocatoriaTO convocatoria) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearDivision(DivisionTO division) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearDocTerminoConvocatoria(DocTerminoConvocatoriaTO documento) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearEmpresa(EmpresaTO empresa) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearEntidad(EntidadTO entidad) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearFotoEntidad(FotoEntidadTO foto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearTerminoConvocatoria(TerminoConvocatoriaTO termino) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearVersionTermino(VersionTerminoConvocatoriaTO versionTermino) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;

	
	public abstract boolean modificarActividadEconomica(ActividadEconomicaTO actEconomica) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarConvocatoria(ConvocatoriaTO convocatoria) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarDivision(DivisionTO division) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarDocTerminoConvocatoria(DocTerminoConvocatoriaTO documento) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract  boolean modificarEmpresa(EmpresaTO empresa) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract  boolean modificarEntidad(EntidadTO entidad) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract  boolean modificarFotoEntidad(FotoEntidadTO foto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract  boolean modificarTerminoConvocatoria(TerminoConvocatoriaTO termino) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract  boolean modificarVersionTerminoConvocatoria(VersionTerminoConvocatoriaTO version) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;

	
	public abstract boolean eliminarActividadEconomica(Long idActEconomica) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarConvocatoria(Long idConvocatoria) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarDivision(Long idDivision) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarDocTerminoConvocatoria(Long idDocTermino) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarEmpresa(Long idEmpresa) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarEntidad(Long idEntidad) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarFotoEntidad(Long idFotoEntidad) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarTerminoConvocatoria(Long idTermino) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarVersionTerminoConvocatoria(Long idVersionTermino) throws ValidacionExcepcion, PrecondicionExcepcion;
	
	
	public abstract ActividadEconomicaTO cargarActividadEconomica(Long idActividad) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract ConvocatoriaTO cargarConvocatoria(Long idConvocatoria) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract DivisionTO cargarDivision(Long idDivision) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract DocTerminoConvocatoriaTO cargarDocTermino(Long idDocTermino) throws ValidacionExcepcion, PrecondicionExcepcion;  
	public abstract EmpresaTO cargarEmpresa(Long idEmpresa) throws ValidacionExcepcion, PrecondicionExcepcion;	
	public abstract EntidadTO cargarEntidad(Long idEntidad) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract FotoEntidadTO cargarFotoEntidad(Long idFotoEntidad) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract TerminoConvocatoriaTO cargarTerminoConvocatoria(Long idTermino) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract VersionTerminoConvocatoriaTO cargarVersionTermino(Long idVersionConvocatoria) throws ValidacionExcepcion, PrecondicionExcepcion;

	
	public abstract List<ActividadEconomicaTO> listarTodoActividadEconomica() throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<ConvocatoriaTO> listarTodoConvocatoria() throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<ConvocatoriaTO> listarConvocatoriaPorDivision(Long idDivision) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<DivisionTO> listarTodoDivision() throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<DivisionTO> listarDivisionPorEntidad(Long idEntidad ) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<DivisionTO> listarDivisionPorNombre(String parteNombre ) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<DocTerminoConvocatoriaTO> listarDocTerminoPorTermino(Long idTermino ) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<EmpresaTO> listarTodoEmpresa() throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<EntidadTO> listarEntidadPorTipoDocPorNumDoc(Integer tipoDoc,String numDoc ) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<EntidadTO> listarTodoEntidad() throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<EntidadTO> listarEntidadPorCiudad(Long idCiudad ) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<EntidadTO> listarEntidadPorNombre(String parteNombre ) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<EntidadTO> listarEntidadPorNumDoc(String numDoc ) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<EntidadTO> listarEntidadPorUsuario(String username ) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<FotoEntidadTO> listarFotoEntidadPorEntidad(Long idEntidad ) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<TerminoConvocatoriaTO> listarTodoTermino() throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<TerminoConvocatoriaTO> listarTodoTerminoPorNombre(String parteNombre ) throws ValidacionExcepcion, PrecondicionExcepcion;

	
	
}
