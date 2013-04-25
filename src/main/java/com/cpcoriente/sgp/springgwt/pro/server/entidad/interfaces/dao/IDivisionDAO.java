package com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.DivisionDO;


public interface IDivisionDAO {
	
	public abstract DivisionDO cargar(Long idDivision);
	public abstract DivisionDO persistir(DivisionDO division) ;
	public abstract DivisionDO modificar(DivisionDO division) ;
	public abstract boolean eliminar(Long idEntidad);
	public abstract List<DivisionDO> listarTodo();
	public abstract List<DivisionDO> seleccionPorEntidad(Long idEntidad);
	public abstract List<DivisionDO> seleccionPorNombre(String parteNombre);


}
