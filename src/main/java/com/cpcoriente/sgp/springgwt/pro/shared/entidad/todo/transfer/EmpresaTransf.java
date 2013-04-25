package com.cpcoriente.sgp.springgwt.pro.shared.entidad.todo.transfer;

import java.util.logging.Logger;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.EmpresaDO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IEmpresaTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EmpresaTO;

public class EmpresaTransf implements IEmpresaTransf {

	private static final Logger log = Logger.getLogger(EmpresaTransf.class.getName());

	public EmpresaDO transferirTODO(EmpresaTO empresaTO) {
		
		EmpresaDO entidadDO = new EmpresaDO();

		
		if (empresaTO.getId() != null) {
			entidadDO.setId(empresaTO.getId());
		}
		
		entidadDO.setMision(empresaTO.getMision());
		entidadDO.setNit(empresaTO.getNit());
		entidadDO.setNombre(empresaTO.getNombre());
		entidadDO.setPassword(empresaTO.getPassword());
		entidadDO.setUsername(empresaTO.getUsername());
		entidadDO.setVision(empresaTO.getVision());
		
		
		
		
		return entidadDO;
	}

	public EmpresaTO transferirDOTO(EmpresaDO empresaDO) {

		EmpresaTO empresaTO = new EmpresaTO();
		
		empresaTO.setId(empresaDO.getId());
		empresaTO.setMision(empresaDO.getMision());
		empresaTO.setNit(empresaDO.getNit());
		empresaTO.setNombre(empresaDO.getNombre());
		empresaTO.setPassword(empresaDO.getPassword());
		empresaTO.setUsername(empresaDO.getUsername());
		empresaTO.setVision(empresaDO.getVision());
		
		return empresaTO;
	}

}
