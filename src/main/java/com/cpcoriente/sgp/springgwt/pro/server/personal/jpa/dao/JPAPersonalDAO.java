/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.personal.jpa.dao;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.PersonalDO;
import com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao.IPersonalDAO;

/**
 * @author CPC-04
 *
 */

@Repository
public class JPAPersonalDAO implements IPersonalDAO{
	
	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	@Transactional(readOnly = true)
	public PersonalDO cargar(Long idCargol) {
		
		PersonalDO personal = em.find(PersonalDO.class, idCargol);
		return personal;
		
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public PersonalDO persistir(PersonalDO personal) {
		
		PersonalDO personalRes = null;   	
		em.persist(personal);
		personalRes = personal;		
		return personalRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public PersonalDO modificar(PersonalDO personal) {
		
		PersonalDO personalRes = null;
		PersonalDO personalDO = null;
		personalDO = personal;
		Set<PersonalDO> personalDOSet=new LinkedHashSet<PersonalDO>();
		personalDOSet.add(personalDO);
		em.merge(personalDO);
		personalRes = em.merge(personalDO);
		return personalRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idCargol) {
		
		boolean isRemoved = false;
		PersonalDO personal = cargar(idCargol);
		em.remove(personal);
		PersonalDO personalDO = cargar(idCargol);
		if (personalDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}
	
	
	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<PersonalDO> listarSeleccionGeneral(Long idCargo, Boolean activo, String numDocNombre) {
		
		int queryContinua = 0;

		List<PersonalDO> personalList = null;
		StringBuffer queryPersonal = new StringBuffer("select personal from PersonalDO personal ");
		
		
		if (idCargo != null) {
			queryPersonal.append(" , in (persona.cargoPorPersonalSet) cpp ");
		}
			
		if (idCargo != null || (numDocNombre != null && !numDocNombre.trim().isEmpty()) || activo != null ) {
			queryPersonal.append(" where ");
		}

			
		
		if (numDocNombre  != null  && !numDocNombre.trim().isEmpty()  && queryContinua == 1) {
			queryPersonal.append(" and ( (lower(personal.usuarioProyecto.usuario.numDoc) like :numDocNombre) OR (lower(personal.usuarioProyecto.usuario.nombre) like :numDocNombre) ) ");	
		} else if (numDocNombre != null && !numDocNombre.trim().isEmpty()&& queryContinua == 0) {
			queryPersonal.append(" ( (lower(personal.usuarioProyecto.usuario.numDoc) like :numDocNombre) OR (lower(personal.usuarioProyecto.usuario.nombre) like :numDocNombre) ) ");
			queryContinua = 1;
		}
		
				
		if (activo != null && queryContinua == 1) {
			queryPersonal.append(" and personal.activo = :activo ");	
		} else if (activo != null && queryContinua == 0) {
			queryPersonal.append(" personal.activo = :activo ");	
			queryContinua = 1;
		}
		
		
		if (idCargo != null && queryContinua == 1) {
			queryPersonal.append(" and cpp.cargo.id = :idCargo ");
		} else if (idCargo != null && queryContinua == 0 ) {
			queryPersonal.append(" cpp.cargo.id = :idCargo ");
			queryContinua = 1;
		}
	
		
		queryPersonal.append(" order by personal.usuarioProyecto.usuario.nombre");

		
		Query selectPersonal = em.createQuery(queryPersonal.toString());


		if (idCargo != null) {
			selectPersonal.setParameter("idCargo", idCargo);
		}
		
		
		if (numDocNombre  != null && !numDocNombre.trim().isEmpty() ) {
			selectPersonal.setParameter("numDocNombre", "%"+numDocNombre.toLowerCase()+"%");
		}
		
		
		if (activo != null) {
			selectPersonal.setParameter("activo", activo);
		}
		

		
		personalList = selectPersonal.getResultList();

		if (personalList == null || personalList.size() <= 0) {
			personalList = null;
		}

		
		return personalList;
	}
	

}
