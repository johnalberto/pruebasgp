package com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RecursoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RecursoTO;

public interface IRecursoTransf {
	
	public abstract RecursoDO transferirTODO(RecursoTO recursoTO);
	public abstract RecursoTO transferirDOTO(RecursoDO recursoDO);

}
