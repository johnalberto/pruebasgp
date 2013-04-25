/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server;

import java.util.ArrayList;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import com.cpcoriente.sgp.springgwt.pro.client.entidad.IEntidadServicio;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.ActividadEconomicaDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.ConvocatoriaDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.DivisionDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.DocTerminoConvocatoriaDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.EmpresaDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.EntidadDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.FotoEntidadDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.TerminoConvocatoriaDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.VersionTerminoConvocatoriaDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IActividadEconomicaDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IConvocatoriaDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IDivisionDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IDocTerminoConvocatoriaDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IEmpresaDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IEntidadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IFotoEntidadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.ITerminoConvocatoriaDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IVersionTerminoConvocatoriaDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IActividadEconomicaTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IConvocatoriaTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IDivisionTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IDocTerminoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IEmpresaTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IEntidadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IFotoEntidadTranf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.ITerminoConvocatoriaTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IVersionTerminoTransf;
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
import com.google.gwt.user.server.rpc.RemoteServiceServlet;


/**
 * @author Administrador
 *
 */

@Service
public class EntidadServicioImpl extends RemoteServiceServlet implements IEntidadServicio {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3284622334747249373L;

	public void init() {

	}

	
	private IActividadEconomicaDAO getActEconomicaDAO() {
		
		return  DAOFactory.getInstance().getActEconomicaDao();
	}


	private IActividadEconomicaTransf getActEconomicaTransf() {
		return TransfFactory.getInstance().getActEconomicaTransf();
	}
	
	private IConvocatoriaDAO getConvocatoriaDAO() {
		
		return  DAOFactory.getInstance().getConvocatoriaDao();
	}


	private IConvocatoriaTransf getConvocatoriaTransf() {
		return TransfFactory.getInstance().getConvocatoriaTransf();
	}

	private ITerminoConvocatoriaDAO getTerminoDAO() {
		
		return  DAOFactory.getInstance().getTerminosDao();
	}


	private ITerminoConvocatoriaTransf getTerminoTransf() {
		return TransfFactory.getInstance().getTerminoTransf();
	}

	private IDivisionDAO getDivisionDAO() {
		
		return  DAOFactory.getInstance().getDivisionDao();
	}


	private IDivisionTransf getDivisionTransf() {
		
		return TransfFactory.getInstance().getDivisionTransf();
	}

	private IDocTerminoConvocatoriaDAO getDocTerminoDAO() {
		
		return  DAOFactory.getInstance().getDocTerminoDao();
	}


	private IDocTerminoTransf getDocTerminoTransf() {
		
		return TransfFactory.getInstance().getDocTerminoTransf();
	}
	
	private IEmpresaDAO getEmpresaDAO() {
		
		return  DAOFactory.getInstance().getEmpresaDao();
	}


	private IEmpresaTransf getEmpresaTransf() {
		
		return TransfFactory.getInstance().getEmpresaTransf();
	}
	
	private IEntidadDAO getEntidadDAO() {
		
		return  DAOFactory.getInstance().getEntidadoDao();
	}


	private IEntidadTransf getEntidadTransf() {
		
		return TransfFactory.getInstance().getEntidadTransf();
	}
	
	private IFotoEntidadDAO getFotoDAO() {
		
		return  DAOFactory.getInstance().getFotoEntidadDao();
	}


	private IFotoEntidadTranf getFotoEntidadTransf() {
		
		return TransfFactory.getInstance().getFotoEntidadTransf();
	}
	
	private IVersionTerminoConvocatoriaDAO getVersionTerminoDAO() {
		
		return  DAOFactory.getInstance().getVersionTerminosDao();
	}


	private IVersionTerminoTransf getVersionTerminoTransf() {
		
		return TransfFactory.getInstance().getVersionTerminoTransf();
	}
	

	public Long crearActividadEconomica(ActividadEconomicaTO actEconomica)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		
		if(actEconomica == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.actividad.economica")	;
		}
		
				
		if(actEconomica.getCodigo() == null || actEconomica.getCodigo().trim().isEmpty() || actEconomica.getCodigo().contains(" ") ){
			throw new ValidacionExcepcion("falta.identificador.actividad.economica")	;
		}

		if(actEconomica.getNombre() == null || actEconomica.getNombre().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.nombre")	;
		}


