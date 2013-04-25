package com.cpcoriente.sgp.springgwt.pro.server.financiero.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ProyectoDO;


@Entity
@Table(name="rubroporproyecto")
public class RubroProyectoDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4189146047486150642L;
	
	public RubroProyectoDO(){
	
		super();
	}
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "rubroPorProyecto_id", nullable = false, unique = true)
	private Long id;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "rubroPorProyecto_rubro_id", referencedColumnName = "rubro_id", nullable = false)
	private RubroDO rubro;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "rubroPorProyecto_proyecto_id", referencedColumnName = "proyecto_id", nullable = false)
	private ProyectoDO proyecto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public RubroDO getRubro() {
		return rubro;
	}

	public void setRubro(RubroDO rubro) {
		this.rubro = rubro;
	}

	public ProyectoDO getProyecto() {
		return proyecto;
	}

	public void setProyecto(ProyectoDO proyecto) {
		this.proyecto = proyecto;
	}

	
	
	
	@Override
	public String toString() {
		return "RubroProyectoDO [id=" + id + ", rubro=" + rubro + ", proyecto="
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
		RubroProyectoDO other = (RubroProyectoDO) obj;
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


	

}
