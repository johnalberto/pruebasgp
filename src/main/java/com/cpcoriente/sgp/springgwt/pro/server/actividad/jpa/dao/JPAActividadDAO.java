/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.actividad.jpa.dao;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ActividadDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IActividadDAO;

/**
 * @author CPC-04
 *
 */

@Repository
public class JPAActividadDAO implements IActividadDAO{
	
	
	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	@Transactional(readOnly = true)
	public ActividadDO cargar(Long idActividad) {
		
		ActividadDO actividad = em.find(ActividadDO.class, idActividad);
		return actividad;
		
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ActividadDO persistir(ActividadDO actividad) {
		
		ActividadDO actividadRes = null;   	
		em.persist(actividad);
		actividadRes = actividad;		
		return actividadRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ActividadDO modificar(ActividadDO actividad) {
		
		ActividadDO actividadRes = null;
		ActividadDO actividadDO = null;
		actividadDO = actividad;
		Set<ActividadDO> actividadDOSet=new LinkedHashSet<ActividadDO>();
		actividadDOSet.add(actividadDO);
		em.merge(actividadDO);
		actividadRes = em.merge(actividadDO);
		return actividadRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idActividad) {
		
		boolean isRemoved = false;
		ActividadDO actividad = cargar(idActividad);
		em.remove(actividad);
		ActividadDO actividadDO = cargar(idActividad);
		if (actividadDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ActividadDO> listarTodo(Long idProducto) {
		
		List<ActividadDO> actividadList = null;
		Query listarTodo = em.createNamedQuery("actividadDO.listarTodo");
		listarTodo.setParameter("idProducto", idProducto);
		actividadList = listarTodo.getResultList();
		return actividadList;	
		
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ActividadDO> seleccionPorNombreCodigo(Long idProducto,
			String parteNombreCodigo) {
		
		List<ActividadDO> actividadList = null;
		Query selecActividad = em.createNamedQuery("actividadDO.seleccionPorCodigoNombre");
		selecActividad.setParameter("idProducto", idProducto);
		selecActividad.setParameter("parteNombre", "%" + parteNombreCodigo.toLowerCase()+"%");
		selecActividad.setParameter("parteCodigo", "%" + parteNombreCodigo + "%");
		actividadList = selecActividad.getResultList();
		
		return actividadList;
	}

	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ActividadDO> seleccionPorProductoPorEstado(Long idProducto,
			int estado) {
		List<ActividadDO> actividadList = null;
		Query selecEstado = em.createNamedQuery("actividadDO.seleccionPorEstado");
		selecEstado.setParameter("idProducto", idProducto);
		selecEstado.setParameter("estado", estado);
		actividadList = selecEstado.getResultList();
		return actividadList;
	}

	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ActividadDO> seleccionPorNombreCodigoPadre(Long idPadre,
			String parteNombreCodigo) {

		List<ActividadDO> actividadList = null;
		Query selecActividad = em.createNamedQuery("actividadDO.seleccionPorNombreCodigoPadre");
		selecActividad.setParameter("idPadre", idPadre);
		selecActividad.setParameter("parteNombre", "%" + parteNombreCodigo.toLowerCase()+"%");
		selecActividad.setParameter("parteCodigo", "%" + parteNombreCodigo + "%");
		actividadList = selecActividad.getResultList();
		
		return actividadList;
	}

	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ActividadDO> seleccionPorPadre(Long idPadre) {
		
		List<ActividadDO> actividadList = null;
		Query selecActividad = em.createNamedQuery("actividadDO.seleccionPorPadre");
		selecActividad.setParameter("idPadre", idPadre);
		actividadList = selecActividad.getResultList();
		
		return actividadList;
	
	}

	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ActividadDO> seleccionPadres(Long idProducto) {

		List<ActividadDO> actividadList = null;
		Query selecActividad = em.createNamedQuery("actividadDO.seleccionPadres");
		selecActividad.setParameter("idProducto", idProducto);
		actividadList = selecActividad.getResultList();
		
		return actividadList;
		
	}

	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ActividadDO> seleccionPadresPorNomCod(Long idProducto,
			String parteNombreCodigo) {

		List<ActividadDO> actividadList = null;
		Query selecActividad = em.createNamedQuery("actividadDO.seleccionPadresPorNomCod");
		selecActividad.setParameter("idProducto", idProducto);
		selecActividad.setParameter("parteNombre", "%" + parteNombreCodigo.toLowerCase()+"%");
		selecActividad.setParameter("parteCodigo", "%" + parteNombreCodigo + "%");
		actividadList = selecActividad.getResultList();
		
		return actividadList;
		
	}

	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ActividadDO> seleccionPorRangofechas(Long idProducto,
			Date fechaInicio, Date fechaFin) {


		List<ActividadDO> actividadList = null;
		Query selecActividad = em.createNamedQuery("actividadDO.seleccionPorRangofechas");
		selecActividad.setParameter("idProducto", idProducto);
		selecActividad.setParameter("fechaInicio", "fechaInicio");
		selecActividad.setParameter("parteCodigo", "fechaFin");
		actividadList = selecActividad.getResultList();
		
		return actividadList;
		
		
	}

	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ActividadDO> seleccionPorFechaInicial(Long idProducto,
			Date fechaInicio) {
		
		List<ActividadDO> actividadList = null;
		Query selecActividad = em.createNamedQuery("actividadDO.seleccionPorFechaInicial");
		selecActividad.setParameter("idProducto", idProducto);
		selecActividad.setParameter("fechaInicio", "fechaInicio");
		actividadList = selecActividad.getResultList();
		
		return actividadList;
	}

	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ActividadDO> seleccionPorFechaFinal(Long idProducto,
			Date fechaFin) {

		
		List<ActividadDO> actividadList = null;
		Query selecActividad = em.createNamedQuery("actividadDO.seleccionPorFechaFinal");
		selecActividad.setParameter("idProducto", idProducto);
		selecActividad.setParameter("fechaFin", "fechaFin");
		actividadList = selecActividad.getResultList();
		
		return actividadList;
		
	}


}
