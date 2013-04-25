package com.cpcoriente.sgp.springgwt.pro.shared.proyecto.todo.transfer;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ObjetivoDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IConvocatoriaDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IDivisionDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RubroProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IRubroProyectoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.VersionProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IVersionProyectoDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IObjetivoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ObjetivoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IConvocatoriaTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IDivisionTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IRubroProyectoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RubroProyectoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.enumerador.EstadoProyectoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IProyectoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IVersionProyectoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.ProyectoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.VersionProyectoTO;

public class ProyectoTransf implements IProyectoTransf {

	private static final Logger log = Logger.getLogger(ProyectoTransf.class.getName());

	private IDivisionTransf getDivisionTransf() {
		return TransfFactory.getInstance().getDivisionTransf();
	}

	private IDivisionDAO getDivisionDAO() {
		return DAOFactory.getInstance().getDivisionDao();
	}
	
	private IObjetivoTransf getObjetivoTransfer() {
		return TransfFactory.getInstance().getObjetivoTransf();
	}

	private IRubroProyectoTransf getRubroTransf() {
		return TransfFactory.getInstance().getRubroProyectoTransf();
	}
	
	private IRubroProyectoDAO getRubroProyectoDAO() {
		return DAOFactory.getInstance().getRubroProyectoDao();
	}
	
	private IVersionProyectoDAO getVersionProyectoDAO() {
		return DAOFactory.getInstance().getVersionProyectoDao();
	}
	
	private IVersionProyectoTransf getVersionProyectoTransfer() {
		return TransfFactory.getInstance().getVersionProyectoTransf();
	}
	
	private IConvocatoriaDAO getConvocatoriaDAO() {
		return DAOFactory.getInstance().getConvocatoriaDao();
	}
	
	private IConvocatoriaTransf getConvocatoriaTransfer() {
		return TransfFactory.getInstance().getConvocatoriaTransf();
	}
	
	public ProyectoDO transferirTODO(ProyectoTO proyectoTO) {
		
		ProyectoDO proyectoDO = new ProyectoDO();
		
		if (proyectoTO.getId()!=null) {
			
			proyectoDO.setId(proyectoTO.getId());
		}
		
		proyectoDO.setCodigo(proyectoTO.getCodigo());
		
		if (proyectoTO.getConvocatoria()!=null) {
			
			proyectoDO.setConvocatoria(getConvocatoriaDAO().cargar(proyectoTO.getConvocatoria().getId()));

		}
		
		proyectoDO.setEstado(proyectoTO.getEstado().getValor());
		proyectoDO.setFechaFin(proyectoTO.getFechaFin());
		proyectoDO.setFechaInicio(proyectoTO.getFechaInicio());

		if(proyectoTO.getObjetivosList() != null && proyectoTO.getObjetivosList().size() > 0) {
			ObjetivoDO objetivoCargado = null;
			Set<ObjetivoDO> objetivoDOSet = new LinkedHashSet<ObjetivoDO>();
			for(ObjetivoTO objetivo : proyectoTO.getObjetivosList()) {
				objetivoCargado = getObjetivoTransfer().transferirTODO(objetivo); 
                 if (objetivoCargado != null) {
                	 objetivoCargado.setProyecto(proyectoDO);
                	 objetivoDOSet.add(objetivoCargado);
                 } else {
                     log.warning("esta tratando de cargar una version inexistente inexistente: " + objetivo.getId());
                 }
			}
			if (objetivoDOSet.size() > 0) {
				proyectoDO.setObjetivoSet(objetivoDOSet);
			}
		}
		
		
		
		if(proyectoTO.getRubroProyectoList() != null && proyectoTO.getRubroProyectoList().size() > 0) {
			
			RubroProyectoDO rubroCargado = null;
			Set<RubroProyectoDO> rubroDOSet = new LinkedHashSet<RubroProyectoDO>();
			for(RubroProyectoTO rubro : proyectoTO.getRubroProyectoList()) {
				rubroCargado = getRubroProyectoDAO().cargar(rubro.getId()); 
                 if (rubroCargado != null) {
                	 rubroCargado.setProyecto(proyectoDO);
                	 rubroDOSet.add(rubroCargado);
                 } else {
                     log.warning("esta tratando de cargar una version inexistente inexistente: " + rubro.getId());
                 }
			}
			if (rubroDOSet.size() > 0) {
				proyectoDO.setRubroProyectoSet(rubroDOSet);
			}
		}
		
		
		
		proyectoDO.setTitulo(proyectoTO.getTitulo());
		
		if(proyectoTO.getVersionProyectoList() != null && proyectoTO.getVersionProyectoList().size() > 0) {
			VersionProyectoDO versionCargado = null;
			Set<VersionProyectoDO> versionDOSet = new LinkedHashSet<VersionProyectoDO>();
			for(VersionProyectoTO version : proyectoTO.getVersionProyectoList()) {
				versionCargado = getVersionProyectoDAO().cargar(version.getId());
                 if (versionCargado != null) {
                	 versionCargado.setProyecto(proyectoDO);
                	 versionDOSet.add(versionCargado);
                 } else {
                     log.warning("esta tratando de cargar una version inexistente inexistente: " + version.getId());
                 }
			}
			if (versionDOSet.size() > 0) {
				proyectoDO.setVersionSet(versionDOSet);
			}
		}
		
		
		proyectoDO.setVersion(proyectoTO.getVersion());
		
		
		return proyectoDO;
	}

