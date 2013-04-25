/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.ejecucion.interfaces.dao;

import java.util.List;
import java.util.Set;

import com.cpcoriente.sgp.springgwt.pro.server.ejecucion.entity.DocEjecucionPresupuestoDO;



/**
 * @author CPC-04
 *
 */


public interface IDocEjecucionPresupuestoDAO {
	
	
	public abstract DocEjecucionPresupuestoDO cargar(Long idDocEjecucionPresupuesto);
	public abstract List<DocEjecucionPresupuestoDO> persistir(Set<DocEjecucionPresupuestoDO> docEjecucionPresupuestoList);
	public abstract DocEjecucionPresupuestoDO modificar(DocEjecucionPresupuestoDO docEjecucionPresupuesto);
	public abstract boolean eliminar(List<Long> idDocEjecucionPresupuestoLista) ;
	public abstract List<DocEjecucionPresupuestoDO> seleccionPorEjecucionPresupuesto(Long idEjecucionPresupuesto);

}
