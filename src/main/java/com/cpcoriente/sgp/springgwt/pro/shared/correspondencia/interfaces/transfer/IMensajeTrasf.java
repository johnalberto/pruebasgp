package com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.entity.MensajeDO;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.objeto.MensajeTO;

public interface IMensajeTrasf {
	
	public abstract MensajeDO transferirTODO(MensajeTO mensajeTO);
	public abstract MensajeTO transferirDOTO(MensajeDO mensajeDO);

}
