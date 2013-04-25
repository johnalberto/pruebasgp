package com.cpcoriente.sgp.springgwt.pro.shared.informe.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IObjetivoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InfoInterObjetivoDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IInformeInterventorDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IObjetivoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInfInterventorObjetivoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InfoInterObjetivoDetalleTO;

public class InformeInterventorObjetivoTransf implements IInfInterventorObjetivoTransf {

	
	
	private IInformeInterventorDAO getInfInterventorDAO() {
		return DAOFactory.getInstance().getInfInterventorDao();
	}
	
	private IObjetivoTransf getObjetivoTransfer() {
		return TransfFactory.getInstance().getObjetivoTransf();
	}
	
	private IObjetivoDAO getObjetivoDAO() {
		return DAOFactory.getInstance().getObjetivoDao();
	}

	
	public InfoInterObjetivoDetalleDO transferirTODO(
			InfoInterObjetivoDetalleTO informeTO) {
		
		InfoInterObjetivoDetalleDO informeDO = new InfoInterObjetivoDetalleDO();
		
		if (informeTO.getId()!=null) {
			
			informeDO.setId(informeTO.getId());
		}
		
		informeDO.setCalifObjetivo(informeTO.getCalificacion());
		
		informeDO.setComentario(informeTO.getComentario());
		
		informeDO.setFechaRegistro(informeTO.getFechaRegistro());
		
		informeDO.setInfInterventor(getInfInterventorDAO().cargar(informeTO.getInforme().getId()));
		
		informeDO.setObjetivo(getObjetivoDAO().cargar(informeTO.getObjetivo().getId()));
		
		return informeDO;
	}

	public InfoInterObjetivoDetalleTO transferirDOTO(
			InfoInterObjetivoDetalleDO informeDO) {
		
		InfoInterObjetivoDetalleTO informeTO = new InfoInterObjetivoDetalleTO();
		
		informeTO.setId(informeDO.getId());
		
		informeTO.setCalificacion(informeDO.getCalifObjetivo());
		
		informeTO.setComentario(informeDO.getComentario());
		
		informeTO.setFechaRegistro(informeDO.getFechaRegistro());
		
		informeTO.setObjetivo(getObjetivoTransfer().transferirDOTO(informeDO.getObjetivo()));
		
		
		return informeTO;
	}

}
