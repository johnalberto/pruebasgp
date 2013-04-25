/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.actividad.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionProductoDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IProductoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador.EstadoProductoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IVersionProductoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.VersionProductoTO;

/**
 * @author CPC-04
 *
 */
public class VersionProductoTransf implements IVersionProductoTransf{

	private IProductoDAO getProductoDAO() {
		return DAOFactory.getInstance().getProductoDao();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IVersionProductoTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.VersionProductoTO)
	 */
	public VersionProductoDO transferirTODO(VersionProductoTO versionProductoTO) {

		VersionProductoDO versionProductoDO = new VersionProductoDO();
		
		if (versionProductoTO.getId() != null) {
			versionProductoDO.setId(versionProductoTO.getId());
		}
		
		versionProductoDO.setCodigo(versionProductoTO.getCodigo());
		versionProductoDO.setEstado(versionProductoTO.getEstado().getValor());
		versionProductoDO.setFechaFin(versionProductoTO.getFechaFin());
		versionProductoDO.setFechaInicio(versionProductoTO.getFechaInicio());
		versionProductoDO.setFechaRegistro(versionProductoTO.getFechaRegistro());
		versionProductoDO.setNombre(versionProductoTO.getNombre());
		versionProductoDO.setObservacion(versionProductoTO.getObservacion());
		versionProductoDO.setPorcenPeso(versionProductoTO.getPorcentajePeso());
		
		if (versionProductoTO.getProducto() != null) {
			versionProductoDO.setProducto(getProductoDAO().cargar(versionProductoTO.getProducto().getId()));
		}
		
		
		
		return versionProductoDO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IVersionProductoTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionProductoDO)
	 */
	public VersionProductoTO transferirDOTO(VersionProductoDO versionProductoDO) {

		VersionProductoTO versionProductoTO = new VersionProductoTO();
		
		versionProductoTO.setId(versionProductoDO.getId());
		
		versionProductoTO.setCodigo(versionProductoDO.getCodigo());
		versionProductoTO.setEstado(EstadoProductoEnum.tomarTipoPorValor(versionProductoDO.getEstado()));
		versionProductoTO.setFechaFin(versionProductoDO.getFechaFin());
		versionProductoTO.setFechaInicio(versionProductoDO.getFechaInicio());
		versionProductoTO.setFechaRegistro(versionProductoDO.getFechaRegistro());
		versionProductoTO.setNombre(versionProductoDO.getNombre());
		versionProductoTO.setObservacion(versionProductoDO.getObservacion());
		versionProductoTO.setPorcentajePeso(versionProductoDO.getPorcenPeso());
		
		
		return versionProductoTO;
	}

}
