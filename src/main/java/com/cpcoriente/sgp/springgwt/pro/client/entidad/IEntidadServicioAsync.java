/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.client.entidad;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.ActividadEconomicaTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.ConvocatoriaTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DocTerminoConvocatoriaTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EmpresaTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.FotoEntidadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.TerminoConvocatoriaTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.VersionTerminoConvocatoriaTO;
import com.google.gwt.user.client.rpc.AsyncCallback;


/**
 * @author CPC-04
 *
 */
public interface IEntidadServicioAsync {

	void crearActividadEconomica(ActividadEconomicaTO actEconomica,
			AsyncCallback<Long> callback);

	void crearConvocatoria(ConvocatoriaTO convocatoria,
			AsyncCallback<Long> callback);

	void crearDivision(DivisionTO division, AsyncCallback<Long> callback);

	void crearDocTerminoConvocatoria(DocTerminoConvocatoriaTO documento,
			AsyncCallback<Long> callback);

	void crearEmpresa(EmpresaTO empresa, AsyncCallback<Long> callback);

	void crearEntidad(EntidadTO entidad, AsyncCallback<Long> callback);

	void crearFotoEntidad(FotoEntidadTO foto, AsyncCallback<Long> callback);

	void crearTerminoConvocatoria(TerminoConvocatoriaTO termino,
			AsyncCallback<Long> callback);

	void crearVersionTermino(VersionTerminoConvocatoriaTO versionTermino,
			AsyncCallback<Long> callback);

	void modificarActividadEconomica(ActividadEconomicaTO actEconomica,
			AsyncCallback<Boolean> callback);

	void modificarConvocatoria(ConvocatoriaTO convocatoria,
			AsyncCallback<Boolean> callback);

	void modificarDivision(DivisionTO division, AsyncCallback<Boolean> callback);

	void modificarDocTerminoConvocatoria(DocTerminoConvocatoriaTO documento,
			AsyncCallback<Boolean> callback);

	void modificarEmpresa(EmpresaTO empresa, AsyncCallback<Boolean> callback);

	void modificarEntidad(EntidadTO entidad, AsyncCallback<Boolean> callback);

	void modificarFotoEntidad(FotoEntidadTO foto,
			AsyncCallback<Boolean> callback);

	void modificarTerminoConvocatoria(TerminoConvocatoriaTO termino,
			AsyncCallback<Boolean> callback);

	void modificarVersionTerminoConvocatoria(
			VersionTerminoConvocatoriaTO version,
			AsyncCallback<Boolean> callback);

	void eliminarActividadEconomica(Long idActEconomica,
			AsyncCallback<Boolean> callback);

	void eliminarConvocatoria(Long idConvocatoria,
			AsyncCallback<Boolean> callback);

	void eliminarDivision(Long idDivision, AsyncCallback<Boolean> callback);

	void eliminarDocTerminoConvocatoria(Long idDocTermino,
			AsyncCallback<Boolean> callback);

	void eliminarEmpresa(Long idEmpresa, AsyncCallback<Boolean> callback);

	void eliminarEntidad(Long idEntidad, AsyncCallback<Boolean> callback);

	void eliminarFotoEntidad(Long idFotoEntidad, AsyncCallback<Boolean> callback);

	void eliminarTerminoConvocatoria(Long idTermino,
			AsyncCallback<Boolean> callback);

	void eliminarVersionTerminoConvocatoria(Long idVersionTermino,
			AsyncCallback<Boolean> callback);

	void cargarActividadEconomica(Long idActividad,
			AsyncCallback<ActividadEconomicaTO> callback);

	void cargarConvocatoria(Long idConvocatoria,
			AsyncCallback<ConvocatoriaTO> callback);

	void cargarDivision(Long idDivision, AsyncCallback<DivisionTO> callback);

	void cargarDocTermino(Long idDocTermino,
			AsyncCallback<DocTerminoConvocatoriaTO> callback);

	void cargarEmpresa(Long idEmpresa, AsyncCallback<EmpresaTO> callback);

	void cargarEntidad(Long idEntidad, AsyncCallback<EntidadTO> callback);

	void cargarFotoEntidad(Long idFotoEntidad,
			AsyncCallback<FotoEntidadTO> callback);

	void cargarTerminoConvocatoria(Long idTermino,
			AsyncCallback<TerminoConvocatoriaTO> callback);

	void cargarVersionTermino(Long idVersionConvocatoria,
			AsyncCallback<VersionTerminoConvocatoriaTO> callback);

	void listarConvocatoriaPorDivision(Long idDivision,
			AsyncCallback<List<ConvocatoriaTO>> callback);

	void listarDivisionPorEntidad(Long idEntidad,
			AsyncCallback<List<DivisionTO>> callback);

	void listarDivisionPorNombre(String parteNombre,
			AsyncCallback<List<DivisionTO>> callback);

	void listarDocTerminoPorTermino(Long idTermino,
			AsyncCallback<List<DocTerminoConvocatoriaTO>> callback);

	void listarEntidadPorCiudad(Long idCiudad,
			AsyncCallback<List<EntidadTO>> callback);

	void listarEntidadPorNombre(String parteNombre,
			AsyncCallback<List<EntidadTO>> callback);

	void listarEntidadPorNumDoc(String numDoc,
			AsyncCallback<List<EntidadTO>> callback);

	void listarEntidadPorTipoDocPorNumDoc(Integer tipoDoc, String numDoc,
			AsyncCallback<List<EntidadTO>> callback);

	void listarEntidadPorUsuario(String username,
			AsyncCallback<List<EntidadTO>> callback);

	void listarFotoEntidadPorEntidad(Long idEntidad,
			AsyncCallback<List<FotoEntidadTO>> callback);

	void listarTodoActividadEconomica(
			AsyncCallback<List<ActividadEconomicaTO>> callback);

	void listarTodoConvocatoria(AsyncCallback<List<ConvocatoriaTO>> callback);

	void listarTodoDivision(AsyncCallback<List<DivisionTO>> callback);

	void listarTodoEmpresa(AsyncCallback<List<EmpresaTO>> callback);

	void listarTodoEntidad(AsyncCallback<List<EntidadTO>> callback);

	void listarTodoTermino(AsyncCallback<List<TerminoConvocatoriaTO>> callback);

	void listarTodoTerminoPorNombre(String parteNombre,
			AsyncCallback<List<TerminoConvocatoriaTO>> callback);

	

}
