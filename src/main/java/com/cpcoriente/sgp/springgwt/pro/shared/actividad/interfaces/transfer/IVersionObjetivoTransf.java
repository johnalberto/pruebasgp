/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionObjetivoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.VersionObjetivoTO;

/**
 * @author CPC-04
 *
 */
public interface IVersionObjetivoTransf {

	public abstract VersionObjetivoDO transferirTODO(VersionObjetivoTO versionObjetivoTO);
	public abstract VersionObjetivoTO transferirDOTO(VersionObjetivoDO versionObjetivoDO);
	
}
