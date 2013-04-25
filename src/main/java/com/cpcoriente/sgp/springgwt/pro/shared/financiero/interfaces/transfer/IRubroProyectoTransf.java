package com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RubroProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RubroProyectoTO;

public interface IRubroProyectoTransf {
	
	public abstract RubroProyectoDO transferirTODO(RubroProyectoTO rubroTO);
	public abstract RubroProyectoTO transferirDOTO(RubroProyectoDO rubroDO);


}
