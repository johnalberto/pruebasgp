/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.ejecucion.entity.EjecucionPresupuestoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.objeto.EjecucionPresupuestoTO;

/**
 * @author CPC-04
 *
 */
public interface IEjecucionPresupuestoTransf {

	public abstract EjecucionPresupuestoDO transferirTODO(EjecucionPresupuestoTO ejecucionPresupuestoTO);
	public abstract EjecucionPresupuestoTO transferirDOTO(EjecucionPresupuestoDO ejecucionPresupuestoDO);
	
}
