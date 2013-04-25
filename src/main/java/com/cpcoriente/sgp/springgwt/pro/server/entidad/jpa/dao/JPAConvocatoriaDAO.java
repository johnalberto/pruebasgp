package com.cpcoriente.sgp.springgwt.pro.server.entidad.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.ConvocatoriaDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IConvocatoriaDAO;


@Repository
public class JPAConvocatoriaDAO implements IConvocatoriaDAO {

	
	private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
	
	
    @Transactional(readOnly = true)
	public ConvocatoriaDO cargar(Long idConvocatoria) {
    	
    	ConvocatoriaDO convocatoria = em.find(ConvocatoriaDO.class, idConvocatoria);
		return convocatoria;

	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ConvocatoriaDO persistir(ConvocatoriaDO convocatoria) {
    	
    	ConvocatoriaDO convocatoriaRes = null;   	
    	em.persist(convocatoria);
    	convocatoriaRes = convocatoria;		
    	return convocatoriaRes;
	}

    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ConvocatoriaDO modificar(ConvocatoriaDO convocatoria) {
    	
    	ConvocatoriaDO convocatoriaRes = null;
    	ConvocatoriaDO convocatoriaDO = null;

    	convocatoriaDO = convocatoria;
    	convocatoriaRes = em.merge(convocatoriaDO);
    	return convocatoriaRes;
	}

    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idConvocatoria) {
		
    	boolean isRemoved = false;
    	ConvocatoriaDO convocatoria = cargar(idConvocatoria);
		em.remove(convocatoria);
		ConvocatoriaDO divisionDO = cargar(idConvocatoria);
		if (divisionDO == null) {
			isRemoved = true;
		}
		return isRemoved;

	}


    @Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ConvocatoriaDO> listarTodo() {
		
    	List<ConvocatoriaDO> convocatoriaList = null;
    	Query listarTodo = em.createNamedQuery("convoDO.listarTodo");
    	convocatoriaList = listarTodo.getResultList();
		return convocatoriaList;	
	}


    @Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ConvocatoriaDO> seleccionPorDivision(Long idDivision) {
		
    	List<ConvocatoriaDO> convocatoriaList = null;
    	Query selec = em.createNamedQuery("convoDO.seleccionPorDivision");
    	selec.setParameter("idDivision",idDivision);
    	convocatoriaList = selec.getResultList();
		return convocatoriaList;	
	}

    
}
