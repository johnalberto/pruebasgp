package com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ContactoProyectoEntidadDO;

public interface IContactoProyectoEntidadDAO {
	
	public abstract ContactoProyectoEntidadDO cargar(Long idContacto);
	public abstract ContactoProyectoEntidadDO persistir(ContactoProyectoEntidadDO contacto) ;
	public abstract ContactoProyectoEntidadDO modificar(ContactoProyectoEntidadDO contacto) ;
	public abstract boolean eliminar(Long idProyecto);
	public abstract List<ContactoProyectoEntidadDO> listarTodo();
	public abstract List<ContactoProyectoEntidadDO> seleccionParteNombre(String parteNombre);
	public abstract List<ContactoProyectoEntidadDO> seleccionPorProyecto(Long idProyecto);
	public abstract List<ContactoProyectoEntidadDO> seleccionPorProyectoEntidad(Long idProyecto,Long idEntidad);
	

}
