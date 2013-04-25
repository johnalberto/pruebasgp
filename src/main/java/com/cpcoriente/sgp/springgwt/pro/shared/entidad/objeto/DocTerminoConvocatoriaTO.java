package com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto;

import java.io.Serializable;

public class DocTerminoConvocatoriaTO implements Comparable<DocTerminoConvocatoriaTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5770611963299272571L;

	public int compareTo(DocTerminoConvocatoriaTO o) {
		
		return getId().compareTo(o.getId());

	}
	
	private Long id;
	
	private int version;
	
	private String descripcion;
	
	private String nombre;
	
	private Long idTermino;
	
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getIdTermino() {
		return idTermino;
	}

	public void setIdTermino(Long idTermino) {
		this.idTermino = idTermino;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	@Override
	public String toString() {
		return "DocTerminoConvocatoriaTO [id=" + id + ", version=" + version
				+ ", descripcion=" + descripcion + ", nombre=" + nombre
				+ ", idTermino=" + idTermino + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((idTermino == null) ? 0 : idTermino.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		DocTerminoConvocatoriaTO other = (DocTerminoConvocatoriaTO) obj;
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
		if (idTermino == null) {
			if (other.idTermino != null)
				return false;
		} else if (!idTermino.equals(other.idTermino))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (version != other.version)
			return false;
		return true;
	}

	

}
