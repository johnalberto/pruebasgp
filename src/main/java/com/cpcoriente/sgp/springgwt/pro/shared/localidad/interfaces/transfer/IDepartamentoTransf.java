/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.DepartamentoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO;

/**
 * @author CPC-04
 *
 */
public interface IDepartamentoTransf {
	public abstract DepartamentoDO transferirTODO(DepartamentoTO dptoTO);
	public abstract DepartamentoTO transferirDOTO(DepartamentoDO dptoDO);

}
