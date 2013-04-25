package com.cpcoriente.sgp.springgwt.pro.shared.informe.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IActividadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InfoInterActividadDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IInformeInterventorDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IActividadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInfInterventorActividadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InfoInterActividadDetalleTO;

public class InformeInterventorActividadTransf implements IInfInterventorActividadTransf {

	private IInformeInterventorDAO getInfInterventorDAO() {
		return DAOFactory.getInstance().getInfInterventorDao();
	}
	
	private IActividadDAO getActividadDAO() {
		return DAOFactory.getInstance().getActividadDao();
	}
	
	private IActividadTransf getActividadTransfer() {
		return TransfFactory.getInstance().getActividadTransf();
	}
	


	public InfoInterActividadDetalleDO transferirTODO(
			InfoInterActividadDetalleTO informeTO) {
		
		InfoInterActividadDetalleDO informeDO = new InfoInterActividadDetalleDO();
		
		if (informeTO.getId()!=null) {
			
			informeDO.setId(informeTO.getId());
		}
		
		informeDO.setActividad(getActividadDAO().cargar(informeTO.getActividad().getId()));
		
		informeDO.setCalifActividad(informeTO.getCalificacion());
		
		informeDO.setComentario(informeTO.getComentario());
		
		informeDO.setFechaRegistro(informeTO.getFechaRegistro());
		
		informeDO.setInfInterventor(getInfInterventorDAO().cargar(informeTO.getInfInterventor().getId()));
		return informeDO;
	}

	public InfoInterActividadDetalleTO transferirDOTO(
			InfoInterActividadDetalleDO informeDO) {
		
		InfoInterActividadDetalleTO informeTO = new InfoInterActividadDetalleTO();
		
		informeTO.setId(informeDO.getId());
		
		informeTO.setActividad(getActividadTransfer().transferirDOTO(informeDO.getActividad()));
		
		informeTO.setCalificacion(informeDO.getCalifActividad());
		
		informeTO.setComentario(informeDO.getComentario());
		
		informeTO.setFechaRegistro(informeDO.getFechaRegistro());
		
		
		
		
		return informeTO;
	}

}
