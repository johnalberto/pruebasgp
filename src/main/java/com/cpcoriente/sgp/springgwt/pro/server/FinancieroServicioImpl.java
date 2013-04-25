package com.cpcoriente.sgp.springgwt.pro.server;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.cpcoriente.sgp.springgwt.pro.client.contabilidad.IContabilidadServicio;
import com.cpcoriente.sgp.springgwt.pro.client.financiero.IFinancieroServicio;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IActividadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.interfaces.dao.IMovimientoContableDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.ActividadEconomicaDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.DivisionDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IActividadEconomicaDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.ServicioFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RecursoDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RecursoDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RubroDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RubroProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.UnidadDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.VersionRecursoDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.VersionRecursoDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IRecursoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IRecursoDetalleDAO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IRubroDAO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IRubroProyectoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IUnidadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IVersionRecursoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IVersionRecursoDetalleDAO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IProyectoDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IActividadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IMovimientoContableTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.MovimientoContableTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IActividadEconomicaTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IRecursoDetalleTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IRecursoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IRubroProyectoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IRubroTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IUnidadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IVersionRecursoDetalleTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IVersionRecursoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RecursoDetalleTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RecursoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RubroProyectoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RubroTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.UnidadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.VersionRecursoDetalleTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.VersionRecursoTO;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@Service
public class FinancieroServicioImpl extends RemoteServiceServlet implements IFinancieroServicio {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void init() {

	}
	
	private IRecursoDAO getRecursoDAO() {
		
		return  DAOFactory.getInstance().getRecursoDao();
	}

	private IRecursoTransf getRecursoTransf() {
		return TransfFactory.getInstance().getRecursoTransf();
	}

	
	private IRubroDAO getRubroDAO() {
		
		return  DAOFactory.getInstance().getRubroDao();
	}


	private IRubroTransf getRubroTransf() {
		return TransfFactory.getInstance().getRubroTransf();
	}

	
	private IRecursoDetalleDAO getRecursoDetDAO() {
		
		return  DAOFactory.getInstance().getRecursoDetalleDao();
	}

	private IRecursoDetalleTransf getRecursoDetTransf() {
		return TransfFactory.getInstance().getRecursoDetalleTransf();
	}
	
	private IMovimientoContableDAO getMovimientoDAO() {
		
		return  DAOFactory.getInstance().getMovimientoContableDao();
	}

	private IMovimientoContableTransf getMovimientoTransf() {
		return TransfFactory.getInstance().getMovimientoContableTransf();
	}

	
	private IContabilidadServicio getMovimientoServicio() {
		
		return ServicioFactory.getInstance().getContabilidadServicio();
	}

	
	private IRubroProyectoTransf getRubroProyectoTransf() {
		return TransfFactory.getInstance().getRubroProyectoTransf();
	}

	
	private IRubroProyectoDAO getRubroProyectoDAO() {
		
		return  DAOFactory.getInstance().getRubroProyectoDao();
	}

	
	private IUnidadTransf getUnidadTransf() {
		return TransfFactory.getInstance().getUnidadTransf();
	}

	
	private IUnidadDAO getUnidadDAO() {
		
		return  DAOFactory.getInstance().getUnidadDao();
	}

	private IVersionRecursoTransf getVersionRecursoTransf() {
		return TransfFactory.getInstance().getVersionRecursoTransf();
	}

	
	private IVersionRecursoDAO getVersionRecursoDAO() {
		
		return  DAOFactory.getInstance().getVersionRecursoDao();
	}
	
	private IVersionRecursoDetalleTransf getVersionRecursoDetTransf() {
		return TransfFactory.getInstance().getVersionRecDetTransf();
	}

	
	private IVersionRecursoDetalleDAO getVersionRecursoDetDAO() {
		
		return  DAOFactory.getInstance().getVersionRecDetDao();
	}
		
