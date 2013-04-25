/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.tercero.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.tercero.entity.TerceroPorTipoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TerceroPorTipoTO;

/**
 * @author CPC-04
 *
 */
public interface ITerceroPorTipoTransf {

	public abstract TerceroPorTipoDO transferirTODO(TerceroPorTipoTO terceroPorTipoTO);
	public abstract TerceroPorTipoTO transferirDOTO(TerceroPorTipoDO terceroPorTipoDO);
	
}
