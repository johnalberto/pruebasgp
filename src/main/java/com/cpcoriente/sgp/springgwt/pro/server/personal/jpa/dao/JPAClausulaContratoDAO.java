/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.personal.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.ClausulaContratoDO;
import com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao.IClausulaContratoDAO;

/**
 * @author CPC-04
 *
 */


@Repository
public class JPAClausulaContratoDAO implements IClausulaContratoDAO{

	
	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Transactional(readOnly = true)
	public ClausulaContratoDO cargar(Long idClausulaContrato) {
		ClausulaContratoDO clausulaContrato = em.find(ClausulaContratoDO.class, idClausulaContrato);
		return clausulaContrato;
	}

	
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ClausulaContratoDO persistir(ClausulaContratoDO clausulaContrato) { 	
		
		ClausulaContratoDO clausulaContratoRes = null;   	
		em.persist(clausulaContrato);
		clausulaContratoRes = clausulaContrato;		
		return clausulaContratoRes;
	
	}

	

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ClausulaContratoDO modificar(ClausulaContratoDO clausulaContrato) {

		ClausulaContratoDO clausulaContratoRes = null;
		ClausulaContratoDO clausulaContratoDO = null;

		clausulaContratoDO = clausulaContrato;
		clausulaContratoRes = em.merge(clausulaContratoDO);

		return clausulaContratoRes;
	}


	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idClausulaContrato) {

		boolean isRemoved = false;
		ClausulaContratoDO clausulaContrato = cargar(idClausulaContrato);
		em.remove(clausulaContrato);
		ClausulaContratoDO clausulaContratoDO = cargar(idClausulaContrato);
		if (clausulaContratoDO == null) {
			isRemoved = true;
		}
		return isRemoved;

	}
}
