/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.client.localidad;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * @author CPC-04
 *
 */
public interface ILocalidadServicioAsync {

	/**
	 * 
	 * @see com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio#buscarCiudadPorNombre(java.lang.Long, java.lang.String)
	 */
	void buscarCiudadPorNombre(Long idDpto, String parteNombre,
			AsyncCallback<List<CiudadTO>> callback);

	/**
	 * 
	 * @see com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio#buscarDptoPorNombre(java.lang.Long, java.lang.String)
	 */
	void buscarDptoPorNombre(Long idPais, String parteNombre,
			AsyncCallback<List<DepartamentoTO>> callback);

	/**
	 * 
	 * @see com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio#buscarPaisPorNombre(java.lang.String)
	 */
	void buscarPaisPorNombre(String parteNombre,
			AsyncCallback<List<PaisTO>> callback);

	/**
	 * 
	 * @see com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio#cargarCiudad(java.lang.Long)
	 */
	void cargarCiudad(Long ciudadId, AsyncCallback<CiudadTO> callback);

	/**
	 * 
	 * @see com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio#cargarDpto(java.lang.Long)
	 */
	void cargarDpto(Long dptoId, AsyncCallback<DepartamentoTO> callback);

	/**
	 * 
	 * @see com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio#cargarPais(java.lang.Long)
	 */
	void cargarPais(Long paisId, AsyncCallback<PaisTO> callback);

	/**
	 * 
	 * @see com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio#crearCiudad(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO)
	 */
	void crearCiudad(CiudadTO ciudad, AsyncCallback<Long> callback);

	/**
	 * 
	 * @see com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio#crearDpto(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO)
	 */
	void crearDpto(DepartamentoTO dpto, AsyncCallback<Long> callback);

	/**
	 * 
	 * @see com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio#crearPais(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO)
	 */
	void crearPais(PaisTO pais, AsyncCallback<Long> callback);

	/**
	 * 
	 * @see com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio#eliminarCiudad(java.lang.Long)
	 */
	void eliminarCiudad(Long idCiudadActual, AsyncCallback<Boolean> callback);

	/**
	 * 
	 * @see com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio#eliminarDpto(java.lang.Long)
	 */
	void eliminarDpto(Long idDptoActual, AsyncCallback<Boolean> callback);

	/**
	 * 
	 * @see com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio#eliminarPais(java.lang.Long)
	 */
	void eliminarPais(Long idPaisActual, AsyncCallback<Boolean> callback);

	/**
	 * 
	 * @see com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio#importarCiudadesDB(java.lang.String)
	 */
	void importarCiudadesDB(String rutaArchivo, AsyncCallback<Boolean> callback);

	/**
	 * 
	 * @see com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio#importarDptosDB(java.lang.String)
	 */
	void importarDptosDB(String rutaArchivo, AsyncCallback<Boolean> callback);

	/**
	 * 
	 * @see com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio#importarPaisesDB(java.lang.String)
	 */
	void importarPaisesDB(String rutaArchivo, AsyncCallback<Boolean> callback);

	/**
	 * 
	 * @see com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio#listarCiudadPorDpto(java.lang.Long)
	 */
	void listarCiudadPorDpto(Long idDpto, AsyncCallback<List<CiudadTO>> callback);

	/**
	 * 
	 * @see com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio#listarDptoPorPais(java.lang.Long)
	 */
	void listarDptoPorPais(Long idPais,
			AsyncCallback<List<DepartamentoTO>> callback);

	/**
	 * 
	 * @see com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio#listarTodosCiudad()
	 */
	void listarTodosCiudad(AsyncCallback<List<CiudadTO>> callback);

	/**
	 * 
	 * @see com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio#listarTodosDpto()
	 */
	void listarTodosDpto(AsyncCallback<List<DepartamentoTO>> callback);

	/**
	 * 
	 * @see com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio#listarTodosPais()
	 */
	void listarTodosPais(AsyncCallback<List<PaisTO>> callback);

	/**
	 * 
	 * @see com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio#modificarCiudad(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO)
	 */
	void modificarCiudad(CiudadTO ciudad, AsyncCallback<Boolean> callback);

	/**
	 * 
	 * @see com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio#modificarDpto(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO)
	 */
	void modificarDpto(DepartamentoTO dpto, AsyncCallback<Boolean> callback);

	/**
	 * 
	 * @see com.cpcoriente.sgp.springgwt.pro.client.localidad.ILocalidadServicio#modificarPais(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO)
	 */
	void modificarPais(PaisTO pais, AsyncCallback<Boolean> callback);

}
