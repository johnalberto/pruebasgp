/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InfoInterEntregableDetalleDO;



/**
 * @author CPC-04
 *
 */
public interface IInfoInterEntregableDetalleDAO {
	
	public abstract InfoInterEntregableDetalleDO cargar(Long idInfoInterEntregableDetalle);
	public abstract InfoInterEntregableDetalleDO persistir(InfoInterEntregableDetalleDO infoInterEntregableDetalle) ;
	public abstract InfoInterEntregableDetalleDO modificar(InfoInterEntregableDetalleDO infoInterEntregableDetalle) ;
	public abstract boolean eliminar(Long idInfoInterEntregableDetalle);

}
