package com.cpcoriente.sgp.springgwt.pro.shared.proyecto.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.VersionProyectoDO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IProyectoDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.enumerador.EstadoProyectoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IVersionProyectoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.VersionProyectoTO;

public class VersionProyectoTransf implements IVersionProyectoTransf {

	
	private IProyectoDAO getProyectoDAO() {
		return DAOFactory.getInstance().getProyectoDao();
	}

	
	public VersionProyectoDO transferirTODO(VersionProyectoTO versionTO) {
		
		VersionProyectoDO versionDO = new VersionProyectoDO();
		
		if (versionTO.getId()!=null) {
			
			versionDO.setId(versionTO.getId());
		}
		
		versionDO.setCodigo(versionTO.getCodigo());
		
		versionDO.setEstado(versionTO.getEstado().getValor());
		versionDO.setFechaFin(versionTO.getFechaFin());
		versionDO.setFechaInicio(versionTO.getFechaInicio());
		versionDO.setFechaRegistro(versionTO.getFechaRegistro());
		versionDO.setObservacion(versionTO.getObservacion());
		versionDO.setProyecto(getProyectoDAO().cargar(versionTO.getProyecto().getId()));
		versionDO.setTitulo(versionTO.getTitulo());
		versionDO.setObjGeneral(versionTO.getObjetivoGeneral());
		
		
		return versionDO;
	}

	public VersionProyectoTO transferirDOTO(VersionProyectoDO versionDO) {
		
		VersionProyectoTO versionTO = new VersionProyectoTO();
		
		if (versionDO.getId()!=null) {
			
			versionTO.setId(versionDO.getId());
		}
		
		versionTO.setCodigo(versionDO.getCodigo());
		versionTO.setEstado(EstadoProyectoEnum.tomarTipoPorValor(versionDO.getEstado()));
		versionTO.setFechaFin(versionDO.getFechaFin());
		versionTO.setFechaInicio(versionTO.getFechaInicio());
		versionTO.setFechaRegistro(versionDO.getFechaRegistro());
		versionTO.setObservacion(versionTO.getObservacion());
		versionTO.setTitulo(versionDO.getTitulo());
		versionTO.setObjetivoGeneral(versionDO.getObjGeneral());
		
		return versionTO;
	}

}
