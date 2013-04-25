package com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto;

import java.io.Serializable;
import java.util.List;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ActividadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO;

public class RecursoTO implements Comparable<DivisionTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8202472844818604749L;

	public int compareTo(DivisionTO o) {
		
		return getId().compareTo(o.getId());

	}

	
	private Long id;
	
	private ActividadTO actividad;
	
	private RubroTO rubro;
	
	private RubroProyectoTO rubroProyecto;
	
	private String descripcion;
	
	private int version;
	
	private List<RecursoDetalleTO> recDetList;
	
	private List<VersionRecursoTO> verRecursoList;
	
	@Override
	public String toString() {
		return "RecursoTO [id=" + id + ", actividad=" + actividad + ", rubro="
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
		RecursoTO other = (RecursoTO) obj;
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

	public ActividadTO getActividad() {
		return actividad;
	}

	public void setActividad(ActividadTO actividad) {
		this.actividad = actividad;
	}

	public RubroTO getRubro() {
		return rubro;
	}

	public void setRubro(RubroTO rubro) {
		this.rubro = rubro;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	

	public RubroProyectoTO getRubroProyecto() {
		return rubroProyecto;
	}

	public void setRubroProyecto(RubroProyectoTO rubroProyecto) {
		this.rubroProyecto = rubroProyecto;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	public List<RecursoDetalleTO> getRecDetList() {
		return recDetList;
	}

	public void setRecDetList(List<RecursoDetalleTO> recDetList) {
		this.recDetList = recDetList;
	}



	public List<VersionRecursoTO> getVerRecursoList() {
		return verRecursoList;
	}



	public void setVerRecursoList(List<VersionRecursoTO> verRecursoList) {
		this.verRecursoList = verRecursoList;
	}
	
	
}
