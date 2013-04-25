package com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO;

public class RevInterventorFinTO implements Comparable<RevInterventorFinTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3680370787907224898L;

	public int compareTo(RevInterventorFinTO o) {
		
		return getId().compareTo(o.getId());

	}
	
	private Long id;
	
	private String codigo;
	
	private Date fechaRegistro;
	
	private Date fechaEvaluacion;
	
	private String descripcion;
	
	private UsuarioTO usuario;
	
	
	private List<RevInterventorFinDetTO> revIntFinDetList;
	
	

	@Override
	public String toString() {
		return "RevInterventorFinTO [id=" + id + ", codigo=" + codigo
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
		RevInterventorFinTO other = (RevInterventorFinTO) obj;
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

	public UsuarioTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioTO usuario) {
		this.usuario = usuario;
	}

	public List<RevInterventorFinDetTO> getRevIntFinDetList() {
		return revIntFinDetList;
	}

	public void setRevIntFinDetList(List<RevInterventorFinDetTO> revIntFinDetList) {
		this.revIntFinDetList = revIntFinDetList;
	}
	
	

}
