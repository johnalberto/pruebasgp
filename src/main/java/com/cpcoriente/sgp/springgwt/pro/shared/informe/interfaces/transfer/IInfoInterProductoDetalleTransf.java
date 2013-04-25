/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InfoInterProductoDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InfoInterProductoDetalleTO;

/**
 * @author CPC-04
 *
 */
public interface IInfoInterProductoDetalleTransf {

	public abstract InfoInterProductoDetalleDO transferirTODO(InfoInterProductoDetalleTO infoInterProductoDetalleTO);
	public abstract InfoInterProductoDetalleTO transferirDOTO(InfoInterProductoDetalleDO infoInterProductoDetalleDO);
	
}
