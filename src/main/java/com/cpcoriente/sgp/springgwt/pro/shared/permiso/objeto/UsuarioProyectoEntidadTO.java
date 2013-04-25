package com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto;

import java.io.Serializable;

import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.ProyectoEntidadTO;

public class UsuarioProyectoEntidadTO implements Comparable<UsuarioTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8059448706075915332L;

	public int compareTo(UsuarioTO o) {
		
		return getId().compareTo(o.getId());

	}

	private Long id;
	
	private ProyectoEntidadTO proyectoEntidad;
	
	private boolean activo;
	
	private UsuarioTO usuario;

	
	
	
	
	@Override
	public String toString() {
		return "UsuarioProyectoPorEntidadTO [id=" + id + ", proyectoEntidad="
				+ proyectoEntidad + ", activo=" + activo + ", usuario="
				+ usuario + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (activo ? 1231 : 1237);
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result
				+ ((proyectoEntidad == null) ? 0 : proyectoEntidad.hashCode());
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
		UsuarioProyectoEntidadTO other = (UsuarioProyectoEntidadTO) obj;
		if (activo != other.activo)
			return false;
		if (id != other.id)
			return false;
		if (proyectoEntidad == null) {
			if (other.proyectoEntidad != null)
				return false;
		} else if (!proyectoEntidad.equals(other.proyectoEntidad))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProyectoEntidadTO getProyectoEntidad() {
		return proyectoEntidad;
	}

	public void setProyectoEntidad(ProyectoEntidadTO proyectoEntidad) {
		this.proyectoEntidad = proyectoEntidad;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public UsuarioTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioTO usuario) {
		this.usuario = usuario;
	}
	
	
	
	
}
