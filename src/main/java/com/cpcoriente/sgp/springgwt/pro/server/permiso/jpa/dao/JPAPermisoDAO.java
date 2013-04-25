package com.cpcoriente.sgp.springgwt.pro.server.permiso.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.PermisoDO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.IPermisoDAO;

@Repository
public class JPAPermisoDAO implements IPermisoDAO {

	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Transactional(readOnly = true)
	public PermisoDO cargar(Long idPermiso) {
		
		PermisoDO permiso = em.find(PermisoDO.class, idPermiso);
		return permiso;	
		
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public PermisoDO persistir(PermisoDO permiso) {
		
		PermisoDO permisoRes = null;   	
		em.persist(permiso);
		permisoRes = permiso;		
		return permisoRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public PermisoDO modificar(PermisoDO permiso) {
	
		PermisoDO permisoRes = null;
		PermisoDO permisoDO = null;
    	permisoDO = permiso;
    	permisoRes = em.merge(permisoDO);
    	return permisoRes;
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idPermiso) {
		
		boolean isRemoved = false;
		PermisoDO usuario = cargar(idPermiso);
		em.remove(usuario);
		PermisoDO usuarioDO = cargar(idPermiso);
		if (usuarioDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

}
