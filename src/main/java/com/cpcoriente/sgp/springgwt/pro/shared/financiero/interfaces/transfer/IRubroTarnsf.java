package com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RubroDO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RubroTO;

public interface IRubroTarnsf {
	
	public abstract RubroDO transferirTODO(RubroTO rubroTO);
	public abstract RubroTO transferirDOTO(RubroDO rubroDO);

}
