/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.contabilidad.jpa.dao;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.MovimientoContableDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.interfaces.dao.IMovimientoContableDetalleDAO;


/**
 * @author CPC-04
 *
 */

@Repository
public class JPAMovimientoContableDetalleDAO implements IMovimientoContableDetalleDAO {

private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

	
	@Transactional(readOnly = true)
	public MovimientoContableDetalleDO cargar(Long idMovimientoContableDetalle) {
		MovimientoContableDetalleDO movimientoContableDet = em.find(MovimientoContableDetalleDO.class, idMovimientoContableDetalle);
		return movimientoContableDet;
		
	}

	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean persistir(Set<MovimientoContableDetalleDO> movimientoContableDetSet) {
		for(MovimientoContableDetalleDO fd : movimientoContableDetSet){
			em.persist(fd);
		}  	

		return true;
	}
}