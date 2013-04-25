/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto;

import java.io.Serializable;
import java.util.Date;

import com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.AccionEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.PaginaEnum;

/**
 * @author CPC-04
 *
 */
public class LogUsuarioTO implements Comparable<LogUsuarioTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2653056006582245341L;

	public int compareTo(LogUsuarioTO obj) {
		
		return getId().compareTo(obj.getId());
	}
	
	
	private Long id;

	private Date fecha;

	private String observacion;

	private String ip;

	private UsuarioTO usuario;

	private PaginaEnum pagina;

	private AccionEnum accion;
	
	

	
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
	public UsuarioTO getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(UsuarioTO usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the pagina
	 */
	public PaginaEnum getPagina() {
		return pagina;
	}

	/**
	 * @param pagina the pagina to set
	 */
	public void setPagina(PaginaEnum pagina) {
		this.pagina = pagina;
	}

	/**
	 * @return the accion
	 */
	public AccionEnum getAccion() {
		return accion;
	}

	/**
	 * @param accion the accion to set
	 */
	public void setAccion(AccionEnum accion) {
		this.accion = accion;
	}

	

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accion == null) ? 0 : accion.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ip == null) ? 0 : ip.hashCode());
		result = prime * result
				+ ((observacion == null) ? 0 : observacion.hashCode());
		result = prime * result + ((pagina == null) ? 0 : pagina.hashCode());
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
		LogUsuarioTO other = (LogUsuarioTO) obj;
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
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LogUsuarioTO [id=" + id + ", fecha=" + fecha + ", observacion="
				+ observacion + ", ip=" + ip + ", pagina=" + pagina
				+ ", accion=" + accion + "]";
	}
	


}
