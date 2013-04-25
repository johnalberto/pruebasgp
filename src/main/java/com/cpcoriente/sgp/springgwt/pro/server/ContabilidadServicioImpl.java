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

import com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio;
import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.ImpuestoDO;
import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.MovimientoContableDO;
import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.MovimientoContableDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.PucDO;
import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.PucPorProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.interfaces.dao.IImpuestoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.interfaces.dao.IMovimientoContableDAO;
import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.interfaces.dao.IMovimientoContableDetalleDAO;
import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.interfaces.dao.IPucDAO;
import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.interfaces.dao.IPucPorProyectoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IImpuestoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IMovimientoContableDetalleTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IMovimientoContableTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IPucPorProyectoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IPucTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.ImpuestoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.MovimientoContableDetalleTO;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.MovimientoContableTO;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.PucPorProyectoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.PucTO;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * @author CPC-04
 *
 */

@Service
public class ContabilidadServicioImpl extends RemoteServiceServlet implements IContabilidadServicio {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7664896226772555676L;

	
	
	public void init() {

	}
	
	private IImpuestoTransf getImpuestoTransf() {
		return TransfFactory.getInstance().getImpuestoTransf();
	}
	
	private IImpuestoDAO getImpuestoDAO() {
		return DAOFactory.getInstance().getImpuestoDao();
	}
	
	private IMovimientoContableTransf getMovimientoContableTransf() {
		return TransfFactory.getInstance().getMovimientoContableTransf();
	}
	
	private IMovimientoContableDAO getMovimientoContableDAO() {
		return DAOFactory.getInstance().getMovimientoContableDao();
	}
	
	private IMovimientoContableDetalleTransf getMovimientoContableDetalleTransf() {
		return TransfFactory.getInstance().getMovimientoContableDetalleTransf();
	}
	
	private IMovimientoContableDetalleDAO getMovimientoContableDetalleDAO() {
		return DAOFactory.getInstance().getMovimientoContableDetalleDao();
	}
	
	
	private IPucTransf getPucTransf() {
		return TransfFactory.getInstance().getPucTransf();
	}
	
	private IPucDAO getPucDAO() {
		return DAOFactory.getInstance().getPucDao();
	}
	
	private IPucPorProyectoTransf getPucPorProyectoTransf() {
		return TransfFactory.getInstance().getPucPorProyectoTransf();
	}
	
