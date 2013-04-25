/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.informe.entity;

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
@Table(name="docinforme", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"docInf_informe_id", "docInf_nombre"})})


@NamedQueries({
	@NamedQuery(name = "docInformeDO.seleccionPorInforme", query = "select docInf from DocInformeDO docInf where docInf.idInforme = :idInforme order by docInf.fechaRegistro, docInf.nombre")
})


public class DocInformeDO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6491508634674061225L;
	
	
	public DocInformeDO() {
		super();
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "docInf_id", nullable = false, unique = true)
	private Long id;
	
	
	@Version 
	@Column(name="docInf_version")
	private int version;
	
	
	@Column(name = "docInf_nombre", nullable = false, unique = false)
	private String nombre;
	
	
	@Column(name = "docInf_descripcion", nullable = false, unique = false)
	private String descripcion;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "docInf_fechaRegistro", nullable = false)
	private Date fechaRegistro;
	
	
	@Column(name = "docInf_tipo", nullable = false)
	private int tipo;
	
	@Lob
	@Column(name = "docInf_documento", nullable = false, unique = false)
	private byte[] documento;
	

	@Column(name = "docInf_informe_id", nullable = false, unique = false)
	private Long idInforme;


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
	 * @return the tipo
	 */
	public int getTipo() {
		return tipo;
	}


	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;
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
	 * @return the objetivo
	 */
	public Long getIdInforme() {
		return idInforme;
	}


	/**
	 * @param objetivo the objetivo to set
	 */
	public void setIdInforme(Long idInforme) {
		this.idInforme = idInforme;
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
				+ ((idInforme == null) ? 0 : idInforme.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + tipo;
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
		DocInformeDO other = (DocInformeDO) obj;
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
		if (idInforme == null) {
			if (other.idInforme != null)
				return false;
		} else if (!idInforme.equals(other.idInforme))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DocInformeDO [id=" + id + ", nombre=" + nombre
				+ ", descripcion=" + descripcion + ", fechaRegistro="
				+ fechaRegistro + ", tipo=" + tipo + ", idInforme=" + idInforme
				+ "]";
	}

	
	
	
}
