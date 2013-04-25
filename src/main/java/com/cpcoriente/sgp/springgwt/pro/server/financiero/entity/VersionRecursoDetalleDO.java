package com.cpcoriente.sgp.springgwt.pro.server.financiero.entity;

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

@Entity
@Table(name="versionrecursodetalle")
public class VersionRecursoDetalleDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public VersionRecursoDetalleDO(){
		
		super();
	}
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "verRecDet_id", nullable = false, unique = true)
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "verRecDet_fechaRegistro", nullable = false)
	private Date fechaRegistro;
	
	@Column(name = "verRecDet_observacion", nullable = false)
	private String observacion;
	
	@Column(name = "verRecDet_valEfectivo", nullable = false)
	private float valorEfectivo;
	
	@Column(name = "verRecDet_valEspecie", nullable = false)
	private float valorEspecie;
	
	@Column(name = "verRecDet_tipo", nullable = false)
	private int tipo;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "verRecDet_recDet_id", referencedColumnName = "recDet_id", nullable = false)
	private RecursoDetalleDO recursoDetalle;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public float getValorEfectivo() {
		return valorEfectivo;
	}

	public void setValorEfectivo(float valorEfectivo) {
		this.valorEfectivo = valorEfectivo;
	}

	public float getValorEspecie() {
		return valorEspecie;
	}

	public void setValorEspecie(float valorEspecie) {
		this.valorEspecie = valorEspecie;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public RecursoDetalleDO getRecursoDetalle() {
		return recursoDetalle;
	}

	public void setRecursoDetalle(RecursoDetalleDO recursoDetalle) {
		this.recursoDetalle = recursoDetalle;
	}

	@Override
	public String toString() {
		return "VersionRecursoDetalleDO [id=" + id + ", fechaRegistro="
				+ fechaRegistro + ", observacion=" + observacion + ", tipo="
				+ tipo + ", recursoDetalle=" + recursoDetalle + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((observacion == null) ? 0 : observacion.hashCode());
		result = prime * result
				+ ((recursoDetalle == null) ? 0 : recursoDetalle.hashCode());
		result = prime * result + tipo;
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
		VersionRecursoDetalleDO other = (VersionRecursoDetalleDO) obj;
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
		if (observacion == null) {
			if (other.observacion != null)
				return false;
		} else if (!observacion.equals(other.observacion))
			return false;
		if (recursoDetalle == null) {
			if (other.recursoDetalle != null)
				return false;
		} else if (!recursoDetalle.equals(other.recursoDetalle))
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}
	
	
	
}
