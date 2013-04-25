package com.cpcoriente.sgp.springgwt.pro.server.financiero.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.VersionRecursoDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IVersionRecursoDetalleDAO;

@Repository
public class JPAVersionRecursoDetalleDAO implements IVersionRecursoDetalleDAO {

private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
	
    @Transactional(readOnly = true)
	public VersionRecursoDetalleDO cargar(Long idRecurso) {
    	
    	VersionRecursoDetalleDO version = em.find(VersionRecursoDetalleDO.class, idRecurso);
		return version;	
		
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public VersionRecursoDetalleDO persistir(VersionRecursoDetalleDO recurso) {
    	
    	VersionRecursoDetalleDO versionRes = null;   	
    	em.persist(recurso);
    	versionRes = recurso;		
    	return versionRes;

	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public VersionRecursoDetalleDO modificar(VersionRecursoDetalleDO recurso) {
		
    
    	VersionRecursoDetalleDO versionRes = null;
    	VersionRecursoDetalleDO versionDO = null;

    	versionDO = recurso;
    	versionRes = em.merge(versionDO);
    	return versionRes;
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idRecurso) {
		
    	boolean isRemoved = false;
    	VersionRecursoDetalleDO version = cargar(idRecurso);
		em.remove(version);
		VersionRecursoDetalleDO unidadDO = cargar(idRecurso);
		if (unidadDO == null) {
			isRemoved = true;
		}
		return isRemoved;
    }

}
