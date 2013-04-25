package com.cpcoriente.sgp.springgwt.pro.shared.financiero.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.interfaces.dao.IMovimientoContableDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RecursoDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IRecursoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IProyectoEntidadDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IMovimientoContableTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.enumerador.TipoAporteEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IRecursoDetalleTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IRecursoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RecursoDetalleTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RecursoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IProyectoEntidadTransf;

public class RecursoDetalleTransf implements IRecursoDetalleTransf {

	private IProyectoEntidadTransf getEntProyectoTransfer() {
		return TransfFactory.getInstance().getProyectoEntidadTransf();
	}
	
	private IProyectoEntidadDAO getEntProyectoDAO() {
		return DAOFactory.getInstance().getProyectoEntidadDao();
	}
	
	private IRecursoTransf getRecursoTransfer() {
		return TransfFactory.getInstance().getRecursoTransf();
	}
	
	private IRecursoDAO getRecursoDAO() {
		return DAOFactory.getInstance().getRecursoDao();
	}
	
	private IMovimientoContableTransf getMovimientoTransfer() {
		return TransfFactory.getInstance().getMovimientoContableTransf();
	}
	
	private IMovimientoContableDAO getMovimientoDAO() {
		return DAOFactory.getInstance().getMovimientoContableDao();
	}

	
	public RecursoDetalleDO transferirTODO(RecursoDetalleTO recursoDetTO) {
		
		RecursoDetalleDO recursoDO=new RecursoDetalleDO();
		
		if (recursoDetTO.getId()!=null) {
			
			recursoDO.setId(recursoDetTO.getId());
		}
		
		recursoDO.setProyectoEntidad(getEntProyectoDAO().cargar(recursoDetTO.getEntProyecto().getId()));
		
		recursoDO.setRecurso(getRecursoDAO().cargar(recursoDetTO.getRecurso().getId()));
		
		recursoDO.setTipo(recursoDetTO.getTipoAporte().getValor());
		
		recursoDO.setValorEfectivo(recursoDetTO.getValEfectivo());
		
		recursoDO.setValorespecie(recursoDetTO.getValEspecie());
		
		recursoDO.setMovimiento(getMovimientoTransfer().transferirTODO(recursoDetTO.getMovimiento()));
	
		return recursoDO;
	}

	public RecursoDetalleTO transferirDOTO(RecursoDetalleDO recursoDetDO) {
		
		RecursoDetalleTO recursoTO = new RecursoDetalleTO();
		
		if (recursoDetDO.getId()!=null) {
			
			recursoTO.setId(recursoDetDO.getId());
		}
		
		recursoTO.setEntProyecto(getEntProyectoTransfer().transferirDOTO(recursoDetDO.getProyectoEntidad()));
		
		recursoTO.setRecurso(getRecursoTransfer().transferirDOTO(recursoDetDO.getRecurso()));
		
		recursoTO.setTipoAporte(TipoAporteEnum.tomarTipoPorValor(recursoDetDO.getTipo()));
		
		recursoTO.setValEfectivo(recursoDetDO.getValorEfectivo());
		
		recursoTO.setValEspecie(recursoDetDO.getValorespecie());
		
		recursoTO.setVersion(recursoDetDO.getVersion());
		
		recursoTO.setMovimiento(getMovimientoTransfer().transferirDOTO(recursoDetDO.getMovimiento()));
	
		return recursoTO;
	}

}
