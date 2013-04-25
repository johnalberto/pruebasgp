package com.cpcoriente.sgp.springgwt.pro.shared.proyecto.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.DocProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IProyectoDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IDocProyectoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IProyectoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.DocProyectoTO;

public class DocProyectoTransf implements IDocProyectoTransf {

	
	private IProyectoTransf getProyectoTransf() {
		return TransfFactory.getInstance().getProyectoTransf();
	}

	private IProyectoDAO getProyectoDAO() {
		return DAOFactory.getInstance().getProyectoDao();
	}

	
	public DocProyectoDO transferirTODO(DocProyectoTO docProTO) {
		
		DocProyectoDO docPro = new DocProyectoDO();
		
		if (docProTO.getId()!=null) {
			
			docPro.setId(docProTO.getId());
		}
		
		docPro.setDescripcion(docProTO.getDescripcion());
		
		docPro.setDocumento(docProTO.getDocumento());
		
		docPro.setNombre(docProTO.getNombre());
		
		docPro.setProyecto(getProyectoDAO().cargar(docProTO.getId()));
		
		docPro.setVersion(docProTO.getVersion());
		
		
		return docPro;
	}

	public DocProyectoTO transferirDOTO(DocProyectoDO docProDO) {
		
		DocProyectoTO docPro = new DocProyectoTO();
		
		docPro.setId(docProDO.getId());
		
		docPro.setDescripcion(docProDO.getDescripcion());
		
		docPro.setDocumento(docProDO.getDocumento());
		
		docPro.setFechaRegistro(docProDO.getFechaRegistro());
		
		docPro.setNombre(docProDO.getNombre());
		
		docPro.setVersion(docProDO.getVersion());
		
		
		return docPro;
	}

}
