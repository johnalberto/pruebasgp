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

import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.CargoDO;
import com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao.ICargoDAO;

/**
 * @author CPC-04
 *
 */


@Repository
public class JPACargoDAO implements ICargoDAO{
	
	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Transactional(readOnly = true)
	public CargoDO cargar(Long idCargo) {
		CargoDO cargo = em.find(CargoDO.class, idCargo);
		return cargo;
	}

	
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public CargoDO persistir(CargoDO cargo) { 	
		
		CargoDO cargoRes = null;   	
		em.persist(cargo);
		cargoRes = cargo;		
		return cargoRes;
	
	}

	

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public CargoDO modificar(CargoDO cargo) {

		CargoDO cargoRes = null;
		CargoDO cargoDO = null;

		cargoDO = cargo;
		cargoRes = em.merge(cargoDO);

		return cargoRes;
	}


	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idCargo) {

		boolean isRemoved = false;
		CargoDO cargo = cargar(idCargo);
		em.remove(cargo);
		CargoDO cargoDO = cargar(idCargo);
		if (cargoDO == null) {
			isRemoved = true;
		}
		return isRemoved;

	}



	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<CargoDO> listarPorProyectoEntidad(Long idProyectoEntidad) {
		List<CargoDO> cargoList = null;		
		Query selecDocumento = em.createNamedQuery("cargoDO.seleccionPorProyectoEntidad");
		selecDocumento.setParameter("idProyectoEntidad", idProyectoEntidad);
		cargoList = selecDocumento.getResultList();
		return cargoList;

	}

}
