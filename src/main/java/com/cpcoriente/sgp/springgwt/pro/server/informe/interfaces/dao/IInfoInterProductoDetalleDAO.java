/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InfoInterProductoDetalleDO;

/**
 * @author CPC-04
 *
 */
public interface IInfoInterProductoDetalleDAO {
	
	public abstract InfoInterProductoDetalleDO cargar(Long idInfoInterProductoDetalle);
	public abstract InfoInterProductoDetalleDO persistir(InfoInterProductoDetalleDO infoInterProductoDetalle) ;
	public abstract InfoInterProductoDetalleDO modificar(InfoInterProductoDetalleDO infoInterProductoDetalle) ;
	public abstract boolean eliminar(Long idInfoInterProductoDetalle);

}
