/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.actividad.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionObjetivoDO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IObjetivoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador.EstadoObjetivoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IVersionObjetivoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.VersionObjetivoTO;

/**
 * @author CPC-04
 *
 */
public class VersionObjetivoTransf implements IVersionObjetivoTransf{

	private IObjetivoDAO getObjetivoDAO() {
		return DAOFactory.getInstance().getObjetivoDao();
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IVersionObjetivoTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.VersionObjetivoTO)
	 */
	public VersionObjetivoDO transferirTODO(VersionObjetivoTO versionObjetivoTO) {
		
		VersionObjetivoDO versionObjetivoDO = new VersionObjetivoDO();
		
		
		if (versionObjetivoTO.getId() != null) {
			versionObjetivoDO.setId(versionObjetivoTO.getId());
		}
		
		versionObjetivoDO.setCodigo(versionObjetivoTO.getCodigo());
		versionObjetivoDO.setDescripcion(versionObjetivoTO.getDescripcion());
		versionObjetivoDO.setEstado(versionObjetivoTO.getEstado().getValor());
		versionObjetivoDO.setFechaRegistro(versionObjetivoTO.getFechaRegistro());
		versionObjetivoDO.setNombre(versionObjetivoTO.getNombre());
		versionObjetivoDO.setPorcenPeso(versionObjetivoTO.getPorcentajePeso());
		versionObjetivoDO.setObservacion(versionObjetivoTO.getObservacion());
		
		
		if (versionObjetivoTO.getObjetivo() != null) {
			versionObjetivoDO.setObjetivo(getObjetivoDAO().cargar(versionObjetivoTO.getObjetivo().getId()));
		}
		
		
		return versionObjetivoDO;
	}

	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IVersionObjetivoTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.VersionObjetivoDO)
	 */
	public VersionObjetivoTO transferirDOTO(VersionObjetivoDO versionObjetivoDO) {

		
		VersionObjetivoTO versionObjetivoTO = new VersionObjetivoTO();
		
		
		versionObjetivoTO.setId(versionObjetivoDO.getId());
	
		
		versionObjetivoTO.setCodigo(versionObjetivoDO.getCodigo());
		versionObjetivoTO.setDescripcion(versionObjetivoDO.getDescripcion());
		versionObjetivoTO.setEstado(EstadoObjetivoEnum.tomarTipoPorValor(versionObjetivoDO.getEstado()));
		versionObjetivoTO.setFechaRegistro(versionObjetivoDO.getFechaRegistro());
		versionObjetivoTO.setNombre(versionObjetivoDO.getNombre());
		versionObjetivoTO.setPorcentajePeso(versionObjetivoDO.getPorcenPeso());
		versionObjetivoTO.setObservacion(versionObjetivoDO.getObservacion());
		
		
		return versionObjetivoTO;
	}

}
