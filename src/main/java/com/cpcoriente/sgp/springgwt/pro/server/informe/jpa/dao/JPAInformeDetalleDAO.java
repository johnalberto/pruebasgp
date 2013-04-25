/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.informe.jpa.dao;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InformeDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IInformeDetalleDAO;


/**
 * @author CPC-04
 *
 */

@Repository
public class JPAInformeDetalleDAO implements IInformeDetalleDAO {

	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	@Transactional(readOnly = true)
	public InformeDetalleDO cargar(Long idInformeDetalle) {
		
		InformeDetalleDO informeDetalle = em.find(InformeDetalleDO.class, idInformeDetalle);
		return informeDetalle;
		
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public List<InformeDetalleDO> persistir(Set<InformeDetalleDO> informeDetalleSet) {
			
		
       List<InformeDetalleDO> informeDetalleListRes = new LinkedList<InformeDetalleDO>();   	
		
		for (InformeDetalleDO idInformeDetalle: informeDetalleSet) {
			InformeDetalleDO informeDetalleRes = null;
			em.persist(idInformeDetalle);
			informeDetalleRes = idInformeDetalle;	
			
			if (informeDetalleRes != null){
				informeDetalleListRes.add(informeDetalleRes);
			}
		}
			
		return informeDetalleListRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public InformeDetalleDO modificar(InformeDetalleDO informeDetalle) {
		
		InformeDetalleDO informeDetalleRes = null;
		InformeDetalleDO informeDetalleDO = null;
		informeDetalleDO = informeDetalle;
		Set<InformeDetalleDO> informeDetalleDOSet=new LinkedHashSet<InformeDetalleDO>();
		informeDetalleDOSet.add(informeDetalleDO);
		em.merge(informeDetalleDO);
		informeDetalleRes = em.merge(informeDetalleDO);
		return informeDetalleRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idInformeDetalle) {
		
		boolean isRemoved = false;
		InformeDetalleDO informeDetalle = cargar(idInformeDetalle);
		em.remove(informeDetalle);
		InformeDetalleDO informeDetalleDO = cargar(idInformeDetalle);
		if (informeDetalleDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}
	
	
}
