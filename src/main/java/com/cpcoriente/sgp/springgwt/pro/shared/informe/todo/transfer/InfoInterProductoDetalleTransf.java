/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.informe.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InfoInterProductoDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IInformeInterventorDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IProductoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInfoInterProductoDetalleTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InfoInterProductoDetalleTO;

/**
 * @author CPC-04
 *
 */
public class InfoInterProductoDetalleTransf implements IInfoInterProductoDetalleTransf{

	
	private IProductoTransf getProductoTransf() {
		return TransfFactory.getInstance().getProductoTransf();
	}
	
	private IInformeInterventorDAO  getInformeInterventorDAO() {
		return DAOFactory.getInstance().getInfInterventorDao();
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInfoInterProductoDetalleTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InfoInterProductoDetalleTO)
	 */
	public InfoInterProductoDetalleDO transferirTODO(InfoInterProductoDetalleTO infoInterProductoDetalleTO) {
		
		InfoInterProductoDetalleDO infoInterProductoDetalleDO = new InfoInterProductoDetalleDO();
		
		
		if (infoInterProductoDetalleTO.getId() != null) {
			infoInterProductoDetalleDO.setId(infoInterProductoDetalleTO.getId());
		}
		
		infoInterProductoDetalleDO.setCalifProducto(infoInterProductoDetalleTO.getCalifProducto());
		infoInterProductoDetalleDO.setComentarioProducto(infoInterProductoDetalleTO.getComentarioProducto());
		infoInterProductoDetalleDO.setFechaRegistro(infoInterProductoDetalleTO.getFechaRegistro());
		
		if (infoInterProductoDetalleTO.getProducto() != null) {
			infoInterProductoDetalleDO.setProducto(getProductoTransf().transferirTODO(infoInterProductoDetalleTO.getProducto()));
		}
		
		if (infoInterProductoDetalleTO.getInfoInter() != null) {
			infoInterProductoDetalleDO.setInfoInter(getInformeInterventorDAO().cargar(infoInterProductoDetalleTO.getInfoInter().getId()));
		}
		
		
		return infoInterProductoDetalleDO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInfoInterProductoDetalleTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InfoInterProductoDetalleDO)
	 */
	public InfoInterProductoDetalleTO transferirDOTO(InfoInterProductoDetalleDO infoInterProductoDetalleDO) {

	
		InfoInterProductoDetalleTO infoInterProductoDetalleTO = new InfoInterProductoDetalleTO();
		
		
		infoInterProductoDetalleTO.setId(infoInterProductoDetalleDO.getId());
	
		
		infoInterProductoDetalleTO.setCalifProducto(infoInterProductoDetalleDO.getCalifProducto());
		infoInterProductoDetalleTO.setComentarioProducto(infoInterProductoDetalleDO.getComentarioProducto());
		infoInterProductoDetalleTO.setFechaRegistro(infoInterProductoDetalleDO.getFechaRegistro());
		
		
		if (infoInterProductoDetalleDO.getProducto() != null) {
			infoInterProductoDetalleTO.setProducto(getProductoTransf().transferirDOTO(infoInterProductoDetalleDO.getProducto()));
		}

		
		return infoInterProductoDetalleTO;
	}

	
	
	
}
