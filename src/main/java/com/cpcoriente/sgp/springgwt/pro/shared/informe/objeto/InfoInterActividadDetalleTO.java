package com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto;

import java.io.Serializable;
import java.util.Date;

import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ActividadTO;

public class InfoInterActividadDetalleTO implements Comparable<InfoInterActividadDetalleTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int compareTo(InfoInterActividadDetalleTO o) {
		
		return getId().compareTo(o.getId());

	}

	
	private Long id;
	
	private ActividadTO actividad;
	
	private InformeInterventorTO infInterventor;
	
	private String comentario;
	
	private float calificacion;
	
	private Date fechaRegistro;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ActividadTO getActividad() {
		return actividad;
	}

	public void setActividad(ActividadTO actividad) {
		this.actividad = actividad;
	}

	public InformeInterventorTO getInfInterventor() {
		return infInterventor;
	}

	public void setInfInterventor(InformeInterventorTO infInterventor) {
		this.infInterventor = infInterventor;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public float getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	@Override
	public String toString() {
		return "InformeInterventorActividadTO [id=" + id + ", actividad="
				+ actividad + ", infInterventor=" + infInterventor
				+ ", comentario=" + comentario + ", fechaRegistro="
				+ fechaRegistro + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((actividad == null) ? 0 : actividad.hashCode());
		result = prime * result
				+ ((comentario == null) ? 0 : comentario.hashCode());
		result = prime * result
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((infInterventor == null) ? 0 : infInterventor.hashCode());
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
		InfoInterActividadDetalleTO other = (InfoInterActividadDetalleTO) obj;
		if (actividad == null) {
			if (other.actividad != null)
				return false;
		} else if (!actividad.equals(other.actividad))
			return false;
		if (comentario == null) {
			if (other.comentario != null)
				return false;
		} else if (!comentario.equals(other.comentario))
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
		if (infInterventor == null) {
			if (other.infInterventor != null)
				return false;
		} else if (!infInterventor.equals(other.infInterventor))
			return false;
		return true;
	}
	
	
}
