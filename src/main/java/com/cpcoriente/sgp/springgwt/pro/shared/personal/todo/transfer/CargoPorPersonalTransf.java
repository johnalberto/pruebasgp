/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.personal.todo.transfer;


import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.CargoPorPersonalDO;
import com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao.IPersonalDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.ICargoPorPersonalTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.ICargoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.IContratoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.CargoPorPersonalTO;

/**
 * @author CPC-04
 *
 */
public class CargoPorPersonalTransf implements ICargoPorPersonalTransf {

	
	private ICargoTransf getCargoTransf() {
        return TransfFactory.getInstance().getCargoTransf();
    }
	
	private IPersonalDAO getPersonalDAO() {
        return DAOFactory.getInstance().getPersonalDao();
    }
	
	private IContratoTransf getContratoTransf() {
        return TransfFactory.getInstance().getContratoTransf();
    }
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.ICargoPorPersonalTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.CargoPorPersonalTO)
	 */
	public CargoPorPersonalDO transferirTODO(CargoPorPersonalTO cargoPorPersonalTO) {
		
		CargoPorPersonalDO cppDO = new CargoPorPersonalDO();
		
		if (cargoPorPersonalTO.getId() != null) {
			cppDO.setId(cargoPorPersonalTO.getId());
		}
		
		if (cargoPorPersonalTO.getCargo() != null) {
			cppDO.setCargo(getCargoTransf().transferirTODO(cargoPorPersonalTO.getCargo()));
		}
		
		if (cargoPorPersonalTO.getPersona() != null) {
			cppDO.setPersona(getPersonalDAO().cargar(cargoPorPersonalTO.getPersona().getId()));
		}
		
		if(cargoPorPersonalTO.getContrato() != null) {
			cppDO.setContrato(getContratoTransf().transferirTODO(cargoPorPersonalTO.getContrato()));
		}
		
		
		return cppDO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.ICargoPorPersonalTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.personal.entity.CargoPorPersonalDO)
	 */
	public CargoPorPersonalTO transferirDOTO(CargoPorPersonalDO cargoPorPersonalDO) {


		CargoPorPersonalTO cppTO = new CargoPorPersonalTO();
		
		cppTO.setId(cargoPorPersonalDO.getId());
		
		
		if (cargoPorPersonalDO.getCargo() != null) {
			cppTO.setCargo(getCargoTransf().transferirDOTO(cargoPorPersonalDO.getCargo()));
		}
		
		if(cargoPorPersonalDO.getContrato() != null) {
			cppTO.setContrato(getContratoTransf().transferirDOTO(cargoPorPersonalDO.getContrato()));
		}
		
		return cppTO;
	}

}
