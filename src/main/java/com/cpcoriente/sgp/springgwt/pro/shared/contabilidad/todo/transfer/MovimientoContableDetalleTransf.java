/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.MovimientoContableDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.interfaces.dao.IMovimientoContableDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.enumerador.TipoMovimientoContableEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IMovimientoContableDetalleTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IPucPorProyectoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.MovimientoContableDetalleTO;

/**
 * @author CPC-04
 *
 */
public class MovimientoContableDetalleTransf implements IMovimientoContableDetalleTransf{
	
	
	private IPucPorProyectoTransf getPucPorProyectoTransf() {
		return TransfFactory.getInstance().getPucPorProyectoTransf();
	}

	private IMovimientoContableDAO getMovimientoContableDAO() {
		return DAOFactory.getInstance().getMovimientoContableDao();
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IMovimientoContableDetalleTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.MovimientoContableDetalleTO)
	 */
	public MovimientoContableDetalleDO transferirTODO(MovimientoContableDetalleTO movimientoContableDetalleTO) {
		
		MovimientoContableDetalleDO movimientoContableDetalleDO = new MovimientoContableDetalleDO();

		if (movimientoContableDetalleTO.getId() != null) {
			movimientoContableDetalleDO.setId(movimientoContableDetalleTO.getId());
		}

		movimientoContableDetalleDO.setTipo(movimientoContableDetalleTO.getTipo().getValor());
		movimientoContableDetalleDO.setValor(movimientoContableDetalleTO.getValor());


		if (movimientoContableDetalleTO.getPucProy() != null) {
			movimientoContableDetalleDO.setPucProy(getPucPorProyectoTransf().transferirTODO(movimientoContableDetalleTO.getPucProy()));
		}
		
		
		if (movimientoContableDetalleTO.getMovCont() != null) {
			movimientoContableDetalleDO.setMovCont(getMovimientoContableDAO().cargar(movimientoContableDetalleTO.getMovCont().getId()));
		}
		

		return movimientoContableDetalleDO;
		
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IMovimientoContableDetalleTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.MovimientoContableDetalleDO)
	 */
	public MovimientoContableDetalleTO transferirDOTO(MovimientoContableDetalleDO movimientoContableDetalleDO) {
		
		MovimientoContableDetalleTO movimientoContableDetalleTO = new MovimientoContableDetalleTO();	

		movimientoContableDetalleTO.setId(movimientoContableDetalleDO.getId());

		movimientoContableDetalleTO.setTipo(TipoMovimientoContableEnum.tomarTipoPorValor(movimientoContableDetalleDO.getTipo()));
		movimientoContableDetalleTO.setValor(movimientoContableDetalleDO.getValor());


		if (movimientoContableDetalleTO.getPucProy() != null) {
			movimientoContableDetalleTO.setPucProy(getPucPorProyectoTransf().transferirDOTO(movimientoContableDetalleDO.getPucProy()));
		}


		return movimientoContableDetalleTO;
	}



}
