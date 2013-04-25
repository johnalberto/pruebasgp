/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.PucDO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IPucTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.PucTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IEntidadTransf;

/**
 * @author CPC-04
 *
 */
public class PucTransf implements IPucTransf{

	
	private IEntidadTransf getEntidadTrans() {
		return TransfFactory.getInstance().getEntidadTransf();
	}
	
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IPucTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.PucTO)
	 */
	public PucDO transferirTODO(PucTO pucTO) {
		
		PucDO pucDO = new PucDO();
		
		if (pucTO.getId() != null) {
			pucDO.setId(pucTO.getId());
		}
			
		pucDO.setCodigo(pucTO.getCodigo());
		pucDO.setNombre(pucTO.getNombre());
		pucDO.setVersion(pucTO.getVersion());
		
		if ( pucTO.getEntidad() != null ) {
			pucDO.setEntidad(getEntidadTrans().transferirTODO(pucTO.getEntidad()));
		}
		
		return pucDO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IPucTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.PucDO)
	 */
	public PucTO transferirDOTO(PucDO pucDO) {

		PucTO pucTO = new PucTO();
		
		
		pucTO.setId(pucDO.getId());
			
		pucTO.setCodigo(pucDO.getCodigo());
		pucTO.setNombre(pucDO.getNombre());
		pucTO.setVersion(pucDO.getVersion());
		
		if ( pucDO.getEntidad() != null ) {
			pucTO.setEntidad(getEntidadTrans().transferirDOTO(pucDO.getEntidad()));
		}
		
		
		return pucTO;
	}

}
