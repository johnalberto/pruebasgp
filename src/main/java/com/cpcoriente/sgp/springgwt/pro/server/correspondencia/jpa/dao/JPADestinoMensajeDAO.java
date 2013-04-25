package com.cpcoriente.sgp.springgwt.pro.server.correspondencia.jpa.dao;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.entity.DestinoMensajeDO;
import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.interfaces.dao.IDestinoMensajeDAO;

@Repository
public class JPADestinoMensajeDAO implements IDestinoMensajeDAO {

private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
	
    @Transactional(readOnly = true)
	public DestinoMensajeDO cargar(Long idDesMensaje) {
    	
    	DestinoMensajeDO desMensaje = em.find(DestinoMensajeDO.class, idDesMensaje);
		return desMensaje;

	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public DestinoMensajeDO persistir(DestinoMensajeDO desMensaje) {
    	
    	DestinoMensajeDO desMensajeRes = null;   	
    	em.persist(desMensaje);
    	desMensajeRes = desMensaje;		
    	return desMensajeRes;		
    	
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public DestinoMensajeDO modificar(DestinoMensajeDO desMensaje) {
    	
    	DestinoMensajeDO docMensajeRes = null;
    	DestinoMensajeDO docMensajeDO = null;

    	docMensajeDO = desMensaje;
    	docMensajeRes = em.merge(docMensajeDO);
    	return docMensajeRes;

	}
    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idDesMensaje) {
    	
    	boolean isRemoved = false;
    	DestinoMensajeDO docMensaje = cargar(idDesMensaje);
		em.remove(docMensaje);
		DestinoMensajeDO docMensajeDO = cargar(idDesMensaje);
		if (docMensajeDO == null) {
			isRemoved = true;
		}
		return isRemoved;	
	}

    @Transactional(readOnly = true)
   	@SuppressWarnings("unchecked")
	public List<DestinoMensajeDO> seleccionPorMensaje(Long idDesMensaje) {
    	
    	List<DestinoMensajeDO> mensajeList = null;
		Query selecMensaje = em.createNamedQuery("destinoMensajeDO.seleccionPorMensaje");
		selecMensaje.setParameter("idMensaje", idDesMensaje);
		mensajeList = selecMensaje.getResultList();
		
		return mensajeList;	
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean persistirList(Set<DestinoMensajeDO> desList) {
		
		boolean res = true;

		try {
			
			for(DestinoMensajeDO reqDet : desList){
				
				em.persist(reqDet);
			}
			
		} catch (Exception e) {
			
			res=false;
		}
		
		
		
		return res;
		
	}

}
