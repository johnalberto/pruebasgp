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

import com.cpcoriente.sgp.springgwt.pro.client.permiso.IPermisoServicio;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.LogUsuarioDO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.PermisoDO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioDO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioEntidadTipoDO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioPorTipoDO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioProyectoEntidadDO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.ILogUsuarioDAO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.IPermisoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.IUsuarioDAO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.IUsuarioEntidadTipoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.IUsuarioPorTipoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.IUsuarioProyectoEntidadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ContactoProyectoEntidadDO;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.ILogUsuarioTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.IPermisoTranfs;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.IUsuarioEntidadTipoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.IUsuarioPorTipoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.IUsuarioProyectoEntidadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.IUsuarioTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.LogUsuarioTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.PermisoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioEntidadTipoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioProyectoEntidadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.ContactoProyectoEntidadTO;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;



/**
 * @author CPC-04
 *
 */
@Service
public class PermisoServicioImpl  extends RemoteServiceServlet implements IPermisoServicio{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1862809311173053808L;

	
	private IUsuarioPorTipoDAO getUsuarioPorTipoDAO() {
		return  DAOFactory.getInstance().getUsuarioPorTipoDao();
	}
	
	private IUsuarioDAO getUsuarioDAO() {
		return  DAOFactory.getInstance().getUsuarioDao();
	}
	
	
	private IUsuarioPorTipoTransf getUsuarioPorTipoTransf() {
		return  TransfFactory.getInstance().getUsuarioPorTipoTransf();
	}
	
	private IUsuarioTransf getUsuarioTransf() {
		return  TransfFactory.getInstance().getUsuarioTransf();
	}
	
	
	
	private ILogUsuarioDAO getLogUsuarioDAO() {
		return  DAOFactory.getInstance().getLogUsuarioDao();
	}
	
	private ILogUsuarioTransf getLogUsuarioTransf() {
		return  TransfFactory.getInstance().getLogUsuarioTransf();
	}
	
	
	private IPermisoDAO getPermisoDAO() {
		
		return  DAOFactory.getInstance().getPermisoDao();
	}
	
	private IPermisoTranfs getPermisoTransf() {
		return  TransfFactory.getInstance().getPermisoTransf();
	}
	
	private IUsuarioEntidadTipoDAO getUsuEntidadTipoDAO() {
		
		return  DAOFactory.getInstance().getUsuEntidadTipoDao();
	}
	
	private IUsuarioEntidadTipoTransf getUsuEntidadTipoTransf() {
		return  TransfFactory.getInstance().getUsuEntidadTipoTransf();
	}
	
	private IUsuarioProyectoEntidadDAO getUsuProEntidadDAO() {
		
		return  DAOFactory.getInstance().getUsuarioProEntDao();
	}
	
	private IUsuarioProyectoEntidadTransf getUsuProEntidadTransf() {
		return  TransfFactory.getInstance().getUsuProEntTransf();
	}
	
	
	
	public void init() {
		
	}
	
	

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springapp.interfaces.servicio.IPermisoServicio#crearTipoUsuario(com.cpcoriente.cidecuero.springapp.permiso.objeto.TipoUsuarioTO)
	 */
	public Long crearUsuarioPorTipo(UsuarioPorTipoTO tipoUsuario) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(tipoUsuario == null){
			throw new ValidacionExcepcion("falta.informacion.tipoUsuario")	;
		}
		if(tipoUsuario.getId() == null){
			throw new ValidacionExcepcion("falta.identificador.tipoUsuario")	;
		}
	
		if(tipoUsuario.getTipoUsuario() == null  ){
			throw new ValidacionExcepcion("falta.nombre.tipoUsuario")	;
		}
		
		if(tipoUsuario.getUsuario() == null || tipoUsuario.getUsuario().getId()==null){
			throw new ValidacionExcepcion("falta.descripcion.tipoUsuario")	;
		}
		
		UsuarioPorTipoDO tipoUsuarioProv = getUsuarioPorTipoDAO().cargar(tipoUsuario.getId());
        if (tipoUsuarioProv != null) {
            throw new PrecondicionExcepcion("existe.identificador.tipoUsuario");
        }
        
		Long idRegistrado = null;

		tipoUsuarioProv = getUsuarioPorTipoTransf().transferirTODO(tipoUsuario);
		UsuarioPorTipoDO tipoUsuarioReg = getUsuarioPorTipoDAO().persistir(tipoUsuarioProv);
		if (tipoUsuarioReg == null) {
			throw new RecursoExcepcion("fallo.creacion.tipoUsuario");
		}
		
		idRegistrado = tipoUsuarioReg.getId();

