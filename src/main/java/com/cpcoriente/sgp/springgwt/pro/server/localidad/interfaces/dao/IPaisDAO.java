/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.PaisDO;




/**
 * @author CPC-04
 *
 */
public interface IPaisDAO {

	public abstract PaisDO cargar(Long idPais);
	public abstract PaisDO persistir(PaisDO pais) ;
	public abstract PaisDO modificar(PaisDO pais) ;	
	public abstract boolean eliminar(Long idPais);
	public abstract List<PaisDO> listarTodo();
	public abstract List<PaisDO> seleccionPorNombre(String parteNombre);
	public abstract boolean importarPaises(String rutaArchivo);
	
}
