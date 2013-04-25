/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InfoInterEntregableDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InfoInterEntregableDetalleTO;

/**
 * @author CPC-04
 *
 */
public interface IInfoInterEntregableDetalleTransf {

	public abstract InfoInterEntregableDetalleDO transferirTODO(InfoInterEntregableDetalleTO infoInterEntregableDetalleTO);
	public abstract InfoInterEntregableDetalleTO transferirDOTO(InfoInterEntregableDetalleDO infoInterEntregableDetalleDO);
	
}
