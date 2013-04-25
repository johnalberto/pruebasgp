package com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.DocTerminoConvocatoriaDO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DocTerminoConvocatoriaTO;

public interface IDocTerminoTransf {

	public abstract DocTerminoConvocatoriaDO transferirTODO(DocTerminoConvocatoriaTO docTerminoTO);
	public abstract DocTerminoConvocatoriaTO transferirDOTO(DocTerminoConvocatoriaDO docTerminoDO);
}
