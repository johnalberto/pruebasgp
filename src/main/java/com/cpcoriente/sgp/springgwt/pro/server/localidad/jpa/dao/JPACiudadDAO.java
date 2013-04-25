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

import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.CiudadDO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao.ICiudadDAO;


/**
 * @author CPC-04
 *
 */

@Repository
public class JPACiudadDAO implements ICiudadDAO {
		
		 
	private EntityManager em = null;

    /*
     * Sets the entity manager.
     */
	
	
    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }


    @Transactional(readOnly = true)
	public CiudadDO cargar(Long idCiudad) {
		CiudadDO ciudad = em.find(CiudadDO.class, idCiudad);
		return ciudad;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public CiudadDO persistir(CiudadDO ciudad) {
    	CiudadDO ciudadRes = null;   	
    	em.persist(ciudad);
    	ciudadRes = ciudad;		
    	return ciudadRes;
    }
    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public CiudadDO modificar(CiudadDO ciudad){
    	CiudadDO ciudadRes = null;
    	CiudadDO ciudadDO = null;

    	ciudadDO = ciudad;
    	ciudadRes = em.merge(ciudadDO);
    	return ciudadRes;
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idCiudad) {
		boolean isRemoved = false;
		CiudadDO ciudad = cargar(idCiudad);
		em.remove(ciudad);
		CiudadDO ciudadDO = cargar(idCiudad);
		if (ciudadDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	public List<CiudadDO> listarTodo() {
		List<CiudadDO> ciudadList = null;
    	Query listarTodo = em.createNamedQuery("ciudadDO.listarTodo");
    	ciudadList = listarTodo.getResultList();
		return ciudadList;
	}

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	public List<CiudadDO> seleccionPorNombre(Long idDpto, String parteNombre) {
		List<CiudadDO> ciudadList = null;
    	Query selecPorNom = em.createNamedQuery("ciudadDO.seleccionPorNombre");
    	selecPorNom.setParameter("idDpto", idDpto);
    	selecPorNom.setParameter("ciudadNombre", "%"+parteNombre.toLowerCase()+"%");
    	ciudadList = selecPorNom.getResultList();
		return ciudadList;
	}

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	public List<CiudadDO> seleccionPorDpto(Long idDpto) {
		List<CiudadDO> ciudadList = null;
    	Query selecPorDpto = em.createNamedQuery("ciudadDO.seleccionPorDpto");
    	selecPorDpto.setParameter("idDpto", idDpto);
    	ciudadList = selecPorDpto.getResultList();
		return ciudadList;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW )    
	public boolean importarCiudades(String rutaArchivo){
		int resultQuery = 0;
		String finLinea = null;
		
		if (System.getProperty("os.name").contains("Windows")){
			finLinea = "\r\n";
		} else{
			finLinea = "\n";
		}
		
		Query importaCiudades = em.createNativeQuery("LOAD DATA INFILE '" + rutaArchivo + "' INTO TABLE ciudad FIELDS TERMINATED BY ';'  OPTIONALLY ENCLOSED BY '\"' ESCAPED BY '\\\\' LINES TERMINATED BY '"+finLinea+"' (ciudad_codigo,ciudad_nombre,ciudad_departamento_id)");
		resultQuery  = importaCiudades.executeUpdate();
		if (resultQuery > 0) {
			return true;
		}
    	return false;
		}
 

}
