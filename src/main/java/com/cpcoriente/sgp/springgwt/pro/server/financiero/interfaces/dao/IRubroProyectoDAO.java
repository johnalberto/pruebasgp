package com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao;

import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RubroProyectoDO;

public interface IRubroProyectoDAO {
	
	public abstract RubroProyectoDO cargar(Long idRubro);
	public abstract RubroProyectoDO persistir(RubroProyectoDO rubro) ;
	public abstract RubroProyectoDO modificar(RubroProyectoDO rubro) ;
	public abstract boolean eliminar(Long idRubro);

}
