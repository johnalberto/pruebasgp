/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.personal.jpa.dao;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.DocContratoDO;
import com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao.IDocContratoDAO;

/**
 * @author CPC-04
 *
 */


@Repository
public class JPADocContratoDAO implements IDocContratoDAO {
	
	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Transactional(readOnly = true)
	public DocContratoDO cargar(Long idDocContrato) {
		DocContratoDO docContrato = em.find(DocContratoDO.class, idDocContrato);
		return docContrato;
	}

	
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public List<DocContratoDO> persistir(Set<DocContratoDO> docContratoList) {
		
		List<DocContratoDO> docContratoListRes = new LinkedList<DocContratoDO>();   	
		
		for (DocContratoDO idDocContrato: docContratoList) {
			DocContratoDO docContratoRes = null;
			em.persist(idDocContrato);
			docContratoRes = idDocContrato;	
			
			if (docContratoRes != null){
				docContratoListRes.add(docContratoRes);
			}
		}
			
		return docContratoListRes;
	}

	

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public DocContratoDO modificar(DocContratoDO docContrato) {

		DocContratoDO docContratoRes = null;
		DocContratoDO docContratoDO = null;

		docContratoDO = docContrato;
		docContratoRes = em.merge(docContratoDO);

		return docContratoRes;
	}


	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(List<Long> idDocContratoLista) {

		boolean isRemoved = false;
		for (Long idDocContrato: idDocContratoLista) {
			isRemoved = false;
			DocContratoDO fotoRemov = cargar(idDocContrato);
			em.remove(fotoRemov);
			DocContratoDO votoComptob = cargar(idDocContrato);
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
	public List<DocContratoDO> seleccionPorContrato(Long idContrato) {
		List<DocContratoDO> docContratoList = null;		
		Query selecDocumento = em.createNamedQuery("docContratoDO.seleccionPorContrato");
		selecDocumento.setParameter("idContrato", idContrato);
		docContratoList = selecDocumento.getResultList();
		return docContratoList;

	}

}
