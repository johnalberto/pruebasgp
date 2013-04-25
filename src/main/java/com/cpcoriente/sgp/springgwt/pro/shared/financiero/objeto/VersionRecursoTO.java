package com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto;

import java.io.Serializable;
import java.util.Date;

public class VersionRecursoTO implements Comparable<VersionRecursoTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4447124897003619778L;

	public int compareTo(VersionRecursoTO o) {
		
		return getId().compareTo(o.getId());

	}

	
	private Long id;
	
	private Date fechaRegistro;
	
	private String Observacion;
	
	private String Descripcion;
	
	
	private RecursoTO recurso;

	
	
	@Override
	public String toString() {
		return "VersionRecursoTO [id=" + id + ", fechaRegistro="
				+ fechaRegistro + ", Observacion=" + Observacion
				+ ", Descripcion=" + Descripcion + ", recurso=" + recurso + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Descripcion == null) ? 0 : Descripcion.hashCode());
		result = prime * result
				+ ((Observacion == null) ? 0 : Observacion.hashCode());
		result = prime * result
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		VersionRecursoTO other = (VersionRecursoTO) obj;
		if (Descripcion == null) {
			if (other.Descripcion != null)
				return false;
		} else if (!Descripcion.equals(other.Descripcion))
			return false;
		if (Observacion == null) {
			if (other.Observacion != null)
				return false;
		} else if (!Observacion.equals(other.Observacion))
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
		return Observacion;
	}

	public void setObservacion(String observacion) {
		Observacion = observacion;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	
	public RecursoTO getRecurso() {
		return recurso;
	}

	public void setRecurso(RecursoTO recurso) {
		this.recurso = recurso;
	}
	
	
	
	
}
