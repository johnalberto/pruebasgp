/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.entidad.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.EntidadDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IEntidadDAO;

/**
 * @author CPC-04
 *
 */
@Repository
public class JPAEntidadDAO implements IEntidadDAO{

	private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
	
	
	@Transactional(readOnly = true)
	public EntidadDO cargar(Long idEntidad) {
		
		EntidadDO entidad = em.find(EntidadDO.class,idEntidad);
		return entidad;
		
		
	}
	
	
	@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
	public EntidadDO persistir(EntidadDO entidad) {
		EntidadDO entidadRes = null;   	
		em.persist(entidad);
		entidadRes = entidad;		
		return entidadRes;
	}

	@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
	public EntidadDO modificar(EntidadDO entidad){
		EntidadDO entidadRes = null;
		EntidadDO entidadDO = null;

    	entidadDO = entidad;
    	entidadRes = em.merge(entidadDO);
    	return entidadRes;
	}
	
	@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idEntidad) {
		
		boolean isRemoved = false;
		EntidadDO entidad = cargar(idEntidad);
		em.remove(entidad);
		EntidadDO entidadDO = cargar(idEntidad);
		if (entidadDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}


	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<EntidadDO> listarTodo() {
		List<EntidadDO> entidadList = null;
    	Query listarTodo = em.createNamedQuery("entidadDO.listarTodo");
    	entidadList = listarTodo.getResultList();
		return entidadList;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<EntidadDO> seleccionPorNombre(
			String parteNombre) {
		List<EntidadDO> entidadList = null;
    	Query selecPorNom = em.createNamedQuery("entidadDO.seleccionPorNombre");
    	selecPorNom.setParameter("terceroNombre","%"+ parteNombre.toLowerCase()+"%");
    	entidadList = selecPorNom.getResultList();
		return entidadList;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<EntidadDO> seleccionPorCiudad(
			Long idCiudad) {
		List<EntidadDO> entidadList = null;
    	Query selecPorCiu = em.createNamedQuery("entidadDO.seleccionPorCiudad");
    	selecPorCiu.setParameter("idCiudad", idCiudad);
    	entidadList = selecPorCiu.getResultList();
		return entidadList;
	}


	

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<EntidadDO> buscarEntidadPorTipDocNumDoc(String numDoc,Integer tipDoc) {
		
		List<EntidadDO> entidadList = null;
		Query selecNumDocPorTipDoc = em.createNamedQuery("entidadDO.selecPorNumDocPorTipDoc");
		selecNumDocPorTipDoc.setParameter("numDoc","%"+ numDoc.toLowerCase()+"%");
		selecNumDocPorTipDoc.setParameter("tipDoc", tipDoc);
		entidadList=selecNumDocPorTipDoc.getResultList();
		
		return entidadList;
		
	}


	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<EntidadDO> selecEntidadPorUsuario(String username) {
		
		List<EntidadDO> entidadList = null;
		Query selecPorUsername = em.createNamedQuery("entidadDO.selecPorUsuario");
		selecPorUsername.setParameter("username", username.toLowerCase());
		entidadList = selecPorUsername.getResultList();
				
		return entidadList;
		
	}


	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<EntidadDO> seleccionPorNumDoc(String parteNumDoc) {
		
		List<EntidadDO> entidadList = null;
    	Query selecPorNumDoc = em.createNamedQuery("entidadDO.selecPorNumDoc");
    	selecPorNumDoc.setParameter("parteNumDoc", parteNumDoc.toLowerCase());
    	entidadList = selecPorNumDoc.getResultList();
		return entidadList;
		
	}


	


	
}
