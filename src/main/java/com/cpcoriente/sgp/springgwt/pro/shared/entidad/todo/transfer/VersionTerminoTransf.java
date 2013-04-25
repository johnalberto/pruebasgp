package com.cpcoriente.sgp.springgwt.pro.shared.entidad.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.VersionTerminoConvocatoriaDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.ITerminoConvocatoriaDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IVersionTerminoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.VersionTerminoConvocatoriaTO;

public class VersionTerminoTransf implements IVersionTerminoTransf {

	private ITerminoConvocatoriaDAO getTerminoDAO() {
		return DAOFactory.getInstance().getTerminosDao();
	}

	
	public VersionTerminoConvocatoriaDO transferirTODO(
			VersionTerminoConvocatoriaTO versionTO) {
		
		VersionTerminoConvocatoriaDO versionDO= new VersionTerminoConvocatoriaDO();
		
		if (versionTO.getId()!=null) {
			
			versionDO.setId(versionTO.getId());
		}
		
		versionDO.setCodigo(versionTO.getCodigo());
		
		versionDO.setDescripcion(versionTO.getDescripcion());
		
		versionDO.setFechaFin(versionTO.getFechaFin());
		
		versionDO.setFechaInicio(versionTO.getFechaInicio());
		
		versionDO.setNombre(versionTO.getNombre());
		
		versionDO.setObservacion(versionTO.getObservacion());
		
		
		versionDO.setTerminoConv(getTerminoDAO().cargar(versionTO.getTermino().getId()));
		
		return versionDO;
	}

	public VersionTerminoConvocatoriaTO transferirDOTO(
			VersionTerminoConvocatoriaDO versionDO) {
		
		VersionTerminoConvocatoriaTO versionTO = new VersionTerminoConvocatoriaTO();
		
		versionTO.setId(versionDO.getId());
		
		versionTO.setCodigo(versionDO.getCodigo());
		
		versionTO.setFechaFin(versionDO.getFechaFin());
		
		versionTO.setFechaInicio(versionDO.getFechaInicio());
		
		versionTO.setFechaRegistro(versionDO.getFechaRegistro());
		
		versionTO.setNombre(versionDO.getNombre());
		
		versionTO.setObservacion(versionDO.getObservacion());
		
		
		
		return versionTO;
	}

}
