package com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity;

import java.io.Serializable;

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
import javax.persistence.Version;

import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.CiudadDO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.DepartamentoDO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.PaisDO;





@Entity
@Table(name="contactoproyentidad")
@NamedQueries({
	@NamedQuery(name = "contactoEntidadDO.listarTodo", query = "select maq from ContactoProyectoEntidadDO con order by con.nombre"),
	@NamedQuery(name = "contactoEntidadDO.seleccionPorNombre", query = "select con from ContactoProyectoEntidadDO con where lower(com.nombre) like :parteNombre order by con.nombre"),
	@NamedQuery(name = "contactoEntidadDO.seleccionPorProyecto", query = "select con from ContactoProyectoEntidadDO con " +
			"where con.proyentidad.proyecto.id = :idProyecto order by con.nombre"),
	@NamedQuery(name = "contactoEntidadDO.seleccionPorProyectoEntidad", query = "select con from ContactoProyectoEntidadDO con " +
			"where con.proyentidad.proyecto.id = :idProyecto" +
			"con.proyentidad.entidad.id = :idEntidad order by con.nombre")

	})
public class ContactoProyectoEntidadDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3138186830477416417L;

	public ContactoProyectoEntidadDO(){
		super();
	}
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "contacto_ProyEntidad_id", nullable = false, unique = true)
	private Long id;
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "contacto_ProyEntidad_proyEnt_id", referencedColumnName = "proyEnt_id", nullable = false)
	private ProyectoEntidadDO proyentidad;
	
	@Column(name = "contacto_ProyEntidad_Nombres", nullable = false)
	private String nombres;
	
	@Column(name = "contacto_ProyEntidad_Apellidos", nullable = false)
	private String apellidos;
	
	@Column(name = "contacto_ProyEntidad_Email", nullable = false)
	private String email;
	
	@Column(name = "contacto_ProyEntidad_Direccion", nullable = false)
	private String direccion;
	
	@Column(name = "contacto_ProyEntidad_Telefono1", nullable = false)
	private String telefono1;
	
	@Column(name = "contacto_ProyEntidad_Telefono2", nullable = false)
	private String telefono2;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "contacto_ProyEntidad_Ciudad_id", referencedColumnName = "ciudad_id", nullable = false)
	private CiudadDO ciudad;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "contacto_ProyEntidad_Departamento_id", referencedColumnName = "departamento_id", nullable = false)
	private DepartamentoDO dpto;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "contacto_ProyEntidad_Pais_id", referencedColumnName = "pais_id", nullable = false)
	private PaisDO pais;
	
	@Column(name = "contacto_ProyEntidad_Telefono2", nullable = false)
	private String observacion;

	@Version 
	@Column(name="contacto_ProyEntidad_version")
	private int version;
	
		
	@Override
	public String toString() {
		return "ContactoProyectoEntidadDO [id=" + id + ", proyectoporentidad="
				+ proyentidad + ", nombres=" + nombres + ", apellidos="
				+ apellidos + ", email=" + email + ", direccion=" + direccion
				+ ", telefono1=" + telefono1 + ", telefono2=" + telefono2
				+ ", observacion=" + observacion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result
				+ ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombres == null) ? 0 : nombres.hashCode());
		result = prime * result
				+ ((observacion == null) ? 0 : observacion.hashCode());
		result = prime
				* result
				+ ((proyentidad == null) ? 0 : proyentidad
						.hashCode());
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
		ContactoProyectoEntidadDO other = (ContactoProyectoEntidadDO) obj;
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
		if (nombres == null) {
			if (other.nombres != null)
				return false;
		} else if (!nombres.equals(other.nombres))
			return false;
		if (observacion == null) {
			if (other.observacion != null)
				return false;
		} else if (!observacion.equals(other.observacion))
			return false;
		if (proyentidad == null) {
			if (other.proyentidad != null)
				return false;
		} else if (!proyentidad.equals(other.proyentidad))
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

	public ProyectoEntidadDO getProyectoporentidad() {
		return proyentidad;
	}

	public void setProyectoporentidad(ProyectoEntidadDO proyectoporentidad) {
		this.proyentidad = proyectoporentidad;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
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

	public CiudadDO getCiudad() {
		return ciudad;
	}

	public void setCiudad(CiudadDO ciudad) {
		this.ciudad = ciudad;
	}

	public DepartamentoDO getDpto() {
		return dpto;
	}

	public void setDpto(DepartamentoDO dpto) {
		this.dpto = dpto;
	}

	public PaisDO getPais() {
		return pais;
	}

	public void setPais(PaisDO pais) {
		this.pais = pais;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	
	
}
