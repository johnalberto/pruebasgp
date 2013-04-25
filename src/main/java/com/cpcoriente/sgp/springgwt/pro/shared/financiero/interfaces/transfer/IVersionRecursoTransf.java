package com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.VersionRecursoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.VersionRecursoTO;

public interface IVersionRecursoTransf {
	
	public abstract VersionRecursoDO transferirTODO(VersionRecursoTO versionTO);
	public abstract VersionRecursoTO transferirDOTO(VersionRecursoDO versionDO);

}
