package com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.PersonalTO;


public class InformeTO implements Comparable<InformeTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6123263209835563329L;

	public int compareTo(InformeTO obj) {
		
		return getId().compareTo(obj.getId());
	}
	
	private Long id;
	
	private int version;
	
	private PersonalTO persona;
		
	private String codigo;
	
	private String descripcion;
	
	private Date fechaRegistro;
		
	private boolean voBo;

	private List<DocInformeTO> documentoLista;
	
	private List<InformeDetalleTO> informeDetalleLista;
	

	
	

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
	 * @return the persona
	 */
	public PersonalTO getPersona() {
		return persona;
	}

	/**
	 * @param persona the persona to set
	 */
	public void setPersona(PersonalTO persona) {
		this.persona = persona;
	}

	
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	 * @return the voBo
	 */
	public boolean isVoBo() {
		return voBo;
	}

	/**
	 * @param voBo the voBo to set
	 */
	public void setVoBo(boolean voBo) {
		this.voBo = voBo;
	}

	/**
	 * @return the documentoLista
	 */
	public List<DocInformeTO> getDocumentoLista() {
		return documentoLista;
	}

	/**
	 * @param documentoLista the documentoLista to set
	 */
	public void setDocumentoLista(List<DocInformeTO> documentoLista) {
		this.documentoLista = documentoLista;
	}	
	
	/**
	 * @return the informeDetalleLista
	 */
	public List<InformeDetalleTO> getInformeDetalleLista() {
		return informeDetalleLista;
	}

	/**
	 * @param informeDetalleLista the informeDetalleLista to set
	 */
	public void setInformeDetalleLista(List<InformeDetalleTO> informeDetalleLista) {
		this.informeDetalleLista = informeDetalleLista;
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

	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (voBo ? 1231 : 1237);
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
		InformeTO other = (InformeTO) obj;
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
		if (voBo != other.voBo)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InformeTO [id=" + id + ", codigo=" + codigo + ", descripcion="
				+ descripcion + ", fechaRegistro=" + fechaRegistro
				+ ", voBo=" + voBo	+ "]";
	}
	

	
}
