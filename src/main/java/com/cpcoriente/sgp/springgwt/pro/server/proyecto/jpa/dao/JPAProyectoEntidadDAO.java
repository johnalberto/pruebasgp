package com.cpcoriente.sgp.springgwt.pro.server.proyecto.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ProyectoEntidadDO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IProyectoEntidadDAO;


@Repository
public class JPAProyectoEntidadDAO implements IProyectoEntidadDAO {

	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	@Transactional(readOnly = true)
	public ProyectoEntidadDO cargar(Long idProyEnt) {
		
		ProyectoEntidadDO proyecto = em.find(ProyectoEntidadDO.class, idProyEnt);
		return proyecto;
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ProyectoEntidadDO persistir(ProyectoEntidadDO proyEnt) {
		
		ProyectoEntidadDO proyectoRes = null;   	
		em.persist(proyEnt);
		proyectoRes = proyEnt;		
		return proyectoRes;
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ProyectoEntidadDO modificar(ProyectoEntidadDO proyEnt) {
		
		ProyectoEntidadDO proyectoRes = null;
		ProyectoEntidadDO proyectoDO = null;

    	proyectoDO = proyEnt;
    	proyectoRes = em.merge(proyectoDO);

    	
    	return proyectoRes;
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idProyEnt) {
		
		boolean isRemoved = false;
		ProyectoEntidadDO proyecto = cargar(idProyEnt);
		em.remove(proyecto);
		ProyectoEntidadDO proyectoDO = cargar(idProyEnt);
		if (proyectoDO == null) {
			isRemoved = true;
		}
		return isRemoved;

	}

}
