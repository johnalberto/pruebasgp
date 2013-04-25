/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.informe.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ProductoDO;

/**
 * @author CPC-04
 *
 */


@Entity
@Table(name="infointerproductodetalle", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"infIntProDet_infoInter_id", "infIntProDet_producto_id", "infIntProDet_fechaReg"})})


public class InfoInterProductoDetalleDO  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7705289496590400095L;
	
	
	public InfoInterProductoDetalleDO() {
		super();
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "infIntProDet_id", nullable =  false)
	private Long id;
	
	@Column(name = "infIntProDet_comentario", nullable = false)
	private String comentarioProducto;
	
	
	@Column(name = "infIntProDet_calif", nullable = false)
	private float califProducto;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "infIntProDet_fechaReg", nullable = false)
	private Date fechaRegistro;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "infIntProDet_producto_id", referencedColumnName = "producto_id", nullable = false)
	private ProductoDO producto;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "infIntProDet_infoInter_id", referencedColumnName = "infoInter_id", nullable = false)
	private InformeInterventorDO infoInter;


	
	
	
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
	public ProductoDO getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(ProductoDO producto) {
		this.producto = producto;
	}

	/**
	 * @return the infoInter
	 */
	public InformeInterventorDO getInfoInter() {
		return infoInter;
	}

	/**
	 * @param infoInter the infoInter to set
	 */
	public void setInfoInter(InformeInterventorDO infoInter) {
		this.infoInter = infoInter;
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
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
		InfoInterProductoDetalleDO other = (InfoInterProductoDetalleDO) obj;
		
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
		return "InfoInterProductoDetalleDO [id=" + id + ", comentarioProducto="
				+ comentarioProducto + ", califProducto=" + califProducto
				+ ", fechaRegistro=" + fechaRegistro + "]";
	}
	
	
	

}
