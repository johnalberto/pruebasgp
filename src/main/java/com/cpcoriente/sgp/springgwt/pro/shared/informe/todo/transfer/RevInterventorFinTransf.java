package com.cpcoriente.sgp.springgwt.pro.shared.informe.todo.transfer;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.RevInterventorFinDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.RevInterventorFinDetDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IRevInterventorFinDetDAO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.IUsuarioDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IRevInterventorFinDetTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IRevInterventorFinTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.RevInterventorFinDetTO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.RevInterventorFinTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.IUsuarioTransf;

public class RevInterventorFinTransf implements IRevInterventorFinTransf {
	
	

	private static final Logger log = Logger.getLogger(InformeInterventorTransf.class.getName());

	private IUsuarioTransf getUsuarioTransfer() {
		return TransfFactory.getInstance().getUsuarioTransf();
	}
	
	private IUsuarioDAO getUsuarioDAO() {
		return DAOFactory.getInstance().getUsuarioDao();
	}
	
	private IRevInterventorFinDetTransf getRevIntFinDetTransfer() {
		return TransfFactory.getInstance().getRevIntFinDetTransf();
	}
	
	private IRevInterventorFinDetDAO getRevIntFinDetDAO() {
		return DAOFactory.getInstance().getRevIntFinDetDao();
	}
	
	
	
	
	public RevInterventorFinDO transferirTODO(RevInterventorFinTO revisionTO) {
		
		RevInterventorFinDO revisionDO = new RevInterventorFinDO();
		
		if (revisionTO.getId()!=null) {
			
			revisionDO.setId(revisionTO.getId());
		}
		
		revisionDO.setCodigo(revisionTO.getCodigo());
		
		revisionDO.setDescripcion(revisionTO.getDescripcion());
		
		revisionDO.setFechaEvaluacion(revisionTO.getFechaEvaluacion());
		
		revisionDO.setFechaRegistro(revisionTO.getFechaRegistro());
		
		if(revisionTO.getRevIntFinDetList() != null && revisionTO.getRevIntFinDetList().size() > 0) {
			RevInterventorFinDetDO infDetCargado = null;
			Set<RevInterventorFinDetDO> infDetDOSet = new LinkedHashSet<RevInterventorFinDetDO>();
			for(RevInterventorFinDetTO infDet : revisionTO.getRevIntFinDetList()) {
				infDetCargado = getRevIntFinDetDAO().cargar(infDet.getId()); 
                 if (infDetCargado != null) {
                	 infDetCargado.setRevIntFin(revisionDO);
                	 infDetDOSet.add(infDetCargado);
                 } else {
                     log.warning("esta tratando de cargar una version inexistente inexistente: " );
                 }
			}
			if (infDetDOSet.size() > 0) {
				
				revisionDO.setRevFinDetSet(infDetDOSet);
			}
		}
		
		revisionDO.setUsuario(getUsuarioDAO().cargar(revisionTO.getUsuario().getId()));
		

		return revisionDO;
	}

	public RevInterventorFinTO transferirDOTO(RevInterventorFinDO revisionDO) {
		
		RevInterventorFinTO revisionTO = new RevInterventorFinTO();
		
		revisionTO.setId(revisionDO.getId());
		
		revisionTO.setCodigo(revisionDO.getCodigo());
		
		revisionTO.setDescripcion(revisionDO.getDescripcion());

		revisionTO.setFechaEvaluacion(revisionDO.getFechaEvaluacion());
		
		revisionTO.setFechaRegistro(revisionDO.getFechaRegistro());
		
		
		if (revisionDO.getRevFinDetSet() != null && revisionDO.getRevFinDetSet().size() > 0) {
			
			List<RevInterventorFinDetTO> objetivoTOLista = new ArrayList<RevInterventorFinDetTO>(revisionDO.getRevFinDetSet().size());
			RevInterventorFinDetTO objetivoProv = null;
			for (RevInterventorFinDetDO objetivo : revisionDO.getRevFinDetSet()) {
				objetivoProv = getRevIntFinDetTransfer().transferirDOTO(objetivo);
				objetivoTOLista.add(objetivoProv);
			}
			if (objetivoTOLista.size() > 0) {
				
				revisionTO.setRevIntFinDetList(objetivoTOLista);
			}
		}
		
		revisionTO.setUsuario(getUsuarioTransfer().transferirDOTO(revisionDO.getUsuario()));
		
		return revisionTO;
	}

}
