/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.contabilidad.jpa.dao;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.PucDO;
import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.interfaces.dao.IPucDAO;

/**
 * @author CPC-04
 *
 */


@Repository
public class JPAPucDAO implements IPucDAO {
	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	@Transactional(readOnly = true)
	public PucDO cargar(Long idPuc) {
		
		PucDO puc = em.find(PucDO.class, idPuc);
		return puc;
		
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public PucDO persistir(PucDO puc) {
		
		PucDO proyectoRes = null;   	
		em.persist(puc);
		proyectoRes = puc;		
		return proyectoRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public PucDO modificar(PucDO puc) {
		
		PucDO pucRes = null;
		PucDO pucDO = null;
		pucDO = puc;
		Set<PucDO> pucDOSet=new LinkedHashSet<PucDO>();
		pucDOSet.add(pucDO);
		em.merge(pucDO);
		pucRes = em.merge(pucDO);
		return pucRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idPuc) {
		
		boolean isRemoved = false;
		PucDO puc = cargar(idPuc);
		em.remove(puc);
		PucDO pucDO = cargar(idPuc);
		if (pucDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<PucDO> listarTodo(Long idEntidad) {
		
		List<PucDO> pucList = null;
		Query listarTodo = em.createNamedQuery("pucDO.listarTodo");
		listarTodo.setParameter("idEntidad", idEntidad);
		pucList = listarTodo.getResultList();
		return pucList;	
		
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<PucDO> seleccionPorNombreCodigo(Long idEntidad,
			String parteNombreCodigo) {
		
		List<PucDO> pucList = null;
		Query selecPuc = em.createNamedQuery("pucDO.seleccionPorCodigoNombre");
		selecPuc.setParameter("idEntidad", idEntidad);
		selecPuc.setParameter("parteNombre", "%" + parteNombreCodigo.toLowerCase()+"%");
		selecPuc.setParameter("parteCodigo", "%" + parteNombreCodigo + "%");
		pucList = selecPuc.getResultList();
		
		return pucList;
	}

}
