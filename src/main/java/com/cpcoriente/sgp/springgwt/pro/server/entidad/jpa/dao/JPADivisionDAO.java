package com.cpcoriente.sgp.springgwt.pro.server.entidad.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.DivisionDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IDivisionDAO;

@Repository
public class JPADivisionDAO implements IDivisionDAO {

	private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
	
    @Transactional(readOnly = true)
	public DivisionDO cargar(Long idDivision) {
		
    	DivisionDO division = em.find(DivisionDO.class, idDivision);
		return division;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public DivisionDO persistir(DivisionDO division) {
		
    	DivisionDO divisionRes = null;   	
    	em.persist(division);
    	divisionRes = division;		
    	return divisionRes;
    	
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public DivisionDO modificar(DivisionDO division) {
	
    	DivisionDO divisionRes = null;
    	DivisionDO divisionDO = null;

    	divisionDO = division;
    	divisionRes = em.merge(divisionDO);
    	return divisionRes;

    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idEntidad) {
		
    	boolean isRemoved = false;
    	DivisionDO division = cargar(idEntidad);
		em.remove(division);
		DivisionDO divisionDO = cargar(idEntidad);
		if (divisionDO == null) {
			isRemoved = true;
		}
		return isRemoved;
    	
	}

    @Transactional(readOnly = true)
   	@SuppressWarnings("unchecked")
	public List<DivisionDO> listarTodo() {
	
    	List<DivisionDO> actividadList = null;
    	Query listarTodo = em.createNamedQuery("divisionDO.listarTodo");
    	actividadList = listarTodo.getResultList();
		return actividadList;	

    
    }

    @Transactional(readOnly = true)
   	@SuppressWarnings("unchecked")
	public List<DivisionDO> seleccionPorEntidad(Long idEntidad) {
		
    	List<DivisionDO> convocatoriaList = null;
    	Query selec = em.createNamedQuery("divisionDO.seleccionPorEntidad");
    	selec.setParameter("idEntidad",idEntidad);
    	convocatoriaList = selec.getResultList();
		return convocatoriaList;
	}

    @Transactional(readOnly = true)
   	@SuppressWarnings("unchecked")
	public List<DivisionDO> seleccionPorNombre(String parteNombre) {
		
		List<DivisionDO> actividadList = null;
    	Query selecPorNom = em.createNamedQuery("divisionDO.seleccionPorNombre");
    	selecPorNom.setParameter("divisionNombre","%"+ parteNombre.toLowerCase()+"%");
    	actividadList = selecPorNom.getResultList();
		return actividadList;	
	}

}
