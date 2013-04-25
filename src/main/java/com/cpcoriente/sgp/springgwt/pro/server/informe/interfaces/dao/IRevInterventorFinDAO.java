package com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.RevInterventorFinDO;

public interface IRevInterventorFinDAO {
	
	public abstract RevInterventorFinDO cargar(Long idRevision);
	public abstract RevInterventorFinDO persistir(RevInterventorFinDO revision) ;
	public abstract RevInterventorFinDO modificar(RevInterventorFinDO revision) ;
	public abstract boolean eliminar(Long idRevision);

}
