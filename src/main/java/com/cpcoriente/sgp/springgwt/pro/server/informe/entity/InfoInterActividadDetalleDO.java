package com.cpcoriente.sgp.springgwt.pro.server.informe.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ActividadDO;


@Entity
@Table(name="infointeractividaddetalle",uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"infIntActDet_infoInter_id", "infIntActDet_actividad_id","infIntActDet_fechaReg"})
	    })
public class InfoInterActividadDetalleDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InfoInterActividadDetalleDO(){
		
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "infIntActDet_id", nullable =  false)
	private Long id;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "infIntActDet_actividad_id", referencedColumnName = "actividad_id", nullable = false)
	private ActividadDO actividad;

	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "infIntActDet_infoInter_id", referencedColumnName = "infoInter_id", nullable = false)
	private InformeInterventorDO infInterventor;

	@Column(name = "infIntActDet_comentario", nullable = false )
	private String comentario;

	@Column(name = "infIntActDet_calif", nullable = false)
	private float CalifActividad;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "infIntObjDet_fechaReg", nullable = false)
	private Date fechaRegistro;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ActividadDO getActividad() {
		return actividad;
	}

	public void setActividad(ActividadDO actividad) {
		this.actividad = actividad;
	}

	public InformeInterventorDO getInfInterventor() {
		return infInterventor;
	}

	public void setInfInterventor(InformeInterventorDO infInterventor) {
		this.infInterventor = infInterventor;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public float getCalifActividad() {
		return CalifActividad;
	}

	public void setCalifActividad(float califActividad) {
		CalifActividad = califActividad;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	@Override
	public String toString() {
		return "InformeInterventorActividadDO [id=" + id + ", actividad="
				+ actividad + ", infInterventor=" + infInterventor
				+ ", comentario=" + comentario + ", fechaRegistro="
				+ fechaRegistro + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((actividad == null) ? 0 : actividad.hashCode());
		result = prime * result
				+ ((comentario == null) ? 0 : comentario.hashCode());
		result = prime * result
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((infInterventor == null) ? 0 : infInterventor.hashCode());
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
		InfoInterActividadDetalleDO other = (InfoInterActividadDetalleDO) obj;
		if (actividad == null) {
			if (other.actividad != null)
				return false;
		} else if (!actividad.equals(other.actividad))
			return false;
		if (comentario == null) {
			if (other.comentario != null)
				return false;
		} else if (!comentario.equals(other.comentario))
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
		if (infInterventor == null) {
			if (other.infInterventor != null)
				return false;
		} else if (!infInterventor.equals(other.infInterventor))
			return false;
		return true;
	}
	
	
	
}
