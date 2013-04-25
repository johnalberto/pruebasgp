package com.cpcoriente.sgp.springgwt.pro.server.entidad.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.DocTerminoConvocatoriaDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IDocTerminoConvocatoriaDAO;


@Repository
public class JPADocTerminoDAO implements IDocTerminoConvocatoriaDAO {

	private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
	
    @Transactional(readOnly = true)
	public DocTerminoConvocatoriaDO cargar(Long idDocTer) {
    	
    	DocTerminoConvocatoriaDO docTermino = em.find(DocTerminoConvocatoriaDO.class, idDocTer);
		return docTermino;

	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public DocTerminoConvocatoriaDO persistir(
			DocTerminoConvocatoriaDO docTermino) {
		
    
    	DocTerminoConvocatoriaDO docTerminoRes = null;   	
    	em.persist(docTermino);
    	docTerminoRes = docTermino;		
    	return docTerminoRes;
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public DocTerminoConvocatoriaDO modificar(
			DocTerminoConvocatoriaDO docTermino) {
    	
    	DocTerminoConvocatoriaDO docTerminoRes = null;
    	DocTerminoConvocatoriaDO docTerminoDO = null;

    	docTerminoDO = docTermino;
    	docTerminoRes = em.merge(docTerminoDO);
    	return docTerminoRes;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idDocTer) {
		
    
    	boolean isRemoved = false;
    	DocTerminoConvocatoriaDO docTer = cargar(idDocTer);
		em.remove(docTer);
		DocTerminoConvocatoriaDO docTerDO = cargar(idDocTer);
		if (docTerDO == null) {
			isRemoved = true;
		}
		return isRemoved;
    }

    @Transactional(readOnly = true)
  	@SuppressWarnings("unchecked")
	public List<DocTerminoConvocatoriaDO> listarPorTermino(Long idTermino) {
		
    	List<DocTerminoConvocatoriaDO> fotoList = null;
    	Query selecPorEntidad = em.createNamedQuery("docTermino.seleccionPorTermino");
    	selecPorEntidad.setParameter("idTermino", idTermino);
    	fotoList = selecPorEntidad.getResultList();
		return fotoList;	

	}

}
