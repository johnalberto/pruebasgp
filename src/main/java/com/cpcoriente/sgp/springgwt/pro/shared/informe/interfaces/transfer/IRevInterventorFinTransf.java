package com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.RevInterventorFinDO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.RevInterventorFinTO;

public interface IRevInterventorFinTransf {
	
	public abstract RevInterventorFinDO transferirTODO(RevInterventorFinTO revisionTO);
	public abstract RevInterventorFinTO transferirDOTO(RevInterventorFinDO revisionDO);

}
