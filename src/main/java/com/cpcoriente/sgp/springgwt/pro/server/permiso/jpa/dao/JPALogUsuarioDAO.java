/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.permiso.jpa.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.LogUsuarioDO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.ILogUsuarioDAO;

/**
 * @author CPC-04
 *
 */
@Repository
public class JPALogUsuarioDAO implements ILogUsuarioDAO {

	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Transactional(readOnly = true)
	public LogUsuarioDO cargar(Long idLog) {
		LogUsuarioDO log = em.find(LogUsuarioDO.class, idLog);
		return log;
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public LogUsuarioDO persistir(LogUsuarioDO log) {
		LogUsuarioDO logRes = null;   	
		em.persist(log);
		logRes = log;	
		return logRes;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<LogUsuarioDO> seleccionPorGeneral(Long idEmpresa, Date fechaIni, Date fechaFin, String idUsuario, String idPagina, String idAccion) {
		List<LogUsuarioDO> logList = null;
		StringBuffer queryAmp = new StringBuffer("select log from LogUsuarioDO log where log.usuario.empresa.id = :idEmpresa and  (log.fecha >= :fechaIni and log.fecha <= :fechaFin) ");
		
		if(idUsuario != null && !idUsuario.trim().isEmpty() && !idUsuario.contains(" ") ){
			queryAmp.append(" and log.usuario.id = :idUsuario ");
		}
		
		if (idPagina != null && !idPagina.trim().isEmpty() && !idPagina.contains(" ") ){
			queryAmp.append(" and log.pagina.id = :idPagina ");
		}
		
		if (idAccion != null && !idAccion.trim().isEmpty() && !idAccion.contains(" ") ){
			queryAmp.append(" and log.accion.id = :idAccion ");
		}
		
		queryAmp.append(" order by log.usuario.id, log.fecha");
		
		Query selectLog = em.createNativeQuery(queryAmp.toString());
		selectLog.setParameter("idEmpresa", idEmpresa);
		selectLog.setParameter("fechaIni", fechaIni);
		selectLog.setParameter("fechaFin", fechaFin);
		
		if(idUsuario != null && !idUsuario.trim().isEmpty() && !idUsuario.contains(" ") ){
			selectLog.setParameter("idUsuario", idUsuario.toLowerCase());
		}
		
		if (idPagina != null && !idPagina.trim().isEmpty() && !idPagina.contains(" ") ){
			selectLog.setParameter("idPagina", idPagina.toLowerCase());
		}
		
		if (idAccion != null && !idAccion.trim().isEmpty() && !idAccion.contains(" ") ){
			selectLog.setParameter("idAccion", idAccion.toLowerCase());
		}
		

	
		logList = selectLog.getResultList();
		return logList;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public LogUsuarioDO selectUltimaFechaUser(Long idEmpresa, String userName) {
		
		List<LogUsuarioDO> usuarioList = null;
		LogUsuarioDO usuarioRes = null;
		Query selecPorUsername = em.createNamedQuery("logUsuarioDO.listarUltimoLogUsuario");
		selecPorUsername.setParameter("idEmpresa", idEmpresa);
		selecPorUsername.setParameter("userName", userName.toLowerCase());
		usuarioList = selecPorUsername.getResultList();
		if (usuarioList != null && usuarioList.size() > 0) {
			usuarioRes = usuarioList.get(0);
		}
		return usuarioRes;
	}


}
