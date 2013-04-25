/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.cpcoriente.sgp.springgwt.pro.client.calendario.ICalendarioServicio;
import com.cpcoriente.sgp.springgwt.pro.server.calendario.entity.CalendarioNoLaboralDO;
import com.cpcoriente.sgp.springgwt.pro.server.calendario.entity.DiaNoLaboralDO;
import com.cpcoriente.sgp.springgwt.pro.server.calendario.interfaces.dao.ICalendarioNoLaboralDAO;
import com.cpcoriente.sgp.springgwt.pro.server.calendario.interfaces.dao.IDiaNoLaboralDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.calendario.interfaces.transfer.ICalendarioNoLaboralTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.calendario.interfaces.transfer.IDiaNoLaboralTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.calendario.objeto.CalendarioNoLaboralTO;
import com.cpcoriente.sgp.springgwt.pro.shared.calendario.objeto.DiaNoLaboralTO;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * @author CPC-04
 *
 */

@Service
public class CalendarioServicioImpl extends RemoteServiceServlet implements ICalendarioServicio {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1636590092832733659L;

	public void init() {

	}
	
	private ICalendarioNoLaboralTransf getCalendarioNoLaboralTransf() {
		return TransfFactory.getInstance().getCalendarioNoLaboralTransf();
	}
	
	private ICalendarioNoLaboralDAO getCalendarioNoLaboralDAO() {
		return DAOFactory.getInstance().getCalendarioNoLaboralDao();
	}
	
	private IDiaNoLaboralTransf getDiaNoLaboralTransf() {
		return TransfFactory.getInstance().getDiaNoLaboralTransf();
	}
	
	private IDiaNoLaboralDAO getDiaNoLaboralDAO() {
		return DAOFactory.getInstance().getDiaNoLaboralDao();
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.calendario.ICalendarioServicio#cargarCalendarioNoLaboral(java.lang.Long)
	 */
	public CalendarioNoLaboralTO cargarCalendarioNoLaboral(Long idCalendarioNoLaboral) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		
		CalendarioNoLaboralTO calendarioNoLaboralTO = null;
		CalendarioNoLaboralDO calendarioNoLaboralDO = null;

		if (idCalendarioNoLaboral == null) {
			throw new ValidacionExcepcion("falta.id.calendario.no.laboral");
		}

		calendarioNoLaboralDO = getCalendarioNoLaboralDAO().cargar(idCalendarioNoLaboral);

		if (calendarioNoLaboralDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.calendario.no.laboral");
		}

		calendarioNoLaboralTO = getCalendarioNoLaboralTransf().transferirDOTO(calendarioNoLaboralDO);

		return calendarioNoLaboralTO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.calendario.ICalendarioServicio#crearCalendarioNoLaboral(com.cpcoriente.sgp.springgwt.pro.shared.calendario.objeto.CalendarioNoLaboralTO)
	 */
	public List<CalendarioNoLaboralTO> crearCalendarioNoLaboral(List<CalendarioNoLaboralTO> calendarioNoLaboralList)	throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		List<CalendarioNoLaboralDO> calendarioNoLaboralListRes = null;
		if (calendarioNoLaboralList != null && calendarioNoLaboralList.size() > 0) {
			for (CalendarioNoLaboralTO calendario : calendarioNoLaboralList) {
				if (calendario.getDescripcion() == null || calendario.getDescripcion().trim().length() == 0 || calendario.getDescripcion().trim() == "") {
					throw new ValidacionExcepcion("falta.descripci\u00f3n.calendario")	;
				}
				if (calendario.getFechaDia() == null ) {
					throw new ValidacionExcepcion("falta.fecha.dia.calendario")	;
				}

				if (calendario.getProyecto() == null) {
					throw new ValidacionExcepcion("falta.proyecto.calendario")	;
				}	
			}

			Set<CalendarioNoLaboralDO> calendarioNoLaboralListAgregar = new LinkedHashSet<CalendarioNoLaboralDO>();


			for (CalendarioNoLaboralTO docTO : calendarioNoLaboralList) {
				CalendarioNoLaboralDO docDO = new CalendarioNoLaboralDO();
				docDO = getCalendarioNoLaboralTransf().transferirTODO(docTO);
				calendarioNoLaboralListAgregar.add(docDO);
			}
			calendarioNoLaboralListRes = getCalendarioNoLaboralDAO().persistir(calendarioNoLaboralListAgregar);


			if (calendarioNoLaboralListRes == null || calendarioNoLaboralListRes.size() != calendarioNoLaboralListAgregar.size()) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.dias.calendario");
			}

			calendarioNoLaboralList.clear();
			for (CalendarioNoLaboralDO docObjeDO : calendarioNoLaboralListRes) {
				CalendarioNoLaboralTO docObjTO = new CalendarioNoLaboralTO();
				docObjTO = getCalendarioNoLaboralTransf().transferirDOTO(docObjeDO);
				calendarioNoLaboralList.add(docObjTO);
			}

		} else {
			throw new ValidacionExcepcion("falta.informaci\u00f3n.dias.calendario")	;
		}


