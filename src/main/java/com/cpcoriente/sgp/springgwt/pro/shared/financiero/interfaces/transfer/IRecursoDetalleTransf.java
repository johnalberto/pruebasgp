package com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RecursoDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RecursoDetalleTO;

public interface IRecursoDetalleTransf {
	
	public abstract RecursoDetalleDO transferirTODO(RecursoDetalleTO recursoDetTO);
	public abstract RecursoDetalleTO transferirDOTO(RecursoDetalleDO recursoDetDO);

}
