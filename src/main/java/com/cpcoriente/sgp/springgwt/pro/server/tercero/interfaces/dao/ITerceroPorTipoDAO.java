/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.tercero.interfaces.dao;

import java.util.Set;

import com.cpcoriente.sgp.springgwt.pro.server.tercero.entity.TerceroPorTipoDO;

/**
 * @author CPC-04
 *
 */
public interface ITerceroPorTipoDAO {

	public abstract TerceroPorTipoDO cargar(Long idTerceroPorTipo);
	public abstract boolean persistir(Set<TerceroPorTipoDO> terceroPorTipoSet);
	public abstract boolean eliminar(Long terceroPorTipo);
	
}
