/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.personal.todo.transfer;


import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.ClausulaContratoDO;
import com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao.IContratoDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.IClausulaContratoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.ClausulaContratoTO;

/**
 * @author CPC-04
 *
 */
public class ClausulaPorContratoTransf implements IClausulaContratoTransf{

	private IContratoDAO getContratoDAO() {
		return DAOFactory.getInstance().getContratoDao();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.IClausulaContratoTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.ClausulaContratoTO)
	 */
	public ClausulaContratoDO transferirTODO(ClausulaContratoTO clausulaContratoTO) {

		ClausulaContratoDO clausulaContratoDO = new ClausulaContratoDO();
		
		if (clausulaContratoTO.getId() != null) {
			clausulaContratoDO.setId(clausulaContratoTO.getId());
		}
		
		clausulaContratoDO.setParrafo(clausulaContratoTO.getParrafo());
		clausulaContratoDO.setVersion(clausulaContratoTO.getVersion());
		
		if (clausulaContratoTO.getContrato() != null) {
			clausulaContratoDO.setContrato(getContratoDAO().cargar(clausulaContratoTO.getContrato().getId()));
		}
		
		
		return clausulaContratoDO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.IClausulaContratoTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.personal.entity.ClausulaContratoDO)
	 */
	public ClausulaContratoTO transferirDOTO(ClausulaContratoDO clausulaContratoDO) {
		
		ClausulaContratoTO clausulaContratoTO = new ClausulaContratoTO();
		
		clausulaContratoTO.setId(clausulaContratoTO.getId());
		clausulaContratoTO.setParrafo(clausulaContratoTO.getParrafo());
		clausulaContratoTO.setVersion(clausulaContratoTO.getVersion());
		
		
		return clausulaContratoTO;
	}

}
