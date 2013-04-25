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

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ActividadDO;

/**
 * @author CPC-04
 *
 */


@Entity
@Table(name="informedetalle")

public class InformeDetalleDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9107103506710515280L;
	
	
	public InformeDetalleDO() {
		super();
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "infoDet_id", nullable =  false)
	private Long id;

	
	@Column(name = "infoDet_descripcion", nullable = false )
	private String descripcion;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "infoDet_fechaRegistro", nullable = false)
	private Date fechaRegistro;
	
	
	@Column(name = "infoDet_porceAvance", nullable = false )
	private Float porcenAvance;
	
		
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "infoDet_actividad_id", referencedColumnName = "actividad_id", nullable = false)
	private ActividadDO actividad;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "infoDet_informe_id", referencedColumnName = "informe_id", nullable = false)
	private InformeDO informe;


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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	 * @return the porcenAvance
	 */
	public Float getPorcenAvance() {
		return porcenAvance;
	}

	/**
	 * @param porcenAvance the porcenAvance to set
	 */
	public void setPorcenAvance(Float porcenAvance) {
		this.porcenAvance = porcenAvance;
	}

	/**
	 * @return the actividad
	 */
	public ActividadDO getActividad() {
		return actividad;
	}

	/**
	 * @param actividad the actividad to set
	 */
	public void setActividad(ActividadDO actividad) {
		this.actividad = actividad;
	}

	/**
	 * @return the informe
	 */
	public InformeDO getInforme() {
		return informe;
	}

	/**
	 * @param informe the informe to set
	 */
	public void setInforme(InformeDO informe) {
		this.informe = informe;
	}

	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((porcenAvance == null) ? 0 : porcenAvance.hashCode());
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
		InformeDetalleDO other = (InformeDetalleDO) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
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
		if (porcenAvance == null) {
			if (other.porcenAvance != null)
				return false;
		} else if (!porcenAvance.equals(other.porcenAvance))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InformeDetalleDO [id=" + id + ", descripcion=" + descripcion
				+ ", fechaRegistro=" + fechaRegistro + ", porcenAvance="
				+ porcenAvance + "]";
	}
	
	
	
	

}
