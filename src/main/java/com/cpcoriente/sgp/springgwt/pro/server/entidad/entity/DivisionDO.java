package com.cpcoriente.sgp.springgwt.pro.server.entidad.entity;

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



@Entity
@Table(name="division", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"division_entidad_id","division_codigo"})})
@NamedQueries({
	@NamedQuery(name = "divisionDO.listarTodo", query = "select div from DivisionDO div"),
	@NamedQuery(name = "divisionDO.seleccionPorEntidad", query = "select div from DivisionDO div where div.entidad.id :idEntidad order by div.nombre asc"),
	@NamedQuery(name = "divisionDO.seleccionPorNombre", query = "select div from DivisionDO div where lower(div.nombre) like :divisionNombre order by div.nombre asc")
})
public class DivisionDO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DivisionDO() {
		super();
	}

	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "division_id", nullable = false, unique = true)
	private Long id;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "division_entidad_id", referencedColumnName = "entidad_id", nullable = false)
	private EntidadDO entidad;
	
	 @ManyToOne(fetch = FetchType.EAGER, optional = true)
	 @JoinColumn(name = "division_padre_id", nullable = true)
	 private DivisionDO padre;
	 
	 @Column(name = "division_codigo", nullable = false)
	 private String codigo;
	 
	 @Column(name = "division_nombre", nullable = false)
	 private String nombre;
	
	 
	 
	@Override
	public String toString() {
		return "DivisionDO [id=" + id + ", entidad=" + entidad + ", padre="
				+ padre + ", codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((entidad == null) ? 0 : entidad.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((padre == null) ? 0 : padre.hashCode());
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
		DivisionDO other = (DivisionDO) obj;
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
		if (padre == null) {
			if (other.padre != null)
				return false;
		} else if (!padre.equals(other.padre))
			return false;
		return true;
	}





	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EntidadDO getEntidad() {
		return entidad;
	}

	public void setEntidad(EntidadDO entidad) {
		this.entidad = entidad;
	}

	public DivisionDO getPadre() {
		return padre;
	}

	public void setPadre(DivisionDO padre) {
		this.padre = padre;
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

	
}
