package com.cpcoriente.sgp.springgwt.pro.server.localidad.entity;

import java.io.Serializable;
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
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Entity implementation class for Entity: DepartamentoDO
 *
 */
@Entity
@Table(name="departamento", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"departamento_pais_id", "departamento_nombre"}),
	    @UniqueConstraint(columnNames = {"departamento_pais_id", "departamento_codigo"})})

@NamedQueries({
	@NamedQuery(name = "dptoDO.listarTodo", query = "select dpto from DepartamentoDO dpto order by dpto.pais.id, dpto.nombre"),
	@NamedQuery(name = "dptoDO.seleccionPorNombre", query = "select dpto from DepartamentoDO dpto where dpto.pais.id = :idPais and lower(dpto.nombre) like :dptoNombre order by dpto.nombre"),
	@NamedQuery(name = "dptoDO.seleccionPorPais", query = "select dpto from DepartamentoDO dpto where dpto.pais.id = :idPais order by dpto.nombre")
	})

public class DepartamentoDO implements Serializable {



	/**
	 * 
	 */
	private static final long serialVersionUID = 7650964053258725875L;





	public DepartamentoDO() {
		super();
	} 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "departamento_id", nullable = false)
	private Long id;
	
	@Column(name = "departamento_codigo", nullable = false)
	private String codigo;
	
	@Column(name = "departamento_nombre", nullable = false)
	private String nombre;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "departamento_pais_id", referencedColumnName = "pais_id", nullable = false)
	private PaisDO pais;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "dpto")
	@OrderBy(value="nombre") 
	private Set<CiudadDO> ciudadSet;
	
  



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
	 * @return the pais
	 */
	public PaisDO getPais() {
		return pais;
	}



	/**
	 * @param pais the pais to set
	 */
	public void setPais(PaisDO pais) {
		this.pais = pais;
	}



	/**
	 * @return the ciudadSet
	 */
	public Set<CiudadDO> getCiudadSet() {
		return ciudadSet;
	}

	/**
	 * @param ciudadSet the ciudadSet to set
	 */
	public void setCiudadSet(Set<CiudadDO> ciudadSet) {
		this.ciudadSet = ciudadSet;
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
		DepartamentoDO other = (DepartamentoDO) obj;
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



	@Override
	public String toString() {
		return "DepartamentoDO [id=" + id + ", codigo=" + codigo + ", nombre="
				+ nombre + "]";
	}

	
   
}
