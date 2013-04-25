package com.cpcoriente.sgp.springgwt.pro.shared.permiso.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioEntidadTipoDO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.IUsuarioProyectoEntidadDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.IUsuarioEntidadTipoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.IUsuarioProyectoEntidadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioEntidadTipoTO;

public class UsuarioEntidadTipoTransf implements IUsuarioEntidadTipoTransf {

	private IUsuarioProyectoEntidadTransf getUsuProEntTransf() {
		return TransfFactory.getInstance().getUsuProEntTransf();
	}
	
	private IUsuarioProyectoEntidadDAO getUsuProEntDAO() {
		return DAOFactory.getInstance().getUsuarioProEntDao();
	}
	
	
	public UsuarioEntidadTipoDO transferirTODO(UsuarioEntidadTipoTO usuarioTO) {
		
		UsuarioEntidadTipoDO usuarioDO = new UsuarioEntidadTipoDO();
		
		if (usuarioTO.getId()!=null) {
			
			usuarioDO.setId(usuarioTO.getId());
		}
		
		usuarioDO.setTipoUsuario(usuarioTO.getTipoUsuario().getValor());
		
		usuarioDO.setUsuProEnt(getUsuProEntDAO().cargar(usuarioTO.getUsuProEnt().getId()));
		
		return usuarioDO;
	}

	public UsuarioEntidadTipoTO transferirDOTO(UsuarioEntidadTipoDO usuarioDO) {
		
		UsuarioEntidadTipoTO usuarioTO = new UsuarioEntidadTipoTO();
		
		usuarioTO.setId(usuarioDO.getId());
		
		usuarioTO.setTipoUsuario(TipoUsuarioEnum.tomarTipoPorValor(usuarioDO.getTipoUsuario()));
		
		usuarioTO.setUsuProEnt(getUsuProEntTransf().transferirDOTO(usuarioDO.getUsuProEnt()));

		
		return usuarioTO;
	}

}
