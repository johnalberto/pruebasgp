/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.parametro.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.parametro.entity.ParametroPorProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.parametro.interfaces.transfer.IParametroPorProyectoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.parametro.objeto.ParametroPorProyectoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IProyectoTransf;

/**
 * @author CPC-04
 *
 */
public class ParametroPorProyectoTransf implements IParametroPorProyectoTransf{
	
	private IProyectoTransf getProyectoTrans() {
		return TransfFactory.getInstance().getProyectoTransf();
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.parametro.interfaces.transfer.IParametroPorProyectoTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.parametro.objeto.ParametroPorProyectoTO)
	 */
	public ParametroPorProyectoDO transferirTODO(ParametroPorProyectoTO parametroPorProyectoTO) {
		
		ParametroPorProyectoDO parametroPorProyectoDO = new ParametroPorProyectoDO();
		
		if (parametroPorProyectoTO.getId() != null) {
			parametroPorProyectoDO.setId(parametroPorProyectoTO.getId());
		}
		
		parametroPorProyectoDO.setValor(parametroPorProyectoTO.getValor());
		parametroPorProyectoDO.setDescripcion(parametroPorProyectoTO.getDescripcion());
		parametroPorProyectoDO.setFechaModificacion(parametroPorProyectoTO.getFechaModificacion());
		
		if (parametroPorProyectoTO.getProyecto() != null) {
			parametroPorProyectoDO.setProyecto(getProyectoTrans().transferirTODO(parametroPorProyectoTO.getProyecto()));
		}
		
		return parametroPorProyectoDO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.parametro.interfaces.transfer.IParametroPorProyectoTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.parametro.entity.ParametroPorProyectoDO)
	 */
	public ParametroPorProyectoTO transferirDOTO(ParametroPorProyectoDO parametroPorProyectoDO) {
		
		ParametroPorProyectoTO parametroPorProyectoTO = new ParametroPorProyectoTO();

		parametroPorProyectoTO.setId(parametroPorProyectoDO.getId());
		parametroPorProyectoTO.setDescripcion(parametroPorProyectoDO.getDescripcion());
		parametroPorProyectoTO.setFechaModificacion(parametroPorProyectoDO.getFechaModificacion());
		parametroPorProyectoTO.setValor(parametroPorProyectoDO.getValor());
		
		if (parametroPorProyectoDO.getProyecto() != null) {
			parametroPorProyectoTO.setProyecto(getProyectoTrans().transferirDOTO(parametroPorProyectoDO.getProyecto()));
		}
		
		
		return parametroPorProyectoTO;
		
	}

}
