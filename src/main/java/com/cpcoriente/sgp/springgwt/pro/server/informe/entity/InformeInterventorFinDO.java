package com.cpcoriente.sgp.springgwt.pro.server.informe.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ActividadDO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioDO;


@Entity
@Table(name="informeinterventorfin")
public class InformeInterventorFinDO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5409192093181752647L;

	
	public InformeInterventorFinDO(){
		
		super();
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "infoInterFin_id", nullable =  false)
	private Long id;
	
	@Column(name = "infoInterFin_codigo", nullable = false )
	private String codigo;
	
	
	@Column(name = "infoInterFin_descripcion", nullable = false )
	private String descripcion;
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "infoInter_usuario_id", referencedColumnName = "usuario_id", nullable = false)
	private UsuarioDO usuario;
	

	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "infoInterFin_actividad_id", referencedColumnName = "actividad_id", nullable = false)
	private ActividadDO actividad;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "infoInterFin_fechaRegistro", nullable = false)
	private Date fechaRegistro;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "infoInterFin_fechaEvaluacion", nullable = false)
	private Date fechaEvaluacion;
	
	
	@Column(name = "infoInterFin_prepto", nullable = false)
	private float valorPresupuesto;
	
	@Column(name = "infoInterFin_preptoEjec", nullable = false)
	private float valorEjecutado;
	
	@Column(name = "infoInterFin_interTec_calif", nullable = false)
	private float porcenEjecuTecnico;

	@Column(name = "infoInterFin_interFin_calif", nullable = false)
	private float porcenEjecuFinanciero;

	
	@Override
	public String toString() {
		return "InformeInterventorFinDO [id=" + id + ", codigo=" + codigo
				+ ", descripcion=" + descripcion + ", usuario=" + usuario
				+ ", fechaRegistro=" + fechaRegistro + ", fechaEvaluacion="
				+ fechaEvaluacion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		InformeInterventorFinDO other = (InformeInterventorFinDO) obj;
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

	public UsuarioDO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDO usuario) {
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

	public float getPorcenEjecuTecnico() {
		return porcenEjecuTecnico;
	}

	public void setPorcenEjecuTecnico(float porcenEjecuTecnico) {
		this.porcenEjecuTecnico = porcenEjecuTecnico;
	}

	public float getPorcenEjecuFinanciero() {
		return porcenEjecuFinanciero;
	}

	public void setPorcenEjecuFinanciero(float porcenEjecuFinanciero) {
		this.porcenEjecuFinanciero = porcenEjecuFinanciero;
	}

	public ActividadDO getActividad() {
		return actividad;
	}

	public void setActividad(ActividadDO actividad) {
		this.actividad = actividad;
	}
	
	
	
	
}
