/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.DocInformeDO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.DocInformeTO;

/**
 * @author CPC-04
 *
 */
public interface IDocInformeTransf {

	public abstract DocInformeDO transferirTODO(DocInformeTO docInformeTO);
	public abstract DocInformeTO transferirDOTO(DocInformeDO docInformeDO);
	
}
