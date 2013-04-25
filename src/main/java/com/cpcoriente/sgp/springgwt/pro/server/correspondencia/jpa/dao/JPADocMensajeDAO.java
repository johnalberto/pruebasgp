package com.cpcoriente.sgp.springgwt.pro.server.correspondencia.jpa.dao;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.entity.DocMensajeDO;
import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.interfaces.dao.IDocMensajeDAO;

@Repository
public class JPADocMensajeDAO implements IDocMensajeDAO {

	
	private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
	
    @Transactional(readOnly = true)
	public DocMensajeDO cargar(Long idDocMensaje) {
    	
    	DocMensajeDO docMensaje = em.find(DocMensajeDO.class, idDocMensaje);
		return docMensaje;
		
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public DocMensajeDO persistir(DocMensajeDO docMensaje) {
    	
    	DocMensajeDO docMensajeRes = null;   	
    	em.persist(docMensaje);
    	docMensajeRes = docMensaje;		
    	return docMensajeRes;	
    	
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public DocMensajeDO modificar(DocMensajeDO docMensaje) {
    	
    	DocMensajeDO docMensajeRes = null;
    	DocMensajeDO docMensajeDO = null;

    	docMensajeDO = docMensaje;
    	docMensajeRes = em.merge(docMensajeDO);
    	return docMensajeRes;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idDocMensaje) {
		
    	boolean isRemoved = false;
    	DocMensajeDO docMensaje = cargar(idDocMensaje);
		em.remove(docMensaje);
		DocMensajeDO docMensajeDO = cargar(idDocMensaje);
		if (docMensajeDO == null) {
			isRemoved = true;
		}
		return isRemoved;	

    }

    @Transactional(readOnly = true)
   	@SuppressWarnings("unchecked")
	public List<DocMensajeDO> seleccionPorMensaje(Long idDocMensaje) {
	
    	List<DocMensajeDO> mensajeList = null;
		Query selecMensaje = em.createNamedQuery("docMensajeDO.seleccionPorMensaje");
		selecMensaje.setParameter("idMensaje", idDocMensaje);
		mensajeList = selecMensaje.getResultList();
		
		return mensajeList;	

    
    }

    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean persistirList(Set<DocMensajeDO> docList) {
		
    	boolean res = true;

		try {
			
			for(DocMensajeDO reqDet : docList){
				
				em.persist(reqDet);
			}
			
		} catch (Exception e) {
			
			res=false;
		}
		
		
		
		return res;
    	
	}

}
