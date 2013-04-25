package com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InfoInterActividadDetalleDO;

public interface IInformeInterventorActividadDAO {

	
	public abstract InfoInterActividadDetalleDO cargar(Long idInforme);
	public abstract InfoInterActividadDetalleDO persistir(InfoInterActividadDetalleDO informe) ;
	public abstract InfoInterActividadDetalleDO modificar(InfoInterActividadDetalleDO informe) ;
	public abstract boolean eliminar(Long idInforme);
}
