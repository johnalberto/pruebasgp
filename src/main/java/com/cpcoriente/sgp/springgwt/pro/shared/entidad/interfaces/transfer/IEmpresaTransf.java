package com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.EmpresaDO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EmpresaTO;

public interface IEmpresaTransf {
	
	public abstract EmpresaDO transferirTODO(EmpresaTO empresaTO);
	public abstract EmpresaTO transferirDOTO(EmpresaDO empresaDO);

}
