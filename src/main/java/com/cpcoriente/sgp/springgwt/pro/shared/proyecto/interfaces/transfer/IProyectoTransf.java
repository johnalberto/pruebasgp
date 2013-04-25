package com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.ProyectoTO;

public interface IProyectoTransf {
	
	public abstract ProyectoDO transferirTODO(ProyectoTO proyectoTO);
	public abstract ProyectoTO transferirDOTO(ProyectoDO proyectoDO);

}
