/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.PersonalDO;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.PersonalTO;

/**
 * @author CPC-04
 *
 */
public interface IPersonalTransf {
	
	public abstract PersonalDO transferirTODO(PersonalTO personalTO);
	public abstract PersonalTO transferirDOTO(PersonalDO personalDO);
	
	
}
