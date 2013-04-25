package com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.EmpresaDO;

public interface IEmpresaDAO {
	
	public abstract EmpresaDO cargar(Long idEmpresa);
	public abstract EmpresaDO persistir(EmpresaDO empresa) ;
	public abstract EmpresaDO modificar(EmpresaDO empresa) ;
	public abstract boolean eliminar(Long idEmpresa);
	public abstract List<EmpresaDO> listarTodo();

}
