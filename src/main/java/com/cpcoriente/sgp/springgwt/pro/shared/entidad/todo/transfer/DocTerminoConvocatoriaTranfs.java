package com.cpcoriente.sgp.springgwt.pro.shared.entidad.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.DocTerminoConvocatoriaDO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IDocTerminoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DocTerminoConvocatoriaTO;

public class DocTerminoConvocatoriaTranfs implements IDocTerminoTransf {

	public DocTerminoConvocatoriaDO transferirTODO(
			DocTerminoConvocatoriaTO docTerminoTO) {
		
		DocTerminoConvocatoriaDO docTerminoDO = new DocTerminoConvocatoriaDO();
		
		if (docTerminoTO.getId()!=null) {
			
			docTerminoDO.setId(docTerminoTO.getId());
		}
		
		docTerminoDO.setDescripcion(docTerminoDO.getDescripcion());
		
		docTerminoDO.setFoto(docTerminoTO.getFoto());
		
		docTerminoDO.setIdTermino(docTerminoTO.getIdTermino());
		
		docTerminoDO.setNombre(docTerminoTO.getNombre());
		
		docTerminoDO.setVersion(docTerminoTO.getVersion());
		
		return docTerminoDO;
	}

	public DocTerminoConvocatoriaTO transferirDOTO(
			DocTerminoConvocatoriaDO docTerminoDO) {
		
		DocTerminoConvocatoriaTO docTerminoTO = new DocTerminoConvocatoriaTO();
		
		if (docTerminoDO.getId()!=null) {
			
			docTerminoTO.setId(docTerminoDO.getId());
		}
		
		docTerminoTO.setDescripcion(docTerminoDO.getDescripcion());
		
		docTerminoTO.setFoto(docTerminoDO.getFoto());
		
		docTerminoDO.setIdTermino(docTerminoDO.getIdTermino());
		
		docTerminoDO.setNombre(docTerminoDO.getNombre());
		
		docTerminoDO.setVersion(docTerminoDO.getVersion());
		
		
		return docTerminoTO;
	}

}
