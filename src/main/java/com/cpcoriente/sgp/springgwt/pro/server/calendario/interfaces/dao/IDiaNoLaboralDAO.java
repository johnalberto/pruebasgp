/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.calendario.interfaces.dao;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.cpcoriente.sgp.springgwt.pro.server.calendario.entity.DiaNoLaboralDO;



/**
 * @author CPC-04
 *
 */
public interface IDiaNoLaboralDAO {
	
	public abstract DiaNoLaboralDO cargar(Long idDiaNoLaboral);
	public abstract List<DiaNoLaboralDO> persistir(Set<DiaNoLaboralDO> diaNoLaboralSet) ;
	public abstract DiaNoLaboralDO modificar(DiaNoLaboralDO diaNoLaboral) ;
	public abstract boolean eliminar(Long idDiaNoLaboral);
	public abstract List<DiaNoLaboralDO> listarTodoPorEmpresa(Long idEmpresa);
	public abstract List<DiaNoLaboralDO> seleccionPorRangofechas(Long idEmpresa, Date fechaInicio, Date fechaFin);
	

}