		return idRegistrado;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springapp.interfaces.servicio.IPermisoServicio#crearUsuario(com.cpcoriente.cidecuero.springapp.permiso.objeto.UsuarioTO)
	 */
	public Long crearUsuario(UsuarioTO usuario) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		if(usuario == null){
			throw new ValidacionExcepcion("falta.informacion.usuario")	;
		}
		
		if(usuario.getNumDoc() == null || usuario.getNumDoc().trim().isEmpty() || usuario.getNumDoc().contains(" ") ){
			throw new ValidacionExcepcion("falta.numero.documento.usuario")	;
		} 
		
		if(usuario.getNombre() == null || usuario.getNombre().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.nombre.usuario")	;
		}
		
		if(usuario.getDireccion() == null || usuario.getDireccion().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.direccion.usuario")	;
		}
		if(usuario.getUsername() == null || usuario.getUsername().trim().isEmpty() || usuario.getUsername().contains(" ") ){
			throw new ValidacionExcepcion("falta.username.usuario")	;
		}
		if(usuario.getPassword() == null || usuario.getPassword().trim().isEmpty() || usuario.getPassword().contains(" ") ){
			throw new ValidacionExcepcion("falta.password.usuario")	;
		}
		if(usuario.getTelefono() == null || usuario.getTelefono().trim().isEmpty() || usuario.getTelefono().contains(" ") ){
			throw new ValidacionExcepcion("falta.telefono.usuario")	;
		}
		if(usuario.getEmpresa() == null || usuario.getEmpresa().getId() == null ){
			throw new ValidacionExcepcion("falta.tercero.usuario")	;
		}
		if(usuario.getCiudad() == null || usuario.getCiudad().getId() == null ){
			throw new ValidacionExcepcion("falta.ciudad.usuario")	;
		}
		if(usuario.getTipoDoc() == null || usuario.getTipoDoc() == null ){
			throw new ValidacionExcepcion("falta.tipo.documento.usuario")	;
		}
		
		if(usuario.getSexo() == ' ' ){
			throw new ValidacionExcepcion("indefinido.sexo.usuario")	;
		}
		
		UsuarioDO usuarioProv = getUsuarioDAO().cargar(usuario.getId());
        if (usuarioProv != null) {
            throw new PrecondicionExcepcion("existe.identificador.usuario");
        }
		Long idRegistrado = null;
		
		usuarioProv = getUsuarioTransf().transferirTODO(usuario);
		UsuarioDO usuarioReg = getUsuarioDAO().persistir(usuarioProv);
		if (usuarioReg == null) {
			throw new RecursoExcepcion("fallo.creacion.usuario");
		}
		
		idRegistrado = usuarioReg.getId();

		return idRegistrado;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springapp.interfaces.servicio.IPermisoServicio#modificarUsuario(com.cpcoriente.cidecuero.springapp.permiso.objeto.UsuarioTO)
	 */
	public boolean modificarUsuario(UsuarioTO usuario) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		if (usuario == null) {
			throw new ValidacionExcepcion("falta.informacion.usuario");
		}
		if (usuario.getId() == null || usuario.getId().longValue() < 0) {
			throw new ValidacionExcepcion("falta.identificador.usuario");
		}
		
		if(usuario.getNumDoc() == null || usuario.getNumDoc().trim().isEmpty() || usuario.getNumDoc().contains(" ") ){
			throw new ValidacionExcepcion("falta.numero.documento.usuario")	;
		} 
		if(usuario.getNombre() == null || usuario.getNombre().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.nombre.usuario")	;
		}
		
		if(usuario.getDireccion() == null || usuario.getDireccion().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.direccion.usuario")	;
		}
		if(usuario.getUsername() == null || usuario.getUsername().trim().isEmpty() || usuario.getUsername().contains(" ") ){
			throw new ValidacionExcepcion("falta.username.usuario")	;
		}
		if(usuario.getPassword() == null || usuario.getPassword().trim().isEmpty() || usuario.getPassword().contains(" ") ){
			throw new ValidacionExcepcion("falta.password.usuario")	;
		}
		if(usuario.getTelefono() == null || usuario.getTelefono().trim().isEmpty() || usuario.getTelefono().contains(" ") ){
			throw new ValidacionExcepcion("falta.telefono.usuario")	;
		}
		
