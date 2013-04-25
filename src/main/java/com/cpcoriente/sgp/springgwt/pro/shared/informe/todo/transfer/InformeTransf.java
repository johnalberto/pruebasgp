/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.informe.todo.transfer;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InformeDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InformeDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao.IPersonalDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInformeDetalleTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInformeTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InformeDetalleTO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InformeTO;

/**
 * @author CPC-04
 *
 */
public class InformeTransf implements IInformeTransf{


	private static final Logger log = Logger.getLogger(InformeTransf.class.getName());
	
	
	private IInformeDetalleTransf getInformeDetalleTransf() {
		return TransfFactory.getInstance().getInformeDetalleTransf();
	}
	
	private IPersonalDAO getPersonalDAO() {
		return DAOFactory.getInstance().getPersonalDao();
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInformeTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InformeTO)
	 */
	public InformeDO transferirTODO(InformeTO informeTO) {

		InformeDO informeDO =  new InformeDO();
		
		
		if (informeTO.getId() != null) {
			informeDO.setId(informeTO.getId());
		}
		
		informeDO.setCodigo(informeTO.getCodigo());
		informeDO.setDescripcion(informeTO.getDescripcion());
		informeDO.setFechaRegistro(informeTO.getFechaRegistro());
		informeDO.setVobo(informeTO.isVoBo());
		informeDO.setVersion(informeTO.getVersion());
		
		if (informeTO.getPersona() != null ) {
			informeDO.setPersona(getPersonalDAO().cargar(informeTO.getPersona().getId()));
		}
		
		
		if(informeTO.getInformeDetalleLista() != null && informeTO.getInformeDetalleLista().size() > 0) {
			InformeDetalleDO infoDetCargado = null;
			Set<InformeDetalleDO> infoDetDOSet = new LinkedHashSet<InformeDetalleDO>();
			for(InformeDetalleTO factDet : informeTO.getInformeDetalleLista()) {
				infoDetCargado = getInformeDetalleTransf().transferirTODO(factDet);
                 if (infoDetCargado != null) {
                	 infoDetCargado.setInforme(informeDO);
                	 infoDetDOSet.add(infoDetCargado);
                 } else {
                     log.warning("esta tratando de cargar un detalle de Informe inexistente con id: " + factDet.getId());
                 }
			}
			if (infoDetDOSet.size() > 0) {
				informeDO.setInformeDetalleSet(infoDetDOSet);
			}
		}
		
		
		
		return informeDO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInformeTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InformeDO)
	 */
	public InformeTO transferirDOTO(InformeDO informeDO) {

		InformeTO informeTO = new InformeTO();

		informeTO.setId(informeDO.getId());
	
	
		informeTO.setCodigo(informeDO.getCodigo());
		informeTO.setDescripcion(informeDO.getDescripcion());
		informeTO.setFechaRegistro(informeDO.getFechaRegistro());
		informeTO.setVoBo(informeDO.isVobo());
		informeTO.setVersion(informeDO.getVersion());
			
		if(informeDO.getInformeDetalleSet() != null && informeDO.getInformeDetalleSet().size() > 0) {
			InformeDetalleTO infoDetCargado = null;
			List<InformeDetalleTO> infoDetTOList = new ArrayList<InformeDetalleTO>(informeDO.getInformeDetalleSet().size());
			
			for(InformeDetalleDO infoDet : informeDO.getInformeDetalleSet()) {
				infoDetCargado = getInformeDetalleTransf().transferirDOTO(infoDet);
				infoDetTOList.add(infoDetCargado);                 
			}
			if (infoDetTOList.size() > 0) {
				informeTO.setInformeDetalleLista(infoDetTOList);
			}
		}
		
		
		return informeTO;
	}

}
