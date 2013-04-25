package com.cpcoriente.sgp.springgwt.pro.server.entidad.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;



@Entity
@Table(name="terminoconvocatoria", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"terminoConv_convocatoria_id", "terminoConv_codigo"})})
@NamedQueries({
	@NamedQuery(name = "terminoDO.listarTodo", query = "select ter from TerminoConvocatoriaDO ter"),
	@NamedQuery(name = "terminoDO.seleccionPorNombre", query = "select ter from TerminoConvocatoriaDO ter where lower(ter.nombre) like :parteNombre")	
	})
public class TerminoConvocatoriaDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public TerminoConvocatoriaDO (){
		
		super();
	}

	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "terminoConv_id", nullable = false, unique = true)
	private Long id;
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "terminoConv_convocatoria_id", referencedColumnName = "convocatoria_id", nullable = false)
	private ConvocatoriaDO convocatoria;
	
	
	 @Column(name = "terminoConv_codigo", nullable = false)
	 private String codigo;
	 
	 @Column(name = "teminoConv_nombre", nullable = false)
	 private String nombre;
	 
	 @Column(name = "terminoConv_descripcion", nullable = false)
	 private String descripcion;
	 
	 
	 @Temporal (TemporalType.DATE)
	 @Column(name = "terminoConv_fechaInicio", nullable = false)
	 private Date fechaInicio;
		
	 @Temporal (TemporalType.DATE)
	 @Column(name = "terminoConv_fechaFin", nullable = false)
	 private Date fechaFin;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "terminoconvocatoria")
	private Set<VersionTerminoConvocatoriaDO> versionSet;

	@Override
	public String toString() {
		return "TerminoConvocatoriaDO [id=" + id + ", codigo=" + codigo
				+ ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result
				+ ((fechaFin == null) ? 0 : fechaFin.hashCode());
		result = prime * result
				+ ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
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
		TerminoConvocatoriaDO other = (TerminoConvocatoriaDO) obj;
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
		if (fechaFin == null) {
			if (other.fechaFin != null)
				return false;
		} else if (!fechaFin.equals(other.fechaFin))
			return false;
		if (fechaInicio == null) {
			if (other.fechaInicio != null)
				return false;
		} else if (!fechaInicio.equals(other.fechaInicio))
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ConvocatoriaDO getConvocatoria() {
		return convocatoria;
	}

	public void setConvocatoria(ConvocatoriaDO convocatoria) {
		this.convocatoria = convocatoria;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Set<VersionTerminoConvocatoriaDO> getVersionSet() {
		return versionSet;
	}

	public void setVersionSet(Set<VersionTerminoConvocatoriaDO> versionSet) {
		this.versionSet = versionSet;
	}
	 
	 
	 
}
