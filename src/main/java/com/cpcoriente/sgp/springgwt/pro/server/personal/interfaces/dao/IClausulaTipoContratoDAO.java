/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.ClausulaTipoContratoDO;

/**
 * @author CPC-04
 *
 */
public interface IClausulaTipoContratoDAO {

	
	public abstract ClausulaTipoContratoDO cargar(Long idClausulaTipoContrato);
	public abstract ClausulaTipoContratoDO persistir(ClausulaTipoContratoDO clausulaTipoContratoList);
	public abstract ClausulaTipoContratoDO modificar(ClausulaTipoContratoDO clausulaTipoContrato);
	public abstract boolean eliminar(Long idClausulaTipoContratoLista) ;
	public abstract List<ClausulaTipoContratoDO> listarPorEntidad(Long idEntidad);
	
}
