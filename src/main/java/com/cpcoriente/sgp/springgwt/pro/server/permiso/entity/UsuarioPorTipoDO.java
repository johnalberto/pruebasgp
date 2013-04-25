package com.cpcoriente.sgp.springgwt.pro.server.permiso.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="usuarioportipo", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"usuarioPorTipo_usuproyentidad_id", "usuarioPorTipo_tipoUsuario"})})
public class UsuarioPorTipoDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2363561221115560434L;

	
	public UsuarioPorTipoDO() {
		super();
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "usuarioportipo_id", nullable = false, unique = true)
	private Long id;
	
	
	@Column(name = "usuarioportipo_tipoUsuario", nullable = false, unique = true)
	private Integer tipoUsuario;
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "usuarioportipo_usuario_id", referencedColumnName = "usuario_id", nullable = false)
	private UsuarioDO usuario;


	@Override
	public String toString() {
		return "UsuarioPorTipoDO [id=" + id + ", tipoUsuario=" + tipoUsuario
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
		UsuarioPorTipoDO other = (UsuarioPorTipoDO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tipoUsuario == null) {
			if (other.tipoUsuario != null)
				return false;
		} else if (!tipoUsuario.equals(other.tipoUsuario))
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


	public Integer getTipoUsuario() {
		return tipoUsuario;
	}


	public void setTipoUsuario(Integer tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}


	public UsuarioDO getUsuario() {
		return usuario;
	}


	public void setUsuario(UsuarioDO usuario) {
		this.usuario = usuario;
	}
	
	
	
	
}
