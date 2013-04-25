package com.cpcoriente.sgp.springgwt.pro.server;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.cpcoriente.sgp.springgwt.pro.client.proyecto.IProyectoServicio;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ContactoProyectoEntidadDO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.DocProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ProyectoEntidadDO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.VersionProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IContactoProyectoEntidadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IDocProyectoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IProyectoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IProyectoEntidadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IVersionProyectoDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.enumerador.EstadoProyectoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IContactoProyectoEntidadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IDocProyectoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IProyectoEntidadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IProyectoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IVersionProyectoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.ContactoProyectoEntidadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.DocProyectoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.ProyectoEntidadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.ProyectoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.VersionProyectoTO;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;


@Service
public class ProyectoServicioImpl extends RemoteServiceServlet implements IProyectoServicio {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public void init() {

	}
	

	private IContactoProyectoEntidadDAO getContactoDAO() {
		
		return  DAOFactory.getInstance().getContactoEntidadDao();
	}


	private IContactoProyectoEntidadTransf getContactoTransf() {
		
		return TransfFactory.getInstance().getContactoTransf();
	}
	
	private IDocProyectoDAO getDocProyectoDAO() {
		
		return  DAOFactory.getInstance().getDocProyectoDao();
	}


	private IDocProyectoTransf getDocProyectoTransf() {
		
		return TransfFactory.getInstance().getDocProyectoTransf();
	}
	
	
	private IProyectoDAO getProyectoDAO() {
		
		return  DAOFactory.getInstance().getProyectoDao();
	}


	private IProyectoTransf getProyectoTransf() {
		
		return TransfFactory.getInstance().getProyectoTransf();
	}
	
	
	private IProyectoEntidadDAO getProyectoEntidadDAO() {
		
		return  DAOFactory.getInstance().getProyectoEntidadDao();
	}


	private IProyectoEntidadTransf getProyectoEntidadTransf() {
		
		return TransfFactory.getInstance().getProyectoEntidadTransf();
	}
	
	private IVersionProyectoDAO getVersionProyectoDAO() {
		
		return  DAOFactory.getInstance().getVersionProyectoDao();
	}


	private IVersionProyectoTransf getVersionProyectoTransf() {
		
		return TransfFactory.getInstance().getVersionProyectoTransf();
	}
	
	public Long crearContactoProyectoEntidad(ContactoProyectoEntidadTO contacto)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(contacto == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.contacto");
		}
		
				
		if(contacto.getApellidos() == null || contacto.getApellidos().trim().isEmpty() || contacto.getApellidos().contains(" ") ){
			throw new ValidacionExcepcion("falta.apellido.contacto");
		}

		if(contacto.getDireccion() == null || contacto.getDireccion().trim().isEmpty() || contacto.getDireccion().contains(" ") ){
			throw new ValidacionExcepcion("falta.direccion.contacto");
		}
		
		if(contacto.getEmail() == null || contacto.getEmail().trim().isEmpty() || contacto.getEmail().contains(" ") ){
			throw new ValidacionExcepcion("falta.email.contacto");
		}
		
		if(contacto.getNombre() == null || contacto.getNombre().trim().isEmpty() || contacto.getNombre().contains(" ") ){
			throw new ValidacionExcepcion("falta.nombre.contacto");
		}
		
		if(contacto.getObservaciones() == null || contacto.getObservaciones().trim().isEmpty() || contacto.getObservaciones().contains(" ") ){
			throw new ValidacionExcepcion("falta.observaciones.contacto");
		}
		
		if(contacto.getProyectoEntidad() == null || contacto.getProyectoEntidad().getId()==null ){
			throw new ValidacionExcepcion("falta.proyecto.entidad.contacto");
		}
		
