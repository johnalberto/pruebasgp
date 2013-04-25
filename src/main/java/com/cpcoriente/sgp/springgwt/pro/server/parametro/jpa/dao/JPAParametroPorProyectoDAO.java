/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.parametro.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.parametro.entity.ParametroPorProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.server.parametro.interfaces.dao.IParametroPorProyectoDAO;

/**
 * @author CPC-04
 *
 */
public class JPAParametroPorProyectoDAO implements IParametroPorProyectoDAO{

	
	private EntityManager em = null;
	
	
	 @PersistenceContext
	    public void setEntityManager(EntityManager em) {
	        this.em = em;
	    }

	 
	@Transactional(readOnly = true)
	public ParametroPorProyectoDO cargar(String idParametro) {
		ParametroPorProyectoDO parametro = em.find(ParametroPorProyectoDO.class, idParametro);
   	return parametro;	}
	
   @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ParametroPorProyectoDO persistir(ParametroPorProyectoDO parametro) {
	
   	ParametroPorProyectoDO parametroRes = null;   	
   	em.persist(parametro);
   	parametroRes = parametro;		
   	return parametroRes;
   
   }

	
   @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ParametroPorProyectoDO modificar(ParametroPorProyectoDO parametro) {
   	
   	ParametroPorProyectoDO parametroRes = null;
   	ParametroPorProyectoDO parametroDO = null;

   	parametroDO = parametro;
   	parametroRes = em.merge(parametroDO);
   	return parametroRes;
	}
	
   @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(String idParametro) {
		
   	boolean isRemoved = false;
   	ParametroPorProyectoDO parametro = cargar(idParametro);
   	em.remove(parametro);
   	ParametroPorProyectoDO parametroDO = cargar(idParametro);
   	if (parametroDO == null) {
   		isRemoved = true;
   	}
   	return isRemoved;
   	
	}
	
   @Transactional(readOnly = true)
   @SuppressWarnings("unchecked")
	public List<ParametroPorProyectoDO> listarTodo() {
   	
   	List<ParametroPorProyectoDO> accionList = null;
   	Query listarTodo = em.createNamedQuery("parametroProyDO.listarTodo");
   	accionList = listarTodo.getResultList();
   	return accionList;

	}


   @Transactional(readOnly = true)
   @SuppressWarnings("unchecked")
	public List<ParametroPorProyectoDO> buscarPorDescripcion(String descripcion) {
	
		List<ParametroPorProyectoDO> accionList = null;
   	Query selecPorNom = em.createNamedQuery("parametroProyDO.seleccionPorNombre");
   	selecPorNom.setParameter("descripcion", "%"+descripcion.toLowerCase()+"%");
   	accionList = selecPorNom.getResultList();
   	return accionList;
	
	}
	
	
	
}