		return calendarioNoLaboralList;


	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.calendario.ICalendarioServicio#modificarCalendarioNoLaboral(com.cpcoriente.sgp.springgwt.pro.shared.calendario.objeto.CalendarioNoLaboralTO)
	 */
	public boolean modificarCalendarioNoLaboral(CalendarioNoLaboralTO calendarioNoLaboral) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		CalendarioNoLaboralDO calendarioNoLaboralProv = getCalendarioNoLaboralTransf().transferirTODO(calendarioNoLaboral);

		try {

			CalendarioNoLaboralDO calendarioNoLaboralMod = getCalendarioNoLaboralDAO().modificar(calendarioNoLaboralProv);
			if(calendarioNoLaboralMod == null){
				throw new RecursoExcepcion("fallo.modificaci\u00f3n.calendario.no.laboral");
			}

			return true;


		} catch (DataAccessException e) {

			String error = "";
			if (e.getMostSpecificCause().getMessage().contains("Duplicate entry")) {
				error = "Este registro ya existe en la base de datos, por favor revise que los campos no est\u00e9n duplicados";
			} else {
				error = "error recursos de base de datos";
			}

			throw new PrecondicionExcepcion(error);
		}
		
		
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.calendario.ICalendarioServicio#eliminarCalendarioNoLaboral(java.lang.Long)
	 */
	public boolean eliminarCalendarioNoLaboral(Long idCalendarioNoLaboral) throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idCalendarioNoLaboral == null) {
			throw new ValidacionExcepcion("falta.identificador.calendario.no.laboral");
		}

		try {

			boolean res = getCalendarioNoLaboralDAO().eliminar(idCalendarioNoLaboral);

			return res;
		} catch (DataAccessException e) {
			String error = "";
			if (e.getMostSpecificCause().getMessage().contains("Cannot delete or update a parent row: a foreign key constraint fails")) {
				error = "Este registro no puede ser eliminado ya que su identificador se encuentra relacionado en otros registros del sistema";
			} else {
				error = "error recursos de base de datos";
			}

			throw new PrecondicionExcepcion(error);
		}
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.calendario.ICalendarioServicio#listarTodoCalendarioPorProyecto(java.lang.Long)
	 */
	public List<CalendarioNoLaboralTO> listarTodoCalendarioPorProyecto(Long idProyecto) throws PrecondicionExcepcion, ValidacionExcepcion {

		if (idProyecto == null) {
			throw new ValidacionExcepcion("falta.identificador.proyecto");
		}

		List<CalendarioNoLaboralDO> calendarioNoLaboralLista = getCalendarioNoLaboralDAO().listarTodoPorProyecto(idProyecto);

		if (calendarioNoLaboralLista == null || calendarioNoLaboralLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.calendario.no.laboral");
		}

		CalendarioNoLaboralTO calendarioNoLaboralTO = null;
		List<CalendarioNoLaboralTO> calendarioNoLaboralTOLista = new ArrayList<CalendarioNoLaboralTO>(calendarioNoLaboralLista.size());
		for (CalendarioNoLaboralDO calendarioNoLaboral : calendarioNoLaboralLista) {

			calendarioNoLaboralTO = getCalendarioNoLaboralTransf().transferirDOTO(calendarioNoLaboral);
			calendarioNoLaboralTOLista.add(calendarioNoLaboralTO);
		}

		return calendarioNoLaboralTOLista;
		
		
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.calendario.ICalendarioServicio#seleccionPorRangofechasCalendario(java.lang.Long, java.util.Date, java.util.Date)
	 */
	public List<CalendarioNoLaboralTO> seleccionPorRangofechasCalendario(Long idProyecto, Date fechaInicio, Date fechaFin) throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idProyecto == null) {
			throw new ValidacionExcepcion("falta.identificador.proyecto");
		}

		if (fechaInicio == null || fechaFin == null) {
			throw new ValidacionExcepcion("falta.fecha.inicio.fin");
		}

		if ((fechaInicio.after(fechaFin))) {
			throw new ValidacionExcepcion("error.rango.fechas");
		}
		
		List<CalendarioNoLaboralDO> calendarioNoLaboralLista = getCalendarioNoLaboralDAO().seleccionPorRangofechas(idProyecto, fechaInicio, fechaFin);

		if (calendarioNoLaboralLista == null || calendarioNoLaboralLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.calendario.no.laboral");
		}

		CalendarioNoLaboralTO calendarioNoLaboralTO = null;
		List<CalendarioNoLaboralTO> calendarioNoLaboralTOLista = new ArrayList<CalendarioNoLaboralTO>(calendarioNoLaboralLista.size());
		for (CalendarioNoLaboralDO calendarioNoLaboral : calendarioNoLaboralLista) {

			calendarioNoLaboralTO = getCalendarioNoLaboralTransf().transferirDOTO(calendarioNoLaboral);
			calendarioNoLaboralTOLista.add(calendarioNoLaboralTO);
		}

		return calendarioNoLaboralTOLista;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.calendario.ICalendarioServicio#cargarDiaNoLaboral(java.lang.Long)
	 */
	public DiaNoLaboralTO cargarDiaNoLaboral(Long idDiaNoLaboral) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		DiaNoLaboralTO diaNoLaboralTO = null;
		DiaNoLaboralDO diaNoLaboralDO = null;

		if (idDiaNoLaboral == null) {
			throw new ValidacionExcepcion("falta.id.dia.no.laboral");
		}

		diaNoLaboralDO = getDiaNoLaboralDAO().cargar(idDiaNoLaboral);

		if (diaNoLaboralDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.dia.no.laboral");
		}

		diaNoLaboralTO = getDiaNoLaboralTransf().transferirDOTO(diaNoLaboralDO);

		return diaNoLaboralTO;
		
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.calendario.ICalendarioServicio#crearDiaNoLaboral(com.cpcoriente.sgp.springgwt.pro.shared.calendario.objeto.DiaNoLaboralTO)
	 */
	public List<DiaNoLaboralTO> crearDiaNoLaboral(List<DiaNoLaboralTO> diaNoLaboralList) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {


		List<DiaNoLaboralDO> diaNoLaboralListRes = null;
		if (diaNoLaboralList != null && diaNoLaboralList.size() > 0) {
			for (DiaNoLaboralTO dia : diaNoLaboralList) {
				if (dia.getDescripcion() == null || dia.getDescripcion().trim().length() == 0 || dia.getDescripcion().trim() == "") {
					throw new ValidacionExcepcion("falta.descripci\u00f3n.dia")	;
				}
				if (dia.getFechaDia() == null ) {
					throw new ValidacionExcepcion("falta.fecha.dia")	;
				}

				if (dia.getEmpresa() == null) {
					throw new ValidacionExcepcion("falta.empresa.dia")	;
				}	
			}

			Set<DiaNoLaboralDO> diaNoLaboralListAgregar = new LinkedHashSet<DiaNoLaboralDO>();


			for (DiaNoLaboralTO docTO : diaNoLaboralList) {
				DiaNoLaboralDO docDO = new DiaNoLaboralDO();
				docDO = getDiaNoLaboralTransf().transferirTODO(docTO);
				diaNoLaboralListAgregar.add(docDO);
			}
			diaNoLaboralListRes = getDiaNoLaboralDAO().persistir(diaNoLaboralListAgregar);


			if (diaNoLaboralListRes == null || diaNoLaboralListRes.size() != diaNoLaboralListAgregar.size()) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.dias");
			}

			diaNoLaboralList.clear();
			for (DiaNoLaboralDO docObjeDO : diaNoLaboralListRes) {
				DiaNoLaboralTO docObjTO = new DiaNoLaboralTO();
				docObjTO = getDiaNoLaboralTransf().transferirDOTO(docObjeDO);
				diaNoLaboralList.add(docObjTO);
			}

		} else {
			throw new ValidacionExcepcion("falta.informaci\u00f3n.dias")	;
		}


		return diaNoLaboralList;

	
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.calendario.ICalendarioServicio#modificarDiaNoLaboral(com.cpcoriente.sgp.springgwt.pro.shared.calendario.objeto.DiaNoLaboralTO)
	 */
	public boolean modificarDiaNoLaboral(DiaNoLaboralTO diaNoLaboral) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		DiaNoLaboralDO diaNoLaboralProv = getDiaNoLaboralTransf().transferirTODO(diaNoLaboral);

		try {

			DiaNoLaboralDO diaNoLaboralMod = getDiaNoLaboralDAO().modificar(diaNoLaboralProv);
			if(diaNoLaboralMod == null){
				throw new RecursoExcepcion("fallo.modificaci\u00f3n.dia.no.laboral");
			}

			return true;


		} catch (DataAccessException e) {

			String error = "";
			if (e.getMostSpecificCause().getMessage().contains("Duplicate entry")) {
				error = "Este registro ya existe en la base de datos, por favor revise que los campos no est\u00e9n duplicados";
			} else {
				error = "error recursos de base de datos";
			}

			throw new PrecondicionExcepcion(error);
		}
		
		
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.calendario.ICalendarioServicio#eliminarDiaNoLaboral(java.lang.Long)
	 */
	public boolean eliminarDiaNoLaboral(Long idDiaNoLaboral) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idDiaNoLaboral == null) {
			throw new ValidacionExcepcion("falta.identificador.dia.nolaboral");
		}

		try {

			boolean res = getDiaNoLaboralDAO().eliminar(idDiaNoLaboral);

			return res;
		} catch (DataAccessException e) {
			String error = "";
			if (e.getMostSpecificCause().getMessage().contains("Cannot delete or update a parent row: a foreign key constraint fails")) {
				error = "Este registro no puede ser eliminado ya que su identificador se encuentra relacionado en otros registros del sistema";
			} else {
				error = "error recursos de base de datos";
			}

			throw new PrecondicionExcepcion(error);
		}
		
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.calendario.ICalendarioServicio#listarTodoDiaPorEmpresa(java.lang.Long)
	 */
	public List<DiaNoLaboralTO> listarTodoDiaPorEmpresa(Long idEmpresa) throws PrecondicionExcepcion, ValidacionExcepcion {

		if (idEmpresa == null) {
			throw new ValidacionExcepcion("falta.identificador.empresa");
		}

		List<DiaNoLaboralDO> diaNoLaboralLista = getDiaNoLaboralDAO().listarTodoPorEmpresa(idEmpresa);

		if (diaNoLaboralLista == null || diaNoLaboralLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.dia.no.laboral");
		}

		DiaNoLaboralTO diaNoLaboralTO = null;
		List<DiaNoLaboralTO> diaNoLaboralTOLista = new ArrayList<DiaNoLaboralTO>(diaNoLaboralLista.size());
		for (DiaNoLaboralDO diaNoLaboral : diaNoLaboralLista) {

			diaNoLaboralTO = getDiaNoLaboralTransf().transferirDOTO(diaNoLaboral);
			diaNoLaboralTOLista.add(diaNoLaboralTO);
		}

		return diaNoLaboralTOLista;
		
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.calendario.ICalendarioServicio#seleccionPorRangofechasDia(java.lang.Long, java.util.Date, java.util.Date)
	 */
	public List<DiaNoLaboralTO> seleccionPorRangofechasDia(Long idEmpresa, Date fechaInicio, Date fechaFin) throws PrecondicionExcepcion, ValidacionExcepcion {
		if (idEmpresa == null) {
			throw new ValidacionExcepcion("falta.identificador.empresa");
		}
		
		if (fechaInicio == null || fechaFin == null) {
			throw new ValidacionExcepcion("falta.fecha.inicio.fin");
		}

		if ((fechaInicio.after(fechaFin))) {
			throw new ValidacionExcepcion("error.rango.fechas");
		}
		List<DiaNoLaboralDO> diaNoLaboralLista = getDiaNoLaboralDAO().seleccionPorRangofechas(idEmpresa, fechaInicio, fechaFin);

		if (diaNoLaboralLista == null || diaNoLaboralLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.dia.no.laboral");
		}

		DiaNoLaboralTO diaNoLaboralTO = null;
		List<DiaNoLaboralTO> diaNoLaboralTOLista = new ArrayList<DiaNoLaboralTO>(diaNoLaboralLista.size());
		for (DiaNoLaboralDO diaNoLaboral : diaNoLaboralLista) {

			diaNoLaboralTO = getDiaNoLaboralTransf().transferirDOTO(diaNoLaboral);
			diaNoLaboralTOLista.add(diaNoLaboralTO);
		}

		return diaNoLaboralTOLista;
	}

	
}
