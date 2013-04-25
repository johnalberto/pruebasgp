package com.cpcoriente.sgp.springgwt.pro.shared.parametro.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.parametro.entity.ParametroGeneralDO;
import com.cpcoriente.sgp.springgwt.pro.shared.parametro.objeto.ParametroGeneralTO;

public interface IParametroGeneralTransf {

	
	public abstract ParametroGeneralDO transferirTODO(ParametroGeneralTO parametroGeneralTO);
	public abstract ParametroGeneralTO transferirDOTO(ParametroGeneralDO parametroGeneralDO);	
	
}
