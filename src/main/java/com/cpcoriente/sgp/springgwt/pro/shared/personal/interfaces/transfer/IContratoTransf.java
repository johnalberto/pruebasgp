/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.ContratoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.ContratoTO;

/**
 * @author CPC-04
 *
 */
public interface IContratoTransf {

	public abstract ContratoDO transferirTODO(ContratoTO contratoTO);
	public abstract ContratoTO transferirDOTO(ContratoDO contratoDO);
	
}
