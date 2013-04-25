package com.cpcoriente.sgp.springgwt.pro.shared.entidad.todo.transfer;

import java.util.logging.Logger;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.DivisionDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IConvocatoriaDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IDivisionDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IEntidadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IConvocatoriaTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IDivisionTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IEntidadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IProyectoTransf;

public class DivisionTransf implements IDivisionTransf {

	private static final Logger log = Logger.getLogger(DivisionTransf.class.getName());

	private IEntidadTransf getEntidadTransfer() {
		return TransfFactory.getInstance().getEntidadTransf();
	}
	
	private IEntidadDAO getEntidadDAO() {
		return DAOFactory.getInstance().getEntidadoDao();
	}

	private IDivisionDAO getDivisionDAO() {
		return DAOFactory.getInstance().getDivisionDao();
	}
	
	private IProyectoTransf getProyectoTransfer(){
		
		return TransfFactory.getInstance().getProyectoTransf();
	}
	
	private IConvocatoriaDAO getConvocatoriaDao(){
		
		return DAOFactory.getInstance().getConvocatoriaDao();
	}
	
	private IConvocatoriaTransf getConvocatoriaTranf(){
		
		return TransfFactory.getInstance().getConvocatoriaTransf();

	}
	
	public DivisionDO transferirTODO(DivisionTO divisionTO) {
		
		DivisionDO divisionDO = new DivisionDO();

		if (divisionTO.getId() != null) {
			divisionDO.setId(divisionTO.getId());
		}
		
		if (divisionTO.getEntidad() != null) {
			divisionDO.setEntidad(getEntidadDAO().cargar(divisionTO.getEntidad().getId()));
			
		}
	
		if (divisionTO.getPadre() != null) {
			divisionDO.setPadre(getDivisionDAO().cargar(divisionTO.getPadre().getId()));
			
		}
		
		divisionDO.setCodigo(divisionTO.getCodigo());
		divisionDO.setNombre(divisionTO.getNombre());
		
				
		return divisionDO;
	}

	public DivisionTO transferirDOTO(DivisionDO divisionDO) {

		DivisionTO entidadTO = new DivisionTO();
		
		entidadTO.setId(divisionDO.getId());
		entidadTO.setCodigo(divisionDO.getCodigo());
		entidadTO.setNombre(entidadTO.getNombre());
		
		if (divisionDO.getEntidad() != null) {
			entidadTO.setEntidad(getEntidadTransfer().transferirDOTO(divisionDO.getEntidad()));
		}
		
		
		
		
		return entidadTO;
	}

	
	
}
