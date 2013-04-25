package com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.VersionRecursoDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.VersionRecursoDetalleTO;

public interface IVersionRecursoDetalleTransf {
	
	public abstract VersionRecursoDetalleDO transferirTODO(VersionRecursoDetalleTO versionTO);
	public abstract VersionRecursoDetalleTO transferirDOTO(VersionRecursoDetalleDO versionDO);

}
