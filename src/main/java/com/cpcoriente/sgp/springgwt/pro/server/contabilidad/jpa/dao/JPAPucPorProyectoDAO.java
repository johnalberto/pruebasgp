/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.contabilidad.jpa.dao;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.PucPorProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.interfaces.dao.IPucPorProyectoDAO;

/**
 * @author CPC-04
 *
 */


@Repository
public class JPAPucPorProyectoDAO implements IPucPorProyectoDAO {
	
	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	@Transactional(readOnly = true)
	public PucPorProyectoDO cargar(Long idPucPorProyecto) {
		
		PucPorProyectoDO pucPorProyecto = em.find(PucPorProyectoDO.class, idPucPorProyecto);
		return pucPorProyecto;
		
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public List<PucPorProyectoDO> persistir(Set<PucPorProyectoDO> pucPorProyectoSet) {
		
		List<PucPorProyectoDO> puProyListRes = new LinkedList<PucPorProyectoDO>();   	
		
		for (PucPorProyectoDO pucProy: pucPorProyectoSet) {
			PucPorProyectoDO pucPorProyectoRes = null;
			em.persist(pucProy);
			pucPorProyectoRes = pucProy;	
			
			if (pucPorProyectoRes != null){
				puProyListRes.add(pucPorProyectoRes);
			}
		}
			
		return puProyListRes;

	}

	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idPucPorProyecto) {
		
		boolean isRemoved = false;
		PucPorProyectoDO pucPorProyecto = cargar(idPucPorProyecto);
		em.remove(pucPorProyecto);
		PucPorProyectoDO pucPorProyectoDO = cargar(idPucPorProyecto);
		if (pucPorProyectoDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<PucPorProyectoDO> listarTodoPorProyecto(Long idProyecto) {
		
		List<PucPorProyectoDO> pucPorProyectoList = null;
		Query listarTodo = em.createNamedQuery("pucPorProyectoDO.listarTodoPorProyecto");
		listarTodo.setParameter("idProyecto", idProyecto);
		pucPorProyectoList = listarTodo.getResultList();
		return pucPorProyectoList;	
		
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<PucPorProyectoDO> seleccionPorNombreCodigo(Long idProyecto,
			String parteNombreCodigo) {
		
		List<PucPorProyectoDO> pucPorProyectoList = null;
		Query selecPucPorProyecto = em.createNamedQuery("pucPorProyectoDO.seleccionPorCodigoNombre");
		selecPucPorProyecto.setParameter("idProyecto", idProyecto);
		selecPucPorProyecto.setParameter("parteNombre", "%" + parteNombreCodigo.toLowerCase()+"%");
		selecPucPorProyecto.setParameter("parteCodigo", "%" + parteNombreCodigo + "%");
		pucPorProyectoList = selecPucPorProyecto.getResultList();
		
		return pucPorProyectoList;
	}

}

	
