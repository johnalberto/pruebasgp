/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.actividad.jpa.dao;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.DocObjetivoDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IDocObjetivoDAO;

/**
 * @author CPC-04
 *
 */

@Repository
public class JPADocObjetivoDAO implements IDocObjetivoDAO{

	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Transactional(readOnly = true)
	public DocObjetivoDO cargar(Long idDocObjetivo) {
		DocObjetivoDO docObjetivo = em.find(DocObjetivoDO.class, idDocObjetivo);
		return docObjetivo;
	}

	
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public List<DocObjetivoDO> persistir(Set<DocObjetivoDO> docObjetivoSet) {
		
		List<DocObjetivoDO> docObjetivoListRes = new LinkedList<DocObjetivoDO>();   	
		
		for (DocObjetivoDO idDocObjetivo: docObjetivoSet) {
			DocObjetivoDO docObjetivoRes = null;
			em.persist(idDocObjetivo);
			docObjetivoRes = idDocObjetivo;	
			
			if (docObjetivoRes != null){
				docObjetivoListRes.add(docObjetivoRes);
			}
		}
			
		return docObjetivoListRes;
	}

	

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public DocObjetivoDO modificar(DocObjetivoDO docObjetivo) {

		DocObjetivoDO docObjetivoRes = null;
		DocObjetivoDO docObjetivoDO = null;

		docObjetivoDO = docObjetivo;
		docObjetivoRes = em.merge(docObjetivoDO);

		return docObjetivoRes;
	}


	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(List<Long> idDocObjetivoLista) {

		boolean isRemoved = false;
		for (Long idDocObjetivo: idDocObjetivoLista) {
			isRemoved = false;
			DocObjetivoDO fotoRemov = cargar(idDocObjetivo);
			em.remove(fotoRemov);
			DocObjetivoDO votoComptob = cargar(idDocObjetivo);
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
	public List<DocObjetivoDO> seleccionPorObjetivo(Long idObjetivo) {
		List<DocObjetivoDO> docObjetivoList = null;		
		Query selecDocumento = em.createNamedQuery("docObjetivoDO.seleccionPorObjetivo");
		selecDocumento.setParameter("idObjetivo", idObjetivo);
		docObjetivoList = selecDocumento.getResultList();
		return docObjetivoList;

	}

}

	
