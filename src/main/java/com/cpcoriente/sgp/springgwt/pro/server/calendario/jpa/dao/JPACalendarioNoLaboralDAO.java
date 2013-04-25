/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.calendario.jpa.dao;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.calendario.entity.CalendarioNoLaboralDO;
import com.cpcoriente.sgp.springgwt.pro.server.calendario.interfaces.dao.ICalendarioNoLaboralDAO;

/**
 * @author CPC-04
 *
 */


@Repository
public class JPACalendarioNoLaboralDAO implements ICalendarioNoLaboralDAO{

	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	@Transactional(readOnly = true)
	public CalendarioNoLaboralDO cargar(Long idCalendarioNoLaboral) {
		
		CalendarioNoLaboralDO calendarioNoLaboral = em.find(CalendarioNoLaboralDO.class, idCalendarioNoLaboral);
		return calendarioNoLaboral;
		
	}

	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public List<CalendarioNoLaboralDO> persistir(Set<CalendarioNoLaboralDO> calendarioNoLaboralSet) {
		
		List<CalendarioNoLaboralDO> calendarioNoLaboralListRes = new LinkedList<CalendarioNoLaboralDO>();   	
		
		for (CalendarioNoLaboralDO idCalendarioNoLaboral: calendarioNoLaboralSet) {
			CalendarioNoLaboralDO calendarioNoLaboralRes = null;
			em.persist(idCalendarioNoLaboral);
			calendarioNoLaboralRes = idCalendarioNoLaboral;	
			
			if (calendarioNoLaboralRes != null){
				calendarioNoLaboralListRes.add(calendarioNoLaboralRes);
			}
		}
			
		return calendarioNoLaboralListRes;

	}

	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public CalendarioNoLaboralDO modificar(CalendarioNoLaboralDO calendarioNoLaboral) {
		
		CalendarioNoLaboralDO calendarioNoLaboralRes = null;
		CalendarioNoLaboralDO calendarioNoLaboralDO = null;
		calendarioNoLaboralDO = calendarioNoLaboral;
		Set<CalendarioNoLaboralDO> calendarioNoLaboralDOSet=new LinkedHashSet<CalendarioNoLaboralDO>();
		calendarioNoLaboralDOSet.add(calendarioNoLaboralDO);
		em.merge(calendarioNoLaboralDO);
		calendarioNoLaboralRes = em.merge(calendarioNoLaboralDO);
		return calendarioNoLaboralRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idCalendarioNoLaboral) {
		
		boolean isRemoved = false;
		CalendarioNoLaboralDO calendarioNoLaboral = cargar(idCalendarioNoLaboral);
		em.remove(calendarioNoLaboral);
		CalendarioNoLaboralDO calendarioNoLaboralDO = cargar(idCalendarioNoLaboral);
		if (calendarioNoLaboralDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<CalendarioNoLaboralDO> listarTodoPorProyecto(Long idProyecto) {
		
		List<CalendarioNoLaboralDO> calendarioNoLaboralList = null;
		Query listarTodo = em.createNamedQuery("calendarioNoLaboralDO.listarTodoPorProyecto");
		listarTodo.setParameter("idProyecto", idProyecto);
		calendarioNoLaboralList = listarTodo.getResultList();
		return calendarioNoLaboralList;	
		
	}
	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<CalendarioNoLaboralDO> seleccionPorRangofechas(Long idProyecto, Date fechaInicio, Date fechaFin) {
		
		List<CalendarioNoLaboralDO> calendarioNoLaboralList = null;
		Query listarCalendario = em.createNamedQuery("calendarioNoLaboralDO.seleccionPorRangoFechas");
		listarCalendario.setParameter("idProyecto", idProyecto);
		listarCalendario.setParameter("fechaInicio", fechaInicio);
		listarCalendario.setParameter("fechaFin", fechaFin);
		calendarioNoLaboralList = listarCalendario.getResultList();
		return calendarioNoLaboralList;	
		
	}


	
}
