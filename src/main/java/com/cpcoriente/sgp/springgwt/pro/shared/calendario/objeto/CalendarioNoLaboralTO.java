/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.calendario.objeto;

import java.io.Serializable;
import java.util.Date;

import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.ProyectoTO;

/**
 * @author CPC-04
 *
 */
public class CalendarioNoLaboralTO implements Comparable<CalendarioNoLaboralTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1821002249130253898L;

	public int compareTo(CalendarioNoLaboralTO obj) {
		
		return getId().compareTo(obj.getId());
	}

	private Long id;
	
	private int version;
	
	private String descripcion;
	
	private Date fechaDia;

	private ProyectoTO proyecto;

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
	 * @return the fechaDia
	 */
	public Date getFechaDia() {
		return fechaDia;
	}

	/**
	 * @param fechaDia the fechaDia to set
	 */
	public void setFechaDia(Date fechaDia) {
		this.fechaDia = fechaDia;
	}

	/**
	 * @return the proyecto
	 */
	public ProyectoTO getProyecto() {
		return proyecto;
	}

	/**
	 * @param proyecto the proyecto to set
	 */
	public void setProyecto(ProyectoTO proyecto) {
		this.proyecto = proyecto;
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
				+ ((fechaDia == null) ? 0 : fechaDia.hashCode());
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
		CalendarioNoLaboralTO other = (CalendarioNoLaboralTO) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (fechaDia == null) {
			if (other.fechaDia != null)
				return false;
		} else if (!fechaDia.equals(other.fechaDia))
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
		return "CalendarioNoLaboralTO [id=" + id + ", descripcion="
				+ descripcion + ", fechaDia=" + fechaDia + "]";
	}
	

	
}
