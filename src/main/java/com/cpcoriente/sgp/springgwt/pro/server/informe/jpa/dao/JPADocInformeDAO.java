/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.informe.jpa.dao;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.DocInformeDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IDocInformeDAO;

/**
 * @author CPC-04
 *
 */

@Repository
public class JPADocInformeDAO implements IDocInformeDAO {
	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Transactional(readOnly = true)
	public DocInformeDO cargar(Long idDocInforme) {
		DocInformeDO docInforme = em.find(DocInformeDO.class, idDocInforme);
		return docInforme;
	}

	
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public List<DocInformeDO> persistir(Set<DocInformeDO> docInformeList) {
		
		List<DocInformeDO> docInformeListRes = new LinkedList<DocInformeDO>();   	
		
		for (DocInformeDO idDocInforme: docInformeList) {
			DocInformeDO docInformeRes = null;
			em.persist(idDocInforme);
			docInformeRes = idDocInforme;	
			
			if (docInformeRes != null){
				docInformeListRes.add(docInformeRes);
			}
		}
			
		return docInformeListRes;
	}

	

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public DocInformeDO modificar(DocInformeDO docInforme) {

		DocInformeDO docInformeRes = null;
		DocInformeDO docInformeDO = null;

		docInformeDO = docInforme;
		docInformeRes = em.merge(docInformeDO);

		return docInformeRes;
	}


	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(List<Long> idDocInformeLista) {

		boolean isRemoved = false;
		for (Long idDocInforme: idDocInformeLista) {
			isRemoved = false;
			DocInformeDO fotoRemov = cargar(idDocInforme);
			em.remove(fotoRemov);
			DocInformeDO votoComptob = cargar(idDocInforme);
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
	public List<DocInformeDO> seleccionPorInforme(Long idInforme) {
		List<DocInformeDO> docInformeList = null;		
		Query selecDocumento = em.createNamedQuery("docInformeDO.seleccionPorInforme");
		selecDocumento.setParameter("idInforme", idInforme);
		docInformeList = selecDocumento.getResultList();
		return docInformeList;

	}

}
