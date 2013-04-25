/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.contabilidad.interfaces.dao;

import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.MovimientoContableDO;



/**
 * @author CPC-04
 *
 */
public interface IMovimientoContableDAO {
	
	public abstract MovimientoContableDO cargar(Long idMovimientoContable);
	public abstract MovimientoContableDO persistir(MovimientoContableDO movimientoContable) ;
	public abstract List<MovimientoContableDO> listarTodoPorProyecto(Long idProyecto);
	public abstract List<MovimientoContableDO> seleccionPorCuenta(Long idProyecto, Long idCuentaPuc);
	public abstract List<MovimientoContableDO> seleccionPorRangofechas(Long idProyecto, Date fechaInicio, Date fechaFin);
	public abstract List<MovimientoContableDO> seleccionPorEjecucion(Long idProyecto, Long idEjecPres);
	public abstract List<MovimientoContableDO> seleccionPorRecursoDet(Long idProyecto, Long idRecursoDet);

}
