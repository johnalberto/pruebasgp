package com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto;

import java.io.Serializable;
import java.util.Date;

import com.cpcoriente.sgp.springgwt.pro.shared.financiero.enumerador.TipoAporteEnum;

public class VersionRecursoDetalleTO implements Comparable<VersionRecursoDetalleTO>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int compareTo(VersionRecursoDetalleTO o) {
		
		return getId().compareTo(o.getId());
	}
	
	private Long id;
	
	private Date fechaRegistro;
	
	private String observacion;
	
	private float valorEfectivo;
	
	private float valorEspecie;
	
	private TipoAporteEnum tipo;
	
	private RecursoDetalleTO recurso;

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

	public float getValorEfectivo() {
		return valorEfectivo;
	}

	public void setValorEfectivo(float valorEfectivo) {
		this.valorEfectivo = valorEfectivo;
	}

	public float getValorEspecie() {
		return valorEspecie;
	}

	public void setValorEspecie(float valorEspecie) {
		this.valorEspecie = valorEspecie;
	}

	public TipoAporteEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoAporteEnum tipo) {
		this.tipo = tipo;
	}

	public RecursoDetalleTO getRecurso() {
		return recurso;
	}

	public void setRecurso(RecursoDetalleTO recurso) {
		this.recurso = recurso;
	}

	@Override
	public String toString() {
		return "VersionRecursoDetalleTO [id=" + id + ", fechaRegistro="
				+ fechaRegistro + ", observacion=" + observacion + ", tipo="
				+ tipo + ", recurso=" + recurso + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((observacion == null) ? 0 : observacion.hashCode());
		result = prime * result + ((recurso == null) ? 0 : recurso.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		VersionRecursoDetalleTO other = (VersionRecursoDetalleTO) obj;
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
		if (tipo != other.tipo)
			return false;
		return true;
	}
	
	

}
