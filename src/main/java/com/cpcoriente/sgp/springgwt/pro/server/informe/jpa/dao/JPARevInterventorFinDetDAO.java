package com.cpcoriente.sgp.springgwt.pro.server.informe.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.RevInterventorFinDetDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IRevInterventorFinDetDAO;

@Repository
public class JPARevInterventorFinDetDAO implements IRevInterventorFinDetDAO {

private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
	
	
    @Transactional(readOnly = true)
	public RevInterventorFinDetDO cargar(Long idRevision) {
    	
    	RevInterventorFinDetDO informe = em.find(RevInterventorFinDetDO.class, idRevision);
		return informe;
	}

    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public RevInterventorFinDetDO persistir(RevInterventorFinDetDO revision) {
    	
    	RevInterventorFinDetDO revIntFinRes = null;   	
    	em.persist(revision);
    	revIntFinRes = revision;		
    	return revIntFinRes;
	}

    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public RevInterventorFinDetDO modificar(RevInterventorFinDetDO revision) {
    	
    	RevInterventorFinDetDO informeRes = null;
    	RevInterventorFinDetDO informeDO = null;

    	informeDO = revision;
    	informeRes = em.merge(informeDO);
    	return informeRes;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idRevision) {
    	
    	boolean isRemoved = false;
    	RevInterventorFinDetDO informe = cargar(idRevision);
		em.remove(informe);
		RevInterventorFinDetDO informeDO = cargar(idRevision);
		
		if (informeDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

}
