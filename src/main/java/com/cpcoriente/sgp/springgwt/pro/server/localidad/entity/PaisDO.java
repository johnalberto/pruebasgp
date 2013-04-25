package com.cpcoriente.sgp.springgwt.pro.server.localidad.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;



/**
 * Entity implementation class for Entity: 
 *
 */
@Entity()
@Table(name="pais")
@NamedQueries({
	@NamedQuery(name = "paisDO.listarTodo", query = "select pais from PaisDO pais order by pais.nombre"),
	@NamedQuery(name = "paisDO.seleccionPorNombre", query = "select pais from PaisDO pais where lower(pais.nombre) like :paisNombre order by pais.nombre")
	})
public class PaisDO implements Serializable {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = -1894789782602665734L;



	public PaisDO() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pais_id", nullable = false, unique = true)
	private Long id;
	
	
	@Column(name = "pais_codigo", nullable = false, unique = true)
	private String codigo;
	
	@Column(name = "pais_nombre", nullable = false, unique =true)
	private String nombre;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "pais")
	@OrderBy(value="nombre") 
	private Set<DepartamentoDO> dptoSet;
	


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
	 * 
	 * @return
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * 
	 * @param codigo
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
	 * @return the dptoSet
	 */
	public Set<DepartamentoDO> getDptoSet() {
		return dptoSet;
	}

	/**
	 * @param dptoSet the dptoSet to set
	 */
	public void setDptoSet(Set<DepartamentoDO> dptoSet) {
		this.dptoSet = dptoSet;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((dptoSet == null) ? 0 : dptoSet.hashCode());
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
		PaisDO other = (PaisDO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (dptoSet == null) {
			if (other.dptoSet != null)
				return false;
		} else if (!dptoSet.equals(other.dptoSet))
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

	@Override
	public String toString() {
		return "PaisDO [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre
				+ "]";
	}

	
}

