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
public class PaisTO implements Comparable<PaisTO>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2138315281529250006L;

	private Long id;
	
	private String codigo;
	
	private String nombre;

	private List<DepartamentoTO> dptoList;
	
	public int compareTo(PaisTO o) {
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
	 * 
	 * @return
	 */
	public String getCodigo() {
		return codigo;
	}

	
	/**
	 * 
	 * @param codigo
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
	 * @return the dptoList
	 */
	public List<DepartamentoTO> getDptoList() {
		return dptoList;
	}

	/**
	 * @param dptoList the dptoList to set
	 */
	public void setDptoList(List<DepartamentoTO> dptoList) {
		this.dptoList = dptoList;
	}

	@Override
	public String toString() {
		return "PaisTO [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre
				+ ", dptoList=" + dptoList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((dptoList == null) ? 0 : dptoList.hashCode());
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
		PaisTO other = (PaisTO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (dptoList == null) {
			if (other.dptoList != null)
				return false;
		} else if (!dptoList.equals(other.dptoList))
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

	


	
	
	
}
