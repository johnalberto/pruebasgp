package com.cpcoriente.sgp.springgwt.pro.server.correspondencia.interfaces.dao;

import java.util.List;
import java.util.Set;

import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.entity.DestinoMensajeDO;

public interface IDestinoMensajeDAO {
	
	public abstract DestinoMensajeDO cargar(Long idDesMensaje);
	public abstract DestinoMensajeDO persistir(DestinoMensajeDO desMensaje) ;
	public abstract DestinoMensajeDO modificar(DestinoMensajeDO desMensaje) ;
	public abstract boolean eliminar(Long idDesMensaje);
	public abstract List<DestinoMensajeDO> seleccionPorMensaje(Long idDesMensaje);
	public abstract boolean persistirList(Set<DestinoMensajeDO> desList);

}
