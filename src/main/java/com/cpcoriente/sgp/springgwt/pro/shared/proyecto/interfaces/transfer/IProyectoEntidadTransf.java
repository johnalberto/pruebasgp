package com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ProyectoEntidadDO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.ProyectoEntidadTO;

public interface IProyectoEntidadTransf {

	
	public abstract ProyectoEntidadDO transferirTODO(ProyectoEntidadTO proEntTO);
	public abstract ProyectoEntidadTO transferirDOTO(ProyectoEntidadDO proEntDO);
}
