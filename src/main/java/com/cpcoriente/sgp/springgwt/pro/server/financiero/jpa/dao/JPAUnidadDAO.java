package com.cpcoriente.sgp.springgwt.pro.server.financiero.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.UnidadDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IUnidadDAO;


@Repository
public class JPAUnidadDAO implements IUnidadDAO {

	private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
	
    @Transactional(readOnly = true)
	public UnidadDO cargar(Long idUnidad) {
    	
    	UnidadDO unidad = em.find(UnidadDO.class, idUnidad);
		return unidad;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public UnidadDO persistir(UnidadDO unidad) {
    	
    	UnidadDO unidadRes = null;   	
    	em.persist(unidad);
    	unidadRes = unidad;		
    	return unidadRes;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public UnidadDO modificar(UnidadDO unidad) {
    	
    	UnidadDO unidadRes = null;
    	UnidadDO mensajeDO = null;

    	mensajeDO = unidad;
    	unidadRes = em.merge(mensajeDO);
    	return unidadRes;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idUnidad) {
		
    	boolean isRemoved = false;
    	UnidadDO unidad = cargar(idUnidad);
		em.remove(unidad);
		UnidadDO unidadDO = cargar(idUnidad);
		if (unidadDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

    @Transactional(readOnly = true)
   	@SuppressWarnings("unchecked")
	public List<UnidadDO> listarTodo(Long idUnidad) {
		
    	List<UnidadDO> mensajeList = null;
		Query selecMensaje = em.createNamedQuery("unidadDO.listarTodo");
		mensajeList = selecMensaje.getResultList();
		
		return mensajeList;	
	}

}
