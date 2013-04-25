/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.client.localidad;


import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * @author CPC-04
 *
 */

@RemoteServiceRelativePath("localidad")
public interface ILocalidadServicio extends RemoteService {
	
	public abstract Long crearPais(PaisTO pais) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearDpto(DepartamentoTO dpto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearCiudad(CiudadTO ciudad) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	
	public abstract boolean modificarPais(PaisTO pais) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarDpto(DepartamentoTO dpto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarCiudad(CiudadTO ciudad) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	
	public abstract boolean eliminarPais(Long idPaisActual) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarDpto(Long idDptoActual) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarCiudad(Long idCiudadActual) throws ValidacionExcepcion, PrecondicionExcepcion;

	public abstract List<PaisTO> listarTodosPais() throws PrecondicionExcepcion;
	public abstract List<DepartamentoTO> listarTodosDpto() throws PrecondicionExcepcion;
	public abstract List<CiudadTO> listarTodosCiudad() throws PrecondicionExcepcion;
	
	public abstract List<PaisTO> buscarPaisPorNombre(String parteNombre) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<DepartamentoTO> buscarDptoPorNombre(Long idPais,String parteNombre) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<CiudadTO> buscarCiudadPorNombre(Long idDpto, String parteNombre) throws ValidacionExcepcion, PrecondicionExcepcion;
	
	
	public abstract List<DepartamentoTO> listarDptoPorPais(Long idPais) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract List<CiudadTO> listarCiudadPorDpto(Long idDpto) throws ValidacionExcepcion, PrecondicionExcepcion;

	
	public abstract PaisTO cargarPais(Long paisId) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract DepartamentoTO cargarDpto(Long dptoId) throws ValidacionExcepcion, PrecondicionExcepcion;
	public abstract CiudadTO cargarCiudad(Long ciudadId) throws ValidacionExcepcion, PrecondicionExcepcion;
	
	public abstract boolean importarPaisesDB(String rutaArchivo);
	public abstract boolean importarDptosDB(String rutaArchivo);
	public abstract boolean importarCiudadesDB(String rutaArchivo);
	 
}
