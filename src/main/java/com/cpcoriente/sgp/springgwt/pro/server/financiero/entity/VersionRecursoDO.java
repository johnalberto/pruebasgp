package com.cpcoriente.sgp.springgwt.pro.server.financiero.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="versionrecurso")
public class VersionRecursoDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3398248799358968177L;

	public VersionRecursoDO (){
		
		super();
	}
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "verRecurso_id", nullable = false, unique = true)
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "verRecurso_fechaRegistro", nullable = false)
	private Date fechaRegistro;
	
	@Column(name = "verRecurso_observacion", nullable = false)
	private String observacion;
	
	@Column(name = "verRecurso_descripcion", nullable = false)
	private String descripcion;
	


	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "verRecurso_recurso_id", referencedColumnName = "recurso_id", nullable = false)
	private RecursoDO recurso;

	
	
	@Override
	public String toString() {
		return "VersionRecursoDO [id=" + id + ", fechaRegistro="
				+ fechaRegistro + ", observacion=" + observacion
				+ ", descripcion=" + descripcion + ", recurso=" + recurso + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((observacion == null) ? 0 : observacion.hashCode());
		result = prime * result + ((recurso == null) ? 0 : recurso.hashCode());
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
		VersionRecursoDO other = (VersionRecursoDO) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (fechaRegistro == null) {
			if (other.fechaRegistro != null)
				return false;
		} else if (!fechaRegistro.equals(other.fechaRegistro))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (observacion == null) {
			if (other.observacion != null)
				return false;
		} else if (!observacion.equals(other.observacion))
			return false;
		if (recurso == null) {
			if (other.recurso != null)
				return false;
		} else if (!recurso.equals(other.recurso))
			return false;
		return true;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getFechaRegistro() {
		return fechaRegistro;
	}


	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}


	public String getObservacion() {
		return observacion;
	}


	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public RecursoDO getRecurso() {
		return recurso;
	}


	public void setRecurso(RecursoDO recurso) {
		this.recurso = recurso;
	}
	
	
	
}
