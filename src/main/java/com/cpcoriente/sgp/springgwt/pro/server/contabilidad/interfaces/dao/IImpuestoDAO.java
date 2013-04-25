/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.contabilidad.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.ImpuestoDO;


/**
 * @author CPC-04
 *
 */
public interface IImpuestoDAO {

	
	public abstract ImpuestoDO cargar(Long idImpuesto);
	public abstract ImpuestoDO persistir(ImpuestoDO impuesto) ;
	public abstract ImpuestoDO modificar(ImpuestoDO impuesto) ;
	public abstract boolean eliminar(Long idImpuesto);
	public abstract List<ImpuestoDO> listarTodo(Long idEmpresa);
	public abstract List<ImpuestoDO> seleccionPorNombre(Long idEmpresa, String parteNombre);
	
	
}
