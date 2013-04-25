/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.calendario.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.calendario.entity.DiaNoLaboralDO;
import com.cpcoriente.sgp.springgwt.pro.shared.calendario.objeto.DiaNoLaboralTO;

/**
 * @author CPC-04
 *
 */
public interface IDiaNoLaboralTransf {

	public abstract DiaNoLaboralDO transferirTODO(DiaNoLaboralTO diaNoLaboralTO);
	public abstract DiaNoLaboralTO transferirDOTO(DiaNoLaboralDO diaNoLaboralDO);
	
}
