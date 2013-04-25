/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao;

import java.util.List;
import java.util.Set;

import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.DocContratoDO;

/**
 * @author CPC-04
 *
 */
public interface IDocContratoDAO {

	public abstract DocContratoDO cargar(Long idDocContrato);
	public abstract List<DocContratoDO> persistir(Set<DocContratoDO> docContratoList);
	public abstract DocContratoDO modificar(DocContratoDO docContrato);
	public abstract boolean eliminar(List<Long> idDocContratoLista) ;
	public abstract List<DocContratoDO> seleccionPorContrato(Long idContrato);
	
	
}
