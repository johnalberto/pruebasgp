/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.ClausulaContratoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.ClausulaContratoTO;

/**
 * @author CPC-04
 *
 */
public interface IClausulaContratoTransf {

	public abstract ClausulaContratoDO transferirTODO(ClausulaContratoTO clausulaContratoTO);
	public abstract ClausulaContratoTO transferirDOTO(ClausulaContratoDO clausulaContratoDO);
	
}
