package com.cpcoriente.sgp.springgwt.pro.server.entidad.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


@Entity
@Table(name = "fotoentidad", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"fotoEntid_codigo"}),
	    @UniqueConstraint(columnNames = {"fotoEntid_entidad_id"})})
@NamedQueries({
	@NamedQuery(name = "fotoEntidadDO.seleccionPorEntidad", query = "select foEnt from FotoPorReferenciaDO foEnt where foEnt.idEntidad = :idEntidad order by foEnt.codigo")
})
public class FotoEntidadDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public FotoEntidadDO() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fotoEntid_id", nullable = false, unique = true)
	private Long id;
	
	@Version 
	@Column(name="fotoEntid_version")
	private int version;

	
	@Column(name = "fotoEntid_codigo", nullable = false, unique = true)
	private String codigo;
	

	@Column(name = "fotoEntid_descripcion", nullable = false)
	private String descripcion;

	
	@Column(name = "fotoEntid_entidad_id", nullable = false)
	private Long idEntidad;
	
	@Lob
	@Column(name = "fotoRef_foto", length=32768)
	private byte[] foto;

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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getIdEntidad() {
		return idEntidad;
	}

	public void setIdEntidad(Long idEntidad) {
		this.idEntidad = idEntidad;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	@Override
	public String toString() {
		return "FotoEntidadDO [id=" + id + ", version=" + version + ", codigo="
				+ codigo + ", descripcion=" + descripcion + ", idEntidad="
				+ idEntidad + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((idEntidad == null) ? 0 : idEntidad.hashCode());
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
		FotoEntidadDO other = (FotoEntidadDO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idEntidad == null) {
			if (other.idEntidad != null)
				return false;
		} else if (!idEntidad.equals(other.idEntidad))
			return false;
		if (version != other.version)
			return false;
		return true;
	}
	
	
}
