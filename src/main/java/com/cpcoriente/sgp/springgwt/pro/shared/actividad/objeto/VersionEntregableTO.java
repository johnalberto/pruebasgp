package com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto;

import java.io.Serializable;
import java.util.Date;

import com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador.EstadoEntregableEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador.TipoEntregableEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador.TipoResultadoEntregaEnum;

public class VersionEntregableTO implements Comparable<VersionEntregableTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3577943639956817630L;

	public int compareTo(VersionEntregableTO o) {
		
		return getId().compareTo(o.getId());

	}

	
	private Long id;
		
	private Date fechaRegistro;
	
	private String observacion;
	
	private String codigo;
	
	private String nombre;
	
	private TipoEntregableEnum tipo;
	
	private Date fechaEntrega;
	
	private TipoResultadoEntregaEnum resultadoDe;
	
	private EstadoEntregableEnum estado;
	
	private EntregableTO entregable;
	

	

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
	 * @return the fechaRegistro
	 */
	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	/**
	 * @param fechaRegistro the fechaRegistro to set
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	/**
	 * @return the observacion
	 */
	public String getObservacion() {
		return observacion;
	}

	/**
	 * @param observacion the observacion to set
	 */
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	 * @return the tipo
	 */
	public TipoEntregableEnum getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoEntregableEnum tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the fechaEntrega
	 */
	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	/**
	 * @param fechaEntrega the fechaEntrega to set
	 */
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	/**
	 * @return the resultadoDe
	 */
	public TipoResultadoEntregaEnum getResultadoDe() {
		return resultadoDe;
	}

	/**
	 * @param resultadoDe the resultadoDe to set
	 */
	public void setResultadoDe(TipoResultadoEntregaEnum resultadoDe) {
		this.resultadoDe = resultadoDe;
	}

	/**
	 * @return the estado
	 */
	public EstadoEntregableEnum getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(EstadoEntregableEnum estado) {
		this.estado = estado;
	}

	/**
	 * @return the entregable
	 */
	public EntregableTO getEntregable() {
		return entregable;
	}

	/**
	 * @param entregable the entregable to set
	 */
	public void setEntregable(EntregableTO entregable) {
		this.entregable = entregable;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result
				+ ((fechaEntrega == null) ? 0 : fechaEntrega.hashCode());
		result = prime * result
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((observacion == null) ? 0 : observacion.hashCode());
		result = prime * result
				+ ((resultadoDe == null) ? 0 : resultadoDe.hashCode());
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
		VersionEntregableTO other = (VersionEntregableTO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (estado != other.estado)
			return false;
		if (fechaEntrega == null) {
			if (other.fechaEntrega != null)
				return false;
		} else if (!fechaEntrega.equals(other.fechaEntrega))
			return false;
		if (fechaRegistro == null) {
			if (other.fechaRegistro != null)
				return false;
		} else if (!fechaRegistro.equals(other.fechaRegistro))
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
		if (observacion == null) {
			if (other.observacion != null)
				return false;
		} else if (!observacion.equals(other.observacion))
			return false;
		if (resultadoDe != other.resultadoDe)
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
		return "VersionEntregableTO [id=" + id + ", fechaRegistro="
				+ fechaRegistro + ", observacion=" + observacion + ", codigo="
				+ codigo + ", nombre=" + nombre + ", tipo=" + tipo
				+ ", fechaEntrega=" + fechaEntrega + ", resultadoDe="
				+ resultadoDe + ", estado=" + estado + "]";
	}
		
	

}
