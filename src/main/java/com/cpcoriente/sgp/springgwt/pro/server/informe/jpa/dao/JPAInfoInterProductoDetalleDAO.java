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

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InfoInterProductoDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IInfoInterProductoDetalleDAO;

/**
 * @author CPC-04
 *
 */


@Repository
public class JPAInfoInterProductoDetalleDAO implements IInfoInterProductoDetalleDAO {

	
	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	@Transactional(readOnly = true)
	public InfoInterProductoDetalleDO cargar(Long idInfoInterProductoDetalle) {
		
		InfoInterProductoDetalleDO infoInterProductoDetalle = em.find(InfoInterProductoDetalleDO.class, idInfoInterProductoDetalle);
		return infoInterProductoDetalle;
		
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public InfoInterProductoDetalleDO persistir(InfoInterProductoDetalleDO infoInterProductoDetalle) {
		
		InfoInterProductoDetalleDO infoInterProductoDetalleRes = null;   	
		em.persist(infoInterProductoDetalle);
		infoInterProductoDetalleRes = infoInterProductoDetalle;		
		return infoInterProductoDetalleRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public InfoInterProductoDetalleDO modificar(InfoInterProductoDetalleDO infoInterProductoDetalle) {
		
		InfoInterProductoDetalleDO infoInterProductoDetalleRes = null;
		InfoInterProductoDetalleDO infoInterProductoDetalleDO = null;
		infoInterProductoDetalleDO = infoInterProductoDetalle;
		Set<InfoInterProductoDetalleDO> infoInterProductoDetalleDOSet=new LinkedHashSet<InfoInterProductoDetalleDO>();
		infoInterProductoDetalleDOSet.add(infoInterProductoDetalleDO);
		em.merge(infoInterProductoDetalleDO);
		infoInterProductoDetalleRes = em.merge(infoInterProductoDetalleDO);
		return infoInterProductoDetalleRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idInfoInterProductoDetalle) {
		
		boolean isRemoved = false;
		InfoInterProductoDetalleDO infoInterProductoDetalle = cargar(idInfoInterProductoDetalle);
		em.remove(infoInterProductoDetalle);
		InfoInterProductoDetalleDO infoInterProductoDetalleDO = cargar(idInfoInterProductoDetalle);
		if (infoInterProductoDetalleDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}
}
