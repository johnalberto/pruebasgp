/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.DepartamentoDO;



/**
 * @author CPC-04
 *
 */
public interface IDepartamentoDAO {
	
	public abstract DepartamentoDO cargar(Long idDpto);
	public abstract DepartamentoDO persistir(DepartamentoDO dpto) ;
	public abstract DepartamentoDO modificar(DepartamentoDO dpto) ;
	public abstract boolean eliminar(Long idDpto);
	public abstract List<DepartamentoDO> listarTodo();
	public abstract List<DepartamentoDO> seleccionPorNombre(Long idPais, String parteNombre);
	public abstract List<DepartamentoDO> seleccionPorPais(Long idPais);
	public abstract boolean importarDepartamentos(String rutaArchivo);

}
