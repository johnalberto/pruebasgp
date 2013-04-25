package com.cpcoriente.sgp.springgwt.pro.server;

import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.cpcoriente.sgp.springgwt.pro.client.correspondencia.ICorrespondenciaServicio;
import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.entity.MensajeDO;
import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.interfaces.dao.IDestinoMensajeDAO;
import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.interfaces.dao.IDocMensajeDAO;
import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.interfaces.dao.IMensajeDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.interfaces.transfer.IDestinoMensajeTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.interfaces.transfer.IDocMensajeTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.interfaces.transfer.IMensajeTrasf;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.objeto.MensajeTO;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;



@Service
public class CorrespondenciaServicioImpl extends RemoteServiceServlet implements ICorrespondenciaServicio {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void init() {

	}

	private IMensajeDAO getMensajeDAO() {
		
		return  DAOFactory.getInstance().getMensajeDao();
	}


	private IMensajeTrasf getMensajeTransf() {
		return TransfFactory.getInstance().getMensajeTransf();
	}
	
	private IDestinoMensajeDAO getDestinoDAO() {
		
		return  DAOFactory.getInstance().getDestinoMensajeDao();
	}


	private IDestinoMensajeTransf getDestinoTransf() {
		return TransfFactory.getInstance().getDestinoMensajeTransf();
	}

	
	private IDocMensajeDAO getDocMensajeDAO() {
		
		return  DAOFactory.getInstance().getDocMensajeDao();
	}


	private IDocMensajeTransf getDocMensajeTransf() {
		return TransfFactory.getInstance().getDocMensajeTransf();
	}
	
	
	
