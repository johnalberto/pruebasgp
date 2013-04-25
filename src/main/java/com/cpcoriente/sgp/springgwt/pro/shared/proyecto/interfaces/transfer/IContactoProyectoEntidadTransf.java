package com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ContactoProyectoEntidadDO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.ContactoProyectoEntidadTO;

public interface IContactoProyectoEntidadTransf {
	
	public abstract ContactoProyectoEntidadDO transferirTODO(ContactoProyectoEntidadTO contactoTO);
	public abstract ContactoProyectoEntidadTO transferirDOTO(ContactoProyectoEntidadDO contactoDO);

}
