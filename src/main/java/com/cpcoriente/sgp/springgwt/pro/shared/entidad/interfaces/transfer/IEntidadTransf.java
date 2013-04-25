/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.EntidadDO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO;



/**
 * @author CPC-04
 *
 */
public interface IEntidadTransf {
	
	public abstract EntidadDO transferirTODO(EntidadTO entidadTO);
	public abstract EntidadTO transferirDOTO(EntidadDO entidadDO);

}
