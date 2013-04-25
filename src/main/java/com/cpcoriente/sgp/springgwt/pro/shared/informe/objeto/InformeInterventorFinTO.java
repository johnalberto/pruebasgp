package com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto;

import java.io.Serializable;
import java.util.Date;

import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ActividadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO;

public class InformeInterventorFinTO implements Comparable<InformeInterventorFinTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1482130323929522317L;

	public int compareTo(InformeInterventorFinTO o) {
		
	
		return getId().compareTo(o.getId());

	}

	
	private Long id;
	
	private String codigo;
	
	private String descripcion;
	
	private UsuarioTO usuario;
	
	private ActividadTO actividad;
	
	
	private Date fechaRegistro;
	
	private Date fechaEvaluacion;
	
	private float valorPresupuesto;
	
	private float valorEjecutado;
	
	private float porEjecuicionTecnico;
	
	private float porEjecucionFinanciero;

	
	
	@Override
	public String toString() {
		return "InformeInterventorFinTO [id=" + id + ", codigo=" + codigo
				+ ", descripcion=" + descripcion + ", usuario=" + usuario
				+ ", actividad=" + actividad + ", fechaRegistro="
				+ fechaRegistro + ", fechaEvaluacion=" + fechaEvaluacion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((actividad == null) ? 0 : actividad.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result
				+ ((fechaEvaluacion == null) ? 0 : fechaEvaluacion.hashCode());
		result = prime * result
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		InformeInterventorFinTO other = (InformeInterventorFinTO) obj;
		if (actividad == null) {
			if (other.actividad != null)
				return false;
		} else if (!actividad.equals(other.actividad))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (fechaEvaluacion == null) {
			if (other.fechaEvaluacion != null)
				return false;
		} else if (!fechaEvaluacion.equals(other.fechaEvaluacion))
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
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public UsuarioTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioTO usuario) {
		this.usuario = usuario;
	}

	

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaEvaluacion() {
		return fechaEvaluacion;
	}

	public void setFechaEvaluacion(Date fechaEvaluacion) {
		this.fechaEvaluacion = fechaEvaluacion;
	}

	public float getValorPresupuesto() {
		return valorPresupuesto;
	}

	public void setValorPresupuesto(float valorPresupuesto) {
		this.valorPresupuesto = valorPresupuesto;
	}

	public float getValorEjecutado() {
		return valorEjecutado;
	}

	public void setValorEjecutado(float valorEjecutado) {
		this.valorEjecutado = valorEjecutado;
	}

	public float getPorEjecuicionTecnico() {
		return porEjecuicionTecnico;
	}

	public void setPorEjecuicionTecnico(float porEjecuicionTecnico) {
		this.porEjecuicionTecnico = porEjecuicionTecnico;
	}

	public float getPorEjecucionFinanciero() {
		return porEjecucionFinanciero;
	}

	public void setPorEjecucionFinanciero(float porEjecucionFinanciero) {
		this.porEjecucionFinanciero = porEjecucionFinanciero;
	}

	public ActividadTO getActividad() {
		return actividad;
	}

	public void setActividad(ActividadTO actividad) {
		this.actividad = actividad;
	}
	
	
	
}
