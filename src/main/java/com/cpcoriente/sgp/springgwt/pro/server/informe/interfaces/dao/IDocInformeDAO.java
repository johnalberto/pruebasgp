/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao;

import java.util.List;
import java.util.Set;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.DocInformeDO;

/**
 * @author CPC-04
 *
 */
public interface IDocInformeDAO {
	
	public abstract DocInformeDO cargar(Long idDocInforme);
	public abstract List<DocInformeDO> persistir(Set<DocInformeDO> docInformeList);
	public abstract DocInformeDO modificar(DocInformeDO docInforme);
	public abstract boolean eliminar(List<Long> idDocInformeLista) ;
	public abstract List<DocInformeDO> seleccionPorInforme(Long idInforme);

}
