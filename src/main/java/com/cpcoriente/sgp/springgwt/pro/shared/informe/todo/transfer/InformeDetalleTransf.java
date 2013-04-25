/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.informe.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InformeDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IInformeDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IActividadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInformeDetalleTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InformeDetalleTO;

/**
 * @author CPC-04
 *
 */
public class InformeDetalleTransf implements IInformeDetalleTransf {
	
	private IActividadTransf getActividadTransf() {
		return TransfFactory.getInstance().getActividadTransf();
	}
	
	private IInformeDAO getInformeDAO() {
		return DAOFactory.getInstance().getInformeDao();
	}
	

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInformeDetalleTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InformeDetalleTO)
	 */
	public InformeDetalleDO transferirTODO(InformeDetalleTO informeDetalleTO) {

		InformeDetalleDO informeDetalleDO = new InformeDetalleDO();
		
		if (informeDetalleTO.getId() != null) {
			informeDetalleDO.setId(informeDetalleTO.getId());
		}

		informeDetalleDO.setDescripcion(informeDetalleTO.getDescripcion());
		informeDetalleDO.setFechaRegistro(informeDetalleTO.getFechaRegistro());
		informeDetalleDO.setPorcenAvance(informeDetalleTO.getPorcenAvance());
		
		if (informeDetalleTO.getActividad() != null) {
			informeDetalleDO.setActividad(getActividadTransf().transferirTODO(informeDetalleTO.getActividad()));
		}
		
		if (informeDetalleTO.getInforme() != null) {
			informeDetalleDO.setInforme(getInformeDAO().cargar(informeDetalleTO.getInforme().getId()));
		}
		
		return informeDetalleDO;
	}

	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInformeDetalleTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InformeDetalleDO)
	 */
	public InformeDetalleTO transferirDOTO(InformeDetalleDO informeDetalleDO) {

		InformeDetalleTO informeDetalleTO = new InformeDetalleTO();
		
		informeDetalleTO.setId(informeDetalleDO.getId());

		informeDetalleTO.setDescripcion(informeDetalleDO.getDescripcion());
		informeDetalleTO.setFechaRegistro(informeDetalleDO.getFechaRegistro());
		informeDetalleTO.setPorcenAvance(informeDetalleDO.getPorcenAvance());
		
		if (informeDetalleDO.getActividad() != null) {
			informeDetalleTO.setActividad(getActividadTransf().transferirDOTO(informeDetalleDO.getActividad()));
		}
		
		return informeDetalleTO;
	}

}
