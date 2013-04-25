package com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.DocProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.DocProyectoTO;

public interface IDocProyectoTransf {
	
	public abstract DocProyectoDO transferirTODO(DocProyectoTO docProTO);
	public abstract DocProyectoTO transferirDOTO(DocProyectoDO docProDO);

}
