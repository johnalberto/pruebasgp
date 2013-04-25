package com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.RevInterventorFinDetDO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.RevInterventorFinDetTO;

public interface IRevInterventorFinDetTransf {
	
	public abstract RevInterventorFinDetDO transferirTODO(RevInterventorFinDetTO revisionTO);
	public abstract RevInterventorFinDetTO transferirDOTO(RevInterventorFinDetDO revisionDO);

}
