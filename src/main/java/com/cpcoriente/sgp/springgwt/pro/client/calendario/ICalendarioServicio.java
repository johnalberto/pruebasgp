package com.cpcoriente.sgp.springgwt.pro.client.calendario;

import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.calendario.objeto.CalendarioNoLaboralTO;
import com.cpcoriente.sgp.springgwt.pro.shared.calendario.objeto.DiaNoLaboralTO;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


@RemoteServiceRelativePath("calendario")
public interface ICalendarioServicio extends RemoteService {
	
	
	public abstract CalendarioNoLaboralTO cargarCalendarioNoLaboral(Long idCalendarioNoLaboral) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract List<CalendarioNoLaboralTO> crearCalendarioNoLaboral(List<CalendarioNoLaboralTO> calendarioNoLaboralList) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarCalendarioNoLaboral(CalendarioNoLaboralTO calendarioNoLaboral) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarCalendarioNoLaboral(Long idCalendarioNoLaboral)  throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<CalendarioNoLaboralTO> listarTodoCalendarioPorProyecto(Long idProyecto) throws PrecondicionExcepcion, ValidacionExcepcion;
	public abstract List<CalendarioNoLaboralTO> seleccionPorRangofechasCalendario(Long idProyecto, Date fechaInicio, Date fechaFin) throws ValidacionExcepcion, PrecondicionExcepcion;

	
	public abstract DiaNoLaboralTO cargarDiaNoLaboral(Long idDiaNoLaboral) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract List<DiaNoLaboralTO> crearDiaNoLaboral(List<DiaNoLaboralTO> diaNoLaboralList) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarDiaNoLaboral(DiaNoLaboralTO diaNoLaboral) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarDiaNoLaboral(Long idDiaNoLaboral) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<DiaNoLaboralTO> listarTodoDiaPorEmpresa(Long idEmpresa) throws PrecondicionExcepcion, ValidacionExcepcion;
	public abstract List<DiaNoLaboralTO> seleccionPorRangofechasDia(Long idEmpresa, Date fechaInicio, Date fechaFin) throws PrecondicionExcepcion, ValidacionExcepcion;
	
	
}
