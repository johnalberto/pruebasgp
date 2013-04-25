package com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao;

import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.RevInterventorFinDetDO;

public interface IRevInterventorFinDetDAO {
	
	public abstract RevInterventorFinDetDO cargar(Long idRevision);
	public abstract RevInterventorFinDetDO persistir(RevInterventorFinDetDO revision) ;
	public abstract RevInterventorFinDetDO modificar(RevInterventorFinDetDO revision) ;
	public abstract boolean eliminar(Long idRevision);

}