	public ProyectoTO transferirDOTO(ProyectoDO proyectoDO) {
		
		ProyectoTO proyectoTO = new ProyectoTO();
		
		proyectoTO.setId(proyectoDO.getId());
		
		proyectoTO.setConvocatoria(getConvocatoriaTransfer().transferirDOTO(proyectoDO.getConvocatoria()));
		
		proyectoTO.setEstado(EstadoProyectoEnum.tomarTipoPorValor(proyectoDO.getEstado()));
		
		proyectoTO.setFechaFin(proyectoDO.getFechaFin());
		
		proyectoTO.setFechaInicio(proyectoDO.getFechaInicio());
		
		if (proyectoDO.getObjetivoSet() != null && proyectoDO.getObjetivoSet().size() > 0) {
			
			List<ObjetivoTO> objetivoTOLista = new ArrayList<ObjetivoTO>(proyectoDO.getObjetivoSet().size());
			ObjetivoTO objetivoProv = null;
			for (ObjetivoDO objetivo : proyectoDO.getObjetivoSet()) {
				objetivoProv = getObjetivoTransfer().transferirDOTO(objetivo);
				objetivoTOLista.add(objetivoProv);
			}
			if (objetivoTOLista.size() > 0) {
				proyectoTO.setObjetivosList(objetivoTOLista);
			}
		}
		
	
		
		if (proyectoDO.getRubroProyectoSet() != null && proyectoDO.getRubroProyectoSet().size() > 0) {
			
			List<RubroProyectoTO> rubroTOLista = new ArrayList<RubroProyectoTO>(proyectoDO.getRubroProyectoSet().size());
			RubroProyectoTO rubroProv = null;
			for (RubroProyectoDO rubro : proyectoDO.getRubroProyectoSet()) {
				rubroProv = getRubroTransf().transferirDOTO(rubro);
				rubroTOLista.add(rubroProv);
			}
			if (rubroTOLista.size() > 0) {
				proyectoTO.setRubroProyectoList(rubroTOLista);
			}
		}
		
		
		proyectoTO.setTitulo(proyectoDO.getTitulo());
		
		
		if (proyectoDO.getVersionSet() != null && proyectoDO.getVersionSet().size() > 0) {
			
			List<VersionProyectoTO> rubroTOLista = new ArrayList<VersionProyectoTO>(proyectoDO.getVersionSet().size());
			VersionProyectoTO rubroProv = null;
			for (VersionProyectoDO rubro : proyectoDO.getVersionSet()) {
				rubroProv = getVersionProyectoTransfer().transferirDOTO(rubro);
				rubroTOLista.add(rubroProv);
			}
			if (rubroTOLista.size() > 0) {
				proyectoTO.setVersionProyectoList(rubroTOLista);
			}
		}

		proyectoTO.setVersion(proyectoDO.getVersion());
		
		return proyectoTO;
	}

}
