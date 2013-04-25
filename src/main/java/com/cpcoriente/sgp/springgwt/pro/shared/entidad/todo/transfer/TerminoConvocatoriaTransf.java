package com.cpcoriente.sgp.springgwt.pro.shared.entidad.todo.transfer;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.TerminoConvocatoriaDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.VersionTerminoConvocatoriaDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IConvocatoriaDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IVersionTerminoConvocatoriaDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IConvocatoriaTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IVersionTerminoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.TerminoConvocatoriaTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.VersionTerminoConvocatoriaTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.ITerminoConvocatoriaTransf;

public class TerminoConvocatoriaTransf implements ITerminoConvocatoriaTransf {

	
	private static final Logger log = Logger.getLogger(TerminoConvocatoriaTransf.class.getName());

	private IConvocatoriaTransf getConvocatoriaTransfer() {
		return TransfFactory.getInstance().getConvocatoriaTransf();
	}
	
	private IConvocatoriaDAO getConvocatoriaDAO() {
		return DAOFactory.getInstance().getConvocatoriaDao();
	}

	private IVersionTerminoTransf getVersionTerminoTransfer() {
		return TransfFactory.getInstance().getVersionTerminoTransf();
	}
	
	private IVersionTerminoConvocatoriaDAO getVersionTerminoDAO() {
		return DAOFactory.getInstance().getVersionTerminosDao();
	}
	
	public TerminoConvocatoriaDO transferirTODO(TerminoConvocatoriaTO terminoTO) {
		
		TerminoConvocatoriaDO terminoDO = new TerminoConvocatoriaDO();
		
		if (terminoDO.getId()!=null) {
			
			terminoDO.setId(terminoDO.getId());
		}
		
		terminoDO.setCodigo(terminoTO.getCodigo());
		
		terminoDO.setConvocatoria(getConvocatoriaDAO().cargar(terminoTO.getConvocatoria().getId()));
		
		terminoDO.setDescripcion(terminoTO.getDescripcion());
		
		terminoDO.setFechaFin(terminoTO.getFechaFin());
		
		terminoDO.setFechaInicio(terminoTO.getFechaInicio());
		
		terminoDO.setNombre(terminoTO.getNombre());
		
		if(terminoTO.getVersionTerminoList() != null && terminoTO.getVersionTerminoList().size() > 0) {
			VersionTerminoConvocatoriaDO versionCargado = null;
			Set<VersionTerminoConvocatoriaDO> versionDOSet = new LinkedHashSet<VersionTerminoConvocatoriaDO>();
			for(VersionTerminoConvocatoriaTO version : terminoTO.getVersionTerminoList()) {
				versionCargado = getVersionTerminoDAO().cargar(version.getId()); 
                 if (versionCargado != null) {
                	 versionCargado.setTerminoConv(terminoDO);
                	 versionDOSet.add(versionCargado);
                 } else {
                     log.warning("esta tratando de cargar una version inexistente: " + version.getId());
                 }
			}
			if (versionDOSet.size() > 0) {
				terminoDO.setVersionSet(versionDOSet);
			}
		}
		
		
		return terminoDO;
	}

	public TerminoConvocatoriaTO transferirDOTO(TerminoConvocatoriaDO terminoDO) {
		
		TerminoConvocatoriaTO terminoTO = new TerminoConvocatoriaTO();
		
		if (terminoDO.getId()!=null) {
			
			terminoTO.setId(terminoDO.getId());
		}

		terminoTO.setCodigo(terminoDO.getCodigo());
		
		terminoTO.setDescripcion(terminoDO.getDescripcion());
		
		terminoTO.setFechaFin(terminoDO.getFechaFin());
		
		terminoTO.setFechaInicio(terminoDO.getFechaInicio());
		
		terminoTO.setNombre(terminoDO.getNombre());
		
		if (terminoDO.getVersionSet() != null && terminoDO.getVersionSet().size() > 0) {
			
			List<VersionTerminoConvocatoriaTO> versionTOLista = new ArrayList<VersionTerminoConvocatoriaTO>(terminoDO.getVersionSet().size());
			VersionTerminoConvocatoriaTO versionProv = null;
			for (VersionTerminoConvocatoriaDO version : terminoDO.getVersionSet()) {
				versionProv =getVersionTerminoTransfer().transferirDOTO(version);
				versionTOLista.add(versionProv);
			}
			if (versionTOLista.size() > 0) {
				terminoTO.setVersionTerminoList(versionTOLista);
			}
		}
		
		return terminoTO;
	}
	
	
	
	

}
