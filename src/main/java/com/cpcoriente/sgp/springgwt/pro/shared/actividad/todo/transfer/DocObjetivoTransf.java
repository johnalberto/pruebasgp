/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.actividad.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.DocObjetivoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IDocObjetivoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.DocObjetivoTO;

/**
 * @author CPC-04
 *
 */
public class DocObjetivoTransf implements IDocObjetivoTransf{

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IDocObjetivoTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.DocObjetivoTO)
	 */
	public DocObjetivoDO transferirTODO(DocObjetivoTO docObjetivoTO) {

        DocObjetivoDO docObjetivoDO = new DocObjetivoDO();
		
		if (docObjetivoTO.getId() != null) {
			docObjetivoDO.setId(docObjetivoTO.getId());
		}
		
		
		docObjetivoDO.setDescripcion(docObjetivoTO.getDescripcion());
		docObjetivoDO.setDocumento(docObjetivoTO.getDocumento());
		docObjetivoDO.setFechaRegistro(docObjetivoTO.getFechaRegistro());
		docObjetivoDO.setNombre(docObjetivoTO.getNombre());
		docObjetivoDO.setVersion(docObjetivoTO.getVersion());
		
		if (docObjetivoTO.getIdObjetivo() != null) {
			docObjetivoDO.setIdObjetivo(docObjetivoTO.getIdObjetivo());
		}
		
		
		return docObjetivoDO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IDocObjetivoTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.DocObjetivoDO)
	 */
	public DocObjetivoTO transferirDOTO(DocObjetivoDO docObjetivoDO) {

		DocObjetivoTO docObjetivoTO = new DocObjetivoTO();
			
			if (docObjetivoTO.getId() != null) {
				docObjetivoDO.setId(docObjetivoTO.getId());
			}
			
			
			docObjetivoTO.setDescripcion(docObjetivoDO.getDescripcion());
			docObjetivoTO.setDocumento(docObjetivoDO.getDocumento());
			docObjetivoTO.setFechaRegistro(docObjetivoDO.getFechaRegistro());
			docObjetivoTO.setNombre(docObjetivoDO.getNombre());
			docObjetivoTO.setVersion(docObjetivoDO.getVersion());
			
			if (docObjetivoDO.getIdObjetivo() != null) {
				docObjetivoTO.setIdObjetivo(docObjetivoDO.getIdObjetivo());
			}
		
		return docObjetivoTO;
	}

}
