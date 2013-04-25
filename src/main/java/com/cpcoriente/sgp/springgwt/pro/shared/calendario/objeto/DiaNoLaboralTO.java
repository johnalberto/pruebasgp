package com.cpcoriente.sgp.springgwt.pro.shared.calendario.objeto;

import java.io.Serializable;
import java.util.Date;

import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EmpresaTO;


public class DiaNoLaboralTO implements Comparable<DiaNoLaboralTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2951111456365575984L;

	public int compareTo(DiaNoLaboralTO obj) {
		
		return getId().compareTo(obj.getId());
	}
	
	private Long id;
	
	private Date fechaDia;
	
	private String descripcion;
	
	private EmpresaTO empresa;

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
	 * @return the empresa
	 */
	public EmpresaTO getEmpresa() {
		return empresa;
	}

	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(EmpresaTO empresa) {
		this.empresa = empresa;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DiaNoLaboralTO [id=" + id + ", fechaDia=" + fechaDia
				+ ", descripcion=" + descripcion + "]";
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
		DiaNoLaboralTO other = (DiaNoLaboralTO) obj;
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

	
	
	
}
