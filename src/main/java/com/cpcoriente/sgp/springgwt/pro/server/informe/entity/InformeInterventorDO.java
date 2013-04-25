package com.cpcoriente.sgp.springgwt.pro.server.informe.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioDO;


@Entity
@Table(name="informeinterventor",uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"infoInter_usuario_id", "infoInter_codigo"})
	    })
public class InformeInterventorDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -598658298498500236L;
	
	public InformeInterventorDO(){
		
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "infoInter_id", nullable =  false)
	private Long id;
	
	@Column(name = "infoInter_codigo", nullable = false )
	private String codigo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "infoInter_fechaRegistro", nullable = false)
	private Date fechaRegistro;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "infoInter_fechaEvaluacion", nullable = false)
	private Date fechaEvaluacion;
	
	@Column(name = "infoInter_descripcion", nullable = false )
	private String descripcion;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "infoInter_usuario_id", referencedColumnName = "usuario_id", nullable = false)
	private UsuarioDO usuario;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "infoInter")
	@OrderBy(value="id")
	private Set<InfoInterProductoDetalleDO> infoInterProductoDetalleSet;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "infoInter")
	@OrderBy(value="id")
	private Set<InfoInterEntregableDetalleDO> infoInterEntregableDetalleSet;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "infoInter")
	@OrderBy(value="id")
	private Set<InfoInterActividadDetalleDO> infoInterActividadDetalleSet;

	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "infoInter")
	@OrderBy(value="id")
	private Set<InfoInterObjetivoDetalleDO> infoInterObjetivoDetalleSet;
	
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

		
	/**
	 * @return the infoInterProductoDetalleSet
	 */
	public Set<InfoInterProductoDetalleDO> getInfoInterProductoDetalleSet() {
		return infoInterProductoDetalleSet;
	}

	/**
	 * @param infoInterProductoDetalleSet the infoInterProductoDetalleSet to set
	 */
	public void setInfoInterProductoDetalleSet(
			Set<InfoInterProductoDetalleDO> infoInterProductoDetalleSet) {
		this.infoInterProductoDetalleSet = infoInterProductoDetalleSet;
	}

	/**
	 * @return the infoInterEntregableDetalleSet
	 */
	public Set<InfoInterEntregableDetalleDO> getInfoInterEntregableDetalleSet() {
		return infoInterEntregableDetalleSet;
	}

	/**
	 * @param infoInterEntregableDetalleSet the infoInterEntregableDetalleSet to set
	 */
	public void setInfoInterEntregableDetalleSet(
			Set<InfoInterEntregableDetalleDO> infoInterEntregableDetalleSet) {
		this.infoInterEntregableDetalleSet = infoInterEntregableDetalleSet;
	}

	@Override
	public String toString() {
		return "InformeInterventorDO [id=" + id + ", codigo=" + codigo
				+ ", fechaRegistro=" + fechaRegistro + ", fechaEvaluacion="
				+ fechaEvaluacion + ", descripcion=" + descripcion + "]";
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
		InformeInterventorDO other = (InformeInterventorDO) obj;
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
		return true;
	}

	public Set<InfoInterActividadDetalleDO> getInfoInterActividadDetalleSet() {
		return infoInterActividadDetalleSet;
	}

	public void setInfoInterActividadDetalleSet(
			Set<InfoInterActividadDetalleDO> infoInterActividadDetalleSet) {
		this.infoInterActividadDetalleSet = infoInterActividadDetalleSet;
	}

	public Set<InfoInterObjetivoDetalleDO> getInfoInterObjetivoDetalleSet() {
		return infoInterObjetivoDetalleSet;
	}

	public void setInfoInterObjetivoDetalleSet(
			Set<InfoInterObjetivoDetalleDO> infoInterObjetivoDetalleSet) {
		this.infoInterObjetivoDetalleSet = infoInterObjetivoDetalleSet;
	}

	
	
	

}
