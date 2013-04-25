package com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.VersionTerminoConvocatoriaDO;

public interface IVersionTerminoConvocatoriaDAO {

	public abstract VersionTerminoConvocatoriaDO cargar(Long idVersion);
	public abstract VersionTerminoConvocatoriaDO persistir(VersionTerminoConvocatoriaDO version) ;
	public abstract VersionTerminoConvocatoriaDO modificar(VersionTerminoConvocatoriaDO version) ;
	public abstract boolean eliminar(Long idVersion);
}
