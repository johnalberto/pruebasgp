/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.EntidadDO;

/**
 * @author CPC-04
 *
 */

@Entity
@Table(name = "proyectoporentidad", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"proyEnt_entidad_id", "proyEnt_proyecto_id", "proyEnt_tipo"})})
public class ProyectoEntidadDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8224990185659828934L;
	
	public ProyectoEntidadDO() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="proyEnt_id", nullable = false, unique = true)
	private Long id;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "proyEnt_entidad_id", referencedColumnName = "entidad_id", nullable = false, insertable = true, updatable = true)
	private EntidadDO entidad;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "proyEnt_proyecto_id", referencedColumnName = "proyecto_id", nullable = false,  insertable = true, updatable = true)
	private ProyectoDO proyecto;
	
	@Column(name = "proyEnt_tipo", nullable = false, unique = false)
	private int tipoFuncion;

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
	 * @return the entidad
	 */
	public EntidadDO getEntidad() {
		return entidad;
	}

	/**
	 * @param entidad the entidad to set
	 */
	public void setEntidad(EntidadDO entidad) {
		this.entidad = entidad;
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
	 * @return the tipoFuncion
	 */
	public int getTipoFuncion() {
		return tipoFuncion;
	}

	/**
	 * @param tipoFuncion the tipoFuncion to set
	 */
	public void setTipoFuncion(int tipoFuncion) {
		this.tipoFuncion = tipoFuncion;
	}

	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProyectoPorEntidadDO [id=" + id + ", entidad=" + entidad
				+ ", proyecto=" + proyecto + ", tipoFuncion=" + tipoFuncion
				+ "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((entidad == null) ? 0 : entidad.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((proyecto == null) ? 0 : proyecto.hashCode());
		result = prime * result + tipoFuncion;
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
		if (!(obj instanceof ProyectoEntidadDO)) {
			return false;
		}
		ProyectoEntidadDO other = (ProyectoEntidadDO) obj;
		if (entidad == null) {
			if (other.entidad != null) {
				return false;
			}
		} else if (!entidad.equals(other.entidad)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (proyecto == null) {
			if (other.proyecto != null) {
				return false;
			}
		} else if (!proyecto.equals(other.proyecto)) {
			return false;
		}
		if (tipoFuncion != other.tipoFuncion) {
			return false;
		}
		return true;
	}
		
	
}
