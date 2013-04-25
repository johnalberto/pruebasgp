/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto;

import java.io.Serializable;

import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.enumerador.TipoOperacionImpuestoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EmpresaTO;

/**
 * @author CPC-04
 *
 */
public class ImpuestoTO implements Comparable<ImpuestoTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5668079769217664852L;

	public int compareTo(ImpuestoTO obj) {
		
		return getId().compareTo(obj.getId());
	}
	
	
	private Long id;

	private String nombre;

	private String descripcion;

	private TipoOperacionImpuestoEnum tipo;
	
	private Float porcenCobro;

	private EmpresaTO empresa;

	
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the tipo
	 */
	public TipoOperacionImpuestoEnum getTipo() {
		return tipo;
	}

	/**
	 * @return the porcenCobro
	 */
	public Float getPorcenCobro() {
		return porcenCobro;
	}

	/**
	 * @param porcenCobro the porcenCobro to set
	 */
	public void setPorcenCobro(Float porcenCobro) {
		this.porcenCobro = porcenCobro;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoOperacionImpuestoEnum tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the empresa
	 */
	public EmpresaTO getEmpresa() {
		return empresa;
	}

	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(EmpresaTO empresa) {
		this.empresa = empresa;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((porcenCobro == null) ? 0 : porcenCobro.hashCode());
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
		ImpuestoTO other = (ImpuestoTO) obj;
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
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (porcenCobro == null) {
			if (other.porcenCobro != null)
				return false;
		} else if (!porcenCobro.equals(other.porcenCobro))
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
		return "ImpuestoTO [id=" + id + ", nombre=" + nombre + ", descripcion="
				+ descripcion + ", tipo=" + tipo + ", porcenCobro="
				+ porcenCobro + "]";
	}
	
	
	

}
