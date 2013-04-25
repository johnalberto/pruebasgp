/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.PucPorProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IImpuestoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IPucPorProyectoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IPucTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.PucPorProyectoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IProyectoTransf;
/**
 * @author CPC-04
 *
 */
public class PucPorProyectoTransf implements IPucPorProyectoTransf{

	private IImpuestoTransf getImpuestoTrans() {
		return TransfFactory.getInstance().getImpuestoTransf();
	}
	
	private IPucTransf getPucTrans() {
		return TransfFactory.getInstance().getPucTransf();
	}
	
	private IProyectoTransf getProyectoTransf() {
		return TransfFactory.getInstance().getProyectoTransf();
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IPucPorProyectoTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.PucPorProyectoTO)
	 */
	public PucPorProyectoDO transferirTODO(PucPorProyectoTO pucPorProyectoTO) {

		PucPorProyectoDO pucPorProyectoDO = new PucPorProyectoDO();
		
		if (pucPorProyectoTO.getId() != null) {
			pucPorProyectoDO.setId(pucPorProyectoTO.getId());
		}
		
		if (pucPorProyectoTO.getCuentaPuc() != null) {
			pucPorProyectoDO.setCuentaPuc(getPucTrans().transferirTODO(pucPorProyectoTO.getCuentaPuc()));
		}
		
		if (pucPorProyectoTO.getImpuesto() != null) {
			pucPorProyectoDO.setImpuesto(getImpuestoTrans().transferirTODO(pucPorProyectoTO.getImpuesto()));
		}
		
		if (pucPorProyectoTO.getProyecto() != null) {
			pucPorProyectoDO.setProyecto(getProyectoTransf().transferirTODO(pucPorProyectoTO.getProyecto()));
		}
		
		return pucPorProyectoDO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IPucPorProyectoTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.PucPorProyectoDO)
	 */
	public PucPorProyectoTO transferirDOTO(PucPorProyectoDO pucPorProyectoDO) {


		PucPorProyectoTO pucPorProyectoTO = new PucPorProyectoTO();
		
		
		pucPorProyectoTO.setId(pucPorProyectoTO.getId());
		
		if (pucPorProyectoDO.getCuentaPuc() != null) {
			pucPorProyectoTO.setCuentaPuc(getPucTrans().transferirDOTO(pucPorProyectoDO.getCuentaPuc()));
		}
		
		if (pucPorProyectoDO.getImpuesto() != null) {
			pucPorProyectoTO.setImpuesto(getImpuestoTrans().transferirDOTO(pucPorProyectoDO.getImpuesto()));
		}
		
		if (pucPorProyectoDO.getProyecto() != null) {
			pucPorProyectoTO.setProyecto(getProyectoTransf().transferirDOTO(pucPorProyectoDO.getProyecto()));
		}
		
		return pucPorProyectoTO;
	}

}
