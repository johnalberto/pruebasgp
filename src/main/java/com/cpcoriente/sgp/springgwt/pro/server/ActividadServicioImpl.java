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

import com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ActividadDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ActividadPorPersonalDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.DocObjetivoDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.EntregableDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ObjetivoDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ProductoDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionActividadDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionEntregableDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionObjetivoDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionProductoDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IActividadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IActividadPorPersonalDAO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IDocObjetivoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IEntregableDAO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IObjetivoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IProductoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IVersionActividadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IVersionEntregableDAO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IVersionObjetivoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IVersionProductoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IActividadPorPersonalTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IActividadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IDocObjetivoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IEntregableTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IObjetivoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IProductoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IVersionActividadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IVersionEntregableTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IVersionObjetivoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IVersionProductoTransf;
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
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * @author CPC-04
 *
 */


@Service
public class ActividadServicioImpl extends RemoteServiceServlet implements IActividadServicio {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6809048052364727173L;


	
	public void init() {

	}
	
	private IActividadDAO getActividadDAO() {
		return  DAOFactory.getInstance().getActividadDao();
	}

	private IActividadTransf getActividadTransf() {
		return  TransfFactory.getInstance().getActividadTransf();
	}

	private IActividadPorPersonalDAO getActividadPorPersonalDAO() {
		return  DAOFactory.getInstance().getActividadPorPersonalDao();
	}

	private IActividadPorPersonalTransf getActividadPorPersonalTransf() {
		return  TransfFactory.getInstance().getActividadPorPersonalTransf();
	}

	private IDocObjetivoDAO getDocObjetivoDAO() {
		return  DAOFactory.getInstance().getDocObjetivoDao();
	}

	private IDocObjetivoTransf getDocObjetivoTransf() {
		return  TransfFactory.getInstance().getDocObjetivoTransf();
	}

	private IEntregableDAO getEntregableDAO() {
		return  DAOFactory.getInstance().getEntregableDao();
	}

	private IEntregableTransf getEntregableTransf() {
		return  TransfFactory.getInstance().getEntregableTransf();
	}


	private IObjetivoDAO getObjetivoDAO() {
		return  DAOFactory.getInstance().getObjetivoDao();
	}

	private IObjetivoTransf getObjetivoTransf() {
		return  TransfFactory.getInstance().getObjetivoTransf();
	}

	private IProductoDAO getProductoDAO() {
		return  DAOFactory.getInstance().getProductoDao();
	}

	private IProductoTransf getProductoTransf() {
		return  TransfFactory.getInstance().getProductoTransf();
	}

	private IVersionObjetivoDAO getVersionObjetivoDAO() {
		return  DAOFactory.getInstance().getVersionObjetivoDao();
	}

	private IVersionObjetivoTransf getVersionObjetivoTransf() {
		return  TransfFactory.getInstance().getVersionObjetivoTransf();
	}

	private IVersionProductoDAO getVersionProductoDAO() {
		return  DAOFactory.getInstance().getVersionProductoDao();
	}

	private IVersionProductoTransf getVersionProductoTransf() {
		return  TransfFactory.getInstance().getVersionProductoTransf();
	}

	private IVersionActividadDAO getVersionActividadDAO() {
		return  DAOFactory.getInstance().getVersionActividadDao();
	}

	private IVersionActividadTransf getVersionActividadTransf() {
		return  TransfFactory.getInstance().getVersionActividadTransf();
	}

	private IVersionEntregableDAO getVersionEntregableDAO() {
		return  DAOFactory.getInstance().getVersionEntregableDao();
	}

	private IVersionEntregableTransf getVersionEntregableTransf() {
		return  TransfFactory.getInstance().getVersionEntregableTransf();
	}



	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#cargarActividad(java.lang.Long)
	 */
	public ActividadTO cargarActividad(Long idActividad) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		ActividadTO actividadTO = null;
		ActividadDO actividadDO = null;

		if (idActividad == null) {
			throw new ValidacionExcepcion("falta.id.actividad");
		}

		actividadDO = getActividadDAO().cargar(idActividad);

		if (actividadDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.actividad");
		}

		actividadTO = getActividadTransf().transferirDOTO(actividadDO);

