package com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.ConvocatoriaDO;


public interface IConvocatoriaDAO {

	public abstract ConvocatoriaDO cargar(Long idConvocatoria);
	public abstract ConvocatoriaDO persistir(ConvocatoriaDO convocatoria) ;
	public abstract ConvocatoriaDO modificar(ConvocatoriaDO convocatoria) ;
	public abstract boolean eliminar(Long idConvocatoria);
	public abstract List<ConvocatoriaDO> listarTodo();
	public abstract List<ConvocatoriaDO> seleccionPorDivision(Long idDivision);
}
