package com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TerminoConvocatoriaTO implements Comparable<TerminoConvocatoriaTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5279177210281904365L;

	

	private Long id;
	
	private String codigo;
	
	private String nombre;
	
	private String descripcion;
		
	private Date fechaInicio;
	
	private Date fechaFin;

	private ConvocatoriaTO convocatoria;
	
	private List<VersionTerminoConvocatoriaTO> versionTerminoList;
	
	public int compareTo(TerminoConvocatoriaTO o) {
		
		return getId().compareTo(o.getId());

	}
	
	
	
	
	@Override
	public String toString() {
		return "TerminoConvocatoriaTO [id=" + id + ", codigo=" + codigo
				+ ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result
				+ ((fechaFin == null) ? 0 : fechaFin.hashCode());
		result = prime * result
				+ ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		TerminoConvocatoriaTO other = (TerminoConvocatoriaTO) obj;
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
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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


	public List<VersionTerminoConvocatoriaTO> getVersionTerminoList() {
		return versionTerminoList;
	}




	public void setVersionTerminoList(List<VersionTerminoConvocatoriaTO> versionTerminoList) {
		this.versionTerminoList = versionTerminoList;
	}




	public ConvocatoriaTO getConvocatoria() {
		return convocatoria;
	}




	public void setConvocatoria(ConvocatoriaTO convocatoria) {
		this.convocatoria = convocatoria;
	}

	

	
	
	
	
}