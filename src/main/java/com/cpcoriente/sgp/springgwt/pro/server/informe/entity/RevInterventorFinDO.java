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
@Table(name="revisioninterventorfin",uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"revInterFin_usuario_id", "revInterFin_codigo"})
	    })
public class RevInterventorFinDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4877102857804586323L;

	public RevInterventorFinDO(){
		
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "revInterFin_id", nullable =  false)
	private Long id;
	
	
	@Column(name = "revInterFin_codigo", nullable = false )
	private String codigo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "revInterFin_fechaRegistro", nullable = false)
	private Date fechaRegistro;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "revInterFin_fechaEvaluacion", nullable = false)
	private Date fechaEvaluacion;
	
	
	@Column(name = "revInterFin_descripcion", nullable = false )
	private String descripcion;
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "revInterFin_usuario_id", referencedColumnName = "usuario_id", nullable = false)
	private UsuarioDO usuario;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "revisioninterventorfin")
	@OrderBy(value="id")
	private Set<RevInterventorFinDetDO> RevFinDetSet;

	
	
	@Override
	public String toString() {
		return "RevInterventorFinDO [id=" + id + ", codigo=" + codigo
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
		RevInterventorFinDO other = (RevInterventorFinDO) obj;
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

	public Set<RevInterventorFinDetDO> getRevFinDetSet() {
		return RevFinDetSet;
	}

	public void setRevFinDetSet(Set<RevInterventorFinDetDO> revFinDetSet) {
		RevFinDetSet = revFinDetSet;
	}
	
	
	
	
}
