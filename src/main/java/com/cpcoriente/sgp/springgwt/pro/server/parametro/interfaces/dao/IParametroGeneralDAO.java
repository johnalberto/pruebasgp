package com.cpcoriente.sgp.springgwt.pro.server.parametro.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.parametro.entity.ParametroGeneralDO;

public interface IParametroGeneralDAO {
	
	public abstract ParametroGeneralDO cargar(String idParametro);
	public abstract ParametroGeneralDO modificar(ParametroGeneralDO parametro) ;
	public abstract boolean eliminar(String idParametro);
	public abstract List<ParametroGeneralDO> listarTodo();
	public abstract List<ParametroGeneralDO> buscarPorDescripcion(String descripcion);
	
}
