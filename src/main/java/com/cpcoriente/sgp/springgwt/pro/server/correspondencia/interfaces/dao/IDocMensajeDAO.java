package com.cpcoriente.sgp.springgwt.pro.server.correspondencia.interfaces.dao;

import java.util.List;
import java.util.Set;

import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.entity.DocMensajeDO;

public interface IDocMensajeDAO {

	public abstract DocMensajeDO cargar(Long idDocMensaje);
	public abstract DocMensajeDO persistir(DocMensajeDO docMensaje) ;
	public abstract DocMensajeDO modificar(DocMensajeDO docMensaje) ;
	public abstract boolean eliminar(Long idDocMensaje);
	public abstract List<DocMensajeDO> seleccionPorMensaje(Long idDocMensaje);
	
	public abstract boolean persistirList(Set<DocMensajeDO> docList);

}
