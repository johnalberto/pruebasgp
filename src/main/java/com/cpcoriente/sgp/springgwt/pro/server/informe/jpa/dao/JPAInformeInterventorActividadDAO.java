package com.cpcoriente.sgp.springgwt.pro.server.informe.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InfoInterActividadDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IInformeInterventorActividadDAO;


@Repository
public class JPAInformeInterventorActividadDAO implements IInformeInterventorActividadDAO {

	private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
	
    @Transactional(readOnly = true)
	public InfoInterActividadDetalleDO cargar(Long idInforme) {
    	
    	InfoInterActividadDetalleDO informe = em.find(InfoInterActividadDetalleDO.class, idInforme);
		return informe;	
		
    }
    
    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public InfoInterActividadDetalleDO persistir(
			InfoInterActividadDetalleDO informe) {
    	
    	InfoInterActividadDetalleDO informeRes = null;   	
    	em.persist(informe);
    	informeRes = informe;		
    	return informeRes;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public InfoInterActividadDetalleDO modificar(
			InfoInterActividadDetalleDO informe) {
    	
    	
    	InfoInterActividadDetalleDO informeRes = null;
    	InfoInterActividadDetalleDO informeDO = null;

    	informeDO = informe;
    	informeRes = em.merge(informeDO);
    	return informeRes;

	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idInforme) {
		
    	
    	boolean isRemoved = false;
    	InfoInterActividadDetalleDO informe = cargar(idInforme);
		em.remove(informe);
		InfoInterActividadDetalleDO informeDO = cargar(idInforme);
		
		if (informeDO == null) {
			isRemoved = true;
		}
		return isRemoved;	

	}

}
