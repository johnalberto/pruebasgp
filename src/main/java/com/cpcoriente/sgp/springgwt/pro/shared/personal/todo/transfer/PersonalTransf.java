/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.personal.todo.transfer;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ActividadPorPersonalDO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InformeDO;
import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.CargoPorPersonalDO;
import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.PersonalDO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IActividadPorPersonalTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ActividadPorPersonalTO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInformeTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InformeTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.IUsuarioProyectoEntidadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.ICargoPorPersonalTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.IPersonalTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.CargoPorPersonalTO;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.PersonalTO;

/**
 * @author CPC-04
 *
 */
public class PersonalTransf implements IPersonalTransf {

	
	private static final Logger log = Logger.getLogger(PersonalTransf.class.getName());
	
	private IUsuarioProyectoEntidadTransf getUsuarioProyectoEntidadTransf() {
		return TransfFactory.getInstance().getUsuProEntTransf();
	}
	
	private ICargoPorPersonalTransf getCargoPorPersonalTransf() {
		return TransfFactory.getInstance().getCargoPorPersonalTransf();
	}
	
	private IInformeTransf getInformeTransf() {
		return TransfFactory.getInstance().getInformeTransf();
	}
	
	private IActividadPorPersonalTransf getActividadPorPersonalTransf() {
		return TransfFactory.getInstance().getActividadPorPersonalTransf();
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.IPersonalTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.PersonalTO)
	 */
	public PersonalDO transferirTODO(PersonalTO personalTO) {
		
		PersonalDO personalDO = new PersonalDO();
		
		if (personalTO.getId() != null) {
			personalDO.setId(personalTO.getId());
		}
		
		personalDO.setActivo(personalTO.isActivo());
		
		if (personalTO.getUsuarioProyecto() != null) {
			personalDO.setUsuarioProyecto(getUsuarioProyectoEntidadTransf().transferirTODO(personalTO.getUsuarioProyecto()));
		}
		
		
		if(personalTO.getCppLista() != null && personalTO.getCppLista().size() > 0) {
			CargoPorPersonalDO personaCargado = null;
			Set<CargoPorPersonalDO> personalDOSet = new LinkedHashSet<CargoPorPersonalDO>();
			for(CargoPorPersonalTO per : personalTO.getCppLista()) {
				personaCargado = getCargoPorPersonalTransf().transferirTODO(per);
                 if (personaCargado != null) {
                	 personaCargado.setPersona(personalDO);
                	 personalDOSet.add(personaCargado);
                 } else {
                     log.warning("esta tratando de cargar un cargo Por Personal inexistente con id: " + per.getId());
                 }
			}
			if (personalDOSet.size() > 0) {
				personalDO.setCppSet(personalDOSet);
			}
		}
		
		
		if(personalTO.getInformeLista() != null && personalTO.getInformeLista().size() > 0) {
			InformeDO informeCargado = null;
			Set<InformeDO> informeDOSet = new LinkedHashSet<InformeDO>();
			for(InformeTO informe : personalTO.getInformeLista()) {
				informeCargado = getInformeTransf().transferirTODO((informe));
                 if (informeCargado != null) {
                	 informeCargado.setPersona(personalDO);
                	 informeDOSet.add(informeCargado);
                 } else {
                     log.warning("esta tratando de cargar un informe inexistente con id: " + informe.getId());
                 }
			}
			if (informeDOSet.size() > 0) {
				personalDO.setInformeSet(informeDOSet);
			}
		}
		
		
		if(personalTO.getActividadPorPersonalLista() != null && personalTO.getActividadPorPersonalLista().size() > 0) {
			ActividadPorPersonalDO actividadPorPersonalCargado = null;
			Set<ActividadPorPersonalDO> actividadPorPersonalDOSet = new LinkedHashSet<ActividadPorPersonalDO>();
			for(ActividadPorPersonalTO actividadPorPersonal : personalTO.getActividadPorPersonalLista()) {
				actividadPorPersonalCargado = getActividadPorPersonalTransf().transferirTODO(actividadPorPersonal);
                 if (actividadPorPersonalCargado != null) {
                	 actividadPorPersonalCargado.setPersona(personalDO);
                	 actividadPorPersonalDOSet.add(actividadPorPersonalCargado);
                 } else {
                     log.warning("esta tratando de cargar un actividad Por Personal inexistente con id: " + actividadPorPersonal.getId());
                 }
			}
			if (actividadPorPersonalDOSet.size() > 0) {
				personalDO.setActividadPorPersonalSet(actividadPorPersonalDOSet);
			}
		}
	
		return personalDO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.IPersonalTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.personal.entity.PersonalDO)
	 */
	public PersonalTO transferirDOTO(PersonalDO personalDO) {

		PersonalTO personalTO = new PersonalTO();
		
		
		personalTO.setId(personalDO.getId());
		
		personalTO.setActivo(personalDO.isActivo());
		
		if (personalDO.getUsuarioProyecto() != null) {
			personalTO.setUsuarioProyecto(getUsuarioProyectoEntidadTransf().transferirDOTO(personalDO.getUsuarioProyecto()));
		}
		
		
		if(personalDO.getActividadPorPersonalSet() != null && personalDO.getActividadPorPersonalSet().size() > 0) {
			ActividadPorPersonalTO factDetCargada = null;
			List<ActividadPorPersonalTO> factDetTOList = new ArrayList<ActividadPorPersonalTO>(personalDO.getActividadPorPersonalSet().size());
			
			for(ActividadPorPersonalDO actiPorPerso : personalDO.getActividadPorPersonalSet()) {
				factDetCargada = getActividadPorPersonalTransf().transferirDOTO(actiPorPerso);
				factDetTOList.add(factDetCargada);                 
			}
			if (factDetTOList.size() > 0) {
				personalTO.setActividadPorPersonalLista(factDetTOList);
			}
		}
		
		
		if(personalDO.getCppSet() != null && personalDO.getCppSet().size() > 0) {
			CargoPorPersonalTO cppCargado = null;
			List<CargoPorPersonalTO> cppTOList = new ArrayList<CargoPorPersonalTO>(personalDO.getCppSet().size());
			
			for(CargoPorPersonalDO cpp : personalDO.getCppSet()) {
				cppCargado = getCargoPorPersonalTransf().transferirDOTO(cpp);
				cppTOList.add(cppCargado);                 
			}
			if (cppTOList.size() > 0) {
				personalTO.setCppLista(cppTOList);
			}
		}
		
		if(personalDO.getInformeSet() != null && personalDO.getInformeSet().size() > 0) {
			InformeTO informeCargado = null;
			List<InformeTO> informeTOList = new ArrayList<InformeTO>(personalDO.getInformeSet().size());
			
			for(InformeDO informe : personalDO.getInformeSet()) {
				informeCargado = getInformeTransf().transferirDOTO(informe);
				informeTOList.add(informeCargado);                 
			}
			if (informeTOList.size() > 0) {
				personalTO.setInformeLista(informeTOList);
			}
		}
		
		
		return personalTO;
	}

}
