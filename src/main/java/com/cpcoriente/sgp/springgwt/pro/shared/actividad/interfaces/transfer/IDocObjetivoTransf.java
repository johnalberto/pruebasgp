/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.DocObjetivoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.DocObjetivoTO;

/**
 * @author CPC-04
 *
 */
public interface IDocObjetivoTransf {

	public abstract DocObjetivoDO transferirTODO(DocObjetivoTO docObjetivoTO);
	public abstract DocObjetivoTO transferirDOTO(DocObjetivoDO docObjetivoDO);
	
}
