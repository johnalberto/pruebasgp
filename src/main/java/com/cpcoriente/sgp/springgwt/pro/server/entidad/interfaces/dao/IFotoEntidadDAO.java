package com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.FotoEntidadDO;

public interface IFotoEntidadDAO {
	
	public abstract FotoEntidadDO cargar(Long idFoto);
	public abstract FotoEntidadDO persistir(FotoEntidadDO foto) ;
	public abstract FotoEntidadDO modificar(FotoEntidadDO foto) ;
	public abstract boolean eliminar(Long idFoto);
	public abstract List<FotoEntidadDO> listarPorEntidad(Long idEntidad);


}
