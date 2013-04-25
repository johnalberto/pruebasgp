/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InformeDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InformeDetalleTO;

/**
 * @author CPC-04
 *
 */
public interface IInformeDetalleTransf {
	
	public abstract InformeDetalleDO transferirTODO(InformeDetalleTO informeDetalleTO);
	public abstract InformeDetalleTO transferirDOTO(InformeDetalleDO informeDetalleDO);

}