	private IPucPorProyectoDAO getPucPorProyectoDAO() {
		return DAOFactory.getInstance().getPucPorProyectoDao();
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#cargarImpuesto(java.lang.Long)
	 */
	public ImpuestoTO cargarImpuesto(Long idImpuesto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		ImpuestoTO impuestoTO = null;
		ImpuestoDO impuestoDO = null;

		if (idImpuesto == null) {
			throw new ValidacionExcepcion("falta.id.impuesto");
		}

		impuestoDO = getImpuestoDAO().cargar(idImpuesto);

		if (impuestoDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.impuesto");
		}

		impuestoTO = getImpuestoTransf().transferirDOTO(impuestoDO);

		return impuestoTO;
		
		
	}

	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#persistirImpuesto(com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.ImpuestoTO)
	 */
	public Long persistirImpuesto(ImpuestoTO impuesto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(impuesto == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.impuesto")	;
		}

		ImpuestoDO impuestoProv = null;

		Long idRegistrado = null;

		impuestoProv = getImpuestoTransf().transferirTODO(impuesto);

		try {

			ImpuestoDO impuestoReg = getImpuestoDAO().persistir(impuestoProv);
			if (impuestoReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.impuesto");
			}

			idRegistrado = impuestoReg.getId();	

			return idRegistrado;


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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#modificarImpuesto(com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.ImpuestoTO)
	 */
	public boolean modificarImpuesto(ImpuestoTO impuesto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		
		ImpuestoDO impuestoProv = getImpuestoTransf().transferirTODO(impuesto);

		try {

			ImpuestoDO impuestoMod = getImpuestoDAO().modificar(impuestoProv);
			if(impuestoMod == null){
				throw new RecursoExcepcion("fallo.modificaci\u00f3n.impuesto");
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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#eliminarImpuesto(java.lang.Long)
	 */
	public boolean eliminarImpuesto(Long idImpuesto) throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idImpuesto == null) {
			throw new ValidacionExcepcion("falta.identificador.impuesto");
		}

		try {

			boolean res = getImpuestoDAO().eliminar(idImpuesto);

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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#listarTodoImpuesto(java.lang.Long)
	 */
	public List<ImpuestoTO> listarTodoImpuesto(Long idEmpresa) throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idEmpresa == null) {
			throw new ValidacionExcepcion("falta.identificador.empresa");
		}

		List<ImpuestoDO> impuestoLista = getImpuestoDAO().listarTodo(idEmpresa);

		if (impuestoLista == null || impuestoLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.impuesto");
		}

		ImpuestoTO impuestoTO = null;
		List<ImpuestoTO> impuestoTOLista = new ArrayList<ImpuestoTO>(impuestoLista.size());
		for (ImpuestoDO impuesto : impuestoLista) {

			impuestoTO = getImpuestoTransf().transferirDOTO(impuesto);
			impuestoTOLista.add(impuestoTO);
		}

		return impuestoTOLista;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#seleccionPorNombreImpuesto(java.lang.Long, java.lang.String)
	 */
	public List<ImpuestoTO> seleccionPorNombreImpuesto(Long idEmpresa, String parteNombre) throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idEmpresa == null) {
			throw new ValidacionExcepcion("falta.identificador.empresa");
		}

		if (parteNombre == null || parteNombre.trim().isEmpty()) {
			throw new ValidacionExcepcion("falta.nombre.codigo.impuesto");
		}

		List<ImpuestoDO> impuestoLista = getImpuestoDAO().seleccionPorNombre(idEmpresa, parteNombre);

		if (impuestoLista == null || impuestoLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.impuesto");
		}

		ImpuestoTO impuestoTO = null;
		List<ImpuestoTO> impuestoTOLista = new ArrayList<ImpuestoTO>(impuestoLista.size());
		for (ImpuestoDO impuesto : impuestoLista) {

			impuestoTO = getImpuestoTransf().transferirDOTO(impuesto);
			impuestoTOLista.add(impuestoTO);
		}

		return impuestoTOLista;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#cargarMovimientoContable(java.lang.Long)
	 */
	public MovimientoContableTO cargarMovimientoContable(Long idMovimientoContable) throws ValidacionExcepcion,	RecursoExcepcion, PrecondicionExcepcion {
		
		MovimientoContableTO movimientoContableTO = null;
		MovimientoContableDO movimientoContableDO = null;

		if (idMovimientoContable == null) {
			throw new ValidacionExcepcion("falta.id.movimiento.contable");
		}

		movimientoContableDO = getMovimientoContableDAO().cargar(idMovimientoContable);

		if (movimientoContableDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.movimiento.contable");
		}

		movimientoContableTO = getMovimientoContableTransf().transferirDOTO(movimientoContableDO);

		return movimientoContableTO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#persistirMovimientoContable(java.util.List)
	 */
	public Long persistirMovimientoContable(MovimientoContableTO movimientoContable) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		
		if(movimientoContable == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.movimiento.contable")	;
		}

		if(movimientoContable.getMovContDetalleLista() == null || movimientoContable.getMovContDetalleLista().size() <= 0 ){
			throw new ValidacionExcepcion("falta.detalles.movimiento.contable")	;
		}
		
		MovimientoContableDO movimientoContableProv = null;

		Long idRegistrado = null;

		movimientoContableProv = getMovimientoContableTransf().transferirTODO(movimientoContable);

		try {

			MovimientoContableDO movimientoContableReg = getMovimientoContableDAO().persistir(movimientoContableProv);
			if (movimientoContableReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.movimiento.contable");
			}

			idRegistrado = movimientoContableReg.getId();	

			
			boolean detallesRes = getMovimientoContableDetalleDAO().persistir(movimientoContableProv.getMovContDetalleSet());
			
			if (detallesRes == false ) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.movimiento.contable.detalles");
			}
			
			return idRegistrado;


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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#listarTodoMovimientoContablePorProyecto(java.lang.Long)
	 */
	public List<MovimientoContableTO> listarTodoMovimientoContablePorProyecto(Long idProyecto) throws ValidacionExcepcion, PrecondicionExcepcion {


		if (idProyecto == null) {
			throw new ValidacionExcepcion("falta.identificador.proyecto");
		}
		
		List<MovimientoContableDO> movimientoContableLista = getMovimientoContableDAO().listarTodoPorProyecto(idProyecto);

		if (movimientoContableLista == null || movimientoContableLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.movimiento.contable");
		}

		MovimientoContableTO movimientoContableTO = null;
		List<MovimientoContableTO> movimientoContableTOLista = new ArrayList<MovimientoContableTO>(movimientoContableLista.size());
		for (MovimientoContableDO movimientoContable : movimientoContableLista) {

			movimientoContableTO = getMovimientoContableTransf().transferirDOTO(movimientoContable);
			movimientoContableTOLista.add(movimientoContableTO);
		}

		return movimientoContableTOLista;
		
	}

	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#seleccionPorCuentaMovimientoContable(java.lang.Long, java.lang.Long)
	 */
	public List<MovimientoContableTO> seleccionPorCuentaMovimientoContable(Long idProyecto, Long idCuentaPuc) throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idProyecto == null) {
			throw new ValidacionExcepcion("falta.identificador.proyecto");
		}

		if (idCuentaPuc == null) {
			throw new ValidacionExcepcion("falta.identificador.cuenta.contable");
		}

		List<MovimientoContableDO> movimientoContableLista = getMovimientoContableDAO().seleccionPorCuenta(idProyecto, idCuentaPuc);

		if (movimientoContableLista == null || movimientoContableLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.movimiento.contable");
		}

		MovimientoContableTO movimientoContableTO = null;
		List<MovimientoContableTO> movimientoContableTOLista = new ArrayList<MovimientoContableTO>(movimientoContableLista.size());
		for (MovimientoContableDO movimientoContable : movimientoContableLista) {

			movimientoContableTO = getMovimientoContableTransf().transferirDOTO(movimientoContable);
			movimientoContableTOLista.add(movimientoContableTO);
		}

		return movimientoContableTOLista;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#seleccionPorRangofechasMovimientoContable(java.lang.Long, java.util.Date, java.util.Date)
	 */
	public List<MovimientoContableTO> seleccionPorRangofechasMovimientoContable(Long idProyecto, Date fechaInicio, Date fechaFin)	throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idProyecto == null) {
			throw new ValidacionExcepcion("falta.identificador.proyecto");
		}

		if (fechaInicio == null || fechaFin == null) {
			throw new ValidacionExcepcion("falta.fecha.inicio.fin");
		}

		if ((fechaInicio.after(fechaFin))) {
			throw new ValidacionExcepcion("error.rango.fechas");
		}

		List<MovimientoContableDO> movimientoContableLista = getMovimientoContableDAO().seleccionPorRangofechas(idProyecto, fechaInicio, fechaFin);

		if (movimientoContableLista == null || movimientoContableLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.movimiento.contable");
		}

		MovimientoContableTO movimientoContableTO = null;
		List<MovimientoContableTO> movimientoContableTOLista = new ArrayList<MovimientoContableTO>(movimientoContableLista.size());
		for (MovimientoContableDO movimientoContable : movimientoContableLista) {

			movimientoContableTO = getMovimientoContableTransf().transferirDOTO(movimientoContable);
			movimientoContableTOLista.add(movimientoContableTO);
		}

		return movimientoContableTOLista;
		
		
	}

	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#seleccionPorEjecucionMovimientoContable(java.lang.Long, java.lang.Long)
	 */
	public List<MovimientoContableTO> seleccionPorEjecucionMovimientoContable(Long idProyecto, Long idEjecPres) throws ValidacionExcepcion,	PrecondicionExcepcion {


		if (idProyecto == null) {
			throw new ValidacionExcepcion("falta.identificador.proyecto");
		}

		if (idEjecPres == null) {
			throw new ValidacionExcepcion("falta.identificador.ejecuci\u00f3n.presupuesto");
		}

		List<MovimientoContableDO> movimientoContableLista = getMovimientoContableDAO().seleccionPorEjecucion(idProyecto, idEjecPres);
		if (movimientoContableLista == null || movimientoContableLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.movimiento.contable");
		}

		MovimientoContableTO movimientoContableTO = null;
		List<MovimientoContableTO> movimientoContableTOLista = new ArrayList<MovimientoContableTO>(movimientoContableLista.size());
		for (MovimientoContableDO movimientoContable : movimientoContableLista) {

			movimientoContableTO = getMovimientoContableTransf().transferirDOTO(movimientoContable);
			movimientoContableTOLista.add(movimientoContableTO);
		}

		return movimientoContableTOLista;
		
	}

	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#seleccionPorRecursoDetMovimientoContable(java.lang.Long, java.lang.Long)
	 */
	public List<MovimientoContableTO> seleccionPorRecursoDetMovimientoContable(Long idProyecto, Long idRecursoDet) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idProyecto == null) {
			throw new ValidacionExcepcion("falta.identificador.proyecto");
		}

		if (idRecursoDet == null) {
			throw new ValidacionExcepcion("falta.identificador.ejecuci\u00f3n.presupuesto");
		}

		List<MovimientoContableDO> movimientoContableLista = getMovimientoContableDAO().seleccionPorRecursoDet(idProyecto, idRecursoDet);
		if (movimientoContableLista == null || movimientoContableLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.movimiento.contable");
		}

		MovimientoContableTO movimientoContableTO = null;
		List<MovimientoContableTO> movimientoContableTOLista = new ArrayList<MovimientoContableTO>(movimientoContableLista.size());
		for (MovimientoContableDO movimientoContable : movimientoContableLista) {

			movimientoContableTO = getMovimientoContableTransf().transferirDOTO(movimientoContable);
			movimientoContableTOLista.add(movimientoContableTO);
		}

		return movimientoContableTOLista;
		
		
	}

	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#cargarPUC(java.lang.Long)
	 */
	public PucTO cargarPUC(Long idPuc) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		PucTO pucTO = null;
		PucDO pucDO = null;

