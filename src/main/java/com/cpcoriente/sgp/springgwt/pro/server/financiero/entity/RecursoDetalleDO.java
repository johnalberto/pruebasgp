package com.cpcoriente.sgp.springgwt.pro.server.financiero.entity;

import java.io.Serializable;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.MovimientoContableDO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ProyectoEntidadDO;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.MovimientoContableTO;


@Entity
@Table(name="recursoDetalle" ,uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"recDet_proyEnt_id", "recDet_recurso_id"})})

public class RecursoDetalleDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2810112901127109306L;
	
	public RecursoDetalleDO(){
		
		super();
	}
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "recDet_id", nullable = false, unique = true)
	private Long id;
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "recDet_recurso_id", referencedColumnName = "recurso_id", nullable = false)
	private RecursoDO recurso;
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "recDet_proyEnt_id", referencedColumnName = "recurso_id", nullable = false)
	private ProyectoEntidadDO proyectoEntidad;
	
	@Column(name = "recDet_valEfectivo", nullable = false)
	private float valorEfectivo;
	
	
	@Column(name = "recDet_valEspecie", nullable = false)
	private float valorespecie;

	@Column(name = "recDet_tipo", nullable = false)
	private int tipo;
	
	@Version
	@Column(name = "recDet_version", nullable = false)
	private int version;
	
	@OneToOne(fetch = FetchType.EAGER, mappedBy = "recursoDetalle")
	private MovimientoContableDO movimiento;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public RecursoDO getRecurso() {
		return recurso;
	}

	public void setRecurso(RecursoDO recurso) {
		this.recurso = recurso;
	}

	public ProyectoEntidadDO getProyectoEntidad() {
		return proyectoEntidad;
	}

	public void setProyectoEntidad(ProyectoEntidadDO proyectoEntidad) {
		this.proyectoEntidad = proyectoEntidad;
	}

	public float getValorEfectivo() {
		return valorEfectivo;
	}

	public void setValorEfectivo(float valorEfectivo) {
		this.valorEfectivo = valorEfectivo;
	}

	public float getValorespecie() {
		return valorespecie;
	}

	public void setValorespecie(float valorespecie) {
		this.valorespecie = valorespecie;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "RecursoDetalleDO [id=" + id + ", recurso=" + recurso
				+ ", proyectoEntidad=" + proyectoEntidad + ", tipo=" + tipo
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((proyectoEntidad == null) ? 0 : proyectoEntidad.hashCode());
		result = prime * result + ((recurso == null) ? 0 : recurso.hashCode());
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
		RecursoDetalleDO other = (RecursoDetalleDO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (proyectoEntidad == null) {
			if (other.proyectoEntidad != null)
				return false;
		} else if (!proyectoEntidad.equals(other.proyectoEntidad))
			return false;
		if (recurso == null) {
			if (other.recurso != null)
				return false;
		} else if (!recurso.equals(other.recurso))
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public MovimientoContableDO getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(MovimientoContableDO movimiento) {
		this.movimiento = movimiento;
	}
	
	
	
}
