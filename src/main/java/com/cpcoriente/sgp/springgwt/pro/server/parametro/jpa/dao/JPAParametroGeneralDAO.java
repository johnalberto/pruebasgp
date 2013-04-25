package com.cpcoriente.sgp.springgwt.pro.server.parametro.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.parametro.entity.ParametroGeneralDO;
import com.cpcoriente.sgp.springgwt.pro.server.parametro.interfaces.dao.IParametroGeneralDAO;


@Repository
public class JPAParametroGeneralDAO implements IParametroGeneralDAO {

	private EntityManager em = null;
	
	
	 @PersistenceContext
	    public void setEntityManager(EntityManager em) {
	        this.em = em;
	    }

	 
	@Transactional(readOnly = true)
	public ParametroGeneralDO cargar(String idParametro) {
		ParametroGeneralDO parametro = em.find(ParametroGeneralDO.class, idParametro);
    	return parametro;	}
	
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ParametroGeneralDO persistir(ParametroGeneralDO parametro) {
	
    	ParametroGeneralDO parametroRes = null;   	
    	em.persist(parametro);
    	parametroRes = parametro;		
    	return parametroRes;
    
    }

	
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ParametroGeneralDO modificar(ParametroGeneralDO parametro) {
    	
    	ParametroGeneralDO parametroRes = null;
    	ParametroGeneralDO parametroDO = null;

    	parametroDO = parametro;
    	parametroRes = em.merge(parametroDO);
    	return parametroRes;
	}
	
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(String idParametro) {
		
    	boolean isRemoved = false;
    	ParametroGeneralDO parametro = cargar(idParametro);
    	em.remove(parametro);
    	ParametroGeneralDO parametroDO = cargar(idParametro);
    	if (parametroDO == null) {
    		isRemoved = true;
    	}
    	return isRemoved;
    	
	}
	
    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	public List<ParametroGeneralDO> listarTodo() {
    	
    	List<ParametroGeneralDO> accionList = null;
    	Query listarTodo = em.createNamedQuery("parametroDO.listarTodo");
    	accionList = listarTodo.getResultList();
    	return accionList;

	}


    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	public List<ParametroGeneralDO> buscarPorDescripcion(String descripcion) {
	
		List<ParametroGeneralDO> accionList = null;
    	Query selecPorNom = em.createNamedQuery("parametroDO.seleccionPorNombre");
    	selecPorNom.setParameter("descripcion", "%"+descripcion.toLowerCase()+"%");
    	accionList = selecPorNom.getResultList();
    	return accionList;
	
	}

}
