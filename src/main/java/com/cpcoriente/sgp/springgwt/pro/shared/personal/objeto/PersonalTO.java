package com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto;

import java.io.Serializable;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ActividadPorPersonalTO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InformeTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioProyectoEntidadTO;


public class PersonalTO implements Comparable<PersonalTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6011691072207787139L;

	

	private Long id;
	
	private UsuarioProyectoEntidadTO usuarioProyecto;
	
	private boolean activo;
	
	private List<CargoPorPersonalTO> cppLista;

	private List<InformeTO> informeLista;
		
	private List<ActividadPorPersonalTO> actividadPorPersonalLista;
	
//	private List<CargoPorPersonalTO> cargoPorPersonalLista;


	public int compareTo(PersonalTO o) {
		
		return getId().compareTo(o.getId());

	}



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
	 * @return the usuarioProyecto
	 */
	public UsuarioProyectoEntidadTO getUsuarioProyecto() {
		return usuarioProyecto;
	}



	/**
	 * @param usuarioProyecto the usuarioProyecto to set
	 */
	public void setUsuarioProyecto(UsuarioProyectoEntidadTO usuarioProyecto) {
		this.usuarioProyecto = usuarioProyecto;
	}



	/**
	 * @return the activo
	 */
	public boolean isActivo() {
		return activo;
	}



	/**
	 * @param activo the activo to set
	 */
	public void setActivo(boolean activo) {
		this.activo = activo;
	}



	/**
	 * @return the cppLista
	 */
	public List<CargoPorPersonalTO> getCppLista() {
		return cppLista;
	}



	/**
	 * @param cppLista the cppLista to set
	 */
	public void setCppLista(List<CargoPorPersonalTO> cppLista) {
		this.cppLista = cppLista;
	}



	/**
	 * @return the informeLista
	 */
	public List<InformeTO> getInformeLista() {
		return informeLista;
	}



	/**
	 * @param informeLista the informeLista to set
	 */
	public void setInformeLista(List<InformeTO> informeLista) {
		this.informeLista = informeLista;
	}



	/**
	 * @return the actividadPorPersonalLista
	 */
	public List<ActividadPorPersonalTO> getActividadPorPersonalLista() {
		return actividadPorPersonalLista;
	}



	/**
	 * @param actividadPorPersonalLista the actividadPorPersonalLista to set
	 */
	public void setActividadPorPersonalLista(
			List<ActividadPorPersonalTO> actividadPorPersonalLista) {
		this.actividadPorPersonalLista = actividadPorPersonalLista;
	}



//	/**
//	 * @return the cargoPorPersonalLista
//	 */
//	public List<CargoPorPersonalTO> getCargoPorPersonalLista() {
//		return cargoPorPersonalLista;
//	}
//
//
//
//	/**
//	 * @param cargoPorPersonalLista the cargoPorPersonalLista to set
//	 */
//	public void setCargoPorPersonalLista(
//			List<CargoPorPersonalTO> cargoPorPersonalLista) {
//		this.cargoPorPersonalLista = cargoPorPersonalLista;
//	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (activo ? 1231 : 1237);
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
		PersonalTO other = (PersonalTO) obj;
		if (activo != other.activo)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PersonalTO [id=" + id + ", activo=" + activo + "]";
	}
	
	
}
