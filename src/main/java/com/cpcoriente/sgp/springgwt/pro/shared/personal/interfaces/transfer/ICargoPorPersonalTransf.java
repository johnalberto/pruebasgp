/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.CargoPorPersonalDO;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.CargoPorPersonalTO;

/**
 * @author CPC-04
 *
 */
public interface ICargoPorPersonalTransf {

	public abstract CargoPorPersonalDO transferirTODO(CargoPorPersonalTO cargoPorPersonalTO);
	public abstract CargoPorPersonalTO transferirDOTO(CargoPorPersonalDO cargoPorPersonalDO);
	
}
