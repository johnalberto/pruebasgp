package com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.DocTerminoConvocatoriaDO;

public interface IDocTerminoConvocatoriaDAO {
	
	
	public abstract DocTerminoConvocatoriaDO cargar(Long idDocTer);
	public abstract DocTerminoConvocatoriaDO persistir(DocTerminoConvocatoriaDO docTermino);
	public abstract DocTerminoConvocatoriaDO modificar(DocTerminoConvocatoriaDO docTermino);
	public abstract boolean eliminar(Long idDocTer);
	public abstract List<DocTerminoConvocatoriaDO> listarPorTermino(Long idTermino);

}
