/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server;


import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.CiudadDO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.DepartamentoDO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.PaisDO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao.ICiudadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao.IDepartamentoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao.IPaisDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.ICiudadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.IDepartamentoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.IPaisTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;



@Service
public class LocalidadServicioImpl extends RemoteServiceServlet implements ILocalidadServicio{

	/**
	 * 
	 */
	private static final long serialVersionUID = 725993082081202706L;



	private IPaisDAO getPaisDAO() {
		return  DAOFactory.getInstance().getPaisDao();
	}

	private IDepartamentoDAO getDepartamentoDAO() {
		return DAOFactory.getInstance().getDepartamentoDao();
	}

	private ICiudadDAO getCiudadDAO() {
		return DAOFactory.getInstance().getCiudadDao();
	}

	private IPaisTransf getPaisTransf() {
		return TransfFactory.getInstance().getPaisTransf();
	}

	private IDepartamentoTransf getDepartamentoTransf() {
		return TransfFactory.getInstance().getDepartamentoTransf();
	}

	private ICiudadTransf getCiudadTransf() {
		return TransfFactory.getInstance().getCiudadTransf();
	}

	public void init() {

	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springapp.servicio.ISeguridadServicio#crearPais(com.cpcoriente.cidecuero.springapp.localidad.objeto.PaisTO)
	 */
	public Long crearPais(PaisTO pais) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		if(pais == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.pa\u00eds")	;
		}

		if(pais.getCodigo() == null || pais.getCodigo().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.c\u00f3digo.pa\u00eds")	;
		}

		if(pais.getNombre() == null || pais.getNombre().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.nombre.pa\u00eds")	;
		}

		PaisDO paisProv = null;

		Long idRegistrado = null;

		paisProv = getPaisTransf().transferirTODO(pais);

		try {

			PaisDO paisReg = getPaisDAO().persistir(paisProv);
			if (paisReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.pa\u00eds");
			}

			idRegistrado = paisReg.getId();

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
	 * @see com.cpcoriente.cidecuero.springapp.servicio.ISeguridadServicio#crearDpto(com.cpcoriente.cidecuero.springapp.localidad.objeto.DepartamentoTO)
	 */
	public Long crearDpto(DepartamentoTO dpto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		if(dpto == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.dpto")	;
		}
		if(dpto.getCodigo() == null || dpto.getCodigo().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.c\u00f3digo.dpto")	;
		}
		if(dpto.getNombre() == null || dpto.getNombre().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.nombre.dpto")	;
		}

		DepartamentoDO dptoProv = null;
		Long idRegistrado = null;

		dptoProv = getDepartamentoTransf().transferirTODO(dpto);


		try {

			DepartamentoDO dptoReg = getDepartamentoDAO().persistir(dptoProv);
			if (dptoReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.dpto");
			}

			idRegistrado = dptoReg.getId();

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
	 * @see com.cpcoriente.cidecuero.springapp.servicio.ISeguridadServicio#crearCiudad(com.cpcoriente.cidecuero.springapp.localidad.objeto.CiudadTO)
	 */
	public Long crearCiudad(CiudadTO ciudad) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		if(ciudad == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.ciudad")	;
		}
		if(ciudad.getCodigo() == null || ciudad.getCodigo().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.c\u00f3digo.ciudad")	;
		}
		if(ciudad.getNombre() == null || ciudad.getNombre().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.nombre.ciudad")	;
		}

		CiudadDO ciudadProv = null;
		Long idRegistrado = null;

		ciudadProv = getCiudadTransf().transferirTODO(ciudad);

		try {

			CiudadDO ciudaadReg = getCiudadDAO().persistir(ciudadProv);

			if (ciudaadReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.ciudad");
			}

			idRegistrado = ciudaadReg.getId();

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
	 * @see com.cpcoriente.cidecuero.springapp.servicio.ISeguridadServicio#modificarPais(com.cpcoriente.cidecuero.springapp.localidad.objeto.PaisTO)
	 */
	public boolean modificarPais(PaisTO pais) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		if (pais == null) {
			throw new ValidacionExcepcion("falta.informaci\u00f3n.pa\u00eds");
		}

		if (pais.getId() == null) {
			throw new ValidacionExcepcion("falta.identificador.pa\u00eds");
		}
		if(pais.getCodigo() == null || pais.getCodigo().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.c\u00f3digo.pa\u00eds")	;
		}
		if (pais.getNombre() == null || pais.getNombre().trim().isEmpty()) {
			throw new ValidacionExcepcion("falta.nombre.pa\u00eds");
		}


		try {

			PaisDO paisProv = getPaisDAO().cargar(pais.getId());
			if (paisProv == null) {
				throw new PrecondicionExcepcion("inexistente.identificador.pa\u00eds");
			}

			paisProv = getPaisTransf().transferirTODO(pais);
			PaisDO paisMod = getPaisDAO().modificar(paisProv);
			if(paisMod == null){
				throw new RecursoExcepcion("fallo.modificaci\u00f3n.pa\u00eds");
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
	 * @see com.cpcoriente.cidecuero.springapp.servicio.ISeguridadServicio#modificarDpto(com.cpcoriente.cidecuero.springapp.localidad.objeto.DepartamentoTO)
	 */
	public boolean modificarDpto(DepartamentoTO dpto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion{

		if (dpto == null) {
			throw new ValidacionExcepcion("falta.informaci\u00f3n.dpto");
		}
		if (dpto.getId() == null) {
			throw new ValidacionExcepcion("falta.identificador.dpto");
		}
		if(dpto.getCodigo() == null || dpto.getCodigo().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.c\u00f3digo.dpto")	;
		}
		if (dpto.getNombre() == null || dpto.getNombre().trim().isEmpty()) {
			throw new ValidacionExcepcion("falta.nombre.dpto");
		}

		DepartamentoDO dptoProv = getDepartamentoDAO().cargar(dpto.getId());
		if (dptoProv == null) {
			throw new PrecondicionExcepcion("inexistente.identificador.dpto");
		}

		dptoProv = getDepartamentoTransf().transferirTODO(dpto);

		try {

			DepartamentoDO dptoMod = getDepartamentoDAO().modificar(dptoProv);
			if(dptoMod == null){
				throw new RecursoExcepcion("fallo.modificaci\u00f3n.dpto");
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
	 * @see com.cpcoriente.cidecuero.springapp.servicio.ISeguridadServicio#modificarCiudad(com.cpcoriente.cidecuero.springapp.localidad.objeto.CiudadTO)
	 */
	public boolean modificarCiudad(CiudadTO ciudad) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		if (ciudad == null) {
			throw new ValidacionExcepcion("falta.informaci\u00f3n.ciudad");
		}
		if (ciudad.getId() == null) {
			throw new ValidacionExcepcion("falta.identificador.ciudad");
		}
		if(ciudad.getCodigo() == null || ciudad.getCodigo().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.c\u00f3digo.ciudad")	;
		}
		if (ciudad.getNombre() == null || ciudad.getNombre().trim().isEmpty()) {
			throw new ValidacionExcepcion("falta.nombre.ciudad");
		}

		CiudadDO ciudadProv = getCiudadDAO().cargar(ciudad.getId());
		if (ciudadProv == null) {
			throw new PrecondicionExcepcion("inexistente.identificador.ciudad");
		}

		ciudadProv = getCiudadTransf().transferirTODO(ciudad);

		try {

			CiudadDO ciudadMod = getCiudadDAO().modificar(ciudadProv);
			if(ciudadMod == null){
				throw new RecursoExcepcion("fallo.modificaci\u00f3n.ciudad");
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
	 * @see com.cpcoriente.cidecuero.springapp.servicio.ISeguridadServicio#eliminarPais(java.lang.String)
	 */

	public boolean eliminarPais(Long idPaisActual) throws ValidacionExcepcion, PrecondicionExcepcion {
		if (idPaisActual == null) {
			throw new ValidacionExcepcion("falta.identificador.pa\u00eds");
		}

		try {
			PaisDO pais = null;
			pais = getPaisDAO().cargar(idPaisActual);
			if (pais == null) {
				throw new PrecondicionExcepcion("inexistente.identificador.pa\u00eds");
			}
			boolean res = getPaisDAO().eliminar(idPaisActual);

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
	 * @see com.cpcoriente.cidecuero.springapp.servicio.ISeguridadServicio#eliminarDpto(java.lang.String)
	 */
	public boolean eliminarDpto(Long idDptoActual) throws ValidacionExcepcion, PrecondicionExcepcion {
		if (idDptoActual == null) {
			throw new ValidacionExcepcion("falta.identificador.dpto");
		}

		try {
			DepartamentoDO dpto = null;
			dpto = getDepartamentoDAO().cargar(idDptoActual);
			if (dpto == null) {
				throw new PrecondicionExcepcion("inexistente.identificador.dpto");
			}
			boolean res = getDepartamentoDAO().eliminar(idDptoActual);

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
	 * @see com.cpcoriente.cidecuero.springapp.servicio.ISeguridadServicio#eliminarCiudad(java.lang.String)
	 */
	public boolean eliminarCiudad(Long idCiudadActual) throws ValidacionExcepcion, PrecondicionExcepcion {
		if (idCiudadActual == null) {
			throw new ValidacionExcepcion("falta.identificador.ciudad");
		}

		try {
			CiudadDO ciudad = null;
			ciudad = getCiudadDAO().cargar(idCiudadActual);
			if (ciudad == null) {
				throw new PrecondicionExcepcion("inexistente.identificador.ciudad");
			}
			boolean res = getCiudadDAO().eliminar(idCiudadActual);

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
	 * @see com.cpcoriente.cidecuero.springapp.servicio.ISeguridadServicio#listarTodosPais()
	 */
	public List<PaisTO> listarTodosPais() throws PrecondicionExcepcion {


		List<PaisDO> paisLista = getPaisDAO().listarTodo();

		if (paisLista == null || paisLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.pa\u00eds");
		}

		PaisTO paisTO = null;
		List<PaisTO> paisTOLista = new ArrayList<PaisTO>(paisLista.size());
		for (PaisDO pais : paisLista) {

			paisTO = getPaisTransf().transferirDOTO(pais);
			paisTOLista.add(paisTO);
		}
		System.out.println("se han encontrado "+paisTOLista.size()+" YA FUERON TRANSFORMADOS A TO");
		return paisTOLista;
	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springapp.servicio.ISeguridadServicio#listarTodosDpto()
	 */
	public List<DepartamentoTO> listarTodosDpto() throws PrecondicionExcepcion {

		List<DepartamentoDO> dptoLista = getDepartamentoDAO().listarTodo();
		if (dptoLista == null || dptoLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.dpto");
		}

		DepartamentoTO dptoTO = null;
		List<DepartamentoTO> dptoTOLista = new ArrayList<DepartamentoTO>(dptoLista.size());
		for (DepartamentoDO dpto : dptoLista) {
			dptoTO = getDepartamentoTransf().transferirDOTO(dpto);
			dptoTOLista.add(dptoTO);
		}

		return dptoTOLista;
	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springapp.servicio.ISeguridadServicio#listarTodosCiudad()
	 */
	public List<CiudadTO> listarTodosCiudad() throws PrecondicionExcepcion {

		List<CiudadDO> ciudadLista = getCiudadDAO().listarTodo();
		if (ciudadLista == null || ciudadLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.ciudad");
		}

		CiudadTO ciudadTO = null;
		List<CiudadTO> ciudadTOLista = new ArrayList<CiudadTO>(ciudadLista.size());
		for (CiudadDO ciu : ciudadLista) {
			ciudadTO = getCiudadTransf().transferirDOTO(ciu);
			ciudadTOLista.add(ciudadTO);
		}

		return ciudadTOLista;
	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springapp.servicio.ISeguridadServicio#buscarPaisPorNombre(java.lang.String)
	 */
	public List<PaisTO> buscarPaisPorNombre(String parteNombre) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (parteNombre == null || parteNombre.trim().isEmpty()) {
			throw new ValidacionExcepcion("falta.nombre.pa\u00eds");
		}

		List<PaisDO> paisLista = getPaisDAO().seleccionPorNombre(parteNombre);
		if (paisLista == null || paisLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.pa\u00eds.con.nombre");
		}

		PaisTO paisTO = null;
		List<PaisTO> paisTOLista = new ArrayList<PaisTO>(paisLista.size());
		for (PaisDO pais : paisLista) {
			paisTO = getPaisTransf().transferirDOTO(pais);
			paisTOLista.add(paisTO);
		}

		return paisTOLista;
	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springapp.servicio.ISeguridadServicio#buscarDptoPorNombre(java.lang.String)
	 */
	public List<DepartamentoTO> buscarDptoPorNombre(Long idPais, String parteNombre) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idPais == null ) {
			throw new ValidacionExcepcion("falta.id.pa\u00eds");
		}

		if (parteNombre == null || parteNombre.trim().isEmpty()) {
			throw new ValidacionExcepcion("falta.nombre.dpto");
		}

		List<DepartamentoDO> dptoLista = getDepartamentoDAO().seleccionPorNombre(idPais, parteNombre);
		if (dptoLista == null || dptoLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.dpto.con.nombre");
		}

		DepartamentoTO dptoTO = null;
		List<DepartamentoTO> dptoTOLista = new ArrayList<DepartamentoTO>(dptoLista.size());
		for (DepartamentoDO dpto : dptoLista) {
			dptoTO = getDepartamentoTransf().transferirDOTO(dpto);
			dptoTOLista.add(dptoTO);
		}

		return dptoTOLista;
	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springapp.servicio.ISeguridadServicio#buscarPCiudadPorNombre(java.lang.String)
	 */
	public List<CiudadTO> buscarCiudadPorNombre(Long idDpto, String parteNombre) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idDpto == null) {
			throw new ValidacionExcepcion("falta.id.departamento");
		}

		if (parteNombre == null || parteNombre.trim().isEmpty() ) {
			throw new ValidacionExcepcion("falta.nombre.ciudad");
		}

		List<CiudadDO> ciudadLista = getCiudadDAO().seleccionPorNombre(idDpto, parteNombre);
		if (ciudadLista == null || ciudadLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.ciudad.con.nombre");
		}

		CiudadTO ciudadTO = null;
		List<CiudadTO> ciudadTOLista = new ArrayList<CiudadTO>(ciudadLista.size());
		for (CiudadDO ciu : ciudadLista) {
			ciudadTO = getCiudadTransf().transferirDOTO(ciu);
			ciudadTOLista.add(ciudadTO);
		}

		return ciudadTOLista;
	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springapp.servicio.ISeguridadServicio#listarDptoPorPais(java.lang.String)
	 */
	public List<DepartamentoTO> listarDptoPorPais(Long idPais) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idPais == null) {
			throw new ValidacionExcepcion("falta.id.pa\u00eds");
		}

		List<DepartamentoDO> dptoLista = getDepartamentoDAO().seleccionPorPais(idPais);
		if (dptoLista == null || dptoLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.dpto.con.pa\u00eds");
		}

		DepartamentoTO dptoTO = null;
		List<DepartamentoTO> dptoTOLista = new ArrayList<DepartamentoTO>(dptoLista.size());
		for (DepartamentoDO dpto : dptoLista) {
			dptoTO = getDepartamentoTransf().transferirDOTO(dpto);
			dptoTOLista.add(dptoTO);
		}

		return dptoTOLista;
	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springapp.servicio.ISeguridadServicio#listarCiudadPorDpto(java.lang.String)
	 */
	public List<CiudadTO> listarCiudadPorDpto(Long idDpto) throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idDpto == null) {
			throw new ValidacionExcepcion("falta.id.dpto");
		}

		List<CiudadDO> ciudadLista = getCiudadDAO().seleccionPorDpto(idDpto);
		if (ciudadLista == null || ciudadLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.ciudad.con.departamento");
		}

		CiudadTO ciudadTO = null;
		List<CiudadTO> ciudadTOLista = new ArrayList<CiudadTO>(ciudadLista.size());
		for (CiudadDO ciu : ciudadLista) {
			ciudadTO = getCiudadTransf().transferirDOTO(ciu);
			ciudadTOLista.add(ciudadTO);
		}

		return ciudadTOLista;
	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springapp.interfaces.servicio.ILocalidadServicio#cargarPais(long)
	 */
	public PaisTO cargarPais(Long paisId) throws ValidacionExcepcion, PrecondicionExcepcion {
		PaisTO paisTO = null;
		PaisDO paisDO = null;

		if (paisId == null) {
			throw new ValidacionExcepcion("falta.id.pa\u00eds");
		}

		paisDO = getPaisDAO().cargar(paisId);

		if (paisDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.pa\u00eds");
		}

		paisTO = getPaisTransf().transferirDOTO(paisDO);
		return paisTO;
	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springapp.interfaces.servicio.ILocalidadServicio#cargarDpto(long)
	 */
	public DepartamentoTO cargarDpto(Long dptoId) throws ValidacionExcepcion, PrecondicionExcepcion {

		DepartamentoTO dptoTO = null;
		DepartamentoDO dptoDO = null;

		if (dptoId == null) {
			throw new ValidacionExcepcion("falta.id.dpto");
		}

		dptoDO = getDepartamentoDAO().cargar(dptoId);

		if (dptoDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.dpto");
		}

		dptoTO = getDepartamentoTransf().transferirDOTO(dptoDO);
		return dptoTO;
	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springapp.interfaces.servicio.ILocalidadServicio#cargarCiudad(java.lang.String)
	 */
	public CiudadTO cargarCiudad(Long ciudadId) throws ValidacionExcepcion, PrecondicionExcepcion {
		CiudadTO ciudadTO = null;
		CiudadDO ciudadDO = null;

		if (ciudadId == null) {
			throw new ValidacionExcepcion("falta.id.ciudad");
		}

		ciudadDO = getCiudadDAO().cargar(ciudadId);

		if (ciudadDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.ciudad");
		}

		ciudadTO = getCiudadTransf().transferirDOTO(ciudadDO);
		return ciudadTO;
	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springgwt.MrpCrrmM.client.ILocalidadServicio#importarPaisesDB(java.lang.String)
	 */
	public boolean importarPaisesDB(String rutaArchivo) {
		boolean importar = false;

		importar = getPaisDAO().importarPaises(rutaArchivo);
		return importar;
	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springgwt.MrpCrrmM.client.ILocalidadServicio#importarDptosDB(java.lang.String)
	 */
	public boolean importarDptosDB(String rutaArchivo) {
		boolean importar = false;

		importar = getDepartamentoDAO().importarDepartamentos(rutaArchivo);
		return importar;
	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springgwt.MrpCrrmM.client.ILocalidadServicio#importarCiudadesDB(java.lang.String)
	 */
	public boolean importarCiudadesDB(String rutaArchivo) {
		boolean importar = false;

		importar = getCiudadDAO().importarCiudades(rutaArchivo);
		return importar;
	}

}