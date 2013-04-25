package com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto;

import java.io.Serializable;
import java.util.Date;

import com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador.EstadoProductoEnum;

public class VersionActividadTO implements Comparable<VersionActividadTO>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -518732293648150564L;

	public int compareTo(VersionActividadTO obj) {
		
		return getId().compareTo(obj.getId());
	}

	private Long id;
	
	private ActividadTO actividad;
	
	private Date fechaRegistro;
	
	private String observacion;
	
	private String codigo;
	
	private String nombre;
	
	private Date fechaInicio;
	
	private Date fechaFinal;
	
	private float porcentajePeso;
	
	private EstadoProductoEnum estado;
	
	
	
	
	@Override
	public String toString() {
		return "VersionActividadTO [id=" + id + ", actividad=" + actividad
				+ ", fechaRegistro=" + fechaRegistro + ", observacion="
				+ observacion + ", codigo=" + codigo + ", nombre=" + nombre
				+ ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal
				+ ", estado=" + estado + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((actividad == null) ? 0 : actividad.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result
				+ ((fechaFinal == null) ? 0 : fechaFinal.hashCode());
		result = prime * result
				+ ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
		result = prime * result
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((observacion == null) ? 0 : observacion.hashCode());
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
		VersionActividadTO other = (VersionActividadTO) obj;
		if (actividad == null) {
			if (other.actividad != null)
				return false;
		} else if (!actividad.equals(other.actividad))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (estado != other.estado)
			return false;
		if (fechaFinal == null) {
			if (other.fechaFinal != null)
				return false;
		} else if (!fechaFinal.equals(other.fechaFinal))
			return false;
		if (fechaInicio == null) {
			if (other.fechaInicio != null)
				return false;
		} else if (!fechaInicio.equals(other.fechaInicio))
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
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (observacion == null) {
			if (other.observacion != null)
				return false;
		} else if (!observacion.equals(other.observacion))
			return false;
		return true;
	}

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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public float getPorcentajePeso() {
		return porcentajePeso;
	}

	public void setPorcentajePeso(float porcentajePeso) {
		this.porcentajePeso = porcentajePeso;
	}

	public EstadoProductoEnum getEstado() {
		return estado;
	}

	public void setEstado(EstadoProductoEnum estado) {
		this.estado = estado;
	}
	
	
	
	
	
	
}
