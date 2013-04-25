/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.ejecucion.interfaces.dao;

import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.ejecucion.entity.EjecucionPresupuestoDO;


/**
 * @author CPC-04
 *
 */


public interface IEjecucionPresupuestoDAO {
	
	public abstract EjecucionPresupuestoDO cargar(Long idEjecucionPresupuesto);
	public abstract EjecucionPresupuestoDO persistir(EjecucionPresupuestoDO ejecucionPresupuesto) ;
	public abstract EjecucionPresupuestoDO modificar(EjecucionPresupuestoDO ejecucionPresupuesto) ;
	public abstract List<EjecucionPresupuestoDO> seleccionGeneral(Long idTercero, int tipoComprobante, String numComprobante, Date fechaRegIni, 
			Date fechaRegFin, Date fechaEjecIni, Date fechaEjecFin, Boolean aprobado, Boolean ejecutado, Long idRecurso, Long idProyectoEntidad);

}
