package com.cpcoriente.sgp.springgwt.pro.server.informe.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.PersonalDO;

@Entity
@Table(name="informe",uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"informe_actividad_id", "informe_personal_id", "informe_codigo"})
	    })


public class InformeDO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4308604870482162099L;


	public InformeDO() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "informe_id", nullable =  false)
	private Long id;
	
	@Version 
	@Column(name="informe_version")
	private int version;
	
	@Column(name = "informe_codigo", nullable = false )
	private String codigo;
	
	@Column(name = "informe_descripcion", nullable = false)
	private String descripcion;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "informe_fechaRegistro", nullable = false)
	private Date fechaRegistro;
	
	@Column(name = "informe_vobo", nullable = false)
	private boolean vobo;
			
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "informe_personal_id", referencedColumnName = "personal_id", nullable = false)
	private PersonalDO persona;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "informe")
	private Set<InformeDetalleDO> informeDetalleSet;
	
	
	
	
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
	 * @return the vobo
	 */
	public boolean isVobo() {
		return vobo;
	}


	/**
	 * @param vobo the vobo to set
	 */
	public void setVobo(boolean vobo) {
		this.vobo = vobo;
	}


	/**
	 * @return the persona
	 */
	public PersonalDO getPersona() {
		return persona;
	}


	/**
	 * @param persona the persona to set
	 */
	public void setPersona(PersonalDO persona) {
		this.persona = persona;
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
	 * @return the informeDetalleSet
	 */
	public Set<InformeDetalleDO> getInformeDetalleSet() {
		return informeDetalleSet;
	}


	/**
	 * @param informeDetalleSet the informeDetalleSet to set
	 */
	public void setInformeDetalleSet(Set<InformeDetalleDO> informeDetalleSet) {
		this.informeDetalleSet = informeDetalleSet;
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
		result = prime * result + (vobo ? 1231 : 1237);
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
		InformeDO other = (InformeDO) obj;
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
		if (vobo != other.vobo)
			return false;
		return true;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InformeDO [id=" + id + ", codigo=" + codigo + ", descripcion="
				+ descripcion + ", fechaRegistro=" + fechaRegistro
				+ ", vobo=" + vobo;
	}


	
	

}
