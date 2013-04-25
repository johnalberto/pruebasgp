/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.PucDO;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.PucTO;



/**
 * @author CPC-04
 *
 */
public interface IPucTransf {

	public abstract PucDO transferirTODO(PucTO pucTO);
	public abstract PucTO transferirDOTO(PucDO pucDO);
	
}
