package com.cpcoriente.sgp.springgwt.pro.shared.financiero.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IEmpresaDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IEntidadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RubroDO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IEmpresaTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IEntidadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IRubroTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RubroTO;

public class RubroTransf implements IRubroTransf {

	
	
	
	private IEntidadTransf getEntidadTransf() {
		return TransfFactory.getInstance().getEntidadTransf();
	}

	private IEntidadDAO getEntidadDAO() {
		return DAOFactory.getInstance().getEntidadoDao();
	}
	
	public RubroDO transferirTODO(RubroTO rubroTO) {
		
		RubroDO rubroDO = new RubroDO();
		
		if (rubroTO.getId()!=null) {
			
			rubroDO.setId(rubroTO.getId());
		}
		
		rubroDO.setCodigo(rubroTO.getCodigo());
		if (rubroTO.getEntidad()!=null) {
			
			rubroDO.setEntidad(getEntidadDAO().cargar(rubroTO.getEntidad().getId()));

		}
		
		rubroDO.setNombre(rubroTO.getNombre());
		
		rubroDO.setVersion(rubroTO.getVersion());
	
		return rubroDO;
	}

	public RubroTO transferirDOTO(RubroDO rubroDO) {
		
		RubroTO rubroTO = new RubroTO();
		
		rubroTO.setId(rubroDO.getId());
		
		rubroTO.setCodigo(rubroDO.getCodigo());
		
		rubroTO.setEntidad(getEntidadTransf().transferirDOTO(rubroDO.getEntidad()));
		
		rubroTO.setNombre(rubroDO.getNombre());
		
		rubroTO.setVersion(rubroDO.getVersion());
		
		return rubroTO;
	}

}
