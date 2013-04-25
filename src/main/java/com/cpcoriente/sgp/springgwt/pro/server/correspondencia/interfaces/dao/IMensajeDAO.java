package com.cpcoriente.sgp.springgwt.pro.server.correspondencia.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.entity.MensajeDO;

public interface IMensajeDAO {
	
	public abstract MensajeDO cargar(Long idMensaje);
	public abstract MensajeDO persistir(MensajeDO mensaje) ;
	public abstract MensajeDO modificar(MensajeDO mensaje) ;
	public abstract boolean eliminar(Long idMensaje);
	public abstract List<MensajeDO> listarTodo( Long idProyecto);
	public abstract List<MensajeDO> seleccionPorPersonaEnvia(Long idPersona);
	public abstract List<MensajeDO> seleccionPorPersonaEnviaProyecto(Long idPersona,Long idProyecto);
	public abstract List<MensajeDO> seleccionPorPersonaRespuesta(Long idPersona);
	public abstract List<MensajeDO> seleccionPorPersonaRespuestaProyecto(Long idPersona,Long idProyecto);


}