	public Long crearMensaje(MensajeTO mensaje) throws ValidacionExcepcion,
			RecursoExcepcion, PrecondicionExcepcion {
		
		if(mensaje == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.mensaje")	;
		}
		
		
		if(mensaje.getAsunto() == null || mensaje.getAsunto().trim().isEmpty() || mensaje.getAsunto().contains(" ") ){
			throw new ValidacionExcepcion("falta.asunto.mensaje")	;
		}

		if(mensaje.getCodigo() == null || mensaje.getCodigo().trim().isEmpty() || mensaje.getCodigo().contains(" ") ){
			throw new ValidacionExcepcion("falta.identificador.convocatoria")	;
		}
		
		if(mensaje.getCuerpo() == null || mensaje.getCuerpo().trim().isEmpty() || mensaje.getCuerpo().contains(" ") ){
			throw new ValidacionExcepcion("falta.identificador.convocatoria")	;
		}
		
		if(mensaje.getDesMensajeList() == null || mensaje.getDesMensajeList().size()==0 ){
			throw new ValidacionExcepcion("falta.identificador.convocatoria")	;
		}
		
		if(mensaje.getUsuario() == null || mensaje.getUsuario().getId()==null ){
			throw new ValidacionExcepcion("falta.identificador.convocatoria")	;
		}
		
		

		try {

			
			MensajeDO menProv =new MensajeDO();
						
			Long idRegistrado = null;

			
			menProv = getMensajeTransf().transferirTODO(mensaje);
			
			MensajeDO menReg = getMensajeDAO().persistir(menProv);
			
			
			if (mensaje.getDesMensajeList()!=null) {
				
				boolean desRes = getDestinoDAO().persistirList(menProv.getDesMensajeSet());
				
			}
			
			if (mensaje.getDocMensajeList()!=null) {
				
				boolean desRes = getDocMensajeDAO().persistirList(menProv.getDocMensajeSet()); 
				
			}

			if (menReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.convocatoria");
			}

			idRegistrado = menReg.getId();

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

	public boolean modificarMensaje(MensajeTO mensaje)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(mensaje == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.mensaje")	;
		}
		if(mensaje.getId() == null  ){
			
			throw new ValidacionExcepcion("falta.identificador.mensaje")	;
		}

		if(mensaje.getAsunto() == null || mensaje.getAsunto().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.asunto.mensaje")	;
		}

		if(mensaje.getCodigo() == null || mensaje.getCodigo().trim().isEmpty()){
			
			throw new ValidacionExcepcion("falta.codigo.mensaje")	;
		}

		if(mensaje.getCuerpo() == null || mensaje.getCuerpo().trim().isEmpty()){
			
			throw new ValidacionExcepcion("falta.cuerpo.mensaje")	;
		}
		
		if(mensaje.getUsuario() == null || mensaje.getUsuario().getId()==null ){
			
			throw new ValidacionExcepcion("falta.usuario.nombre")	;
		}

		
		MensajeDO menProv = getMensajeDAO().cargar(mensaje.getId());
				
		if (menProv == null) {
			throw new PrecondicionExcepcion("inexistente.identificador.mensaje");
		}

		menProv = getMensajeTransf().transferirTODO(mensaje);
		
		try {
						
			MensajeDO menMod = getMensajeDAO().modificar(menProv);

			if (menMod == null) {
				throw new RecursoExcepcion("fallo.modificar.mensaje");
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

	public boolean eliminarMensaje(Long idMensaje) throws ValidacionExcepcion,
			PrecondicionExcepcion {
		
		
		if (idMensaje == null || idMensaje.longValue() < 0 ) {
			
			throw new ValidacionExcepcion("falta.identificador.mensaje");
		}

		try {
			MensajeDO mensaje = null;
			
			mensaje = getMensajeDAO().cargar(idMensaje);
			
			if (mensaje == null) {
				throw new PrecondicionExcepcion("inexistente.identificador.mensaje");
			}
			
			boolean res =getMensajeDAO().eliminar(idMensaje);

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

	public MensajeTO cargarMensaje(Long idMensaje) throws ValidacionExcepcion,
			PrecondicionExcepcion {

	
		MensajeTO mensajeTO = null;
		MensajeDO mensajeDO = null;

		if (idMensaje == null  ) {
			
			throw new ValidacionExcepcion("falta.id.mensaje");
		}

		mensajeDO = getMensajeDAO().cargar(idMensaje);
		
		

		if (mensajeDO == null) {
			
			throw new PrecondicionExcepcion("inexistente.identificador.mensaje");
		}

		mensajeTO = getMensajeTransf().transferirDOTO(mensajeDO);
		
		
		return mensajeTO;
	
	}

	public List<MensajeTO> listarTodoProyecto(Long idProyecto)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idProyecto == null  ) {
			throw new ValidacionExcepcion("falta.identificador.proyecto");
		}

		List<MensajeDO> convocatoriaLista = getMensajeDAO().listarTodo(idProyecto); 

		List<MensajeTO> convocatoriaTOLista = new ArrayList<MensajeTO>(convocatoriaLista.size());

		if (convocatoriaLista != null && convocatoriaLista.size() > 0) {
			MensajeTO convocatoriaTO = null;
			for (MensajeDO convocatoria : convocatoriaLista) {
				
				convocatoriaTO = getMensajeTransf().transferirDOTO(convocatoria);
				convocatoriaTOLista.add(convocatoriaTO);
			}
		}

		return convocatoriaTOLista;

		
	}

	public List<MensajeTO> listarMensajesPorUsuario(Long idUsuario)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		
		if (idUsuario == null  ) {
			throw new ValidacionExcepcion("falta.identificador.usuario");
		}

		List<MensajeDO> convocatoriaLista = getMensajeDAO().seleccionPorPersonaEnvia(idUsuario); 

		List<MensajeTO> convocatoriaTOLista = new ArrayList<MensajeTO>(convocatoriaLista.size());

		if (convocatoriaLista != null && convocatoriaLista.size() > 0) {
			MensajeTO convocatoriaTO = null;
			for (MensajeDO convocatoria : convocatoriaLista) {
				
				convocatoriaTO = getMensajeTransf().transferirDOTO(convocatoria);
				convocatoriaTOLista.add(convocatoriaTO);
			}
		}

		return convocatoriaTOLista;
		
	}

	public List<MensajeTO> listarMensajesPorUsuarioPorProyecto(Long idUsuario,
			Long idProyecto) throws ValidacionExcepcion, PrecondicionExcepcion {
		
		
		if (idUsuario == null  ) {
			throw new ValidacionExcepcion("falta.identificador.usuario");
		}
		
		if (idProyecto == null  ) {
			
			throw new ValidacionExcepcion("falta.identificador.proyecto");
		}


		List<MensajeDO> convocatoriaLista = getMensajeDAO().seleccionPorPersonaEnviaProyecto(idUsuario, idProyecto); 

		List<MensajeTO> convocatoriaTOLista = new ArrayList<MensajeTO>(convocatoriaLista.size());

		if (convocatoriaLista != null && convocatoriaLista.size() > 0) {
			MensajeTO convocatoriaTO = null;
			for (MensajeDO convocatoria : convocatoriaLista) {
				
				convocatoriaTO = getMensajeTransf().transferirDOTO(convocatoria);
				convocatoriaTOLista.add(convocatoriaTO);
			}
		}

		return convocatoriaTOLista;
		
	}

	public List<MensajeTO> listarMensajesPorDestino(Long idUsuario)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idUsuario == null  ) {
			throw new ValidacionExcepcion("falta.identificador.usuario");
		}

		List<MensajeDO> convocatoriaLista = getMensajeDAO().seleccionPorPersonaRespuesta(idUsuario); 

		List<MensajeTO> convocatoriaTOLista = new ArrayList<MensajeTO>(convocatoriaLista.size());

		if (convocatoriaLista != null && convocatoriaLista.size() > 0) {
			MensajeTO convocatoriaTO = null;
			for (MensajeDO convocatoria : convocatoriaLista) {
				
				convocatoriaTO = getMensajeTransf().transferirDOTO(convocatoria);
				convocatoriaTOLista.add(convocatoriaTO);
			}
		}

		return convocatoriaTOLista;

		
	}

	public List<MensajeTO> listarMensajesPorDestinoPorProyecto(Long idUsuario,
			Long idProyecto) throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idUsuario == null  ) {
			throw new ValidacionExcepcion("falta.identificador.usuario");
		}
		
		if (idProyecto == null  ) {
			
			throw new ValidacionExcepcion("falta.identificador.proyecto");
		}


		List<MensajeDO> convocatoriaLista = getMensajeDAO().seleccionPorPersonaRespuestaProyecto(idUsuario, idProyecto); 

		List<MensajeTO> convocatoriaTOLista = new ArrayList<MensajeTO>(convocatoriaLista.size());

		if (convocatoriaLista != null && convocatoriaLista.size() > 0) {
			MensajeTO convocatoriaTO = null;
			for (MensajeDO convocatoria : convocatoriaLista) {
				
				convocatoriaTO = getMensajeTransf().transferirDOTO(convocatoria);
				convocatoriaTOLista.add(convocatoriaTO);
			}
		}

		return convocatoriaTOLista;
		
	}

}
