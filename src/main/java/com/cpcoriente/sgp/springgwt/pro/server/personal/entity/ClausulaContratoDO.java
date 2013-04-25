/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.personal.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * @author CPC-04
 *
 */


@Entity
@Table(name = "clausulatipocontrato")
public class ClausulaContratoDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 518794450551221683L;
	
	
	
	
	public ClausulaContratoDO() {
		super();
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "clausCont_id", nullable = false, unique = true)
	private Long id;
	
	@Version 
	@Column(name="clausCont_version")
	private int version;
	
	@Column(name = "clausCont_parrafo", nullable = false, unique = false)
	private String parrafo;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "clausCont_contrato_id", referencedColumnName = "contrato_id", nullable = false)
	private ContratoDO contrato;




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
	public ContratoDO getContrato() {
		return contrato;
	}

	/**
	 * @param contrato the contrato to set
	 */
	public void setContrato(ContratoDO contrato) {
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
		ClausulaContratoDO other = (ClausulaContratoDO) obj;
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
		return "ClausulaContratoDO [id=" + id + ", parrafo=" + parrafo + "]";
	}
	



}
