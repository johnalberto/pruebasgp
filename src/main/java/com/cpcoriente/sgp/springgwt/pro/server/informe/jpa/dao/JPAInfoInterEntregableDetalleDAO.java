/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.informe.jpa.dao;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InfoInterEntregableDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IInfoInterEntregableDetalleDAO;


/**
 * @author CPC-04
 *
 */


@Repository
public class JPAInfoInterEntregableDetalleDAO implements IInfoInterEntregableDetalleDAO {

	
	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	@Transactional(readOnly = true)
	public InfoInterEntregableDetalleDO cargar(Long idInfoInterEntregableDetalle) {
		
		InfoInterEntregableDetalleDO infoInterEntregableDetalle = em.find(InfoInterEntregableDetalleDO.class, idInfoInterEntregableDetalle);
		return infoInterEntregableDetalle;
		
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public InfoInterEntregableDetalleDO persistir(InfoInterEntregableDetalleDO infoInterEntregableDetalle) {
		
		InfoInterEntregableDetalleDO infoInterEntregableDetalleRes = null;   	
		em.persist(infoInterEntregableDetalle);
		infoInterEntregableDetalleRes = infoInterEntregableDetalle;		
		return infoInterEntregableDetalleRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public InfoInterEntregableDetalleDO modificar(InfoInterEntregableDetalleDO infoInterEntregableDetalle) {
		
		InfoInterEntregableDetalleDO infoInterEntregableDetalleRes = null;
		InfoInterEntregableDetalleDO infoInterEntregableDetalleDO = null;
		infoInterEntregableDetalleDO = infoInterEntregableDetalle;
		Set<InfoInterEntregableDetalleDO> infoInterEntregableDetalleDOSet=new LinkedHashSet<InfoInterEntregableDetalleDO>();
		infoInterEntregableDetalleDOSet.add(infoInterEntregableDetalleDO);
		em.merge(infoInterEntregableDetalleDO);
		infoInterEntregableDetalleRes = em.merge(infoInterEntregableDetalleDO);
		return infoInterEntregableDetalleRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idInfoInterEntregableDetalle) {
		
		boolean isRemoved = false;
		InfoInterEntregableDetalleDO infoInterEntregableDetalle = cargar(idInfoInterEntregableDetalle);
		em.remove(infoInterEntregableDetalle);
		InfoInterEntregableDetalleDO infoInterEntregableDetalleDO = cargar(idInfoInterEntregableDetalle);
		if (infoInterEntregableDetalleDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}
}
