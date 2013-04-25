/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.permiso.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioDO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.IUsuarioDAO;



/**
 * @author CPC-04
 *
 */
@Repository
public class JPAUsuarioDAO implements IUsuarioDAO{

	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	
	@Transactional(readOnly = true)
	public UsuarioDO cargar(Long idUsuario) {
		UsuarioDO usuario = em.find(UsuarioDO.class, idUsuario);
		return usuario;
	}


	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public UsuarioDO persistir(UsuarioDO usuario) {
		UsuarioDO usuarioRes = null;   	
		em.persist(usuario);
		usuarioRes = usuario;		
		return usuarioRes;
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public UsuarioDO modificar(UsuarioDO usuario){
		
		UsuarioDO ordRes = null;
		UsuarioDO ordDO = null;
    	ordDO = usuario;
    	ordRes = em.merge(ordDO);
    	return ordRes;
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idUsuario) {
		boolean isRemoved = false;
		UsuarioDO usuario = cargar(idUsuario);
		em.remove(usuario);
		UsuarioDO usuarioDO = cargar(idUsuario);
		if (usuarioDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<UsuarioDO> listarTodo() {
		List<UsuarioDO> usuarioList = null;
		Query listarTodo = em.createNamedQuery("usuarioDO.listarTodo");
		usuarioList = listarTodo.getResultList();
		return usuarioList;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<UsuarioDO> seleccionPorNombre(String parteNombre) {
		List<UsuarioDO> usuarioList = null;
		Query selecPorNom = em.createNamedQuery("usuarioDO.seleccionPorNombre");
		selecPorNom.setParameter("usuarioNombre", "%"+parteNombre.toLowerCase()+"%");
		usuarioList = selecPorNom.getResultList();
		return usuarioList;
	}


	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<UsuarioDO> seleccionPorCiudad(String idCiudad) {
		List<UsuarioDO> usuarioList = null;
		Query selecPorCiudad = em.createNamedQuery("usuarioDO.seleccionPorCiudad");
		selecPorCiudad.setParameter("idCiudad", idCiudad.toLowerCase());
		usuarioList = selecPorCiudad.getResultList();
		return usuarioList;
	}


	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<UsuarioDO> seleccionPorTercero(Long idTercero) {
		List<UsuarioDO> usuarioList = null;
		Query selecPorTercero = em.createNamedQuery("usuarioDO.seleccionPorTercero");
		selecPorTercero.setParameter("idTercero", idTercero);
		usuarioList = selecPorTercero.getResultList();
		return usuarioList;
	}


	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<UsuarioDO> seleccionPorTipoUsuario(String idTipoUsuario) {
		List<UsuarioDO> usuarioList = null;
		Query selecPorTipoUsuario = em.createNamedQuery("usuarioDO.seleccionPorTipoUsuario");
		selecPorTipoUsuario.setParameter("idTipoUsuario", idTipoUsuario.toLowerCase());
		usuarioList = selecPorTipoUsuario.getResultList();
		return usuarioList;
	}

	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public UsuarioDO seleccionPorTipoYDocumento(String idTipoDocumento, String numDoc) {
		List<UsuarioDO> usuarioList = null;
		UsuarioDO usuarioRes = null;
		Query selecPorTipoYDocumento = em.createNamedQuery("usuarioDO.seleccionPorTipoYDocumento");
		selecPorTipoYDocumento.setParameter("idTipoDocumento", idTipoDocumento.toLowerCase());
		selecPorTipoYDocumento.setParameter("numDoc", numDoc.toLowerCase());
		usuarioList = selecPorTipoYDocumento.getResultList();
		if (usuarioList != null && usuarioList.size() > 0) {
			usuarioRes = usuarioList.get(0);
		}
		return usuarioRes;
	}


	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public UsuarioDO seleccionPorUsername(String username) {
		List<UsuarioDO> usuarioList = null;
		UsuarioDO usuarioRes = null;
		Query selecPorUsername = em.createNamedQuery("usuarioDO.SeleccionPorUsername");
		selecPorUsername.setParameter("userName", username.toLowerCase());
		usuarioList = selecPorUsername.getResultList();
		if (usuarioList != null && usuarioList.size() > 0) {
			usuarioRes = usuarioList.get(0);
		}
		return usuarioRes;
		
	}


	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public UsuarioDO seleccionPorUsernamePorPassword(String username,
			String password) {
		List<UsuarioDO> usuarioList = null;
		UsuarioDO usuarioRes = null;
		Query selecPorUsername = em.createNamedQuery("usuarioDO.ValidarUsUarioPassword");
		selecPorUsername.setParameter("userName", username);
		selecPorUsername.setParameter("passWord", password);
		usuarioList = selecPorUsername.getResultList();
		if (usuarioList != null && usuarioList.size() > 0) {
			usuarioRes = usuarioList.get(0);
		}
		return usuarioRes;
	}
	
}
