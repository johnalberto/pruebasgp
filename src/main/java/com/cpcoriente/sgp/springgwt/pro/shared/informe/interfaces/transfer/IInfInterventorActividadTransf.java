package com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InfoInterActividadDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InfoInterActividadDetalleTO;

public interface IInfInterventorActividadTransf {
	
	public abstract InfoInterActividadDetalleDO transferirTODO(InfoInterActividadDetalleTO informeTO);
	public abstract InfoInterActividadDetalleTO transferirDOTO(InfoInterActividadDetalleDO informeDO);

}
