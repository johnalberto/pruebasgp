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

import com.cpcoriente.sgp.springgwt.pro.server.calendario.entity.DiaNoLaboralDO;
import com.cpcoriente.sgp.springgwt.pro.server.calendario.interfaces.dao.IDiaNoLaboralDAO;

/**
 * @author CPC-04
 *
 */


@Repository
public class JPADiaNoLaboralDAO implements IDiaNoLaboralDAO{
	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	@Transactional(readOnly = true)
	public DiaNoLaboralDO cargar(Long idDiaNoLaboral) {
		
		DiaNoLaboralDO diaNoLaboral = em.find(DiaNoLaboralDO.class, idDiaNoLaboral);
		return diaNoLaboral;
		
	}

	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public List<DiaNoLaboralDO> persistir(Set<DiaNoLaboralDO> diaNoLaboralSet) {
		
		List<DiaNoLaboralDO> diaNoLaboralListRes = new LinkedList<DiaNoLaboralDO>();   	
		
		for (DiaNoLaboralDO idDiaNoLaboral: diaNoLaboralSet) {
			DiaNoLaboralDO diaNoLaboralRes = null;
			em.persist(idDiaNoLaboral);
			diaNoLaboralRes = idDiaNoLaboral;	
			
			if (diaNoLaboralRes != null){
				diaNoLaboralListRes.add(diaNoLaboralRes);
			}
		}
			
		return diaNoLaboralListRes;


	}

	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public DiaNoLaboralDO modificar(DiaNoLaboralDO diaNoLaboral) {
		
		DiaNoLaboralDO diaNoLaboralRes = null;
		DiaNoLaboralDO diaNoLaboralDO = null;
		diaNoLaboralDO = diaNoLaboral;
		Set<DiaNoLaboralDO> diaNoLaboralDOSet=new LinkedHashSet<DiaNoLaboralDO>();
		diaNoLaboralDOSet.add(diaNoLaboralDO);
		em.merge(diaNoLaboralDO);
		diaNoLaboralRes = em.merge(diaNoLaboralDO);
		return diaNoLaboralRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idDiaNoLaboral) {
		
		boolean isRemoved = false;
		DiaNoLaboralDO diaNoLaboral = cargar(idDiaNoLaboral);
		em.remove(diaNoLaboral);
		DiaNoLaboralDO diaNoLaboralDO = cargar(idDiaNoLaboral);
		if (diaNoLaboralDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<DiaNoLaboralDO> listarTodoPorEmpresa(Long idEmpresa) {
		
		List<DiaNoLaboralDO> diaNoLaboralList = null;
		Query listarTodo = em.createNamedQuery("diaNoLaboralDO.listarTodoPorEmpresa");
		listarTodo.setParameter("idEmpresa", idEmpresa);
		diaNoLaboralList = listarTodo.getResultList();
		return diaNoLaboralList;	
		
	}
	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<DiaNoLaboralDO> seleccionPorRangofechas(Long idEmpresa, Date fechaInicio, Date fechaFin) {
		
		List<DiaNoLaboralDO> diaNoLaboralList = null;
		Query listarDia = em.createNamedQuery("diaNoLaboralDO.seleccionPorRangoFechas");
		listarDia.setParameter("idEmpresa", idEmpresa);
		listarDia.setParameter("fechaInicio", fechaInicio);
		listarDia.setParameter("fechaFin", fechaFin);
		diaNoLaboralList = listarDia.getResultList();
		return diaNoLaboralList;	
		
	}
	

}
