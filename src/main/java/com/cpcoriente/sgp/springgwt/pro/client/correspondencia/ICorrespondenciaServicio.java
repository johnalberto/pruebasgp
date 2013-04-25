package com.cpcoriente.sgp.springgwt.pro.client.correspondencia;

import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.objeto.MensajeTO;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


@RemoteServiceRelativePath("correspondencia")
public interface ICorrespondenciaServicio extends RemoteService {
	
	public abstract Long crearMensaje(MensajeTO mensaje) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;

	public abstract boolean modificarMensaje(MensajeTO mensaje) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion;

	public abstract boolean eliminarMensaje(Long idMensaje) throws ValidacionExcepcion, PrecondicionExcepcion;

	public abstract MensajeTO cargarMensaje(Long idMensaje) throws ValidacionExcepcion, PrecondicionExcepcion;

	public abstract List<MensajeTO> listarTodoProyecto(Long idProyecto ) throws ValidacionExcepcion, PrecondicionExcepcion;

	public abstract List<MensajeTO> listarMensajesPorUsuario(Long idUsuario ) throws ValidacionExcepcion, PrecondicionExcepcion;

	public abstract List<MensajeTO> listarMensajesPorUsuarioPorProyecto(Long idUsuario,Long idProyecto ) throws ValidacionExcepcion, PrecondicionExcepcion;

	public abstract List<MensajeTO> listarMensajesPorDestino(Long idUsuario ) throws ValidacionExcepcion, PrecondicionExcepcion;

	public abstract List<MensajeTO> listarMensajesPorDestinoPorProyecto(Long idUsuario,Long idProyecto ) throws ValidacionExcepcion, PrecondicionExcepcion;

}
