/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.ejecucion.jpa.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.ejecucion.entity.EjecucionPresupuestoDO;
import com.cpcoriente.sgp.springgwt.pro.server.ejecucion.interfaces.dao.IEjecucionPresupuestoDAO;

/**
 * @author CPC-04
 *
 */

@Repository
public class JPAEjecucionPresupuestoDAO implements IEjecucionPresupuestoDAO {
	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	
	@Transactional(readOnly = true)
	public EjecucionPresupuestoDO cargar(Long idEjecucionPresupuesto) {
		EjecucionPresupuestoDO ejecucionPresupuesto = em.find(EjecucionPresupuestoDO.class, idEjecucionPresupuesto);
		return ejecucionPresupuesto;
	}


	@Transactional(readOnly = false , propagation = Propagation.REQUIRED)
	public EjecucionPresupuestoDO persistir(EjecucionPresupuestoDO ejecucionPresupuesto) {
		EjecucionPresupuestoDO ejecucionPresupuestoRes = null;   	
		em.persist(ejecucionPresupuesto);
		ejecucionPresupuestoRes = ejecucionPresupuesto;		
		return ejecucionPresupuestoRes;
	}

	
	@Transactional(readOnly = false , propagation = Propagation.REQUIRED)
	public EjecucionPresupuestoDO modificar(EjecucionPresupuestoDO ejecucionPresupuesto) {
		EjecucionPresupuestoDO ejecucionPresupuestoRes = null;
		EjecucionPresupuestoDO ejecucionPresupuestoDO = null;

		ejecucionPresupuestoDO = ejecucionPresupuesto;
		ejecucionPresupuestoRes = em.merge(ejecucionPresupuestoDO);
		return ejecucionPresupuestoRes;
	}


	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<EjecucionPresupuestoDO> seleccionGeneral(Long idTercero, int tipoComprobante, String numComprobante, Date fechaRegIni, 
			Date fechaRegFin, Date fechaEjecIni, Date fechaEjecFin, Boolean aprobado, Boolean ejecutado, Long idRecurso, Long idProyectoEntidad) {
		
		int queryContinua = 0;

		List<EjecucionPresupuestoDO> ejecucionPresupuestoList = null;
		StringBuffer queryEjecucionPresupuesto = new StringBuffer("select ejecucionPresupuesto from EjecucionPresupuestoDO ejecucionPresupuesto ");
		
			
		if (idTercero != null || idRecurso != null || idProyectoEntidad != null  || tipoComprobante > 0 || (numComprobante != null && !numComprobante.trim().isEmpty()) || (fechaRegIni != null  && fechaRegFin != null ) || (fechaEjecIni != null  && fechaEjecFin != null) || aprobado != null || ejecutado != null) {
			queryEjecucionPresupuesto.append(" where ");
		}

		if (idRecurso != null && queryContinua == 1) {
			queryEjecucionPresupuesto.append(" and ejecucionPresupuesto.recurso.id = :idRecurso ");
		} else if (idRecurso != null && queryContinua == 0 ) {
			queryEjecucionPresupuesto.append(" ejecucionPresupuesto.recurso.id = :idRecurso ");
			queryContinua = 1;
		}

		if (idTercero != null && queryContinua == 1) {
			queryEjecucionPresupuesto.append(" and ejecucionPresupuesto.tercero.id = :idTercero ");
		} else if (idTercero != null && queryContinua == 0 ) {
			queryEjecucionPresupuesto.append(" ejecucionPresupuesto.tercero.id = :idTercero ");
			queryContinua = 1;
		}
		
		if (idProyectoEntidad != null && queryContinua == 1) {
			queryEjecucionPresupuesto.append(" and ejecucionPresupuesto.proyectoEntidad.id = :idProyectoEntidad ");
		} else if (idProyectoEntidad != null && queryContinua == 0 ) {
			queryEjecucionPresupuesto.append(" ejecucionPresupuesto.proyectoEntidad.id = :idProyectoEntidad ");
			queryContinua = 1;
		}
		
		if (tipoComprobante > 0  && queryContinua == 1) {
			queryEjecucionPresupuesto.append(" and ejecucionPresupuesto.tipoComprobante = :tipoComprobante ");	
		} else if (tipoComprobante > 0 && queryContinua == 0) {
			queryEjecucionPresupuesto.append(" ejecucionPresupuesto.tipoComprobante = :tipoComprobante ");	
			queryContinua = 1;
		}
		
		
		if (numComprobante  != null  && !numComprobante.trim().isEmpty()  && queryContinua == 1) {
			queryEjecucionPresupuesto.append(" and lower(ejecucionPresupuesto.numComprobante) like :numComprobante ");	
		} else if (numComprobante != null  && !numComprobante.trim().isEmpty() && queryContinua == 0) {
			queryEjecucionPresupuesto.append(" lower(ejecucionPresupuesto.numComprobante) like :numComprobante ");	
			queryContinua = 1;
		}
		
		
		if (fechaRegIni != null  && fechaRegFin != null  && queryContinua == 1) {
			queryEjecucionPresupuesto.append(" and ejecucionPresupuesto.fechaEjecucion >= :fechaRegIni and ejecucionPresupuesto.fechaEjecucion <= :fechaRegFin");
		} else if (fechaRegIni != null  && fechaRegFin != null && queryContinua == 0) {
			queryEjecucionPresupuesto.append(" ejecucionPresupuesto.fechaEjecucion >= :fechaRegIni and ejecucionPresupuesto.fechaEjecucion <= :fechaRegFin");
			queryContinua = 1;
		}		
		
		
		
		if (fechaEjecIni != null  && fechaEjecFin != null  && queryContinua == 1) {
			queryEjecucionPresupuesto.append(" and ejecucionPresupuesto.fechaPago >= :fechaEjecIni and ejecucionPresupuesto.fechaPago <= :fechaEjecFin");
		} else if (fechaEjecIni != null  && fechaEjecIni != null && queryContinua == 0) {
			queryEjecucionPresupuesto.append(" ejecucionPresupuesto.fechaPago >= :fechaEjecIni and ejecucionPresupuesto.fechaPago <= :fechaEjecFin");
			queryContinua = 1;
		}		
		
		
		if (aprobado != null && queryContinua == 1) {
			queryEjecucionPresupuesto.append(" and ejecucionPresupuesto.aprobado = :aprobado ");	
		} else if (aprobado != null && queryContinua == 0) {
			queryEjecucionPresupuesto.append(" ejecucionPresupuesto.aprobado = :aprobado ");	
			queryContinua = 1;
		}
		
		
		if (ejecutado != null && queryContinua == 1) {
			queryEjecucionPresupuesto.append(" and ejecucionPresupuesto.ejecutado = :ejecutado ");	
		} else if (ejecutado != null && queryContinua == 0) {
			queryEjecucionPresupuesto.append(" ejecucionPresupuesto.ejecutado = :ejecutado ");	
			queryContinua = 1;
		}
	
		
		queryEjecucionPresupuesto.append(" order by ejecucionPresupuesto.fechaEjecucion");

		
		Query selectEjecucionPresupuesto = em.createQuery(queryEjecucionPresupuesto.toString());


		if (idTercero != null) {
			selectEjecucionPresupuesto.setParameter("idTercero", idTercero);
		}


		if (idRecurso != null  ) {
			selectEjecucionPresupuesto.setParameter("idRecurso", idRecurso);	
		}

		
		if (idProyectoEntidad != null  ) {
			selectEjecucionPresupuesto.setParameter("idProyectoEntidad", idProyectoEntidad);	
		}

		if (fechaRegIni != null  && fechaRegFin != null) {
			selectEjecucionPresupuesto.setParameter("fechaRegIni", fechaRegIni);
			selectEjecucionPresupuesto.setParameter("fechaRegFin", fechaRegFin);
		}
		
		
		if (fechaEjecIni != null  && fechaEjecFin != null) {
			selectEjecucionPresupuesto.setParameter("fechaEjecIni", fechaEjecIni);
			selectEjecucionPresupuesto.setParameter("fechaEjecFin", fechaEjecFin);
		}
		
		
		if (tipoComprobante > 0) {
			selectEjecucionPresupuesto.setParameter("tipoComprobante", tipoComprobante);
		}
		
		if (numComprobante  != null  && !numComprobante.trim().isEmpty()) {
			selectEjecucionPresupuesto.setParameter("numComprobante", "%"+numComprobante.toLowerCase()+"%");
		}
		
		if (aprobado != null) {
			selectEjecucionPresupuesto.setParameter("aprobado", aprobado);
		}
		
		if (ejecutado != null) {
			selectEjecucionPresupuesto.setParameter("ejecutado", ejecutado);
		}
		

		
		ejecucionPresupuestoList = selectEjecucionPresupuesto.getResultList();

		if (ejecucionPresupuestoList == null || ejecucionPresupuestoList.size() <= 0) {
			ejecucionPresupuestoList = null;
		}

		
		return ejecucionPresupuestoList;
	}
	

}
