package com.cpcoriente.sgp.springgwt.pro.shared.informe.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IActividadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InformeInterventorFinDO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.IUsuarioDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IActividadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInformeInterventorFinTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InformeInterventorFinTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.IUsuarioTransf;

public class InformeInterventorFinTransf implements IInformeInterventorFinTransf {

	
	

	private IUsuarioTransf getUsuarioTransfer() {
		return TransfFactory.getInstance().getUsuarioTransf();
	}
	
	private IUsuarioDAO getUsuarioDAO() {
		return DAOFactory.getInstance().getUsuarioDao();
	}

	private IActividadDAO getActividadDAO() {
		return DAOFactory.getInstance().getActividadDao();
	}
	
	private IActividadTransf getActividadTransfer() {
		return TransfFactory.getInstance().getActividadTransf();
	}
	
	public InformeInterventorFinDO transferirTODO(
			InformeInterventorFinTO informeTO) {
		
		InformeInterventorFinDO informeDO= new InformeInterventorFinDO();
		
		if (informeTO.getId()!= null) {
			informeDO.setId(informeTO.getId());
		}
		
		informeDO.setCodigo(informeTO.getCodigo());
		
		informeDO.setDescripcion(informeTO.getDescripcion());
		
		informeDO.setFechaEvaluacion(informeTO.getFechaEvaluacion());
		
		informeDO.setFechaRegistro(informeTO.getFechaRegistro());
		
		
		informeDO.setPorcenEjecuFinanciero(informeTO.getPorEjecucionFinanciero());
		
		informeDO.setPorcenEjecuTecnico(informeTO.getPorEjecucionFinanciero());
		
		informeDO.setUsuario(getUsuarioDAO().cargar(informeTO.getUsuario().getId()));
		
		informeDO.setValorEjecutado(informeTO.getValorEjecutado());
		
		informeDO.setValorPresupuesto(informeTO.getValorPresupuesto());
		
	
		informeDO.setActividad(getActividadDAO().cargar(informeTO.getActividad().getId()));
		
		return informeDO;
	}

	public InformeInterventorFinTO transferirDOTO(
			InformeInterventorFinDO informeDO) {
		
		
		InformeInterventorFinTO informeTO = new InformeInterventorFinTO();
		
		if (informeDO.getId()!=null) {
			
			informeTO.setId(informeDO.getId());
		}
		
		informeTO.setActividad(getActividadTransfer().transferirDOTO(informeDO.getActividad()));

		informeTO.setCodigo(informeDO.getCodigo());
		
		informeTO.setDescripcion(informeDO.getDescripcion());
		
		informeTO.setFechaEvaluacion(informeDO.getFechaEvaluacion());
		
		informeTO.setFechaRegistro(informeDO.getFechaRegistro());
		
		
		informeTO.setPorEjecucionFinanciero(informeDO.getPorcenEjecuFinanciero());
		
		informeTO.setPorEjecuicionTecnico(informeDO.getPorcenEjecuTecnico());
		
		informeTO.setValorEjecutado(informeDO.getValorEjecutado());
		
		informeTO.setValorPresupuesto(informeDO.getValorPresupuesto());
		
		informeTO.setUsuario(getUsuarioTransfer().transferirDOTO(informeDO.getUsuario()));
		
		return informeTO;
	}

}
