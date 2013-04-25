package com.cpcoriente.sgp.springgwt.pro.shared.proyecto.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IDivisionDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao.ICiudadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao.IDepartamentoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao.IPaisDAO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ContactoProyectoEntidadDO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IProyectoEntidadDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IDivisionTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.ICiudadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.IDepartamentoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.IPaisTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IContactoProyectoEntidadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IProyectoEntidadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.ContactoProyectoEntidadTO;

public class ContactoProyectoEntidadTransf implements IContactoProyectoEntidadTransf {

	private IProyectoEntidadTransf getProyectoTransf() {
		return TransfFactory.getInstance().getProyectoEntidadTransf();
	}

	private IProyectoEntidadDAO getProyectoDAO() {
		return DAOFactory.getInstance().getProyectoEntidadDao();
	}
	
	
	private IPaisTransf getPaisTransf() {
		return TransfFactory.getInstance().getPaisTransf();
	}

	private IPaisDAO getPaisDAO() {
		return DAOFactory.getInstance().getPaisDao();
	}
	
	private IDepartamentoTransf getDepartamentoTransf() {
		return TransfFactory.getInstance().getDepartamentoTransf();
	}

	private IDepartamentoDAO getDepartamentoDAO() {
		return DAOFactory.getInstance().getDepartamentoDao();
	}
	
	private ICiudadTransf getCiudadTransf() {
		return TransfFactory.getInstance().getCiudadTransf();
	}

	private ICiudadDAO getCiudadDAO() {
		return DAOFactory.getInstance().getCiudadDao();
	}
	
	
	public ContactoProyectoEntidadDO transferirTODO(
			ContactoProyectoEntidadTO contactoTO) {
		
		ContactoProyectoEntidadDO contactoDO = new ContactoProyectoEntidadDO();
		
		if (contactoTO.getId()!=null) {
			
			contactoDO.setId(contactoTO.getId());
		}
		
		contactoDO.setApellidos(contactoTO.getApellidos());
		
		contactoDO.setCiudad(getCiudadDAO().cargar(contactoTO.getCiudad().getId()));
		
		contactoDO.setDireccion(contactoTO.getDireccion());
		
		contactoDO.setDpto(getDepartamentoDAO().cargar(contactoTO.getDepartamento().getId()));
		
		contactoDO.setEmail(contactoTO.getEmail());
		
		contactoDO.setNombres(contactoTO.getNombre());
		
		contactoDO.setObservacion(contactoTO.getObservaciones());
		
		contactoDO.setPais(getPaisDAO().cargar(contactoTO.getPais().getId()));
		
		contactoDO.setProyectoporentidad(getProyectoDAO().cargar(contactoTO.getProyectoEntidad().getId()));
		
		contactoDO.setTelefono1(contactoTO.getTelefono1());
		
		contactoDO.setTelefono2(contactoTO.getTelefono2());
		
		contactoDO.setVersion(contactoTO.getVersion());
		
		return contactoDO;
	}

	public ContactoProyectoEntidadTO transferirDOTO(
			ContactoProyectoEntidadDO contactoDO) {
		
		ContactoProyectoEntidadTO contactoTO = new ContactoProyectoEntidadTO();
		
		if (contactoDO.getId()!=null) {
			
			contactoTO.setId(contactoDO.getId());
		}
		
		contactoTO.setApellidos(contactoDO.getApellidos());
		
		contactoTO.setCiudad(getCiudadTransf().transferirDOTO(contactoDO.getCiudad()));
		
		contactoTO.setDepartamento(getDepartamentoTransf().transferirDOTO(contactoDO.getDpto()));
		
		contactoTO.setDireccion(contactoDO.getDireccion());
		
		contactoTO.setEmail(contactoDO.getEmail());
		
		contactoTO.setNombre(contactoDO.getNombres());
		
		contactoTO.setObservaciones(contactoDO.getObservacion());
		
		contactoTO.setPais(getPaisTransf().transferirDOTO(contactoDO.getPais()));
		
		contactoTO.setProyectoEntidad(getProyectoTransf().transferirDOTO(contactoDO.getProyectoporentidad()));
		
		contactoTO.setTelefono1(contactoDO.getTelefono1());
		
		contactoTO.setTelefono2(contactoDO.getTelefono2());
		
		contactoTO.setVersion(contactoDO.getVersion());

		return contactoTO;
	}

}
