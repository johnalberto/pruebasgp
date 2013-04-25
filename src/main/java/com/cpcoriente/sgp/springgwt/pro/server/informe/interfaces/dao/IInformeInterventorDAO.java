package com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InformeInterventorDO;

public interface IInformeInterventorDAO {
	
	public abstract InformeInterventorDO cargar(Long idInforme);
	public abstract InformeInterventorDO persistir(InformeInterventorDO informe) ;
	public abstract InformeInterventorDO modificar(InformeInterventorDO informe) ;
	public abstract boolean eliminar(Long idInforme);

}
