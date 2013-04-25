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

import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.PaisDO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao.IPaisDAO;



/**
 * @author CPC-04
 *
 */
@Repository
public class JPAPaisDAO implements IPaisDAO {

	private EntityManager em = null;

    /*
     * Sets the entity manager.
     */
    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public PaisDO cargar(Long idPais) {
		PaisDO pais = em.find(PaisDO.class, idPais);
		return pais;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public PaisDO persistir(PaisDO pais) {
		PaisDO paisRes = null;   	
    	em.persist(pais);
    	paisRes = pais;		
    	return paisRes;
    }
    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public PaisDO modificar(PaisDO pais){
    	PaisDO paisRes = null;
    	PaisDO paisDO = null;

    	paisDO = pais;
    	paisRes = em.merge(paisDO);
    	return paisRes;
    }


    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idPais) {
		boolean isRemoved = false;
		PaisDO pais = cargar(idPais);
		em.remove(pais);
		PaisDO paisDO = cargar(idPais);
		if (paisDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}


    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	public List<PaisDO> listarTodo() {
		List<PaisDO> paisList = null;
    	Query listarTodo = em.createNamedQuery("paisDO.listarTodo");
    	paisList = listarTodo.getResultList();
    	return paisList;
	}
    

    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    @SuppressWarnings("unchecked")
	public List<PaisDO> seleccionPorNombre(String parteNombre) {
		List<PaisDO> paisList = null;
    	Query selecPorNom = em.createNamedQuery("paisDO.seleccionPorNombre");
    	selecPorNom.setParameter("paisNombre", "%"+parteNombre.toLowerCase()+"%");
    	paisList = selecPorNom.getResultList();
		return paisList;
	}

    @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW )    
	public boolean importarPaises(String rutaArchivo){
		int resultQuery = 0;
		String finLinea = null;
		if (System.getProperty("os.name").contains("Windows")){
			finLinea = "\r\n";
		} else{
			finLinea = "\n";
		}
		
		Query importaPaises = em.createNativeQuery("LOAD DATA INFILE '" + rutaArchivo + "' INTO TABLE pais  FIELDS TERMINATED BY ';'  OPTIONALLY ENCLOSED BY '\"' ESCAPED BY '\\\\' LINES TERMINATED BY '"+finLinea+"' (pais_codigo,pais_nombre)");
		resultQuery  = importaPaises.executeUpdate();
		if (resultQuery > 0) {
			return true;
		}
    	return false;
		}
 
	
}
