package com.cpcoriente.sgp.springgwt.pro.server.financiero.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.VersionRecursoDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IVersionRecursoDAO;


@Repository
public class JPAVersionRecursoDAO implements IVersionRecursoDAO {

	
private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
	
    @Transactional(readOnly = true)
	public VersionRecursoDO cargar(Long idVersion) {
    	
    	VersionRecursoDO version = em.find(VersionRecursoDO.class, idVersion);
		return version;
	}

    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public VersionRecursoDO persistir(VersionRecursoDO version) {
    	
    	VersionRecursoDO versionRes = null;   	
    	em.persist(version);
    	versionRes = version;		
    	return versionRes;
	}

    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public VersionRecursoDO modificar(VersionRecursoDO version) {
    	
    	VersionRecursoDO versionRes = null;
    	VersionRecursoDO versionDO = null;

    	versionDO = version;
    	versionRes = em.merge(versionDO);
    	return versionRes;
	}

    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idVersion) {
    	
    	boolean isRemoved = false;
    	VersionRecursoDO version = cargar(idVersion);
		em.remove(version);
		VersionRecursoDO unidadDO = cargar(idVersion);
		if (unidadDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

}
