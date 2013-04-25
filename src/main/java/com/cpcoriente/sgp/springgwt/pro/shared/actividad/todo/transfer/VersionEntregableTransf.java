/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.actividad.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionEntregableDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IEntregableDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador.EstadoEntregableEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador.TipoEntregableEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador.TipoResultadoEntregaEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IVersionEntregableTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.VersionEntregableTO;

/**
 * @author CPC-04
 *
 */
public class VersionEntregableTransf implements IVersionEntregableTransf {

	
	private IEntregableDAO getEntregableDAO() {
		return DAOFactory.getInstance().getEntregableDao();
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IVersionEntregableTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.VersionEntregableTO)
	 */
	public VersionEntregableDO transferirTODO(VersionEntregableTO versionEntregableTO) {

		VersionEntregableDO versionEntregableDO = new VersionEntregableDO();
		
		
		if (versionEntregableTO.getId() != null) {
			versionEntregableDO.setId(versionEntregableTO.getId());
		}
		
		versionEntregableDO.setCodigo(versionEntregableTO.getCodigo());
		versionEntregableDO.setEstado(versionEntregableTO.getEstado().getValor());
		versionEntregableDO.setFechaEntrega(versionEntregableTO.getFechaEntrega());
		versionEntregableDO.setFechaRegistro(versionEntregableTO.getFechaRegistro());
		versionEntregableDO.setNombre(versionEntregableTO.getNombre());
		versionEntregableDO.setObservacion(versionEntregableTO.getObservacion());
		versionEntregableDO.setResultadoDe(versionEntregableTO.getResultadoDe().getValor());
		versionEntregableDO.setTipo(versionEntregableTO.getTipo().getValor());
		
		
		if (versionEntregableTO.getEntregable() != null) {
			versionEntregableDO.setEntregable(getEntregableDAO().cargar(versionEntregableTO.getEntregable().getId()));
		}
		
		
		return versionEntregableDO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IVersionEntregableTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionEntregableDO)
	 */
	public VersionEntregableTO transferirDOTO(VersionEntregableDO versionEntregableDO) {

		VersionEntregableTO versionEntregableTO = new VersionEntregableTO();
		
		versionEntregableTO.setId(versionEntregableDO.getId());
		
		
		versionEntregableTO.setCodigo(versionEntregableDO.getCodigo());
		versionEntregableTO.setEstado(EstadoEntregableEnum.tomarTipoPorValor(versionEntregableDO.getEstado()));
		versionEntregableTO.setFechaEntrega(versionEntregableDO.getFechaEntrega());
		versionEntregableTO.setFechaRegistro(versionEntregableDO.getFechaRegistro());
		versionEntregableTO.setNombre(versionEntregableDO.getNombre());
		versionEntregableTO.setObservacion(versionEntregableDO.getObservacion());
		versionEntregableTO.setResultadoDe(TipoResultadoEntregaEnum.tomarTipoPorValor(versionEntregableDO.getResultadoDe()));
		versionEntregableTO.setTipo(TipoEntregableEnum.tomarTipoPorValor(versionEntregableDO.getTipo()));

		
		return versionEntregableTO;
	}

}
