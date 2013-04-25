package com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.UnidadDO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.UnidadTO;

public interface IUnidadTransf {

	public abstract UnidadDO transferirTODO(UnidadTO unidadTO);
	public abstract UnidadTO transferirDOTO(UnidadDO unidadDO);
}
