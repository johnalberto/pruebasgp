/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.EntregableDO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.EntregableTO;

/**
 * @author CPC-04
 *
 */
public interface IEntregableTransf {

	public abstract EntregableDO transferirTODO(EntregableTO entregableTO);
	public abstract EntregableTO transferirDOTO(EntregableDO entregableDO);
	
	
}
