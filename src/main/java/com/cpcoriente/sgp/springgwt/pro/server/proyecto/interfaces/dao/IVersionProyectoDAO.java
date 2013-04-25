package com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao;

import java.util.Date;
import java.util.List;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.VersionProyectoDO;

public interface IVersionProyectoDAO {
	
	public abstract VersionProyectoDO cargar(Long idVersion);
	public abstract VersionProyectoDO persistir(VersionProyectoDO version) ;
	public abstract VersionProyectoDO modificar(VersionProyectoDO version) ;
	public abstract boolean eliminar(Long idVersion);
	public abstract List<VersionProyectoDO> seleccionPorproyectoFecha(Long idProyecto,Date fechaInicio,Date fechaFin);
	public abstract List<VersionProyectoDO> seleccionPorProyecto(Long idProyecto);

}
