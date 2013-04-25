/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.actividad.entity;

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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name="entregable", uniqueConstraints = {
		@UniqueConstraint( columnNames = {"entregable_actividad_id","entregable_codigo"})})

@NamedQueries({
	@NamedQuery(name = "entregableDO.listarTodo", query = "select ent from EntregableDO ent where ent.actividad.id = :idActividad order by ent.codigo"),
	@NamedQuery(name = "entregableDO.seleccionPorCodigoNombre", query = "select ent from EntrgableDO ent where ent.actividad.id = :idActividad and (lower(ent.nombre) like :parteNombre  OR lower(ent.codigo) = :parteCodigo) order by ent.codigo, ent.nombre"),
	@NamedQuery(name = "actividadDO.seleccionPorEstado", query = "select ent from EntregableDO ent where ent.actividad.id = :idActividad and ent.estado = :estado order by ent.codigo, ent.nombre"),
	@NamedQuery(name = "actividadDO.seleccionPorRangofechas", query = "select ent from EntregableDO ent where ent.actividad.id = :idActividad and ent.fechaEntrega >= :fechaInicio and act.fechaEntrega <= :fechaFin order by act.codigo, act.nombre")
    })

public class EntregableDO implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 4938117828874031014L;


	public EntregableDO(){
		super();
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "entregable_id", nullable = false, unique = true)
	private Long id;
	
	@Version 
	@Column(name="entregable_version")
	private int version;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "entregable_actividad_id", referencedColumnName = "actividad_id", nullable = false)
	private ActividadDO actividad;
	
	
	@Column(name = "entregable_codigo", nullable = false, unique = false)
	private String codigo;
	
	
	@Column(name = "entregable_nombre", nullable = false, unique = false)
	private String nombre;
	
	@Column(name = "entregable_nombre", nullable = false, unique = false)
	private int resultadoDe;
	
	@Column(name = "entregable_tipo", nullable = false, unique = false)
	private int tipo;
	
	@Column(name = "entregable_estado", nullable = false, unique = false)
	private int estado;
	
	@Temporal (TemporalType.DATE)
	@Column(name = "entregable_fechaEntrega", nullable = false)
	private Date fechaEntrega;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "entregable")
	private Set<VersionEntregableDO> versionEntregableSet;


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
	 * @return the actividad
	 */
	public ActividadDO getActividad() {
		return actividad;
	}

	/**
	 * @param actividad the actividad to set
	 */
	public void setActividad(ActividadDO actividad) {
		this.actividad = actividad;
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
	 * @return the resultadoDe
	 */
	public int getResultadoDe() {
		return resultadoDe;
	}

	/**
	 * @param resultadoDe the resultadoDe to set
	 */
	public void setResultadoDe(int resultadoDe) {
		this.resultadoDe = resultadoDe;
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
	 * @return the fechaEntrega
	 */
	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	/**
	 * @param fechaEntrega the fechaEntrega to set
	 */
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	
	
	
	/**
	 * @return the versionEntregableSet
	 */
	public Set<VersionEntregableDO> getVersionEntregableSet() {
		return versionEntregableSet;
	}

	/**
	 * @param versionEntregableSet the versionEntregableSet to set
	 */
	public void setVersionEntregableSet(
			Set<VersionEntregableDO> versionEntregableSet) {
		this.versionEntregableSet = versionEntregableSet;
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
		result = prime * result + estado;
		result = prime * result
				+ ((fechaEntrega == null) ? 0 : fechaEntrega.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + resultadoDe;
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
		EntregableDO other = (EntregableDO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (estado != other.estado)
			return false;
		if (fechaEntrega == null) {
			if (other.fechaEntrega != null)
				return false;
		} else if (!fechaEntrega.equals(other.fechaEntrega))
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
		if (resultadoDe != other.resultadoDe)
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
		return "EntregableDO [id=" + id + ", codigo=" + codigo + ", nombre="
				+ nombre + ", resultadoDe=" + resultadoDe + ", tipo=" + tipo
				+ ", estado=" + estado + ", fechaEntrega=" + fechaEntrega + "]";
	}

	
	
}
