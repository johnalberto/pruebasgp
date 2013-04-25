package com.cpcoriente.sgp.springgwt.pro.server.localidad.entity;

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

/**
 * Entity implementation class for Entity: CiudadDO
 *
 */
@Entity
@Table(name="ciudad", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"ciudad_departamento_id", "ciudad_nombre"}),
	    @UniqueConstraint(columnNames = {"ciudad_departamento_id","ciudad_codigo"})})
@NamedQueries({
	@NamedQuery(name = "ciudadDO.listarTodo", query = "select ciu from CiudadDO ciu order by ciu.dpto.id, ciu.nombre"),
	@NamedQuery(name = "ciudadDO.seleccionPorNombre", query = "select ciu from CiudadDO ciu where ciu.dpto.id = :idDpto and lower(ciu.nombre) like :ciudadNombre order by ciu.nombre"),
	@NamedQuery(name = "ciudadDO.seleccionPorDpto", query = "select ciu from CiudadDO ciu where ciu.dpto.id = :idDpto order by ciu.nombre")
	})

public class CiudadDO implements Serializable {
	


	/**
	 * 
	 */
	private static final long serialVersionUID = -8141353156064332406L;


	public CiudadDO() {
		super();
	}
	

	@Id  
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ciudad_id", nullable = false, unique = true)
	private Long id;
	
	@Column(name = "ciudad_codigo", nullable = false)
	private String codigo;
	
	@Column(name = "ciudad_nombre", nullable = false)
	private String nombre;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ciudad_departamento_id", referencedColumnName = "departamento_id", nullable = false)
	private DepartamentoDO dpto;
	

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

	public String getCodigo() {
		return codigo;
	}

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
	 * @return the dpto
	 */
	public DepartamentoDO getDpto() {
		return dpto;
	}

	/**
	 * @param dpto the dpto to set
	 */
	public void setDpto(DepartamentoDO dpto) {
		this.dpto = dpto;
	}   
	  
	
	
	@Override
	public String toString() {
		return "CiudadDO [id=" + id + ", codigo=" + codigo + ", nombre="
				+ nombre + "]";
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((dpto == null) ? 0 : dpto.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		CiudadDO other = (CiudadDO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (dpto == null) {
			if (other.dpto != null)
				return false;
		} else if (!dpto.equals(other.dpto))
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
	
	

}
