/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.PucPorProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.PucPorProyectoTO;

/**
 * @author CPC-04
 *
 */
public interface IPucPorProyectoTransf {

	public abstract PucPorProyectoDO transferirTODO(PucPorProyectoTO pucPorProyectoTO);
	public abstract PucPorProyectoTO transferirDOTO(PucPorProyectoDO pucPorProyectoDO);
	
}
