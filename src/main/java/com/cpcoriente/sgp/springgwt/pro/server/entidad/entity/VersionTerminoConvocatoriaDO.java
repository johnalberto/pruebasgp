/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.entidad.entity;

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
@Table(name="versionterminoconvocatoria")
@NamedQueries({
	@NamedQuery(name = "verTerminoConvocatoriaDO.seleccionPorFecha", query = "select ver from VersionTerminoConvocatoriaDO ver where ver.terminoConv.id = :idTerminoConv and ver.fechaRegistro <= :fechaIni and ver.fechaRegistro >= :fechaFin  order by ver.codigo")
	})
public class VersionTerminoConvocatoriaDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1003710163529866883L;
	
	
	public VersionTerminoConvocatoriaDO() {
		super();
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "verTerminoConv_id", nullable = false, unique = true)
	private Long id;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "verTerminoConv_terminoConv_id", referencedColumnName = "producto_id", nullable = false)
	private TerminoConvocatoriaDO terminoConv;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "verTerminoConv_fechaRegistro", nullable = false, unique = false)
	private Date fechaRegistro;
	
	@Column(name = "verTerminoConv_observacion", nullable = false, unique = false)
	private String observacion;
	
	@Column(name = "verTerminoConv_codigo", nullable = false, unique = true)
	private String codigo;
	
	@Column(name = "verTerminoConv_nombre", nullable = false, unique = false)
	private String nombre;
	
	@Column(name = "verTerminoConv_descripcion", nullable = false, unique = false)
	private String descripcion;
	
	
	@Temporal (TemporalType.DATE)
	@Column(name = "verTerminoConv_fechaInicio", nullable = false)
	private Date fechaInicio;
	
	@Temporal (TemporalType.DATE)
	@Column(name = "verTerminoConv_fechaFin", nullable = false)
	private Date fechaFin;
	
	
	

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
	 * @return the terminoConv
	 */
	public TerminoConvocatoriaDO getTerminoConv() {
		return terminoConv;
	}

	/**
	 * @param terminoConv the terminoConv to set
	 */
	public void setTerminoConv(TerminoConvocatoriaDO terminoConv) {
		this.terminoConv = terminoConv;
	}

	
	
	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VersionTerminoConvocatoriaDO [id=" + id + ", fechaRegistro="
				+ fechaRegistro + ", observacion=" + observacion + ", codigo="
				+ codigo + ", nombre=" + nombre + ", descripcion="
				+ descripcion + "]";
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
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((observacion == null) ? 0 : observacion.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof VersionTerminoConvocatoriaDO)) {
			return false;
		}
		VersionTerminoConvocatoriaDO other = (VersionTerminoConvocatoriaDO) obj;
		if (codigo == null) {
			if (other.codigo != null) {
				return false;
			}
		} else if (!codigo.equals(other.codigo)) {
			return false;
		}
		if (descripcion == null) {
			if (other.descripcion != null) {
				return false;
			}
		} else if (!descripcion.equals(other.descripcion)) {
			return false;
		}
		if (fechaRegistro == null) {
			if (other.fechaRegistro != null) {
				return false;
			}
		} else if (!fechaRegistro.equals(other.fechaRegistro)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (nombre == null) {
			if (other.nombre != null) {
				return false;
			}
		} else if (!nombre.equals(other.nombre)) {
			return false;
		}
		if (observacion == null) {
			if (other.observacion != null) {
				return false;
			}
		} else if (!observacion.equals(other.observacion)) {
			return false;
		}
		return true;
	}	
	
	
}
















