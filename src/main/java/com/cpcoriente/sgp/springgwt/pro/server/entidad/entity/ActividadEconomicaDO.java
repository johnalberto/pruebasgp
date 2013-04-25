package com.cpcoriente.sgp.springgwt.pro.server.entidad.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="actividadeconomica", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"actEco_codigo"}),
	    @UniqueConstraint(columnNames = {"actEco_nombre"})})
@NamedQueries({
	@NamedQuery(name = "actEco.listarTodo", query = "select act from ActividadEconomicaDO act"),
	@NamedQuery(name = "actEco.seleccionPorNombre", query = "select act from ActividadEnonomicaDO act where lower(act.nombre) like :actividadNombre order by act.nombre asc")
	})
public class ActividadEconomicaDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public ActividadEconomicaDO(){
		super();
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "actEco_id", nullable = false, unique = true)
	private Long id;
	
	@Column(name = "actEco_codigo", nullable = false)
	private String codigo;
	
	
	@Column(name = "actEco_nombre", nullable = false)
	private String nombre;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "ActividadEnonomicaDO [id=" + id + ", codigo=" + codigo
				+ ", nombre=" + nombre + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		ActividadEconomicaDO other = (ActividadEconomicaDO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
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
