package com.cpcoriente.sgp.springgwt.pro.server.entidad.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="empresa", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"empresa_nombre"}),
	    @UniqueConstraint(columnNames = {"empresa_nombre","empresa_nit"}),
	    @UniqueConstraint(columnNames = {"empresa_username"})})
@NamedQueries({
	@NamedQuery(name = "empresaDO.listarTodo" , query = "select emp from EmpresaDO emp order by emp.nombre")})
public class EmpresaDO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4779980071773636563L;
	
	public EmpresaDO(){
		
		super();
	}
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "empresa_id", nullable = false, unique = true)
	private Long id;


	@Column(name = "empresa_nombre", nullable = false)
	private String nombre;
	
	
	
	@Column(name = "empresa_nit", nullable = false)
	private String nit;
	
	
	@Column(name = "empresa_mision", nullable = false)
	private String mision;
	
	
	@Column(name = "empresa_vision", nullable = false)
	private String vision;
	
	
	@Column(name = "empresa_username", nullable = false)
	private String username;
	
	
	@Column(name = "empresa_password", nullable = false)
	private String password;
	
	
	
	
	
	
	@Override
	public String toString() {
		return "EmpresaDO [id=" + id + ", nombre=" + nombre + ", nit=" + nit
				+ ", mision=" + mision + ", vision=" + vision + ", username="
				+ username + ", password=" + password + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mision == null) ? 0 : mision.hashCode());
		result = prime * result + ((nit == null) ? 0 : nit.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
		result = prime * result + ((vision == null) ? 0 : vision.hashCode());
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
		EmpresaDO other = (EmpresaDO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mision == null) {
			if (other.mision != null)
				return false;
		} else if (!mision.equals(other.mision))
			return false;
		if (nit == null) {
			if (other.nit != null)
				return false;
		} else if (!nit.equals(other.nit))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (vision == null) {
			if (other.vision != null)
				return false;
		} else if (!vision.equals(other.vision))
			return false;
		return true;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNit() {
		return nit;
	}


	public void setNit(String nit) {
		this.nit = nit;
	}


	public String getMision() {
		return mision;
	}


	public void setMision(String mision) {
		this.mision = mision;
	}


	public String getVision() {
		return vision;
	}


	public void setVision(String vision) {
		this.vision = vision;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	
	
	
	
}
