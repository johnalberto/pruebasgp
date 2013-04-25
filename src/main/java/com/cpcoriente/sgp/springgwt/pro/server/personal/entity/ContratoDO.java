/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.personal.entity;

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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name="contrato", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"contrato_cpp_id", "contrato_codigo"})
	    })

public class ContratoDO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8081201924281320591L;
	
	public ContratoDO () {
		super();
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "contrato_id", nullable = false, unique =  true)
	private Long id;
		
	@Version 
	@Column(name="contrato_version")
	private int version;	
	
	@Column(name = "contrato_codigo", nullable = false)
	private String codigo;
	
	@Column(name = "contrato_tipo", nullable = false)
	private int tipo;
	
	@Column(name = "contrato_estado", nullable = false)
	private int estado;
	
	@Column(name = "contrato_tiempoDedicado", nullable = false)
	private int tiempoDedicado;
		
	@Temporal(TemporalType.DATE)
	@Column(name = "contrato_fechaInicio", nullable = false)
	private Date fechaInicio;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "contrato_fechaFin", nullable = true)
	private Date fechaFin;
	
	@Column(name = "contrato_valorTotal", nullable = true)
	private Float valorTotal;
	
	@Column(name = "contrato_valorMensual", nullable = true)
	private Float valorMensual;
	
	@OneToOne(optional = false)
	@JoinColumn(name = "contrato_cpp_id", referencedColumnName = "cpp_id", nullable = false)
	private CargoPorPersonalDO cpp;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "contrato")
	private Set<ClausulaContratoDO> clausulaSet;

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
	 * @return the estado
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}

	/**
	 * @return the tiempoDedicado
	 */
	public int getTiempoDedicado() {
		return tiempoDedicado;
	}

	/**
	 * @param tiempoDedicado the tiempoDedicado to set
	 */
	public void setTiempoDedicado(int tiempoDedicado) {
		this.tiempoDedicado = tiempoDedicado;
	}

	
	/**
	 * @return the fechaInicio
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * @return the fechaFin
	 */
	public Date getFechaFin() {
		return fechaFin;
	}

	/**
	 * @param fechaFin the fechaFin to set
	 */
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	/**
	 * @return the valorTotal
	 */
	public Float getValorTotal() {
		return valorTotal;
	}

	/**
	 * @param valorTotal the valorTotal to set
	 */
	public void setValorTotal(Float valorTotal) {
		this.valorTotal = valorTotal;
	}

	/**
	 * @return the valorMensual
	 */
	public Float getValorMensual() {
		return valorMensual;
	}

	/**
	 * @param valorMensual the valorMensual to set
	 */
	public void setValorMensual(Float valorMensual) {
		this.valorMensual = valorMensual;
	}

	
	/**
	 * @return the cpp
	 */
	public CargoPorPersonalDO getCpp() {
		return cpp;
	}

	/**
	 * @param cpp the cpp to set
	 */
	public void setCpp(CargoPorPersonalDO cpp) {
		this.cpp = cpp;
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
	 * @return the clausulaSet
	 */
	public Set<ClausulaContratoDO> getClausulaSet() {
		return clausulaSet;
	}

	/**
	 * @param clausulaSet the clausulaSet to set
	 */
	public void setClausulaSet(Set<ClausulaContratoDO> clausulaSet) {
		this.clausulaSet = clausulaSet;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + estado;
		result = prime * result
				+ ((fechaFin == null) ? 0 : fechaFin.hashCode());
		result = prime * result
				+ ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + tiempoDedicado;
		result = prime * result + tipo;
		result = prime * result
				+ ((valorMensual == null) ? 0 : valorMensual.hashCode());
		result = prime * result
				+ ((valorTotal == null) ? 0 : valorTotal.hashCode());
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
		ContratoDO other = (ContratoDO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (estado != other.estado)
			return false;
		if (fechaFin == null) {
			if (other.fechaFin != null)
				return false;
		} else if (!fechaFin.equals(other.fechaFin))
			return false;
		if (fechaInicio == null) {
			if (other.fechaInicio != null)
				return false;
		} else if (!fechaInicio.equals(other.fechaInicio))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tiempoDedicado != other.tiempoDedicado)
			return false;
		if (tipo != other.tipo)
			return false;
		if (valorMensual == null) {
			if (other.valorMensual != null)
				return false;
		} else if (!valorMensual.equals(other.valorMensual))
			return false;
		if (valorTotal == null) {
			if (other.valorTotal != null)
				return false;
		} else if (!valorTotal.equals(other.valorTotal))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ContratoDO [id=" + id + ", codigo=" + codigo + ", tipo=" + tipo
				+ ", estado=" + estado + ", tiempoDedicado=" + tiempoDedicado
				+ ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ ", valorTotal=" + valorTotal + ", valorMensual="
				+ valorMensual + "]";
	}
	
	
}