		if (idPuc == null) {
			throw new ValidacionExcepcion("falta.id.puc");
		}

		pucDO = getPucDAO().cargar(idPuc);

		if (pucDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.puc");
		}

		pucTO = getPucTransf().transferirDOTO(pucDO);

		return pucTO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#persistirPUC(com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.PucDO)
	 */
	public Long persistirPUC(PucTO puc) throws ValidacionExcepcion,	RecursoExcepcion, PrecondicionExcepcion {
		
		
		if(puc == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.puc")	;
		}

		PucDO pucProv = null;

		Long idRegistrado = null;

		pucProv = getPucTransf().transferirTODO(puc);

		try {

			PucDO pucReg = getPucDAO().persistir(pucProv);
			if (pucReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.puc");
			}

			idRegistrado = pucReg.getId();
						

			return idRegistrado;


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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#modificarPUC(com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.PucTO)
	 */
	public boolean modificarPUC(PucTO puc) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		PucDO pucProv = getPucTransf().transferirTODO(puc);

		try {

			PucDO pucMod = getPucDAO().modificar(pucProv);
			if(pucMod == null){
				throw new RecursoExcepcion("fallo.modificaci\u00f3n.puc");
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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#eliminarPUC(java.lang.Long)
	 */
	public boolean eliminarPUC(Long idPuc) throws ValidacionExcepcion, 	PrecondicionExcepcion {
		
		if (idPuc == null) {
			throw new ValidacionExcepcion("falta.identificador.puc");
		}

		try {

			boolean res = getPucDAO().eliminar(idPuc);

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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#listarTodoPUC(java.lang.Long)
	 */
	public List<PucTO> listarTodoPUC(Long idEntidad) throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idEntidad == null) {
			throw new ValidacionExcepcion("falta.identificador.entidad");
		}

		List<PucDO> pucLista = getPucDAO().listarTodo(idEntidad);

		if (pucLista == null || pucLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.puc");
		}

		PucTO pucTO = null;
		List<PucTO> pucTOLista = new ArrayList<PucTO>(pucLista.size());
		for (PucDO puc : pucLista) {

			pucTO = getPucTransf().transferirDOTO(puc);
			pucTOLista.add(pucTO);
		}

		return pucTOLista;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#seleccionPorNombreCodigoPUC(java.lang.Long, java.lang.String)
	 */
	public List<PucTO> seleccionPorNombreCodigoPUC(Long idEntidad, String parteNombreCodigo) throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idEntidad == null) {
			throw new ValidacionExcepcion("falta.identificador.entidad");
		}
		
		if (parteNombreCodigo == null || parteNombreCodigo.trim().isEmpty()) {
			throw new ValidacionExcepcion("falta.nombre.codigo.cuenta");
		}

		List<PucDO> pucLista = getPucDAO().seleccionPorNombreCodigo(idEntidad, parteNombreCodigo);

		if (pucLista == null || pucLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.puc");
		}

		PucTO pucTO = null;
		List<PucTO> pucTOLista = new ArrayList<PucTO>(pucLista.size());
		for (PucDO puc : pucLista) {

			pucTO = getPucTransf().transferirDOTO(puc);
			pucTOLista.add(pucTO);
		}

		return pucTOLista;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#cargarPucPorProyecto(java.lang.Long)
	 */
	public PucPorProyectoTO cargarPucPorProyecto(Long idPucPorProyecto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		PucPorProyectoTO pucPorProyectoTO = null;
		PucPorProyectoDO pucPorProyectoDO = null;

		if (idPucPorProyecto == null) {
			throw new ValidacionExcepcion("falta.id.puc.proyecto");
		}

		pucPorProyectoDO = getPucPorProyectoDAO().cargar(idPucPorProyecto);

		if (pucPorProyectoDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.puc.proyecto");
		}

		pucPorProyectoTO = getPucPorProyectoTransf().transferirDOTO(pucPorProyectoDO);

		return pucPorProyectoTO;
	}

	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#persistirPucPorProyecto(java.util.List)
	 */
	public List<PucPorProyectoTO> persistirPucPorProyecto(List<PucPorProyectoTO> pucPorProyectoList) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		List<PucPorProyectoDO> pucPorProyectoListRes = null;
		if (pucPorProyectoList != null && pucPorProyectoList.size() > 0) {
			for (PucPorProyectoTO pucProy : pucPorProyectoList) {
				if (pucProy.getCuentaPuc() == null) {
					throw new ValidacionExcepcion("falta.cuenta.puc")	;
				}
				if (pucProy.getProyecto() == null ) {
					throw new ValidacionExcepcion("falta.proyecto")	;
				}

			}

			Set<PucPorProyectoDO> pucPorProyectoListAgregar = new LinkedHashSet<PucPorProyectoDO>();


			for (PucPorProyectoTO docTO : pucPorProyectoList) {
				PucPorProyectoDO docDO = new PucPorProyectoDO();
				docDO = getPucPorProyectoTransf().transferirTODO(docTO);
				pucPorProyectoListAgregar.add(docDO);
			}
			pucPorProyectoListRes = getPucPorProyectoDAO().persistir(pucPorProyectoListAgregar);


			if (pucPorProyectoListRes == null || pucPorProyectoListRes.size() != pucPorProyectoListAgregar.size()) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.puc.proyecto");
			}

			pucPorProyectoList.clear();
			for (PucPorProyectoDO docObjeDO : pucPorProyectoListRes) {
				PucPorProyectoTO docObjTO = new PucPorProyectoTO();
				docObjTO = getPucPorProyectoTransf().transferirDOTO(docObjeDO);
				pucPorProyectoList.add(docObjTO);
			}

		} else {
			throw new ValidacionExcepcion("falta.informaci\u00f3n.puc.proyecto")	;
		}


		return pucPorProyectoList;
		
	}

	

	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#eliminarPucPorProyecto(java.lang.Long)
	 */
	public boolean eliminarPucPorProyecto(Long idPucPorProyecto) throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idPucPorProyecto == null) {
			throw new ValidacionExcepcion("falta.identificador.puc.proyecto");
		}

		try {

			boolean res = getPucPorProyectoDAO().eliminar(idPucPorProyecto);

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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#listarTodoPucPorProyecto(java.lang.Long)
	 */
	public List<PucPorProyectoTO> listarTodoPucPorProyecto(Long idProyecto) throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idProyecto == null) {
			throw new ValidacionExcepcion("falta.identificador.proyecto");
		}
		
		List<PucPorProyectoDO> pucPorProyectoLista = getPucPorProyectoDAO().listarTodoPorProyecto(idProyecto);

		if (pucPorProyectoLista == null || pucPorProyectoLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.puc.proyecto");
		}

		PucPorProyectoTO pucPorProyectoTO = null;
		List<PucPorProyectoTO> pucPorProyectoTOLista = new ArrayList<PucPorProyectoTO>(pucPorProyectoLista.size());
		for (PucPorProyectoDO pucPorProyecto : pucPorProyectoLista) {

			pucPorProyectoTO = getPucPorProyectoTransf().transferirDOTO(pucPorProyecto);
			pucPorProyectoTOLista.add(pucPorProyectoTO);
		}

		return pucPorProyectoTOLista;
		
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#seleccionPorNombreCodigoPucPorProyecto(java.lang.Long, java.lang.String)
	 */
	public List<PucPorProyectoTO> seleccionPorNombreCodigoPucPorProyecto(Long idProyecto, String parteNombreCodigo)	throws ValidacionExcepcion, PrecondicionExcepcion {


		if (idProyecto == null) {
			throw new ValidacionExcepcion("falta.identificador.proyecto");
		}
		
		if (parteNombreCodigo == null || parteNombreCodigo.trim().isEmpty()) {
			throw new ValidacionExcepcion("falta.nombre.codigo.cuenta");
		}
		
		List<PucPorProyectoDO> pucPorProyectoLista = getPucPorProyectoDAO().seleccionPorNombreCodigo(idProyecto, parteNombreCodigo);

		if (pucPorProyectoLista == null || pucPorProyectoLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.puc.proyecto");
		}

		PucPorProyectoTO pucPorProyectoTO = null;
		List<PucPorProyectoTO> pucPorProyectoTOLista = new ArrayList<PucPorProyectoTO>(pucPorProyectoLista.size());
		for (PucPorProyectoDO pucPorProyecto : pucPorProyectoLista) {

			pucPorProyectoTO = getPucPorProyectoTransf().transferirDOTO(pucPorProyecto);
			pucPorProyectoTOLista.add(pucPorProyectoTO);
		}

		return pucPorProyectoTOLista;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio#cargarMovimientoContableDetalle(java.lang.Long)
	 */
	public MovimientoContableDetalleTO cargarMovimientoContableDetalle(Long idMovimientoContableDetalle) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		MovimientoContableDetalleTO movimientoContableDetalleTO = null;
		MovimientoContableDetalleDO movimientoContableDetalleDO = null;

		if (idMovimientoContableDetalle == null) {
			throw new ValidacionExcepcion("falta.id.movimiento.contable.detalle");
		}

		movimientoContableDetalleDO = getMovimientoContableDetalleDAO().cargar(idMovimientoContableDetalle);

		if (movimientoContableDetalleDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.movimiento.contable.detalle");
		}

		movimientoContableDetalleTO = getMovimientoContableDetalleTransf().transferirDOTO(movimientoContableDetalleDO);

		return movimientoContableDetalleTO;

		
	}
	

}
