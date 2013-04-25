package com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InformeInterventorFinDO;

public interface IInformeInterventorFinDAO {

	
	public abstract InformeInterventorFinDO cargar(Long idInforme);
	public abstract InformeInterventorFinDO persistir(InformeInterventorFinDO informe) ;
	public abstract InformeInterventorFinDO modificar(InformeInterventorFinDO informe) ;
	public abstract boolean eliminar(Long idInforme);
	
}
