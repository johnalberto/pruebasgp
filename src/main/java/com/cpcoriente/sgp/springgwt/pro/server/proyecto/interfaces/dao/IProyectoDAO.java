package com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao;

import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ProyectoDO;

public interface IProyectoDAO {

	public abstract ProyectoDO cargar(Long idProyecto);
	public abstract ProyectoDO persistir(ProyectoDO proyecto) ;
	public abstract ProyectoDO modificar(ProyectoDO proyecto) ;
	public abstract boolean eliminar(Long idProyecto);
	public abstract List<ProyectoDO> listarTodo(Long idDivision);
	public abstract List<ProyectoDO> seleccionPorTitulo(String titulo);
	public abstract List<ProyectoDO> seleccionPorCodigo(String codigo);
	public abstract List<ProyectoDO> seleccionPorFechaInicio(Date fechaInicio,Date fechaFin);
	public abstract List<ProyectoDO> seleccionPorConvocatoria(Long idConvocatoria);
	public abstract List<ProyectoDO> seleccionPorEstado(int estado);
	public abstract List<ProyectoDO> seleccionPorGeneral(String codigo, String  titulo,
			Long idConvocatoria, int estado,Date fechaIni, Date fechaFin,Long idEmpresa);

}
