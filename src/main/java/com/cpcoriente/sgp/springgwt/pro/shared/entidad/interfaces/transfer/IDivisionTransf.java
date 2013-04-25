package com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.DivisionDO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO;

public interface IDivisionTransf {

	public abstract DivisionDO transferirTODO(DivisionTO divisionTO);
	public abstract DivisionTO transferirDOTO(DivisionDO divisionDO);
}
