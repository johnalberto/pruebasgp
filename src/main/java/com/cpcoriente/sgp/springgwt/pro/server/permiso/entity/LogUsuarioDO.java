/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.permiso.entity;

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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * @author CPC-04
 *
 */


@Entity
@Table(name = "logusuario")
@NamedQueries({
	@NamedQuery(name = "logUsuarioDO.listarUltimoLogUsuario", query = "select log from LogUsuarioDO log where log.usuario.empresa.id = :idEmpresa and log.usuario.username = :userName order by log.usuario.empresa.id, log.fecha desc")})
public class LogUsuarioDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1063112289189897622L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="log_id", nullable = false, unique = true)
	private Long id;

	@Temporal (TemporalType.TIMESTAMP)
	@Column(name = "log_fecha", nullable = false)
	private Date fecha;

	@Column(name = "log_observacion", nullable = true)
	private String observacion;

	@Column(name = "log_ip", nullable = false)
	private String ip;

	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "log_usuario_id", referencedColumnName = "usuario_id", nullable = false)
	private UsuarioDO usuario;

	@Column(name = "log_pagina", nullable = false)
	private int pagina;

	@Column(name = "log_accion", nullable = false)
	private int accion;

	
	
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
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * @return the usuario
	 */
	public UsuarioDO getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(UsuarioDO usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the pagina
	 */
	public int getPagina() {
		return pagina;
	}

	/**
	 * @param pagina the pagina to set
	 */
	public void setPagina(int pagina) {
		this.pagina = pagina;
	}

	/**
	 * @return the accion
	 */
	public int getAccion() {
		return accion;
	}

	/**
	 * @param accion the accion to set
	 */
	public void setAccion(int accion) {
		this.accion = accion;
	}

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accion;
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ip == null) ? 0 : ip.hashCode());
		result = prime * result
				+ ((observacion == null) ? 0 : observacion.hashCode());
		result = prime * result + pagina;
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		LogUsuarioDO other = (LogUsuarioDO) obj;
		if (accion != other.accion)
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (ip == null) {
			if (other.ip != null)
				return false;
		} else if (!ip.equals(other.ip))
			return false;
		if (observacion == null) {
			if (other.observacion != null)
				return false;
		} else if (!observacion.equals(other.observacion))
			return false;
		if (pagina != other.pagina)
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LogUsuarioDO [id=" + id + ", fecha=" + fecha + ", observacion="
				+ observacion + ", ip=" + ip + ", usuario=" + usuario
				+ ", pagina=" + pagina + ", accion=" + accion + "]";
	}



}
