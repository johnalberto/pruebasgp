/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.ejecucion.entity.DocEjecucionPresupuestoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.objeto.DocEjecucionPresupuestoTO;



/**
 * @author CPC-04
 *
 */
public interface IDocEjecucionPresupuestoTransf {
	
	public abstract DocEjecucionPresupuestoDO transferirTODO(DocEjecucionPresupuestoTO docEjecucionPresupuestoTO);
	public abstract DocEjecucionPresupuestoTO transferirDOTO(DocEjecucionPresupuestoDO docEjecucionPresupuestoDO);

}
