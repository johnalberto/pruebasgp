package com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.VersionProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.VersionProyectoTO;

public interface IVersionProyectoTransf {
	
	public abstract VersionProyectoDO transferirTODO(VersionProyectoTO versionTO);
	public abstract VersionProyectoTO transferirDOTO(VersionProyectoDO versionDO);

}
