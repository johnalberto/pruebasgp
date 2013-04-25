/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.contabilidad.interfaces.dao;

import java.util.List;
import java.util.Set;

import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.PucPorProyectoDO;

/**
 * @author CPC-04
 *
 */
public interface IPucPorProyectoDAO {
	
	public abstract PucPorProyectoDO cargar(Long idPucPorProyecto);
	public abstract List<PucPorProyectoDO> persistir(Set<PucPorProyectoDO> pucPorProyectoSet) ;
	public abstract boolean eliminar(Long idPucPorProyecto);
	public abstract List<PucPorProyectoDO> listarTodoPorProyecto(Long idProyecto);
	public abstract List<PucPorProyectoDO> seleccionPorNombreCodigo(Long idProyecto, String parteNombreCodigo);


}
