/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.contabilidad.jpa.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.MovimientoContableDO;
import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.interfaces.dao.IMovimientoContableDAO;

/**
 * @author CPC-04
 *
 */


@Repository
public class JPAMovimientoContableDAO implements IMovimientoContableDAO{


	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Transactional(readOnly = true)
	public MovimientoContableDO cargar(Long idMovimientoContable) {

		MovimientoContableDO movimientoContable = em.find(MovimientoContableDO.class, idMovimientoContable);
		return movimientoContable;

	}

	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public MovimientoContableDO persistir(MovimientoContableDO movimientoContable) {

		MovimientoContableDO movimientoContableRes = null;
		em.persist(movimientoContable);
		movimientoContableRes = movimientoContable;	


		return movimientoContableRes;

	}


	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<MovimientoContableDO> listarTodoPorProyecto(Long idProyecto) {

		List<MovimientoContableDO> movContableList = null;
		Query listarTodo = em.createNamedQuery("movimientoContableDO.listarTodoPorProyecto");
		listarTodo.setParameter("idProyecto", idProyecto);
		movContableList = listarTodo.getResultList();
		return movContableList;	

	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<MovimientoContableDO> seleccionPorCuenta(Long idProyecto, Long idCuentaPuc) {

		List<MovimientoContableDO> movContableList = null;
		Query listarPorCuenta = em.createNamedQuery("movimientoContableDO.seleccionPorCuenta");
		listarPorCuenta.setParameter("idProyecto", idProyecto);
		listarPorCuenta.setParameter("idCuentaPuc", idCuentaPuc);
		movContableList = listarPorCuenta.getResultList();
		return movContableList;	
	}


	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<MovimientoContableDO> seleccionPorRangofechas(Long idProyecto,
			Date fechaInicio, Date fechaFin) {

		List<MovimientoContableDO> movContableList = null;
		Query listarPorRangoFechas = em.createNamedQuery("movimientoContableDO.seleccionPorRangofechas");
		listarPorRangoFechas.setParameter("idProyecto", idProyecto);
		listarPorRangoFechas.setParameter("fechaInicio", fechaInicio);
		listarPorRangoFechas.setParameter("fechaFin", fechaFin);
		movContableList = listarPorRangoFechas.getResultList();
		return movContableList;	
	}


	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<MovimientoContableDO> seleccionPorEjecucion(Long idProyecto,
			Long idEjecPres) {

		List<MovimientoContableDO> movContableList = null;
		Query listarPorEjecPres = em.createNamedQuery("movimientoContableDO.seleccionPorEjecPres");
		listarPorEjecPres.setParameter("idProyecto", idProyecto);
		listarPorEjecPres.setParameter("idEjecPres", idEjecPres);
		movContableList = listarPorEjecPres.getResultList();
		return movContableList;	

	}


	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<MovimientoContableDO> seleccionPorRecursoDet(Long idProyecto,
			Long idRecursoDet) {

		List<MovimientoContableDO> movContableList = null;
		Query listarPorRecursoDet = em.createNamedQuery("movimientoContableDO.seleccionPorRecursoDet");
		listarPorRecursoDet.setParameter("idProyecto", idProyecto);
		listarPorRecursoDet.setParameter("idRecursoDet", idRecursoDet);
		movContableList = listarPorRecursoDet.getResultList();
		return movContableList;	
	}




}
