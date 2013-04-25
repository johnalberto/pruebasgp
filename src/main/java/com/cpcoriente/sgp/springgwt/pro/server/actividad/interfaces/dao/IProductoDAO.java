/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ProductoDO;

/**
 * @author CPC-04
 *
 */
public interface IProductoDAO {

	public abstract ProductoDO cargar(Long idProducto);
	public abstract ProductoDO persistir(ProductoDO producto) ;
	public abstract ProductoDO modificar(ProductoDO producto) ;
	public abstract boolean eliminar(Long idProducto);
	public abstract List<ProductoDO> listarTodo(Long idObjetivo);
	public abstract List<ProductoDO> seleccionPorNombreCodigo(Long idObjetivo, String parteNombreCodigo);
	public abstract List<ProductoDO> seleccionPorObjetivoPorEstado(Long idObjetivo,int estado);
	
}
