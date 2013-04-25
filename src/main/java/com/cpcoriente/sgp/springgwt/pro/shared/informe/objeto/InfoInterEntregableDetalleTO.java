/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto;

import java.io.Serializable;
import java.util.Date;

import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.EntregableTO;

/**
 * @author CPC-04
 *
 */
public class InfoInterEntregableDetalleTO implements Comparable<InfoInterEntregableDetalleTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7568001957044191031L;

	public int compareTo(InfoInterEntregableDetalleTO o) {
		
		return getId().compareTo(o.getId());
	}
	
	
    private Long id;
	
	private String comentarioEntregable;
	
	private float califEntregable;
	
	private Date fechaRegistro;

	private EntregableTO entregable;
	
	private InformeInterventorTO infoInter;

	
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
	 * @return the comentarioEntregable
	 */
	public String getComentarioEntregable() {
		return comentarioEntregable;
	}

	/**
	 * @param comentarioEntregable the comentarioEntregable to set
	 */
	public void setComentarioEntregable(String comentarioEntregable) {
		this.comentarioEntregable = comentarioEntregable;
	}

	/**
	 * @return the califEntregable
	 */
	public float getCalifEntregable() {
		return califEntregable;
	}

	/**
	 * @param califEntregable the califEntregable to set
	 */
	public void setCalifEntregable(float califEntregable) {
		this.califEntregable = califEntregable;
	}

	/**
	 * @return the fechaRegistro
	 */
	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	/**
	 * @param fechaRegistro the fechaRegistro to set
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	/**
	 * @return the entregable
	 */
	public EntregableTO getEntregable() {
		return entregable;
	}

	/**
	 * @param entregable the entregable to set
	 */
	public void setEntregable(EntregableTO entregable) {
		this.entregable = entregable;
	}

	/**
	 * @return the infoInter
	 */
	public InformeInterventorTO getInfoInter() {
		return infoInter;
	}

	/**
	 * @param infoInter the infoInter to set
	 */
	public void setInfoInter(InformeInterventorTO infoInter) {
		this.infoInter = infoInter;
	}

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(califEntregable);
		result = prime
				* result
				+ ((comentarioEntregable == null) ? 0 : comentarioEntregable
						.hashCode());
		result = prime * result
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
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
		InfoInterEntregableDetalleTO other = (InfoInterEntregableDetalleTO) obj;
		if (Float.floatToIntBits(califEntregable) != Float
				.floatToIntBits(other.califEntregable))
			return false;
		if (comentarioEntregable == null) {
			if (other.comentarioEntregable != null)
				return false;
		} else if (!comentarioEntregable.equals(other.comentarioEntregable))
			return false;
		if (fechaRegistro == null) {
			if (other.fechaRegistro != null)
				return false;
		} else if (!fechaRegistro.equals(other.fechaRegistro))
			return false;
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
		return "InfoInterEntregableDetalleTO [id=" + id
				+ ", comentarioEntregable=" + comentarioEntregable
				+ ", califEntregable=" + califEntregable + ", fechaRegistro="
				+ fechaRegistro + "]";
	}
	


}
