/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.ImpuestoDO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.enumerador.TipoOperacionImpuestoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IImpuestoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.ImpuestoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IEmpresaTransf;

/**
 * @author CPC-04
 *
 */
public class ImpuestoTransf implements IImpuestoTransf {

	
	private IEmpresaTransf getEmpresaTrans() {
		return TransfFactory.getInstance().getEmpresaTransf();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IImpuestoTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.ImpuestoTO)
	 */
	public ImpuestoDO transferirTODO(ImpuestoTO impuestoTO) {

		
		ImpuestoDO impuestoDO = new ImpuestoDO();

		if (impuestoTO.getId() != null ) {
			impuestoDO.setId(impuestoTO.getId());
		}
		
		impuestoDO.setDescripcion(impuestoTO.getDescripcion());
		impuestoDO.setNombre(impuestoTO.getNombre());
		impuestoDO.setPorcenCobro(impuestoTO.getPorcenCobro());
		impuestoDO.setTipo(impuestoTO.getTipo().getValor());
		
		if (impuestoTO.getEmpresa() != null ) {
			impuestoDO.setEmpresa(getEmpresaTrans().transferirTODO(impuestoTO.getEmpresa()));
		}
		
		return impuestoDO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IImpuestoTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.ImpuestoDO)
	 */
	public ImpuestoTO transferirDOTO(ImpuestoDO impuestoDO) {

		ImpuestoTO impuestoTO = new ImpuestoTO();


		impuestoTO.setId(impuestoDO.getId());
		
		impuestoTO.setDescripcion(impuestoDO.getDescripcion());
		impuestoTO.setNombre(impuestoDO.getNombre());
		impuestoTO.setPorcenCobro(impuestoDO.getPorcenCobro());
		impuestoTO.setTipo(TipoOperacionImpuestoEnum.tomarTipoPorValor(impuestoDO.getTipo()));
		
		if (impuestoTO.getEmpresa() != null ) {
			impuestoTO.setEmpresa(getEmpresaTrans().transferirDOTO(impuestoDO.getEmpresa()));
		}
		
		return impuestoTO;
	}

}
