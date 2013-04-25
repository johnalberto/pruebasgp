/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.localidad.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.DepartamentoDO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao.IDepartamentoDAO;


/**
 * @author CPC-04
 *
 */

@Repository
public class JPADepartamentoDAO implements IDepartamentoDAO{

	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Transactional(readOnly = true)
	public DepartamentoDO cargar(Long idDpto) {
		DepartamentoDO dpto = em.find(DepartamentoDO.class, idDpto);
		return dpto;
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public DepartamentoDO persistir(DepartamentoDO dpto) {
		DepartamentoDO dptoRes = null;   	
    	em.persist(dpto);
    	dptoRes = dpto;		
    	return dptoRes;
    }
    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public DepartamentoDO modificar(DepartamentoDO dpto){
    	DepartamentoDO dptoRes = null;
    	DepartamentoDO dptoDO = null;

    	dptoDO = dpto;
    	dptoRes = em.merge(dptoDO);
    	return dptoRes;
    }

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idDpto) {
		boolean isRemoved = false;
		DepartamentoDO dpto = cargar(idDpto);
		em.remove(dpto);
		DepartamentoDO dptoDO = cargar(idDpto);
		if (dptoDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<DepartamentoDO> listarTodo() {
		List<DepartamentoDO> dptoList = null;
		Query listarTodo = em.createNamedQuery("dptoDO.listarTodo");
		dptoList = listarTodo.getResultList();
		return dptoList;
	}


	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<DepartamentoDO> seleccionPorNombre(Long idPais, String parteNombre) {
		List<DepartamentoDO> dptoList = null;
		Query selecPorNom = em.createNamedQuery("dptoDO.seleccionPorNombre");
		selecPorNom.setParameter("idPais", idPais);
		selecPorNom.setParameter("dptoNombre", "%"+parteNombre.toLowerCase()+"%");
		dptoList = selecPorNom.getResultList();
		return dptoList;
	}
	
	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<DepartamentoDO> seleccionPorPais(Long idPais) {
		List<DepartamentoDO> dptoList = null;
		Query selecPorPais = em.createNamedQuery("dptoDO.seleccionPorPais");
		selecPorPais.setParameter("idPais", idPais);
		dptoList = selecPorPais.getResultList();
		return dptoList;
	}

	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)    
	public boolean importarDepartamentos(String rutaArchivo){
		int resultQuery = 0;
		String finLinea = null;
		
		if (System.getProperty("os.name").contains("Windows")){
			finLinea = "\r\n";
		} else{
			finLinea = "\n";
		}
		
		Query importaDptos = em.createNativeQuery("LOAD DATA INFILE '" + rutaArchivo + "' INTO TABLE departamento  FIELDS TERMINATED BY ';'  OPTIONALLY ENCLOSED BY '\"' ESCAPED BY '\\\\' LINES TERMINATED BY '"+finLinea+"' (departamento_codigo,departamento_nombre, departamento_pais_id)");
		resultQuery  = importaDptos.executeUpdate();
		if (resultQuery > 0) {
			return true;
		}
    	return false;
		}
 

}
