/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.actividad.jpa.dao;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ObjetivoDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IObjetivoDAO;


/**
 * @author CPC-04
 *
 */

@Repository
public class JPAObjetivoDAO implements IObjetivoDAO {

	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	@Transactional(readOnly = true)
	public ObjetivoDO cargar(Long idObjetivo) {
		
		ObjetivoDO objetivo = em.find(ObjetivoDO.class, idObjetivo);
		return objetivo;
		
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ObjetivoDO persistir(ObjetivoDO objetivo) {
		
		ObjetivoDO objetivoRes = null;   	
		em.persist(objetivo);
		objetivoRes = objetivo;		
		return objetivoRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ObjetivoDO modificar(ObjetivoDO objetivo) {
		
		ObjetivoDO objetivoRes = null;
		ObjetivoDO objetivoDO = null;
		objetivoDO = objetivo;
		Set<ObjetivoDO> objetivoDOSet=new LinkedHashSet<ObjetivoDO>();
		objetivoDOSet.add(objetivoDO);
		em.merge(objetivoDO);
		objetivoRes = em.merge(objetivoDO);
		return objetivoRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idObjetivo) {
		
		boolean isRemoved = false;
		ObjetivoDO objetivo = cargar(idObjetivo);
		em.remove(objetivo);
		ObjetivoDO objetivoDO = cargar(idObjetivo);
		if (objetivoDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ObjetivoDO> listarTodo(Long idProyecto) {
		
		List<ObjetivoDO> objetivoList = null;
		Query listarTodo = em.createNamedQuery("objetivoDO.listarTodo");
		listarTodo.setParameter("idProyecto", idProyecto);
		objetivoList = listarTodo.getResultList();
		return objetivoList;	
		
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ObjetivoDO> seleccionPorNombreCodigo(Long idProyecto,
			String parteNombreCodigo) {
		
		List<ObjetivoDO> objetivoList = null;
		Query selecObjetivo = em.createNamedQuery("objetivoDO.seleccionPorCodigoNombre");
		selecObjetivo.setParameter("idProyecto", idProyecto);
		selecObjetivo.setParameter("parteNombre", "%" + parteNombreCodigo.toLowerCase()+"%");
		selecObjetivo.setParameter("parteCodigo", "%" + parteNombreCodigo + "%");
		objetivoList = selecObjetivo.getResultList();
		
		return objetivoList;
	}

	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ObjetivoDO> seleccionPorProyectoPorEstado(Long idProyecto,
			int estado) {
		List<ObjetivoDO> objetivoList = null;
		Query selecEstado = em.createNamedQuery("objetivoDO.seleccionPorEstado");
		selecEstado.setParameter("idProyecto", idProyecto);
		selecEstado.setParameter("estado", estado);
		objetivoList = selecEstado.getResultList();
		return objetivoList;
	}
}
