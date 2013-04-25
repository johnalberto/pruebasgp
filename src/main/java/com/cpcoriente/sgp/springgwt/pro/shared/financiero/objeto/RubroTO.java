package com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto;

import java.io.Serializable;

import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO;

public class RubroTO implements Comparable<RubroTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3731932226608182288L;

	

	private Long id;
	
	private String codigo;
	
	private String nombre;
	
	private EntidadTO entidad;
	
	private int version;

	
	public int compareTo(RubroTO o) {
		return getId().compareTo(o.getId());

	}
	
	
	
	@Override
	public String toString() {
		return "RubroTO [id=" + id + ", codigo=" + codigo + ", nombre="
				+ nombre + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		RubroTO other = (RubroTO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
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


	public int getVersion() {
		return version;
	}



	public void setVersion(int version) {
		this.version = version;
	}



	public EntidadTO getEntidad() {
		return entidad;
	}



	public void setEntidad(EntidadTO entidad) {
		this.entidad = entidad;
	}

	
	
}
