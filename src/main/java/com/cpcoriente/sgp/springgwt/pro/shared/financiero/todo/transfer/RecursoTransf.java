package com.cpcoriente.sgp.springgwt.pro.shared.financiero.todo.transfer;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IActividadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RecursoDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RecursoDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.VersionRecursoDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IRecursoDetalleDAO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IRubroDAO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IRubroProyectoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IVersionRecursoDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IActividadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IRecursoDetalleTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IRecursoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IRubroProyectoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IRubroTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IVersionRecursoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RecursoDetalleTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RecursoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.VersionRecursoTO;

public class RecursoTransf implements IRecursoTransf {

	private static final Logger log = Logger.getLogger(RecursoTransf.class.getName());

	private IRubroTransf getRubroTransfer() {
		return TransfFactory.getInstance().getRubroTransf();
	}
	
	private IRubroDAO getRubroDAO() {
		return DAOFactory.getInstance().getRubroDao();
	}
	
	private IRubroProyectoTransf getRubroProyectoTransfer() {
		return TransfFactory.getInstance().getRubroProyectoTransf();
	}
	
	private IRubroProyectoDAO getRubroProyectoDAO() {
		return DAOFactory.getInstance().getRubroProyectoDao();
	}
	
	
	private IActividadDAO getActividadDAO() {
		return DAOFactory.getInstance().getActividadDao();
	}
	
	private IActividadTransf getActividadTransfer() {
		return TransfFactory.getInstance().getActividadTransf();
	}
	
	private IRecursoDetalleTransf getRecursoDetalleTransfer() {
		return TransfFactory.getInstance().getRecursoDetalleTransf();
	}
	
	private IRecursoDetalleDAO getRecursoDetalleDAO() {
		return DAOFactory.getInstance().getRecursoDetalleDao();
	}

	private IVersionRecursoTransf getVersionRecursoTransfer() {
		return TransfFactory.getInstance().getVersionRecursoTransf();
	}
	
	private IVersionRecursoDAO getVersionRecursoDAO() {
		return DAOFactory.getInstance().getVersionRecursoDao();
	}
	
	
	public RecursoDO transferirTODO(RecursoTO recursoTO) {
		
		RecursoDO recursoDO = new RecursoDO();
		
		if (recursoTO.getId()!=null) {
			
			recursoDO.setId(recursoTO.getId());
		}
		
		recursoDO.setActividad(getActividadDAO().cargar(recursoTO.getActividad().getId()));
	
		recursoDO.setDescripcion(recursoTO.getDescripcion());
		
		
		
		
		if(recursoTO.getRecDetList() != null && recursoTO.getRecDetList().size() > 0) {
			RecursoDetalleDO recDetalleCargado = null;
			Set<RecursoDetalleDO> recDetDOSet = new LinkedHashSet<RecursoDetalleDO>();
			for(RecursoDetalleTO recursoDetalle : recursoTO.getRecDetList()) {
				recDetalleCargado = getRecursoDetalleDAO().cargar(recursoDetalle.getId()); 
                 if (recDetalleCargado != null) {
                	 recDetalleCargado.setRecurso(recursoDO);
                	 recDetDOSet.add(recDetalleCargado);
                 } else {
                     log.warning("esta tratando de cargar un termino inexistente: " + recursoDetalle.getId());
                 }
			}
			if (recDetDOSet.size() > 0) {
				recursoDO.setRecDetalleSet(recDetDOSet);
			}
		}
		recursoDO.setRubro(getRubroDAO().cargar(recursoTO.getRubro().getId()));
		recursoDO.setRubroPro(getRubroProyectoDAO().cargar(recursoTO.getRubroProyecto().getId()));
		
		recursoDO.setVersion(recursoTO.getVersion());
		
		if(recursoTO.getVerRecursoList() != null && recursoTO.getVerRecursoList().size() > 0) {
			VersionRecursoDO recDetalleCargado = null;
			Set<VersionRecursoDO> recDetDOSet = new LinkedHashSet<VersionRecursoDO>();
			for(VersionRecursoTO recursoDetalle : recursoTO.getVerRecursoList()) {
				recDetalleCargado = getVersionRecursoDAO().cargar(recursoDetalle.getId()); 
                 if (recDetalleCargado != null) {
                	 recDetalleCargado.setRecurso(recursoDO);
                	 recDetDOSet.add(recDetalleCargado);
                 } else {
                     log.warning("esta tratando de cargar un version inexistente: " + recursoDetalle.getId());
                 }
			}
			if (recDetDOSet.size() > 0) {
				recursoDO.setVersionSet(recDetDOSet);
				
			}
		}

		
		
		return recursoDO;
	}

	public RecursoTO transferirDOTO(RecursoDO recursoDO) {
		
		RecursoTO recursoTO=new RecursoTO();
		
		if (recursoDO.getId()!=null) {
			
			recursoTO.setId(recursoDO.getId());
		}
		
		
		recursoTO.setActividad(getActividadTransfer().transferirDOTO(recursoDO.getActividad()));
		recursoTO.setDescripcion(recursoDO.getDescripcion());
		
		if (recursoDO.getRecDetalleSet() != null && recursoDO.getRecDetalleSet().size() > 0) {
			
			List<RecursoDetalleTO> recDetTOLista = new ArrayList<RecursoDetalleTO>(recursoDO.getRecDetalleSet().size());
			RecursoDetalleTO recProv = null;
			for (RecursoDetalleDO recurso : recursoDO.getRecDetalleSet()) {
				recProv = getRecursoDetalleTransfer().transferirDOTO(recurso);
				recDetTOLista.add(recProv);
			}
			if (recDetTOLista.size() > 0) {
				recursoTO.setRecDetList(recDetTOLista);
			}
		}

		recursoTO.setRubro(getRubroTransfer().transferirDOTO(recursoDO.getRubro()));
		
		recursoTO.setRubroProyecto(getRubroProyectoTransfer().transferirDOTO(recursoDO.getRubroPro()));
		
		if (recursoDO.getVersionSet() != null && recursoDO.getVersionSet().size() > 0) {
			
			List<VersionRecursoTO> versionTOLista = new ArrayList<VersionRecursoTO>(recursoDO.getVersionSet().size());
			VersionRecursoTO verProv = null;
			for (VersionRecursoDO version : recursoDO.getVersionSet()) {
				verProv = getVersionRecursoTransfer().transferirDOTO(version); 
				versionTOLista.add(verProv);
			}
			if (versionTOLista.size() > 0) {

				recursoTO.setVerRecursoList(versionTOLista);
			}
		}
		
		recursoTO.setVersion(recursoDO.getVersion());
		
		return recursoTO;
	}

}
