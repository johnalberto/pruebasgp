/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.tercero.interfaces.dao;

import java.util.List;
import com.cpcoriente.sgp.springgwt.pro.server.tercero.entity.TerceroDO;



/**
 * @author CPC-04
 *
 */
public interface ITerceroDAO {
	
	public abstract TerceroDO cargar(Long idTercero);
	public abstract TerceroDO persistir(TerceroDO tercero) ;
	public abstract TerceroDO modificar(TerceroDO tercero) ;
	public abstract boolean eliminar(Long tercero);
	public abstract List<TerceroDO> seleccionPorNumDoNombre(String numDocNombre); 

}
