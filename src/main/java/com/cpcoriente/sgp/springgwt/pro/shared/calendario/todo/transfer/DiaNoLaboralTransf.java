/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.calendario.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.calendario.entity.DiaNoLaboralDO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.calendario.interfaces.transfer.IDiaNoLaboralTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.calendario.objeto.DiaNoLaboralTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IEmpresaTransf;

/**
 * @author CPC-04
 *
 */
public class DiaNoLaboralTransf implements IDiaNoLaboralTransf {

	private IEmpresaTransf getEmpresaTrans() {
		return TransfFactory.getInstance().getEmpresaTransf();
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.calendario.interfaces.transfer.IDiaNoLaboralTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.calendario.objeto.DiaNoLaboralTO)
	 */
	public DiaNoLaboralDO transferirTODO(DiaNoLaboralTO diaNoLaboralTO) {
	
		
		DiaNoLaboralDO diaNoLaboralDO =  new DiaNoLaboralDO();
		
		if (diaNoLaboralTO.getId() != null ) {
			diaNoLaboralDO.setId(diaNoLaboralTO.getId());
		}
		
		diaNoLaboralDO.setDescripcion(diaNoLaboralTO.getDescripcion());
		diaNoLaboralDO.setFechaDia(diaNoLaboralTO.getFechaDia());
		
		if (diaNoLaboralTO.getEmpresa() != null) {
			diaNoLaboralDO.setEmpresa(getEmpresaTrans().transferirTODO(diaNoLaboralTO.getEmpresa()));
		}
		
		
		return diaNoLaboralDO;
	}

	

	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.calendario.interfaces.transfer.IDiaNoLaboralTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.calendario.entity.DiaNoLaboralDO)
	 */
	public DiaNoLaboralTO transferirDOTO(DiaNoLaboralDO diaNoLaboralDO) {

		DiaNoLaboralTO diaNoLaboralTO =  new DiaNoLaboralTO();
		
		diaNoLaboralTO.setId(diaNoLaboralDO.getId());
	
		
		diaNoLaboralTO.setDescripcion(diaNoLaboralDO.getDescripcion());
		diaNoLaboralTO.setFechaDia(diaNoLaboralDO.getFechaDia());
		
		if (diaNoLaboralDO.getEmpresa() != null) {
			diaNoLaboralTO.setEmpresa(getEmpresaTrans().transferirDOTO(diaNoLaboralDO.getEmpresa()));
		}
		
		return diaNoLaboralTO;
	}

}
