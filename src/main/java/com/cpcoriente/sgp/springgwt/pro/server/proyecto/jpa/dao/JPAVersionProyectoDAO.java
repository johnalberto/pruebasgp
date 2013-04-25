package com.cpcoriente.sgp.springgwt.pro.server.proyecto.jpa.dao;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.VersionProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IVersionProyectoDAO;



@Repository
public class JPAVersionProyectoDAO implements IVersionProyectoDAO {

	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Transactional(readOnly = true)
	public VersionProyectoDO cargar(Long idVersion) {
		
		VersionProyectoDO proyecto = em.find(VersionProyectoDO.class, idVersion);
		return proyecto;
	}

	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public VersionProyectoDO persistir(VersionProyectoDO version) {
		
		VersionProyectoDO versionRes = null;   	
		em.persist(version);
		versionRes = version;		
		return versionRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public VersionProyectoDO modificar(VersionProyectoDO version) {
		
		VersionProyectoDO versionRes = null;
		VersionProyectoDO versionDO = null;

    	versionDO = version;
    	versionRes = em.merge(versionDO);

    	
    	return versionRes;
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idVersion) {
		
		boolean isRemoved = false;
		VersionProyectoDO version = cargar(idVersion);
		em.remove(version);
		VersionProyectoDO versionDO = cargar(idVersion);
		if (versionDO != null) {
			isRemoved = true;
		}
				
		return isRemoved;

	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<VersionProyectoDO> seleccionPorproyectoFecha(Long idProyecto,
			Date fechaInicio, Date fechaFin) {
		
		List<VersionProyectoDO> proyectoList = null;
		Query selecProyecto = em.createNamedQuery("verProyectoDO.seleccionPorFecha");
		selecProyecto.setParameter("idProyecto", idProyecto);
		selecProyecto.setParameter("fechaInicio", fechaInicio);
		selecProyecto.setParameter("fechaFin", fechaFin);
		proyectoList = selecProyecto.getResultList();
		return proyectoList;
		
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<VersionProyectoDO> seleccionPorProyecto(Long idProyecto) {
		
		List<VersionProyectoDO> proyectoList = null;
		Query selecProyecto = em.createNamedQuery("verProyectoDO.seleccionPorProyecto");
		selecProyecto.setParameter("idProyecto", idProyecto);
		proyectoList = selecProyecto.getResultList();
		return proyectoList;
		
	}

}
