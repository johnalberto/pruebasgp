/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.personal.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.ClausulaTipoContratoDO;
import com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao.IClausulaTipoContratoDAO;

/**
 * @author CPC-04
 *
 */


@Repository
public class JPAClausulaTipoContratoDAO implements IClausulaTipoContratoDAO {

	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Transactional(readOnly = true)
	public ClausulaTipoContratoDO cargar(Long idClausulaTipoContrato) {
		ClausulaTipoContratoDO clausulaTipoContrato = em.find(ClausulaTipoContratoDO.class, idClausulaTipoContrato);
		return clausulaTipoContrato;
	}

	
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ClausulaTipoContratoDO persistir(ClausulaTipoContratoDO clausulaTipoContrato) { 	
		
		ClausulaTipoContratoDO clausulaTipoContratoRes = null;   	
		em.persist(clausulaTipoContrato);
		clausulaTipoContratoRes = clausulaTipoContrato;		
		return clausulaTipoContratoRes;
	
	}

	

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ClausulaTipoContratoDO modificar(ClausulaTipoContratoDO clausulaTipoContrato) {

		ClausulaTipoContratoDO clausulaTipoContratoRes = null;
		ClausulaTipoContratoDO clausulaTipoContratoDO = null;

		clausulaTipoContratoDO = clausulaTipoContrato;
		clausulaTipoContratoRes = em.merge(clausulaTipoContratoDO);

		return clausulaTipoContratoRes;
	}


	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idClausulaTipoContrato) {

		boolean isRemoved = false;
		ClausulaTipoContratoDO clausulaTipoContrato = cargar(idClausulaTipoContrato);
		em.remove(clausulaTipoContrato);
		ClausulaTipoContratoDO clausulaTipoContratoDO = cargar(idClausulaTipoContrato);
		if (clausulaTipoContratoDO == null) {
			isRemoved = true;
		}
		return isRemoved;

	}



	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ClausulaTipoContratoDO> listarPorEntidad(Long idEntidad) {
		List<ClausulaTipoContratoDO> clausulaTipoContratoList = null;		
		Query selecDocumento = em.createNamedQuery("clausulaTipoContratoDO.seleccionPorEntidad");
		selecDocumento.setParameter("idEntidad", idEntidad);
		clausulaTipoContratoList = selecDocumento.getResultList();
		return clausulaTipoContratoList;

	}

}
