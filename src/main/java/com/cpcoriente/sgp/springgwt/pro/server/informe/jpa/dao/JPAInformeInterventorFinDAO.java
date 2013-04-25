package com.cpcoriente.sgp.springgwt.pro.server.informe.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InformeInterventorFinDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IInformeInterventorFinDAO;


@Repository
public class JPAInformeInterventorFinDAO implements IInformeInterventorFinDAO {

	private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
	
    @Transactional(readOnly = true)
	public InformeInterventorFinDO cargar(Long idInforme) {
    	
    	InformeInterventorFinDO informe = em.find(InformeInterventorFinDO.class, idInforme);
		return informe;

	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public InformeInterventorFinDO persistir(InformeInterventorFinDO informe) {
    	
    	InformeInterventorFinDO informeRes = null;   	
    	em.persist(informe);
    	informeRes = informe;		
    	return informeRes;

	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public InformeInterventorFinDO modificar(InformeInterventorFinDO informe) {
    	
    	InformeInterventorFinDO informeRes = null;
    	InformeInterventorFinDO informeDO = null;

    	informeDO = informe;
    	informeRes = em.merge(informeDO);
    	return informeRes;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idInforme) {
    	
    	boolean isRemoved = false;
    	InformeInterventorFinDO informe = cargar(idInforme);
		em.remove(informe);
		InformeInterventorFinDO informeDO = cargar(idInforme);
		
		if (informeDO == null) {
			isRemoved = true;
		}
		return isRemoved;	
	}

}
