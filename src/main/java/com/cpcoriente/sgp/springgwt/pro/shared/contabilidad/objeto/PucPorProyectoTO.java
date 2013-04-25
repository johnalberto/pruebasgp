/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto;

import java.io.Serializable;

import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.ProyectoTO;

/**
 * @author CPC-04
 *
 */
public class PucPorProyectoTO implements Comparable<PucPorProyectoTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5180062807726837452L;

	
	public int compareTo(PucPorProyectoTO obj) {
		
		return getId().compareTo(obj.getId());
	}

	
	private Long id;
	
	private PucTO cuentaPuc;
	
	private ProyectoTO proyecto;
	
	private ImpuestoTO impuesto;

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
	 * @return the cuentaPuc
	 */
	public PucTO getCuentaPuc() {
		return cuentaPuc;
	}

	/**
	 * @param cuentaPuc the cuentaPuc to set
	 */
	public void setCuentaPuc(PucTO cuentaPuc) {
		this.cuentaPuc = cuentaPuc;
	}

	/**
	 * @return the proyecto
	 */
	public ProyectoTO getProyecto() {
		return proyecto;
	}

	/**
	 * @param proyecto the proyecto to set
	 */
	public void setProyecto(ProyectoTO proyecto) {
		this.proyecto = proyecto;
	}

	/**
	 * @return the impuesto
	 */
	public ImpuestoTO getImpuesto() {
		return impuesto;
	}

	/**
	 * @param impuesto the impuesto to set
	 */
	public void setImpuesto(ImpuestoTO impuesto) {
		this.impuesto = impuesto;
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
		PucPorProyectoTO other = (PucPorProyectoTO) obj;
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
		return "PucPorProyectoTO [id=" + id + "]";
	}
	
	
	
}
