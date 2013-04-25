/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.parametro.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.parametro.entity.ParametroPorProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.parametro.objeto.ParametroPorProyectoTO;

/**
 * @author CPC-04
 *
 */
public interface IParametroPorProyectoTransf {

	public abstract ParametroPorProyectoDO transferirTODO(ParametroPorProyectoTO parametroPorProyectoTO);
	public abstract ParametroPorProyectoTO transferirDOTO(ParametroPorProyectoDO parametroPorProyectoDO);	
	
}
