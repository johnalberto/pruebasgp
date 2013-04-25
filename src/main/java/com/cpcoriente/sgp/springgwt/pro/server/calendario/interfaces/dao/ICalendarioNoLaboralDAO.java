/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.calendario.interfaces.dao;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.cpcoriente.sgp.springgwt.pro.server.calendario.entity.CalendarioNoLaboralDO;



/**
 * @author CPC-04
 *
 */
public interface ICalendarioNoLaboralDAO {

	
	public abstract CalendarioNoLaboralDO cargar(Long idCalendarioNoLaboral);
	public abstract List<CalendarioNoLaboralDO> persistir(Set<CalendarioNoLaboralDO> calendarioNoLaboralSet) ;
	public abstract CalendarioNoLaboralDO modificar(CalendarioNoLaboralDO calendarioNoLaboral) ;
	public abstract boolean eliminar(Long idCalendarioNoLaboral);
	public abstract List<CalendarioNoLaboralDO> listarTodoPorProyecto(Long idProyecto);
	public abstract List<CalendarioNoLaboralDO> seleccionPorRangofechas(Long idProyecto, Date fechaInicio, Date fechaFin);
	
	
}
