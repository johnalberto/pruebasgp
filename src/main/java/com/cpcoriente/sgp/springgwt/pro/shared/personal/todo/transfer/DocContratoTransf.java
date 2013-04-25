/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.personal.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.DocContratoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.IDocContratoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.DocContratoTO;

/**
 * @author CPC-04
 *
 */
public class DocContratoTransf implements IDocContratoTransf {

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.IDocContratoTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.DocContratoTO)
	 */
	public DocContratoDO transferirTODO(DocContratoTO docContratoTO) {

        DocContratoDO docContratoDO = new DocContratoDO();
		
		if (docContratoTO.getId() != null) {
			docContratoDO.setId(docContratoTO.getId());
		}
		
		
		docContratoDO.setDescripcion(docContratoTO.getDescripcion());
		docContratoDO.setDocumento(docContratoTO.getDocumento());
		docContratoDO.setFechaRegistro(docContratoTO.getFechaRegistro());
		docContratoDO.setNombre(docContratoTO.getNombre());
		docContratoDO.setVersion(docContratoTO.getVersion());
		
		if (docContratoTO.getIdContrato() != null) {
			docContratoDO.setIdContrato(docContratoTO.getIdContrato());
		}
		
		
		return docContratoDO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.IDocContratoTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.personal.entity.DocContratoDO)
	 */
	public DocContratoTO transferirDOTO(DocContratoDO docContratoDO) {

		DocContratoTO docContratoTO = new DocContratoTO();
			
			if (docContratoTO.getId() != null) {
				docContratoDO.setId(docContratoTO.getId());
			}
			
			
			docContratoTO.setDescripcion(docContratoDO.getDescripcion());
			docContratoTO.setDocumento(docContratoDO.getDocumento());
			docContratoTO.setFechaRegistro(docContratoDO.getFechaRegistro());
			docContratoTO.setNombre(docContratoDO.getNombre());
			docContratoTO.setVersion(docContratoDO.getVersion());
			
			if (docContratoDO.getIdContrato() != null) {
				docContratoTO.setIdContrato(docContratoDO.getIdContrato());
			}
		
		return docContratoTO;
	}
	
	
	
}
