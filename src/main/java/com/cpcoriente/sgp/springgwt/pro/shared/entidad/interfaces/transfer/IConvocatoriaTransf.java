package com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.ConvocatoriaDO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.ConvocatoriaTO;

public interface IConvocatoriaTransf {

	public abstract ConvocatoriaDO transferirTODO(ConvocatoriaTO convocatoriaTO);
	public abstract ConvocatoriaTO transferirDOTO(ConvocatoriaDO convocatoriaDO);
}
