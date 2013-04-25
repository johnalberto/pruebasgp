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

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionProductoDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IVersionProductoDAO;

/**
 * @author CPC-04
 *
 */

@Repository
public class JPAVersionProductoDAO implements IVersionProductoDAO {
	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	@Transactional(readOnly = true)
	public VersionProductoDO cargar(Long idVersionProducto) {
		
		VersionProductoDO versionProducto = em.find(VersionProductoDO.class, idVersionProducto);
		return versionProducto;
		
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public VersionProductoDO persistir(VersionProductoDO versionProducto) {
		
		VersionProductoDO productoRes = null;   	
		em.persist(versionProducto);
		productoRes = versionProducto;		
		return productoRes;

	}

	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<VersionProductoDO> seleccionPorFecha(Long idProducto,
			Date fechaInicio, Date fechaFin) {
		
		List<VersionProductoDO> verProductoList = null;
		Query selecVersion = em.createNamedQuery("verProductoDO.seleccionPorFecha");
		selecVersion.setParameter("idProducto", idProducto);
		selecVersion.setParameter("fechaInicio", "fechaInicio");
		selecVersion.setParameter("fechaFin", "fechaFin");
		verProductoList = selecVersion.getResultList();
		
		return verProductoList;
		
	}

}
