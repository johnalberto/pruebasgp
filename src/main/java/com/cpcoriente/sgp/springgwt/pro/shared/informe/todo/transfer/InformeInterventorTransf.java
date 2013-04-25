package com.cpcoriente.sgp.springgwt.pro.shared.informe.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InformeInterventorDO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.IUsuarioDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInformeInterventorTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InformeInterventorTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.IUsuarioTransf;

public class InformeInterventorTransf implements IInformeInterventorTransf {



	private IUsuarioTransf getUsuarioTransfer() {
		return TransfFactory.getInstance().getUsuarioTransf();
	}
	
	private IUsuarioDAO getUsuarioDAO() {
		return DAOFactory.getInstance().getUsuarioDao();
	}
	
	
	

	
	public InformeInterventorDO transferirTODO(InformeInterventorTO informeTO) {
		
		InformeInterventorDO informeDO = new InformeInterventorDO();
		
		if (informeTO.getId()!=null) {
			
			informeDO.setId(informeTO.getId());
		}
		
		informeDO.setCodigo(informeTO.getCodigo());
		
		informeDO.setDescripcion(informeTO.getDescripcion());
		
		informeDO.setFechaEvaluacion(informeTO.getFechaEvaluacion());
		
			
		informeDO.setUsuario(getUsuarioDAO().cargar(informeTO.getUsuario().getId()));
		

		
		return informeDO;
	}

	public InformeInterventorTO transferirDOTO(InformeInterventorDO informeDO) {
		
		InformeInterventorTO informeTO = new InformeInterventorTO();
		
		informeTO.setId(informeDO.getId());
		
		informeTO.setCodigo(informeDO.getCodigo());
		
		informeTO.setDescripcion(informeDO.getDescripcion());
		
				
		informeTO.setUsuario(getUsuarioTransfer().transferirDOTO(informeDO.getUsuario()));
		return informeTO;
	}

}
