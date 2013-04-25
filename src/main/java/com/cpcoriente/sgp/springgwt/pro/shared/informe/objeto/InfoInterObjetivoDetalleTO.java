package com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto;

import java.io.Serializable;
import java.util.Date;

import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ObjetivoTO;

public class InfoInterObjetivoDetalleTO implements Comparable<InfoInterObjetivoDetalleTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int compareTo(InfoInterObjetivoDetalleTO o) {
	
		return getId().compareTo(o.getId());

	}
	
	private Long id;
	
	private ObjetivoTO objetivo;
	
	private InformeInterventorTO informe;
	
	private String comentario;
	
	private float calificacion;
	
	private Date fechaRegistro;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ObjetivoTO getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(ObjetivoTO objetivo) {
		this.objetivo = objetivo;
	}

	public InformeInterventorTO getInforme() {
		return informe;
	}

	public void setInforme(InformeInterventorTO informe) {
		this.informe = informe;
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
		return "InformeInterventorObjetivoTO [id=" + id + ", objetivo="
				+ objetivo + ", informe=" + informe + ", comentario="
				+ comentario + ", fechaRegistro=" + fechaRegistro + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((comentario == null) ? 0 : comentario.hashCode());
		result = prime * result
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((informe == null) ? 0 : informe.hashCode());
		result = prime * result
				+ ((objetivo == null) ? 0 : objetivo.hashCode());
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
		InfoInterObjetivoDetalleTO other = (InfoInterObjetivoDetalleTO) obj;
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
		if (informe == null) {
			if (other.informe != null)
				return false;
		} else if (!informe.equals(other.informe))
			return false;
		if (objetivo == null) {
			if (other.objetivo != null)
				return false;
		} else if (!objetivo.equals(other.objetivo))
			return false;
		return true;
	}
	
	
	

}
