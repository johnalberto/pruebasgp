package com.cpcoriente.sgp.springgwt.pro.server.personal.entity;

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

import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ProyectoEntidadDO;




@Entity
@Table(name="cargo", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"cargo_proyEnt_id","cargo_codigo"})
})

@NamedQueries({
	@NamedQuery(name = "cargoDO.seleccionPorProyectoEntidad", query = "select cargo from CargoDO cargo where cargo.proyectoEntidad = :idProyectoEntidad order by cargo.nombre")
})


public class CargoDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7343228644068350719L;

	
	public CargoDO(){
		super();
	}
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cargo_id", nullable = false, unique = true)
	private Long id;
	
	@Column(name = "cargo_codigo", nullable = false)
	private String codigo;
	
	@Column(name = "cargo_nombre", nullable = false)
	private String nombre;
	
	@Column(name = "cargo_descripcion", nullable = false)
	private String descripcion;
	
	
	@Column(name = "cargo_educacion", nullable  = false, unique = false)
	private String educacion;	
	
	@Column(name = "cargo_formacion", nullable  = false, unique = false)
	private String formacion;
	
	@Column(name = "cargo_habilidades", nullable  = false, unique = false)
	private String habilidades;
	
	@Column(name = "cargo_experiencia", nullable  = false, unique = false)
	private String experiencia;
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "cargo_proyEnt_id", referencedColumnName = "proyEnt_id", nullable = false)
	private ProyectoEntidadDO proyectoEntidad;

	

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
	 * @return the educacion
	 */
	public String getEducacion() {
		return educacion;
	}


	/**
	 * @param educacion the educacion to set
	 */
	public void setEducacion(String educacion) {
		this.educacion = educacion;
	}


	/**
	 * @return the formacion
	 */
	public String getFormacion() {
		return formacion;
	}


	/**
	 * @param formacion the formacion to set
	 */
	public void setFormacion(String formacion) {
		this.formacion = formacion;
	}


	/**
	 * @return the habilidades
	 */
	public String getHabilidades() {
		return habilidades;
	}


	/**
	 * @param habilidades the habilidades to set
	 */
	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}


	/**
	 * @return the experiencia
	 */
	public String getExperiencia() {
		return experiencia;
	}


	/**
	 * @param experiencia the experiencia to set
	 */
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}


	/**
	 * @return the proyectoEntidad
	 */
	public ProyectoEntidadDO getProyectoEntidad() {
		return proyectoEntidad;
	}



	/**
	 * @param proyectoEntidad the proyectoEntidad to set
	 */
	public void setProyectoEntidad(ProyectoEntidadDO proyectoEntidad) {
		this.proyectoEntidad = proyectoEntidad;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CargoDO [id=" + id + ", codigo=" + codigo + ", nombre="
				+ nombre + ", descripcion=" + descripcion + ", educacion="
				+ educacion + ", formacion=" + formacion + ", habilidades="
				+ habilidades + ", experiencia=" + experiencia + "]";
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
				+ ((educacion == null) ? 0 : educacion.hashCode());
		result = prime * result
				+ ((experiencia == null) ? 0 : experiencia.hashCode());
		result = prime * result
				+ ((formacion == null) ? 0 : formacion.hashCode());
		result = prime * result
				+ ((habilidades == null) ? 0 : habilidades.hashCode());
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
		CargoDO other = (CargoDO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (educacion == null) {
			if (other.educacion != null)
				return false;
		} else if (!educacion.equals(other.educacion))
			return false;
		if (experiencia == null) {
			if (other.experiencia != null)
				return false;
		} else if (!experiencia.equals(other.experiencia))
			return false;
		if (formacion == null) {
			if (other.formacion != null)
				return false;
		} else if (!formacion.equals(other.formacion))
			return false;
		if (habilidades == null) {
			if (other.habilidades != null)
				return false;
		} else if (!habilidades.equals(other.habilidades))
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
