package com.cpcoriente.sgp.springgwt.pro.server.informe.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InformeInterventorDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IInformeInterventorDAO;

@Repository
public class JPAInformeInterventorDAO implements IInformeInterventorDAO {

	
	private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = true)
	public InformeInterventorDO cargar(Long idInforme) {
    	
    	InformeInterventorDO informe = em.find(InformeInterventorDO.class, idInforme);
		return informe;

	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public InformeInterventorDO persistir(InformeInterventorDO informe) {
		
    	InformeInterventorDO informeRes = null;   	
    	em.persist(informe);
    	informeRes = informe;		
    	return informeRes;
	}

    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public InformeInterventorDO modificar(InformeInterventorDO informe) {
    	
    	InformeInterventorDO informeRes = null;
    	InformeInterventorDO informeDO = null;

    	informeDO = informe;
    	informeRes = em.merge(informeDO);
    	return informeRes;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idInforme) {
    	
    	boolean isRemoved = false;
    	InformeInterventorDO informe = cargar(idInforme);
		em.remove(informe);
		InformeInterventorDO informeDO = cargar(idInforme);
		
		if (informeDO == null) {
			isRemoved = true;
		}
		return isRemoved;	

	}

}
