package com.cpcoriente.sgp.springgwt.pro.server.financiero.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RubroDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IRubroDAO;

@Repository
public class JPARubroDAO implements IRubroDAO {

	private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
	
	@Transactional(readOnly = true)
	public RubroDO cargar(Long idRubro) {
		
		RubroDO rubro = em.find(RubroDO.class,idRubro);
		return rubro;
	}

	@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
	public RubroDO persistir(RubroDO rubro) {
		
		RubroDO rubroRes = null;   	
		em.persist(rubro);
		rubroRes = rubro;		
		return rubroRes;
	}

	@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
	public RubroDO modificar(RubroDO rubro) {
		
		RubroDO rubroRes = null;
		RubroDO rubroDO = null;

    	rubroDO = rubro;
    	rubroRes = em.merge(rubroDO);
    	return rubroRes;
	}

	@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idRubro) {
		
		boolean isRemoved = false;
		RubroDO rubro = cargar(idRubro);
		em.remove(rubro);
		RubroDO rubroDO = cargar(idRubro);
		if (rubroDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<RubroDO> listarTodo() {
	
		List<RubroDO> rubroList = null;
    	Query listarTodo = em.createNamedQuery("rubroDO.listarTodo");
    	rubroList = listarTodo.getResultList();
		return rubroList;
	
	}
	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<RubroDO> ListarPorEntidad(Long idEmpresa) {
		
		List<RubroDO> rubroList = null;
    	Query selecPorCiu = em.createNamedQuery("entidadDO.seleccionPorCiudad");
    	selecPorCiu.setParameter("idEmpresa", idEmpresa);
    	rubroList = selecPorCiu.getResultList();
		return rubroList;
	}

}
