package com.cpcoriente.sgp.springgwt.pro.shared.entidad.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.FotoEntidadDO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IFotoEntidadTranf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.FotoEntidadTO;

public class FotoEntidadTransf implements IFotoEntidadTranf {

	
	public FotoEntidadDO transferirTODO(FotoEntidadTO fotoTO) {
		
		FotoEntidadDO fotoDO = new FotoEntidadDO();
		
		if (fotoTO.getId()!=null) {
			
			fotoDO.setId(fotoTO.getId());
			
		}
		
		fotoDO.setCodigo(fotoTO.getCodigo());
		
		fotoDO.setDescripcion(fotoTO.getDescripcion());
		
		fotoDO.setFoto(fotoTO.getFoto());
		
		fotoDO.setIdEntidad(fotoTO.getIdEntidad());
		
		fotoDO.setVersion(fotoTO.getVersion());
		
		
		return fotoDO;
	}

	public FotoEntidadTO transferirDOTO(FotoEntidadDO fotoDO) {
		
		FotoEntidadTO fotoTO= new FotoEntidadTO();
		
		fotoTO.setId(fotoDO.getId());
		
		fotoTO.setCodigo(fotoDO.getCodigo());
		
		fotoTO.setDescripcion(fotoDO.getDescripcion());
		
		fotoTO.setFoto(fotoTO.getFoto());
		
		fotoTO.setIdEntidad(fotoDO.getIdEntidad());
		
		fotoTO.setVersion(fotoDO.getVersion());
		
		
		
		return fotoTO;
	}

}
