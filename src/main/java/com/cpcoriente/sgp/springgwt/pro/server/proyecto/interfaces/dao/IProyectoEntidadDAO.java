package com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao;

import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ProyectoEntidadDO;

public interface IProyectoEntidadDAO {
	
	public abstract ProyectoEntidadDO cargar(Long idProyEnt);
	public abstract ProyectoEntidadDO persistir(ProyectoEntidadDO proyEnt) ;
	public abstract ProyectoEntidadDO modificar(ProyectoEntidadDO proyEnt) ;
	public abstract boolean eliminar(Long idProyEnt);

}
