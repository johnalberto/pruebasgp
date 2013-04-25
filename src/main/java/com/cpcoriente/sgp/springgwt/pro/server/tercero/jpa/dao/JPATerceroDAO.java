/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.tercero.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.tercero.entity.TerceroDO;
import com.cpcoriente.sgp.springgwt.pro.server.tercero.interfaces.dao.ITerceroDAO;

/**
 * @author CPC-04
 *
 */

@Repository
public class JPATerceroDAO implements ITerceroDAO {
	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Transactional(readOnly = true)
	public TerceroDO cargar(Long idTercero) {
		TerceroDO tercero = em.find(TerceroDO.class, idTercero);
		return tercero;
	}

	
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public TerceroDO persistir(TerceroDO tercero) { 	
		
		TerceroDO terceroRes = null;   	
		em.persist(tercero);
		terceroRes = tercero;		
		return terceroRes;
	
	}

	

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public TerceroDO modificar(TerceroDO tercero) {

		TerceroDO terceroRes = null;
		TerceroDO terceroDO = null;

		terceroDO = tercero;
		terceroRes = em.merge(terceroDO);

		return terceroRes;
	}


	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idTercero) {

		boolean isRemoved = false;
		TerceroDO tercero = cargar(idTercero);
		em.remove(tercero);
		TerceroDO terceroDO = cargar(idTercero);
		if (terceroDO == null) {
			isRemoved = true;
		}
		return isRemoved;

	}



	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<TerceroDO>  seleccionPorNumDoNombre(String numDocNombre) {
		List<TerceroDO> terceroList = null;		
		Query selecDocNombre = em.createNamedQuery("terceroDO.seleccionPorNumDoNombre");
		selecDocNombre.setParameter("numDoc", "%" + numDocNombre.toLowerCase() + "%");
		selecDocNombre.setParameter("nombre", "%" + numDocNombre.toLowerCase() + "%");
		terceroList = selecDocNombre.getResultList();
		return terceroList;

	}

}
