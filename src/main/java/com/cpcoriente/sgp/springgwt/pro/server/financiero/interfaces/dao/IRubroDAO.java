package com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RubroDO;

public interface IRubroDAO {

	public abstract RubroDO cargar(Long idRubro);
	public abstract RubroDO persistir(RubroDO rubro) ;
	public abstract RubroDO modificar(RubroDO rubro) ;
	public abstract boolean eliminar(Long idRubro);
	public abstract List<RubroDO> listarTodo();
	public abstract List<RubroDO> ListarPorEntidad(Long idEmpresa);

}
