package com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InformeInterventorFinDO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InformeInterventorFinTO;

public interface IInformeInterventorFinTransf {
	
	public abstract InformeInterventorFinDO transferirTODO(InformeInterventorFinTO informeTO);
	public abstract InformeInterventorFinTO transferirDOTO(InformeInterventorFinDO informeDO);


}