		return actividadTO;


	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#crearActividad(com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ActividadDO)
	 */
	public Long crearActividad(ActividadTO actividad) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {


		if(actividad == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.actividad")	;
		}

		ActividadDO actividadProv = null;

		Long idRegistrado = null;

		actividadProv = getActividadTransf().transferirTODO(actividad);

		try {

			ActividadDO actividadReg = getActividadDAO().persistir(actividadProv);
			if (actividadReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.actividad");
			}

			idRegistrado = actividadReg.getId();
			
			
			VersionActividadTO versionActividad = new VersionActividadTO() ;
			actividad.setId(idRegistrado);
			versionActividad.setActividad(actividad);
			versionActividad.setCodigo(actividad.getCodigo());
			versionActividad.setEstado(actividad.getEstado());
			versionActividad.setFechaInicio(actividad.getFechaInicio());
			versionActividad.setFechaFinal(actividad.getFechaFinal());
			versionActividad.setNombre(actividad.getNombre());
			versionActividad.setPorcentajePeso(actividad.getPorcenPeso());
			versionActividad.setObservacion("Actividad reci\u00e9n registrada en la base de datos");
			versionActividad.setFechaRegistro(new Date());
			
			crearVersionActividad(versionActividad);
			

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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#modificarActividad(com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ActividadTO)
	 */
	public boolean modificarActividad(ActividadTO actividad, VersionActividadTO versionActividad) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		ActividadDO actividadProv = getActividadTransf().transferirTODO(actividad);

		try {

			ActividadDO actividadMod = getActividadDAO().modificar(actividadProv);
			if(actividadMod == null){
				throw new RecursoExcepcion("fallo.modificaci\u00f3n.actividad");
			}

			crearVersionActividad(versionActividad);
			
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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#eliminarActividad(java.lang.Long)
	 */
	public boolean eliminarActividad(Long idActividad)	throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idActividad == null) {
			throw new ValidacionExcepcion("falta.identificador.actividad");
		}

		try {

			boolean res = getActividadDAO().eliminar(idActividad);

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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#listarTodoActividad(java.lang.Long)
	 */
	public List<ActividadTO> listarTodoActividad(Long idProducto) throws PrecondicionExcepcion, ValidacionExcepcion {

		if (idProducto == null) {
			throw new ValidacionExcepcion("falta.identificador.producto");
		}

		List<ActividadDO> actividadLista = getActividadDAO().listarTodo(idProducto);

		if (actividadLista == null || actividadLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.actividad");
		}

		ActividadTO actividadTO = null;
		List<ActividadTO> actividadTOLista = new ArrayList<ActividadTO>(actividadLista.size());
		for (ActividadDO actividad : actividadLista) {

			actividadTO = getActividadTransf().transferirDOTO(actividad);
			actividadTOLista.add(actividadTO);
		}

		return actividadTOLista;
	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#seleccionPorNombreActividadCodigo(java.lang.Long, java.lang.String)
	 */
	public List<ActividadTO> seleccionPorNombreActividadCodigo(Long idProducto, String parteNombreCodigo) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idProducto == null) {
			throw new ValidacionExcepcion("falta.identificador.producto");
		}

		if (parteNombreCodigo == null || parteNombreCodigo.trim().isEmpty()) {
			throw new ValidacionExcepcion("falta.nombre.codigo.actividad");
		}

		List<ActividadDO> actividadLista = getActividadDAO().seleccionPorNombreCodigo(idProducto, parteNombreCodigo);

		if (actividadLista == null || actividadLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.actividad");
		}

		ActividadTO actividadTO = null;
		List<ActividadTO> actividadTOLista = new ArrayList<ActividadTO>(actividadLista.size());
		for (ActividadDO actividad : actividadLista) {

			actividadTO = getActividadTransf().transferirDOTO(actividad);
			actividadTOLista.add(actividadTO);
		}

		return actividadTOLista;

	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#seleccionPorProductoPorEstadoActividad(java.lang.Long, int)
	 */
	public List<ActividadTO> seleccionPorProductoPorEstadoActividad(Long idProducto, int estado) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idProducto == null) {
			throw new ValidacionExcepcion("falta.identificador.producto");
		}

		if (estado <= 0) {
			throw new ValidacionExcepcion("falta.estado.actividad");
		}

		List<ActividadDO> actividadLista = getActividadDAO().seleccionPorProductoPorEstado(idProducto, estado);

		if (actividadLista == null || actividadLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.actividad");
		}

		ActividadTO actividadTO = null;
		List<ActividadTO> actividadTOLista = new ArrayList<ActividadTO>(actividadLista.size());
		for (ActividadDO actividad : actividadLista) {

			actividadTO = getActividadTransf().transferirDOTO(actividad);
			actividadTOLista.add(actividadTO);
		}

		return actividadTOLista;
	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#seleccionPorNombreCodigoPadreActividad(java.lang.Long, java.lang.String)
	 */
	public List<ActividadTO> seleccionPorNombreCodigoPadreActividad(Long idPadre, String parteNombreCodigo) throws ValidacionExcepcion,	PrecondicionExcepcion {

		if (idPadre == null) {
			throw new ValidacionExcepcion("falta.identificador.actividad.padre");
		}

		if (parteNombreCodigo == null || parteNombreCodigo.trim().isEmpty()) {
			throw new ValidacionExcepcion("falta.nombre.codigo.actividad.padre");
		}

		List<ActividadDO> actividadLista = getActividadDAO().seleccionPorNombreCodigoPadre(idPadre, parteNombreCodigo);

		if (actividadLista == null || actividadLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.actividad");
		}

		ActividadTO actividadTO = null;
		List<ActividadTO> actividadTOLista = new ArrayList<ActividadTO>(actividadLista.size());
		for (ActividadDO actividad : actividadLista) {

			actividadTO = getActividadTransf().transferirDOTO(actividad);
			actividadTOLista.add(actividadTO);
		}

		return actividadTOLista;
	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#seleccionPorPadreActividad(java.lang.Long)
	 */
	public List<ActividadTO> seleccionPorPadreActividad(Long idPadre) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idPadre == null) {
			throw new ValidacionExcepcion("falta.identificador.actividad.padre");
		}


		List<ActividadDO> actividadLista = getActividadDAO().seleccionPorPadre(idPadre);

		if (actividadLista == null || actividadLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.actividad");
		}

		ActividadTO actividadTO = null;
		List<ActividadTO> actividadTOLista = new ArrayList<ActividadTO>(actividadLista.size());
		for (ActividadDO actividad : actividadLista) {

			actividadTO = getActividadTransf().transferirDOTO(actividad);
			actividadTOLista.add(actividadTO);
		}

		return actividadTOLista;

	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#seleccionPadresActividad(java.lang.Long)
	 */
	public List<ActividadTO> seleccionPadresActividad(Long idProducto) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idProducto == null) {
			throw new ValidacionExcepcion("falta.identificador.producto");
		}

		List<ActividadDO> actividadLista = getActividadDAO().seleccionPadres(idProducto);

		if (actividadLista == null || actividadLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.actividad");
		}

		ActividadTO actividadTO = null;
		List<ActividadTO> actividadTOLista = new ArrayList<ActividadTO>(actividadLista.size());
		for (ActividadDO actividad : actividadLista) {

			actividadTO = getActividadTransf().transferirDOTO(actividad);
			actividadTOLista.add(actividadTO);
		}

		return actividadTOLista;


	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#seleccionPadresPorNomCodActividad(java.lang.Long, java.lang.String)
	 */
	public List<ActividadTO> seleccionPadresPorNomCodActividad(Long idProducto,	String parteNombreCodigo) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idProducto == null) {
			throw new ValidacionExcepcion("falta.identificador.producto");
		}

		if (parteNombreCodigo == null || parteNombreCodigo.trim().isEmpty()) {
			throw new ValidacionExcepcion("falta.nombre.codigo.activiad.padre");
		}

		List<ActividadDO> actividadLista = getActividadDAO().seleccionPadresPorNomCod(idProducto, parteNombreCodigo);

		if (actividadLista == null || actividadLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.actividad");
		}

		ActividadTO actividadTO = null;
		List<ActividadTO> actividadTOLista = new ArrayList<ActividadTO>(actividadLista.size());
		for (ActividadDO actividad : actividadLista) {

			actividadTO = getActividadTransf().transferirDOTO(actividad);
			actividadTOLista.add(actividadTO);
		}

