/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.actividad.jpa.dao;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ProductoDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IProductoDAO;

/**
 * @author CPC-04
 *
 */

@Repository
public class JPAProductoDAO implements IProductoDAO {
	
	
	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	@Transactional(readOnly = true)
	public ProductoDO cargar(Long idProducto) {
		
		ProductoDO producto = em.find(ProductoDO.class, idProducto);
		return producto;
		
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ProductoDO persistir(ProductoDO producto) {
		
		ProductoDO productoRes = null;   	
		em.persist(producto);
		productoRes = producto;		
		return productoRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ProductoDO modificar(ProductoDO producto) {
		
		ProductoDO productoRes = null;
		ProductoDO productoDO = null;
		productoDO = producto;
		Set<ProductoDO> productoDOSet=new LinkedHashSet<ProductoDO>();
		productoDOSet.add(productoDO);
		em.merge(productoDO);
		productoRes = em.merge(productoDO);
		return productoRes;

	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean eliminar(Long idProducto) {
		
		boolean isRemoved = false;
		ProductoDO producto = cargar(idProducto);
		em.remove(producto);
		ProductoDO productoDO = cargar(idProducto);
		if (productoDO == null) {
			isRemoved = true;
		}
		return isRemoved;
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ProductoDO> listarTodo(Long idObjetivo) {
		
		List<ProductoDO> productoList = null;
		Query listarTodo = em.createNamedQuery("productoDO.listarTodo");
		listarTodo.setParameter("idObjetivo", idObjetivo);
		productoList = listarTodo.getResultList();
		return productoList;	
		
	}

	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ProductoDO> seleccionPorNombreCodigo(Long idObjetivo,
			String parteNombreCodigo) {
		
		List<ProductoDO> productoList = null;
		Query selecProducto = em.createNamedQuery("productoDO.seleccionPorCodigoNombre");
		selecProducto.setParameter("idObjetivo", idObjetivo);
		selecProducto.setParameter("parteNombre", "%" + parteNombreCodigo.toLowerCase()+"%");
		selecProducto.setParameter("parteCodigo", "%" + parteNombreCodigo + "%");
		productoList = selecProducto.getResultList();
		
		return productoList;
	}

	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ProductoDO> seleccionPorObjetivoPorEstado(Long idObjetivo,
			int estado) {
		List<ProductoDO> productoList = null;
		Query selecEstado = em.createNamedQuery("productoDO.seleccionPorEstado");
		selecEstado.setParameter("idObjetivo", idObjetivo);
		selecEstado.setParameter("estado", estado);
		productoList = selecEstado.getResultList();
		return productoList;
	}

}
