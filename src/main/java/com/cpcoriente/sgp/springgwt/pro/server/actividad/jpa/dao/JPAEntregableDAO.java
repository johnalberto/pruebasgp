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

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.EntregableDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IEntregableDAO;

/**
 * @author CPC-04
 *
 */

@Repository
public class JPAEntregableDAO implements IEntregableDAO {

	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	@Transactional(readOnly = true)
	public EntregableDO cargar(Long idEntregable) {
		
		EntregableDO entregable = em.find(EntregableDO.class, idEntregable);
		return entregable;
		
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public EntregableDO persistir(EntregableDO entregable) {
		
		EntregableDO proyectoRes = null;   	
		em.persist(entregable);
		proyectoRes = entregable;		
		return proyectoRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public EntregableDO modificar(EntregableDO entregable) {
		
		EntregableDO entregableRes = null;
		EntregableDO entregableDO = null;
		entregableDO = entregable;
		Set<EntregableDO> entregableDOSet=new LinkedHashSet<EntregableDO>();
		entregableDOSet.add(entregableDO);
		em.merge(entregableDO);
		entregableRes = em.merge(entregableDO);
		return entregableRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idEntregable) {
		
		boolean isRemoved = false;
		EntregableDO entregable = cargar(idEntregable);
		em.remove(entregable);
		EntregableDO entregableDO = cargar(idEntregable);
		if (entregableDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<EntregableDO> listarTodo(Long idActividad) {
		
		List<EntregableDO> proyectoList = null;
		Query listarTodo = em.createNamedQuery("entregableDO.listarTodo");
		listarTodo.setParameter("idActividad", idActividad);
		proyectoList = listarTodo.getResultList();
		return proyectoList;	
		
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<EntregableDO> seleccionPorNombreCodigo(Long idActividad,
			String parteNombreCodigo) {
		
		List<EntregableDO> entregableList = null;
		Query selecEntregable = em.createNamedQuery("entregableDO.seleccionPorCodigoNombre");
		selecEntregable.setParameter("idActividad", idActividad);
		selecEntregable.setParameter("parteNombre", "%" + parteNombreCodigo.toLowerCase()+"%");
		selecEntregable.setParameter("parteCodigo", "%" + parteNombreCodigo + "%");
		entregableList = selecEntregable.getResultList();
		
		return entregableList;
	}

	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<EntregableDO> seleccionPorActividadPorEstado(Long idActividad, int estado) {

		List<EntregableDO> entregableList = null;
		Query selecEntregable = em.createNamedQuery("entregableDO.seleccionPorEstado");
		selecEntregable.setParameter("idActividad", idActividad);
		selecEntregable.setParameter("estado", "estado");
		entregableList = selecEntregable.getResultList();
		
		return entregableList;
		
	}

	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<EntregableDO> seleccionPorRangofechas(Long idActividad,
			Date fechaInicio, Date fechaFin) {
		
		List<EntregableDO> entregableList = null;
		Query selecEntregable = em.createNamedQuery("entregableDO.seleccionPorRangofechas");
		selecEntregable.setParameter("idActividad", idActividad);
		selecEntregable.setParameter("fechaInicio", "fechaInicio");
		selecEntregable.setParameter("fechaFin", "fechaFin");
		entregableList = selecEntregable.getResultList();
		
		return entregableList;
		
	}

	

}
