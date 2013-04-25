package com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao;

import java.util.List;
import java.util.Set;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.TerminoConvocatoriaDO;

public interface ITerminoConvocatoriaDAO {
	
	public abstract TerminoConvocatoriaDO cargar(Long idTermino);
	public abstract TerminoConvocatoriaDO persistir(TerminoConvocatoriaDO termino) ;
	public abstract TerminoConvocatoriaDO modificar(TerminoConvocatoriaDO termino) ;
	public abstract boolean eliminar(Long idTermino);
	public abstract List<TerminoConvocatoriaDO> listarTodo();
	public abstract List<TerminoConvocatoriaDO> seleccionPorNombre(String parteNombre);
	public abstract List<TerminoConvocatoriaDO> seleccionPorProyecto(Long idProyecto);
	public abstract boolean persistirList(Set<TerminoConvocatoriaDO> reqDetList);
}
