package com.cpcoriente.sgp.springgwt.pro.server.permiso.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioProyectoEntidadDO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.IUsuarioProyectoEntidadDAO;


@Repository
public class JPAUsuarioProyectoEntidadDAO implements IUsuarioProyectoEntidadDAO {

	
	private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

	@Transactional(readOnly = true)
	public UsuarioProyectoEntidadDO cargar(Long idusuProEnt) {
		
		UsuarioProyectoEntidadDO orden = em.find(UsuarioProyectoEntidadDO.class,idusuProEnt);
		return orden;
	}

	
	@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
	public UsuarioProyectoEntidadDO persistir(UsuarioProyectoEntidadDO usuProEnt) {
		
		UsuarioProyectoEntidadDO ordRes = null;   	
		em.persist(usuProEnt);
		ordRes = usuProEnt;		
		return ordRes;	
		
	}
	
	
	@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
	public UsuarioProyectoEntidadDO modificar(UsuarioProyectoEntidadDO usuProEnt) {
		
		UsuarioProyectoEntidadDO ordRes = null;
		UsuarioProyectoEntidadDO ordDO = null;
    	ordDO = usuProEnt;
    	ordRes = em.merge(ordDO);
    	return ordRes;
	}

	
	@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idusuProEnt) {
	
		boolean isRemoved = false;
		UsuarioProyectoEntidadDO ord = cargar(idusuProEnt);
		em.remove(ord);
		UsuarioProyectoEntidadDO ordDO = cargar(idusuProEnt);
		if (ordDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	
	}

	
	

}
