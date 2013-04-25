package com.cpcoriente.sgp.springgwt.pro.server.proyecto.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.DocProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IDocProyectoDAO;

@Repository
public class JPADocProyectoDAO implements IDocProyectoDAO {

	private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
	
    @Transactional(readOnly = true)
	public DocProyectoDO cargar(Long idDocProyecto) {
	
    	DocProyectoDO docTermino = em.find(DocProyectoDO.class, idDocProyecto);
		return docTermino;
    
    }

    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public DocProyectoDO persistir(DocProyectoDO docProyecto) {
		
    	DocProyectoDO docProyectoRes = null;   	
    	em.persist(docProyecto);
    	docProyectoRes = docProyecto;		
    	return docProyectoRes;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public DocProyectoDO modificar(DocProyectoDO docProyecto) {
    	
    	DocProyectoDO docProyectoRes = null;
    	DocProyectoDO docProyectoDO = null;

    	docProyectoDO = docProyecto;
    	docProyectoRes = em.merge(docProyectoDO);
    	return docProyectoRes;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idDocProyecto) {
    	
    	boolean isRemoved = false;
    	DocProyectoDO docPro = cargar(idDocProyecto);
		em.remove(docPro);
		DocProyectoDO docProDO = cargar(idDocProyecto);
		if (docProDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

    @Transactional(readOnly = true)
  	@SuppressWarnings("unchecked")
	public List<DocProyectoDO> listarPorProyecto(Long idProyecto) {
		
    	List<DocProyectoDO> fotoList = null;
    	Query selecPorEntidad = em.createNamedQuery("docProyectoDO.seleccionPorProyecto");
    	selecPorEntidad.setParameter("idProyecto", idProyecto);
    	fotoList = selecPorEntidad.getResultList();
		return fotoList;	
    	
	}

}
