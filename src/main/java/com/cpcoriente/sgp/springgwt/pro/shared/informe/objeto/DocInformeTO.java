/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto;

import java.io.Serializable;
import java.util.Date;

import com.cpcoriente.sgp.springgwt.pro.shared.informe.enumerador.TipoDocumentoInformeEnum;

/**
 * @author CPC-04
 *
 */
public class DocInformeTO implements Comparable<DocInformeTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8526320569498770125L;

	public int compareTo(DocInformeTO obj) {
		
		return getId().compareTo(obj.getId());
	}
	
	
    private Long id;
	
	private int version;

	private String nombre;
	
	private String descripcion;
	
	private TipoDocumentoInformeEnum tipo;
	
	private Date fechaRegistro;
	
	private byte[] documento;

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
	public TipoDocumentoInformeEnum getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoDocumentoInformeEnum tipo) {
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
	 * @return the idInforme
	 */
	public Long getIdInforme() {
		return idInforme;
	}

	/**
	 * @param idInforme the idObjetivo to set
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
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		DocInformeTO other = (DocInformeTO) obj;
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
		return "DocInformeTO [id=" + id + ", nombre=" + nombre
				+ ", descripcion=" + descripcion + ", tipo=" + tipo
				+ ", fechaRegistro=" + fechaRegistro + ", idInforme="
				+ idInforme + "]";
	}

	

}
