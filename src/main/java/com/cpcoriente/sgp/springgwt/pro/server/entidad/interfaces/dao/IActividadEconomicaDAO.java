package com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.ActividadEconomicaDO;

public interface IActividadEconomicaDAO {

	public abstract ActividadEconomicaDO cargar(Long idActividad);
	public abstract ActividadEconomicaDO persistir(ActividadEconomicaDO actividad) ;
	public abstract ActividadEconomicaDO modificar(ActividadEconomicaDO actividad) ;
	public abstract boolean eliminar(Long idActividad);
	public abstract List<ActividadEconomicaDO> listarTodo();
	public abstract List<ActividadEconomicaDO> seleccionPorNombre(String parteNombre);
	
}
