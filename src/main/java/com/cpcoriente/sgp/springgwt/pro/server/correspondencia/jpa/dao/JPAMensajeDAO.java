package com.cpcoriente.sgp.springgwt.pro.server.correspondencia.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.entity.MensajeDO;
import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.interfaces.dao.IMensajeDAO;

@Repository
public class JPAMensajeDAO implements IMensajeDAO {

	private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
	
    @Transactional(readOnly = true)
	public MensajeDO cargar(Long idMensaje) {
    	
    	MensajeDO mensaje = em.find(MensajeDO.class, idMensaje);
		return mensaje;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public MensajeDO persistir(MensajeDO mensaje) {
    	
    	MensajeDO mensajeRes = null;   	
    	em.persist(mensaje);
    	mensajeRes = mensaje;		
    	return mensajeRes;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public MensajeDO modificar(MensajeDO mensaje) {
    	
    	MensajeDO mensajeRes = null;
    	MensajeDO mensajeDO = null;

    	mensajeDO = mensaje;
    	mensajeRes = em.merge(mensajeDO);
    	return mensajeRes;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idMensaje) {
    	
    	boolean isRemoved = false;
    	MensajeDO mensaje = cargar(idMensaje);
		em.remove(mensaje);
		MensajeDO mensajeDO = cargar(idMensaje);
		if (mensajeDO == null) {
			isRemoved = true;
		}
		return isRemoved;	
		
    }

    @Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<MensajeDO> listarTodo(Long idProyecto) {
    	
    	List<MensajeDO> mensajeList = null;
		Query selecMensaje = em.createNamedQuery("mensajeDO.listarTodo");
		selecMensaje.setParameter("idProyecto", idProyecto);
		mensajeList = selecMensaje.getResultList();
		
		return mensajeList;	
		
    }
    
    
    @Transactional(readOnly = true)
   	@SuppressWarnings("unchecked")
	public List<MensajeDO> seleccionPorPersonaEnvia(Long idPersona) {
		
		List<MensajeDO> mensajeList = null;
		Query selecMensaje = em.createNamedQuery("mensajeDO.seleccionPorPersonaEnvia");
		selecMensaje.setParameter("idUsuario", idPersona);
		mensajeList = selecMensaje.getResultList();
		
		return mensajeList;
	}

    @Transactional(readOnly = true)
   	@SuppressWarnings("unchecked")
	public List<MensajeDO> seleccionPorPersonaEnviaProyecto(Long idPersona,
			Long idProyecto) {
    	
    	List<MensajeDO> mensajeList = null;
		Query selecMensaje = em.createNamedQuery("mensajeDO.seleccionPorPersonaEnviaProyecto");
		selecMensaje.setParameter("idUsuario", idPersona);
		selecMensaje.setParameter("idProyecto", idProyecto);

		mensajeList = selecMensaje.getResultList();
		
		return mensajeList;
	}

    @Transactional(readOnly = true)
   	@SuppressWarnings("unchecked")
	public List<MensajeDO> seleccionPorPersonaRespuesta(Long idPersona) {
		
		List<MensajeDO> mensajeList = null;
		Query selecMensaje = em.createNamedQuery("mensajeDO.seleccionPorPersonaRespuesta");
		selecMensaje.setParameter("idUsuario", idPersona);
		mensajeList = selecMensaje.getResultList();
		
		return mensajeList;
    }
    
    @Transactional(readOnly = true)
   	@SuppressWarnings("unchecked")
	public List<MensajeDO> seleccionPorPersonaRespuestaProyecto(Long idPersona,
			Long idProyecto) {
    	
    	List<MensajeDO> mensajeList = null;
		Query selecMensaje = em.createNamedQuery("mensajeDO.seleccionPorPersonaRespuestaProyecto");
		selecMensaje.setParameter("idUsuario", idPersona);
		selecMensaje.setParameter("idProyecto", idProyecto);

		mensajeList = selecMensaje.getResultList();
		
		return mensajeList;
	}

   

}
