package com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InformeInterventorDO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InformeInterventorTO;

public interface IInformeInterventorTransf {

	public abstract InformeInterventorDO transferirTODO(InformeInterventorTO informeTO);
	public abstract InformeInterventorTO transferirDOTO(InformeInterventorDO informeDO);
}
