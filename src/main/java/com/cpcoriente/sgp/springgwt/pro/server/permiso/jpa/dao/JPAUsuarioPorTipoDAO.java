package com.cpcoriente.sgp.springgwt.pro.server.permiso.jpa.dao;


import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioPorTipoDO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.IUsuarioPorTipoDAO;


@Repository
public class JPAUsuarioPorTipoDAO implements IUsuarioPorTipoDAO {

	private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
	
	@Transactional(readOnly = true)
	public UsuarioPorTipoDO cargar(Long idUsuarioPorTipo) {
		
		UsuarioPorTipoDO orden = em.find(UsuarioPorTipoDO.class,idUsuarioPorTipo);
		
		return orden;
	}
	
	@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
	public UsuarioPorTipoDO persistir(UsuarioPorTipoDO usuarioPorTipo) {
		
		
		UsuarioPorTipoDO ordRes = null;   	
		em.persist(usuarioPorTipo);
		ordRes = usuarioPorTipo;		
		return ordRes;
		
	}

	@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
	public UsuarioPorTipoDO modificar(UsuarioPorTipoDO usuarioPorTipo) {
		
		UsuarioPorTipoDO ordRes = null;
		UsuarioPorTipoDO ordDO = null;
    	ordDO = usuarioPorTipo;
    	ordRes = em.merge(ordDO);
    	return ordRes;
		
	}

	@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idUsuario) {
		
		boolean isRemoved = false;
		UsuarioPorTipoDO ord = cargar(idUsuario);
		em.remove(ord);
		UsuarioPorTipoDO ordDO = cargar(idUsuario);
		if (ordDO == null) {
			isRemoved = true;
		}
		return isRemoved;
		
	}

	@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
	public boolean persistirList(Set<UsuarioPorTipoDO> usuarioPorTipoList) {
		
		boolean res = true;
		UsuarioPorTipoDO ampRes = null;
		UsuarioPorTipoDO ampDO = null;
		for(UsuarioPorTipoDO amp:usuarioPorTipoList){
			if (amp.getId() != null && amp.getId() > 0){
				ampDO = amp;
				ampRes = em.merge(ampDO);
			}else{
				em.persist(amp);
				ampRes = amp;
			}	
			if (ampRes == null) {
				res = false;
				return res;
			}
		}
			
		return res;
	}
	

	
	
}
