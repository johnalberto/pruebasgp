/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.tercero.jpa.dao;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.tercero.entity.TerceroPorTipoDO;
import com.cpcoriente.sgp.springgwt.pro.server.tercero.interfaces.dao.ITerceroPorTipoDAO;

/**
 * @author CPC-04
 *
 */


@Repository
public class JPATerceroPorTipoDAO implements ITerceroPorTipoDAO {
	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Transactional(readOnly = true)
	public TerceroPorTipoDO cargar(Long idTerceroPorTipo) {
		TerceroPorTipoDO terceroPorTipo = em.find(TerceroPorTipoDO.class, idTerceroPorTipo);
		return terceroPorTipo;
	}

	
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean persistir(Set<TerceroPorTipoDO> terceroPorTipoSet) {
		for(TerceroPorTipoDO tt : terceroPorTipoSet){
			em.persist(tt);
		}  	

		return true;
	}
	


	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idTerceroPorTipo) {

		boolean isRemoved = false;
		TerceroPorTipoDO terceroPorTipo = cargar(idTerceroPorTipo);
		em.remove(terceroPorTipo);
		TerceroPorTipoDO terceroPorTipoDO = cargar(idTerceroPorTipo);
		if (terceroPorTipoDO == null) {
			isRemoved = true;
		}
		return isRemoved;

	}


}
