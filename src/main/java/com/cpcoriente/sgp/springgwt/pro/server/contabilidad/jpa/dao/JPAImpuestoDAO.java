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

import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.ImpuestoDO;
import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.interfaces.dao.IImpuestoDAO;

/**
 * @author CPC-04
 *
 */

@Repository
public class JPAImpuestoDAO implements IImpuestoDAO {
	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	@Transactional(readOnly = true)
	public ImpuestoDO cargar(Long idImpuesto) {
		
		ImpuestoDO impuesto = em.find(ImpuestoDO.class, idImpuesto);
		return impuesto;
		
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ImpuestoDO persistir(ImpuestoDO impuesto) {
		
		ImpuestoDO impuestoRes = null;   	
		em.persist(impuesto);
		impuestoRes = impuesto;		
		return impuestoRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ImpuestoDO modificar(ImpuestoDO impuesto) {
		
		ImpuestoDO impuestoRes = null;
		ImpuestoDO impuestoDO = null;
		impuestoDO = impuesto;
		Set<ImpuestoDO> impuestoDOSet=new LinkedHashSet<ImpuestoDO>();
		impuestoDOSet.add(impuestoDO);
		em.merge(impuestoDO);
		impuestoRes = em.merge(impuestoDO);
		return impuestoRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idImpuesto) {
		
		boolean isRemoved = false;
		ImpuestoDO impuesto = cargar(idImpuesto);
		em.remove(impuesto);
		ImpuestoDO impuestoDO = cargar(idImpuesto);
		if (impuestoDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ImpuestoDO> listarTodo(Long idEmpresa) {
		
		List<ImpuestoDO> impuestoList = null;
		Query listarTodo = em.createNamedQuery("impuestoDO.listarTodo");
		listarTodo.setParameter("idEmpresa", idEmpresa);
		impuestoList = listarTodo.getResultList();
		return impuestoList;	
		
	}

	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ImpuestoDO> seleccionPorNombre(Long idEmpresa,
			String parteNombre) {

		List<ImpuestoDO> impuestoList = null;
		Query listarPorNombre = em.createNamedQuery("impuestoDO.seleccionPorNombre");
		listarPorNombre.setParameter("idEmpresa", idEmpresa);
		listarPorNombre.setParameter("parteNombre", "%" + parteNombre.toLowerCase()+"%");
		impuestoList = listarPorNombre.getResultList();
		return impuestoList;	
		
	}

}
