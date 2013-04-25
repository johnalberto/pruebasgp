/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao;

import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.ClausulaContratoDO;

/**
 * @author CPC-04
 *
 */
public interface IClausulaContratoDAO {
	
	public abstract ClausulaContratoDO cargar(Long idClausulaContrato);
	public abstract ClausulaContratoDO persistir(ClausulaContratoDO clausulaContratoList);
	public abstract ClausulaContratoDO modificar(ClausulaContratoDO clausulaContrato);
	public abstract boolean eliminar(Long idClausulaContratoLista) ;
	

}