		if(usuario.getEmpresa() == null || usuario.getEmpresa().getId() == null ){
			throw new ValidacionExcepcion("falta.tercero.usuario")	;
		}
		if(usuario.getCiudad() == null || usuario.getCiudad().getId() == null ){
			throw new ValidacionExcepcion("falta.ciudad.usuario")	;
		}
		if(usuario.getTipoDoc() == null  ){
			throw new ValidacionExcepcion("falta.tipo.documento.usuario")	;
		}
		if(usuario.getSexo() == ' ' ){
			throw new ValidacionExcepcion("indefinido.sexo.usuario")	;
		}
		
		UsuarioDO usuarioProv = getUsuarioDAO().cargar(usuario.getId());
        if (usuarioProv == null) {
            throw new PrecondicionExcepcion("inexistente.identificador.usuario");
        }
        
		usuarioProv = getUsuarioTransf().transferirTODO(usuario);
		UsuarioDO usuarioMod = getUsuarioDAO().modificar(usuarioProv);
		if(usuarioMod == null){
			throw new RecursoExcepcion("fallo.modificacion.usuario");
		}

		return true;
	}

	

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springapp.interfaces.servicio.IPermisoServicio#eliminarTipoUsuario(com.cpcoriente.cidecuero.springapp.permiso.objeto.TipoUsuarioTO)
	 */
	public boolean eliminarUsuarioPorTipo(Long idTipoUsuarioActual) throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idTipoUsuarioActual == null  ) {
            throw new ValidacionExcepcion("falta.identificador.tipoUsuario");
        }

        try {
            UsuarioPorTipoDO tipoUsuario = null;
            tipoUsuario = getUsuarioPorTipoDAO().cargar(idTipoUsuarioActual);
            if (tipoUsuario == null) {
                throw new PrecondicionExcepcion("inexistente.identificador.tipoUsuario");
            }
            boolean res = getUsuarioPorTipoDAO().eliminar(idTipoUsuarioActual);

            return res;
        } catch (DataAccessException e) {
            throw new PrecondicionExcepcion("inexistente.identificdor.tipoUsuario" + e.getMessage());
        }
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springapp.interfaces.servicio.IPermisoServicio#eliminarUsuario(java.lang.String)
	 */
	public boolean eliminarUsuario(Long idUsuarioActual) throws ValidacionExcepcion, PrecondicionExcepcion {
		if (idUsuarioActual == null || idUsuarioActual.longValue() < 0 ) {
            throw new ValidacionExcepcion("falta.identificador.usuario");
        }

        try {
            UsuarioDO usuario = null;
            usuario = getUsuarioDAO().cargar(idUsuarioActual);
            if (usuario == null) {
                throw new PrecondicionExcepcion("inexistente.identificador.usuario");
            }
            boolean res = getUsuarioDAO().eliminar(idUsuarioActual);

            return res;
        } catch (DataAccessException e) {
            throw new PrecondicionExcepcion("inexistente.identificdor.usuario" + e.getMessage());
        }
	}

	
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springapp.interfaces.servicio.IPermisoServicio#listarTodosUsuario()
	 */
	public List<UsuarioTO> listarTodosUsuario() throws PrecondicionExcepcion {
		List<UsuarioDO> usuarioLista = getUsuarioDAO().listarTodo();
		if (usuarioLista == null || usuarioLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.usuario");
		}
		
		UsuarioTO usuarioTO = null;
		List<UsuarioTO> usuarioTOLista = new ArrayList<UsuarioTO>(usuarioLista.size());
		for (UsuarioDO usuario : usuarioLista) {
			usuarioTO = getUsuarioTransf().transferirDOTO(usuario);
			usuarioTOLista.add(usuarioTO);
		}
	
		return usuarioTOLista;
	}

	
	
		
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springapp.interfaces.servicio.IPermisoServicio#buscarUsuarioPorNombre(java.lang.String)
	 */
	public List<UsuarioTO> buscarUsuarioPorNombre(String parteNombre) throws ValidacionExcepcion, PrecondicionExcepcion {
		if (parteNombre == null || parteNombre.trim().isEmpty()) {
            throw new ValidacionExcepcion("falta.nombre.usuario");
        }
		
		List<UsuarioDO> usuarioLista = getUsuarioDAO().seleccionPorNombre(parteNombre);
		if (usuarioLista == null || usuarioLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.usuario.con.nombre");
		}
		
		UsuarioTO usuarioTO = null;
		List<UsuarioTO> usuarioTOLista = new ArrayList<UsuarioTO>(usuarioLista.size());
		for (UsuarioDO usuario : usuarioLista) {
			usuarioTO = getUsuarioTransf().transferirDOTO(usuario);
			usuarioTOLista.add(usuarioTO);
		}
	
		return usuarioTOLista;
	}
	
	
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springapp.interfaces.servicio.IPermisoServicio#listarUsuarioPorCiudad(java.lang.String)
	 */
	public List<UsuarioTO> listarUsuarioPorCiudad(String idCiudad) throws ValidacionExcepcion, PrecondicionExcepcion {
		if (idCiudad == null || idCiudad.trim().isEmpty() || idCiudad.contains(" ") ) {
            throw new ValidacionExcepcion("falta.id.ciudad");
        }
		
		List<UsuarioDO> usuarioLista = getUsuarioDAO().seleccionPorCiudad(idCiudad);
		if (usuarioLista == null || usuarioLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.usuario.con.ciudad");
		}
		
		UsuarioTO usuarioTO = null;
		List<UsuarioTO> usuarioTOLista = new ArrayList<UsuarioTO>(usuarioLista.size());
		for (UsuarioDO usuario : usuarioLista) {
			usuarioTO = getUsuarioTransf().transferirDOTO(usuario);
			usuarioTOLista.add(usuarioTO);
		}
	
		return usuarioTOLista;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springapp.interfaces.servicio.IPermisoServicio#listarUsuarioPorTercero(java.lang.String)
	 */
	public List<UsuarioTO> listarUsuarioPorTercero(Long idTercero) throws ValidacionExcepcion, PrecondicionExcepcion {
		if (idTercero == null || idTercero.longValue() < 0 ) {
            throw new ValidacionExcepcion("falta.id.tercero");
        }
		
		List<UsuarioDO> usuarioLista = getUsuarioDAO().seleccionPorTercero(idTercero);
		if (usuarioLista == null || usuarioLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.usuario.con.tercero");
		}
		
		UsuarioTO usuarioTO = null;
		List<UsuarioTO> usuarioTOLista = new ArrayList<UsuarioTO>(usuarioLista.size());
		for (UsuarioDO usuario : usuarioLista) {
			usuarioTO = getUsuarioTransf().transferirDOTO(usuario);
			usuarioTOLista.add(usuarioTO);
		}
	
		return usuarioTOLista;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springapp.interfaces.servicio.IPermisoServicio#listarUsuarioPorTipoUsuario(java.lang.String)
	 */
	public List<UsuarioTO> listarUsuarioPorTipoUsuario(String idTipoUsuario) throws ValidacionExcepcion, PrecondicionExcepcion {
		if (idTipoUsuario == null || idTipoUsuario.trim().isEmpty() || idTipoUsuario.contains(" ") ) {
            throw new ValidacionExcepcion("falta.id.tipoUsuario");
        }
		
		List<UsuarioDO> usuarioLista = getUsuarioDAO().seleccionPorTipoUsuario(idTipoUsuario);
		if (usuarioLista == null || usuarioLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.usuario.con.tipoUsuario");
		}
		
		UsuarioTO usuarioTO = null;
		List<UsuarioTO> usuarioTOLista = new ArrayList<UsuarioTO>(usuarioLista.size());
		for (UsuarioDO usuario : usuarioLista) {
			usuarioTO = getUsuarioTransf().transferirDOTO(usuario);
			usuarioTOLista.add(usuarioTO);
		}
	
		return usuarioTOLista;
	}

	

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.cidecuero.springapp.interfaces.servicio.IPermisoServicio#cargarUsuario(java.lang.String)
	 */
	public UsuarioTO cargarUsuario(Long usuarioId) throws ValidacionExcepcion, PrecondicionExcepcion {
		UsuarioTO usuarioTO = null;
		UsuarioDO usuarioDO = null;

		if (usuarioId == null || usuarioId.longValue() < 0 ) {
			throw new ValidacionExcepcion("falta.id.usuario");
		}

		usuarioDO = getUsuarioDAO().cargar(usuarioId);

		if (usuarioDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.usuario");
		}

		usuarioTO = getUsuarioTransf().transferirDOTO(usuarioDO);
		return usuarioTO;
	}

	public Long crearLogUsuario(LogUsuarioTO logUsuario)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(logUsuario == null){
			throw new ValidacionExcepcion("falta.informacion.log.usuario")	;
		}
		
	
		if(logUsuario.getAccion() == null  ){
			throw new ValidacionExcepcion("falta.accion.log.usurio")	;
		}
		
		if(logUsuario.getFecha() == null ){
			throw new ValidacionExcepcion("falta.fecha.log.usuario")	;
		}
		
		if(logUsuario.getIp() == null ){
			throw new ValidacionExcepcion("falta.ip.log.usuario")	;
		}
		
		if(logUsuario.getPagina() == null ){
			throw new ValidacionExcepcion("falta.pagina.log.usuario")	;
		}
		
		if(logUsuario.getUsuario() == null  || logUsuario.getUsuario().getId()!=null ){
			throw new ValidacionExcepcion("falta.usuario.log.usuario")	;
		}

		
		LogUsuarioDO tipoUsuarioProv =new  LogUsuarioDO();
		
        
		Long idRegistrado = null;

		tipoUsuarioProv = getLogUsuarioTransf().transferirTODO(logUsuario);
		
		LogUsuarioDO logUaurioReg = getLogUsuarioDAO().persistir(tipoUsuarioProv);
		
		if (logUaurioReg == null) {
			throw new RecursoExcepcion("fallo.creacion.tipoUsuario");
		}
		
		idRegistrado = logUaurioReg.getId();

		return idRegistrado;
		
	}

	public Long crearPermiso(PermisoTO permiso) throws ValidacionExcepcion,
			RecursoExcepcion, PrecondicionExcepcion {
		
		if(permiso == null){
			throw new ValidacionExcepcion("falta.informacion.permiso")	;
		}
		
	
		if(permiso.getAccion() == null  ){
			throw new ValidacionExcepcion("falta.accion.permiso")	;
		}
		
		if(permiso.getEmpresa() == null || permiso.getEmpresa().getId() ==null ){
			throw new ValidacionExcepcion("falta.empresa.permiso")	;
		}
		
		if(permiso.getPagina() == null ){
			throw new ValidacionExcepcion("falta.pagina.permiso")	;
		}
		
		if(permiso.getTipoUsuario() == null ){
			throw new ValidacionExcepcion("falta.tipo.usuario.permiso")	;
		}
		
		
		
		PermisoDO permisoProv  = new PermisoDO();
		
        
		Long idRegistrado = null;

		permisoProv = getPermisoTransf().transferirTODO(permiso); 
		
		PermisoDO permisoReg = getPermisoDAO().persistir(permisoProv); 
		
		if (permisoReg == null) {
			throw new RecursoExcepcion("fallo.creacion.permiso");
		}
		
		idRegistrado = permisoReg.getId();

		return idRegistrado;
		
	}

	public Long crearUsuarioEntidadTipo(UsuarioEntidadTipoTO usuario)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		
		if(usuario == null){
			throw new ValidacionExcepcion("falta.informacion.usuario.entidad.tipo")	;
		}
		
	
		if(usuario.getTipoUsuario() == null  ){
			throw new ValidacionExcepcion("falta.tipo.usuario")	;
		}
		
		if(usuario.getUsuProEnt() == null || usuario.getUsuProEnt().getId() ==null ){
			throw new ValidacionExcepcion("falta.usuario.proyecto.entidad")	;
		}
		
		UsuarioEntidadTipoDO usuProv = new UsuarioEntidadTipoDO();
		
        
		Long idRegistrado = null;

		usuProv = getUsuEntidadTipoTransf().transferirTODO(usuario);
		
		UsuarioEntidadTipoDO usuReg = getUsuEntidadTipoDAO().persistir(usuProv);
		
		if (usuReg == null) {
			throw new RecursoExcepcion("fallo.creacion.usuario.entidad.tipo");
		}
		
		idRegistrado = usuReg.getId();

		return idRegistrado;
	}

	public boolean crearListaUsuarioPorTipo(List<UsuarioPorTipoTO> usuarioList)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(usuarioList == null || usuarioList.size()==0){
			throw new ValidacionExcepcion("falta.informacion.lista.usuario.por.tipo")	;
		}
		
	
		Set<UsuarioPorTipoDO> usuTipList = new LinkedHashSet<UsuarioPorTipoDO>();
		
		UsuarioPorTipoDO usu = null;
		
		try {
			
			for(UsuarioPorTipoTO us:usuarioList){
				
				usu = getUsuarioPorTipoTransf().transferirTODO(us);
				usuTipList.add(usu);
			}
	        
			boolean res = getUsuarioPorTipoDAO().persistirList(usuTipList);

			return res;
			
		} catch (Exception e) {
			
            throw new PrecondicionExcepcion("fallo.creacion.lista.usuario.por.tipo" + e.getMessage());

		}
		
	}

	public Long crearUsuarioProyectoEntidad(UsuarioProyectoEntidadTO usuario)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(usuario == null){
			throw new ValidacionExcepcion("falta.informacion.usuario.entidad.tipo")	;
		}
		
	
		if(usuario.getProyectoEntidad() == null || usuario.getProyectoEntidad().getId()==null  ){
			throw new ValidacionExcepcion("falta.tipo.usuario")	;
		}
		
		if(usuario.getUsuario() == null || usuario.getUsuario().getId()==null  ){
			throw new ValidacionExcepcion("falta.tipo.usuario")	;
		}
		
		UsuarioProyectoEntidadDO usuProv = new UsuarioProyectoEntidadDO();
        
		Long idRegistrado = null;

		usuProv = getUsuProEntidadTransf().transferirTODO(usuario);
		
		UsuarioProyectoEntidadDO usuReg = getUsuProEntidadDAO().persistir(usuProv);
		
		if (usuReg == null) {
			throw new RecursoExcepcion("fallo.creacion.usuario.entidad.tipo");
		}
		
		idRegistrado = usuReg.getId();

		return idRegistrado;
		
	}

	
	public boolean modificarPermiso(PermisoTO permiso)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if (permiso == null) {
			throw new ValidacionExcepcion("falta.informacion.permiso");
		}
		if (permiso.getId() == null || permiso.getId().longValue() < 0) {
			throw new ValidacionExcepcion("falta.identificador.permiso");
		}
		
		if(permiso.getAccion() == null  ){
			throw new ValidacionExcepcion("falta.accion.permiso")	;
		} 
		if(permiso.getEmpresa() == null || permiso.getEmpresa().getId()==null ){
			throw new ValidacionExcepcion("falta.empresa.permiso")	;
		}
		
		if(permiso.getPagina() == null  ){
			throw new ValidacionExcepcion("falta.pagina.permiso")	;
		}
		if(permiso.getTipoUsuario()==null ){
			throw new ValidacionExcepcion("falta.tipo.usuario.permiso")	;
		}
		
		
		PermisoDO permisoProv = getPermisoDAO().cargar(permiso.getId());
        if (permisoProv == null) {
            throw new PrecondicionExcepcion("inexistente.identificador.permiso");
        }
        
        permisoProv = getPermisoTransf().transferirTODO(permiso);
        
        PermisoDO permisoMod = getPermisoDAO().modificar(permisoProv);

        
        if(permisoMod == null){
			throw new RecursoExcepcion("fallo.modificacion.permiso");
		}

		return true;
		
	}

	public boolean modificarUsuarioEntidadTipo(UsuarioEntidadTipoTO usuario)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if (usuario == null) {
			throw new ValidacionExcepcion("falta.informacion.usuario.entidad.tipo");
		}
		if (usuario.getId() == null || usuario.getId().longValue() < 0) {
			throw new ValidacionExcepcion("falta.identificador.usuario.entidad.tipo");
		}
		
		if(usuario.getTipoUsuario() == null  ){
			throw new ValidacionExcepcion("falta.tipo.usuario")	;
		} 
		if(usuario.getUsuProEnt() == null || usuario.getUsuProEnt().getId()==null ){
			throw new ValidacionExcepcion("falta.usuario")	;
		}
		
		
		UsuarioEntidadTipoDO usuarioProv = getUsuEntidadTipoDAO().cargar(usuario.getId());
		
        if (usuarioProv == null) {
            throw new PrecondicionExcepcion("inexistente.identificador.usuario.entidad.tipo");
        }
        
        usuarioProv = getUsuEntidadTipoTransf().transferirTODO(usuario); 
        
        UsuarioEntidadTipoDO usuMod = getUsuEntidadTipoDAO().modificar(usuarioProv);

        
        if(usuMod == null){
			throw new RecursoExcepcion("fallo.modificacion.usuario.entidad.tipo");
		}

		return true;
	}

	public boolean modificarUsuarioTipo(UsuarioPorTipoTO usuario)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		
		if (usuario == null) {
			throw new ValidacionExcepcion("falta.informacion.usuario.por.tipo");
		}
		
		if (usuario.getId() == null || usuario.getId().longValue() < 0) {
			throw new ValidacionExcepcion("falta.identificador.usuario.por.tipo");
		}
		
		if(usuario.getUsuario() == null || usuario.getUsuario().getId()==null ){
			throw new ValidacionExcepcion("falta.usuario")	;
		} 
		
		
		UsuarioPorTipoDO usuProv = getUsuarioPorTipoDAO().cargar(usuario.getId());
		
        if (usuProv == null) {
            throw new PrecondicionExcepcion("inexistente.identificador.usuario.por.tipo");
        }
        
        usuProv = getUsuarioPorTipoTransf().transferirTODO(usuario);
        
        UsuarioPorTipoDO usuMod = getUsuarioPorTipoDAO().modificar(usuProv);
        
        if(usuMod == null){
			throw new RecursoExcepcion("fallo.modificacion.usuario");
		}

		return true;
	}

	public boolean modificarUsuarioProyectoEntidad(
			UsuarioProyectoEntidadTO usuario) throws ValidacionExcepcion,
			RecursoExcepcion, PrecondicionExcepcion {
		
		if (usuario == null) {
			throw new ValidacionExcepcion("falta.informacion.usuario.proyecto.entidad");
		}
		
		if (usuario.getId() == null || usuario.getId().longValue() < 0) {
			throw new ValidacionExcepcion("falta.identificador.usuario.proyecto.entidad");
		}
		
		if(usuario.getUsuario() == null || usuario.getUsuario().getId()==null ){
			throw new ValidacionExcepcion("falta.usuario")	;
		} 
		
		if(usuario.getProyectoEntidad() == null || usuario.getProyectoEntidad().getId()==null ){
			throw new ValidacionExcepcion("falta.proyecto.entidad")	;
		} 
		
		
		UsuarioProyectoEntidadDO  usuProv = getUsuProEntidadDAO().cargar(usuario.getId());
		
        if (usuProv == null) {
            throw new PrecondicionExcepcion("inexistente.identificador.usuario.proyecto.entidad");
        }
        
        usuProv = getUsuProEntidadTransf().transferirTODO(usuario);
        
        UsuarioProyectoEntidadDO usuMod = getUsuProEntidadDAO().modificar(usuProv);
        
        if(usuMod == null){
			throw new RecursoExcepcion("fallo.modificacion.usuario");
		}

		return true;
		
		
	}

	public boolean eliminarPermiso(Long idPermiso) throws ValidacionExcepcion,
			PrecondicionExcepcion {
		
		if (idPermiso == null  ) {
            throw new ValidacionExcepcion("falta.identificador.permiso");
        }

        try {
            PermisoDO permiso =null;
            
            permiso = getPermisoDAO().cargar(idPermiso);
            
            if (permiso == null) {
            	
                throw new PrecondicionExcepcion("inexistente.identificador.permiso");
            }
            boolean res = getPermisoDAO().eliminar(idPermiso); 
            
            return res;
            
        } catch (DataAccessException e) {
            throw new PrecondicionExcepcion("inexistente.identificdor.permiso->" + e.getMessage());
        }
		
		
	}

	public boolean eliminarUsuarioEntidad(Long idUsuario)
			throws ValidacionExcepcion, PrecondicionExcepcion {
	
		if (idUsuario == null  ) {
            throw new ValidacionExcepcion("falta.identificador.usuario.entidad");
        }

        try {
            UsuarioEntidadTipoDO usuario=null;
            
            usuario = getUsuEntidadTipoDAO().cargar(idUsuario);
            
            if (usuario == null) {
            	
                throw new PrecondicionExcepcion("inexistente.identificador.usuario.entidad");
            }
            
            boolean res =getUsuEntidadTipoDAO().eliminar(idUsuario); 
            
            return res;
            
        } catch (DataAccessException e) {
            throw new PrecondicionExcepcion("inexistente.identificdor.usuario.entidad->" + e.getMessage());
        }
	
	}

	public boolean eliminarUsuarioProyectoEntidad(Long idUsuario)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idUsuario == null  ) {
            throw new ValidacionExcepcion("falta.identificador.usuario.proyecto.entidad");
        }

        try {
        	UsuarioProyectoEntidadDO usuario = null;
            
            usuario = getUsuProEntidadDAO().cargar(idUsuario);
            
            if (usuario == null) {
            	
                throw new PrecondicionExcepcion("inexistente.identificador.usuario.proyecto.entidad");
            }
            
            boolean res = getUsuProEntidadDAO().eliminar(idUsuario); 
            
            return res;
            
        } catch (DataAccessException e) {
            throw new PrecondicionExcepcion("inexistente.identificdor.usuario.proyecto.entidad->" + e.getMessage());
        }
		
	}

	public List<LogUsuarioTO> listarLogUsuarioGeneral(Long idEmpresa,
			Date fechaInicio, Date fechaFin, String idUsuario, String idPagina,
			String idAccion) throws ValidacionExcepcion, PrecondicionExcepcion {
		
		
		if (idEmpresa == null || fechaInicio==null || fechaFin==null ) {
            throw new ValidacionExcepcion("falta.id.emprea.o.fechas");
        }
		
		List<LogUsuarioDO> usuarioLista = getLogUsuarioDAO().seleccionPorGeneral(idEmpresa, fechaInicio, fechaFin, idUsuario, idPagina, idAccion);
		
		if (usuarioLista == null || usuarioLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.usuario.con.tipoUsuario");
		}
		
		LogUsuarioTO usuarioTO = null;
		List<LogUsuarioTO> usuarioTOLista = new ArrayList<LogUsuarioTO>(usuarioLista.size());
		for (LogUsuarioDO usuario : usuarioLista) {
			usuarioTO =getLogUsuarioTransf().transferirDOTO(usuario);
			usuarioTOLista.add(usuarioTO);
		}
	
		return usuarioTOLista;
	}

	public LogUsuarioTO listarUltimaFechaUsuario(Long idEmpresa,
			String userName) throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idEmpresa == null  ) {
            throw new ValidacionExcepcion("falta.log.usuario");
        }
		
		if (userName == null || userName.trim().isEmpty() || userName.contains(" ") ) {
            throw new ValidacionExcepcion("falta.username");
        }
		
		LogUsuarioDO usuarioLista = getLogUsuarioDAO().selectUltimaFechaUser(idEmpresa, userName);
		
		if (usuarioLista == null || usuarioLista.getId()!=null  ) {
			throw new PrecondicionExcepcion("sin.fecha.ultimo.uso");
		}
		
		LogUsuarioTO usurioTO = getLogUsuarioTransf().transferirDOTO(usuarioLista);
		
		
	
		return usurioTO;

		
	}

	public LogUsuarioTO cargarLogUsuario(Long idLogUsuario)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		LogUsuarioTO logUsuarioTO = null;
		LogUsuarioDO logUsuarioDO = null;

		if (idLogUsuario == null  ) {
			
			throw new ValidacionExcepcion("falta.id.log.usuario");
		}

		logUsuarioDO = getLogUsuarioDAO().cargar(idLogUsuario);  		

		if (logUsuarioDO == null) {
			
			throw new PrecondicionExcepcion("inexistente.id.log");
		}

		logUsuarioTO = getLogUsuarioTransf().transferirDOTO(logUsuarioDO); 
		
		return logUsuarioTO;

		
	}

	public PermisoTO cargarPermiso(Long idLogUsuario)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		PermisoTO permisoTO = null;
		PermisoDO permisoDO = null;

		if (idLogUsuario == null  ) {
			
			throw new ValidacionExcepcion("falta.id.permiso");
		}

		permisoDO = getPermisoDAO().cargar(idLogUsuario);   		

		if (permisoDO == null) {
			
			throw new PrecondicionExcepcion("inexistente.id.permiso");
		}

		permisoTO = getPermisoTransf().transferirDOTO(permisoDO); 
		
		return permisoTO;
		
	}

	public UsuarioEntidadTipoTO cargarUsuarioEntidad(Long idUsarioEntidad)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
	
		UsuarioEntidadTipoTO usuEntTO = null;
		UsuarioEntidadTipoDO usuEntDO = null;

		if (idUsarioEntidad == null  ) {
			
			throw new ValidacionExcepcion("falta.id.usuario.entidad");
		}

		usuEntDO = getUsuEntidadTipoDAO().cargar(idUsarioEntidad);   		

		if (usuEntDO == null) {
			
			throw new PrecondicionExcepcion("inexistente.id.usuario.entidad");
		}

		usuEntTO =getUsuEntidadTipoTransf().transferirDOTO(usuEntDO); 
		
		return usuEntTO;

	}

	public UsuarioPorTipoTO cargarUsuarioPorTipo(Long idUsuario)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		
		UsuarioPorTipoTO usuTipoTO = null;
		UsuarioPorTipoDO usuTipoDO = null;

		if (idUsuario == null  ) {
			
			throw new ValidacionExcepcion("falta.id.usuario.tipo");
		}

		usuTipoDO = getUsuarioPorTipoDAO().cargar(idUsuario);   		

		if (usuTipoDO == null) {
			
			throw new PrecondicionExcepcion("inexistente.id.usuario.tipo");
		}

		usuTipoTO = getUsuarioPorTipoTransf().transferirDOTO(usuTipoDO); 
		
		return usuTipoTO;
		
	}

	public UsuarioProyectoEntidadTO cargarUsuarioProyectoEntidad(Long idUsuario)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
	
		UsuarioProyectoEntidadTO usuTipoTO = null;
		UsuarioProyectoEntidadDO usuTipoDO = null;

		if (idUsuario == null  ) {
			
			throw new ValidacionExcepcion("falta.id.usuario.proyecto.entidad");
		}

		usuTipoDO = getUsuProEntidadDAO().cargar(idUsuario); 		

		if (usuTipoDO == null) {
			
			throw new PrecondicionExcepcion("inexistente.id.usuario.proyecto.entidad");
		}

		usuTipoTO = getUsuProEntidadTransf().transferirDOTO(usuTipoDO); 
		
		return usuTipoTO;
	}



}
