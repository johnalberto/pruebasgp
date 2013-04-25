package com.cpcoriente.sgp.springgwt.pro.shared.financiero.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.VersionRecursoDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IRecursoDetalleDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.enumerador.TipoAporteEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IVersionRecursoDetalleTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.VersionRecursoDetalleTO;

public class VersionRecursoDetalleTransf implements IVersionRecursoDetalleTransf {


	
	private IRecursoDetalleDAO getRecDetalleDAO() {
		return DAOFactory.getInstance().getRecursoDetalleDao();
	}

	
	
	public VersionRecursoDetalleDO transferirTODO(
			VersionRecursoDetalleTO versionTO) {
		
		VersionRecursoDetalleDO versionDO = new VersionRecursoDetalleDO();
		
		if (versionTO.getId()!=null) {
			
			versionDO.setId(versionTO.getId());
		}
		
		versionDO.setFechaRegistro(versionTO.getFechaRegistro());
		
		versionDO.setObservacion(versionTO.getObservacion());
		
		versionDO.setRecursoDetalle(getRecDetalleDAO().cargar(versionTO.getRecurso().getId()));
		
		versionDO.setTipo(versionTO.getTipo().getValor());
		
		versionDO.setValorEfectivo(versionTO.getValorEfectivo());
		
		versionDO.setValorEspecie(versionTO.getValorEspecie());
		
		
		return versionDO;
	}

	public VersionRecursoDetalleTO transferirDOTO(
			VersionRecursoDetalleDO versionDO) {
		
		VersionRecursoDetalleTO versionTO = new VersionRecursoDetalleTO();

		if (versionDO.getId()!=null) {
			
			versionTO.setId(versionDO.getId());
		}
		
		versionTO.setFechaRegistro(versionDO.getFechaRegistro());
		
		versionTO.setObservacion(versionDO.getObservacion());
		
		versionTO.setTipo(TipoAporteEnum.tomarTipoPorValor(versionDO.getTipo()));
		
		versionTO.setValorEfectivo(versionDO.getValorEfectivo());
		
		versionTO.setValorEspecie(versionDO.getValorEspecie());
		
		
		return versionTO;
	}

}
