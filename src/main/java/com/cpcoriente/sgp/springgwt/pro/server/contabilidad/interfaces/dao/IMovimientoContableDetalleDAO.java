/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.contabilidad.interfaces.dao;

import java.util.Set;

import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.MovimientoContableDetalleDO;
/**
 * @author CPC-04
 *
 */
public interface IMovimientoContableDetalleDAO {
	
	public abstract MovimientoContableDetalleDO cargar(Long idMovimientoContableDetalle);
	public abstract boolean persistir(Set<MovimientoContableDetalleDO> movimientoContableDetSet) ;

}
