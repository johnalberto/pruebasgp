/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.CargoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.CargoTO;



/**
 * @author CPC-04
 *
 */
public interface ICargoTransf {

	public abstract CargoDO transferirTODO(CargoTO cargoTO);
	public abstract CargoTO transferirDOTO(CargoDO cargoDO);
	
	
}
