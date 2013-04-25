package com.cpcoriente.sgp.springgwt.pro.server.entidad.jpa.dao;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.TerminoConvocatoriaDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.ITerminoConvocatoriaDAO;


@Repository
public class JPATerminoConvocatoriaDAO implements ITerminoConvocatoriaDAO {

	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	@Transactional(readOnly = true)
	public TerminoConvocatoriaDO cargar(Long idTermino) {
		
		TerminoConvocatoriaDO termino = em.find(TerminoConvocatoriaDO.class, idTermino);
		return termino;
	}

	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public TerminoConvocatoriaDO persistir(TerminoConvocatoriaDO termino) {
		
		TerminoConvocatoriaDO terminoRes = null;   	
		em.persist(termino);
		terminoRes = termino;		
		return terminoRes;
	}

	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public TerminoConvocatoriaDO modificar(TerminoConvocatoriaDO termino) {
		
		TerminoConvocatoriaDO terminoRes = null;
		TerminoConvocatoriaDO terminoDO = null;

    	terminoDO = termino;
    	terminoRes = em.merge(terminoDO);

    	
    	return terminoRes;
		
	}

	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idTermino) {
		
		boolean isRemoved = false;
		TerminoConvocatoriaDO termino = cargar(idTermino);
		em.remove(termino);
		TerminoConvocatoriaDO terminoDO = cargar(idTermino);
		if (terminoDO != null) {
			isRemoved = true;
		}
				
		return isRemoved;
	}

	 @Transactional(readOnly = true)
	    @SuppressWarnings("unchecked")
	public List<TerminoConvocatoriaDO> listarTodo() {
		 
		 List<TerminoConvocatoriaDO> terminoList = null;
	    	Query listarTodo = em.createNamedQuery("terminoConvocatoriaDO.listarTodo");
	    	terminoList = listarTodo.getResultList();
			return terminoList;
	}

	 @Transactional(readOnly = true)
	    @SuppressWarnings("unchecked")
	public List<TerminoConvocatoriaDO> seleccionPorNombre(
			String parteNombre) {
		 
		 List<TerminoConvocatoriaDO> terminoList = null;
	    	Query selecPorNom = em.createNamedQuery("terminoConvocatoriaDO.seleccionPorNombre");
	    	selecPorNom.setParameter("parteNombre", "%"+parteNombre.toLowerCase()+"%");
	    	terminoList = selecPorNom.getResultList();
			return terminoList;
	}

	 @Transactional(readOnly = true)
	    @SuppressWarnings("unchecked")
	public List<TerminoConvocatoriaDO> seleccionPorProyecto(Long idProyecto) {
		 
		 List<TerminoConvocatoriaDO> terminoList = null;
	    	Query selecPorNom = em.createNamedQuery("terminoConvocatoriaDO.seleccionPorProyecto");
	    	selecPorNom.setParameter("idProyecto",idProyecto );
	    	terminoList = selecPorNom.getResultList();
			return terminoList;
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean persistirList(Set<TerminoConvocatoriaDO> reqDetList) {
		boolean res = true;

		try {
			
			for(TerminoConvocatoriaDO reqDet : reqDetList){
				
				em.persist(reqDet);
			}
			
		} catch (Exception e) {
			
			res=false;
		}
		
		
		
		return res;
		
	}

	
}
