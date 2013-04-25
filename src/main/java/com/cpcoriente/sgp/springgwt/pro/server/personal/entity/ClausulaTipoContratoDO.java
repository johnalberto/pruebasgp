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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.EntidadDO;

/**
 * @author CPC-04
 *
 */

@Entity
@Table(name = "clausulatipocontrato")


@NamedQueries({
	@NamedQuery(name = "clausulaTipoContratoDO.seleccionPorEntidad", query = "select ctc from ClausulaTipoContratoDO ctc where ctc.entidad = :idEntidad")
})

public class ClausulaTipoContratoDO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4670679124606856203L;

	/**
	 * 
	 */
	
	public ClausulaTipoContratoDO() {
		super();
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "clausTipoCont_id", nullable = false, unique = true)
	private Long id;
	
	@Version 
	@Column(name="clausTipoCont_version")
	private int version;
	
	
	@Column(name = "clausTipoCont_tipo", nullable = false, unique  = false)
	private int tipo;
	
	@Column(name = "clausTipoCont_parrafo", nullable = false, unique = false)
	private String parrafo;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "proyEnt_entidad_id", referencedColumnName = "entidad_id", nullable = false, insertable = true, updatable = true)
	private EntidadDO entidad;
	

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
	 * @return the tipo
	 */
	public int getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;
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
	 * @return the entidad
	 */
	public EntidadDO getEntidad() {
		return entidad;
	}

	/**
	 * @param entidad the entidad to set
	 */
	public void setEntidad(EntidadDO entidad) {
		this.entidad = entidad;
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
		result = prime * result + tipo;
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
		ClausulaTipoContratoDO other = (ClausulaTipoContratoDO) obj;
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
		if (tipo != other.tipo)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClausulaTipoContratoDO [id=" + id + ", tipo=" + tipo
				+ ", parrafo=" + parrafo + "]";
	}
	
	
	
}
