/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto;

import java.io.Serializable;
import java.util.Date;

import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ActividadTO;

/**
 * @author CPC-04
 *
 */
public class InformeDetalleTO implements Comparable<InformeDetalleTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7050209544488395660L;

	public int compareTo(InformeDetalleTO obj) {
		
		return getId().compareTo(obj.getId());
	}
	
	
	
	private Long id;

	
	private String descripcion;
	

	private Date fechaRegistro;
	
	
	private Float porcenAvance;
	
		
	private ActividadTO actividad;
	

	private InformeTO informe;

	
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
	public ActividadTO getActividad() {
		return actividad;
	}


	/**
	 * @param actividad the actividad to set
	 */
	public void setActividad(ActividadTO actividad) {
		this.actividad = actividad;
	}


	/**
	 * @return the informe
	 */
	public InformeTO getInforme() {
		return informe;
	}


	/**
	 * @param informe the informe to set
	 */
	public void setInforme(InformeTO informe) {
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
		InformeDetalleTO other = (InformeDetalleTO) obj;
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
		return "InformeDetalleTO [id=" + id + ", descripcion=" + descripcion
				+ ", fechaRegistro=" + fechaRegistro + ", porcenAvance="
				+ porcenAvance + "]";
	}
	
	
	

}
