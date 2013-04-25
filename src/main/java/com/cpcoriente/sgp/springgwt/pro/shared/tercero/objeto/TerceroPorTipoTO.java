/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto;

import java.io.Serializable;

import com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoTerceroEnum;

/**
 * @author CPC-04
 *
 */
public class TerceroPorTipoTO implements Comparable<TerceroPorTipoTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8579862063260409526L;

	public int compareTo(TerceroPorTipoTO obj) {
		
		return getId().compareTo(obj.getId());
	}
	
	
	private Long id;
	
	private TipoTerceroEnum tipoTercero;
	
	private TerceroTO tercero;


	
	
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
	public TipoTerceroEnum getTipoTercero() {
		return tipoTercero;
	}

	/**
	 * @param tipoTercero the tipoTercero to set
	 */
	public void setTipoTercero(TipoTerceroEnum tipoTercero) {
		this.tipoTercero = tipoTercero;
	}

	/**
	 * @return the tercero
	 */
	public TerceroTO getTercero() {
		return tercero;
	}

	/**
	 * @param tercero the tercero to set
	 */
	public void setTercero(TerceroTO tercero) {
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
		result = prime * result
				+ ((tipoTercero == null) ? 0 : tipoTercero.hashCode());
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
		TerceroPorTipoTO other = (TerceroPorTipoTO) obj;
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
		return "TerceroPorTipoTO [id=" + id + ", tipoTercero=" + tipoTercero
				+ "]";
	}
	

}
