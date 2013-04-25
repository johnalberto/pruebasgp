/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.calendario.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.calendario.entity.CalendarioNoLaboralDO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.calendario.interfaces.transfer.ICalendarioNoLaboralTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.calendario.objeto.CalendarioNoLaboralTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IProyectoTransf;

/**
 * @author CPC-04
 *
 */
public class CalendarioNoLaboralTransf implements ICalendarioNoLaboralTransf {

	private IProyectoTransf getProyectoTrans() {
		return TransfFactory.getInstance().getProyectoTransf();
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.calendario.interfaces.transfer.ICalendarioNoLaboralTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.calendario.objeto.CalendarioNoLaboralTO)
	 */
	public CalendarioNoLaboralDO transferirTODO(CalendarioNoLaboralTO calendarioNoLaboralTO) {
	
		
		CalendarioNoLaboralDO calendarioNoLaboralDO =  new CalendarioNoLaboralDO();
		
		if (calendarioNoLaboralTO.getId() != null ) {
			calendarioNoLaboralDO.setId(calendarioNoLaboralTO.getId());
		}
		
		calendarioNoLaboralDO.setDescripcion(calendarioNoLaboralTO.getDescripcion());
		calendarioNoLaboralDO.setFechaDia(calendarioNoLaboralTO.getFechaDia());
		calendarioNoLaboralDO.setVersion(calendarioNoLaboralTO.getVersion());
		
		if (calendarioNoLaboralTO.getProyecto() != null) {
			calendarioNoLaboralDO.setProyecto(getProyectoTrans().transferirTODO(calendarioNoLaboralTO.getProyecto()));
		}
		
		
		return calendarioNoLaboralDO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.calendario.interfaces.transfer.ICalendarioNoLaboralTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.calendario.entity.CalendarioNoLaboralDO)
	 */
	public CalendarioNoLaboralTO transferirDOTO(CalendarioNoLaboralDO calendarioNoLaboralDO) {

		CalendarioNoLaboralTO calendarioNoLaboralTO =  new CalendarioNoLaboralTO();
		
		calendarioNoLaboralTO.setId(calendarioNoLaboralDO.getId());
	
		
		calendarioNoLaboralTO.setDescripcion(calendarioNoLaboralDO.getDescripcion());
		calendarioNoLaboralTO.setFechaDia(calendarioNoLaboralDO.getFechaDia());
		calendarioNoLaboralTO.setVersion(calendarioNoLaboralDO.getVersion());
		
		if (calendarioNoLaboralDO.getProyecto() != null) {
			calendarioNoLaboralTO.setProyecto(getProyectoTrans().transferirDOTO(calendarioNoLaboralDO.getProyecto()));
		}
		
		return calendarioNoLaboralTO;
	}

}
