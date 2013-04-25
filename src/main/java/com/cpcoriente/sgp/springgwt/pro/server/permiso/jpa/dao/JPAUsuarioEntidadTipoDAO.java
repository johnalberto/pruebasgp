package com.cpcoriente.sgp.springgwt.pro.server.permiso.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioEntidadTipoDO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.IUsuarioEntidadTipoDAO;

@Repository
public class JPAUsuarioEntidadTipoDAO implements IUsuarioEntidadTipoDAO {

	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Transactional(readOnly = true)
	public UsuarioEntidadTipoDO cargar(Long idUsuario) {
		UsuarioEntidadTipoDO usuario = em.find(UsuarioEntidadTipoDO.class, idUsuario);
		return usuario;	
		
	}

	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public UsuarioEntidadTipoDO persistir(UsuarioEntidadTipoDO usuario) {
		UsuarioEntidadTipoDO usuarioRes = null;   	
		em.persist(usuario);
		usuarioRes = usuario;		
		return usuarioRes;	
		
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public UsuarioEntidadTipoDO modificar(UsuarioEntidadTipoDO usuario) {
		
		UsuarioEntidadTipoDO ordRes = null;
		UsuarioEntidadTipoDO ordDO = null;
    	ordDO = usuario;
    	ordRes = em.merge(ordDO);
    	return ordRes;	
    	
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idUsuario) {
		
		boolean isRemoved = false;
		UsuarioEntidadTipoDO usuario = cargar(idUsuario);
		em.remove(usuario);
		UsuarioEntidadTipoDO usuarioDO = cargar(idUsuario);
		if (usuarioDO == null) {
			isRemoved = true;
		}
		return isRemoved;

	}

}
