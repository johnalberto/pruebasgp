/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao;

import java.util.List;
import java.util.Set;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.DocObjetivoDO;


/**
 * @author CPC-04
 *
 */
public interface IDocObjetivoDAO {
	
	public abstract DocObjetivoDO cargar(Long idDocObjetivo);
	public abstract List<DocObjetivoDO> persistir(Set<DocObjetivoDO> docObjetivoSet);
	public abstract DocObjetivoDO modificar(DocObjetivoDO docObjetivo);
	public abstract boolean eliminar(List<Long> idDocObjetivoLista) ;
	public abstract List<DocObjetivoDO> seleccionPorObjetivo(Long idObjetivo);

}
