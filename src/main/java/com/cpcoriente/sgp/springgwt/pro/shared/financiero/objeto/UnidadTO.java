package com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto;

import java.io.Serializable;

import com.cpcoriente.sgp.springgwt.pro.shared.financiero.enumerador.TipoUnidadEnum;

public class  UnidadTO implements Comparable<UnidadTO>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4143205294938107588L;

	
	
	private Long id;
	
	private String nombre;
	
	private String abreviatura;
	
	private TipoUnidadEnum tipoUnidad;

	
	public int compareTo(UnidadTO o) {
		
		return getId().compareTo(o.getId());

	}

	
	
	@Override
	public String toString() {
		return "UnidadTO [id=" + id + ", nombre=" + nombre + ", abreviatura="
				+ abreviatura + ", tipoUnidad=" + tipoUnidad + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((abreviatura == null) ? 0 : abreviatura.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((tipoUnidad == null) ? 0 : tipoUnidad.hashCode());
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
		UnidadTO other = (UnidadTO) obj;
		if (abreviatura == null) {
			if (other.abreviatura != null)
				return false;
		} else if (!abreviatura.equals(other.abreviatura))
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
		if (tipoUnidad != other.tipoUnidad)
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public TipoUnidadEnum getTipoUnidad() {
		return tipoUnidad;
	}

	public void setTipoUnidad(TipoUnidadEnum tipoUnidad) {
		this.tipoUnidad = tipoUnidad;
	}
	
	
	
}
