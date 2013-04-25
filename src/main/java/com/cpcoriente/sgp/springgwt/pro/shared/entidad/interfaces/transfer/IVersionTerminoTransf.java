package com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.VersionTerminoConvocatoriaDO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.VersionTerminoConvocatoriaTO;

public interface IVersionTerminoTransf {

	public abstract VersionTerminoConvocatoriaDO transferirTODO(VersionTerminoConvocatoriaTO versionTO);
	public abstract VersionTerminoConvocatoriaTO transferirDOTO(VersionTerminoConvocatoriaDO versionDO);
}
