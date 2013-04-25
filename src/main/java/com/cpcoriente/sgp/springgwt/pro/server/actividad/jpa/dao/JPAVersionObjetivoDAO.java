/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.actividad.jpa.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionObjetivoDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IVersionObjetivoDAO;

/**
 * @author CPC-04
 *
 */


@Repository
public class JPAVersionObjetivoDAO implements IVersionObjetivoDAO{

	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	@Transactional(readOnly = true)
	public VersionObjetivoDO cargar(Long idVersionObjetivo) {
		
		VersionObjetivoDO versionObjetivo = em.find(VersionObjetivoDO.class, idVersionObjetivo);
		return versionObjetivo;
		
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public VersionObjetivoDO persistir(VersionObjetivoDO versionObjetivo) {
		
		VersionObjetivoDO verObjetivoResRes = null;   	
		em.persist(versionObjetivo);
		verObjetivoResRes = versionObjetivo;		
		return verObjetivoResRes;

	}

	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<VersionObjetivoDO> seleccionPorFecha(Long idObjetivo,
			Date fechaInicio, Date fechaFin) {
		
		List<VersionObjetivoDO> verObjetivoList = null;
		Query selecVersion = em.createNamedQuery("verObjetivoDO.seleccionPorFecha");
		selecVersion.setParameter("idObjetivo", idObjetivo);
		selecVersion.setParameter("fechaInicio", "fechaInicio");
		selecVersion.setParameter("fechaFin", "fechaFin");
		verObjetivoList = selecVersion.getResultList();
		
		return verObjetivoList;
		
	}
	
	
}
