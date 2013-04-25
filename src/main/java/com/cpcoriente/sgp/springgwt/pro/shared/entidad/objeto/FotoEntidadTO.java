package com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto;

import java.io.Serializable;

public class FotoEntidadTO implements Comparable<FotoEntidadTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int compareTo(FotoEntidadTO o) {
		
		return getId().compareTo(o.getId());

	}

	private Long id;
	
	private int version;
	
	private String codigo;
	
	private String descripcion;
	
	private Long idEntidad;
	
	private byte[] foto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	@Override
	public String toString() {
		return "FotoEntidadTO [id=" + id + ", version=" + version + ", codigo="
				+ codigo + ", descripcion=" + descripcion + ", idEntidad="
				+ idEntidad + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((idEntidad == null) ? 0 : idEntidad.hashCode());
		result = prime * result + version;
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
		FotoEntidadTO other = (FotoEntidadTO) obj;
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idEntidad == null) {
			if (other.idEntidad != null)
				return false;
		} else if (!idEntidad.equals(other.idEntidad))
			return false;
		if (version != other.version)
			return false;
		return true;
	}

	public Long getIdEntidad() {
		return idEntidad;
	}

	public void setIdEntidad(Long idEntidad) {
		this.idEntidad = idEntidad;
	}
	
	
	
	
}
