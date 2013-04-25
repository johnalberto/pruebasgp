package com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto;

import java.io.Serializable;

import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.enumerador.TipoFuncionProyectoEnum;

public class ProyectoEntidadTO implements Comparable<ProyectoEntidadTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7904071258287039296L;

	public int compareTo(ProyectoEntidadTO o) {
		
		return getId().compareTo(o.getId());
	}

	private Long id;
	
	private EntidadTO entidad;
	
	private ProyectoTO proyecto;
	
	private TipoFuncionProyectoEnum tipoFuncion;

	
	
	
	
	@Override
	public String toString() {
		return "ProyectoPorEntidadTO [id=" + id + ", tipoFuncion="
				+ tipoFuncion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result
				+ ((tipoFuncion == null) ? 0 : tipoFuncion.hashCode());
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
		ProyectoEntidadTO other = (ProyectoEntidadTO) obj;
		if (id != other.id)
			return false;
		if (tipoFuncion != other.tipoFuncion)
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EntidadTO getEntidad() {
		return entidad;
	}

	public void setEntidad(EntidadTO entidad) {
		this.entidad = entidad;
	}

	public ProyectoTO getProyecto() {
		return proyecto;
	}

	public void setProyecto(ProyectoTO proyecto) {
		this.proyecto = proyecto;
	}

	public TipoFuncionProyectoEnum getTipoFuncion() {
		return tipoFuncion;
	}

	public void setTipoFuncion(TipoFuncionProyectoEnum tipoFuncion) {
		this.tipoFuncion = tipoFuncion;
	}
	
	

	
}
