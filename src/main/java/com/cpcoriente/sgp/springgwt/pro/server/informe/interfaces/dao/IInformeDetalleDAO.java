/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao;

import java.util.List;
import java.util.Set;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InformeDetalleDO;

/**
 * @author CPC-04
 *
 */
public interface IInformeDetalleDAO {

	
	public abstract InformeDetalleDO cargar(Long idInformeDetalle);
	public abstract List<InformeDetalleDO> persistir(Set<InformeDetalleDO> informeDetalleSet) ;
	public abstract InformeDetalleDO modificar(InformeDetalleDO informeDetalle) ;
	public abstract boolean eliminar(Long idInformeDetalle);
	
}
