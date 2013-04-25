/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto;

import java.io.Serializable;

import com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.PersonalTO;

/**
 * @author CPC-04
 *
 */
public class ActividadPorPersonalTO implements Comparable<ActividadPorPersonalTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7752337685933292627L;
	
	
    private Long id;
		
	private float porcenAvance;
	
	private ActividadTO actividad;
	
	private PersonalTO persona;
		
	


	
	/**
	 * 
	 * @param o
	 * @return
	 */
    public int compareTo(ActividadPorPersonalTO o) {
		
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
	 * @return the porcenAvance
	 */
	public float getPorcenAvance() {
		return porcenAvance;
	}

	/**
	 * @param porcenAvance the porcenAvance to set
	 */
	public void setPorcenAvance(float porcenAvance) {
		this.porcenAvance = porcenAvance;
	}

	/**
	 * @return the actividad
	 */
	public ActividadTO getActividad() {
		return actividad;
	}

	/**
	 * @param actividad the actividad to set
	 */
	public void setActividad(ActividadTO actividad) {
		this.actividad = actividad;
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
		ActividadPorPersonalTO other = (ActividadPorPersonalTO) obj;
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
		return "ActividadPorPersonalTO [id=" + id 
				+ ", porcenAvance=" + porcenAvance + "]";
	}
	



}
