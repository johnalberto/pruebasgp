/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.objeto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author CPC-04
 *
 */
public class DocEjecucionPresupuestoTO implements Comparable<DocEjecucionPresupuestoTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6234924731957804648L;

	public int compareTo(DocEjecucionPresupuestoTO obj) {
		
		return getId().compareTo(obj.getId());
	}

	
	private Long id;
	
	private int version;
	
	private String nombre;
	
	private String descripcion;

	private Date fechaRegistro;
	
	private byte[] documento;
	
	private Long idEjecPres;

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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	 * @return the documento
	 */
	public byte[] getDocumento() {
		return documento;
	}

	/**
	 * @param documento the documento to set
	 */
	public void setDocumento(byte[] documento) {
		this.documento = documento;
	}

	/**
	 * @return the idEjecPres
	 */
	public Long getIdEjecPres() {
		return idEjecPres;
	}

	/**
	 * @param idEjecPres the idEjecPres to set
	 */
	public void setIdEjecPres(Long idEjecPres) {
		this.idEjecPres = idEjecPres;
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
				+ ((idEjecPres == null) ? 0 : idEjecPres.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		DocEjecucionPresupuestoTO other = (DocEjecucionPresupuestoTO) obj;
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
		if (idEjecPres == null) {
			if (other.idEjecPres != null)
				return false;
		} else if (!idEjecPres.equals(other.idEjecPres))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DocEjecucionPresupuestoTO [id=" + id + ", nombre=" + nombre
				+ ", descripcion=" + descripcion + ", fechaRegistro="
				+ fechaRegistro + ", idEjecPres=" + idEjecPres + "]";
	}
	
	
	
	
	
}
