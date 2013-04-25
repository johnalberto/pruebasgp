package com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.UnidadDO;

public interface IUnidadDAO {

	public abstract UnidadDO cargar(Long idUnidad);
	public abstract UnidadDO persistir(UnidadDO unidad) ;
	public abstract UnidadDO modificar(UnidadDO unidad) ;
	public abstract boolean eliminar(Long idUnidad);
	public abstract List<UnidadDO> listarTodo( Long idUnidad);
	
}
