package com.cpcoriente.sgp.springgwt.pro.server.actividad.entity;

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

import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.PersonalDO;
@Entity
@Table(name="actividadporpersonal" , uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"actPorEjec_personal_id","actPorEjec_actividad_id"})})

@NamedQueries({
	@NamedQuery(name = "actividadPorPersonalDO.listarTodoPorProducto", query = "select ap from ActividadPorPersonalDO ap where ap.actividad.producto.id = :idProducto order by ap.actividad.id, ap.persona.nombre"),
	@NamedQuery(name = "actividadPorPersonalDO.seleccionPorPersona", query = "select ap from ActividadPorPersonalDO ap where ap.actividad.producto.objetivo.proyecto.id = :idProyecto and (lower(ap.persona.nombre) like :parteNombre  OR lower(ap.persona.numDoc) = :parteNumDoc) order by ap.actividad.id, ap.persona.nombre"),
	
})


public class ActividadPorPersonalDO implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7234028727198175015L;
	
	public ActividadPorPersonalDO() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "actPorEjec_id", nullable = false, unique = true)
	private Long id;
		
	@Column(name = "actPorEjec_porcenAvance", nullable = false)
	private float porcenAvance;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "actPorEjec_actividad_id", referencedColumnName = "actividad_id", nullable = false)
	private ActividadDO actividad;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "actPorEjec_personal_id", referencedColumnName = "personal_id", nullable = false)
	private PersonalDO persona;


	
	
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
	 * @return the porcenAvance
	 */
	public float getPorcenAvance() {
		return porcenAvance;
	}

	/**
	 * @param porcenAvance the porcenAvance to set
	 */
	public void setPorcenAvance(float porcenAvance) {
		this.porcenAvance = porcenAvance;
	}

	/**
	 * @return the actividad
	 */
	public ActividadDO getActividad() {
		return actividad;
	}

	/**
	 * @param actividad the actividad to set
	 */
	public void setActividad(ActividadDO actividad) {
		this.actividad = actividad;
	}

	/**
	 * @return the persona
	 */
	public PersonalDO getPersona() {
		return persona;
	}

	/**
	 * @param persona the persona to set
	 */
	public void setPersona(PersonalDO persona) {
		this.persona = persona;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ActividadPorPersonalDO [id=" + id 
				+ ", porcenAvance=" + porcenAvance + ", actividad=" + actividad
				+ ", persona=" + persona + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		ActividadPorPersonalDO other = (ActividadPorPersonalDO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
