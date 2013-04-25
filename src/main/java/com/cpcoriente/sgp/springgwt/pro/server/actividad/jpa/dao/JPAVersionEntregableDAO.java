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

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionEntregableDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IVersionEntregableDAO;

/**
 * @author CPC-04
 *
 */

@Repository
public class JPAVersionEntregableDAO implements IVersionEntregableDAO {

	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	@Transactional(readOnly = true)
	public VersionEntregableDO cargar(Long idVersionEntregable) {
		
		VersionEntregableDO versionEntregable = em.find(VersionEntregableDO.class, idVersionEntregable);
		return versionEntregable;
		
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public VersionEntregableDO persistir(VersionEntregableDO versionEntregable) {
		
		VersionEntregableDO verEntregableRes = null;   	
		em.persist(versionEntregable);
		verEntregableRes = versionEntregable;		
		return verEntregableRes;

	}

	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<VersionEntregableDO> seleccionPorFecha(Long idEntregable,
			Date fechaInicio, Date fechaFin) {
		
		List<VersionEntregableDO> verEntregableList = null;
		Query selecVersion = em.createNamedQuery("verEntregableDO.seleccionPorFecha");
		selecVersion.setParameter("idEntregable", idEntregable);
		selecVersion.setParameter("fechaInicio", "fechaInicio");
		selecVersion.setParameter("fechaFin", "fechaFin");
		verEntregableList = selecVersion.getResultList();
		
		return verEntregableList;
		
	}
	
	
}
