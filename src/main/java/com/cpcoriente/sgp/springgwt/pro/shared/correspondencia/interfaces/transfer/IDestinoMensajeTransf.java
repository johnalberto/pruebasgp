package com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.entity.DestinoMensajeDO;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.objeto.DestinoMensajeTO;

public interface IDestinoMensajeTransf {

	public abstract DestinoMensajeDO transferirTODO(DestinoMensajeTO desMensajeTO);
	public abstract DestinoMensajeTO transferirDOTO(DestinoMensajeDO desMensajeDO);
}
