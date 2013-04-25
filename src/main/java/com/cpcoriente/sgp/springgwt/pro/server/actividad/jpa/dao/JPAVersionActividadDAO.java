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

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionActividadDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IVersionActividadDAO;

/**
 * @author CPC-04
 *
 */

@Repository
public class JPAVersionActividadDAO  implements IVersionActividadDAO{
	
	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	@Transactional(readOnly = true)
	public VersionActividadDO cargar(Long idVersionActividad) {
		
		VersionActividadDO versionActividad = em.find(VersionActividadDO.class, idVersionActividad);
		return versionActividad;
		
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public VersionActividadDO persistir(VersionActividadDO versionActividad) {
		
		VersionActividadDO verActividadRes = null;   	
		em.persist(versionActividad);
		verActividadRes = versionActividad;		
		return verActividadRes;

	}

	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<VersionActividadDO> seleccionPorFecha(Long idActividad,
			Date fechaInicio, Date fechaFin) {
		
		List<VersionActividadDO> verActividadList = null;
		Query selecVersion = em.createNamedQuery("verActividadDO.seleccionPorFecha");
		selecVersion.setParameter("idActividad", idActividad);
		selecVersion.setParameter("fechaInicio", "fechaInicio");
		selecVersion.setParameter("fechaFin", "fechaFin");
		verActividadList = selecVersion.getResultList();
		
		return verActividadList;
		
	}

}
