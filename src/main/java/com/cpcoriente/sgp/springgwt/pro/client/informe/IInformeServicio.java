package com.cpcoriente.sgp.springgwt.pro.client.informe;

import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.DocInformeTO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InfoInterEntregableDetalleTO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InfoInterProductoDetalleTO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InformeDetalleTO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InformeTO;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


@RemoteServiceRelativePath("informe")
public interface IInformeServicio extends RemoteService {
	
	public abstract DocInformeTO cargarDocInforme(Long idDocInforme) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract List<DocInformeTO> crearDocInforme(List<DocInformeTO> docInformeList) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarDocInforme(DocInformeTO docInforme) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarDocInforme(List<Long> idDocInformeLista) throws PrecondicionExcepcion, ValidacionExcepcion;
	public abstract List<DocInformeTO> seleccionDocInformePorInforme(Long idInforme) throws PrecondicionExcepcion, ValidacionExcepcion;
	
	
	public abstract InformeDetalleTO cargarInformeDetalle(Long idInformeDetalle) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract List<InformeDetalleTO> crearInformeDetalle(List<InformeDetalleTO> informeDetalleList) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarInformeDetalle(InformeDetalleTO informeDetalle) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarInformeDetalle(Long idInformeDetalle) throws PrecondicionExcepcion, ValidacionExcepcion;
	
	
	public abstract InformeTO cargarInforme(Long idInforme) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearInforme(InformeTO informe) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarInforme(InformeTO informe) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarInforne(Long idInforme) throws PrecondicionExcepcion, ValidacionExcepcion;
	public abstract List<InformeTO> listarSeleccionGeneralInforme(Long idPersona, Long idActividad, Date fechaRegIni, 
			Date fechaRegFin, Boolean vobo, String codigo) throws PrecondicionExcepcion, ValidacionExcepcion;
	
	
	public abstract InfoInterEntregableDetalleTO cargarInfoInterEntregableDetalle(Long idInfoInterEntregableDetalle) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearInfoInterEntregableDetalle(InfoInterEntregableDetalleTO infoInterEntregableDetalle) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarInfoInterEntregableDetalle(InfoInterEntregableDetalleTO infoInterEntregableDetalle) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarInfoInterEntregableDetalle(Long idInfoInterEntregableDetalle) throws PrecondicionExcepcion, ValidacionExcepcion;
	
	public abstract InfoInterProductoDetalleTO cargarInfoInterProductoDetalle(Long idInfoInterProductoDetalle) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract Long crearInfoInterProductoDetalle(InfoInterProductoDetalleTO infoInterProductoDetalle) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean modificarInfoInterProductoDetalle(InfoInterProductoDetalleTO infoInterProductoDetalle) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;
	public abstract boolean eliminarInfoInterProductoDetalle(Long idInfoInterProductoDetalle) throws PrecondicionExcepcion, ValidacionExcepcion;


}
