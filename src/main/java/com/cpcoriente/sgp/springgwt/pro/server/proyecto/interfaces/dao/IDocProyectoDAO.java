package com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.DocProyectoDO;

public interface IDocProyectoDAO {
	
	public abstract DocProyectoDO cargar(Long idDocProyecto);
	public abstract DocProyectoDO persistir(DocProyectoDO docProyecto);
	public abstract DocProyectoDO modificar(DocProyectoDO docProyecto);
	public abstract boolean eliminar(Long idDocProyecto);
	public abstract List<DocProyectoDO> listarPorProyecto(Long idProyecto);

}
