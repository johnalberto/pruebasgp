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
@Table(name="usuarioentidadportipo", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"usuarioPorTipo_usuproyentidad_id", "usuarioPorTipo_tipoUsuario"})})
public class UsuarioEntidadTipoDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3656256935391304352L;

	public UsuarioEntidadTipoDO(){
		
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "usuario_id", nullable = false, unique = true)
	private Long id;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "usuarioPorTipo_usuproyentidad_id", referencedColumnName = "usuproyentidad_id", nullable = false)
	private UsuarioProyectoEntidadDO usuProEnt;
	
	@Column(name = "usuarioPorTipo_tipoUsuario", nullable = false)
	private Integer tipoUsuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UsuarioProyectoEntidadDO getUsuProEnt() {
		return usuProEnt;
	}

	public void setUsuProEnt(UsuarioProyectoEntidadDO usuProEnt) {
		this.usuProEnt = usuProEnt;
	}

	public Integer getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(Integer tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
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
		UsuarioEntidadTipoDO other = (UsuarioEntidadTipoDO) obj;
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
		if (usuProEnt == null) {
			if (other.usuProEnt != null)
				return false;
		} else if (!usuProEnt.equals(other.usuProEnt))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UsuarioEntidadTipoDO [id=" + id + ", usuProEnt=" + usuProEnt
				+ ", tipoUsuario=" + tipoUsuario + "]";
	}
	
	
	
	
	
}
