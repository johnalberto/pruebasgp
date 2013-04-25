/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao;

import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.LogUsuarioDO;

/**
 * @author CPC-04
 *
 */
public interface ILogUsuarioDAO {
	public abstract LogUsuarioDO cargar(Long idLog);
	public abstract LogUsuarioDO persistir(LogUsuarioDO log) ;
	public abstract List<LogUsuarioDO> seleccionPorGeneral(Long idEmpresa, Date fechaIni, Date fechaFin, String idUsuario, String idPagina, String idAccion);
	public abstract LogUsuarioDO selectUltimaFechaUser (Long idEmpresa, String userName);
}
