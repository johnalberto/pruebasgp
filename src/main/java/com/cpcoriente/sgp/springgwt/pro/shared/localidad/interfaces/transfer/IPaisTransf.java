/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.PaisDO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO;

/**
 * @author CPC-04
 *
 */
public interface IPaisTransf {
	
	public abstract PaisDO transferirTODO(PaisTO paisTO);
	public abstract PaisTO transferirDOTO(PaisDO paisDO);

}
