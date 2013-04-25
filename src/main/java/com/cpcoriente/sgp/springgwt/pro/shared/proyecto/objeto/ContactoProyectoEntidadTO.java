package com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto;

import java.io.Serializable;

import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO;

public class ContactoProyectoEntidadTO implements Comparable<ContactoProyectoEntidadTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7735462259881324747L;

	public int compareTo(ContactoProyectoEntidadTO o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	private Long id;
	
	private ProyectoEntidadTO proyectoEntidad;
	
	private String nombre;
	
	private String apellidos;
	
	private String email;
	
	private String direccion;
	
	private String telefono1;
	
	private String telefono2;
	
	private CiudadTO ciudad;
	
	private DepartamentoTO departamento;
	
	private PaisTO pais;
	
	private String Observaciones;
	
	private int version;


	
	@Override
	public String toString() {
		return "ContactoProyectoEntidadTO [id=" + id + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", email=" + email
				+ ", direccion=" + direccion + ", telefono1=" + telefono1
				+ ", telefono2=" + telefono2 + ", Observaciones="
				+ Observaciones + "]";
	}

	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Observaciones == null) ? 0 : Observaciones.hashCode());
		result = prime * result
				+ ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result
				+ ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((telefono1 == null) ? 0 : telefono1.hashCode());
		result = prime * result
				+ ((telefono2 == null) ? 0 : telefono2.hashCode());
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
		ContactoProyectoEntidadTO other = (ContactoProyectoEntidadTO) obj;
		if (Observaciones == null) {
			if (other.Observaciones != null)
				return false;
		} else if (!Observaciones.equals(other.Observaciones))
			return false;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
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
		if (telefono1 == null) {
			if (other.telefono1 != null)
				return false;
		} else if (!telefono1.equals(other.telefono1))
			return false;
		if (telefono2 == null) {
			if (other.telefono2 != null)
				return false;
		} else if (!telefono2.equals(other.telefono2))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProyectoEntidadTO getProyectoEntidad() {
		return proyectoEntidad;
	}

	public void setProyectoEntidad(ProyectoEntidadTO proyectoEntidad) {
		this.proyectoEntidad = proyectoEntidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono1() {
		return telefono1;
	}

	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1;
	}

	public String getTelefono2() {
		return telefono2;
	}

	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}

	public CiudadTO getCiudad() {
		return ciudad;
	}

	public void setCiudad(CiudadTO ciudad) {
		this.ciudad = ciudad;
	}

	public DepartamentoTO getDepartamento() {
		return departamento;
	}

	public void setDepartamento(DepartamentoTO departamento) {
		this.departamento = departamento;
	}

	public PaisTO getPais() {
		return pais;
	}

	public void setPais(PaisTO pais) {
		this.pais = pais;
	}

	public String getObservaciones() {
		return Observaciones;
	}

	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}


	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}
	
	
	

}
