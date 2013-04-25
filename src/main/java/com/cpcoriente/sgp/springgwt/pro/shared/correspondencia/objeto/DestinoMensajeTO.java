package com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.objeto;

import java.io.Serializable;

import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioProyectoEntidadTO;

public class DestinoMensajeTO  implements Comparable<DestinoMensajeTO>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int compareTo(DestinoMensajeTO o) {
		
		return getId().compareTo(o.getId());

	}
	private Long id;
	
	private UsuarioProyectoEntidadTO usuario;
	
	private MensajeTO mensaje;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UsuarioProyectoEntidadTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioProyectoEntidadTO usuario) {
		this.usuario = usuario;
	}

	public MensajeTO getMensaje() {
		return mensaje;
	}

	public void setMensaje(MensajeTO mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "DestinoMensajeTO [id=" + id + ", usuario=" + usuario
				+ ", mensaje=" + mensaje + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mensaje == null) ? 0 : mensaje.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DestinoMensajeTO other = (DestinoMensajeTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mensaje == null) {
			if (other.mensaje != null)
				return false;
		} else if (!mensaje.equals(other.mensaje))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}
	
	

}
