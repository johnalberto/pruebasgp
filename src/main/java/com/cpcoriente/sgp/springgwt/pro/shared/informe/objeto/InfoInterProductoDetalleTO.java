/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto;

import java.io.Serializable;
import java.util.Date;

import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ProductoTO;

/**
 * @author CPC-04
 *
 */
public class InfoInterProductoDetalleTO implements Comparable<InfoInterProductoDetalleTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -291037214900360997L;

	public int compareTo(InfoInterProductoDetalleTO obj) {

		return getId().compareTo(obj.getId());
	}
	
	
	private Long id;
	
	private String comentarioProducto;

	private float califProducto;

	private Date fechaRegistro;
	
	private ProductoTO producto;
	
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
	 * @return the comentarioProducto
	 */
	public String getComentarioProducto() {
		return comentarioProducto;
	}

	/**
	 * @param comentarioProducto the comentarioProducto to set
	 */
	public void setComentarioProducto(String comentarioProducto) {
		this.comentarioProducto = comentarioProducto;
	}

	/**
	 * @return the califProducto
	 */
	public float getCalifProducto() {
		return califProducto;
	}

	/**
	 * @param califProducto the califProducto to set
	 */
	public void setCalifProducto(float califProducto) {
		this.califProducto = califProducto;
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
	 * @return the producto
	 */
	public ProductoTO getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(ProductoTO producto) {
		this.producto = producto;
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
		result = prime * result + Float.floatToIntBits(califProducto);
		result = prime
				* result
				+ ((comentarioProducto == null) ? 0 : comentarioProducto
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
		InfoInterProductoDetalleTO other = (InfoInterProductoDetalleTO) obj;
		if (Float.floatToIntBits(califProducto) != Float
				.floatToIntBits(other.califProducto))
			return false;
		if (comentarioProducto == null) {
			if (other.comentarioProducto != null)
				return false;
		} else if (!comentarioProducto.equals(other.comentarioProducto))
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
		return "InfoInterProductoDetalleTO [id=" + id + ", comentarioProducto="
				+ comentarioProducto + ", califProducto=" + califProducto
				+ ", fechaRegistro=" + fechaRegistro + "]";
	}
	
	
	

}
