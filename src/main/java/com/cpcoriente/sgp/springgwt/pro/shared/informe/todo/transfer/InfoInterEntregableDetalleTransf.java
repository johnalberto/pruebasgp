/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.informe.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InfoInterEntregableDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IInformeInterventorDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IEntregableTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInfoInterEntregableDetalleTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InfoInterEntregableDetalleTO;

/**
 * @author CPC-04
 *
 */
public class InfoInterEntregableDetalleTransf implements IInfoInterEntregableDetalleTransf{

	private IEntregableTransf getEntregableTransf() {
		return TransfFactory.getInstance().getEntregableTransf();
	}
	
	private IInformeInterventorDAO  getInformeInterventorDAO() {
		return DAOFactory.getInstance().getInfInterventorDao();
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInfoInterEntregableDetalleTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InfoInterEntregableDetalleTO)
	 */
	public InfoInterEntregableDetalleDO transferirTODO(InfoInterEntregableDetalleTO infoInterEntregableDetalleTO) {
		
		InfoInterEntregableDetalleDO infoInterEntregableDetalleDO = new InfoInterEntregableDetalleDO();
		
		
		if (infoInterEntregableDetalleTO.getId() != null) {
			infoInterEntregableDetalleDO.setId(infoInterEntregableDetalleTO.getId());
		}
		
		infoInterEntregableDetalleDO.setCalifEntregable(infoInterEntregableDetalleTO.getCalifEntregable());
		infoInterEntregableDetalleDO.setComentarioEntregable(infoInterEntregableDetalleTO.getComentarioEntregable());
		infoInterEntregableDetalleDO.setFechaRegistro(infoInterEntregableDetalleTO.getFechaRegistro());
		
		if (infoInterEntregableDetalleTO.getEntregable() != null) {
			infoInterEntregableDetalleDO.setEntregable(getEntregableTransf().transferirTODO(infoInterEntregableDetalleTO.getEntregable()));
		}
		
		if (infoInterEntregableDetalleTO.getInfoInter() != null) {
			infoInterEntregableDetalleDO.setInfoInter(getInformeInterventorDAO().cargar(infoInterEntregableDetalleTO.getInfoInter().getId()));
		}
		
		
		return infoInterEntregableDetalleDO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInfoInterEntregableDetalleTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InfoInterEntregableDetalleDO)
	 */
	public InfoInterEntregableDetalleTO transferirDOTO(InfoInterEntregableDetalleDO infoInterEntregableDetalleDO) {

	
		InfoInterEntregableDetalleTO infoInterEntregableDetalleTO = new InfoInterEntregableDetalleTO();
		
		
		infoInterEntregableDetalleTO.setId(infoInterEntregableDetalleDO.getId());
	
		
		infoInterEntregableDetalleTO.setCalifEntregable(infoInterEntregableDetalleDO.getCalifEntregable());
		infoInterEntregableDetalleTO.setComentarioEntregable(infoInterEntregableDetalleDO.getComentarioEntregable());
		infoInterEntregableDetalleTO.setFechaRegistro(infoInterEntregableDetalleDO.getFechaRegistro());
		
		
		if (infoInterEntregableDetalleDO.getEntregable() != null) {
			infoInterEntregableDetalleTO.setEntregable(getEntregableTransf().transferirDOTO(infoInterEntregableDetalleDO.getEntregable()));
		}

		
		return infoInterEntregableDetalleTO;
	}

}
