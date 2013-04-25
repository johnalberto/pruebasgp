package com.cpcoriente.sgp.springgwt.pro.server.informe.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.RevInterventorFinDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IRevInterventorFinDAO;


@Repository
public class JPARevInterventorFinDAO implements IRevInterventorFinDAO {

	private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = true)
	public RevInterventorFinDO cargar(Long idRevision) {
    	
    	RevInterventorFinDO informe = em.find(RevInterventorFinDO.class, idRevision);
		return informe;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public RevInterventorFinDO persistir(RevInterventorFinDO revision) {
    	
    	RevInterventorFinDO revIntFinRes = null;   	
    	em.persist(revision);
    	revIntFinRes = revision;		
    	return revIntFinRes;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public RevInterventorFinDO modificar(RevInterventorFinDO revision) {
    	
    	RevInterventorFinDO informeRes = null;
    	RevInterventorFinDO informeDO = null;

    	informeDO = revision;
    	informeRes = em.merge(informeDO);
    	return informeRes;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idRevision) {
    	
    	boolean isRemoved = false;
    	RevInterventorFinDO informe = cargar(idRevision);
		em.remove(informe);
		RevInterventorFinDO informeDO = cargar(idRevision);
		
		if (informeDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

	

}
