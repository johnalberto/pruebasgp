/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.ejecucion.jpa.dao;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.ejecucion.entity.DocEjecucionPresupuestoDO;
import com.cpcoriente.sgp.springgwt.pro.server.ejecucion.interfaces.dao.IDocEjecucionPresupuestoDAO;



/**
 * @author CPC-04
 *
 */


@Repository
public class JPADocEjecucionPresupuestoDAO implements IDocEjecucionPresupuestoDAO {
	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Transactional(readOnly = true)
	public DocEjecucionPresupuestoDO cargar(Long idDocEjecucionPresupuesto) {
		DocEjecucionPresupuestoDO docEjecucionPresupuesto = em.find(DocEjecucionPresupuestoDO.class, idDocEjecucionPresupuesto);
		return docEjecucionPresupuesto;
	}

	
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public List<DocEjecucionPresupuestoDO> persistir(Set<DocEjecucionPresupuestoDO> docEjecucionPresupuestoList) {
		
		List<DocEjecucionPresupuestoDO> docEjecucionPresupuestoListRes = new LinkedList<DocEjecucionPresupuestoDO>();   	
		
		for (DocEjecucionPresupuestoDO idDocEjecucionPresupuesto: docEjecucionPresupuestoList) {
			DocEjecucionPresupuestoDO docEjecucionPresupuestoRes = null;
			em.persist(idDocEjecucionPresupuesto);
			docEjecucionPresupuestoRes = idDocEjecucionPresupuesto;	
			
			if (docEjecucionPresupuestoRes != null){
				docEjecucionPresupuestoListRes.add(docEjecucionPresupuestoRes);
			}
		}
			
		return docEjecucionPresupuestoListRes;
	}

	

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public DocEjecucionPresupuestoDO modificar(DocEjecucionPresupuestoDO docEjecucionPresupuesto) {

		DocEjecucionPresupuestoDO docEjecucionPresupuestoRes = null;
		DocEjecucionPresupuestoDO docEjecucionPresupuestoDO = null;

		docEjecucionPresupuestoDO = docEjecucionPresupuesto;
		docEjecucionPresupuestoRes = em.merge(docEjecucionPresupuestoDO);

		return docEjecucionPresupuestoRes;
	}


	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(List<Long> idDocEjecucionPresupuestoLista) {

		boolean isRemoved = false;
		for (Long idDocEjecucionPresupuesto: idDocEjecucionPresupuestoLista) {
			isRemoved = false;
			DocEjecucionPresupuestoDO fotoRemov = cargar(idDocEjecucionPresupuesto);
			em.remove(fotoRemov);
			DocEjecucionPresupuestoDO votoComptob = cargar(idDocEjecucionPresupuesto);
			if (votoComptob == null) {
				isRemoved = true;
			} else {
				return isRemoved;
			}
		}
		
		return isRemoved;

	}



	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<DocEjecucionPresupuestoDO> seleccionPorEjecucionPresupuesto(Long idEjecucionPresupuesto) {
		List<DocEjecucionPresupuestoDO> docEjecucionPresupuestoList = null;		
		Query selecDocumento = em.createNamedQuery("docEjecucionPresupuestoDO.seleccionPorEjecucionPresupuesto");
		selecDocumento.setParameter("idEjecucionPresupuesto", idEjecucionPresupuesto);
		docEjecucionPresupuestoList = selecDocumento.getResultList();
		return docEjecucionPresupuestoList;

	}

}
