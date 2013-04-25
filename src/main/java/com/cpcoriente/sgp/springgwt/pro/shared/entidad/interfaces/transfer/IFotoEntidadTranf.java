package com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.FotoEntidadDO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.FotoEntidadTO;

public interface IFotoEntidadTranf {
	
	public abstract FotoEntidadDO transferirTODO(FotoEntidadTO fotoTO);
	public abstract FotoEntidadTO transferirDOTO(FotoEntidadDO fotoDO);

}
