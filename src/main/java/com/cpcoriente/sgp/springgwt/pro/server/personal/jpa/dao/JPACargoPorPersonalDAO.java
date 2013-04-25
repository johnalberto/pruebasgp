/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.personal.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.CargoPorPersonalDO;
import com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao.ICargoPorPersonalDAO;

/**
 * @author CPC-04
 *
 */

@Repository
public class JPACargoPorPersonalDAO implements ICargoPorPersonalDAO{
	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Transactional(readOnly = true)
	public CargoPorPersonalDO cargar(Long idCargoPorPersonal) {
		CargoPorPersonalDO cargoPorPersonal = em.find(CargoPorPersonalDO.class, idCargoPorPersonal);
		return cargoPorPersonal;
	}

	
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public CargoPorPersonalDO persistir(CargoPorPersonalDO cargoPorPersonal) { 	
		
		CargoPorPersonalDO cargoPorPersonalRes = null;   	
		em.persist(cargoPorPersonal);
		cargoPorPersonalRes = cargoPorPersonal;		
		return cargoPorPersonalRes;
	
	}

	

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public CargoPorPersonalDO modificar(CargoPorPersonalDO cargoPorPersonal) {

		CargoPorPersonalDO cargoPorPersonalRes = null;
		CargoPorPersonalDO cargoPorPersonalDO = null;

		cargoPorPersonalDO = cargoPorPersonal;
		cargoPorPersonalRes = em.merge(cargoPorPersonalDO);

		return cargoPorPersonalRes;
	}


	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idCargoPorPersonal) {

		boolean isRemoved = false;
		CargoPorPersonalDO cargoPorPersonal = cargar(idCargoPorPersonal);
		em.remove(cargoPorPersonal);
		CargoPorPersonalDO cargoPorPersonalDO = cargar(idCargoPorPersonal);
		if (cargoPorPersonalDO == null) {
			isRemoved = true;
		}
		return isRemoved;

	}



	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<CargoPorPersonalDO> listarPorProyectoEntidad(Long idProyectoEntidad) {
		List<CargoPorPersonalDO> cargoPorPersonalList = null;		
		Query selecDocumento = em.createNamedQuery("cargoPorPersonalDO.seleccionPorProyectoEntidad");
		selecDocumento.setParameter("idProyectoEntidad", idProyectoEntidad);
		cargoPorPersonalList = selecDocumento.getResultList();
		return cargoPorPersonalList;

	}

}
