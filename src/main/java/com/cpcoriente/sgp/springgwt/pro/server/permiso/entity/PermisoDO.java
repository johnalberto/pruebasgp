package com.cpcoriente.sgp.springgwt.pro.server.permiso.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.EmpresaDO;


@Entity
@Table(name="permiso", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"permiso_tipoUsuario", "permiso_pagina","permiso_accion"})})
public class PermisoDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PermisoDO() {
		super();
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "permiso_id", nullable = false, unique = true)
	private Long id;
	
	
	@Column(name = "permiso_pagina", nullable = false)
	private int pagina;
	
	@Column(name = "permiso_accion", nullable = false)
	private int accion;
	
	
	@Column(name = "puc_nombre", nullable = false)
	private int tipoUsuario;
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "permiso_empresa_id", referencedColumnName = "empresa_id", nullable = false)
	private EmpresaDO empresa;

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getPagina() {
		return pagina;
	}


	public void setPagina(int pagina) {
		this.pagina = pagina;
	}


	public int getAccion() {
		return accion;
	}


	public void setAccion(int accion) {
		this.accion = accion;
	}


	public int getTipoUsuario() {
		return tipoUsuario;
	}


	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}


	public EmpresaDO getEmpresa() {
		return empresa;
	}


	public void setEmpresa(EmpresaDO empresa) {
		this.empresa = empresa;
	}


	@Override
	public String toString() {
		return "PermisoDO [id=" + id + ", pagina=" + pagina + ", accion="
				+ accion + ", tipoUsuario=" + tipoUsuario + ", empresa="
				+ empresa + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accion;
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + pagina;
		result = prime * result + tipoUsuario;
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
		PermisoDO other = (PermisoDO) obj;
		if (accion != other.accion)
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (pagina != other.pagina)
			return false;
		if (tipoUsuario != other.tipoUsuario)
			return false;
		return true;
	}


	
	
}
