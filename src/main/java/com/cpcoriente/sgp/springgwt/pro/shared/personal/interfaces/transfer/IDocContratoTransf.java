/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.DocContratoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.DocContratoTO;

/**
 * @author CPC-04
 *
 */
public interface IDocContratoTransf {

	public abstract DocContratoDO transferirTODO(DocContratoTO docContratoTO);
	public abstract DocContratoTO transferirDOTO(DocContratoDO docContratoDO);
	
}
