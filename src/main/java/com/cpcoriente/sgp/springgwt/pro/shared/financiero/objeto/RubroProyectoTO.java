package com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto;

import java.io.Serializable;

import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.ProyectoTO;

public class RubroProyectoTO implements Comparable<RubroProyectoTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4373380406477508788L;

	public int compareTo(RubroProyectoTO o) {
	
		return getId().compareTo(o.getId());

	}
	
	private Long id;
	
	private RubroTO rubro;
	
	private ProyectoTO proyecto;

	
	
	
	@Override
	public String toString() {
		return "RubroProyectoTO [id=" + id + ", rubro=" + rubro + ", proyecto="
				+ proyecto + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((proyecto == null) ? 0 : proyecto.hashCode());
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
		RubroProyectoTO other = (RubroProyectoTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (proyecto == null) {
			if (other.proyecto != null)
				return false;
		} else if (!proyecto.equals(other.proyecto))
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

	public RubroTO getRubro() {
		return rubro;
	}

	public void setRubro(RubroTO rubro) {
		this.rubro = rubro;
	}

	public ProyectoTO getProyecto() {
		return proyecto;
	}

	public void setProyecto(ProyectoTO proyecto) {
		this.proyecto = proyecto;
	}
	
	

}
