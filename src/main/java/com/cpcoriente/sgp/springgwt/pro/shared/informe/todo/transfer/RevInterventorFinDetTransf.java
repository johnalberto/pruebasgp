package com.cpcoriente.sgp.springgwt.pro.shared.informe.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IRecursoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.RevInterventorFinDetDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IRevInterventorFinDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IRecursoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IRevInterventorFinDetTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.RevInterventorFinDetTO;

public class RevInterventorFinDetTransf implements IRevInterventorFinDetTransf {

	
	private IRecursoTransf getRecursoTransfer() {
		return TransfFactory.getInstance().getRecursoTransf();
	}
	
	private IRecursoDAO getRecursoDAO() {
		return DAOFactory.getInstance().getRecursoDao();
	}
	
	
	private IRevInterventorFinDAO getRevisionDAO() {
		return DAOFactory.getInstance().getRevIntFinDao();
	}
	
	public RevInterventorFinDetDO transferirTODO(
			RevInterventorFinDetTO revisionTO) {
		
		RevInterventorFinDetDO revisionDO =
				new RevInterventorFinDetDO();
		
		if (revisionTO.getId()!=null) {
			
			revisionDO.setId(revisionTO.getId());
		}
		
		revisionDO.setRecurso(getRecursoDAO().cargar(revisionTO.getRecurso().getId()));
		
		revisionDO.setRecursoCali(revisionTO.getCalificacionRecurso());
		
		revisionDO.setRecursoComentario(revisionTO.getComentarioRecurso());
		
		revisionDO.setRevIntFin(getRevisionDAO().cargar(revisionTO.getRevInterventorFin().getId()));
		
		
		return revisionDO;
	}

	public RevInterventorFinDetTO transferirDOTO(
			RevInterventorFinDetDO revisionDO) {
		
		
		RevInterventorFinDetTO revisionTO = new RevInterventorFinDetTO();
		
		if (revisionDO.getId()!=null) {
			
			revisionTO.setId(revisionDO.getId());
		}
		
		revisionTO.setCalificacionRecurso(revisionDO.getRecursoCali());
		
		revisionTO.setComentarioRecurso(revisionDO.getRecursoComentario());
		
		revisionTO.setRecurso(getRecursoTransfer().transferirDOTO(revisionDO.getRecurso()));
		
		return revisionTO;
	}

}
