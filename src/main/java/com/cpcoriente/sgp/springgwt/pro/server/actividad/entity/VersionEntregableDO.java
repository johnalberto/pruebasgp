/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.actividad.entity;

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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * @author CPC-04
 *
 */
@Entity
@Table(name="versionentregable")
@NamedQueries({
	@NamedQuery(name = "verEntregableDO.seleccionPorFecha", query = "select ver from VersionEntregableDO ver where ver.entregable.id = :idEntregable and ver.fechaRegistro >= :fechaIni and ver.fechaRegistro <= :fechaFin  order by ver.fechaRegistro, ver.codigo")
	})

public class VersionEntregableDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3362222340366125443L;

	public VersionEntregableDO(){
		
		super();
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "verEntregable_id", nullable = false, unique = true)
	private Long id;
		
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "verEntregable_fechaRegistro", nullable = false, unique = false)
	private Date fechaRegistro;
	
	
	@Column(name = "verEntregable_observacion", nullable = false, unique = false)
	private String observacion;
	
	
	@Column(name = "verEntregable_codigo", nullable = false, unique = false)
	private String codigo;
	
	
	@Column(name = "verEntregable_nombre", nullable = false, unique = false)
	private String nombre;
	
	
	@Column(name = "verEntregable_resultadoDe", nullable = false, unique = false)
	private int resultadoDe;
	
	@Column(name = "verEntregable_tipo", nullable = false, unique = false)
	private int tipo;
	
	
	@Column(name = "verEntregable_estado", nullable = false, unique = false)
	private int estado;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "verEntregable_fechaEntrega", nullable = false, unique = false)
	private Date fechaEntrega;
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "verEntregable_entregable_id", referencedColumnName = "entregable_id", nullable = false)
	private EntregableDO entregable;

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
	 * @return the observacion
	 */
	public String getObservacion() {
		return observacion;
	}


	/**
	 * @param observacion the observacion to set
	 */
	public void setObservacion(String observacion) {
		this.observacion = observacion;
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
	 * @return the entregable
	 */
	public EntregableDO getEntregable() {
		return entregable;
	}


	/**
	 * @param entregable the entregable to set
	 */
	public void setEntregable(EntregableDO entregable) {
		this.entregable = entregable;
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
		result = prime * result
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((observacion == null) ? 0 : observacion.hashCode());
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
		VersionEntregableDO other = (VersionEntregableDO) obj;
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
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (observacion == null) {
			if (other.observacion != null)
				return false;
		} else if (!observacion.equals(other.observacion))
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
		return "VersionEntregableDO [id=" + id + ", fechaRegistro="
				+ fechaRegistro + ", observacion=" + observacion + ", codigo="
				+ codigo + ", nombre=" + nombre + ", resultadoDe="
				+ resultadoDe + ", tipo=" + tipo + ", estado=" + estado
				+ ", fechaEntrega=" + fechaEntrega + "]";
	}


	
}