		return actividadTOLista;

	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#seleccionPorRangofechasActividad(java.lang.Long, java.util.Date, java.util.Date)
	 */
	public List<ActividadTO> seleccionPorRangofechasActividad(Long idProducto, Date fechaInicio, Date fechaFin) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idProducto == null) {
			throw new ValidacionExcepcion("falta.identificador.producto");
		}

		if (fechaInicio == null || fechaFin == null) {
			throw new ValidacionExcepcion("falta.fecha.inicio.fin");
		}

		if ((fechaInicio.after(fechaFin))) {
			throw new ValidacionExcepcion("error.rango.fechas");
		}

		List<ActividadDO> actividadLista = getActividadDAO().seleccionPorRangofechas(idProducto, fechaInicio, fechaFin);

		if (actividadLista == null || actividadLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.actividad");
		}

		ActividadTO actividadTO = null;
		List<ActividadTO> actividadTOLista = new ArrayList<ActividadTO>(actividadLista.size());
		for (ActividadDO actividad : actividadLista) {

			actividadTO = getActividadTransf().transferirDOTO(actividad);
			actividadTOLista.add(actividadTO);
		}

		return actividadTOLista;


	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#seleccionPorFechaInicialActividad(java.lang.Long, java.util.Date)
	 */
	public List<ActividadTO> seleccionPorFechaInicialActividad(Long idProducto, Date fechaInicio) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idProducto == null) {
			throw new ValidacionExcepcion("falta.identificador.producto");
		}

		if (fechaInicio == null ) {
			throw new ValidacionExcepcion("falta.fecha.inicio");
		}


		List<ActividadDO> actividadLista = getActividadDAO().seleccionPorFechaInicial(idProducto, fechaInicio);

		if (actividadLista == null || actividadLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.actividad");
		}

		ActividadTO actividadTO = null;
		List<ActividadTO> actividadTOLista = new ArrayList<ActividadTO>(actividadLista.size());
		for (ActividadDO actividad : actividadLista) {

			actividadTO = getActividadTransf().transferirDOTO(actividad);
			actividadTOLista.add(actividadTO);
		}

		return actividadTOLista;

	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#seleccionPorFechaFinalActividad(java.lang.Long, java.util.Date)
	 */
	public List<ActividadTO> seleccionPorFechaFinalActividad(Long idProducto, Date fechaFin) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idProducto == null) {
			throw new ValidacionExcepcion("falta.identificador.producto");
		}

		if (fechaFin == null ) {
			throw new ValidacionExcepcion("falta.fecha.fin");
		}


		List<ActividadDO> actividadLista = getActividadDAO().seleccionPorFechaFinal(idProducto, fechaFin);

		if (actividadLista == null || actividadLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.actividad");
		}

		ActividadTO actividadTO = null;
		List<ActividadTO> actividadTOLista = new ArrayList<ActividadTO>(actividadLista.size());
		for (ActividadDO actividad : actividadLista) {

			actividadTO = getActividadTransf().transferirDOTO(actividad);
			actividadTOLista.add(actividadTO);
		}

		return actividadTOLista;

	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#cargarAPP(java.lang.Long)
	 */
	public ActividadPorPersonalTO cargarAPP(Long idActividadPorPersonal) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		ActividadPorPersonalTO actividadPorPersonalTO = null;
		ActividadPorPersonalDO actividadPorPersonalDO = null;

		if (idActividadPorPersonal == null) {
			throw new ValidacionExcepcion("falta.id.actividad.personal");
		}

		actividadPorPersonalDO = getActividadPorPersonalDAO().cargar(idActividadPorPersonal);

		if (actividadPorPersonalDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.actividad.personal");
		}

		actividadPorPersonalTO = getActividadPorPersonalTransf().transferirDOTO(actividadPorPersonalDO);

		return actividadPorPersonalTO;

	}

	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#crearAPP(com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ActividadPorPersonalTO)
	 */
	public Long crearAPP(ActividadPorPersonalTO actividadPorPersonal) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		if(actividadPorPersonal == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.actividad.personal")	;
		}


		ActividadPorPersonalDO actividadPorPersonalProv = null;
		Long idRegistrado = null;

		actividadPorPersonalProv = getActividadPorPersonalTransf().transferirTODO(actividadPorPersonal);

		try {

			ActividadPorPersonalDO actividadPorPersonalReg = getActividadPorPersonalDAO().persistir(actividadPorPersonalProv);

			if (actividadPorPersonalReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.actividad.personal");
			}

			idRegistrado = actividadPorPersonalReg.getId();

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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#modificarAPP(com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ActividadPorPersonalTO)
	 */
	public boolean modificarAPP(ActividadPorPersonalTO actividadPorPersonal) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {


		ActividadPorPersonalDO actividadPorPersonalProv = getActividadPorPersonalTransf().transferirTODO(actividadPorPersonal);

		try {

			ActividadPorPersonalDO actividadPorPersonalMod = getActividadPorPersonalDAO().modificar(actividadPorPersonalProv);
			if(actividadPorPersonalMod == null){
				throw new RecursoExcepcion("fallo.modificaci\u00f3n.actividad.personal");
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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#eliminarAPP(java.lang.Long)
	 */
	public boolean eliminarAPP(Long idActividadPorPersonal) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idActividadPorPersonal == null) {
			throw new ValidacionExcepcion("falta.identificador.actividad.personal");
		}

		try {

			boolean res = getActividadPorPersonalDAO().eliminar(idActividadPorPersonal);

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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#listarTodoPorProductoAPP(java.lang.Long)
	 */
	public List<ActividadPorPersonalTO> listarTodoPorProductoAPP(Long idProducto) throws PrecondicionExcepcion, ValidacionExcepcion {

		if (idProducto == null) {
			throw new ValidacionExcepcion("falta.identificador.producto");
		}

		List<ActividadPorPersonalDO> actividadPorPersonalLista = getActividadPorPersonalDAO().listarTodoPorProducto(idProducto);

		if (actividadPorPersonalLista == null || actividadPorPersonalLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.actividad.personal");
		}

		ActividadPorPersonalTO actividadPorPersonalTO = null;
		List<ActividadPorPersonalTO> actividadPorPersonalTOLista = new ArrayList<ActividadPorPersonalTO>(actividadPorPersonalLista.size());
		for (ActividadPorPersonalDO actividad : actividadPorPersonalLista) {

			actividadPorPersonalTO = getActividadPorPersonalTransf().transferirDOTO(actividad);
			actividadPorPersonalTOLista.add(actividadPorPersonalTO);
		}

		return actividadPorPersonalTOLista;

	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#seleccionPorPersonaAPP(java.lang.Long, java.lang.String)
	 */
	public List<ActividadPorPersonalTO> seleccionPorPersonaAPP(Long idProyecto, String parteNombreCedula) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idProyecto == null) {
			throw new ValidacionExcepcion("falta.identificador.producto");
		}

		if (parteNombreCedula == null || parteNombreCedula.trim().isEmpty()) {
			throw new ValidacionExcepcion("falta.nombre.codigo.persona");
		}

		List<ActividadPorPersonalDO> actividadPorPersonalLista = getActividadPorPersonalDAO().seleccionPorPersona(idProyecto, parteNombreCedula);

		if (actividadPorPersonalLista == null || actividadPorPersonalLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.actividad.personal");
		}

		ActividadPorPersonalTO actividadPorPersonalTO = null;
		List<ActividadPorPersonalTO> actividadPorPersonalTOLista = new ArrayList<ActividadPorPersonalTO>(actividadPorPersonalLista.size());
		for (ActividadPorPersonalDO app : actividadPorPersonalLista) {

			actividadPorPersonalTO = getActividadPorPersonalTransf().transferirDOTO(app);
			actividadPorPersonalTOLista.add(actividadPorPersonalTO);
		}

		return actividadPorPersonalTOLista;


	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#cargarDocObjetivo(java.lang.Long)
	 */
	public DocObjetivoTO cargarDocObjetivo(Long idDocObjetivo)	throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		DocObjetivoTO docObjetivoTO = null;
		DocObjetivoDO docObjetivoDO = null;

		if (idDocObjetivo == null) {
			throw new ValidacionExcepcion("falta.id.documento.objetivo");
		}

		docObjetivoDO = getDocObjetivoDAO().cargar(idDocObjetivo);

		if (docObjetivoDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.documento.objetivo");
		}

		docObjetivoTO = getDocObjetivoTransf().transferirDOTO(docObjetivoDO);

		return docObjetivoTO;

	}



	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#crearDocObjetivo(java.util.List)
	 */
	public List<DocObjetivoTO> crearDocObjetivo(List<DocObjetivoTO> docObjetivoList) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		List<DocObjetivoDO> docObjetivoListRes = null;
		if (docObjetivoList != null && docObjetivoList.size() > 0) {
			for (DocObjetivoTO doc : docObjetivoList) {
				if (doc.getNombre() == null || doc.getNombre().trim().length() == 0 || doc.getNombre().trim() == "") {
					throw new ValidacionExcepcion("falta.Nombre.documento")	;
				}
				if (doc.getDescripcion() == null || doc.getDescripcion().trim().length() == 0 || doc.getDescripcion().trim() == "") {
					throw new ValidacionExcepcion("falta.descripci\u00f3n.documento")	;
				}

				if (doc.getIdObjetivo() == null) {
					throw new ValidacionExcepcion("falta.objetivo.documento")	;
				}	
			}

			Set<DocObjetivoDO> docObjetivoListAgregar = new LinkedHashSet<DocObjetivoDO>();


			for (DocObjetivoTO docTO : docObjetivoList) {
				DocObjetivoDO docDO = new DocObjetivoDO();
				docDO = getDocObjetivoTransf().transferirTODO(docTO);
				docObjetivoListAgregar.add(docDO);
			}
			docObjetivoListRes = getDocObjetivoDAO().persistir(docObjetivoListAgregar);


			if (docObjetivoListRes == null || docObjetivoListRes.size() != docObjetivoListAgregar.size()) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.documento.objetivo");
			}

			docObjetivoList.clear();
			for (DocObjetivoDO docObjeDO : docObjetivoListRes) {
				DocObjetivoTO docObjTO = new DocObjetivoTO();
				docObjTO = getDocObjetivoTransf().transferirDOTO(docObjeDO);
				docObjetivoList.add(docObjTO);
			}

		} else {
			throw new ValidacionExcepcion("falta.informaci\u00f3n.documento.objetivo")	;
		}


		return docObjetivoList;

	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#modificarDocObjetivo(com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.DocObjetivoTO)
	 */
	public boolean modificarDocObjetivo(DocObjetivoTO docObjetivo)	throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		DocObjetivoDO docObjetivoProv = getDocObjetivoTransf().transferirTODO(docObjetivo);

		try {

			DocObjetivoDO docObjetivoMod = getDocObjetivoDAO().modificar(docObjetivoProv);
			if(docObjetivoMod == null){
				throw new RecursoExcepcion("fallo.modificaci\u00f3n.documento.objetivo");
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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#eliminarDocObjetivo(java.util.List)
	 */
	public boolean eliminarDocObjetivo(List<Long> idDocObjetivoLista) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idDocObjetivoLista == null) {
			throw new ValidacionExcepcion("falta.identificador.documento.objetivo");
		}

		try {

			boolean res = getDocObjetivoDAO().eliminar(idDocObjetivoLista);

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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#seleccionPorObjetivoDocObjetivo(java.lang.Long)
	 */
	public List<DocObjetivoTO> seleccionPorObjetivoDocObjetivo(Long idObjetivo)	throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idObjetivo == null) {
			throw new ValidacionExcepcion("falta.identificador.objetivo");
		}


		List<DocObjetivoDO> docObjetivoLista = getDocObjetivoDAO().seleccionPorObjetivo(idObjetivo);

		if (docObjetivoLista == null || docObjetivoLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.documento.objetivo");
		}

		DocObjetivoTO docObjetivoTO = null;
		List<DocObjetivoTO> docObjetivoTOLista = new ArrayList<DocObjetivoTO>(docObjetivoLista.size());
		for (DocObjetivoDO doc : docObjetivoLista) {

			docObjetivoTO = getDocObjetivoTransf().transferirDOTO(doc);
			docObjetivoTOLista.add(docObjetivoTO);
		}

		return docObjetivoTOLista;

	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#cargarEntregable(java.lang.Long)
	 */
	public EntregableTO cargarEntregable(Long idEntregable) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		EntregableTO entregableTO = null;
		EntregableDO entregableDO = null;

		if (idEntregable == null) {
			throw new ValidacionExcepcion("falta.id.entregable");
		}

		entregableDO = getEntregableDAO().cargar(idEntregable);

		if (entregableDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.entregable");
		}

		entregableTO = getEntregableTransf().transferirDOTO(entregableDO);

		return entregableTO;

	}


	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#crearEntregable(com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.EntregableTO)
	 */
	public Long crearEntregable(EntregableTO entregable) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		if(entregable == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.entregable")	;
		}
		

		EntregableDO entregableProv = null;
		Long idRegistrado = null;

		entregableProv = getEntregableTransf().transferirTODO(entregable);

		try {

			EntregableDO entregableReg = getEntregableDAO().persistir(entregableProv);

			if (entregableReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.entregable");
			}

			idRegistrado = entregableReg.getId();
			
			
			VersionEntregableTO versionEntregable = new VersionEntregableTO() ;
			entregable.setId(idRegistrado);
			versionEntregable.setEntregable(entregable);
			versionEntregable.setCodigo(entregable.getCodigo());
			versionEntregable.setEstado(entregable.getEstado());
			versionEntregable.setFechaEntrega(entregable.getFechaEntrega());
			versionEntregable.setResultadoDe(entregable.getResultadoDe());
			versionEntregable.setTipo(entregable.getTipoEntregable());
			versionEntregable.setNombre(entregable.getNombre());
			versionEntregable.setObservacion("Entregable reci\u00e9n registrado en la base de datos");
			versionEntregable.setFechaRegistro(new Date());
			
			crearVersionEntregable(versionEntregable);
			

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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#modificarEntregable(com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.EntregableTO)
	 */
	public boolean modificarEntregable(EntregableTO entregable, VersionEntregableTO versionEntregable)	throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		EntregableDO entregableProv = getEntregableTransf().transferirTODO(entregable);

		try {

			EntregableDO entregableMod = getEntregableDAO().modificar(entregableProv);
			if(entregableMod == null){
				throw new RecursoExcepcion("fallo.modificaci\u00f3n.entregable");
			}

			
			crearVersionEntregable(versionEntregable);
			
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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#eliminarEntregable(java.lang.Long)
	 */
	public boolean eliminarEntregable(Long idEntregable) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idEntregable == null) {
			throw new ValidacionExcepcion("falta.identificador.entregable");
		}

		try {

			boolean res = getEntregableDAO().eliminar(idEntregable);

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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#listarTodoEntregable(java.lang.Long)
	 */
	public List<EntregableTO> listarTodoEntregable(Long idActividad) throws PrecondicionExcepcion, ValidacionExcepcion {

		if (idActividad == null) {
			throw new ValidacionExcepcion("falta.identificador.actividad");
		}


		List<EntregableDO> entregableLista = getEntregableDAO().listarTodo(idActividad);

		if (entregableLista == null || entregableLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.entregable");
		}

		EntregableTO entregableTO = null;
		List<EntregableTO> entregableTOLista = new ArrayList<EntregableTO>(entregableLista.size());
		for (EntregableDO ent : entregableLista) {

			entregableTO = getEntregableTransf().transferirDOTO(ent);
			entregableTOLista.add(entregableTO);
		}

		return entregableTOLista;

	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#seleccionPorNombreCodigoEntregable(java.lang.Long, java.lang.String)
	 */
	public List<EntregableTO> seleccionPorNombreCodigoEntregable(Long idActividad, String parteNombreCodigo) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idActividad == null) {
			throw new ValidacionExcepcion("falta.identificador.actividad");
		}

		if (parteNombreCodigo == null || parteNombreCodigo.trim().isEmpty()) {
			throw new ValidacionExcepcion("falta.nombre.codigo.entregable");
		}

		List<EntregableDO> entregableLista = getEntregableDAO().seleccionPorNombreCodigo(idActividad, parteNombreCodigo);

		if (entregableLista == null || entregableLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.entregable");
		}

		EntregableTO entregableTO = null;
		List<EntregableTO> entregableTOLista = new ArrayList<EntregableTO>(entregableLista.size());
		for (EntregableDO ent : entregableLista) {

			entregableTO = getEntregableTransf().transferirDOTO(ent);
			entregableTOLista.add(entregableTO);
		}

		return entregableTOLista;


	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#seleccionPorActividadPorEstadoEtregable(java.lang.Long, int)
	 */
	public List<EntregableTO> seleccionPorActividadPorEstadoEtregable(Long idActividad, int estado) throws ValidacionExcepcion,	PrecondicionExcepcion {


		if (idActividad == null) {
			throw new ValidacionExcepcion("falta.identificador.actividad");
		}		

		if (estado <= 0) {
			throw new ValidacionExcepcion("falta.estado.entregable");
		}

		List<EntregableDO> entregableLista = getEntregableDAO().seleccionPorActividadPorEstado(idActividad, estado);

		if (entregableLista == null || entregableLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.entregable");
		}

		EntregableTO entregableTO = null;
		List<EntregableTO> entregableTOLista = new ArrayList<EntregableTO>(entregableLista.size());
		for (EntregableDO ent : entregableLista) {

			entregableTO = getEntregableTransf().transferirDOTO(ent);
			entregableTOLista.add(entregableTO);
		}

		return entregableTOLista;


	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#seleccionPorRangofechasEntregable(java.lang.Long, java.util.Date, java.util.Date)
	 */
	public List<EntregableTO> seleccionPorRangofechasEntregable(Long idActividad, Date fechaInicio, Date fechaFin) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idActividad == null) {
			throw new ValidacionExcepcion("falta.identificador.actividad");
		}

		if (fechaInicio == null || fechaFin == null) {
			throw new ValidacionExcepcion("falta.fecha.inicio.fin");
		}

		if ((fechaInicio.after(fechaFin))) {
			throw new ValidacionExcepcion("error.rango.fechas");
		}

		List<EntregableDO> entregableLista = getEntregableDAO().seleccionPorRangofechas(idActividad, fechaInicio, fechaFin);

		if (entregableLista == null || entregableLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.entregable");
		}

		EntregableTO entregableTO = null;
		List<EntregableTO> entregableTOLista = new ArrayList<EntregableTO>(entregableLista.size());
		for (EntregableDO ent : entregableLista) {

			entregableTO = getEntregableTransf().transferirDOTO(ent);
			entregableTOLista.add(entregableTO);
		}

		return entregableTOLista;

	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#cargarObjetivo(java.lang.Long)
	 */
	public ObjetivoTO cargarObjetivo(Long idObjetivo) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {


		ObjetivoTO objetivoTO = null;
		ObjetivoDO objetivoDO = null;

		if (idObjetivo == null) {
			throw new ValidacionExcepcion("falta.id.objetivo");
		}

		objetivoDO = getObjetivoDAO().cargar(idObjetivo);

		if (objetivoDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.objetivo");
		}

		objetivoTO = getObjetivoTransf().transferirDOTO(objetivoDO);
		return objetivoTO;

	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#crearObjetivo(com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ObjetivoTO)
	 */
	public Long crearObjetivo(ObjetivoTO objetivo) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {


		if(objetivo == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.objetivo");
		}

		try {


			ObjetivoDO objetivoProv = null;

			Long idRegistrado = null;

			objetivoProv = getObjetivoTransf().transferirTODO(objetivo);
			ObjetivoDO objetivoReg = getObjetivoDAO().persistir(objetivoProv);
			if (objetivoReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.objetivo");
			}

			if (objetivo.getDocumentoList() != null && objetivo.getDocumentoList().size() > 0) {
				List<DocObjetivoDO> docObjListRes = null;
				
				for (DocObjetivoTO doc : objetivo.getDocumentoList()) {
					if (doc.getNombre() == null || doc.getNombre().trim().length() == 0 || doc.getNombre().trim() == "") {
						throw new ValidacionExcepcion("falta.Nombre.documento")	;
					}
					if (doc.getDescripcion() == null || doc.getDescripcion().trim().length() == 0 || doc.getDescripcion().trim() == "") {
						throw new ValidacionExcepcion("falta.descripci\u00f3n.documento")	;
					}
				}

				Set<DocObjetivoDO> documentoListAgregar = new LinkedHashSet<DocObjetivoDO>();


				for (DocObjetivoTO docObjTO : objetivo.getDocumentoList()) {
					DocObjetivoDO documentoObjetivoDO = new DocObjetivoDO();
					documentoObjetivoDO = getDocObjetivoTransf().transferirTODO(docObjTO);
					documentoObjetivoDO.setIdObjetivo(objetivoReg.getId());
					documentoListAgregar.add(documentoObjetivoDO);
				}
				docObjListRes = getDocObjetivoDAO().persistir(documentoListAgregar);


				if (docObjListRes == null || docObjListRes.size() != documentoListAgregar.size()) {
					throw new RecursoExcepcion("fallo.creaci\u00f3n.documento");
				}

			} 

			idRegistrado = objetivoReg.getId();
			
			
			VersionObjetivoTO versionObjetivo = new VersionObjetivoTO() ;
			objetivo.setId(idRegistrado);
			versionObjetivo.setObjetivo(objetivo);
			versionObjetivo.setCodigo(objetivo.getCodigo());
			versionObjetivo.setEstado(objetivo.getEstado());
			versionObjetivo.setDescripcion(objetivo.getDescripcion());
			versionObjetivo.setPorcentajePeso(objetivo.getPorcenPeso());
			versionObjetivo.setNombre(objetivo.getNombre());
			versionObjetivo.setObservacion("Objetivo reci\u00e9n registrado en la base de datos");
			versionObjetivo.setFechaRegistro(new Date());
			
			crearVersionObjetivo(versionObjetivo);

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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#modificarObjetivo(com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ObjetivoTO)
	 */
	public boolean modificarObjetivo(ObjetivoTO objetivo, VersionObjetivoTO versionObjetivo) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		ObjetivoDO objetivoProv = getObjetivoTransf().transferirTODO(objetivo);

		try {

			ObjetivoDO objetivoMod = getObjetivoDAO().modificar(objetivoProv);
			if(objetivoMod == null){
				throw new RecursoExcepcion("fallo.modificaci\u00f3n.objetivo");
			}

			crearVersionObjetivo(versionObjetivo);
			
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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#eliminarObjetivo(java.lang.Long)
	 */
	public boolean eliminarObjetivo(Long idObjetivo) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idObjetivo == null) {
			throw new ValidacionExcepcion("falta.identificador.objetivo");
		}

		try {

			boolean res = getObjetivoDAO().eliminar(idObjetivo);

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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#listarTodoObjetivo(java.lang.Long)
	 */
	public List<ObjetivoTO> listarTodoObjetivo(Long idProyecto) throws PrecondicionExcepcion, ValidacionExcepcion {

		if (idProyecto == null) {
			throw new ValidacionExcepcion("falta.identificador.proyecto");
		}

		List<ObjetivoDO> objetivoLista = getObjetivoDAO().listarTodo(idProyecto);

		if (objetivoLista == null || objetivoLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.entregable");
		}

		ObjetivoTO objetivoTO = null;
		List<ObjetivoTO> objetivoTOLista = new ArrayList<ObjetivoTO>(objetivoLista.size());
		for (ObjetivoDO obj : objetivoLista) {

			objetivoTO = getObjetivoTransf().transferirDOTO(obj);
			objetivoTOLista.add(objetivoTO);
		}

		return objetivoTOLista;

	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#seleccionPorNombreCodigoObjetivo(java.lang.Long, java.lang.String)
	 */
	public List<ObjetivoTO> seleccionPorNombreCodigoObjetivo(Long idProyecto, String parteNombreCodigo) throws ValidacionExcepcion,	PrecondicionExcepcion {

		if (idProyecto == null) {
			throw new ValidacionExcepcion("falta.identificador.proyecto");
		}

		if (parteNombreCodigo == null || parteNombreCodigo.trim().isEmpty()) {
			throw new ValidacionExcepcion("falta.nombre.codigo.objetivo");
		}

		List<ObjetivoDO> objetivoLista = getObjetivoDAO().seleccionPorNombreCodigo(idProyecto, parteNombreCodigo);

		if (objetivoLista == null || objetivoLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.objetivo");
		}

		ObjetivoTO objetivoTO = null;
		List<ObjetivoTO> objetivoTOLista = new ArrayList<ObjetivoTO>(objetivoLista.size());
		for (ObjetivoDO obj : objetivoLista) {

			objetivoTO = getObjetivoTransf().transferirDOTO(obj);
			objetivoTOLista.add(objetivoTO);
		}

		return objetivoTOLista;



	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#seleccionPorProyectoPorEstadoObjetivo(java.lang.Long, int)
	 */
	public List<ObjetivoTO> seleccionPorProyectoPorEstadoObjetivo(Long idProyecto, int estado) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idProyecto == null) {
			throw new ValidacionExcepcion("falta.identificador.proyecto");
		}

		if (estado <= 0) {
			throw new ValidacionExcepcion("falta.estado.objetivo");
		}

		List<ObjetivoDO> objetivoLista = getObjetivoDAO().seleccionPorProyectoPorEstado(idProyecto, estado);

		if (objetivoLista == null || objetivoLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.objetivo");
		}

		ObjetivoTO objetivoTO = null;
		List<ObjetivoTO> objetivoTOLista = new ArrayList<ObjetivoTO>(objetivoLista.size());
		for (ObjetivoDO obj : objetivoLista) {

			objetivoTO = getObjetivoTransf().transferirDOTO(obj);
			objetivoTOLista.add(objetivoTO);
		}

		return objetivoTOLista;

	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#cargarProducto(java.lang.Long)
	 */
	public ProductoTO cargarProducto(Long idProducto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		ProductoTO productoTO = null;
		ProductoDO productoDO = null;

		if (idProducto == null) {
			throw new ValidacionExcepcion("falta.id.producto");
		}

		productoDO = getProductoDAO().cargar(idProducto);

		if (productoDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.producto");
		}

		productoTO = getProductoTransf().transferirDOTO(productoDO);

		return productoTO;

	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#crearProducto(com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ProductoTO)
	 */
	public Long crearProducto(ProductoTO producto)	throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		if(producto == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.producto")	;
		}
		

		ProductoDO productoProv = null;
		Long idRegistrado = null;

		productoProv = getProductoTransf().transferirTODO(producto);

		try {

			ProductoDO productoReg = getProductoDAO().persistir(productoProv);

			if (productoReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.producto");
			}

			idRegistrado = productoReg.getId();
			
			VersionProductoTO versionProducto = new VersionProductoTO() ;
			producto.setId(idRegistrado);
			versionProducto.setProducto(producto);
			versionProducto.setCodigo(producto.getCodigo());
			versionProducto.setEstado(producto.getEstado());
			versionProducto.setFechaInicio(producto.getFechaInicio());
			versionProducto.setFechaFin(producto.getFechaFin());
			versionProducto.setPorcentajePeso(producto.getPorcenPeso());
			versionProducto.setNombre(producto.getNombre());
			versionProducto.setObservacion("Producto reci\u00e9n registrado en la base de datos");
			versionProducto.setFechaRegistro(new Date());
			
			crearVersionProducto(versionProducto);

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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#modificarProducto(com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ProductoTO)
	 */
	public boolean modificarProducto(ProductoTO producto, VersionProductoTO versionProducto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		ProductoDO productoProv = getProductoTransf().transferirTODO(producto);

		try {

			ProductoDO productoMod = getProductoDAO().modificar(productoProv);
			if(productoMod == null){
				throw new RecursoExcepcion("fallo.modificaci\u00f3n.producto");
			}

			
			crearVersionProducto(versionProducto);
			
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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#eliminarProducto(java.lang.Long)
	 */
	public boolean eliminarProducto(Long idProducto) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idProducto == null) {
			throw new ValidacionExcepcion("falta.identificador.producto");
		}

		try {

			boolean res = getProductoDAO().eliminar(idProducto);

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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#listarTodoProducto(java.lang.Long)
	 */
	public List<ProductoTO> listarTodoProducto(Long idObjetivo) throws PrecondicionExcepcion, ValidacionExcepcion {

		if (idObjetivo == null) {
			throw new ValidacionExcepcion("falta.identificador.objetivo");
		}

		List<ProductoDO> productoLista = getProductoDAO().listarTodo(idObjetivo);

		if (productoLista == null || productoLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.producto");
		}

		ProductoTO productoTO = null;
		List<ProductoTO> productoTOLista = new ArrayList<ProductoTO>(productoLista.size());
		for (ProductoDO prod : productoLista) {

			productoTO = getProductoTransf().transferirDOTO(prod);
			productoTOLista.add(productoTO);
		}

		return productoTOLista;


	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#seleccionPorNombreCodigoProducto(java.lang.Long, java.lang.String)
	 */
	public List<ProductoTO> seleccionPorNombreCodigoProducto(Long idObjetivo, String parteNombreCodigo) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idObjetivo == null) {
			throw new ValidacionExcepcion("falta.identificador.objetivo");
		}

		if (parteNombreCodigo == null || parteNombreCodigo.trim().isEmpty()) {
			throw new ValidacionExcepcion("falta.nombre.codigo.producto");
		}

		List<ProductoDO> productoLista = getProductoDAO().seleccionPorNombreCodigo(idObjetivo, parteNombreCodigo);

		if (productoLista == null || productoLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.producto");
		}

		ProductoTO productoTO = null;
		List<ProductoTO> productoTOLista = new ArrayList<ProductoTO>(productoLista.size());
		for (ProductoDO prod : productoLista) {

			productoTO = getProductoTransf().transferirDOTO(prod);
			productoTOLista.add(productoTO);
		}

		return productoTOLista;

	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#seleccionPorObjetivoPorEstadoProducto(java.lang.Long, int)
	 */
	public List<ProductoTO> seleccionPorObjetivoPorEstadoProducto(Long idObjetivo, int estado) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idObjetivo == null) {
			throw new ValidacionExcepcion("falta.identificador.objetivo");
		}

		if (estado <= 0) {
			throw new ValidacionExcepcion("falta.estado.producto");
		}

		List<ProductoDO> productoLista = getProductoDAO().seleccionPorObjetivoPorEstado(idObjetivo, estado);

		if (productoLista == null || productoLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.producto");
		}

		ProductoTO productoTO = null;
		List<ProductoTO> productoTOLista = new ArrayList<ProductoTO>(productoLista.size());
		for (ProductoDO prod : productoLista) {

			productoTO = getProductoTransf().transferirDOTO(prod);
			productoTOLista.add(productoTO);
		}

		return productoTOLista;


	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#cargarVersionActividad(java.lang.Long)
	 */
	public VersionActividadTO cargarVersionActividad(Long idVersionActividad) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		VersionActividadTO versionActividadTO = null;
		VersionActividadDO versionActividadDO = null;

		if (idVersionActividad == null) {
			throw new ValidacionExcepcion("falta.id.version.actividad");
		}

		versionActividadDO = getVersionActividadDAO().cargar(idVersionActividad);

		if (versionActividadDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.version.actividad");
		}

		versionActividadTO = getVersionActividadTransf().transferirDOTO(versionActividadDO);

		return versionActividadTO;


	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#crearVersionActividad(com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.VersionActividadTO)
	 */
	private Long crearVersionActividad(VersionActividadTO versionActividad)	throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(versionActividad == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.version.actividad")	;
		}
		

		VersionActividadDO versionActividadProv = null;
		Long idRegistrado = null;

		versionActividadProv = getVersionActividadTransf().transferirTODO(versionActividad);

		try {

			VersionActividadDO versionActividadReg = getVersionActividadDAO().persistir(versionActividadProv);

			if (versionActividadReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.version.actividad");
			}

			idRegistrado = versionActividadReg.getId();

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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#seleccionPorFechaVersionActividad(java.lang.Long, java.util.Date, java.util.Date)
	 */
	public List<VersionActividadTO> seleccionPorFechaVersionActividad(Long idActividad, Date fechaInicio, Date fechaFin) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idActividad == null) {
			throw new ValidacionExcepcion("falta.identificador.actividad");
		}

		if (fechaInicio == null || fechaFin == null) {
			throw new ValidacionExcepcion("falta.fecha.inicio.fin");
		}

		if ((fechaInicio.after(fechaFin))) {
			throw new ValidacionExcepcion("error.rango.fechas");
		}

		List<VersionActividadDO> versionActividadLista = getVersionActividadDAO().seleccionPorFecha(idActividad, fechaInicio, fechaFin);

		if (versionActividadLista == null || versionActividadLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.version.actividad");
		}

		VersionActividadTO versionActividadTO = null;
		List<VersionActividadTO> versionActividadTOLista = new ArrayList<VersionActividadTO>(versionActividadLista.size());
		for (VersionActividadDO verAct : versionActividadLista) {

			versionActividadTO = getVersionActividadTransf().transferirDOTO(verAct);
			versionActividadTOLista.add(versionActividadTO);
		}

		return versionActividadTOLista;

	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#cargarVersionEntregable(java.lang.Long)
	 */
	public VersionEntregableTO cargarVersionEntregable(Long idVersionEntregable) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {


		VersionEntregableTO versionEntregableTO = null;
		VersionEntregableDO versionEntregableDO = null;

		if (idVersionEntregable == null) {
			throw new ValidacionExcepcion("falta.id.entregable");
		}

		versionEntregableDO = getVersionEntregableDAO().cargar(idVersionEntregable);

		if (versionEntregableDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.entregable");
		}

		versionEntregableTO = getVersionEntregableTransf().transferirDOTO(versionEntregableDO);

		return versionEntregableTO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#crearVersionEntregable(com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.VersionEntregableTO)
	 */
	private Long crearVersionEntregable(VersionEntregableTO versionEntregable) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(versionEntregable == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.version.entregable")	;
		}
		

		VersionEntregableDO versionEntregableProv = null;
		Long idRegistrado = null;

		versionEntregableProv = getVersionEntregableTransf().transferirTODO(versionEntregable);

		try {

			VersionEntregableDO versionEntregableReg = getVersionEntregableDAO().persistir(versionEntregableProv);

			if (versionEntregableReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.version.entregable");
			}

			idRegistrado = versionEntregableReg.getId();

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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#seleccionPorFechaVersionEntregable(java.lang.Long, java.util.Date, java.util.Date)
	 */
	public List<VersionEntregableTO> seleccionPorFechaVersionEntregable(Long idEntregable, Date fechaInicio, Date fechaFin)	throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idEntregable == null) {
			throw new ValidacionExcepcion("falta.identificador.entregable");
		}

		if (fechaInicio == null || fechaFin == null) {
			throw new ValidacionExcepcion("falta.fecha.inicio.fin");
		}

		if ((fechaInicio.after(fechaFin))) {
			throw new ValidacionExcepcion("error.rango.fechas");
		}

		List<VersionEntregableDO> versionEntregableLista = getVersionEntregableDAO().seleccionPorFecha(idEntregable, fechaInicio, fechaFin);

		if (versionEntregableLista == null || versionEntregableLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.version.entregable");
		}

		VersionEntregableTO versionEntregableTO = null;
		List<VersionEntregableTO> versionEntregableTOLista = new ArrayList<VersionEntregableTO>(versionEntregableLista.size());
		for (VersionEntregableDO verEntre : versionEntregableLista) {

			versionEntregableTO = getVersionEntregableTransf().transferirDOTO(verEntre);
			versionEntregableTOLista.add(versionEntregableTO);
		}

		return versionEntregableTOLista;
	}



	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#cargarVersionObjetivo(java.lang.Long)
	 */
	public VersionObjetivoTO cargarVersionObjetivo(Long idVersionObjetivo) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		VersionObjetivoTO versionObjetivoTO = null;
		VersionObjetivoDO versionObjetivoDO = null;

		if (idVersionObjetivo == null) {
			throw new ValidacionExcepcion("falta.id.objetivo");
		}

		versionObjetivoDO = getVersionObjetivoDAO().cargar(idVersionObjetivo);

		if (versionObjetivoDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.objetivo");
		}

		versionObjetivoTO = getVersionObjetivoTransf().transferirDOTO(versionObjetivoDO);

		return versionObjetivoTO;


	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#crearVersionObjetivo(com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.VersionObjetivoTO)
	 */
	private Long crearVersionObjetivo(VersionObjetivoTO versionObjetivo)	throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		if(versionObjetivo == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.version.objetivo")	;
		}
		

		VersionObjetivoDO versionObjetivoProv = null;
		Long idRegistrado = null;

		versionObjetivoProv = getVersionObjetivoTransf().transferirTODO(versionObjetivo);

		try {

			VersionObjetivoDO versionObjetivoReg = getVersionObjetivoDAO().persistir(versionObjetivoProv);

			if (versionObjetivoReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.version.objetivo");
			}

			idRegistrado = versionObjetivoReg.getId();

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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#seleccionPorFechaVersionObjetivo(java.lang.Long, java.util.Date, java.util.Date)
	 */
	public List<VersionObjetivoTO> seleccionPorFechaVersionObjetivo(Long idObjetivo, Date fechaInicio, Date fechaFin) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idObjetivo == null) {
			throw new ValidacionExcepcion("falta.identificador.objetivo");
		}

		if (fechaInicio == null || fechaFin == null) {
			throw new ValidacionExcepcion("falta.fecha.inicio.fin");
		}

		if ((fechaInicio.after(fechaFin))) {
			throw new ValidacionExcepcion("error.rango.fechas");
		}

		List<VersionObjetivoDO> versionObjetivoLista = getVersionObjetivoDAO().seleccionPorFecha(idObjetivo, fechaInicio, fechaFin);

		if (versionObjetivoLista == null || versionObjetivoLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.version.objetivo");
		}

		VersionObjetivoTO versionObjetivoTO = null;
		List<VersionObjetivoTO> versionObjetivoTOLista = new ArrayList<VersionObjetivoTO>(versionObjetivoLista.size());
		for (VersionObjetivoDO verObj : versionObjetivoLista) {

			versionObjetivoTO = getVersionObjetivoTransf().transferirDOTO(verObj);
			versionObjetivoTOLista.add(versionObjetivoTO);
		}

		return versionObjetivoTOLista;
	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#cargarVersionProducto(java.lang.Long)
	 */
	public VersionProductoTO cargarVersionProducto(Long idVersionProducto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		VersionProductoTO versionProductoTO = null;
		VersionProductoDO versionProductoDO = null;

		if (idVersionProducto == null) {
			throw new ValidacionExcepcion("falta.id.producto");
		}

		versionProductoDO = getVersionProductoDAO().cargar(idVersionProducto);

		if (versionProductoDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.producto");
		}

		versionProductoTO = getVersionProductoTransf().transferirDOTO(versionProductoDO);

		return versionProductoTO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#crearVersionProducto(com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.VersionProductoTO)
	 */
	private Long crearVersionProducto(VersionProductoTO versionProducto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		if(versionProducto == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.version.producto")	;
		}
		

		VersionProductoDO versionProductoProv = null;
		Long idRegistrado = null;

		versionProductoProv = getVersionProductoTransf().transferirTODO(versionProducto);

		try {

			VersionProductoDO versionProductoReg = getVersionProductoDAO().persistir(versionProductoProv);

			if (versionProductoReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.version.producto");
			}

			idRegistrado = versionProductoReg.getId();

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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.actividad.IActividadServicio#seleccionPorFechaVersionProducto(java.lang.Long, java.util.Date, java.util.Date)
	 */
	public List<VersionProductoTO> seleccionPorFechaVersionProducto(Long idProducto, Date fechaInicio, Date fechaFin) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idProducto == null) {
			throw new ValidacionExcepcion("falta.identificador.producto");
		}

		if (fechaInicio == null || fechaFin == null) {
			throw new ValidacionExcepcion("falta.fecha.inicio.fin");
		}

		if ((fechaInicio.after(fechaFin))) {
			throw new ValidacionExcepcion("error.rango.fechas");
		}

		List<VersionProductoDO> versionProductoLista = getVersionProductoDAO().seleccionPorFecha(idProducto, fechaInicio, fechaFin);

		if (versionProductoLista == null || versionProductoLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.version.producto");
		}

		VersionProductoTO versionProductoTO = null;
		List<VersionProductoTO> versionProductoTOLista = new ArrayList<VersionProductoTO>(versionProductoLista.size());
		for (VersionProductoDO verProd : versionProductoLista) {

			versionProductoTO = getVersionProductoTransf().transferirDOTO(verProd);
			versionProductoTOLista.add(versionProductoTO);
		}

		return versionProductoTOLista;

	}




}
