package com.cpcoriente.sgp.springgwt.pro.client.parametro;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.parametro.objeto.ParametroGeneralTO;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("parametro")
public interface IParametroServicio extends RemoteService {
	
	
	public abstract ParametroGeneralTO cargarParametro(String parametroId) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarParametro(ParametroGeneralTO parametro) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarParametro(String idParamatro) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<ParametroGeneralTO> listarTodosParametro() throws PrecondicionExcepcion;
	public abstract List<ParametroGeneralTO> buscarParametrosPorDescripcion( String descripcion) throws PrecondicionExcepcion, ValidacionExcepcion;


}
