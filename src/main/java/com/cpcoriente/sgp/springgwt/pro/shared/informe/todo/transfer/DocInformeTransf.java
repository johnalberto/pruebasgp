/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.informe.todo.transfer;


import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.DocInformeDO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.enumerador.TipoDocumentoInformeEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IDocInformeTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.DocInformeTO;

/**
 * @author CPC-04
 *
 */
public class DocInformeTransf implements IDocInformeTransf{
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IDocInformeTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.DocInformeTO)
	 */
	public DocInformeDO transferirTODO(DocInformeTO docInformeTO) {

        DocInformeDO docInformeDO = new DocInformeDO();
		
		if (docInformeTO.getId() != null) {
			docInformeDO.setId(docInformeTO.getId());
		}
		
		
		docInformeDO.setDescripcion(docInformeTO.getDescripcion());
		docInformeDO.setDocumento(docInformeTO.getDocumento());
		docInformeDO.setFechaRegistro(docInformeTO.getFechaRegistro());
		docInformeDO.setNombre(docInformeTO.getNombre());
		docInformeDO.setVersion(docInformeTO.getVersion());
		docInformeDO.setTipo(docInformeTO.getTipo().getValor());
		
		if (docInformeTO.getIdInforme() != null) {
			docInformeDO.setIdInforme(docInformeTO.getIdInforme());
		}
		
		
		return docInformeDO;
	}


	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IDocInformeTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.informe.entity.DocInformeDO)
	 */
	public DocInformeTO transferirDOTO(DocInformeDO docInformeDO) {

		DocInformeTO docInformeTO = new DocInformeTO();
			
			if (docInformeTO.getId() != null) {
				docInformeDO.setId(docInformeTO.getId());
			}
			
			
			docInformeTO.setDescripcion(docInformeDO.getDescripcion());
			docInformeTO.setDocumento(docInformeDO.getDocumento());
			docInformeTO.setFechaRegistro(docInformeDO.getFechaRegistro());
			docInformeTO.setNombre(docInformeDO.getNombre());
			docInformeTO.setVersion(docInformeDO.getVersion());
			docInformeTO.setTipo(TipoDocumentoInformeEnum.tomarTipoPorValor(docInformeDO.getTipo()));
			
			if (docInformeDO.getIdInforme() != null) {
				docInformeTO.setIdInforme(docInformeDO.getIdInforme());
			}
		
		return docInformeTO;
	}
	
	

}
