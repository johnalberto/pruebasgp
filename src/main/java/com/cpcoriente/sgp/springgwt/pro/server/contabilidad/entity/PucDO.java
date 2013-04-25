/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity;

import java.io.Serializable;

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
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.EntidadDO;

/**
 * @author CPC-04
 *
 */

@Entity
@Table(name = "puc", uniqueConstraints = {
		@UniqueConstraint( columnNames = {"puc_entidad_id", "puc_codigo"} ),
		@UniqueConstraint( columnNames = {"puc_entidad_id", "puc_nombre"} )
})

@NamedQueries({
	@NamedQuery(name = "pucDO.listarTodo", query = "select puc from PucDO puc where puc.entidad.id = :idEntidad order by puc.codigo"),
	@NamedQuery(name = "pucDO.seleccionPorCodigoNombre", query = "select puc from PucDO puc where puc.entidad.id = :idEntidad and (lower(puc.nombre) like :parteNombre  OR lower(puc.codigo) = :parteCodigo) order by puc.codigo, puc.nombre")	
    })

public class PucDO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1298534108847282546L;
	
	public PucDO () {
		super();
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "puc_id", nullable = false, unique =true)
	private Long id;
	
	@Version 
	@Column(name="puc_version")
	private int version;
	
	@Column(name = "puc_codigo", nullable = false)
	private String codigo;
	
	@Column(name = "puc_nombre", nullable = false)
	private String nombre;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "puc_entidad_id", referencedColumnName = "entidad_id", nullable = false)
	private EntidadDO entidad;

	
	
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
		result = prime * result + ((entidad == null) ? 0 : entidad.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		PucDO other = (PucDO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (entidad == null) {
			if (other.entidad != null)
				return false;
		} else if (!entidad.equals(other.entidad))
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
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PucDO [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre
				+ ", empresa=" + entidad + "]";
	}
	
	
}
