package com.cpcoriente.sgp.springgwt.pro.shared.financiero.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.VersionRecursoDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IRecursoDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IVersionRecursoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.VersionRecursoTO;

public class VersionRecursoTransf implements IVersionRecursoTransf {

	
	
	private IRecursoDAO getRecursoDAO() {
		return DAOFactory.getInstance().getRecursoDao();
	}
	
	public VersionRecursoDO transferirTODO(VersionRecursoTO versionTO) {
		
		VersionRecursoDO versionDO = new VersionRecursoDO();
		
		if (versionTO.getId()!=null) {
			
			versionDO.setId(versionTO.getId());
		}

		versionDO.setDescripcion(versionTO.getDescripcion());
		
		versionDO.setFechaRegistro(versionTO.getFechaRegistro());
		
		versionDO.setObservacion(versionTO.getObservacion());
		
		versionDO.setRecurso(getRecursoDAO().cargar(versionTO.getRecurso().getId()));
		
				
		
		
		return versionDO;
	}

	public VersionRecursoTO transferirDOTO(VersionRecursoDO versionDO) {
		
		
		VersionRecursoTO versionTO = new VersionRecursoTO();
		

		versionTO.setId(versionDO.getId());
		
		versionTO.setDescripcion(versionDO.getDescripcion());
		
		versionTO.setFechaRegistro(versionDO.getFechaRegistro());
		
		versionTO.setObservacion(versionDO.getObservacion());
		
		
		
		return versionTO;
	}

}
