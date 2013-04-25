/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.ImpuestoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.ImpuestoTO;

/**
 * @author CPC-04
 *
 */
public interface IImpuestoTransf {

	public abstract ImpuestoDO transferirTODO(ImpuestoTO impuestoTO);
	public abstract ImpuestoTO transferirDOTO(ImpuestoDO impuestoDO);
	
	
}
