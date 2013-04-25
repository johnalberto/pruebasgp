package com.cpcoriente.sgp.springgwt.pro.client.ejecucion;

import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.objeto.DocEjecucionPresupuestoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.objeto.EjecucionPresupuestoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("ejecucion")
public interface IEjecucionServicio extends RemoteService {
	
	
	
	public abstract DocEjecucionPresupuestoTO cargarDocEjecucion(Long idDocEjecucionPresupuesto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract List<DocEjecucionPresupuestoTO> crearDocEjecucion(List<DocEjecucionPresupuestoTO> docEjecucionPresupuestoList) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarDocEjecucion(DocEjecucionPresupuestoTO docEjecucionPresupuesto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarDocEjecucion(List<Long> idDocEjecucionPresupuestoLista) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<DocEjecucionPresupuestoTO> seleccionDocPorEjecucionPresupuesto(Long idEjecucionPresupuesto) throws ValidacionExcepcion, PrecondicionExcepcion;
	
	
	public abstract EjecucionPresupuestoTO cargarEjecucion(Long idEjecucionPresupuesto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearEjecucion(EjecucionPresupuestoTO ejecucionPresupuesto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarEjecucion(EjecucionPresupuestoTO ejecucionPresupuesto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract List<EjecucionPresupuestoTO> seleccionGeneralEjecucion(Long idTercero, int tipoComprobante, String numComprobante, Date fechaRegIni, 
			Date fechaRegFin, Date fechaEjecIni, Date fechaEjecFin, Boolean aprobado, Boolean ejecutado, Long idRecurso, Long idProyectoEntidad) throws ValidacionExcepcion, PrecondicionExcepcion;

}
