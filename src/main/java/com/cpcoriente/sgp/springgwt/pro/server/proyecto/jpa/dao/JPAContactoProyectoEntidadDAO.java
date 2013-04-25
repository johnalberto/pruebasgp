package com.cpcoriente.sgp.springgwt.pro.server.proyecto.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ContactoProyectoEntidadDO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.DocProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IContactoProyectoEntidadDAO;

@Repository
public class JPAContactoProyectoEntidadDAO implements
		IContactoProyectoEntidadDAO {

	private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = true)
	public ContactoProyectoEntidadDO cargar(Long idContacto) {
		
    	ContactoProyectoEntidadDO contacto = em.find(ContactoProyectoEntidadDO.class, idContacto);
		return contacto;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ContactoProyectoEntidadDO persistir(
			ContactoProyectoEntidadDO contacto) {
		
    	ContactoProyectoEntidadDO contactoRes = null;   	
    	em.persist(contacto);
    	contactoRes = contacto;		
    	return contactoRes;

	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ContactoProyectoEntidadDO modificar(
			ContactoProyectoEntidadDO contacto) {
		
    	ContactoProyectoEntidadDO contactoRes = null;
    	ContactoProyectoEntidadDO contactoDO = null;

    	contactoDO = contacto;
    	contactoRes = em.merge(contactoDO);
    	return contactoRes;


    	
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idProyecto) {
		
    	boolean isRemoved = false;
    	ContactoProyectoEntidadDO contacto = cargar(idProyecto);
		em.remove(contacto);
		ContactoProyectoEntidadDO contactoDO = cargar(idProyecto);
		if (contactoDO == null) {
			isRemoved = true;
		}
		return isRemoved;
    	
	}

    @Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ContactoProyectoEntidadDO> listarTodo() {
		
    
    	List<ContactoProyectoEntidadDO> proyectoList = null;
		Query listarTodo = em.createNamedQuery("contactoEntidadDO.listarTodo");
		proyectoList = listarTodo.getResultList();
		return proyectoList;

    }

    @Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ContactoProyectoEntidadDO> seleccionParteNombre(
			String parteNombre) {
		
    	List<ContactoProyectoEntidadDO> proyectoList = null;
		Query selecProyecto = em.createNamedQuery("contactoEntidadDO.seleccionPorNombre");
		selecProyecto.setParameter("parteNombre", "%"+parteNombre.toLowerCase()+"%");
		proyectoList = selecProyecto.getResultList();
		return proyectoList;
	}

    @Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ContactoProyectoEntidadDO> seleccionPorProyecto(Long idProyecto) {
		
    	List<ContactoProyectoEntidadDO> proyectoList = null;
		Query selecProyecto = em.createNamedQuery("contactoEntidadDO.seleccionPorProyecto");
		selecProyecto.setParameter("idProyecto",idProyecto);
		proyectoList = selecProyecto.getResultList();
		return proyectoList;
	}

    @Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ContactoProyectoEntidadDO> seleccionPorProyectoEntidad(
			Long idProyecto, Long idEntidad) {
		
    	List<ContactoProyectoEntidadDO> proyectoList = null;
		Query selecProyecto = em.createNamedQuery("contactoEntidadDO.seleccionPorProyecto");
		selecProyecto.setParameter("idProyecto",idProyecto);
		selecProyecto.setParameter("idEntidad",idEntidad);

		proyectoList = selecProyecto.getResultList();
		return proyectoList;
	}



}
