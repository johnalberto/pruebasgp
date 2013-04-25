package com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.todo.tranfer;

import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.entity.DocMensajeDO;
import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.interfaces.dao.IMensajeDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.interfaces.transfer.IDocMensajeTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.objeto.DocMensajeTO;

public class DocMensajeTransf implements IDocMensajeTransf {

	private IMensajeDAO getMensajeDao() {
		return DAOFactory.getInstance().getMensajeDao();
	}

	
	public DocMensajeDO transferirTODO(DocMensajeTO docMensajeTO) {
		
		DocMensajeDO docMensajeDO = new DocMensajeDO();
		
		if (docMensajeTO.getId()!=null) {
			
			docMensajeDO.setId(docMensajeTO.getId());
		}
		docMensajeDO.setDescripcion(docMensajeTO.getDescripcion());
		
		docMensajeDO.setDocumento(docMensajeTO.getDocumento());
		
		docMensajeDO.setFechaRegistro(docMensajeTO.getFechaRegistro());
		
		docMensajeDO.setMensaje(getMensajeDao().cargar(docMensajeTO.getMensaje().getId()));
		
		
		
		return docMensajeDO;
	}

	public DocMensajeTO transferirDOTO(DocMensajeDO docMensajeDO) {
		
		DocMensajeTO docMensajeTO = new DocMensajeTO();

		if (docMensajeDO.getId()!=null) {
			
			docMensajeTO.setId(docMensajeDO.getId());
		}
		
		docMensajeTO.setDescripcion(docMensajeDO.getDescripcion());
		
		docMensajeTO.setDocumento(docMensajeDO.getDocumento());
		
		docMensajeTO.setFechaRegistro(docMensajeDO.getFechaRegistro());
		
		docMensajeTO.setNombre(docMensajeDO.getNombre());
		
		docMensajeTO.setVersion(docMensajeDO.getVersion());
		
		return docMensajeTO;
	}

}
