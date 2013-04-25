/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.todo.transfer;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.MovimientoContableDO;
import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.MovimientoContableDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.server.ejecucion.interfaces.dao.IEjecucionPresupuestoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IRecursoDetalleDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IMovimientoContableDetalleTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IMovimientoContableTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.MovimientoContableDetalleTO;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.MovimientoContableTO;

/**
 * @author CPC-04
 *
 */
public class MovimientoContableTransf  implements IMovimientoContableTransf{


	private static final Logger log = Logger.getLogger(MovimientoContableTransf.class.getName());

	private IEjecucionPresupuestoDAO getEjecucionPresupuestoDAO() {
		return DAOFactory.getInstance().getEjecucionPresupuestoDao();
	}

	private IRecursoDetalleDAO getRecursoDetalleDAO() {
		return DAOFactory.getInstance().getRecursoDetalleDao();
	}

	private IMovimientoContableDetalleTransf getMovimientoContableDetalleTransf() {
		return TransfFactory.getInstance().getMovimientoContableDetalleTransf();
	}



	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IMovimientoContableTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.MovimientoContableTO)
	 */
	public MovimientoContableDO transferirTODO(MovimientoContableTO movimientoContableTO) {

		MovimientoContableDO movimientoContableDO = new MovimientoContableDO();

		if (movimientoContableTO.getId() != null) {
			movimientoContableDO.setId(movimientoContableTO.getId());
		}

		movimientoContableDO.setFechaMov(movimientoContableTO.getFechaMov());
		movimientoContableDO.setFechaReg(movimientoContableTO.getFechaReg());


		if (movimientoContableTO.getEjecPres() != null) {
			movimientoContableDO.setEjecPres(getEjecucionPresupuestoDAO().cargar(movimientoContableTO.getEjecPres().getId()));
		}

		if (movimientoContableTO.getRecDet() != null) {
			movimientoContableDO.setRecDet(getRecursoDetalleDAO().cargar(movimientoContableTO.getRecDet().getId()));
		}

		
		if(movimientoContableTO.getMovContDetalleLista() != null && movimientoContableTO.getMovContDetalleLista().size() > 0) {
			MovimientoContableDetalleDO movContDetCargado = null;
			Set<MovimientoContableDetalleDO> movContDetDOSet = new LinkedHashSet<MovimientoContableDetalleDO>();
			for(MovimientoContableDetalleTO movContDet : movimientoContableTO.getMovContDetalleLista()) {
				movContDetCargado = getMovimientoContableDetalleTransf().transferirTODO(movContDet);
                 if (movContDetCargado != null) {
                	 movContDetCargado.setMovCont(movimientoContableDO);
                	 movContDetDOSet.add(movContDetCargado);
                 } else {
                     log.warning("esta tratando de cargar un detalle de Movimiento Contable inexistente con id: " + movContDet.getId());
                 }
			}
			if (movContDetDOSet.size() > 0) {
				movimientoContableDO.setMovContDetalleSet(movContDetDOSet);
			}
		}
		


		return movimientoContableDO;
	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IMovimientoContableTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.MovimientoContableDO)
	 */
	public MovimientoContableTO transferirDOTO(MovimientoContableDO movimientoContableDO) {


		MovimientoContableTO movimientoContableTO = new MovimientoContableTO();	

		movimientoContableTO.setId(movimientoContableDO.getId());

		movimientoContableTO.setFechaMov(movimientoContableDO.getFechaMov());
		movimientoContableTO.setFechaReg(movimientoContableDO.getFechaReg());
		
		if(movimientoContableDO.getMovContDetalleSet() != null && movimientoContableDO.getMovContDetalleSet().size() > 0) {
			MovimientoContableDetalleTO movContDetCargado = null;
			List<MovimientoContableDetalleTO> movContDetTOList = new ArrayList<MovimientoContableDetalleTO>(movimientoContableDO.getMovContDetalleSet().size());
			
			for(MovimientoContableDetalleDO movConDet : movimientoContableDO.getMovContDetalleSet()) {
				movContDetCargado = getMovimientoContableDetalleTransf().transferirDOTO(movConDet);
				movContDetTOList.add(movContDetCargado);                 
			}
			if (movContDetTOList.size() > 0) {
				movimientoContableTO.setMovContDetalleLista(movContDetTOList);
			}
		}


		return movimientoContableTO;
	}

}
