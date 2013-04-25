package com.cpcoriente.sgp.springgwt.pro.server.financiero.jpa.dao;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.TerminoConvocatoriaDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RecursoDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IRecursoDetalleDAO;

@Repository
public class JPARecursoDetalleDAO implements IRecursoDetalleDAO {

	private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

	@Transactional(readOnly = true)
	public RecursoDetalleDO cargar(Long idRecurso) {
		
		RecursoDetalleDO recurso = em.find(RecursoDetalleDO.class,idRecurso);
		return recurso;
	}

	@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
	public RecursoDetalleDO persistir(RecursoDetalleDO recurso) {
		
		RecursoDetalleDO rubroRes = null;   	
		em.persist(recurso);
		rubroRes = recurso;		
		return rubroRes;

	}

	@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
	public RecursoDetalleDO modificar(RecursoDetalleDO recurso) {
		
		RecursoDetalleDO rubroRes = null;
		RecursoDetalleDO rubroDO = null;

    	rubroDO = recurso;
    	rubroRes = em.merge(rubroDO);
    	return rubroRes;

	}

	@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idRecurso) {
		
		boolean isRemoved = false;
		RecursoDetalleDO rubro = cargar(idRecurso);
		em.remove(rubro);
		RecursoDetalleDO rubroDO = cargar(idRecurso);
		if (rubroDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

	@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
	public boolean persistirList(Set<RecursoDetalleDO> recDetList) {
		
		boolean res = true;

		try {
			
			for(RecursoDetalleDO reqDet : recDetList){
				
				em.persist(reqDet);
			}
			
		} catch (Exception e) {
			
			res=false;
		}
		
		
		
		return res;
	}

}
