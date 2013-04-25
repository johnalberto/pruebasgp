package com.cpcoriente.sgp.springgwt.pro.shared.entidad.todo.transfer;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.ConvocatoriaDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.TerminoConvocatoriaDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IDivisionDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.ITerminoConvocatoriaDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IConvocatoriaTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IDivisionTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.ConvocatoriaTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.TerminoConvocatoriaTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.ITerminoConvocatoriaTransf;

public class ConvocatoriaTransf implements IConvocatoriaTransf {

	private static final Logger log = Logger.getLogger(ConvocatoriaTransf.class.getName());

	private IDivisionTransf getDivisionTransfer() {
		return TransfFactory.getInstance().getDivisionTransf();
	}
	
	private IDivisionDAO getDivisionDAO() {
		return DAOFactory.getInstance().getDivisionDao();
	}
	
	private ITerminoConvocatoriaTransf getTerminoTransfer() {
		return TransfFactory.getInstance().getTerminoTransf();
	}
	

	
	public ConvocatoriaDO transferirTODO(ConvocatoriaTO convocatoriaTO) {
		
		ConvocatoriaDO convocatoriaDO= new ConvocatoriaDO();
		
		if (convocatoriaTO.getId()!=null) {
			
			convocatoriaDO.setId(convocatoriaTO.getId());
		}
		
		convocatoriaDO.setCodigo(convocatoriaTO.getCodigo());
		
		if (convocatoriaTO.getDivision()!=null) {
			
			convocatoriaDO.setDivision(getDivisionDAO().cargar(convocatoriaTO.getDivision().getId()));
			
		}
		
		if(convocatoriaTO.getTerminoList() != null && convocatoriaTO.getTerminoList().size() > 0) {
			TerminoConvocatoriaDO terminoCargado = null;
			Set<TerminoConvocatoriaDO> terminoDOSet = new LinkedHashSet<TerminoConvocatoriaDO>();
			for(TerminoConvocatoriaTO termino : convocatoriaTO.getTerminoList()) {
				terminoCargado = getTerminoTransfer().transferirTODO(termino); 
                 if (terminoCargado != null) {
                	 terminoCargado.setConvocatoria(convocatoriaDO);
                	 terminoDOSet.add(terminoCargado);
                 } else {
                     log.warning("esta tratando de cargar un termino inexistente: " + termino.getId());
                 }
			}
			if (terminoDOSet.size() > 0) {
				convocatoriaDO.setTerminoSet(terminoDOSet);
			}
		}
		
		
		return convocatoriaDO;
	}

	public ConvocatoriaTO transferirDOTO(ConvocatoriaDO convocatoriaDO) {
		
		ConvocatoriaTO convocatoriaTO = new ConvocatoriaTO();
		
		convocatoriaTO.setId(convocatoriaDO.getId());
		
		convocatoriaTO.setCodigo(convocatoriaDO.getCodigo());
		
		convocatoriaTO.setDivision(getDivisionTransfer().transferirDOTO(convocatoriaDO.getDivision()));
		
		
		if (convocatoriaDO.getTerminoSet() != null && convocatoriaDO.getTerminoSet().size() > 0) {
			
			List<TerminoConvocatoriaTO> objetivoTOLista = new ArrayList<TerminoConvocatoriaTO>(convocatoriaDO.getTerminoSet().size());
			TerminoConvocatoriaTO objetivoProv = null;
			for (TerminoConvocatoriaDO objetivo : convocatoriaDO.getTerminoSet()) {
				objetivoProv = getTerminoTransfer().transferirDOTO(objetivo);
				objetivoTOLista.add(objetivoProv);
			}
			if (objetivoTOLista.size() > 0) {
				convocatoriaTO.setTerminoList(objetivoTOLista);
			}
		}
		
		return convocatoriaTO;
	}

}
