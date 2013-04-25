package com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto;

import java.io.Serializable;

import com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum;

public class UsuarioEntidadTipoTO implements Comparable<UsuarioEntidadTipoTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7045259464488585800L;

	public int compareTo(UsuarioEntidadTipoTO o) {
	
		return getId().compareTo(o.getId());
	
	}
	
	
	private Long id;
	
	private UsuarioProyectoEntidadTO usuProEnt;
	
	private TipoUsuarioEnum tipoUsuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UsuarioProyectoEntidadTO getUsuProEnt() {
		return usuProEnt;
	}

	public void setUsuProEnt(UsuarioProyectoEntidadTO usuProEnt) {
		this.usuProEnt = usuProEnt;
	}

	public TipoUsuarioEnum getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuarioEnum tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}	

	
	@Override
	public String toString() {
		return "UsuarioEntidadTipoTO [id=" + id + ", usuProEnt=" + usuProEnt
				+ ", tipoUsuario=" + tipoUsuario + "]";
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((tipoUsuario == null) ? 0 : tipoUsuario.hashCode());
		result = prime * result
				+ ((usuProEnt == null) ? 0 : usuProEnt.hashCode());
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
		UsuarioEntidadTipoTO other = (UsuarioEntidadTipoTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tipoUsuario != other.tipoUsuario)
			return false;
		if (usuProEnt == null) {
			if (other.usuProEnt != null)
				return false;
		} else if (!usuProEnt.equals(other.usuProEnt))
			return false;
		return true;
	}
	
	

}
