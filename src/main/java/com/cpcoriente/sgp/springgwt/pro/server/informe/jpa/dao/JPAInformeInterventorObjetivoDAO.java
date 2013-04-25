package com.cpcoriente.sgp.springgwt.pro.server.informe.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InfoInterObjetivoDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IInformeInterventorObjetivoDAO;

@Repository
public class JPAInformeInterventorObjetivoDAO implements IInformeInterventorObjetivoDAO  {

	private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
	
    @Transactional(readOnly = true)
	public InfoInterObjetivoDetalleDO cargar(Long idInforme) {
		
    	InfoInterObjetivoDetalleDO informe = em.find(InfoInterObjetivoDetalleDO.class, idInforme);
		return informe;
	}

    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public InfoInterObjetivoDetalleDO persistir(
			InfoInterObjetivoDetalleDO informe) {
		
    	InfoInterObjetivoDetalleDO informeRes = null;   	
    	em.persist(informe);
    	informeRes = informe;		
    	return informeRes;

	}

    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public InfoInterObjetivoDetalleDO modificar(
			InfoInterObjetivoDetalleDO informe) {
	
    	InfoInterObjetivoDetalleDO informeRes = null;
    	InfoInterObjetivoDetalleDO informeDO = null;

    	informeDO = informe;
    	informeRes = em.merge(informeDO);
    	return informeRes;

	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idInforme) {
	
    	boolean isRemoved = false;
    	InfoInterObjetivoDetalleDO informe = cargar(idInforme);
		em.remove(informe);
		InfoInterObjetivoDetalleDO informeDO = cargar(idInforme);
		
		if (informeDO == null) {
			isRemoved = true;
		}
		return isRemoved;	

    
    }

}