	public Long crearRecurso(RecursoTO recurso) throws ValidacionExcepcion,
			RecursoExcepcion, PrecondicionExcepcion {
		
		
		if(recurso == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.recurso")	;
		}
		
				
		if(recurso.getActividad() == null || recurso.getActividad().getId()==null  ){
			throw new ValidacionExcepcion("falta.identificador.actividad")	;
		}

		
		
		if(recurso.getDescripcion() == null || 
		   recurso.getDescripcion().trim().isEmpty() || 
		   recurso.getDescripcion().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.descripcion")	;
		}

		
		if(recurso.getRecDetList() == null || 
				recurso.getRecDetList().size()==0 ){
					
			throw new ValidacionExcepcion("falta.lista.detalle.recurso")	;
		}

		

		try {

			RecursoDO recProv = new RecursoDO();
			
			boolean detallesRes =false;
			
			Long idRegistrado = null;

			recProv =getRecursoTransf().transferirTODO(recurso);
			
			
			
			RecursoDO recReg = getRecursoDAO().persistir(recProv);
			
			if (recReg == null) {
				
				throw new RecursoExcepcion("fallo.creaci\u00f3n.actividad.economica");
			}
			else{
				
				detallesRes = getRecursoDetDAO().persistirList(recProv.getRecDetalleSet());
				
			}
			
			if (detallesRes==false) {
				
				throw new RecursoExcepcion("fallo.creaci\u00f3n.lista.detalle.recursos");

			}

			idRegistrado = recReg.getId();

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

	public Long crearRecursoDetalle(RecursoDetalleTO detalle)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(detalle == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.recurso")	;
		}
		
				
		if(detalle.getEntProyecto() == null || detalle.getEntProyecto().getId()==null  ){
			
			throw new ValidacionExcepcion("falta.entidad")	;
		}

		if(detalle.getRecurso() == null || detalle.getRecurso().getId()!=null  ){
			
			throw new ValidacionExcepcion("falta.recurso")	;
		}

		if(detalle.getTipoAporte() == null  ){
			
			throw new ValidacionExcepcion("falta.tipo.aporte")	;
		}
		
		if(detalle.getValEfectivo() <0 ){
			
			throw new ValidacionExcepcion("falta.valor.efectivo")	;
		}
		
		if(detalle.getValEspecie() <0 ){
			
			throw new ValidacionExcepcion("falta.valor.especie")	;
		}


		try {

			RecursoDetalleDO recProv = new RecursoDetalleDO();
			
			boolean detallesRes =false;
			
			Long idRegistrado = null;

			recProv =  getRecursoDetTransf().transferirTODO(detalle);
			
			
			RecursoDetalleDO recReg = getRecursoDetDAO().persistir(recProv);
			
			if (recReg == null) {
				
				throw new RecursoExcepcion("fallo.creaci\u00f3n.recurso.detalle");
			}
			
			
			if (detallesRes==false) {
				
				throw new RecursoExcepcion("fallo.creaci\u00f3n.lista.detalle.recursos");

			}

			idRegistrado = recReg.getId();

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

	public Long crearRubro(RubroTO rubro) throws ValidacionExcepcion,
			RecursoExcepcion, PrecondicionExcepcion {
		
		if(rubro == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.division")	;
		}
		
		
		if(rubro.getCodigo() == null || rubro.getCodigo().trim().isEmpty() || rubro.getCodigo().contains(" ") ){
			throw new ValidacionExcepcion("falta.codigo")	;
		}
		
		if(rubro.getEntidad() == null || rubro.getEntidad().getId()==null ){
			throw new ValidacionExcepcion("falta.entidad")	;
		}

		
		if(rubro.getNombre() == null || rubro.getNombre().trim().isEmpty() || rubro.getNombre().contains(" ") ){
			throw new ValidacionExcepcion("falta.nombre")	;
		}
	
		

		try {

			
			RubroDO rubProv = new RubroDO();
			
			Long idRegistrado = null;

			rubProv = getRubroTransf().transferirTODO(rubro);
						
			RubroDO rubReg = getRubroDAO().persistir(rubProv);
			
			
			if (rubReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.division");
			}

			idRegistrado = rubReg.getId(); 

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

	public Long crearRubroProyecto(RubroProyectoTO rubroProyecto)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		
		if(rubroProyecto == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.division")	;
		}
		
		
		if(rubroProyecto.getProyecto() == null || rubroProyecto.getProyecto().getId()==null  ){
			throw new ValidacionExcepcion("falta.codigo")	;
		}
		
		if(rubroProyecto.getRubro() == null || rubroProyecto.getRubro().getId()==null ){
			throw new ValidacionExcepcion("falta.codigo")	;
		}


		try {

			
			RubroProyectoDO rubProv = new RubroProyectoDO();
			
			Long idRegistrado = null;

			rubProv = getRubroProyectoTransf().transferirTODO(rubroProyecto);
						
			RubroProyectoDO rubReg = getRubroProyectoDAO().persistir(rubProv); 
			
			
			if (rubReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.division");
			}

			idRegistrado = rubReg.getId(); 

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

	public Long crearUnidad(UnidadTO unidad) throws ValidacionExcepcion,
			RecursoExcepcion, PrecondicionExcepcion {
		
		if(unidad == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.division")	;
		}
		
		
		if(unidad.getAbreviatura() == null || unidad.getAbreviatura().trim().isEmpty() || unidad.getAbreviatura().contains(" ")  ){
			throw new ValidacionExcepcion("falta.codigo")	;
		}
		
		if(unidad.getNombre() == null || unidad.getNombre().trim().isEmpty() || unidad.getNombre().contains(" ")  ){
			throw new ValidacionExcepcion("falta.codigo")	;
		}


		try {

			
			UnidadDO uniProv = new UnidadDO();
			
			Long idRegistrado = null;

			uniProv = getUnidadTransf().transferirTODO(unidad); 
						
			UnidadDO rubReg = getUnidadDAO().persistir(uniProv); 
			
			
			if (rubReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.unidad");
			}

			idRegistrado = rubReg.getId(); 

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

	public Long crearVersionRecurso(VersionRecursoTO verRecurso)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(verRecurso == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.version.recurso")	;
		}
		
		
		if(verRecurso.getDescripcion() == null || verRecurso.getDescripcion().trim().isEmpty() || verRecurso.getDescripcion().contains(" ")  ){
			throw new ValidacionExcepcion("falta.descripcion")	;
		}
		
		if(verRecurso.getFechaRegistro() == null   ){
			throw new ValidacionExcepcion("falta.fecha.registro")	;
		}
		
		if(verRecurso.getObservacion() == null || verRecurso.getObservacion().trim().isEmpty() || verRecurso.getObservacion().contains(" ")  ){
			throw new ValidacionExcepcion("falta.observacion")	;
		}


		if(verRecurso.getRecurso().getId() == null   ){
			throw new ValidacionExcepcion("falta.recurso")	;
		}
		
		try {

			
			VersionRecursoDO verRecProv = new VersionRecursoDO();
			
			Long idRegistrado = null;

			verRecProv = getVersionRecursoTransf().transferirTODO(verRecurso); 
									
			VersionRecursoDO verRecReg = getVersionRecursoDAO().persistir(verRecProv);
			
			
			if (verRecReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.unidad");
			}

			idRegistrado = verRecReg.getId(); 

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

	public Long crearVersionRecursoDetalle(VersionRecursoDetalleTO verDetRecurso)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(verDetRecurso == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.version.recurso.detalle")	;
		}
		
		
		if(verDetRecurso.getObservacion() == null || verDetRecurso.getObservacion().trim().isEmpty() || verDetRecurso.getObservacion().contains(" ")  ){
			throw new ValidacionExcepcion("falta.observacion")	;
		}
		
		if(verDetRecurso.getFechaRegistro() == null   ){
			throw new ValidacionExcepcion("falta.fecha.registro")	;
		}
		
		if(verDetRecurso.getRecurso() == null || verDetRecurso.getRecurso() ==  null  ){
			throw new ValidacionExcepcion("falta.detalle.recurso")	;
		}
		
		if(verDetRecurso.getTipo() == null   ){
			throw new ValidacionExcepcion("falta.tipo")	;
		}

		if(verDetRecurso.getValorEfectivo() < 0   ){
			throw new ValidacionExcepcion("falta.valor.efectivo")	;
		}
		
		if(verDetRecurso.getValorEspecie() < 0   ){
			throw new ValidacionExcepcion("falta.valor.especie")	;
		}
		
		try {

			
			VersionRecursoDetalleDO verDetProv = new VersionRecursoDetalleDO();
			
			Long idRegistrado = null;

			verDetProv = getVersionRecursoDetTransf().transferirTODO(verDetRecurso); 
									
			VersionRecursoDetalleDO verRecReg = getVersionRecursoDetDAO().persistir(verDetProv);
			
			
			if (verRecReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.unidad");
			}

			idRegistrado = verRecReg.getId(); 

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

	public boolean modificarRecurso(RecursoTO recurso)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		
		if(recurso == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.recurso")	;
		}
		
		if(recurso.getId() == null  ){
			throw new ValidacionExcepcion("falta.identificador.recurso")	;
		}

		if(recurso.getActividad() == null || recurso.getActividad().getId()==null ){
			throw new ValidacionExcepcion("falta.actividad")	;
		}

		if(recurso.getDescripcion() == null || recurso.getDescripcion().trim().isEmpty() || recurso.getDescripcion().contains(" ") ){
			throw new ValidacionExcepcion("falta.descripcion")	;
		}

		if(recurso.getRubro() == null || recurso.getRubro().getId()==null ){
			
			throw new ValidacionExcepcion("falta.rubro")	;
		}
		
		
		if(recurso.getRubroProyecto() == null || recurso.getRubroProyecto().getId()==null ){
			
			throw new ValidacionExcepcion("falta.proyecto")	;
		}
		
				
		
		RecursoDO recProv = getRecursoDAO().cargar(recurso.getId());
		
		if (recProv == null) {
			throw new PrecondicionExcepcion("inexistente.identificador.actividad.economica");
		}

		recProv = getRecursoTransf().transferirTODO(recurso);
		
		try {
			
			RecursoDO recMod = getRecursoDAO().modificar(recProv);

			if (recMod == null) {
				throw new RecursoExcepcion("fallo.modificar.actividad.economica");
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


		}catch (RuntimeException e) {

			String error="";
			if(e.getCause().getMessage().contains("Row was updated or deleted by another transaction")){

				error="Este Registro fue Modificado en otra [Transacci\u00f3n] porfavor Actualice la busqueda y vuelva a intentar";
			}else{

				error = "error recursos de base de datos";

			}


			throw new PrecondicionExcepcion(error);
		}
		
	}

	public boolean modificarRecursoDetalle(RecursoDetalleTO detalle)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(detalle == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.detalle.curso")	;
		}
		
		if(detalle.getId() == null  ){
			throw new ValidacionExcepcion("falta.identificador.detalle.curso")	;
		}

		if(detalle.getEntProyecto() == null || detalle.getEntProyecto().getId()==null ){
			throw new ValidacionExcepcion("falta.entidad.proyecto")	;
		}

		if(detalle.getRecurso() == null || detalle.getRecurso().getId()==null ){
			throw new ValidacionExcepcion("falta.recurso")	;
		}

		if(detalle.getTipoAporte() == null  ){
			
			throw new ValidacionExcepcion("falta.tipo.aporte")	;
		}
		
		
		if(detalle.getValEfectivo()< 0 ){
			
			throw new ValidacionExcepcion("error.valor.efectivo")	;
		}
		
		if(detalle.getValEspecie() < 0 ){
			
			throw new ValidacionExcepcion("falta.valor.especie")	;
		}

				
		RecursoDetalleDO recProv = getRecursoDetDAO().cargar(detalle.getId());
		
		if (recProv == null) {
			throw new PrecondicionExcepcion("inexistente.identificador.recurso.detalle");
		}

		recProv = getRecursoDetTransf().transferirTODO(detalle); 
		
		try {
			
			RecursoDetalleDO recMod = getRecursoDetDAO().modificar(recProv);

			if (recMod == null) {
				throw new RecursoExcepcion("fallo.modificar.actividad.economica");
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


		}catch (RuntimeException e) {

			String error="";
			if(e.getCause().getMessage().contains("Row was updated or deleted by another transaction")){

				error="Este Registro fue Modificado en otra [Transacci\u00f3n] porfavor Actualice la busqueda y vuelva a intentar";
			}else{

				error = "error recursos de base de datos";

			}


			throw new PrecondicionExcepcion(error);
		}
	}

	public boolean modificarRubro(RubroTO rubro) throws ValidacionExcepcion,
			RecursoExcepcion, PrecondicionExcepcion {
		
	
//		if(rubro == null){
//			throw new ValidacionExcepcion("falta.informaci\u00f3n.detalle.curso")	;
//		}
//		
//		if(rubro.getId() == null  ){
//			throw new ValidacionExcepcion("falta.identificador.detalle.curso")	;
//		}
//
//		if(rubro.getCodigo() == null || rubro.getCodigo().trim().isEmpty() ){
//			throw new ValidacionExcepcion("falta.entidad.proyecto")	;
//		}
//
//		if(detalle.getRecurso() == null || detalle.getRecurso().getId()==null ){
//			throw new ValidacionExcepcion("falta.recurso")	;
//		}
//
//		if(detalle.getTipoAporte() == null  ){
//			
//			throw new ValidacionExcepcion("falta.tipo.aporte")	;
//		}
//		
//		
//		if(detalle.getValEfectivo()< 0 ){
//			
//			throw new ValidacionExcepcion("error.valor.efectivo")	;
//		}
//		
//		if(detalle.getValEspecie() < 0 ){
//			
//			throw new ValidacionExcepcion("falta.valor.especie")	;
//		}
//
//				
//		RecursoDetalleDO recProv = getRecursoDetDAO().cargar(detalle.getId());
//		
//		if (recProv == null) {
//			throw new PrecondicionExcepcion("inexistente.identificador.recurso.detalle");
//		}
//
//		recProv = getRecursoDetTransf().transferirTODO(detalle); 
//		
//		try {
//			
//			RecursoDetalleDO recMod = getRecursoDetDAO().modificar(recProv);
//
//			if (recMod == null) {
//				throw new RecursoExcepcion("fallo.modificar.actividad.economica");
//			}
//
//			return true;
//
//		} catch (DataAccessException e) {
//
//			String error = "";
//			if (e.getMostSpecificCause().getMessage().contains("Duplicate entry")) {
//				error = "Este registro ya existe en la base de datos, por favor revise que los campos no est\u00e9n duplicados";
//			} else {
//				error = "error recursos de base de datos";
//			}
//
//			throw new PrecondicionExcepcion(error);
//
//
//		}catch (RuntimeException e) {
//
//			String error="";
//			if(e.getCause().getMessage().contains("Row was updated or deleted by another transaction")){
//
//				error="Este Registro fue Modificado en otra [Transacci\u00f3n] porfavor Actualice la busqueda y vuelva a intentar";
//			}else{
//
//				error = "error recursos de base de datos";
//
//			}
//
//
//			throw new PrecondicionExcepcion(error);
//		}

	
		return true;
	}

	public boolean modificarRubroProyecto(RubroProyectoTO rubroProyecto)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean modificarUnidad(UnidadTO unidad) throws ValidacionExcepcion,
			RecursoExcepcion, PrecondicionExcepcion {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean eliminarRecurso(Long idRecurso) throws ValidacionExcepcion,
			PrecondicionExcepcion {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean eliminarRecursoDetalle(Long idDetalle)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean eliminarRubro(Long idRubro) throws ValidacionExcepcion,
			PrecondicionExcepcion {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean eliminarRubroProyecto(Long idRubroProyecto)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean eliminarUnidad(Long idUnidad) throws ValidacionExcepcion,
			PrecondicionExcepcion {
		// TODO Auto-generated method stub
		return false;
	}

	public RecursoTO cargarRecurso(Long idRecurso) throws ValidacionExcepcion,
			PrecondicionExcepcion {
		// TODO Auto-generated method stub
		return null;
	}

	public RecursoDetalleTO cargarRecursoDetalle(Long idDetalle)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		// TODO Auto-generated method stub
		return null;
	}

	public RubroTO cargarRubro(Long idRubro) throws ValidacionExcepcion,
			PrecondicionExcepcion {
		// TODO Auto-generated method stub
		return null;
	}

	public RubroProyectoTO cargarRubroProyecto(Long idRubroProyecto)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		// TODO Auto-generated method stub
		return null;
	}

	public UnidadTO cargarUnidad(Long idUnidad) throws ValidacionExcepcion,
			PrecondicionExcepcion {
		// TODO Auto-generated method stub
		return null;
	}

	public List<RecursoTO> listarRecursosPorProyecto(Long idProyecto)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		// TODO Auto-generated method stub
		return null;
	}

	public List<RecursoTO> listarRecursosSelecGeneral(Long idRubro,
			Long idActividad, String descripcion, Long idProyecto)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		// TODO Auto-generated method stub
		return null;
	}

	public List<RubroTO> listarTodoRubros() throws ValidacionExcepcion,
			PrecondicionExcepcion {
		// TODO Auto-generated method stub
		return null;
	}

	public List<RubroTO> listarRubrosPorEntidad(Long idEntidad)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UnidadTO> listarTodosUnidad() throws ValidacionExcepcion,
			PrecondicionExcepcion {
		// TODO Auto-generated method stub
		return null;
	}

}
