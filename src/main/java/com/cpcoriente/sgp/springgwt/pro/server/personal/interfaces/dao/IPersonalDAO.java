/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.PersonalDO;

/**
 * @author CPC-04
 *
 */
public interface IPersonalDAO {
	
	public abstract PersonalDO cargar(Long idPersonal);
	public abstract PersonalDO persistir(PersonalDO personalList);
	public abstract PersonalDO modificar(PersonalDO personal);
	public abstract boolean eliminar(Long idPersonalLista) ;
	public abstract List<PersonalDO> listarSeleccionGeneral(Long idCargo, Boolean activo, String numDocNombre); 
}
