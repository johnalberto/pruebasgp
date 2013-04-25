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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



@Entity
@Table(name="cargoporpersonal" , uniqueConstraints = {
		@UniqueConstraint( columnNames = {"`cpp_cargo_id", "cpp_personal_id`"})
})


@NamedQueries({
	@NamedQuery(name = "cargoPorPersonalDO.seleccionPorProyectoEntidad", query = "select cpp from CargoPorPersonalDO cpp where cpp.cargo.proyectoEntidad.id = :idProyectoEntidad order by cpp.cargo.proyectoEntidad.id, cpp.cargo.nombre")
})

public class CargoPorPersonalDO  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -564372945414672014L;

	public CargoPorPersonalDO() {
		super();
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cpp_id", nullable = false, unique = true)
	private Long id;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "cpp_cargo_id", referencedColumnName = "cpp_id", nullable = false)
	private CargoDO cargo;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "cpp_personal_id", referencedColumnName = "personal_id", nullable = false)
	private PersonalDO persona;

	@OneToOne(optional = false, mappedBy = "cpp", fetch = FetchType.EAGER) 
	private ContratoDO contrato; 
	
	 
	 
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
	 * @return the cargo
	 */
	public CargoDO getCargo() {
		return cargo;
	}

	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(CargoDO cargo) {
		this.cargo = cargo;
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
	
	/**
	 * @return the contrato
	 */
	public ContratoDO getContrato() {
		return contrato;
	}

	/**
	 * @param contrato the contrato to set
	 */
	public void setContrato(ContratoDO contrato) {
		this.contrato = contrato;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CargoPorPersonal [id=" + id + ", cargo=" + cargo + ", persona="
				+ persona + "]";
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
		CargoPorPersonalDO other = (CargoPorPersonalDO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	


}
