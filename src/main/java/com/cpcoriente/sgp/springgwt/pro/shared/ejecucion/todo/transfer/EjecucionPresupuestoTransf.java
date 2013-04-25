/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.ejecucion.entity.EjecucionPresupuestoDO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IMovimientoContableTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.enumerador.TipoComprobanteEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.interfaces.transfer.IEjecucionPresupuestoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.objeto.EjecucionPresupuestoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IRecursoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IUnidadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IProyectoEntidadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.tercero.interfaces.transfer.ITerceroTransf;

/**
 * @author CPC-04
 *
 */
public class EjecucionPresupuestoTransf  implements IEjecucionPresupuestoTransf{

	private IProyectoEntidadTransf getProyectoEntidadTrans() {
		return TransfFactory.getInstance().getProyectoEntidadTransf();
	}

	private IRecursoTransf getRecursoTransf() {
		return TransfFactory.getInstance().getRecursoTransf();
	}

	private IUnidadTransf getUnidadTransf() {
		return TransfFactory.getInstance().getUnidadTransf();
	}

	private ITerceroTransf getTerceroTransf() {
		return TransfFactory.getInstance().getTerceroTransf();
	}

	private IMovimientoContableTransf getMovimientoContableTransf() {
		return TransfFactory.getInstance().getMovimientoContableTransf();
	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.interfaces.transfer.IEjecucionPresupuestoTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.objeto.EjecucionPresupuestoTO)
	 */
	public EjecucionPresupuestoDO transferirTODO(EjecucionPresupuestoTO ejecucionPresupuestoTO) {

		EjecucionPresupuestoDO ejecucionPresupuestoDO = new EjecucionPresupuestoDO();


		if (ejecucionPresupuestoTO.getId() != null) {
			ejecucionPresupuestoDO.setId(ejecucionPresupuestoTO.getId());
		}

		ejecucionPresupuestoDO.setAprobado(ejecucionPresupuestoTO.isAprobado());
		ejecucionPresupuestoDO.setEjecutado(ejecucionPresupuestoTO.isEjecutado());
		ejecucionPresupuestoDO.setCantidad(ejecucionPresupuestoTO.getCantidad());
		ejecucionPresupuestoDO.setFechaEjecucion(ejecucionPresupuestoTO.getFechaEjecucion());
		ejecucionPresupuestoDO.setFechaRegistro(ejecucionPresupuestoTO.getFechaRegistro());
		ejecucionPresupuestoDO.setNumComprobante(ejecucionPresupuestoTO.getNumeroComprobante());
		ejecucionPresupuestoDO.setObservaciones(ejecucionPresupuestoTO.getObservaciones());
		ejecucionPresupuestoDO.setTipoComprobante(ejecucionPresupuestoTO.getTipoComprobante().getValor());
		ejecucionPresupuestoDO.setValorRetencionImpuesto(ejecucionPresupuestoTO.getValorRetencionImpuesto());
		ejecucionPresupuestoDO.setValorUnitario(ejecucionPresupuestoTO.getValorUnitario());
		ejecucionPresupuestoDO.setVersion(ejecucionPresupuestoTO.getVersion());

		if (ejecucionPresupuestoTO.getProyectoPorEntidad() != null) {
			ejecucionPresupuestoDO.setProyectoEntidad(getProyectoEntidadTrans().transferirTODO(ejecucionPresupuestoTO.getProyectoPorEntidad()));
		}

		if (ejecucionPresupuestoTO.getRecurso() != null) {
			ejecucionPresupuestoDO.setRecurso(getRecursoTransf().transferirTODO(ejecucionPresupuestoTO.getRecurso()));
		}

		if (ejecucionPresupuestoTO.getProyectoPorEntidad() != null) {
			ejecucionPresupuestoDO.setTercero(getTerceroTransf().transferirTODO(ejecucionPresupuestoTO.getTercero()));
		}

		if (ejecucionPresupuestoTO.getProyectoPorEntidad() != null) {
			ejecucionPresupuestoDO.setUnidad(getUnidadTransf().transferirTODO(ejecucionPresupuestoTO.getUnidad()));
		}

		if(ejecucionPresupuestoTO.getMovimientoContable() != null ) {
			ejecucionPresupuestoDO.setMovimientoContable(getMovimientoContableTransf().transferirTODO(ejecucionPresupuestoTO.getMovimientoContable()));
		}



		return ejecucionPresupuestoDO;
	}


	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.interfaces.transfer.IEjecucionPresupuestoTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.ejecucion.entity.EjecucionPresupuestoDO)
	 */
	public EjecucionPresupuestoTO transferirDOTO(EjecucionPresupuestoDO ejecucionPresupuestoDO) {

		EjecucionPresupuestoTO ejecucionPresupuestoTO = new EjecucionPresupuestoTO();


		ejecucionPresupuestoTO.setId(ejecucionPresupuestoDO.getId());

		ejecucionPresupuestoTO.setAprobado(ejecucionPresupuestoDO.isAprobado());
		ejecucionPresupuestoTO.setEjecutado(ejecucionPresupuestoDO.isEjecutado());
		ejecucionPresupuestoTO.setCantidad(ejecucionPresupuestoDO.getCantidad());
		ejecucionPresupuestoTO.setFechaEjecucion(ejecucionPresupuestoDO.getFechaEjecucion());
		ejecucionPresupuestoTO.setFechaRegistro(ejecucionPresupuestoDO.getFechaRegistro());
		ejecucionPresupuestoTO.setNumeroComprobante(ejecucionPresupuestoDO.getNumComprobante());
		ejecucionPresupuestoTO.setObservaciones(ejecucionPresupuestoDO.getObservaciones());
		ejecucionPresupuestoTO.setTipoComprobante(TipoComprobanteEnum.tomarTipoPorValor(ejecucionPresupuestoDO.getTipoComprobante()));
		ejecucionPresupuestoTO.setValorRetencionImpuesto(ejecucionPresupuestoDO.getValorRetencionImpuesto());
		ejecucionPresupuestoTO.setValorUnitario(ejecucionPresupuestoDO.getValorUnitario());
		ejecucionPresupuestoTO.setVersion(ejecucionPresupuestoDO.getVersion());

		if (ejecucionPresupuestoTO.getProyectoPorEntidad() != null) {
			ejecucionPresupuestoTO.setProyectoPorEntidad(getProyectoEntidadTrans().transferirDOTO(ejecucionPresupuestoDO.getProyectoEntidad()));
		}

		if (ejecucionPresupuestoTO.getRecurso() != null) {
			ejecucionPresupuestoTO.setRecurso(getRecursoTransf().transferirDOTO(ejecucionPresupuestoDO.getRecurso()));
		}

		if (ejecucionPresupuestoTO.getProyectoPorEntidad() != null) {
			ejecucionPresupuestoTO.setTercero(getTerceroTransf().transferirDOTO(ejecucionPresupuestoDO.getTercero()));
		}

		if (ejecucionPresupuestoTO.getProyectoPorEntidad() != null) {
			ejecucionPresupuestoTO.setUnidad(getUnidadTransf().transferirDOTO(ejecucionPresupuestoDO.getUnidad()));
		}

		if (ejecucionPresupuestoDO.getMovimientoContable() != null) {
			ejecucionPresupuestoTO.setMovimientoContable(getMovimientoContableTransf().transferirDOTO(ejecucionPresupuestoDO.getMovimientoContable()));
		}

		return ejecucionPresupuestoTO;
	}

}
