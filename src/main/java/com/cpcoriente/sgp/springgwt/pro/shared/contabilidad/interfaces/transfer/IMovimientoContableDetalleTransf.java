/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.MovimientoContableDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.MovimientoContableDetalleTO;

/**
 * @author CPC-04
 *
 */
public interface IMovimientoContableDetalleTransf {
	
	public abstract MovimientoContableDetalleDO transferirTODO(MovimientoContableDetalleTO movimientoContableDetalleTO);
	public abstract MovimientoContableDetalleTO transferirDOTO(MovimientoContableDetalleDO movimientoContableDetalleDO);

}