		try {

			ActividadEconomicaDO actProv = new ActividadEconomicaDO();
			
			
			Long idRegistrado = null;

			actProv = getActEconomicaTransf().transferirTODO(actEconomica);
			
			
			ActividadEconomicaDO lineaReg = getActEconomicaDAO().persistir(actProv);
			if (lineaReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.actividad.economica");
			}

			idRegistrado = lineaReg.getId();

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

	public Long crearConvocatoria(ConvocatoriaTO convocatoria)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(convocatoria == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.convocatoria")	;
		}
		
		
		if(convocatoria.getCodigo() == null || convocatoria.getCodigo().trim().isEmpty() || convocatoria.getCodigo().contains(" ") ){
			throw new ValidacionExcepcion("falta.identificador.convocatoria")	;
		}

		if (convocatoria.getDivision()==null) {
			
			throw new ValidacionExcepcion("falta.division")	;

		}
		

		try {

			ConvocatoriaDO conProv = new ConvocatoriaDO();
			
			Long idRegistrado = null;

			conProv =  getConvocatoriaTransf().transferirTODO(convocatoria);
			
			
			ConvocatoriaDO conReg = getConvocatoriaDAO().persistir(conProv);
			
			if (convocatoria.getTerminoList()!=null) {
				
				boolean detallesRes= getTerminoDAO().persistirList(conProv.getTerminoSet());

			}

			if (conReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.convocatoria");
			}

			idRegistrado = conReg.getId();

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

	public Long crearDivision(DivisionTO division) throws ValidacionExcepcion,
			RecursoExcepcion, PrecondicionExcepcion {
		
		
		if(division == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.division")	;
		}
		
		
		if(division.getCodigo() == null || division.getCodigo().trim().isEmpty() || division.getCodigo().contains(" ") ){
			throw new ValidacionExcepcion("falta.codigo")	;
		}
		
		if (division.getEntidad()!=null) {
			
			throw new ValidacionExcepcion("falta.entidad.")	;

		}

		if (division.getNombre() == null || division.getNombre().trim().isEmpty() || division.getNombre().contains(" ") ) {
			
			throw new ValidacionExcepcion("falta.nombre.convocatoria")	;

		}
		
	
		

		try {

			
			DivisionDO divProv = new DivisionDO(); 
			
			Long idRegistrado = null;

			divProv = getDivisionTransf().transferirTODO(division);
						
			DivisionDO divReg = getDivisionDAO().persistir(divProv);
			
			
			if (divReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.division");
			}

			idRegistrado = divReg.getId(); 

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

	public Long crearDocTerminoConvocatoria(DocTerminoConvocatoriaTO documento)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(documento == null){
			
			throw new ValidacionExcepcion("falta.informaci\u00f3n.documento.termino.convocatoria")	;
		}
		
		
		if(documento.getDescripcion() == null || documento.getDescripcion().trim().isEmpty() || documento.getDescripcion().contains(" ") ){
			throw new ValidacionExcepcion("falta.descripcion.documento")	;
		}
		
		if(documento.getNombre() == null || documento.getNombre().trim().isEmpty() || documento.getNombre().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.nombre.documento")	;
		}

	

		try {

			DocTerminoConvocatoriaDO docProv = new DocTerminoConvocatoriaDO();
			
			
			Long idRegistrado = null;
			
			docProv =getDocTerminoTransf().transferirTODO(documento);
						
			
			DocTerminoConvocatoriaDO docReg= getDocTerminoDAO().persistir(docProv);
			
			if (docReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.documento");
			}

			idRegistrado = docReg.getId(); 

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

	public Long crearEmpresa(EmpresaTO empresa) throws ValidacionExcepcion,
			RecursoExcepcion, PrecondicionExcepcion {
		
		
		if(empresa == null){
			
			throw new ValidacionExcepcion("falta.informaci\u00f3n.empresa")	;
		}
		
		
		
		if(empresa.getMision() == null || empresa.getMision().trim().isEmpty() || empresa.getMision().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.mision.empresa")	;
		}
		
		
		if(empresa.getNit() == null || empresa.getNit().trim().isEmpty() || empresa.getNit().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.nit.empresa")	;
		}

			
		if(empresa.getNombre() == null || empresa.getNombre().trim().isEmpty() || empresa.getNombre().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.nombre.empresa")	;
		}

		if(empresa.getPassword() == null || empresa.getPassword().trim().isEmpty() || empresa.getPassword().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.password.empresa")	;
		}
		
		if(empresa.getUsername() == null || empresa.getUsername().trim().isEmpty() || empresa.getUsername().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.username.empresa")	;
		}
		
		if(empresa.getVision() == null || empresa.getVision().trim().isEmpty() || empresa.getVision().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.vision.empresa")	;
		}
	
		
		try {
					
			EmpresaDO empProv = new EmpresaDO();
			
			
			Long idRegistrado = null;
						
			empProv = getEmpresaTransf().transferirTODO(empresa);
						
			EmpresaDO empReg= getEmpresaDAO().persistir(empProv);
			
			
			if (empReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.empresa");
			}

			idRegistrado = empReg.getId(); 

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

	public Long crearEntidad(EntidadTO entidad) throws ValidacionExcepcion,
			RecursoExcepcion, PrecondicionExcepcion {
		
		if(entidad == null){
			
			throw new ValidacionExcepcion("falta.informaci\u00f3n.entidad")	;
		}
		
		
		
		if(entidad.getAbreviatura() == null || entidad.getAbreviatura().trim().isEmpty() || entidad.getAbreviatura().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.abreviatura.entidad")	;
		}
		
		
		if(entidad.getActEconomica() == null || entidad.getActEconomica().getId()==null  ){
			
			throw new ValidacionExcepcion("falta.actividad.economica.entidad")	;
		}

			
		if(entidad.getCiudad() == null || entidad.getCiudad().getId()==null ){
			
			throw new ValidacionExcepcion("falta.ciudad.entidad")	;
		}

		if(entidad.getCodigo() == null || entidad.getCodigo().trim().isEmpty() || entidad.getCodigo().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.codigo.entidad")	;
		}
		
		if(entidad.getDireccion() == null || entidad.getDireccion().trim().isEmpty() || entidad.getDireccion().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.direccion.entidad")	;
		}
		
		if(entidad.getDpto() == null || entidad.getDpto().getId()==null ){
			
			throw new ValidacionExcepcion("falta.departamento.entidad")	;
		}
	
		if(entidad.getEmail() == null || entidad.getEmail().trim().isEmpty() || entidad.getEmail().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.email.entidad")	;
		}
		
		if(entidad.getEmpresa() == null || entidad.getEmpresa().getId()==null ){
			
			throw new ValidacionExcepcion("falta.empresa.entidad")	;
		}
		
		if(entidad.getNombre() == null || entidad.getNombre().trim().isEmpty() || entidad.getNombre().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.nombre.entidad")	;
		}
		
		if(entidad.getNombreRepLegal() == null || entidad.getNombreRepLegal().trim().isEmpty() || entidad.getNombreRepLegal().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.nombre.representante.legal.entidad")	;
		}
		
		if(entidad.getNumDoc() == null || entidad.getNumDoc().trim().isEmpty() || entidad.getNumDoc().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.numero.documento.entidad")	;
		}
		
		if(entidad.getNumDocRepLegal() == null || entidad.getNumDocRepLegal().trim().isEmpty() || entidad.getNumDocRepLegal().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.numero.documento.representante.legal.entidad")	;
		}
		
		if(entidad.getPais() == null || entidad.getPais().getId()==null ){
			
			throw new ValidacionExcepcion("falta.numero.documento.representante.legal.entidad")	;
		}
		
		if(entidad.getTelefono() == null || entidad.getTelefono().trim().isEmpty() || entidad.getTelefono().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.telefono.entidad")	;
		}
		
		if(entidad.getTipoDocRepLegal() == null  ){
			
			throw new ValidacionExcepcion("falta.tipo.documento.representante.legal.entidad")	;
		}
		
		if(entidad.getTipoDocumento() == null  ){
			
			throw new ValidacionExcepcion("falta.tipo.documento.entidad")	;
		}
		
		if(entidad.getTipoPersona() == null  ){
			
			throw new ValidacionExcepcion("falta.tipo.persona.entidad")	;
		}

		if(entidad.getTipoRegimen() == null  ){
			
			throw new ValidacionExcepcion("falta.tipo.regimen.entidad")	;
		}
		
		try {
								
			EntidadDO entProv = new EntidadDO();
			
			
			Long idRegistrado = null;
						
			entProv = getEntidadTransf().transferirTODO(entidad);
						
			EntidadDO entReg= getEntidadDAO().persistir(entProv);
			
			if (entReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.entidad");
			}

			idRegistrado = entReg.getId(); 

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

	public Long crearFotoEntidad(FotoEntidadTO foto)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		
		if(foto == null){
			
			throw new ValidacionExcepcion("falta.informaci\u00f3n.foto")	;
		}
		
		
		if(foto.getDescripcion() == null || foto.getDescripcion().trim().isEmpty() || foto.getDescripcion().contains(" ") ){
			throw new ValidacionExcepcion("falta.descripcion.foto")	;
		}
		
		if(foto.getCodigo() == null || foto.getCodigo().trim().isEmpty() || foto.getCodigo().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.nombre.foto")	;
		}

		if(foto.getIdEntidad() == null || foto.getCodigo().trim().isEmpty() || foto.getCodigo().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.nombre.foto")	;
		}
	
		
		try {

			FotoEntidadDO fotoProv = new FotoEntidadDO();	
			
			
			Long idRegistrado = null;
			
						
			fotoProv = getFotoEntidadTransf().transferirTODO(foto);
			
			FotoEntidadDO fotoReg = getFotoDAO().persistir(fotoProv);
			
			if (fotoReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.documento");
			}

			idRegistrado = fotoReg.getId(); 

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

	public Long crearTerminoConvocatoria(TerminoConvocatoriaTO termino)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(termino == null){
			
			throw new ValidacionExcepcion("falta.informaci\u00f3n.termino")	;
		}
		
		
		
		if(termino.getCodigo() == null || termino.getCodigo().trim().isEmpty() || termino.getCodigo().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.codigo.termino")	;
		}
		
		
		if(termino.getConvocatoria() == null || termino.getConvocatoria().getId()==null ){
			
			throw new ValidacionExcepcion("falta.convocatoria.termino")	;
		}

			
		if(termino.getDescripcion() == null || termino.getDescripcion().trim().isEmpty() || termino.getDescripcion().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.descripcion.termino")	;
		}

		if(termino.getFechaFin() == null  ){
			
			throw new ValidacionExcepcion("falta.fecha.fin.termino")	;
		}
		
		if(termino.getFechaInicio() == null  ){
			
			throw new ValidacionExcepcion("falta.fecha.inicio.termino")	;
		}
		
		if (termino.getFechaInicio() == null && termino.getFechaFin() == null && termino.getFechaInicio().after(termino.getFechaFin())) {
			throw new ValidacionExcepcion("error.rango.fechas.facturaci\u00f3n.terminado");
		}	
		
	
		if(termino.getNombre() == null || termino.getNombre().trim().isEmpty() || termino.getNombre().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.nombre.termino")	;
		}
		
		
		try {
								
			TerminoConvocatoriaDO terProv = new TerminoConvocatoriaDO();
			
			
			Long idRegistrado = null;
									
			terProv = getTerminoTransf().transferirTODO(termino);
									
			TerminoConvocatoriaDO terReg= getTerminoDAO().persistir(terProv);
			
			
			if (terReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.empresa");
			}

			idRegistrado = terReg.getId(); 

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

	public Long crearVersionTermino(
			VersionTerminoConvocatoriaTO versionTermino)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		
		if(versionTermino == null){
			
			throw new ValidacionExcepcion("falta.informaci\u00f3n.version.termino")	;
		}
		
		
		
		if(versionTermino.getCodigo() == null || versionTermino.getCodigo().trim().isEmpty() || versionTermino.getCodigo().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.codigo.version.termino")	;
		}
		
			
		if(versionTermino.getDescripcion() == null || versionTermino.getDescripcion().trim().isEmpty() || versionTermino.getDescripcion().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.descripcion.version.termino")	;
		}
		
		

		if(versionTermino.getFechaFin() == null  ){
			
			throw new ValidacionExcepcion("falta.fecha.fin.version.termino")	;
		}
		
		if(versionTermino.getFechaInicio() == null  ){
			
			throw new ValidacionExcepcion("falta.fecha.inicio.version.termino")	;
		}
		
		if (versionTermino.getFechaInicio() != null && 
				versionTermino.getFechaFin() != null && 
				versionTermino.getFechaInicio().after(versionTermino.getFechaFin())) {
			throw new ValidacionExcepcion("error.rango.fechas.version.terminado");
		}	
				
		if(versionTermino.getNombre() == null || 
		   versionTermino.getNombre().trim().isEmpty() || 
		   versionTermino.getNombre().contains(" ") ){
			
			throw new ValidacionExcepcion("falta.nombre.version.termino")	;
		}
		
		if(versionTermino.getObservacion() == null || 
		   versionTermino.getObservacion().trim().isEmpty() || 
		   versionTermino.getObservacion().contains(" ") ){
					
			throw new ValidacionExcepcion("falta.nombre.version.termino")	;
		}
		
		if(versionTermino.getTermino() == null || versionTermino.getTermino().getId()==null ){
							
			throw new ValidacionExcepcion("falta.nombre.version.termino")	;
		}
		
		
		try {
								
			VersionTerminoConvocatoriaDO verProv = new VersionTerminoConvocatoriaDO(); 
			
			
			Long idRegistrado = null;
									
			verProv = getVersionTerminoTransf().transferirTODO(versionTermino);
			
			
			VersionTerminoConvocatoriaDO verReg = getVersionTerminoDAO().persistir(verProv);
			
			if (verReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.empresa");
			}

			idRegistrado = verReg.getId(); 

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

	public boolean modificarActividadEconomica(ActividadEconomicaTO actEconomica)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		
		if(actEconomica == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.actividad.economica")	;
		}
		if(actEconomica.getId() == null  ){
			throw new ValidacionExcepcion("falta.identificador.actividad.economica")	;
		}

		if(actEconomica.getCodigo() == null || actEconomica.getCodigo().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.descripci\u00f3n.actividad.economica")	;
		}

		if(actEconomica.getNombre() == null || actEconomica.getNombre().trim().isEmpty()){
			throw new ValidacionExcepcion("falta.nombre.actividad.economica")	;
		}

		
		ActividadEconomicaDO actProv = getActEconomicaDAO().cargar(actEconomica.getId());
		
		if (actProv == null) {
			throw new PrecondicionExcepcion("inexistente.identificador.actividad.economica");
		}

		actProv = getActEconomicaTransf().transferirTODO(actEconomica);
		
		try {
			
			ActividadEconomicaDO actMod = getActEconomicaDAO().modificar(actProv);

			if (actMod == null) {
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

	public boolean modificarConvocatoria(ConvocatoriaTO convocatoria)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(convocatoria == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.convocatoria")	;
		}
		if(convocatoria.getId() == null  ){
			throw new ValidacionExcepcion("falta.identificador.convocatoria")	;
		}

		if(convocatoria.getCodigo() == null || convocatoria.getCodigo().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.codigo.convocatoria")	;
		}

		if(convocatoria.getDivision() == null || convocatoria.getDivision().getId()==null){
			throw new ValidacionExcepcion("falta.division.convocatoria");
		}

		
		ConvocatoriaDO conProv = getConvocatoriaDAO().cargar(convocatoria.getId());
		
		if (conProv == null) {
			throw new PrecondicionExcepcion("inexistente.identificador.convocatoria");
		}
		
		conProv =getConvocatoriaTransf().transferirTODO(convocatoria);
		
		try {
			
			ConvocatoriaDO conMod =getConvocatoriaDAO().modificar(conProv);

			if (conMod == null) {
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

	public boolean modificarDivision(DivisionTO division)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		
		if(division == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.division")	;
		}
		
		if(division.getId() == null  ){
			throw new ValidacionExcepcion("falta.identificador.division")	;
		}

		if(division.getCodigo() == null || division.getCodigo().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.codigo.division")	;
		}

		if(division.getEntidad() == null || division.getEntidad().getId()==null){
			throw new ValidacionExcepcion("falta.entidad.division");
		}
		
		
		DivisionDO divProv = getDivisionDAO().cargar(division.getId());
		
		if (divProv == null) {
			
			throw new PrecondicionExcepcion("inexistente.identificador.division");
		}
				
		divProv=getDivisionTransf().transferirTODO(division);
		
		
		try {
			
			DivisionDO divMod = getDivisionDAO().modificar(divProv);
			
			if (divMod == null) {
				
				throw new RecursoExcepcion("fallo.modificar.division");
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

	public boolean modificarDocTerminoConvocatoria(
			DocTerminoConvocatoriaTO documento) throws ValidacionExcepcion,
			RecursoExcepcion, PrecondicionExcepcion {
		
		if(documento == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.documento")	;
		}
		
		if(documento.getId() == null  ){
			throw new ValidacionExcepcion("falta.identificador.documento")	;
		}

		if(documento.getDescripcion() == null || documento.getDescripcion().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.descripcion.documento")	;
		}

		if(documento.getIdTermino() == null){
			throw new ValidacionExcepcion("falta.id.termino.documento");
		}
		
		if(documento.getNombre() == null || documento.getNombre().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.descripcion.documento")	;
		}
		
				
		DocTerminoConvocatoriaDO docProv =getDocTerminoDAO().cargar(documento.getId());
		
		
		if (docProv == null) {
			
			throw new PrecondicionExcepcion("inexistente.identificador.documento");
		}
				
		
		docProv = getDocTerminoTransf().transferirTODO(documento);
		
		try {
			
			
			DocTerminoConvocatoriaDO docMod = getDocTerminoDAO().modificar(docProv);
			
			if (docMod == null) {
				
				throw new RecursoExcepcion("fallo.modificar.documento.termino.convocatoria");
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

	public boolean modificarEmpresa(EmpresaTO empresa)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(empresa == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.empresa")	;
		}
		
		if(empresa.getId() == null  ){
			throw new ValidacionExcepcion("falta.identificador.empresa")	;
		}

		if(empresa.getMision() == null || empresa.getMision().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.mision.empresa")	;
		}

		if(empresa.getNit() == null || empresa.getNit().trim().isEmpty()){
			throw new ValidacionExcepcion("falta.nit.empresa");
		}
		
		if(empresa.getNombre() == null || empresa.getNombre().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.nombre.empresa")	;
		}
		
		if(empresa.getPassword() == null || empresa.getPassword().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.password.empresa")	;
		}
			
		if(empresa.getUsername() == null || empresa.getUsername().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.username.empresa")	;
		}
		
		if(empresa.getVision() == null || empresa.getVision().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.vision.empresa")	;
		}
		
		
		EmpresaDO empProv = getEmpresaDAO().cargar(empresa.getId());
		
		if (empProv == null) {
			
			throw new PrecondicionExcepcion("inexistente.identificador.documento");
		}
				
				
		empProv=getEmpresaTransf().transferirTODO(empresa);
		
		try {
						
			EmpresaDO empMod=getEmpresaDAO().modificar(empProv);
			
			if (empMod == null) {
				
				throw new RecursoExcepcion("fallo.modificar.empresa");
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

	public boolean modificarEntidad(EntidadTO entidad)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(entidad == null){
			
			throw new ValidacionExcepcion("falta.informaci\u00f3n.entidad")	;
		}
		
		if(entidad.getId() == null  ){
			
			throw new ValidacionExcepcion("falta.identificador.entidad")	;
		}

		if(entidad.getAbreviatura() == null || entidad.getAbreviatura().trim().isEmpty() ){
			
			throw new ValidacionExcepcion("falta.abreviatura.entidad")	;
		}

		if(entidad.getActEconomica() == null || entidad.getActEconomica().getId()==null){
			
			throw new ValidacionExcepcion("falta.nit.actividad.economica.entidad");
		}
		
		if(entidad.getCiudad() == null || entidad.getCiudad().getId()==null ){
			
			throw new ValidacionExcepcion("falta.ciudad.entidad")	;
		}
		
		if(entidad.getCodigo() == null || entidad.getCodigo().trim().isEmpty() ){
			
			throw new ValidacionExcepcion("falta.codigo.entidad")	;
		}
			
		if(entidad.getDireccion() == null || entidad.getDireccion().trim().isEmpty() ){
			
			throw new ValidacionExcepcion("falta.direccion.entidad")	;
		}
		
		if(entidad.getDpto() == null || entidad.getDpto().getId()==null ){
			
			throw new ValidacionExcepcion("falta.departamento.entidad")	;
		}
		
		if(entidad.getEmail() == null || entidad.getEmail().trim().isEmpty() ){
			
			throw new ValidacionExcepcion("falta.email.entidad")	;
		}
		
		if(entidad.getEmpresa() == null || entidad.getEmpresa().getId()==null ){
			
			throw new ValidacionExcepcion("falta.empresa.entidad")	;
		}
		
		if(entidad.getNombre() == null || entidad.getNombre().trim().isEmpty() ){
			
			throw new ValidacionExcepcion("falta.nombre.entidad")	;
		}
		
		if(entidad.getNombreRepLegal() == null || entidad.getNombreRepLegal().trim().isEmpty() ){
			
			throw new ValidacionExcepcion("falta.nombre.representante.legal.entidad")	;
		}
		
		if(entidad.getNumDoc() == null || entidad.getNumDoc().trim().isEmpty() ){
			
			throw new ValidacionExcepcion("falta.numero.documento.entidad")	;
		}
		
		if(entidad.getNumDocRepLegal() == null || entidad.getNumDocRepLegal().trim().isEmpty() ){
			
			throw new ValidacionExcepcion("falta.numero.documentorepresentante.legal.entidad")	;
		}
		
		if(entidad.getPais() == null || entidad.getPais().getId()==null ){
			
			throw new ValidacionExcepcion("falta.pais.entidad")	;
		}
		
		if(entidad.getTelefono() == null || entidad.getTelefono().trim().isEmpty() ){
			
			throw new ValidacionExcepcion("falta.telefono.entidad")	;
		}

		if(entidad.getTipoDocRepLegal() == null ){
			
			throw new ValidacionExcepcion("falta.tipo.documento.represante.legal.entidad")	;
		}
		
		if(entidad.getTipoDocumento() == null ){
			
			throw new ValidacionExcepcion("falta.tipo.documento.entidad")	;
		}
		
		if(entidad.getTipoPersona() == null ){
			
			throw new ValidacionExcepcion("falta.tipo.persona.entidad")	;
		}
		
		if(entidad.getTipoRegimen() == null ){
			
			throw new ValidacionExcepcion("falta.tipo.regimen.entidad")	;
		}
				
		EntidadDO entProv = getEntidadDAO().cargar(entidad.getId());
		
		if (entProv == null) {
			
			throw new PrecondicionExcepcion("inexistente.identificador.entidad");
		}
						
		entProv=getEntidadTransf().transferirTODO(entidad);
		
		try {
						
			
			EntidadDO entMod = getEntidadDAO().modificar(entProv);
			
			if (entMod == null) {
				
				throw new RecursoExcepcion("fallo.modificar.entidad");
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

	public boolean modificarFotoEntidad(FotoEntidadTO foto)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(foto == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.foto.entidad")	;
		}
		
		if(foto.getId() == null  ){
			throw new ValidacionExcepcion("falta.identificador.foto.entidad")	;
		}

		if(foto.getCodigo() == null || foto.getCodigo().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.codigo.foto.entidad")	;
		}

		if(foto.getDescripcion() == null || foto.getDescripcion().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.descripcion.foto.entidad");
		}
		
		if(foto.getIdEntidad() == null  ){
			throw new ValidacionExcepcion("falta.id.entidad.documento")	;
		}
		
		
		FotoEntidadDO fotoProv = getFotoDAO().cargar(foto.getId());
		
		if (fotoProv == null) {
			
			throw new PrecondicionExcepcion("inexistente.identificador.foto");
		}
				
		
		fotoProv = getFotoEntidadTransf().transferirTODO(foto);
		
		try {
			
			FotoEntidadDO fotMod = getFotoDAO().modificar(fotoProv);
			
			if (fotMod == null) {
				
				throw new RecursoExcepcion("fallo.modificar.foto.entidad");
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

	public boolean modificarTerminoConvocatoria(TerminoConvocatoriaTO termino)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		
		if(termino == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.termino");
		}
		
		if(termino.getId() == null  ){
			throw new ValidacionExcepcion("falta.identificador.termino");
		}

		if(termino.getCodigo() == null || termino.getCodigo().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.codigo.termino");
		}

		if(termino.getConvocatoria() == null || termino.getConvocatoria().getId()==null ){
			throw new ValidacionExcepcion("falta.convocatoria.termino");
		}
		
		if(termino.getDescripcion() == null || termino.getDescripcion().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.descripcion.termino");
		}
		
		if(termino.getFechaFin() == null  ){
			throw new ValidacionExcepcion("falta.fecha.fin.termino");
		}
		
		if(termino.getFechaInicio() == null  ){
			throw new ValidacionExcepcion("falta.fecha.inicio.termino");
		}
		
		if (termino.getFechaInicio() == null && termino.getFechaFin() == null && termino.getFechaInicio().after(termino.getFechaFin())) {
			throw new ValidacionExcepcion("error.rango.fechas.facturaci\u00f3n.terminado");
		}	
		
		TerminoConvocatoriaDO terProv=getTerminoDAO().cargar(termino.getId());
		
		if (terProv == null) {
			
			throw new PrecondicionExcepcion("inexistente.identificador.termino");
		}
				
		
		terProv = getTerminoTransf().transferirTODO(termino);
		
		try {
			
			TerminoConvocatoriaDO terMod = getTerminoDAO().modificar(terProv);
			
			if (terMod == null) {
				
				throw new RecursoExcepcion("fallo.modificar.foto.termino");
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

	public boolean modificarVersionTerminoConvocatoria(
			VersionTerminoConvocatoriaTO version) throws ValidacionExcepcion,
			RecursoExcepcion, PrecondicionExcepcion {
		
		
		if(version == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.version");
		}
		
		if(version.getId() == null  ){
			throw new ValidacionExcepcion("falta.identificador.version");
		}

		if(version.getCodigo() == null || version.getCodigo().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.codigo.version");
		}

		if(version.getDescripcion() == null || version.getDescripcion().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.descripcion.version");
		}
		
		if(version.getFechaFin() == null  ){
			throw new ValidacionExcepcion("falta.fecha.fin.version");
		}
		
		if(version.getFechaInicio() == null  ){
			throw new ValidacionExcepcion("falta.fecha.inicio.version");
		}
		
		if (version.getFechaInicio() == null && version.getFechaFin() == null && version.getFechaInicio().after(version.getFechaFin())) {
			throw new ValidacionExcepcion("error.rango.fechas.version");
		}	
		
		if(version.getNombre() == null || version.getNombre().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.nombre.version");
		}
		
		if(version.getObservacion() == null || version.getObservacion().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.observacion.version");
		}
		
		
		if(version.getTermino() == null || version.getTermino().getId()==null ){
			throw new ValidacionExcepcion("falta.termino.version");
		}
				
		VersionTerminoConvocatoriaDO verProv = getVersionTerminoDAO().cargar(version.getId());
		
		if (verProv == null) {
			
			throw new PrecondicionExcepcion("inexistente.identificador.version");
		}
				
				
		verProv = getVersionTerminoTransf().transferirTODO(version);
		
		try {
			
			VersionTerminoConvocatoriaDO verMod = getVersionTerminoDAO().modificar(verProv);
			
			if (verMod == null) {
				
				throw new RecursoExcepcion("fallo.modificar.foto.termino");
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

	public boolean eliminarActividadEconomica(Long idActEconomica)
			throws ValidacionExcepcion, PrecondicionExcepcion {

		if (idActEconomica == null || idActEconomica.longValue() < 0 ) {
			
			throw new ValidacionExcepcion("falta.identificador.actividad.economica");
		}

		try {
			ActividadEconomicaDO actividad = null;

			actividad = getActEconomicaDAO().cargar(idActEconomica);
			
			if (actividad == null) {
				throw new PrecondicionExcepcion("inexistente.identificador.requerimiento");
			}
			
			boolean res = getActEconomicaDAO().eliminar(idActEconomica);

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

	public boolean eliminarConvocatoria(Long idConvocatoria)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idConvocatoria == null || idConvocatoria.longValue() < 0 ) {
			
			throw new ValidacionExcepcion("falta.identificador.convocatoria");
		}

		try {
			ConvocatoriaDO convocatoria = null;

			convocatoria = getConvocatoriaDAO().cargar(idConvocatoria);
			
			if (convocatoria == null) {
				throw new PrecondicionExcepcion("inexistente.identificador.requerimiento");
			}
						
			boolean res = getConvocatoriaDAO().eliminar(idConvocatoria);

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

	public boolean eliminarDivision(Long idDivision)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idDivision == null || idDivision.longValue() < 0 ) {
			
			throw new ValidacionExcepcion("falta.identificador.division");
		}

		try {
			DivisionDO division=null;

			
			division = getDivisionDAO().cargar(idDivision);
			
			if (division == null) {
				throw new PrecondicionExcepcion("inexistente.identificador.division");
			}
						
			boolean res = getConvocatoriaDAO().eliminar(idDivision);

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

	public boolean eliminarDocTerminoConvocatoria(Long idDocTermino)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idDocTermino == null || idDocTermino.longValue() < 0 ) {
			
			throw new ValidacionExcepcion("falta.identificador.documento.termino");
		}

		try {
			
			DocTerminoConvocatoriaDO termino = null;
			
			termino=getDocTerminoDAO().cargar(idDocTermino);
			
			if (termino == null) {
				throw new PrecondicionExcepcion("inexistente.identificador.documento.termino");
			}
						
			boolean res = getDocTerminoDAO().eliminar(idDocTermino);
			
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

	public boolean eliminarEmpresa(Long idEmpresa) throws ValidacionExcepcion,
			PrecondicionExcepcion {
		
		if (idEmpresa == null || idEmpresa.longValue() < 0 ) {
			
			throw new ValidacionExcepcion("falta.identificador.empresa");
		}

		try {
			
			EmpresaDO empresa=null;
						
			empresa = getEmpresaDAO().cargar(idEmpresa);
			
			if (empresa == null) {
				throw new PrecondicionExcepcion("inexistente.identificador.empresa");
			}
						
			boolean res = getEmpresaDAO().eliminar(idEmpresa);
			
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

	public boolean eliminarEntidad(Long idEntidad) throws ValidacionExcepcion,
			PrecondicionExcepcion {
		
		if (idEntidad == null || idEntidad.longValue() < 0 ) {
			
			throw new ValidacionExcepcion("falta.identificador.entidad");
		}

		try {
			
			EntidadDO entidad =null;
						
			entidad = getEntidadDAO().cargar(idEntidad);
			
			if (entidad == null) {
				throw new PrecondicionExcepcion("inexistente.identificador.termino");
			}
						
			boolean res = getEntidadDAO().eliminar(idEntidad);
			
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

	public boolean eliminarFotoEntidad(Long idFotoEntidad)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idFotoEntidad == null || idFotoEntidad.longValue() < 0 ) {
			
			throw new ValidacionExcepcion("falta.identificador.entidad");
		}

		try {
			
			FotoEntidadDO foto = null;
						
			foto = getFotoDAO().cargar(idFotoEntidad);
			
			if (foto == null) {
				throw new PrecondicionExcepcion("inexistente.identificador.entidad");
			}
									
			boolean res = getFotoDAO().eliminar(idFotoEntidad);
			
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

	public boolean eliminarTerminoConvocatoria(Long idTermino)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idTermino == null || idTermino.longValue() < 0 ) {
			
			throw new ValidacionExcepcion("falta.identificador.termino.convocatoria");
		}

		try {
			
			TerminoConvocatoriaDO termino = null;
						
			termino = getTerminoDAO().cargar(idTermino);
			
			if (termino == null) {
				
				throw new PrecondicionExcepcion("inexistente.identificador.entidad");
			}
									
			boolean res = getTerminoDAO().eliminar(idTermino);
			
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

	public boolean eliminarVersionTerminoConvocatoria(Long idVersionTermino)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idVersionTermino == null || idVersionTermino.longValue() < 0 ) {
			
			throw new ValidacionExcepcion("falta.identificador.version.termino.convocatoria");
		}

		try {
			
			VersionTerminoConvocatoriaDO version = null;
						
			version = getVersionTerminoDAO().cargar(idVersionTermino); 
			
			if (version == null) {
				
				throw new PrecondicionExcepcion("inexistente.identificador.version.termino");
			}
									
			boolean res = getVersionTerminoDAO().eliminar(idVersionTermino);
			
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

	public ActividadEconomicaTO cargarActividadEconomica(Long idActividad)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		ActividadEconomicaTO actividadTO = null;
		ActividadEconomicaDO actividadDO = null;

		if (idActividad == null  ) {
			
			throw new ValidacionExcepcion("falta.id.actividad.economica");
		}

		actividadDO = getActEconomicaDAO().cargar(idActividad);
		

		if (actividadDO == null) {
			
			throw new PrecondicionExcepcion("inexistente.id.actividad.economica");
		}

		actividadTO = getActEconomicaTransf().transferirDOTO(actividadDO);
		
		return actividadTO;
	}

	public ConvocatoriaTO cargarConvocatoria(Long idConvocatoria)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		ConvocatoriaTO convocatoriaTO = null;
		ConvocatoriaDO convocatoriaDO = null;

		if (idConvocatoria == null  ) {
			
			throw new ValidacionExcepcion("falta.id.convocatoria");
		}

		convocatoriaDO = getConvocatoriaDAO().cargar(idConvocatoria);
		

		if (convocatoriaDO == null) {
			
			throw new PrecondicionExcepcion("inexistente.id.convocatoria");
		}

		convocatoriaTO = getConvocatoriaTransf().transferirDOTO(convocatoriaDO);
		
		return convocatoriaTO;
		
	}

	public DivisionTO cargarDivision(Long idDivision)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		DivisionTO divisionTO = null;
		DivisionDO divisionDO = null;

		if (idDivision == null  ) {
			
			throw new ValidacionExcepcion("falta.id.division");
		}

		divisionDO = getDivisionDAO().cargar(idDivision);
		

		if (divisionDO == null) {
			
			throw new PrecondicionExcepcion("inexistente.id.convocatoria");
		}

		divisionTO = getDivisionTransf().transferirDOTO(divisionDO);
		
		
		return divisionTO;
	}

	public DocTerminoConvocatoriaTO cargarDocTermino(Long idDocTermino)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		DocTerminoConvocatoriaTO docTerminoTO = null;
		DocTerminoConvocatoriaDO docTerminoDO = null;

		if (idDocTermino == null  ) {
			
			throw new ValidacionExcepcion("falta.id.documento.termino.convocatoria");
		}

		docTerminoDO = getDocTerminoDAO().cargar(idDocTermino);
		

		if (docTerminoDO == null) {
			
			throw new PrecondicionExcepcion("inexistente.id.documento.termino.convocatoria");
		}

		docTerminoTO = getDocTerminoTransf().transferirDOTO(docTerminoDO);
		
		
		return docTerminoTO;
	}

	public EmpresaTO cargarEmpresa(Long idEmpresa) throws ValidacionExcepcion,
			PrecondicionExcepcion {
		
		EmpresaTO empresaTO = null;
		EmpresaDO empresaDO = null;

		if (idEmpresa == null  ) {
			
			throw new ValidacionExcepcion("falta.id.empresa");
		}

		empresaDO = getEmpresaDAO().cargar(idEmpresa); 
		

		if (empresaDO == null) {
			
			throw new PrecondicionExcepcion("inexistente.id.empresa");
		}

		empresaTO = getEmpresaTransf().transferirDOTO(empresaDO);
		
		
		return empresaTO;
	}

	public EntidadTO cargarEntidad(Long idEntidad) throws ValidacionExcepcion,
			PrecondicionExcepcion {
		
		EntidadTO entidadTO = null;
		EntidadDO entidadDO = null;

		if (idEntidad == null  ) {
			
			throw new ValidacionExcepcion("falta.id.entidad");
		}

		entidadDO = getEntidadDAO().cargar(idEntidad);
		

		if (entidadDO == null) {
			
			throw new PrecondicionExcepcion("inexistente.id.entidad");
		}

		entidadTO = getEntidadTransf().transferirDOTO(entidadDO); 
		
		
		return entidadTO;
		
	}

	public FotoEntidadTO cargarFotoEntidad(Long idFotoEntidad)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		FotoEntidadTO fotoEntidadTO = null;
		FotoEntidadDO fotoEntidadDO = null;

		if (idFotoEntidad == null  ) {
			
			throw new ValidacionExcepcion("falta.id.foto.entidad");
		}

		fotoEntidadDO =getFotoDAO().cargar(idFotoEntidad); 
		

		if (fotoEntidadDO == null) {
			
			throw new PrecondicionExcepcion("inexistente.id.foto.entidad");
		}

		fotoEntidadTO = getFotoEntidadTransf().transferirDOTO(fotoEntidadDO); 
		
		
		return fotoEntidadTO;
	}

	public TerminoConvocatoriaTO cargarTerminoConvocatoria(Long idTermino)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		TerminoConvocatoriaTO terConvocatoriaTO = null;
		TerminoConvocatoriaDO terConvocatoriaDO = null;

		if (idTermino == null  ) {
			
			throw new ValidacionExcepcion("falta.id.termino.convocatoria");
		}

		terConvocatoriaDO = getTerminoDAO().cargar(idTermino); 
		

		if (terConvocatoriaDO == null) {
			
			throw new PrecondicionExcepcion("inexistente.id.termino.convocatoria");
		}

		terConvocatoriaTO = getTerminoTransf().transferirDOTO(terConvocatoriaDO); 
		
		
		return terConvocatoriaTO;

	}

	public VersionTerminoConvocatoriaTO cargarVersionTermino(
			Long idVersionConvocatoria) throws ValidacionExcepcion,
			PrecondicionExcepcion {
		
		VersionTerminoConvocatoriaTO versionTO = null;
		VersionTerminoConvocatoriaDO versionDO = null;

		if (idVersionConvocatoria == null  ) {
			
			throw new ValidacionExcepcion("falta.id.termino.convocatoria");
		}

		versionDO = getVersionTerminoDAO().cargar(idVersionConvocatoria); 
		

		if (versionDO == null) {
			
			throw new PrecondicionExcepcion("inexistente.id.termino.convocatoria");
		}

		versionTO = getVersionTerminoTransf().transferirDOTO(versionDO); 
		
		
		return versionTO;

	}

	public List<ActividadEconomicaTO> listarTodoActividadEconomica()
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		List<ActividadEconomicaDO> actividadLista = getActEconomicaDAO().listarTodo();

		List<ActividadEconomicaTO> actividadTOLista = new ArrayList<ActividadEconomicaTO>(actividadLista.size());

		if (actividadLista != null && actividadLista.size() > 0) {
			ActividadEconomicaTO actividadTO = null;
			for (ActividadEconomicaDO actividad : actividadLista) {
				actividadTO =getActEconomicaTransf().transferirDOTO(actividad); 
				actividadTOLista.add(actividadTO);
			}
		}
		return actividadTOLista;
		
	}

	public List<ConvocatoriaTO> listarTodoConvocatoria()
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		List<ConvocatoriaDO> convocatoriaLista = getConvocatoriaDAO().listarTodo(); 

		List<ConvocatoriaTO> convocatoriaTOLista = new ArrayList<ConvocatoriaTO>(convocatoriaLista.size());

		if (convocatoriaLista != null && convocatoriaLista.size() > 0) {
			ConvocatoriaTO convocatoriaTO = null;
			for (ConvocatoriaDO convocatoria : convocatoriaLista) {
				convocatoriaTO =getConvocatoriaTransf().transferirDOTO(convocatoria); 
				convocatoriaTOLista.add(convocatoriaTO);
			}
		}
		return convocatoriaTOLista;
	}

	public List<ConvocatoriaTO> listarConvocatoriaPorDivision(Long idDivision)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idDivision == null  ) {
			throw new ValidacionExcepcion("falta.id.division");
		}

		List<ConvocatoriaDO> convocatoriaLista = getConvocatoriaDAO().seleccionPorDivision(idDivision);

		List<ConvocatoriaTO> convocatoriaTOLista = new ArrayList<ConvocatoriaTO>(convocatoriaLista.size());

		if (convocatoriaLista != null && convocatoriaLista.size() > 0) {
			ConvocatoriaTO convocatoriaTO = null;
			for (ConvocatoriaDO convocatoria : convocatoriaLista) {
				convocatoriaTO = getConvocatoriaTransf().transferirDOTO(convocatoria);
				convocatoriaTOLista.add(convocatoriaTO);
			}
		}

		return convocatoriaTOLista;
	}

	public List<DivisionTO> listarTodoDivision() throws ValidacionExcepcion,
			PrecondicionExcepcion {
		
		List<DivisionDO> divisionLista = getDivisionDAO().listarTodo(); 

		List<DivisionTO> divisionTOLista = new ArrayList<DivisionTO>(divisionLista.size());

		if (divisionLista != null && divisionLista.size() > 0) {
			DivisionTO divisionTO = null;
			for (DivisionDO division : divisionLista) {
				divisionTO = getDivisionTransf().transferirDOTO(division); 
				divisionTOLista.add(divisionTO);
			}
		}
		return divisionTOLista;
	}

	public List<DivisionTO> listarDivisionPorEntidad(Long idEntidad)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idEntidad == null  ) {
			throw new ValidacionExcepcion("falta.id.division");
		}

		List<DivisionDO> divisionLista = getDivisionDAO().seleccionPorEntidad(idEntidad);

		List<DivisionTO> divisionTOLista = new ArrayList<DivisionTO>(divisionLista.size());

		if (divisionLista != null && divisionLista.size() > 0) {
			DivisionTO divisionTO = null;
			for (DivisionDO division : divisionLista) {
				divisionTO = getDivisionTransf().transferirDOTO(division); 
				divisionTOLista.add(divisionTO);
			}
		}

		return divisionTOLista;
		
	}

	public List<DivisionTO> listarDivisionPorNombre(String parteNombre)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (parteNombre == null || parteNombre.trim().isEmpty()  ) {
			throw new ValidacionExcepcion("falta.parte.nombre.division");
		}

		List<DivisionDO> divisionLista = getDivisionDAO().seleccionPorNombre(parteNombre);

		List<DivisionTO> divisionTOLista = new ArrayList<DivisionTO>(divisionLista.size());

		if (divisionLista != null && divisionLista.size() > 0) {
			DivisionTO divisionTO = null;
			for (DivisionDO division : divisionLista) {
				divisionTO = getDivisionTransf().transferirDOTO(division); 
				divisionTOLista.add(divisionTO);
			}
		}

		return divisionTOLista;
	}

	public List<DocTerminoConvocatoriaTO> listarDocTerminoPorTermino(
			Long idTermino) throws ValidacionExcepcion, PrecondicionExcepcion {
		
		
		if (idTermino == null ) {
			throw new ValidacionExcepcion("falta.id.termino");
		}

		List<DocTerminoConvocatoriaDO> docTerminoLista =getDocTerminoDAO().listarPorTermino(idTermino);

		List<DocTerminoConvocatoriaTO> docTerminoTOLista = new ArrayList<DocTerminoConvocatoriaTO>(docTerminoLista.size());

		if (docTerminoLista != null && docTerminoLista.size() > 0) {
			DocTerminoConvocatoriaTO docTerminoTO = null;
			for (DocTerminoConvocatoriaDO docTermino : docTerminoLista) {
				
				docTerminoTO = getDocTerminoTransf().transferirDOTO(docTermino); 
				docTerminoTOLista.add(docTerminoTO);
			}
		}

		return docTerminoTOLista;
		
	}

	public List<EmpresaTO> listarTodoEmpresa() throws ValidacionExcepcion,
			PrecondicionExcepcion {
		
		List<EmpresaDO> empresaLista = getEmpresaDAO().listarTodo(); 

		List<EmpresaTO> empresaTOLista = new ArrayList<EmpresaTO>(empresaLista.size());

		if (empresaLista != null && empresaLista.size() > 0) {
			EmpresaTO empresaTO = null;
			for (EmpresaDO empresa : empresaLista) {
				
				empresaTO = getEmpresaTransf().transferirDOTO(empresa); 
				empresaTOLista.add(empresaTO);
			}
		}
		
		return empresaTOLista;
		
	}

	public List<EntidadTO> listarEntidadPorTipoDocPorNumDoc(Integer tipoDoc,
			String numDoc) throws ValidacionExcepcion, PrecondicionExcepcion {
		
		

		List<EntidadDO> entidadLista = getEntidadDAO().buscarEntidadPorTipDocNumDoc(numDoc, tipoDoc);

		List<EntidadTO> entidadTOLista = new ArrayList<EntidadTO>(entidadLista.size());

		if (entidadLista != null && entidadLista.size() > 0) {
			EntidadTO entidadTO = null;
			for (EntidadDO entidad : entidadLista) {
				entidadTO = getEntidadTransf().transferirDOTO(entidad);
				entidadTOLista.add(entidadTO);
			}
		}

		return entidadTOLista;
	}

	public List<EntidadTO> listarTodoEntidad() throws ValidacionExcepcion,
			PrecondicionExcepcion {
		
		List<EntidadDO> entidadLista = getEntidadDAO().listarTodo(); 

		List<EntidadTO> entidadTOLista = new ArrayList<EntidadTO>(entidadLista.size());

		if (entidadLista != null && entidadLista.size() > 0) {
			EntidadTO entidadTO = null;
			for (EntidadDO entidad : entidadLista) {
				
				entidadTO = getEntidadTransf().transferirDOTO(entidad); 
				entidadTOLista.add(entidadTO);
			}
		}
		
		return entidadTOLista;
	}

	public List<EntidadTO> listarEntidadPorCiudad(Long idCiudad)
			throws ValidacionExcepcion, PrecondicionExcepcion {
	
		if (idCiudad == null  ) {
			throw new ValidacionExcepcion("falta.id.ciudad");
		}

		List<EntidadDO> entidadLista = getEntidadDAO().seleccionPorCiudad(idCiudad);

		List<EntidadTO> entidadTOLista = new ArrayList<EntidadTO>(entidadLista.size());

		if (entidadLista != null && entidadLista.size() > 0) {
			EntidadTO entidadTO = null;
			for (EntidadDO entidad : entidadLista) {
				entidadTO = getEntidadTransf().transferirDOTO(entidad);
				entidadTOLista.add(entidadTO);
			}
		}

		return entidadTOLista;
	
	}

	public List<EntidadTO> listarEntidadPorNombre(String parteNombre)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
	
		
		if (parteNombre == null || parteNombre.trim().isEmpty()  ) {
			
			throw new ValidacionExcepcion("falta.parte.nombre");
		}


		List<EntidadDO> entidadLista = getEntidadDAO().seleccionPorNombre(parteNombre);

		List<EntidadTO> entidadTOLista = new ArrayList<EntidadTO>(entidadLista.size());

		if (entidadLista != null && entidadLista.size() > 0) {
			EntidadTO entidadTO = null;
			for (EntidadDO entidad : entidadLista) {
				entidadTO = getEntidadTransf().transferirDOTO(entidad);
				entidadTOLista.add(entidadTO);
			}
		}

		return entidadTOLista;	
	
	}

	public List<EntidadTO> listarEntidadPorNumDoc(String numDoc)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (numDoc == null || numDoc.trim().isEmpty()  ) {
			
			throw new ValidacionExcepcion("falta.numero.documento");
		}


		List<EntidadDO> entidadLista = getEntidadDAO().seleccionPorNumDoc(numDoc);

		List<EntidadTO> entidadTOLista = new ArrayList<EntidadTO>(entidadLista.size());

		if (entidadLista != null && entidadLista.size() > 0) {
			EntidadTO entidadTO = null;
			for (EntidadDO entidad : entidadLista) {
				entidadTO = getEntidadTransf().transferirDOTO(entidad);
				entidadTOLista.add(entidadTO);
			}
		}

		return entidadTOLista;	
	}

	public List<EntidadTO> listarEntidadPorUsuario(String username)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (username == null || username.trim().isEmpty()  ) {
			
			throw new ValidacionExcepcion("falta.user.name");
		}


		List<EntidadDO> entidadLista = getEntidadDAO().selecEntidadPorUsuario(username);

		List<EntidadTO> entidadTOLista = new ArrayList<EntidadTO>(entidadLista.size());

		if (entidadLista != null && entidadLista.size() > 0) {
			EntidadTO entidadTO = null;
			for (EntidadDO entidad : entidadLista) {
				entidadTO = getEntidadTransf().transferirDOTO(entidad);
				entidadTOLista.add(entidadTO);
			}
		}

		return entidadTOLista;
		
	}

	public List<FotoEntidadTO> listarFotoEntidadPorEntidad(Long idEntidad)
			throws ValidacionExcepcion, PrecondicionExcepcion {

	
		if (idEntidad == null) {
			
			throw new ValidacionExcepcion("falta.id.entidad");
		}

		List<FotoEntidadDO> entidadLista = getFotoDAO().listarPorEntidad(idEntidad);

		List<FotoEntidadTO> entidadTOLista = new ArrayList<FotoEntidadTO>(entidadLista.size());

		if (entidadLista != null && entidadLista.size() > 0) {
			FotoEntidadTO entidadTO = null;
			for (FotoEntidadDO entidad : entidadLista) {
				
				entidadTO =getFotoEntidadTransf().transferirDOTO(entidad); 
				entidadTOLista.add(entidadTO);
			}
		}

		return entidadTOLista;
	}

	public List<TerminoConvocatoriaTO> listarTodoTermino()
			throws ValidacionExcepcion, PrecondicionExcepcion {

		List<TerminoConvocatoriaDO> entidadLista = getTerminoDAO().listarTodo(); 

		List<TerminoConvocatoriaTO> entidadTOLista = new ArrayList<TerminoConvocatoriaTO>(entidadLista.size());

		if (entidadLista != null && entidadLista.size() > 0) {
			TerminoConvocatoriaTO entidadTO = null;
			for (TerminoConvocatoriaDO entidad : entidadLista) {
				
				entidadTO =getTerminoTransf().transferirDOTO(entidad); 
				entidadTOLista.add(entidadTO);
			}
		}

		return entidadTOLista;
		
	}

	public List<TerminoConvocatoriaTO> listarTodoTerminoPorNombre(
			String parteNombre) throws ValidacionExcepcion,
			PrecondicionExcepcion {
		
		
		if (parteNombre == null || parteNombre.trim().isEmpty() ) {
			
			throw new ValidacionExcepcion("falta.id.entidad");
		}

		List<TerminoConvocatoriaDO> entidadLista =  getTerminoDAO().seleccionPorNombre(parteNombre); 

		List<TerminoConvocatoriaTO> entidadTOLista = new ArrayList<TerminoConvocatoriaTO>(entidadLista.size());

		if (entidadLista != null && entidadLista.size() > 0) {
			
			TerminoConvocatoriaTO entidadTO = null;
			for (TerminoConvocatoriaDO entidad : entidadLista) {
				
				entidadTO =getTerminoTransf().transferirDOTO(entidad); 
				entidadTOLista.add(entidadTO);
			}
		}

		return entidadTOLista;
		
	}




	
	
	


}
