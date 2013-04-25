package com.cpcoriente.sgp.springgwt.pro.server.entidad.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.ActividadEconomicaDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IActividadEconomicaDAO;


@Repository
public class JPAActividadEconomicaDAO implements IActividadEconomicaDAO {

	
private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = true)
	public ActividadEconomicaDO cargar(Long idActividad) {
		
    	ActividadEconomicaDO actividad = em.find(ActividadEconomicaDO.class, idActividad);
		return actividad;

	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ActividadEconomicaDO persistir(ActividadEconomicaDO actividad) {
    	
    	ActividadEconomicaDO actividadRes = null;   	
    	em.persist(actividad);
    	actividadRes = actividad;		
    	return actividadRes;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ActividadEconomicaDO modificar(ActividadEconomicaDO actividad) {
    	
    	ActividadEconomicaDO actividadRes = null;
    	ActividadEconomicaDO actividadDO = null;

    	actividadDO = actividad;
    	actividadRes = em.merge(actividadDO);
    	return actividadRes;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idActividad) {
    	
    	boolean isRemoved = false;
    	ActividadEconomicaDO actividad = cargar(idActividad);
		em.remove(actividad);
		ActividadEconomicaDO actividadDO = cargar(idActividad);
		if (actividadDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

    @Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ActividadEconomicaDO> listarTodo() {
    	List<ActividadEconomicaDO> actividadList = null;
    	Query listarTodo = em.createNamedQuery("actEco.listarTodo");
    	actividadList = listarTodo.getResultList();
		return actividadList;	
		
    }

    @Transactional(readOnly = true)
  	@SuppressWarnings("unchecked")
	public List<ActividadEconomicaDO> seleccionPorNombre(String parteNombre) {
    	
    	List<ActividadEconomicaDO> actividadList = null;
    	Query selecPorNom = em.createNamedQuery("actEco.seleccionPorNombre");
    	selecPorNom.setParameter("actividadNombre","%"+ parteNombre.toLowerCase()+"%");
    	actividadList = selecPorNom.getResultList();
		return actividadList;	
		
    }

}
