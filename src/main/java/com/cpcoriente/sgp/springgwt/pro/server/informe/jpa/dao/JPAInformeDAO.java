/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.informe.jpa.dao;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InformeDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IInformeDAO;

/**
 * @author CPC-04
 *
 */


@Repository
public class JPAInformeDAO implements IInformeDAO{
	
	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	@Transactional(readOnly = true)
	public InformeDO cargar(Long idInforme) {
		
		InformeDO informe = em.find(InformeDO.class, idInforme);
		return informe;
		
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public InformeDO persistir(InformeDO informe) {
		
		InformeDO informeRes = null;   	
		em.persist(informe);
		informeRes = informe;		
		return informeRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public InformeDO modificar(InformeDO informe) {
		
		InformeDO informeRes = null;
		InformeDO informeDO = null;
		informeDO = informe;
		Set<InformeDO> informeDOSet=new LinkedHashSet<InformeDO>();
		informeDOSet.add(informeDO);
		em.merge(informeDO);
		informeRes = em.merge(informeDO);
		return informeRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idInforme) {
		
		boolean isRemoved = false;
		InformeDO informe = cargar(idInforme);
		em.remove(informe);
		InformeDO informeDO = cargar(idInforme);
		if (informeDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}
	
	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<InformeDO> listarSeleccionGeneral(Long idPersona, Long idActividad, Date fechaRegIni, 
			Date fechaRegFin, Boolean vobo, String codigo) {
		
		int queryContinua = 0;

		List<InformeDO> informeList = null;
		StringBuffer queryInforme = new StringBuffer("select informe from InformeDO informe ");
		
		if (idActividad != null ){
			queryInforme.append(" , in (informe.informeDetalleSet) detalle ");
		}
		
		if (idPersona != null || idActividad != null || (codigo != null && !codigo.trim().isEmpty()) || (fechaRegIni != null  && fechaRegFin != null ) || vobo != null ) {
			queryInforme.append(" where ");
		}

		if (idActividad != null && queryContinua == 1) {
			queryInforme.append(" and  detalle.actividad.id = :idActividad ");
		} else if (idActividad != null && queryContinua == 0 ) {
			queryInforme.append("  detalle.actividad.id = :idActividad ");
			queryContinua = 1;
		}

		if (idPersona != null && queryContinua == 1) {
			queryInforme.append(" and informe.persona.id = :idPersona ");
		} else if (idPersona != null && queryContinua == 0 ) {
			queryInforme.append(" informe.persona.id = :idPersona ");
			queryContinua = 1;
		}
		
			
		
		if (codigo  != null  && !codigo.trim().isEmpty()  && queryContinua == 1) {
			queryInforme.append(" and lower(informe.codigo) like :codigo ");	
		} else if (codigo != null && !codigo.trim().isEmpty()&& queryContinua == 0) {
			queryInforme.append(" lower(informe.codigo) like :codigo ");	
			queryContinua = 1;
		}
		
		
		if (fechaRegIni != null  && fechaRegFin != null  && queryContinua == 1) {
			queryInforme.append(" and informe.fechaRegistro >= :fechaRegIni and informe.fechaRegistro <= :fechaRegFin");
		} else if (fechaRegIni != null  && fechaRegFin != null && queryContinua == 0) {
			queryInforme.append(" informe.fechaRegistro >= :fechaRegIni and informe.fechaRegistro <= :fechaRegFin");
			queryContinua = 1;
		}		
		
		
		if (vobo != null && queryContinua == 1) {
			queryInforme.append(" and informe.vobo = :vobo ");	
		} else if (vobo != null && queryContinua == 0) {
			queryInforme.append(" informe.vobo = :vobo ");	
			queryContinua = 1;
		}
		
	
		
		queryInforme.append(" order by informe.fechaRegistro");

		
		Query selectInforme = em.createQuery(queryInforme.toString());


		if (idPersona != null) {
			selectInforme.setParameter("idPersona", idPersona);
		}


		if (idActividad != null  ) {
			selectInforme.setParameter("idActividad", idActividad);	
		}

		if (fechaRegIni != null  && fechaRegFin != null) {
			selectInforme.setParameter("fechaRegIni", fechaRegIni);
			selectInforme.setParameter("fechaRegFin", fechaRegFin);
		}
		
		
		if (codigo  != null && !codigo.trim().isEmpty() ) {
			selectInforme.setParameter("codigo", "%"+codigo.toLowerCase()+"%");
		}
		
		
		if (vobo != null) {
			selectInforme.setParameter("vobo", vobo);
		}
		

		
		informeList = selectInforme.getResultList();

		if (informeList == null || informeList.size() <= 0) {
			informeList = null;
		}

		
		return informeList;
	}
	

}
