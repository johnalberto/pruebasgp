package com.cpcoriente.sgp.springgwt.pro.server.entidad.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.FotoEntidadDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IFotoEntidadDAO;


@Repository
public class JPAFotoEntidadDAO implements IFotoEntidadDAO {

	private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
	
    @Transactional(readOnly = true)
	public FotoEntidadDO cargar(Long idEntidad) {
    	
    	FotoEntidadDO foto = em.find(FotoEntidadDO.class, idEntidad);
		return foto;
	}
    

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public FotoEntidadDO persistir(FotoEntidadDO foto) {
    	
    	FotoEntidadDO fotoRes = null;   	
    	em.persist(foto);
    	fotoRes = foto;		
    	return fotoRes;

	}
    

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public FotoEntidadDO modificar(FotoEntidadDO foto) {
		
    	FotoEntidadDO fotoRes = null;
    	FotoEntidadDO fotoDO = null;

    	fotoDO = foto;
    	fotoRes = em.merge(fotoDO);
    	return fotoRes;
    	
	}
    

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idEntidad) {
		
		boolean isRemoved = false;
		FotoEntidadDO foto = cargar(idEntidad);
		em.remove(foto);
		FotoEntidadDO fotoDO = cargar(idEntidad);
		if (fotoDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

    @Transactional(readOnly = true)
  	@SuppressWarnings("unchecked")
	public List<FotoEntidadDO> listarPorEntidad(Long idEntidad) {
    	
    	List<FotoEntidadDO> fotoList = null;
    	Query selecPorEntidad = em.createNamedQuery("fotoEntidadDO.seleccionPorEntidad");
    	selecPorEntidad.setParameter("idEntidad", idEntidad);
    	fotoList = selecPorEntidad.getResultList();
		return fotoList;	
	}

}
