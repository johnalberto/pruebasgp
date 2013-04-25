/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.tercero.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.tercero.entity.TerceroDO;
import com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TerceroTO;



/**
 * @author CPC-04
 *
 */
public interface ITerceroTransf {

	public abstract TerceroDO transferirTODO(TerceroTO terceroTO);
	public abstract TerceroTO transferirDOTO(TerceroDO terceroDO);
}
