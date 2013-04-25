package com.cpcoriente.sgp.springgwt.pro.server.entidad.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.EmpresaDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IEmpresaDAO;

@Repository
public class JPAEmpresaDAO implements IEmpresaDAO {

private EntityManager em = null;
	
	@PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = true)
	public EmpresaDO cargar(Long idEmpresa) {
    	EmpresaDO empresa = em.find(EmpresaDO.class, idEmpresa);
		return empresa;

	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public EmpresaDO persistir(EmpresaDO empresa) {
		
    	EmpresaDO empresaRes = null;   	
    	em.persist(empresa);
    	empresaRes = empresa;		
    	return empresaRes;
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public EmpresaDO modificar(EmpresaDO empresa) {
		
    	EmpresaDO empresaRes = null;
    	EmpresaDO empresaDO = null;

    	empresaDO = empresa;
    	empresaRes = em.merge(empresaDO);
    	return empresaRes;

	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idEmpresa) {
		
    	boolean isRemoved = false;
    	EmpresaDO empresa = cargar(idEmpresa);
		em.remove(empresa);
		EmpresaDO empresaDO = cargar(idEmpresa);
		if (empresaDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	public List<EmpresaDO> listarTodo() {
		
    	List<EmpresaDO> empresaList = null;
		Query selecEmpresa = em.createNamedQuery("empresaDO.listarTodo");
		empresaList = selecEmpresa.getResultList();
		return empresaList;

	}

}
