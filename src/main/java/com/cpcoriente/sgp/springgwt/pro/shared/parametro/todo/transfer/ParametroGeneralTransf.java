package com.cpcoriente.sgp.springgwt.pro.shared.parametro.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.parametro.entity.ParametroGeneralDO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IEmpresaTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.parametro.interfaces.transfer.IParametroGeneralTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.parametro.objeto.ParametroGeneralTO;

/**
 * @author CPC-04
 *
 */


public class ParametroGeneralTransf implements IParametroGeneralTransf {

	private IEmpresaTransf getEmpresaTrans() {
		return TransfFactory.getInstance().getEmpresaTransf();
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.parametro.interfaces.transfer.IParametroGeneralTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.parametro.objeto.ParametroGeneralTO)
	 */
	public ParametroGeneralDO transferirTODO(ParametroGeneralTO parametroGeneralTO) {
		
		ParametroGeneralDO parametroGeneralDO = new ParametroGeneralDO();
		
		if (parametroGeneralTO.getId() != null) {
			parametroGeneralDO.setId(parametroGeneralTO.getId());
		}
		
		parametroGeneralDO.setValor(parametroGeneralTO.getValor());
		parametroGeneralDO.setDescripcion(parametroGeneralTO.getDescripcion());
		parametroGeneralDO.setFechaModificacion(parametroGeneralTO.getFechaModificacion());
		
		if (parametroGeneralTO.getEmpresa() != null) {
			parametroGeneralDO.setEmpresa(getEmpresaTrans().transferirTODO(parametroGeneralTO.getEmpresa()));
		}
		
		return parametroGeneralDO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.parametro.interfaces.transfer.IParametroGeneralTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.parametro.entity.ParametroGeneralDO)
	 */
	public ParametroGeneralTO transferirDOTO(ParametroGeneralDO parametroGeneralDO) {
		
		ParametroGeneralTO parametroGeneralTO = new ParametroGeneralTO();

		parametroGeneralTO.setId(parametroGeneralDO.getId());
		parametroGeneralTO.setDescripcion(parametroGeneralDO.getDescripcion());
		parametroGeneralTO.setFechaModificacion(parametroGeneralDO.getFechaModificacion());
		parametroGeneralTO.setValor(parametroGeneralDO.getValor());
		
		if (parametroGeneralDO.getEmpresa() != null) {
			parametroGeneralTO.setEmpresa(getEmpresaTrans().transferirDOTO(parametroGeneralDO.getEmpresa()));
		}
		
		
		return parametroGeneralTO;
		
	}

	
}
