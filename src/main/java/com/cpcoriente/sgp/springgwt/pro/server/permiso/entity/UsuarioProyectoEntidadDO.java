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

import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ProyectoEntidadDO;


@Entity
@Table(name="usuarioproyporentidad", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"usuproyentidad_usuario_id", "usuproyentidad_proyEnt_id"})})

public class UsuarioProyectoEntidadDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5166961810638710532L;

	public UsuarioProyectoEntidadDO(){
		
		super();
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "usuproyentidad_id", nullable = false, unique = true)
	private Long id;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "usuproyentidad_proyEnt_id", referencedColumnName = "proyEnt_id", nullable = false)
	private ProyectoEntidadDO proyectoEntidad;

	@Column(name = "usuproyentidad_activo", nullable = false, unique = true)
	private boolean activo;
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "usuproyentidad_usuario_id", referencedColumnName = "usuario_id", nullable = false)
	private UsuarioDO usuario;

	
	
	
	
	@Override
	public String toString() {
		return "UsuarioProyectoPorEntidadDO [id=" + id + ", proyectoEntidad="
				+ proyectoEntidad + ", activo=" + activo + ", usuario="
				+ usuario + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (activo ? 1231 : 1237);
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		UsuarioProyectoEntidadDO other = (UsuarioProyectoEntidadDO) obj;
		if (activo != other.activo)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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


	public ProyectoEntidadDO getProyectoEntidad() {
		return proyectoEntidad;
	}


	public void setProyectoEntidad(ProyectoEntidadDO proyectoEntidad) {
		this.proyectoEntidad = proyectoEntidad;
	}


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}


	public UsuarioDO getUsuario() {
		return usuario;
	}


	public void setUsuario(UsuarioDO usuario) {
		this.usuario = usuario;
	}
	
	
	
	
	
}
