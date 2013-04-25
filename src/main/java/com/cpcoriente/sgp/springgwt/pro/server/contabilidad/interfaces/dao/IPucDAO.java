/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.contabilidad.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.PucDO;



/**
 * @author CPC-04
 *
 */
public interface IPucDAO {
	
	public abstract PucDO cargar(Long idPuc);
	public abstract PucDO persistir(PucDO puc) ;
	public abstract PucDO modificar(PucDO puc) ;
	public abstract boolean eliminar(Long idPuc);
	public abstract List<PucDO> listarTodo(Long idEntidad);
	public abstract List<PucDO> seleccionPorNombreCodigo(Long idEntidad, String parteNombreCodigo);

}
