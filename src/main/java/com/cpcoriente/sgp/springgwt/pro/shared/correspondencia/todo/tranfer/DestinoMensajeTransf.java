package com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.todo.tranfer;

import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.entity.DestinoMensajeDO;
import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.interfaces.dao.IMensajeDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.IUsuarioProyectoEntidadDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.interfaces.transfer.IDestinoMensajeTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.objeto.DestinoMensajeTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.IUsuarioProyectoEntidadTransf;

public class DestinoMensajeTransf implements IDestinoMensajeTransf {

	
	private IMensajeDAO getMensajeDao() {
		return DAOFactory.getInstance().getMensajeDao();
	}

	private IUsuarioProyectoEntidadDAO getUsuarioDao() {
		return DAOFactory.getInstance().getUsuarioProEntDao();
	}

	private IUsuarioProyectoEntidadTransf getUsuarioTransf() {
		return TransfFactory.getInstance().getUsuProEntTransf();
	}
	
	public DestinoMensajeDO transferirTODO(DestinoMensajeTO desMensajeTO) {
		
		DestinoMensajeDO desMensajeDO = new DestinoMensajeDO();

		if (desMensajeTO.getId()!=null) {
			
			desMensajeDO.setId(desMensajeTO.getId());
		}
		
		desMensajeDO.setMensaje(getMensajeDao().cargar(desMensajeTO.getMensaje().getId()));
		
		desMensajeDO.setUsuario(getUsuarioDao().cargar(desMensajeTO.getUsuario().getId()));
		
		return desMensajeDO;
	}

	public DestinoMensajeTO transferirDOTO(DestinoMensajeDO desMensajeDO) {
		
		DestinoMensajeTO desMensajeTO = new DestinoMensajeTO();
		
		desMensajeTO.setId(desMensajeDO.getId());
		
		desMensajeTO.setUsuario(getUsuarioTransf().transferirDOTO(desMensajeDO.getUsuario()));
		
		return desMensajeTO;
	}

}
