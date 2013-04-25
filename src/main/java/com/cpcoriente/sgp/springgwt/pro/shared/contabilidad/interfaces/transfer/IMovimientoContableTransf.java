/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.MovimientoContableDO;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.MovimientoContableTO;

/**
 * @author CPC-04
 *
 */
public interface IMovimientoContableTransf {

	public abstract MovimientoContableDO transferirTODO(MovimientoContableTO movimientoContableTO);
	public abstract MovimientoContableTO transferirDOTO(MovimientoContableDO movimientoContableDO);
	
	
}
