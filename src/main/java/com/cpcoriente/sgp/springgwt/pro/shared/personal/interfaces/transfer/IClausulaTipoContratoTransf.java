/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.ClausulaTipoContratoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.ClausulaTipoContratoTO;

/**
 * @author CPC-04
 *
 */
public interface IClausulaTipoContratoTransf {

	public abstract ClausulaTipoContratoDO transferirTODO(ClausulaTipoContratoTO clausulaTipoContratoTO);
	public abstract ClausulaTipoContratoTO transferirDOTO(ClausulaTipoContratoDO clausulaTipoContratoDO);
	
	
}
