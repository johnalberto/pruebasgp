package com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InfoInterObjetivoDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InfoInterObjetivoDetalleTO;

public interface IInfInterventorObjetivoTransf {

	public abstract InfoInterObjetivoDetalleDO transferirTODO(InfoInterObjetivoDetalleTO informeTO);
	public abstract InfoInterObjetivoDetalleTO transferirDOTO(InfoInterObjetivoDetalleDO informeDO);
	
}
