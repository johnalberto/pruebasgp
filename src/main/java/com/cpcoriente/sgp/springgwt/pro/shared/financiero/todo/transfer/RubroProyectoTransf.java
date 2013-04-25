package com.cpcoriente.sgp.springgwt.pro.shared.financiero.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RubroProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IRubroDAO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IProyectoDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IRubroProyectoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IRubroTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RubroProyectoTO;

public class RubroProyectoTransf implements IRubroProyectoTransf {

	

	private IProyectoDAO getProyectoDAO() {
		return DAOFactory.getInstance().getProyectoDao();
	}
	
	private IRubroTransf getRubroTransf() {
		return TransfFactory.getInstance().getRubroTransf();
	}

	private IRubroDAO getRubroDAO() {
		return DAOFactory.getInstance().getRubroDao();
	}

	public RubroProyectoDO transferirTODO(RubroProyectoTO rubroTO) {
		
		RubroProyectoDO rubroDO = new RubroProyectoDO();
		
		
		if (rubroTO.getId()!=null) {
			
			rubroDO.setId(rubroTO.getId());
		}
		
		if (rubroTO.getProyecto()!=null) {
			
			rubroDO.setProyecto(getProyectoDAO().cargar(rubroTO.getProyecto().getId()));

		}
		
		if (rubroTO.getRubro()!=null) {
			
			rubroDO.setRubro(getRubroDAO().cargar(rubroTO.getRubro().getId()));

		}
		
		return rubroDO;
	}

	public RubroProyectoTO transferirDOTO(RubroProyectoDO rubroDO) {
		
		RubroProyectoTO rubroTO = new RubroProyectoTO();
		
		rubroTO.setId(rubroDO.getId());
		
		rubroTO.setRubro(getRubroTransf().transferirDOTO(rubroDO.getRubro()));
		
		return rubroTO;
	}
	
	
	
	
}
