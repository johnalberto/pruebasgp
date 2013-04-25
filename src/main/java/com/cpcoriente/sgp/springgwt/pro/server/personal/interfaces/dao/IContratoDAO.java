/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao;

import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.ContratoDO;

/**
 * @author CPC-04
 *
 */
public interface IContratoDAO {
	
	public abstract ContratoDO cargar(Long idContrato);
	public abstract ContratoDO persistir(ContratoDO contratoList);
	public abstract ContratoDO modificar(ContratoDO contrato);
	public abstract boolean eliminar(Long idContratoLista) ;
}
