package com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto;

import java.io.Serializable;
import java.util.Date;

import com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador.EstadoProductoEnum;

public class VersionProductoTO implements Comparable<VersionProductoTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1015612295884509430L;

	
	private Long id;
	
	private ProductoTO producto;
	
	private Date fechaRegistro;
	
	private String observacion;
	
	private String codigo;
	
	private String  nombre;
	
	private Date fechaInicio;
	
	private Date fechaFin;
	
	private EstadoProductoEnum estado;
	
	private float porcentajePeso;
	
	

	
	public int compareTo(VersionProductoTO o) {
	
		return getId().compareTo(o.getId());

	}

	

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VersionProductoTO [id=" + id + ", fechaRegistro="
				+ fechaRegistro + ", observacion=" + observacion + ", codigo="
				+ codigo + ", nombre=" + nombre + ", fechaInicio="
				+ fechaInicio + ", fechaFin=" + fechaFin + ", estado=" + estado
				+ ", porcentajePeso=" + porcentajePeso + "]";
	}





	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result
				+ ((fechaFin == null) ? 0 : fechaFin.hashCode());
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
		VersionProductoTO other = (VersionProductoTO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (estado != other.estado)
			return false;
		if (fechaFin == null) {
			if (other.fechaFin != null)
				return false;
		} else if (!fechaFin.equals(other.fechaFin))
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





	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public ProductoTO getProducto() {
		return producto;
	}




	public void setProducto(ProductoTO producto) {
		this.producto = producto;
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




	public Date getFechaFin() {
		return fechaFin;
	}




	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}




	public EstadoProductoEnum getEstado() {
		return estado;
	}




	public void setEstado(EstadoProductoEnum estado) {
		this.estado = estado;
	}




	
}
