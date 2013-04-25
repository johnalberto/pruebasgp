package com.cpcoriente.sgp.springgwt.pro.server.financiero.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RecursoDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IRecursoDAO;

@Repository
public class JPARecursoDAO implements IRecursoDAO {

	private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
	
	@Transactional(readOnly = true)
	public RecursoDO cargar(Long idRecurso) {
		
		RecursoDO recurso = em.find(RecursoDO.class,idRecurso);
		return recurso;	
		
	}

	@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
	public RecursoDO persistir(RecursoDO recurso) {
	
		RecursoDO rubroRes = null;   	
		em.persist(recurso);
		rubroRes = recurso;		
		return rubroRes;

	}

	@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
	public RecursoDO modificar(RecursoDO recurso) {
		
		RecursoDO rubroRes = null;
		RecursoDO rubroDO = null;

    	rubroDO = recurso;
    	rubroRes = em.merge(rubroDO);
    	return rubroRes;

	}

	@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idRecurso) {
		boolean isRemoved = false;
		RecursoDO rubro = cargar(idRecurso);
		em.remove(rubro);
		RecursoDO rubroDO = cargar(idRecurso);
		if (rubroDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

	@Transactional(readOnly = true)
   	@SuppressWarnings("unchecked")
	public List<RecursoDO> ListarPorProyecto(Long idProyecto) {
		
		List<RecursoDO> mensajeList = null;
		Query selecMensaje = em.createNamedQuery("recursoDO.seleccionPorProyecto");
		selecMensaje.setParameter("idProyecto", idProyecto);
		mensajeList = selecMensaje.getResultList();
		
		return mensajeList;	
		
	}

	@Transactional(readOnly = true)
   	@SuppressWarnings("unchecked")
	public List<RecursoDO> ListarPorActividad(Long idActividad) {
		
		List<RecursoDO> mensajeList = null;
		Query selecMensaje = em.createNamedQuery("recursoDO.seleccionPorActividad");
		selecMensaje.setParameter("idActividad", idActividad);
		mensajeList = selecMensaje.getResultList();
		
		return mensajeList;	

	}

	@Transactional(readOnly = true)
   	@SuppressWarnings("unchecked")
	public List<RecursoDO> ListarPorRubro(Long idRubro) {
		
		List<RecursoDO> mensajeList = null;
		Query selecMensaje = em.createNamedQuery("recursoDO.seleccionPorProyectoRubro");
		selecMensaje.setParameter("idRubroPro", idRubro);
		mensajeList = selecMensaje.getResultList();
		
		return mensajeList;	

	}

	@Transactional(readOnly = true)
   	@SuppressWarnings("unchecked")
	public List<RecursoDO> ListarPorProyectoDescripcion(Long idProyecto,
			String descripcion) {
	
		List<RecursoDO> mensajeList = null;
		Query selecMensaje = em.createNamedQuery("recursoDO.seleccionPorProyectoDescripcion");
		selecMensaje.setParameter("idProyecto", idProyecto);
		selecMensaje.setParameter("parteDes", idProyecto);

		mensajeList = selecMensaje.getResultList();
		
		return mensajeList;
	
	}

	@Transactional(readOnly = true)
   	@SuppressWarnings("unchecked")
	public List<RecursoDO> seleccionGeneral(Long idRubro, Long idActividad,
			String descripcion, Long idProyecto) {
		
		List<RecursoDO> logList = null;
		StringBuffer queryAmp = new StringBuffer("select rec from RecursoDO rec ");
		
		if (idRubro != null || idActividad != null ||  descripcion.trim().isEmpty() || idProyecto!=null ) {
			
			queryAmp.append(" where rec.rubroPro.proyecto.id = :idProyecto ");
		}
		
		if(idRubro != null && idRubro.longValue()>0 ){
			queryAmp.append(" and rec.rubro.id = : idRubro ");
		}
		
		if (idActividad != null && idActividad.longValue()>0 ){
			queryAmp.append(" and rec.actividad.id =: idActividad ");
		}
		
		if (descripcion != null  &&   !descripcion.trim().isEmpty() && !descripcion.contains(" ") ) {
			
			queryAmp.append(" and lower(rec.descripcion)  like :lower(descripcion) ");
		}
		
				
		queryAmp.append(" order by rec.descripcion");
		
		Query selectLog = em.createNativeQuery(queryAmp.toString());
		selectLog.setParameter("idProyecto", idProyecto);
		
		
		if(idRubro != null && idRubro.longValue()>0 ){
			selectLog.setParameter("idRubro", idRubro);
		}
		
		if(idActividad != null && idActividad.longValue()>0){
			selectLog.setParameter("idActividad", idActividad);
		}
		
		if (descripcion != null  &&   !descripcion.trim().isEmpty() && !descripcion.contains(" ")  ) {
			selectLog.setParameter("descripcion", descripcion);

		}
		
	
		logList = selectLog.getResultList();
		return logList;	
		
	
		
	}

}
