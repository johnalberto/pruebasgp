/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ObjetivoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ObjetivoTO;

/**
 * @author CPC-04
 *
 */
public interface IObjetivoTransf {
	
	public abstract ObjetivoDO transferirTODO(ObjetivoTO objetivoTO);
	public abstract ObjetivoTO transferirDOTO(ObjetivoDO objetivoDO);
}
