/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.personal.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.ClausulaTipoContratoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IEntidadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.enumerador.TipoContratoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.IClausulaTipoContratoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.ClausulaTipoContratoTO;

/**
 * @author CPC-04
 *
 */
public class ClausulaTipoContratoTransf implements IClausulaTipoContratoTransf{
	
	private IEntidadTransf getEntidadTransf() {
		return TransfFactory.getInstance().getEntidadTransf();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.IClausulaTipoContratoTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.ClausulaTipoContratoTO)
	 */
	public ClausulaTipoContratoDO transferirTODO(ClausulaTipoContratoTO clausulaTipoContratoTO) {

		ClausulaTipoContratoDO clausulaTipoContratoDO = new ClausulaTipoContratoDO();
		
		if (clausulaTipoContratoTO.getId() != null) {
			clausulaTipoContratoDO.setId(clausulaTipoContratoTO.getId());
		}
		
		clausulaTipoContratoDO.setParrafo(clausulaTipoContratoTO.getParrafo());
		clausulaTipoContratoDO.setVersion(clausulaTipoContratoTO.getVersion());
		clausulaTipoContratoDO.setTipo(clausulaTipoContratoTO.getTipo().getValor());
		
		if (clausulaTipoContratoTO.getEntidad() != null) {
			clausulaTipoContratoDO.setEntidad(getEntidadTransf().transferirTODO(clausulaTipoContratoTO.getEntidad()));
		}
		
		
		return clausulaTipoContratoDO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.IClausulaTipoContratoTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.personal.entity.ClausulaTipoContratoDO)
	 */
	public ClausulaTipoContratoTO transferirDOTO(ClausulaTipoContratoDO clausulaTipoContratoDO) {
		
		ClausulaTipoContratoTO clausulaTipoContratoTO = new ClausulaTipoContratoTO();
		
		clausulaTipoContratoTO.setId(clausulaTipoContratoTO.getId());
		clausulaTipoContratoTO.setParrafo(clausulaTipoContratoTO.getParrafo());
		clausulaTipoContratoTO.setVersion(clausulaTipoContratoTO.getVersion());
		clausulaTipoContratoTO.setTipo(TipoContratoEnum.tomarTipoPorValor(clausulaTipoContratoDO.getTipo()));
		
		if (clausulaTipoContratoDO.getEntidad() != null) {
			clausulaTipoContratoTO.setEntidad(getEntidadTransf().transferirDOTO(clausulaTipoContratoDO.getEntidad()));
		}
		
		
		return clausulaTipoContratoTO;
	}


}
