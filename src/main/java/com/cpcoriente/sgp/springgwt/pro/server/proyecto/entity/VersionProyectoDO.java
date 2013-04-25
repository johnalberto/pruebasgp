/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity;

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

/**
 * @author CPC-03
 *
 */
@Entity
@Table(name="versionproyecto")
@NamedQueries({
	@NamedQuery(name = "verProyectoDO.seleccionPorFecha", query = "select ver from VersionProyectoDO ver where ver.proyecto.id = :idProyecto and ver.fechaRegistro <= :fechaInicio and ver.fechaRegistro >= :fechaFin  order by ver.fechaRegistro"),
	@NamedQuery(name = "verProyectoDO.seleccionPorProyecto", query = "select ver from VersionProyectoDO ver where ver.proyecto.id = :idProyecto  order by ver.fechaRegistro")
	})

public class VersionProyectoDO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8928714718855970623L;
	
	public VersionProyectoDO() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "verProyecto_id", nullable = false, unique = true)
	private Long id;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "verProyecto_proyecto_id", referencedColumnName = "proyecto_id", nullable = false)
	private ProyectoDO proyecto;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "verProyecto_fechaRegistro", nullable = false, unique = false)
	private Date fechaRegistro;
	
	@Column(name = "verProyecto_observacion", nullable = false, unique = false)
	private String observacion;
	
	@Column(name = "verProyecto_codigo", nullable = false, unique = false)
	private String codigo;
		
	@Column(name = "verProyecto_titulo", nullable = false, unique = false)
	private String titulo;
	
	
	@Column(name = "verProyecto_estado", nullable = false, unique = false)
	private int estado;
	
	@Temporal (TemporalType.DATE)
	@Column(name = "verProyecto_fechaInicio", nullable = false)
	private Date fechaInicio;
	
	@Temporal (TemporalType.DATE)
	@Column(name = "verProyecto_fechaFin", nullable = false)
	private Date fechaFin;

	@Column(name = "verProyecto_objGeneral", nullable = false, unique = false)
	private String objGeneral;
	

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
	 * @return the proyecto
	 */
	public ProyectoDO getProyecto() {
		return proyecto;
	}

	/**
	 * @param proyecto the proyecto to set
	 */
	public void setProyecto(ProyectoDO proyecto) {
		this.proyecto = proyecto;
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
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
	 * 
	 * @return
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * 
	 * @param fechaInicio
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * 
	 * @return
	 */
	public Date getFechaFin() {
		return fechaFin;
	}

	/**
	 * 
	 * @param fechaFin
	 */
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
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
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((observacion == null) ? 0 : observacion.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		if (!(obj instanceof VersionProyectoDO)) {
			return false;
		}
		VersionProyectoDO other = (VersionProyectoDO) obj;
		if (codigo == null) {
			if (other.codigo != null) {
				return false;
			}
		} else if (!codigo.equals(other.codigo)) {
			return false;
		}
		if (estado != other.estado) {
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
		if (observacion == null) {
			if (other.observacion != null) {
				return false;
			}
		} else if (!observacion.equals(other.observacion)) {
			return false;
		}
		if (titulo == null) {
			if (other.titulo != null) {
				return false;
			}
		} else if (!titulo.equals(other.titulo)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VersionProyectoDO [id=" + id + ", observacion=" + observacion
				+ ", codigo=" + codigo + ", titulo=" + titulo + ", estado="
				+ estado + "]";
	}

	public String getObjGeneral() {
		return objGeneral;
	}

	public void setObjGeneral(String objGeneral) {
		this.objGeneral = objGeneral;
	}

	
	
}






















