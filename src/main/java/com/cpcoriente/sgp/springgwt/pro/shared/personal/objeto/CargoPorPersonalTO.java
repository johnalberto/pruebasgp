/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto;

import java.io.Serializable;

/**
 * @author CPC-04
 *
 */
public class CargoPorPersonalTO implements Comparable<CargoPorPersonalTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1306653381554686652L;

	
	
	public int compareTo(CargoPorPersonalTO obj) {
		
		return getId().compareTo(obj.getId());
	}
	
	
	private Long id;
	
	private CargoTO cargo;
	
	private PersonalTO persona;
	
	private ContratoTO contrato;




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
	 * @return the cargo
	 */
	public CargoTO getCargo() {
		return cargo;
	}

	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(CargoTO cargo) {
		this.cargo = cargo;
	}

	/**
	 * @return the persona
	 */
	public PersonalTO getPersona() {
		return persona;
	}

	/**
	 * @param persona the persona to set
	 */
	public void setPersona(PersonalTO persona) {
		this.persona = persona;
	}
	
	/**
	 * @return the contrato
	 */
	public ContratoTO getContrato() {
		return contrato;
	}

	/**
	 * @param contrato the contrato to set
	 */
	public void setContrato(ContratoTO contrato) {
		this.contrato = contrato;
	}

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		CargoPorPersonalTO other = (CargoPorPersonalTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CargoPorPersonalTO [id=" + id + "]";
	}
	
	
	

}
