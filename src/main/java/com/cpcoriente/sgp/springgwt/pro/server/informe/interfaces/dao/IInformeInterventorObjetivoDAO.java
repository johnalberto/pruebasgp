package com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InfoInterObjetivoDetalleDO;

public interface IInformeInterventorObjetivoDAO {
	
	public abstract InfoInterObjetivoDetalleDO cargar(Long idInforme);
	public abstract InfoInterObjetivoDetalleDO persistir(InfoInterObjetivoDetalleDO informe) ;
	public abstract InfoInterObjetivoDetalleDO modificar(InfoInterObjetivoDetalleDO informe) ;
	public abstract boolean eliminar(Long idInforme);

}
