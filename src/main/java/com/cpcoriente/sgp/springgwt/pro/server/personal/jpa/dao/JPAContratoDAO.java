/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.personal.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.ContratoDO;
import com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao.IContratoDAO;

/**
 * @author CPC-04
 *
 */


@Repository
public class JPAContratoDAO implements IContratoDAO {

	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Transactional(readOnly = true)
	public ContratoDO cargar(Long idContrato) {
		ContratoDO contrato = em.find(ContratoDO.class, idContrato);
		return contrato;
	}

	
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ContratoDO persistir(ContratoDO contrato) { 	
		
		ContratoDO contratoRes = null;   	
		em.persist(contrato);
		contratoRes = contrato;		
		return contratoRes;
	
	}

	

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ContratoDO modificar(ContratoDO contrato) {

		ContratoDO contratoRes = null;
		ContratoDO contratoDO = null;

		contratoDO = contrato;
		contratoRes = em.merge(contratoDO);

		return contratoRes;
	}


	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idContrato) {

		boolean isRemoved = false;
		ContratoDO contrato = cargar(idContrato);
		em.remove(contrato);
		ContratoDO contratoDO = cargar(idContrato);
		if (contratoDO == null) {
			isRemoved = true;
		}
		return isRemoved;

	}
	
	
}
