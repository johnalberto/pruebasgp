package com.cpcoriente.sgp.springgwt.pro.shared.proyecto.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IEntidadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ProyectoEntidadDO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IProyectoDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IEntidadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.enumerador.TipoFuncionProyectoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IProyectoEntidadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IProyectoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.ProyectoEntidadTO;

public class ProyectoEntidadTransf implements IProyectoEntidadTransf {

	private IEntidadTransf getEntidadTransfer() {
		return TransfFactory.getInstance().getEntidadTransf();
	}
	
	private IEntidadDAO getEntidadDAO() {
		return DAOFactory.getInstance().getEntidadoDao();
	}

	private IProyectoTransf getProyectoTransfer() {
		return TransfFactory.getInstance().getProyectoTransf();
	}
	
	private IProyectoDAO getProyectoDAO() {
		return DAOFactory.getInstance().getProyectoDao();
	}
	
	public ProyectoEntidadDO transferirTODO(ProyectoEntidadTO proEntTO) {
		
		ProyectoEntidadDO proEntDO = new ProyectoEntidadDO();
		
		if (proEntTO.getId() != null ) {
			
			proEntDO.setId(proEntTO.getId());
		}
		
		
		proEntDO.setEntidad(getEntidadDAO().cargar(proEntTO.getEntidad().getId()));
		
		proEntDO.setProyecto(getProyectoDAO().cargar(proEntTO.getProyecto().getId()));
		
		proEntDO.setTipoFuncion(proEntTO.getTipoFuncion().getValor());
		
		return proEntDO;
	}

	public ProyectoEntidadTO transferirDOTO(ProyectoEntidadDO proEntDO) {
		
		ProyectoEntidadTO proEntTO = new ProyectoEntidadTO();
		
		proEntTO.setId(proEntDO.getId());
		
		proEntTO.setEntidad(getEntidadTransfer().transferirDOTO(proEntDO.getEntidad()));
		
		proEntTO.setProyecto(getProyectoTransfer().transferirDOTO(proEntDO.getProyecto()));
		
		proEntTO.setTipoFuncion(TipoFuncionProyectoEnum.tomarTipoPorValor(proEntDO.getTipoFuncion()));
		
		return proEntTO;
	}

}
