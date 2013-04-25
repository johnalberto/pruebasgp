/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao;

import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InformeDO;


/**
 * @author CPC-04
 *
 */
public interface IInformeDAO {
	
	public abstract InformeDO cargar(Long idInforme);
	public abstract InformeDO persistir(InformeDO informe) ;
	public abstract InformeDO modificar(InformeDO informe) ;
	public abstract boolean eliminar(Long idInforme);
	public abstract List<InformeDO> listarSeleccionGeneral(Long idPersona, Long idActividad, Date fechaRegIni, 
			Date fechaRegFin, Boolean vobo, String codigo);

}
