package com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto;

import java.io.Serializable;

import com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum;

public class UsuarioPorTipoTO implements Comparable<UsuarioPorTipoTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3382475695876377053L;

	public int compareTo(UsuarioPorTipoTO o) {
		
		return getId().compareTo(o.getId());

	}

	private Long id;

	private TipoUsuarioEnum tipoUsuario;

	private UsuarioTO usuario;

	
	
	
	
	@Override
	public String toString() {
		return "UsuarioPorTipoTO [id=" + id + ", tipoUsuario=" + tipoUsuario
				+ ", usuario=" + usuario + "]";
	}

	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((tipoUsuario == null) ? 0 : tipoUsuario.hashCode());
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
		UsuarioPorTipoTO other = (UsuarioPorTipoTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tipoUsuario != other.tipoUsuario)
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

	public TipoUsuarioEnum getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuarioEnum tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public UsuarioTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioTO usuario) {
		this.usuario = usuario;
	}
	
	
	
	
}
