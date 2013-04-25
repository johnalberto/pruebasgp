package com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.TerminoConvocatoriaDO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.TerminoConvocatoriaTO;

public interface ITerminoConvocatoriaTransf {
	
	public abstract TerminoConvocatoriaDO transferirTODO(TerminoConvocatoriaTO terminoTO);
	public abstract TerminoConvocatoriaTO transferirDOTO(TerminoConvocatoriaDO terminoDO);


}