		if(contacto.getTelefono1() == null || contacto.getObservaciones().trim().isEmpty() || contacto.getObservaciones().contains(" ") ){
			throw new ValidacionExcepcion("falta.observaciones.contacto");
		}
		
		
		try {

			
			ContactoProyectoEntidadDO conProv = new ContactoProyectoEntidadDO();
			
			
			Long idRegistrado = null;

			conProv = getContactoTransf().transferirTODO(contacto);
			
			
			ContactoProyectoEntidadDO conReg = getContactoDAO().persistir(conProv);
			
			if (conReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.actividad.economica");
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

	public Long crearDocProyecto(DocProyectoTO documento)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(documento == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.contacto");
		}
		
				
		if(documento.getDescripcion() == null || documento.getDescripcion().trim().isEmpty() || documento.getDescripcion().contains(" ") ){
			throw new ValidacionExcepcion("falta.apellido.contacto");
		}

		if(documento.getDocumento() == null  ){
			throw new ValidacionExcepcion("falta.direccion.contacto");
		}
		
		if(documento.getFechaRegistro() == null  ){
			throw new ValidacionExcepcion("falta.email.contacto");
		}
		
		if(documento.getNombre() == null || documento.getNombre().trim().isEmpty() || documento.getNombre().contains(" ") ){
			throw new ValidacionExcepcion("falta.nombre.contacto");
		}
		
		if(documento.getProyecto() == null || documento.getProyecto().getId()==null ){
			throw new ValidacionExcepcion("falta.observaciones.contacto");
		}
		
		
		try {

						
			DocProyectoDO docProv = new DocProyectoDO();
			
			Long idRegistrado = null;

			docProv = getDocProyectoTransf().transferirTODO(documento);
			
			DocProyectoDO docReg = getDocProyectoDAO().persistir(docProv);
			
			
			if (docReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.actividad.economica");
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

	public Long crearProyecto(ProyectoTO proyecto) throws ValidacionExcepcion,
			RecursoExcepcion, PrecondicionExcepcion {
		
		
		if(proyecto == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.proyecto");
		}
		
				
		if(proyecto.getCodigo() == null || proyecto.getCodigo().trim().isEmpty() || proyecto.getCodigo().contains(" ") ){
			throw new ValidacionExcepcion("falta.codigo.proyecto");
		}

		if(proyecto.getConvocatoria() == null || proyecto.getConvocatoria().getId()==null ){
			throw new ValidacionExcepcion("falta.convocatoria.proyecto");
		}
		
		if(proyecto.getFechaFin() == null  ){
			throw new ValidacionExcepcion("falta.fecha.fin.proyecto");
		}
		
		if(proyecto.getFechaInicio() == null  ){
			throw new ValidacionExcepcion("falta.fecha.inicio.proyecto");
		}
		
		if (proyecto.getFechaInicio() == null && proyecto.getFechaFin() == null && proyecto.getFechaInicio().after(proyecto.getFechaFin())) {
			throw new ValidacionExcepcion("error.rango.fechas.facturaci\u00f3n.terminado");
		}	
		
		if(proyecto.getTitulo() == null || proyecto.getTitulo().trim().isEmpty() || proyecto.getTitulo().contains(" ") ){
			throw new ValidacionExcepcion("falta.titulo.proyecto");
		}
				
		
		try {

						
			ProyectoDO proProv = new  ProyectoDO();
			
			Long idRegistrado = null;

			proProv = getProyectoTransf().transferirTODO(proyecto);
			
			ProyectoDO proReg = getProyectoDAO().persistir(proProv);
			
			
			if (proReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.proyecto");
			}

			idRegistrado = proReg.getId();

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

	public Long crearProyectoEntidad(ProyectoEntidadTO proyEnt)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(proyEnt == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.proyecto.entidad");
		}
		
				
		if(proyEnt.getEntidad() == null || proyEnt.getEntidad().getId()==null ){
			throw new ValidacionExcepcion("falta.entidad.proyecto");
		}

		if(proyEnt.getProyecto() == null || proyEnt.getProyecto().getId()==null ){
			throw new ValidacionExcepcion("falta.proyecto");
		}
		
		if(proyEnt.getTipoFuncion() == null  ){
			throw new ValidacionExcepcion("falta.tipo.funcion");
		}
		
		
				
		
		try {

			ProyectoEntidadDO	proProv = new ProyectoEntidadDO();
						
			Long idRegistrado = null;

			proProv = getProyectoEntidadTransf().transferirTODO(proyEnt);
			
			ProyectoEntidadDO proReg = getProyectoEntidadDAO().persistir(proProv);
			
			
			if (proReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.actividad.economica");
			}

			idRegistrado = proReg.getId();

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

	public long crearVersionProyecto(VersionProyectoTO version)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(version == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.version.proyecto");
		}
		
				
		if(version.getCodigo() == null || version.getCodigo().trim().isEmpty() || version.getCodigo().contains(" ") ){
			throw new ValidacionExcepcion("falta.codigo.version.proyecto");
		}

		if(version.getEstado() == null  ){
			throw new ValidacionExcepcion("falta.estado.version.proyecto");
		}
			
		if(version.getFechaFin() == null  ){
			
			throw new ValidacionExcepcion("falta.fecha.inicio.version.proyecto");
		}

		
		if(version.getFechaInicio() == null  ){
			throw new ValidacionExcepcion("falta.fecha.fin.version.proyecto");
		}
		
		if (version.getFechaInicio() == null && version.getFechaFin() == null && version.getFechaInicio().after(version.getFechaFin())) {
			
			throw new ValidacionExcepcion("error.rango.fechas.");
		}	
		
		if(version.getObjetivoGeneral() == null || version.getObjetivoGeneral().trim().isEmpty() || version.getObjetivoGeneral().contains(" ") ){
			throw new ValidacionExcepcion("falta.objetivo.general.version.proyecto");
		}
		
		if(version.getObservacion() == null || version.getObservacion().trim().isEmpty() || version.getObservacion().contains(" ") ){
			throw new ValidacionExcepcion("falta.observacion.version.proyecto");
		}
		
		if(version.getProyecto() == null || version.getProyecto().getId()==null ){
			throw new ValidacionExcepcion("falta.proyecto.version.proyecto");
		}
		
		if(version.getTitulo() == null || version.getTitulo().trim().isEmpty() || version.getTitulo().contains(" ") ){
			throw new ValidacionExcepcion("falta.titulo.version.proyecto");
		}
				
		
		try {

									
			VersionProyectoDO verProv = new VersionProyectoDO();
			
			Long idRegistrado = null;

			verProv = getVersionProyectoTransf().transferirTODO(version); 
			
			
			VersionProyectoDO verReg = getVersionProyectoDAO().persistir(verProv);		
			
			if (verReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.version.proyecto");
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
	
	public boolean modificarContactoEntidad(ContactoProyectoEntidadTO contacto)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(contacto == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.contacto.proyecto.entidad")	;
		}
		
		if(contacto.getId() == null  ){
			throw new ValidacionExcepcion("falta.identificador.contacto.proyecto.entidad")	;
		}

		if(contacto.getApellidos() == null || contacto.getApellidos().trim().isEmpty() || contacto.getApellidos().contains(" ") ){
			throw new ValidacionExcepcion("falta.apellido.contacto.proyecto.entidad");
		}

		if(contacto.getCiudad() == null || contacto.getCiudad().getId()!=null ){
			throw new ValidacionExcepcion("falta.ciudad.contacto.proyecto.entidad")	;
		}

		if(contacto.getDepartamento() == null || contacto.getDepartamento().getId()!=null ){
			throw new ValidacionExcepcion("falta.departamento.contacto.proyecto.entidad");
		}
		
		if(contacto.getDireccion() == null || contacto.getDireccion().trim().isEmpty() || contacto.getDireccion().contains(" ") ){
			throw new ValidacionExcepcion("falta.direccion.contacto.proyecto.entidad");
		}
		
		if(contacto.getEmail() == null || contacto.getEmail().trim().isEmpty() || contacto.getEmail().contains(" ") ){
			throw new ValidacionExcepcion("falta.email.contacto.proyecto.entidad");
		}
		
		if(contacto.getNombre() == null || contacto.getNombre().trim().isEmpty() || contacto.getNombre().contains(" ") ){
			throw new ValidacionExcepcion("falta.nombre.contacto.proyecto.entidad");
		}
		
		if(contacto.getObservaciones() == null || contacto.getObservaciones().trim().isEmpty() || contacto.getObservaciones().contains(" ") ){
			throw new ValidacionExcepcion("falta.observacion.contacto.proyecto.entidad");
		}

		if(contacto.getPais() == null || contacto.getPais().getId()==null ){
			throw new ValidacionExcepcion("falta.pais.contacto.proyecto.entidad");
		}

		if(contacto.getProyectoEntidad() == null || contacto.getProyectoEntidad().getId()==null ){
			throw new ValidacionExcepcion("falta.proyecto.entidad");
		}
		
		if(contacto.getTelefono1() == null || contacto.getTelefono1().trim().isEmpty() || contacto.getTelefono1().contains(" ") ){
			throw new ValidacionExcepcion("falta.telefono1.contacto.proyecto.entidad");
		}
		
				
		ContactoProyectoEntidadDO  conProv = getContactoDAO().cargar(contacto.getId());
		
		if (conProv == null) {
			throw new PrecondicionExcepcion("inexistente.identificador.contacto.proyecto.entidad");
		}
		
		conProv = getContactoTransf().transferirTODO(contacto);
		
		
		try {
			
			ContactoProyectoEntidadDO conMod = getContactoDAO().modificar(conProv);

			if (conMod == null) {
				throw new RecursoExcepcion("fallo.modificar.contacto.proyecto.entidad");
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

	public boolean modificarDocProyecto(DocProyectoTO documento)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(documento == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.documento.proyecto")	;
		}
		
		if(documento.getId() == null  ){
			throw new ValidacionExcepcion("falta.identificador.documento.proyecto")	;
		}

		if(documento.getDescripcion() == null || documento.getDescripcion().trim().isEmpty() || documento.getDescripcion().contains(" ") ){
			throw new ValidacionExcepcion("falta.descripcion.documento.proyecto");
		}

		if(documento.getDocumento() == null  ){
			throw new ValidacionExcepcion("falta.archivo.documento.proyecto")	;
		}

		if(documento.getFechaRegistro() == null  ){
			throw new ValidacionExcepcion("falta.fecha.registro.documento.proyecto");
		}
		
		if(documento.getNombre() == null || documento.getNombre().trim().isEmpty() || documento.getNombre().contains(" ") ){
			throw new ValidacionExcepcion("falta.nombre.documento.proyecto");
		}
		
		if(documento.getProyecto() == null || documento.getProyecto().getId()==null ){
			throw new ValidacionExcepcion("falta.proyecto");
		}
		
						
		DocProyectoDO docProv = getDocProyectoDAO().cargar(documento.getId());
		
		
		if (docProv == null) {
			throw new PrecondicionExcepcion("inexistente.identificador.documento.proyecto");
		}
		
		
		docProv = getDocProyectoTransf().transferirTODO(documento);
		
		try {
						
			DocProyectoDO docMod = getDocProyectoDAO().modificar(docProv);

			if (docMod == null) {
				throw new RecursoExcepcion("fallo.modificar.documento.proyecto");
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

	public boolean modificarProyecto(ProyectoTO proyecto)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(proyecto == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.proyecto")	;
		}
		
		if(proyecto.getId() == null  ){
			throw new ValidacionExcepcion("falta.identificador.proyecto")	;
		}

		if(proyecto.getCodigo() == null || proyecto.getCodigo().trim().isEmpty() || proyecto.getCodigo().contains(" ") ){
			throw new ValidacionExcepcion("falta.codigo.proyecto");
		}

		if(proyecto.getConvocatoria() == null || proyecto.getConvocatoria().getId()!=null ){
			throw new ValidacionExcepcion("falta.convocatoria.proyecto")	;
		}

		if(proyecto.getEstado() == null  ){
			throw new ValidacionExcepcion("falta.estado.proyecto");
		}
		
		if(proyecto.getFechaFin()==null ){
			throw new ValidacionExcepcion("falta.fecha.fin.proyecto");
		}
		
		if(proyecto.getFechaInicio()==null ){
			throw new ValidacionExcepcion("falta.fecha.inicio.proyecto");
		}
		
		if (proyecto.getFechaInicio() == null && proyecto.getFechaFin() == null && proyecto.getFechaInicio().after(proyecto.getFechaFin())) {
			
			throw new ValidacionExcepcion("error.rango.fechas.");
		}	
		
		if(proyecto.getPorContrapartida() < 0  ){
			throw new ValidacionExcepcion("falta.contrapartida.proyecto");
		}
		
		if(proyecto.getPorFinanziado() < 0  ){
			throw new ValidacionExcepcion("falta.porcentaje.financiado.proyecto");
		}
			
		
		if(proyecto.getTitulo() == null || proyecto.getTitulo().trim().isEmpty() || proyecto.getTitulo().contains(" ") ){
			throw new ValidacionExcepcion("falta.titulo.proyecto");
		}

				
		
		ProyectoDO proProv = getProyectoDAO().cargar(proyecto.getId());
		
		if (proProv == null) {
			throw new PrecondicionExcepcion("inexistente.identificador.proyecto");
		}
				
		proProv = getProyectoTransf().transferirTODO(proyecto);
		
		try {
						
			
			ProyectoDO proMod = getProyectoDAO().modificar(proProv);

			if (proMod == null) {
				throw new RecursoExcepcion("fallo.modificar.proyecto");
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

	public boolean modificarProyectoEntidad(ProyectoEntidadTO proyEntidad)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
	
		if(proyEntidad == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.contacto.proyecto.entidad")	;
		}
		
		if(proyEntidad.getId() == null  ){
			throw new ValidacionExcepcion("falta.identificador.contacto.proyecto.entidad")	;
		}

		if(proyEntidad.getEntidad() == null || proyEntidad.getEntidad().getId()==null ){
			throw new ValidacionExcepcion("falta.apellido.contacto.proyecto.entidad");
		}

		if(proyEntidad.getProyecto() == null || proyEntidad.getProyecto().getId()==null ){
			throw new ValidacionExcepcion("falta.ciudad.contacto.proyecto.entidad")	;
		}

		if(proyEntidad.getTipoFuncion() == null  ){
			throw new ValidacionExcepcion("falta.departamento.contacto.proyecto.entidad");
		}
		
				
		
		ProyectoEntidadDO proProv = getProyectoEntidadDAO().cargar(proyEntidad.getId());
		
		if (proProv == null) {
			throw new PrecondicionExcepcion("inexistente.identificador.contacto.proyecto.entidad");
		}
				
		proProv = getProyectoEntidadTransf().transferirTODO(proyEntidad); 
		
		try {
						
			
			ProyectoEntidadDO proMod = getProyectoEntidadDAO().modificar(proProv);

			if (proMod == null) {
				throw new RecursoExcepcion("fallo.modificar.contacto.proyecto.entidad");
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

	public boolean modificarVersionProyecto(VersionProyectoTO proyEntidad)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(proyEntidad == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.version.proyecto")	;
		}
		
		if(proyEntidad.getId() == null  ){
			throw new ValidacionExcepcion("falta.identificador.version.proyecto")	;
		}

		if(proyEntidad.getCodigo() == null || proyEntidad.getCodigo().trim().isEmpty() || proyEntidad.getCodigo().contains(" ") ){
			throw new ValidacionExcepcion("falta.codigo.version.proyecto");
		}
		
		if(proyEntidad.getEstado() == null  ){
			throw new ValidacionExcepcion("falta.estado.version.proyecto");
		}
		
		if(proyEntidad.getFechaFin()==null ){
			throw new ValidacionExcepcion("falta.fecha.fin.version.proyecto");
		}
		
		if(proyEntidad.getFechaInicio()==null ){
			throw new ValidacionExcepcion("falta.fecha.inicio.version.proyecto");
		}
		
		if (proyEntidad.getFechaInicio() == null && 
			proyEntidad.getFechaFin() == null && 
			proyEntidad.getFechaInicio().after(proyEntidad.getFechaFin())) {
			
			throw new ValidacionExcepcion("error.rango.fechas.");
		}	
		
		if(proyEntidad.getObjetivoGeneral() == null || proyEntidad.getObjetivoGeneral().trim().isEmpty() || proyEntidad.getObjetivoGeneral().contains(" ") ){
			throw new ValidacionExcepcion("falta.objetivo.general.version.proyecto");
		}
		
		if(proyEntidad.getProyecto() == null || proyEntidad.getProyecto().getId()==null ){
			throw new ValidacionExcepcion("falta.proyecto")	;
		}	
		
		if(proyEntidad.getObservacion() == null || proyEntidad.getObservacion().trim().isEmpty() || proyEntidad.getObservacion().contains(" ") ){
			throw new ValidacionExcepcion("falta.observacion.version.proyecto");
		}
		
		if(proyEntidad.getTitulo() == null || proyEntidad.getTitulo().trim().isEmpty() || proyEntidad.getTitulo().contains(" ") ){
			throw new ValidacionExcepcion("falta.titulo.version.proyecto");
		}
		
		VersionProyectoDO verProv = getVersionProyectoDAO().cargar(proyEntidad.getId());
		
		if (verProv == null) {
			throw new PrecondicionExcepcion("inexistente.identificador.version.proyecto");
		}
				
		verProv = getVersionProyectoTransf().transferirTODO(proyEntidad);
		
		try {
						
			
			VersionProyectoDO verMod = getVersionProyectoDAO().modificar(verProv);
			

			if (verMod == null) {
				throw new RecursoExcepcion("fallo.modificar.version.proyecto");
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


	public boolean eliminarContactoEntidad(Long idContacto)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idContacto == null || idContacto.longValue() < 0 ) {
			
			throw new ValidacionExcepcion("falta.identificador.contacto.proyecto");
		}

		try {
			ContactoProyectoEntidadDO proyecto = null;

			proyecto = getContactoDAO().cargar(idContacto);
			
			if (proyecto == null) {
				throw new PrecondicionExcepcion("inexistente.identificador.contacto.proyecto");
			}
			
			boolean res = getContactoDAO().eliminar(idContacto); 

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

	public boolean eliminarDocProyecto(Long idDocProyecto)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idDocProyecto == null || idDocProyecto.longValue() < 0 ) {
			
			throw new ValidacionExcepcion("falta.identificador.documento.proyecto");
		}

		try {
			DocProyectoDO proyecto = null;

			proyecto = getDocProyectoDAO().cargar(idDocProyecto);
			
			if (proyecto == null) {
				throw new PrecondicionExcepcion("inexistente.identificador.documento.proyecto");
			}
			
			boolean res = getDocProyectoDAO().eliminar(idDocProyecto);

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

	public boolean eliminarProyecto(Long idProyecto)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		
		if (idProyecto == null || idProyecto.longValue() < 0 ) {
			
			throw new ValidacionExcepcion("falta.identificador.proyecto");
		}

		try {
			ProyectoDO proyecto = null;

			proyecto = getProyectoDAO().cargar(idProyecto); 
			
			if (proyecto == null) {
				throw new PrecondicionExcepcion("inexistente.identificador.proyecto");
			}
			
			boolean res = getProyectoDAO().eliminar(idProyecto);

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

	public boolean eliminarProyectoEntidad(Long idProyEntidad)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idProyEntidad == null || idProyEntidad.longValue() < 0 ) {
			
			throw new ValidacionExcepcion("falta.identificador.proyecto.entidad");
		}

		try {
			
			ProyectoEntidadDO proyecto = null;

			proyecto = getProyectoEntidadDAO().cargar(idProyEntidad); 
			
			if (proyecto == null) {
				throw new PrecondicionExcepcion("inexistente.identificador.proyecto.entidad");
			}
			
			boolean res = getProyectoEntidadDAO().eliminar(idProyEntidad);

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

	public boolean eliminarVersionProyecto(Long idVersion)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		
		if (idVersion == null || idVersion.longValue() < 0 ) {
			
			throw new ValidacionExcepcion("falta.identificador.version.proyecto");
		}

		try {
			
			VersionProyectoDO version = null;

			
			version = getVersionProyectoDAO().cargar(idVersion);
			
			if (version == null) {
				throw new PrecondicionExcepcion("inexistente.identificador.version.proyecto");
			}
			
			boolean res = getVersionProyectoDAO().eliminar(idVersion); 
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

	public List<ContactoProyectoEntidadTO> listarTodoContactoProyecto()
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		List<ContactoProyectoEntidadDO> contactoLista =getContactoDAO().listarTodo(); 

		List<ContactoProyectoEntidadTO> contactoTOLista = new ArrayList<ContactoProyectoEntidadTO>(contactoLista.size());

		if (contactoLista != null && contactoLista.size() > 0) {
			ContactoProyectoEntidadTO actividadTO = null;
			for (ContactoProyectoEntidadDO actividad : contactoLista) {
				actividadTO =getContactoTransf().transferirDOTO(actividad); 
				contactoTOLista.add(actividadTO);
			}
		}
		return contactoTOLista;

	}

	public List<ContactoProyectoEntidadTO> listarContactoProyectoPorNombre(
			String parteNombre) throws ValidacionExcepcion,
			PrecondicionExcepcion {
		
		
		List<ContactoProyectoEntidadDO> contactoLista = getContactoDAO().seleccionParteNombre(parteNombre);

		List<ContactoProyectoEntidadTO> contactoTOLista = new ArrayList<ContactoProyectoEntidadTO>(contactoLista.size());

		if (contactoLista != null && contactoLista.size() > 0) {
			ContactoProyectoEntidadTO contactoTO = null;
			for (ContactoProyectoEntidadDO contacto : contactoLista) {
				contactoTO = getContactoTransf().transferirDOTO(contacto); 
				contactoTOLista.add(contactoTO);
			}
		}

		return contactoTOLista;

		
	}

	public List<ContactoProyectoEntidadTO> listarContactoPorProyecto(
			Long idProyecto) throws ValidacionExcepcion, PrecondicionExcepcion {
		
		List<ContactoProyectoEntidadDO> contactoLista = getContactoDAO().seleccionPorProyecto(idProyecto);

		List<ContactoProyectoEntidadTO> contactoTOLista = new ArrayList<ContactoProyectoEntidadTO>(contactoLista.size());

		if (contactoLista != null && contactoLista.size() > 0) {
			ContactoProyectoEntidadTO contactoTO = null;
			for (ContactoProyectoEntidadDO contacto : contactoLista) {
				contactoTO = getContactoTransf().transferirDOTO(contacto); 
				contactoTOLista.add(contactoTO);
			}
		}

		return contactoTOLista;
	}

	public List<ContactoProyectoEntidadTO> listarContactoPorProyectoPorEntidad(
			Long idProyecto, Long idEntidad) throws ValidacionExcepcion,
			PrecondicionExcepcion {
		
		List<ContactoProyectoEntidadDO> convocatoriaLista = getContactoDAO().seleccionPorProyectoEntidad(idProyecto, idEntidad);

		List<ContactoProyectoEntidadTO> convocatoriaTOLista = new ArrayList<ContactoProyectoEntidadTO>(convocatoriaLista.size());

		if (convocatoriaLista != null && convocatoriaLista.size() > 0) {
			ContactoProyectoEntidadTO convocatoriaTO = null;
			for (ContactoProyectoEntidadDO convocatoria : convocatoriaLista) {
				convocatoriaTO = getContactoTransf().transferirDOTO(convocatoria); 
				convocatoriaTOLista.add(convocatoriaTO);
			}
		}

		return convocatoriaTOLista;
		
	}

	public List<DocProyectoTO> listarDocumentoProyectoPorProyecto(
			Long idProyecto) throws ValidacionExcepcion, PrecondicionExcepcion {
		
	
		List<DocProyectoDO> documentoLista = getDocProyectoDAO().listarPorProyecto(idProyecto);

		List<DocProyectoTO> documentoTOLista = new ArrayList<DocProyectoTO>(documentoLista.size());

		if (documentoLista != null && documentoLista.size() > 0) {
			DocProyectoTO documentoTO = null;
			for (DocProyectoDO documento : documentoLista) {
				documentoTO =getDocProyectoTransf().transferirDOTO(documento);  
				documentoTOLista.add(documentoTO);
			}
		}

		return documentoTOLista;
	
	}

	public List<ProyectoTO> listarProyectoPorDivision(Long idDivision)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		
		List<ProyectoDO> proyectoLista =getProyectoDAO().listarTodo(idDivision);

		List<ProyectoTO> proyectoTOLista = new ArrayList<ProyectoTO>(proyectoLista.size());

		if (proyectoLista != null && proyectoLista.size() > 0) {
			ProyectoTO proyectoTO = null;
			for (ProyectoDO proyecto : proyectoLista) {
				proyectoTO = getProyectoTransf().transferirDOTO(proyecto);  
				proyectoTOLista.add(proyectoTO);
			}
		}

		return proyectoTOLista;
		
	}

	public List<ProyectoTO> listarProyectoPorTitulo(String titulo)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
	
		List<ProyectoDO> proyectoLista =getProyectoDAO().seleccionPorTitulo(titulo);

		List<ProyectoTO> proyectoTOLista = new ArrayList<ProyectoTO>(proyectoLista.size());

		if (proyectoLista != null && proyectoLista.size() > 0) {
			ProyectoTO proyectoTO = null;
			for (ProyectoDO proyecto : proyectoLista) {
				proyectoTO = getProyectoTransf().transferirDOTO(proyecto);  
				proyectoTOLista.add(proyectoTO);
			}
		}

		return proyectoTOLista;

	
	}

	public List<ProyectoTO> listarProyectoPorCodigo(String codigo)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		
		List<ProyectoDO> proyectoLista =getProyectoDAO().seleccionPorCodigo(codigo);

		List<ProyectoTO> proyectoTOLista = new ArrayList<ProyectoTO>(proyectoLista.size());

		if (proyectoLista != null && proyectoLista.size() > 0) {
			ProyectoTO proyectoTO = null;
			for (ProyectoDO proyecto : proyectoLista) {
				proyectoTO = getProyectoTransf().transferirDOTO(proyecto);  
				proyectoTOLista.add(proyectoTO);
			}
		}

		return proyectoTOLista;
		
	}

	public List<ProyectoTO> listarProyectoPorFechaInicioFechaFin(
			Date fechaInicio, Date fechaFin) throws ValidacionExcepcion,
			PrecondicionExcepcion {
		
	
		List<ProyectoDO> proyectoLista =getProyectoDAO().seleccionPorFechaInicio(fechaInicio, fechaFin);

		List<ProyectoTO> proyectoTOLista = new ArrayList<ProyectoTO>(proyectoLista.size());

		if (proyectoLista != null && proyectoLista.size() > 0) {
			ProyectoTO proyectoTO = null;
			for (ProyectoDO proyecto : proyectoLista) {
				proyectoTO = getProyectoTransf().transferirDOTO(proyecto);  
				proyectoTOLista.add(proyectoTO);
			}
		}

		return proyectoTOLista;
	
	}

	public List<ProyectoTO> listarProyectoPorConvocatoria(Long idConvocatoria)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		
		List<ProyectoDO> proyectoLista =getProyectoDAO().seleccionPorConvocatoria(idConvocatoria);

		List<ProyectoTO> proyectoTOLista = new ArrayList<ProyectoTO>(proyectoLista.size());

		if (proyectoLista != null && proyectoLista.size() > 0) {
			ProyectoTO proyectoTO = null;
			for (ProyectoDO proyecto : proyectoLista) {
				proyectoTO = getProyectoTransf().transferirDOTO(proyecto);  
				proyectoTOLista.add(proyectoTO);
			}
		}

		return proyectoTOLista;
	}

	public List<ProyectoTO> listarProyectoPorEstado(EstadoProyectoEnum estado)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		List<ProyectoDO> proyectoLista =getProyectoDAO().seleccionPorEstado(estado.getValor());

		List<ProyectoTO> proyectoTOLista = new ArrayList<ProyectoTO>(proyectoLista.size());

		if (proyectoLista != null && proyectoLista.size() > 0) {
			ProyectoTO proyectoTO = null;
			for (ProyectoDO proyecto : proyectoLista) {
				proyectoTO = getProyectoTransf().transferirDOTO(proyecto);  
				proyectoTOLista.add(proyectoTO);
			}
		}

		return proyectoTOLista;
		
	}

	public List<VersionProyectoTO> listarVersionProyectoPorFechaProyecto(
			Long idProyecto, Date fechaInicio, Date fechaFin)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		List<VersionProyectoDO> versionLista = getVersionProyectoDAO().seleccionPorproyectoFecha(idProyecto, fechaInicio, fechaFin); 

		List<VersionProyectoTO> versionTOLista = new ArrayList<VersionProyectoTO>(versionLista.size());

		if (versionLista != null && versionLista.size() > 0) {
			VersionProyectoTO versionTO = null;
			for (VersionProyectoDO version : versionLista) {
				versionTO = getVersionProyectoTransf().transferirDOTO(version); 
				versionTOLista.add(versionTO);
			}
		}

		return versionTOLista;
	}

	public List<VersionProyectoTO> listarVersionProyectoPorProyecto(
			Long idProyecto) throws ValidacionExcepcion, PrecondicionExcepcion {
		
		List<VersionProyectoDO> versionLista = getVersionProyectoDAO().seleccionPorProyecto(idProyecto); 

		List<VersionProyectoTO> versionTOLista = new ArrayList<VersionProyectoTO>(versionLista.size());

		if (versionLista != null && versionLista.size() > 0) {
			VersionProyectoTO versionTO = null;
			for (VersionProyectoDO proyecto : versionLista) {
				versionTO = getVersionProyectoTransf().transferirDOTO(proyecto); 
				versionTOLista.add(versionTO);
			}
		}

		return versionTOLista;
		
	}


	public ContactoProyectoEntidadTO cargarContactoProyecto(Long idContacto)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		

		ContactoProyectoEntidadTO actividadTO = null;
		ContactoProyectoEntidadDO actividadDO = null;

		if (idContacto == null  ) {
			
			throw new ValidacionExcepcion("falta.id.contacto.proyecto");
		}

		actividadDO = getContactoDAO().cargar(idContacto); 		

		if (actividadDO == null) {
			
			throw new PrecondicionExcepcion("inexistente.id.contacto.proyecto");
		}

		actividadTO = getContactoTransf().transferirDOTO(actividadDO); 
		
		return actividadTO;

	
	}


	public DocProyectoTO cargarDocumentoProyecto(Long idDocumento)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		
		DocProyectoTO actividadTO = null;
		DocProyectoDO actividadDO = null;

		if (idDocumento == null  ) {
			
			throw new ValidacionExcepcion("falta.id.documento.proyecto");
		}

		actividadDO = getDocProyectoDAO().cargar(idDocumento);

		if (actividadDO == null) {
			
			throw new PrecondicionExcepcion("inexistente.id.documento.proyecto");
		}

		actividadTO = getDocProyectoTransf().transferirDOTO(actividadDO); 
		
		return actividadTO;
	}


	public ProyectoTO cargarProyecto(Long idProyecto)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		
		ProyectoTO actividadTO = null;
		ProyectoDO actividadDO = null;

		if (idProyecto == null  ) {
			
			throw new ValidacionExcepcion("falta.id.proyecto");
		}

		actividadDO = getProyectoDAO().cargar(idProyecto);
		
		

		if (actividadDO == null) {
			
			throw new PrecondicionExcepcion("inexistente.id.proyecto");
		}

		actividadTO = getProyectoTransf().transferirDOTO(actividadDO); 
		
		return actividadTO;

	}


	public ProyectoEntidadTO cargarProyectoEntidad(Long idProyectoEntidad)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		ProyectoEntidadTO actividadTO = null;
		ProyectoEntidadDO actividadDO = null;

		if (idProyectoEntidad == null  ) {
			
			throw new ValidacionExcepcion("falta.id.proyecto.entidad");
		}

		actividadDO = getProyectoEntidadDAO().cargar(idProyectoEntidad);
		
		

		if (actividadDO == null) {
			
			throw new PrecondicionExcepcion("inexistente.id.proyecto.entidad");
		}

		actividadTO = getProyectoEntidadTransf().transferirDOTO(actividadDO); 
		
		return actividadTO;
		
	}


	public VersionProyectoTO cargarVersionProyecto(Long idVersionProyecto)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		
		VersionProyectoTO actividadTO = null;
		VersionProyectoDO actividadDO = null;

		if (idVersionProyecto == null  ) {
			
			throw new ValidacionExcepcion("falta.id.version.proyecto");
		}

		actividadDO = getVersionProyectoDAO().cargar(idVersionProyecto);
		

		if (actividadDO == null) {
			
			throw new PrecondicionExcepcion("inexistente.id.version.proyecto");
		}

		actividadTO = getVersionProyectoTransf().transferirDOTO(actividadDO); 
		
		return actividadTO;
	}


	public List<ProyectoTO> seleccionPorGeneralProyecto(String codigo,
			String titulo, Long idConvocatoria, int estado, Date fechaIni,
			Date fechaFin, Long idEmpresa) throws ValidacionExcepcion,
			PrecondicionExcepcion {
		
		if (idEmpresa == null || idEmpresa.longValue()>0 ) {
			
			throw new PrecondicionExcepcion("falta.id.empresa");
		}
		
		List<ProyectoDO> proyectoLista =getProyectoDAO().seleccionPorGeneral(codigo, 
				titulo, idConvocatoria, estado, fechaIni, fechaFin, idEmpresa);

		List<ProyectoTO> proyectoTOLista = new ArrayList<ProyectoTO>(proyectoLista.size());

		if (proyectoLista != null && proyectoLista.size() > 0) {
			ProyectoTO proyectoTO = null;
			for (ProyectoDO proyecto : proyectoLista) {
				proyectoTO = getProyectoTransf().transferirDOTO(proyecto);  
				proyectoTOLista.add(proyectoTO);
			}
		}

		return proyectoTOLista;
	}


	

	


	

}
