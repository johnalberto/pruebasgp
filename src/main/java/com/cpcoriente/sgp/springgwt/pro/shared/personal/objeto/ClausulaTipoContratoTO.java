/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto;

import java.io.Serializable;

import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.enumerador.TipoContratoEnum;

/**
 * @author CPC-04
 *
 */
public class ClausulaTipoContratoTO implements Comparable<ClausulaTipoContratoTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3666113372582363917L;

	public int compareTo(ClausulaTipoContratoTO obj) {
		
		return getId().compareTo(obj.getId());
	}

	private Long id;
	
	private int version;
	
	private TipoContratoEnum tipo;
	
	private String parrafo;
	
	private EntidadTO entidad;

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
	 * @return the version
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(int version) {
		this.version = version;
	}

	/**
	 * @return the tipo
	 */
	public TipoContratoEnum getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoContratoEnum tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the parrafo
	 */
	public String getParrafo() {
		return parrafo;
	}

	/**
	 * @param parrafo the parrafo to set
	 */
	public void setParrafo(String parrafo) {
		this.parrafo = parrafo;
	}
	
	/**
	 * @return the entidad
	 */
	public EntidadTO getEntidad() {
		return entidad;
	}

	/**
	 * @param entidad the entidad to set
	 */
	public void setEntidad(EntidadTO entidad) {
		this.entidad = entidad;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((parrafo == null) ? 0 : parrafo.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		ClausulaTipoContratoTO other = (ClausulaTipoContratoTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (parrafo == null) {
			if (other.parrafo != null)
				return false;
		} else if (!parrafo.equals(other.parrafo))
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClausulaTipoContratoTO [id=" + id + ", tipo=" + tipo
				+ ", parrafo=" + parrafo + "]";
	}
		
	
	
}
