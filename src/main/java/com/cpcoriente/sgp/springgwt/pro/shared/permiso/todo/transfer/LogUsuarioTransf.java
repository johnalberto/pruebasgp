/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.permiso.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.LogUsuarioDO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.AccionEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.PaginaEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.ILogUsuarioTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.IUsuarioTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.LogUsuarioTO;



/**
 * @author CPC-04
 *
 */
public class LogUsuarioTransf implements ILogUsuarioTransf {
	
	
	private IUsuarioTransf getUsuarioTransf() {
		return TransfFactory.getInstance().getUsuarioTransf();
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.ILogUsuarioTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.LogUsuarioTO)
	 */
	public LogUsuarioDO transferirTODO(LogUsuarioTO logTO) {
		
		LogUsuarioDO logDO = new LogUsuarioDO();
		
		if (logTO.getId() != null) {
			logDO.setId(logTO.getId());
		}
		
		logDO.setFecha(logTO.getFecha());
		logDO.setIp(logTO.getIp());
		logDO.setAccion(logTO.getAccion().getValor());
		logDO.setObservacion(logTO.getObservacion());
		logDO.setPagina(logTO.getPagina().getValor());
		
		if (logTO.getUsuario() != null) {
			logDO.setUsuario(getUsuarioTransf().transferirTODO(logTO.getUsuario()));
		}
	
		
		return logDO;
	}

	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.ILogUsuarioTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.LogUsuarioDO)
	 */
	public LogUsuarioTO transferirDOTO(LogUsuarioDO logDO) {
		
		LogUsuarioTO logTO = new LogUsuarioTO();
		
		logTO.setId(logDO.getId());
		logTO.setFecha(logDO.getFecha());
		logTO.setIp(logDO.getIp());
		logTO.setAccion(AccionEnum.tomarTipoPorValor(logDO.getAccion()));
		logTO.setObservacion(logDO.getObservacion());
		logTO.setPagina(PaginaEnum.tomarTipoPorValor(logDO.getPagina()));
		
		if (logDO.getUsuario() != null) {
			logTO.setUsuario(getUsuarioTransf().transferirDOTO(logDO.getUsuario()));
		}
		
		
		return logTO;
	}

}
