package com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InformeDO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InformeTO;

public interface IInformeTransf {

	public abstract InformeDO transferirTODO(InformeTO informeTO);
	public abstract InformeTO transferirDOTO(InformeDO informeDO);
	
}
