package com.cpcoriente.sgp.springgwt.pro.server.financiero.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="unidad")
@NamedQueries({
	@NamedQuery(name = "unidadDO.listarTodo", query = "select uni from UnidadDO uni order by uni.nombre")})
public class UnidadDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4186662062433852525L;
	
	public UnidadDO(){
		super();
	}

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "unidad_id", nullable = false, unique = true)
	private Long id;
	
	@Column(name = "unidad_nombre", nullable = false)
	private String nombre;
	
	@Column(name = "unidad_abrev", nullable = false)
	private String abreviatura;
	
	@Column(name = "unidad_tipo", nullable = false)
	private int tipo;

	
	
	@Override
	public String toString() {
		return "UnidadDO [id=" + id + ", nombre=" + nombre + ", abreviatura="
				+ abreviatura + ", tipo=" + tipo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((abreviatura == null) ? 0 : abreviatura.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		UnidadDO other = (UnidadDO) obj;
		if (abreviatura == null) {
			if (other.abreviatura != null)
				return false;
		} else if (!abreviatura.equals(other.abreviatura))
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
		if (tipo != other.tipo)
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	
}
