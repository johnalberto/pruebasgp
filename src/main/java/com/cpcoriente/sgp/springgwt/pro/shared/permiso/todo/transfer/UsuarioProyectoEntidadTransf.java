package com.cpcoriente.sgp.springgwt.pro.shared.permiso.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioProyectoEntidadDO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.IUsuarioDAO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IProyectoEntidadDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.IUsuarioProyectoEntidadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.IUsuarioTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioProyectoEntidadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IProyectoEntidadTransf;

public class UsuarioProyectoEntidadTransf implements IUsuarioProyectoEntidadTransf {

	
	private IProyectoEntidadTransf getProyectoEntidadTransf() {
		return TransfFactory.getInstance().getProyectoEntidadTransf();
	}
	
	private IProyectoEntidadDAO getProyectoEntidadDAO() {
		return DAOFactory.getInstance().getProyectoEntidadDao();
	}
	
	
	
	
	private IUsuarioTransf getUsuarioTransf() {
		return TransfFactory.getInstance().getUsuarioTransf();
	}
	
	private IUsuarioDAO getUsuarioDAO() {
		return DAOFactory.getInstance().getUsuarioDao();
	}
	
	public UsuarioProyectoEntidadDO transferirTODO(
			UsuarioProyectoEntidadTO usuarioProEntTO) {
		UsuarioProyectoEntidadDO usarioProEntDO = 
				new UsuarioProyectoEntidadDO();
		
		if (usuarioProEntTO.getId() !=null) {
			
			usarioProEntDO.setId(usuarioProEntTO.getId());
		}
		
		usarioProEntDO.setActivo(usuarioProEntTO.isActivo());
		
		usarioProEntDO.setProyectoEntidad(getProyectoEntidadDAO().cargar(usuarioProEntTO.getProyectoEntidad().getId()));
		
		usarioProEntDO.setUsuario(getUsuarioDAO().cargar(usuarioProEntTO.getUsuario().getId()));
		
		return usarioProEntDO;
	}

	public UsuarioProyectoEntidadTO transferirDOTO(
			UsuarioProyectoEntidadDO usuarioProEntDO) {
		
		
		UsuarioProyectoEntidadTO usuarioProEntTO=
				new UsuarioProyectoEntidadTO();
		
		
		usuarioProEntTO.setId(usuarioProEntDO.getId());
		
		usuarioProEntTO.setProyectoEntidad(getProyectoEntidadTransf().transferirDOTO(usuarioProEntDO.getProyectoEntidad()));

		usuarioProEntTO.setActivo(usuarioProEntDO.isActivo());
		
		usuarioProEntTO.setUsuario(getUsuarioTransf().transferirDOTO(usuarioProEntDO.getUsuario()));
		
		return usuarioProEntTO;
	}

}
