/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ProductoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ProductoTO;

/**
 * @author CPC-04
 *
 */
public interface IProductoTransf {

	public abstract ProductoDO transferirTODO(ProductoTO productoTO);
	public abstract ProductoTO transferirDOTO(ProductoDO productoDO);
	
}
