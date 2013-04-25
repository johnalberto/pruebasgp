package com.cpcoriente.sgp.springgwt.pro.shared.parametro.objeto;

import java.io.Serializable;
import java.util.Date;

import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EmpresaTO;

public class ParametroGeneralTO implements Comparable<ParametroGeneralTO>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1855414287476497086L;

	public int compareTo(ParametroGeneralTO obj) {

		return getId().compareTo(obj.getId());

	}
	
	
	private String id;
	
	private String descripcion;
	
	private String valor;
	
	private Date fechaModificacion;
	
	private EmpresaTO empresa;
	

	
	
	
	
	@Override
	public String toString() {
		return "ParametroTO [id=" + id + ", descripcion=" + descripcion
				+ ", valor=" + valor + ", fechaModificacion="
				+ fechaModificacion + "]";
	}

	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime
				* result
				+ ((fechaModificacion == null) ? 0 : fechaModificacion
						.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
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
		ParametroGeneralTO other = (ParametroGeneralTO) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (fechaModificacion == null) {
			if (other.fechaModificacion != null)
				return false;
		} else if (!fechaModificacion.equals(other.fechaModificacion))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}




	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
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
	
	

}
