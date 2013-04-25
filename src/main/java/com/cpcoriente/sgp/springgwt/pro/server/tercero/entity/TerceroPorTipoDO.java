/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.tercero.entity;

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
import javax.persistence.UniqueConstraint;

/**
 * @author CPC-04
 *
 */

@Entity
@Table(name = "terceroportipo", uniqueConstraints = {
		 @UniqueConstraint( columnNames = {"terceroPorTipo_tercero_id","terceroPorTipo_tipoTercero"})
})
public class TerceroPorTipoDO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3103649611574107962L;


	public TerceroPorTipoDO() {
		super();
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "terceroPorTipo_id", nullable = false, unique = true)
	private Long id;
	
	@Column(name = "terceroPorTipo_tipoTercero", nullable = false)
	private int tipoTercero;
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "terceroPorTipo_tercero_id", referencedColumnName = "tercero_id", nullable = false)
	private TerceroDO tercero;


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
	 * @return the tipoTercero
	 */
	public int getTipoTercero() {
		return tipoTercero;
	}


	/**
	 * @param tipoTercero the tipoTercero to set
	 */
	public void setTipoTercero(int tipoTercero) {
		this.tipoTercero = tipoTercero;
	}


	/**
	 * @return the tercero
	 */
	public TerceroDO getTercero() {
		return tercero;
	}


	/**
	 * @param tercero the tercero to set
	 */
	public void setTercero(TerceroDO tercero) {
		this.tercero = tercero;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + tipoTercero;
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
		TerceroPorTipoDO other = (TerceroPorTipoDO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tipoTercero != other.tipoTercero)
			return false;
		return true;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TerceroPorTipoDO [id=" + id + ", tipoTercero=" + tipoTercero
				+ "]";
	}
	
	
}
