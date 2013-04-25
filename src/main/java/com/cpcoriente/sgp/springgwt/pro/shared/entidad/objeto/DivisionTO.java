package com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto;

import java.io.Serializable;

public class DivisionTO implements Comparable<DivisionTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6919371633421773907L;

	public int compareTo(DivisionTO o) {
		
		return getId().compareTo(o.getId());

	}

	
	private Long id;
	
	private EntidadTO entidad;
	
	private DivisionTO padre;
	
	private String codigo;
	
	private String nombre;
	
	

	

	@Override
	public String toString() {
		return "DivisionTO [id=" + id + ", entidad=" + entidad + ", padre="
				+ padre + ", codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((entidad == null) ? 0 : entidad.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((padre == null) ? 0 : padre.hashCode());
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
		DivisionTO other = (DivisionTO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (entidad == null) {
			if (other.entidad != null)
				return false;
		} else if (!entidad.equals(other.entidad))
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
		if (padre == null) {
			if (other.padre != null)
				return false;
		} else if (!padre.equals(other.padre))
			return false;
		return true;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EntidadTO getEntidad() {
		return entidad;
	}

	public void setEntidad(EntidadTO entidad) {
		this.entidad = entidad;
	}

	public DivisionTO getPadre() {
		return padre;
	}

	public void setPadre(DivisionTO padre) {
		this.padre = padre;
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
	
	


	
	
}
