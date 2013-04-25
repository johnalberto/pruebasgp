package com.cpcoriente.sgp.springgwt.pro.server.proyecto.jpa.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IProyectoDAO;

@Repository
public class JPAProyectoDAO implements IProyectoDAO {

	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Transactional(readOnly = true)
	public ProyectoDO cargar(Long idProyecto) {
		
		ProyectoDO proyecto = em.find(ProyectoDO.class, idProyecto);
		return proyecto;
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ProyectoDO persistir(ProyectoDO proyecto) {
		
		ProyectoDO proyectoRes = null;   	
		em.persist(proyecto);
		proyectoRes = proyecto;		
		return proyectoRes;
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ProyectoDO modificar(ProyectoDO proyecto) {
		
		ProyectoDO proyectoRes = null;
		ProyectoDO proyectoDO = null;

    	proyectoDO = proyecto;
    	proyectoRes = em.merge(proyectoDO);

    	
    	return proyectoRes;
    	
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idProyecto) {
		
		boolean isRemoved = false;
		ProyectoDO proyecto = cargar(idProyecto);
		em.remove(proyecto);
		ProyectoDO proyectoDO = cargar(idProyecto);
		if (proyectoDO == null) {
			isRemoved = true;
		}
		return isRemoved;

		
	}

	

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ProyectoDO> seleccionPorCodigoTitulo(Long idDivision,
			String titulo, String codigo) {
		
		List<ProyectoDO> proyectoList = null;
		Query selecProyecto = em.createNamedQuery("proyectoDO.seleccionPorCodigoTitulo");
		selecProyecto.setParameter("idDivision", idDivision);
		selecProyecto.setParameter("parteTitulo", "%"+titulo.toLowerCase()+"%");
		selecProyecto.setParameter("parteCodigo", codigo);
		proyectoList = selecProyecto.getResultList();
		return proyectoList;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ProyectoDO> seleccionPorEstado(int estado) {
		List<ProyectoDO> proyectoList = null;
		Query selecPorNom = em.createNamedQuery("proyectoDO.seleccionPorEstado");
		selecPorNom.setParameter("estado", estado);
		proyectoList = selecPorNom.getResultList();
		return proyectoList;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ProyectoDO> listarTodo(Long idDivision) {
		
		List<ProyectoDO> proyectoList = null;
		Query listarTodo = em.createNamedQuery("usuarioDO.listarTodo");
		listarTodo.setParameter("idDivision", idDivision);
		proyectoList = listarTodo.getResultList();
		return proyectoList;
		
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ProyectoDO> seleccionPorTitulo(String titulo) {
		
		List<ProyectoDO> proyectoList = null;
		Query selecProyecto = em.createNamedQuery("proyectoDO.seleccionPorTitulo");
		selecProyecto.setParameter("parteTitulo", "%"+titulo.toLowerCase()+"%");
		proyectoList = selecProyecto.getResultList();
		return proyectoList;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ProyectoDO> seleccionPorCodigo(String codigo) {
		
		List<ProyectoDO> proyectoList = null;
		Query selecProyecto = em.createNamedQuery("proyectoDO.seleccionPorCodigo");
		selecProyecto.setParameter("parteCodigo", "%"+codigo.toLowerCase()+"%");
		proyectoList = selecProyecto.getResultList();
		return proyectoList;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ProyectoDO> seleccionPorFechaInicio(Date fechaInicio,
			Date fechaFin) {
		
		List<ProyectoDO> proyectoList = null;
		Query selecProyecto = em.createNamedQuery("proyectoDO.seleccionPorFechaInicio");
		selecProyecto.setParameter("fechaInicio",fechaInicio );
		selecProyecto.setParameter("fechaFin",fechaFin );
		proyectoList = selecProyecto.getResultList();
		return proyectoList;

		
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ProyectoDO> seleccionPorConvocatoria(Long idConvocatoria) {
		
		List<ProyectoDO> proyectoList = null;
		Query selecProyecto = em.createNamedQuery("proyectoDO.seleccionPorConvocatoria");
		selecProyecto.setParameter("seleccionPorConvocatoria", idConvocatoria);
		proyectoList = selecProyecto.getResultList();
		return proyectoList;
		
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ProyectoDO> seleccionPorGeneral(String codigo, String titulo,
			Long idConvocatoria, int estado, Date fechaIni, Date fechaFin,Long idEmpresa) {
		
		List<ProyectoDO> logList = null;
		StringBuffer queryAmp = new StringBuffer("select pro from ProyectoDO pro ");
		
		if (codigo != null || titulo != null || (fechaIni != null  && fechaFin != null ) || (estado > 0) || idConvocatoria!=null ) {
			
			queryAmp.append(" where pro.convocatoria.division.entidad.empresa.id = :idEmpresa ");
		}
		if(codigo != null && !codigo.trim().isEmpty() && !codigo.contains(" ") ){
			queryAmp.append(" and lower(pro.codigo) like : codigo ");
		}
		
		if (titulo != null && !titulo.trim().isEmpty() && !titulo.contains(" ") ){
			queryAmp.append(" and lower(pro.titulo) like : titulo ");
		}
		
		if (fechaIni != null  && fechaFin != null  ) {
			queryAmp.append(" and pro.fechaInicio >= :fechaIni and pro.fechaInicio <= :fechaFin");
		}
		
		if (idConvocatoria != null && idConvocatoria.longValue()>0 ){
			queryAmp.append(" and pro.convocatoria.id = :idConvocatoria ");
		}
		
		if (estado > 0 ){
			queryAmp.append(" and pro.estado = :estado ");
		}
		
		queryAmp.append(" order by pro.fechaInicio");
		
		Query selectLog = em.createNativeQuery(queryAmp.toString());
		selectLog.setParameter("idEmpresa", idEmpresa);
		
		
		if(codigo != null && !codigo.trim().isEmpty() && !codigo.contains(" ") ){
			selectLog.setParameter("codigo", codigo.toLowerCase());
		}
		
		if(codigo != null && !codigo.trim().isEmpty() && !codigo.contains(" ") ){
			selectLog.setParameter("titulo", titulo.toLowerCase());
		}
		
		if (fechaIni != null  && fechaFin != null  ) {
			selectLog.setParameter("fechaIni", fechaIni);
			selectLog.setParameter("fechaFin", fechaFin);

		}
		
		if(idConvocatoria != null && idConvocatoria.longValue()>0  ){
			selectLog.setParameter("idConvocatoria", idConvocatoria);
		}

		if (estado > 0 ){
			selectLog.setParameter("estado", estado);
		}
	
		logList = selectLog.getResultList();
		return logList;	}

	

}
