package com.cpcoriente.sgp.springgwt.pro.server.financiero.entity;

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
import javax.persistence.Table;
import javax.persistence.Version;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ActividadDO;

@Entity
@Table(name="recurso")
@NamedQueries({
	@NamedQuery(name = "recursoDO.seleccionPorProyecto", query = "select rec from RecursoDO rec where rec.rubroPro.proyecto.id = :idProyecto order by rec.descripcion"),
	@NamedQuery(name = "recursoDO.seleccionPorActividad", query = "select rec from RecursoDO rec where rec.actividad.id = :idActividad order by rec.descripcion"),
	@NamedQuery(name = "recursoDO.seleccionPorProyectoRubro", query = "select rec from RecursoDO rec where rec.rubroPro.id = :idRubroPro order by rec.descripcion"),
	@NamedQuery(name = "recursoDO.seleccionPorProyectoDescripcion", query = "select rec from RecursoDO rec where rec.rubroPro.proyecto.id = :idProyecto AND lower(rec.descripcion) like :parteDes order by rec.descripcion")
})
public class RecursoDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9181252630499483079L;

	public RecursoDO(){
		super();
	}
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "recurso_id", nullable = false, unique = true)
	private Long id;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "recurso_actividad_id", referencedColumnName = "actividad_id", nullable = false)
	private ActividadDO actividad;

	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "recurso_rubro_id", referencedColumnName = "rubro_id", nullable = false)
	private RubroDO rubro;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "recurso_rubroProy_id", referencedColumnName = "rubro_id", nullable = false)
	private RubroProyectoDO rubroPro;
	
	@Column(name = "recurso_descripcion", nullable = false)
	private String descripcion;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "recurso")
	private Set<RecursoDetalleDO> RecDetalleSet;
	
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "recurso")
	private Set<VersionRecursoDO> versionSet;
	
	@Version
	@Column(name = "recurso_version", nullable = false)
	private int version;
	


	@Override
	public String toString() {
		return "RecursoDO [id=" + id + ", actividad=" + actividad + ", rubro="
				+ rubro + ", descripcion=" + descripcion + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((actividad == null) ? 0 : actividad.hashCode());
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((rubro == null) ? 0 : rubro.hashCode());
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
		RecursoDO other = (RecursoDO) obj;
		if (actividad == null) {
			if (other.actividad != null)
				return false;
		} else if (!actividad.equals(other.actividad))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (rubro == null) {
			if (other.rubro != null)
				return false;
		} else if (!rubro.equals(other.rubro))
			return false;
		return true;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public ActividadDO getActividad() {
		return actividad;
	}


	public void setActividad(ActividadDO actividad) {
		this.actividad = actividad;
	}


	public RubroDO getRubro() {
		return rubro;
	}


	public void setRubro(RubroDO rubro) {
		this.rubro = rubro;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public RubroProyectoDO getRubroPro() {
		return rubroPro;
	}


	public void setRubroPro(RubroProyectoDO rubroPro) {
		this.rubroPro = rubroPro;
	}


	public Set<RecursoDetalleDO> getRecDetalleSet() {
		return RecDetalleSet;
	}


	public void setRecDetalleSet(Set<RecursoDetalleDO> recDetalleSet) {
		RecDetalleSet = recDetalleSet;
	}


	public Set<VersionRecursoDO> getVersionSet() {
		return versionSet;
	}


	public void setVersionSet(Set<VersionRecursoDO> versionSet) {
		this.versionSet = versionSet;
	}


	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}

	
	
}
