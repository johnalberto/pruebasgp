package com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.entity.DocMensajeDO;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.objeto.DocMensajeTO;

public interface IDocMensajeTransf {
	
	public abstract DocMensajeDO transferirTODO(DocMensajeTO docMensajeTO);
	public abstract DocMensajeTO transferirDOTO(DocMensajeDO docMensajeDO);

}
