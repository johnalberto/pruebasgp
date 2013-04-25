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

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ActividadPorPersonalDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IActividadPorPersonalDAO;


/**
 * @author CPC-04
 *
 */


@Repository
public class JPAActividadPorPersonalDAO implements IActividadPorPersonalDAO {
	
	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	@Transactional(readOnly = true)
	public ActividadPorPersonalDO cargar(Long idActividadPorPersonal) {
		
		ActividadPorPersonalDO actividadPorPersonal = em.find(ActividadPorPersonalDO.class, idActividadPorPersonal);
		return actividadPorPersonal;
		
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ActividadPorPersonalDO persistir(ActividadPorPersonalDO actividadPorPersonal) {
		
		ActividadPorPersonalDO actividadPorPersonalRes = null;   	
		em.persist(actividadPorPersonal);
		actividadPorPersonalRes = actividadPorPersonal;		
		return actividadPorPersonalRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ActividadPorPersonalDO modificar(ActividadPorPersonalDO actividadPorPersonal) {
		
		ActividadPorPersonalDO actividadPorPersonalRes = null;
		ActividadPorPersonalDO actividadPorPersonalDO = null;
		actividadPorPersonalDO = actividadPorPersonal;
		Set<ActividadPorPersonalDO> actividadPorPersonalDOSet=new LinkedHashSet<ActividadPorPersonalDO>();
		actividadPorPersonalDOSet.add(actividadPorPersonalDO);
		em.merge(actividadPorPersonalDO);
		actividadPorPersonalRes = em.merge(actividadPorPersonalDO);
		return actividadPorPersonalRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idActividadPorPersonal) {
		
		boolean isRemoved = false;
		ActividadPorPersonalDO actividadPorPersonal = cargar(idActividadPorPersonal);
		em.remove(actividadPorPersonal);
		ActividadPorPersonalDO actividadPorPersonalDO = cargar(idActividadPorPersonal);
		if (actividadPorPersonalDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ActividadPorPersonalDO> listarTodoPorProducto(Long idProducto) {
		
		List<ActividadPorPersonalDO> actividadPorPersonalList = null;
		Query listarTodo = em.createNamedQuery("actividadPorPersonalDO.listarTodoPorProducto");
		listarTodo.setParameter("idProducto", idProducto);
		actividadPorPersonalList = listarTodo.getResultList();
		return actividadPorPersonalList;	
		
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ActividadPorPersonalDO> seleccionPorPersona(Long idProyecto, String parteNombreCedula) {
		
		List<ActividadPorPersonalDO> actividadPorPersonalList = null;
		Query selecActividad = em.createNamedQuery("actividadPorPersonalDO.seleccionPorPersona");
		selecActividad.setParameter("idProyecto", idProyecto);
		selecActividad.setParameter("parteNombre", "%" + parteNombreCedula.toLowerCase()+"%");
		selecActividad.setParameter("parteNumDoc", "%" + parteNombreCedula + "%");
		actividadPorPersonalList = selecActividad.getResultList();
		
		return actividadPorPersonalList;
	}


	
	

}
