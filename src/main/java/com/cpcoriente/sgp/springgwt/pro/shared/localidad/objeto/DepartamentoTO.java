/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto;

import java.io.Serializable;
import java.util.List;



/**
 * @author CPC-04
 *
 */
public class DepartamentoTO implements Comparable<DepartamentoTO>, Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -1195322210101985638L;

	/**
	 * 
	 */
	

	private Long id;

	private String nombre;
	
	private String codigo;

	private PaisTO pais;
	
	private List<CiudadTO> ciudadList;

	public int compareTo(DepartamentoTO o) {
		return getId().compareTo(o.getId());
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the pais
	 */
	public PaisTO getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(PaisTO pais) {
		this.pais = pais;
	}

	/**
	 * @return the ciudadList
	 */
	public List<CiudadTO> getCiudadList() {
		return ciudadList;
	}

	/**
	 * @param ciudadList the ciudadList to set
	 */
	public void setCiudadList(List<CiudadTO> ciudadList) {
		this.ciudadList = ciudadList;
	}

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((ciudadList == null) ? 0 : ciudadList.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
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
		DepartamentoTO other = (DepartamentoTO) obj;
		if (ciudadList == null) {
			if (other.ciudadList != null)
				return false;
		} else if (!ciudadList.equals(other.ciudadList))
			return false;
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
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DepartamentoTO [id=" + id + ", nombre=" + nombre + ", codigo="
				+ codigo + ", pais=" + pais + ", ciudadList=" + ciudadList
				+ "]";
	}
	
	
	

}
