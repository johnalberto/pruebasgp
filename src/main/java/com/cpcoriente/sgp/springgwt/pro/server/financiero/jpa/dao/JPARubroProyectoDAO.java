package com.cpcoriente.sgp.springgwt.pro.server.financiero.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RubroProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IRubroProyectoDAO;


@Repository
public class JPARubroProyectoDAO implements IRubroProyectoDAO {

	private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
	
	@Transactional(readOnly = true)
	public RubroProyectoDO cargar(Long idRubro) {
		
		RubroProyectoDO rubro = em.find(RubroProyectoDO.class,idRubro);
		return rubro;
	}

	@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
	public RubroProyectoDO persistir(RubroProyectoDO rubro) {
		
		RubroProyectoDO rubroRes = null;   	
		em.persist(rubro);
		rubroRes = rubro;		
		return rubroRes;
	}

	@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
	public RubroProyectoDO modificar(RubroProyectoDO rubro) {
		
		RubroProyectoDO rubroRes = null;
		RubroProyectoDO rubroDO = null;

    	rubroDO = rubro;
    	rubroRes = em.merge(rubroDO);
    	return rubroRes;

	}

	@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idRubro) {
		
		boolean isRemoved = false;
		RubroProyectoDO rubro = cargar(idRubro);
		em.remove(rubro);
		RubroProyectoDO rubroDO = cargar(idRubro);
		if (rubroDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

}
