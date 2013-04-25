package com.cpcoriente.sgp.springgwt.pro.client.contabilidad;

import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.ImpuestoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.MovimientoContableDetalleTO;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.MovimientoContableTO;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.PucPorProyectoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.PucTO;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


@RemoteServiceRelativePath("contabilidad")
public interface IContabilidadServicio extends RemoteService {

	
	public abstract ImpuestoTO cargarImpuesto(Long idImpuesto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long persistirImpuesto(ImpuestoTO impuesto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarImpuesto(ImpuestoTO impuesto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarImpuesto(Long idImpuesto) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<ImpuestoTO> listarTodoImpuesto(Long idEmpresa) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<ImpuestoTO> seleccionPorNombreImpuesto(Long idEmpresa, String parteNombre) throws ValidacionExcepcion, PrecondicionExcepcion;
	
	public abstract MovimientoContableTO cargarMovimientoContable(Long idMovimientoContable) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long persistirMovimientoContable(MovimientoContableTO movimientoContable) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract List<MovimientoContableTO> listarTodoMovimientoContablePorProyecto(Long idProyecto) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<MovimientoContableTO> seleccionPorCuentaMovimientoContable(Long idProyecto, Long idCuentaPuc) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<MovimientoContableTO> seleccionPorRangofechasMovimientoContable(Long idProyecto, Date fechaInicio, Date fechaFin) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<MovimientoContableTO> seleccionPorEjecucionMovimientoContable(Long idProyecto, Long idEjecPres) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<MovimientoContableTO> seleccionPorRecursoDetMovimientoContable(Long idProyecto, Long idRecursoDet) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract MovimientoContableDetalleTO cargarMovimientoContableDetalle(Long idMovimientoContableDetalle) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	
	
	public abstract PucTO cargarPUC(Long idPuc) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long persistirPUC(PucTO puc) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarPUC(PucTO puc) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarPUC(Long idPuc) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<PucTO> listarTodoPUC(Long idEntidad) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<PucTO> seleccionPorNombreCodigoPUC(Long idEntidad, String parteNombreCodigo) throws ValidacionExcepcion, PrecondicionExcepcion;
	
	public abstract PucPorProyectoTO cargarPucPorProyecto(Long idPucPorProyecto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract List<PucPorProyectoTO> persistirPucPorProyecto(List<PucPorProyectoTO> pucPorProyectoList) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarPucPorProyecto(Long idPucPorProyecto) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<PucPorProyectoTO> listarTodoPucPorProyecto(Long idProyecto) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<PucPorProyectoTO> seleccionPorNombreCodigoPucPorProyecto(Long idProyecto, String parteNombreCodigo) throws ValidacionExcepcion, PrecondicionExcepcion;
	
}
