package com.cpcoriente.sgp.springgwt.pro.server.personal.entity;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ActividadPorPersonalDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InformeDO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioProyectoEntidadDO;

@Entity
@Table(name="personal")

public class PersonalDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5752705374692627666L;
	
	public PersonalDO(){
		super();
	}
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "personal_id", nullable = false, unique = true)
	private Long id;

	
	@Column(name = "personal_activo", nullable = false)
	private boolean activo;
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "personal_usuproyentidad_id", referencedColumnName = "usuproyentidad_id", nullable = false)
	private UsuarioProyectoEntidadDO usuarioProyecto;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "persona")
	private Set<CargoPorPersonalDO> cppSet;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "persona")
	private Set<InformeDO> informeSet;

	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "personal")
	private Set<ActividadPorPersonalDO> actividadPorPersonalSet;
	
	
//	@OneToMany(fetch = FetchType.EAGER, mappedBy = "personal")
//	private Set<CargoPorPersonalDO> cargoPorPersonalSet;
	

	@Override
	public String toString() {
		return "PersonaDO [id=" + id + ", activo=" + activo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (activo ? 1231 : 1237);
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		PersonalDO other = (PersonalDO) obj;
		if (activo != other.activo)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	public UsuarioProyectoEntidadDO getUsuarioProyecto() {
		return usuarioProyecto;
	}

	public void setUsuarioProyecto(UsuarioProyectoEntidadDO usuarioProyecto) {
		this.usuarioProyecto = usuarioProyecto;
	}

	/**
	 * @return the cppSet
	 */
	public Set<CargoPorPersonalDO> getCppSet() {
		return cppSet;
	}

	/**
	 * @param cppSet the cpp to set
	 */
	public void setCppSet(Set<CargoPorPersonalDO> cppSet) {
		this.cppSet = cppSet;
	}

	/**
	 * @return the informeSet
	 */
	public Set<InformeDO> getInformeSet() {
		return informeSet;
	}

	/**
	 * @param informeSet the informeSet to set
	 */
	public void setInformeSet(Set<InformeDO> informeSet) {
		this.informeSet = informeSet;
	}

	/**
	 * @return the actividadPorPersonalSet
	 */
	public Set<ActividadPorPersonalDO> getActividadPorPersonalSet() {
		return actividadPorPersonalSet;
	}

	/**
	 * @param actividadPorPersonalSet the actividadPorPersonalSet to set
	 */
	public void setActividadPorPersonalSet(
			Set<ActividadPorPersonalDO> actividadPorPersonalSet) {
		this.actividadPorPersonalSet = actividadPorPersonalSet;
	}

//	/**
//	 * @return the cargoPorPersonalSet
//	 */
//	public Set<CargoPorPersonalDO> getCargoPorPersonalSet() {
//		return cargoPorPersonalSet;
//	}
//
//	/**
//	 * @param cargoPorPersonalSet the cargoPorPersonalSet to set
//	 */
//	public void setCargoPorPersonalSet(Set<CargoPorPersonalDO> cargoPorPersonalSet) {
//		this.cargoPorPersonalSet = cargoPorPersonalSet;
//	}

	
	
}
