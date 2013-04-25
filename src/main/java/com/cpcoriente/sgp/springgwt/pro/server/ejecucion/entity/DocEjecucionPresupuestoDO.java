/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.ejecucion.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

/**
 * @author CPC-04
 *
 */


@Entity
@Table(name="docejecucionpresupuestal", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"docEjecPres_ejecPres_id", "docEjecPres_nombre"})})

@NamedQueries({
	@NamedQuery(name = "docEjecucionPresupuestoDO.seleccionPorEjecucionPresupuesto", query = "select docEjec from DocEjecucionPresupuestoDO docEjec where docEjec.idEjecPres = :idEjecucionPresupuesto order by docEjec.fechaRegistro, docEjec.nombre")
})



public class DocEjecucionPresupuestoDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4020318255939704491L;
	
	
	public DocEjecucionPresupuestoDO() {
		super();
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "docEjecPres_id", nullable = false, unique = true)
	private Long id;
	
	
	@Version 
	@Column(name="docEjecPres_version")
	private int version;
	
	
	@Column(name = "docEjecPres_nombre", nullable = false, unique = false)
	private String nombre;
	
	
	@Column(name = "docEjecPres_descripcion", nullable = false, unique = false)
	private String descripcion;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "docEjecPres_fechaRegistro", nullable = false)
	private Date fechaRegistro;
	
	@Lob
	@Column(name = "docEjecPres_documento", nullable = false, unique = false)
	private byte[] documento;
	

	@Column(name = "docEjecPres_ejecPres_id", nullable = false, unique = false)
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
		DocEjecucionPresupuestoDO other = (DocEjecucionPresupuestoDO) obj;
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
		return "DocEjecucionPresupuestoDO [id=" + id + ", nombre=" + nombre
				+ ", descripcion=" + descripcion + ", fechaRegistro="
				+ fechaRegistro + ", idEjecPres=" + idEjecPres + "]";
	}
	
	

}
