/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.calendario.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.calendario.entity.CalendarioNoLaboralDO;
import com.cpcoriente.sgp.springgwt.pro.shared.calendario.objeto.CalendarioNoLaboralTO;



/**
 * @author CPC-04
 *
 */
public interface ICalendarioNoLaboralTransf {

	public abstract CalendarioNoLaboralDO transferirTODO(CalendarioNoLaboralTO calendarioNoLaboralTO);
	public abstract CalendarioNoLaboralTO transferirDOTO(CalendarioNoLaboralDO calendarioNoLaboralDO);
	
}
