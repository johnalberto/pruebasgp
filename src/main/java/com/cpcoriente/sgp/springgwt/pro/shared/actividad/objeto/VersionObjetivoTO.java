package com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto;

import java.io.Serializable;
import java.util.Date;

import com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador.EstadoObjetivoEnum;

public class VersionObjetivoTO implements Comparable<VersionObjetivoTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 530644345120521849L;

	public int compareTo(VersionObjetivoTO o) {
		
		return getId().compareTo(o.getId());

	}

	
	private Long id;
	
	private ObjetivoTO objetivo;
	
	private Date fechaRegistro;
	
	private String observacion;
	
	private String codigo;
	
	private String nombre;
	
	private String descripcion;
	
	private EstadoObjetivoEnum estado;

	private float porcentajePeso;
	
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VersionObjetivoTO [id=" + id + ", fechaRegistro="
				+ fechaRegistro + ", observacion=" + observacion + ", codigo="
				+ codigo + ", nombre=" + nombre + ", descripcion="
				+ descripcion + ", estado=" + estado + ", porcentajePeso="
				+ porcentajePeso + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((observacion == null) ? 0 : observacion.hashCode());
		
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VersionObjetivoTO other = (VersionObjetivoTO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (estado != other.estado)
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

	public ObjetivoTO getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(ObjetivoTO objetivo) {
		this.objetivo = objetivo;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public EstadoObjetivoEnum getEstado() {
		return estado;
	}

	public void setEstado(EstadoObjetivoEnum estado) {
		this.estado = estado;
	}

	/**
	 * @return the porcentajePeso
	 */
	public float getPorcentajePeso() {
		return porcentajePeso;
	}

	/**
	 * @param porcentajePeso the porcentajePeso to set
	 */
	public void setPorcentajePeso(float porcentajePeso) {
		this.porcentajePeso = porcentajePeso;
	}

		
	
}
