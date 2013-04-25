/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto;

import java.io.Serializable;

/**
 * @author CPC-04
 *
 */
public class ClausulaContratoTO implements Comparable<ClausulaContratoTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1118326914055005089L;

	public int compareTo(ClausulaContratoTO obj) {
		
		return  getId().compareTo(obj.getId());
	}
	
	
	private Long id;
	
	private int version;
	
	private String parrafo;

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
	 * @return the version
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(int version) {
		this.version = version;
	}

	/**
	 * @return the parrafo
	 */
	public String getParrafo() {
		return parrafo;
	}

	/**
	 * @param parrafo the parrafo to set
	 */
	public void setParrafo(String parrafo) {
		this.parrafo = parrafo;
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
		result = prime * result + ((parrafo == null) ? 0 : parrafo.hashCode());
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
		ClausulaContratoTO other = (ClausulaContratoTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (parrafo == null) {
			if (other.parrafo != null)
				return false;
		} else if (!parrafo.equals(other.parrafo))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClausulaContratoTO [id=" + id + ", parrafo=" + parrafo + "]";
	}
	
	
	

}
