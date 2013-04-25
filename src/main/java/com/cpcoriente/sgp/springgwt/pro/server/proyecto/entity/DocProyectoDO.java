package com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity;

import java.io.Serializable;
import java.util.Arrays;
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



@Entity
@Table(name = "docproyecto", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"docProy_proyecto_id","docProy_nombre"})})
@NamedQueries({
	@NamedQuery(name = "docProyectoDO.seleccionPorProyecto", query = "select docPro from DocProyectoDO docPro where docPro.idProyecto = :idProyecto order by docPro.nombre")
})

public class DocProyectoDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8118105975593788542L;
	
	public DocProyectoDO(){
		
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "docProy_id", nullable = false, unique = true)
	private Long id;
	
	
	@Version 
	@Column(name="docProy_version")
	private int version;

	
	@Column(name = "docProy_descripcion", nullable = false)
	private String descripcion;
	
	
	@Column(name = "docProy_nombre", nullable = false)
	private String nombre;
	
	
	@Column(name = "docProy_proyecto_id", nullable = false)
	private ProyectoDO proyecto;

	@Lob
	@Column(name = "docProy_documento", length=32768)
	private byte[] documento;

	
	@Temporal (TemporalType.TIMESTAMP)
	@Column(name = "docProy_fechaRegistro", nullable = false)
	private Date fechaRegistro;
	
	@Override
	public String toString() {
		return "DocProyectoDO [id=" + id + ", version=" + version
				+ ", descripcion=" + descripcion + ", nombre=" + nombre
				+ ", proyecto=" + proyecto + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public ProyectoDO getProyecto() {
		return proyecto;
	}

	public void setProyecto(ProyectoDO proyecto) {
		this.proyecto = proyecto;
	}

	public byte[] getDocumento() {
		return documento;
	}

	public void setDocumento(byte[] documento) {
		this.documento = documento;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + Arrays.hashCode(documento);
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + version;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DocProyectoDO other = (DocProyectoDO) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (!Arrays.equals(documento, other.documento))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (version != other.version)
			return false;
		return true;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	
}
