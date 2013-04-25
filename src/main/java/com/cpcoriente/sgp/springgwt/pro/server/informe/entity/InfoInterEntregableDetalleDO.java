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

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.EntregableDO;

/**
 * @author CPC-04
 *
 */

@Entity
@Table(name="infointerentregabledetalle", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"infIntEntDet_infoInter_id", "infIntEntDet_entregable_id", "infIntEntDet_fechaReg"})})

public class InfoInterEntregableDetalleDO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2233899186005138036L;

	
	public InfoInterEntregableDetalleDO() {
		super();
	}	
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "infIntEntDet_id", nullable =  false)
	private Long id;
	
	@Column(name = "infIntEntDet_comentario", nullable = false)
	private String comentarioEntregable;
	
	
	@Column(name = "infIntEntDet_calif", nullable = false)
	private float califEntregable;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "infIntEntDet_fechaReg", nullable = false)
	private Date fechaRegistro;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "infIntEntDet_entregable_id", referencedColumnName = "entregable_id", nullable = false)
	private EntregableDO entregable;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "infIntEntDet_infoInter_id", referencedColumnName = "infoInter_id", nullable = false)
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
	public EntregableDO getEntregable() {
		return entregable;
	}

	/**
	 * @param entregable the entregable to set
	 */
	public void setEntregable(EntregableDO entregable) {
		this.entregable = entregable;
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
		InfoInterEntregableDetalleDO other = (InfoInterEntregableDetalleDO) obj;
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
		return "InfoInterEntregableDetalleDO [id=" + id
				+ ", comentarioProducto=" + comentarioEntregable
				+ ", califProducto=" + califEntregable + ", fechaRegistro="
				+ fechaRegistro + "]";
	}
	
	
	
	
}
