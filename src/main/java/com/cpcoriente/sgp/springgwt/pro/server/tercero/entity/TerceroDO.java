/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.tercero.entity;

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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.EmpresaDO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.CiudadDO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.DepartamentoDO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.PaisDO;


/**
 * @author CPC-04
 *
 */

@Entity
@Table(name = "tercero", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"tercero_empresa_id", "tercero_pais_id", "tercero_tipoDoc", "tercero_numDoc"}),
	    @UniqueConstraint(columnNames = {"tercero_empresa_id", "tercero_pais_id","tercero_nombre"})})


@NamedQueries({
	@NamedQuery(name = "terceroDO.seleccionPorNumDoNombre", query = "select ter from TerceroDO ter where lower(ter.numDoc) like :numDoc OR lower(ter.nombre) like :nombre order by ter.nombre")
})

public class TerceroDO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2750070482637155932L;

	public TerceroDO () {
		super();
	}
	
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tercero_id", nullable = false, unique = true)
	private Long id;
	
	@Version 
	@Column(name="tercero_version")
	private int version;
	
	@Column(name = "tercero_tipoDoc", nullable = false)
	private int tipoDoc;
	
	@Column(name = "tercero_numDoc", nullable = false)
	private String numDocumento;
	
	@Column(name = "tercero_tipoPersona", nullable = false)
	private int tipoPersona;
	
	@Column(name = "tercero_nombre", nullable = false)
	private String nombre;
	
	@Column(name = "tercero_sexo", nullable = true)
	private char sexo;
	
	@Column(name = "tercero_direccion", nullable = false)
	private String direccion;
	
	@Column(name = "tercero_telefono", nullable = false)
	private String telefono;
	
	@Column(name = "tercero_email", nullable = true)
	private String email;
		
	@Temporal(TemporalType.DATE)
	@Column(name = "tercero_fechaRegistro", nullable = false)
	private Date fechaRegistro;
	
	@Column(name = "tercero_regTributario", nullable = false)
	private int regimenTributario;
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "tercero_ciudad_id", referencedColumnName = "ciudad_id", nullable = false)
	private CiudadDO ciudad;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "tercero_departamento_id", referencedColumnName = "departamento_id", nullable = false)
	private DepartamentoDO dpto;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "tercero_pais_id", referencedColumnName = "pais_id", nullable = false)
	private PaisDO pais;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "tercero_empresa_id", referencedColumnName = "empresa_id", nullable = false)
	private EmpresaDO empresa;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "tercero")
	private Set<TerceroPorTipoDO> terceroTipoSet;
	
	

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
	 * @return the tipoDoc
	 */
	public int getTipoDoc() {
		return tipoDoc;
	}

	/**
	 * @param tipoDoc the tipoDoc to set
	 */
	public void setTipoDoc(int tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	/**
	 * @return the numDocumento
	 */
	public String getNumDocumento() {
		return numDocumento;
	}

	/**
	 * @param numDocumento the numDocumento to set
	 */
	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the version
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(int version) {
		this.version = version;
	}

	/**
	 * @return the tipoPersona
	 */
	public int getTipoPersona() {
		return tipoPersona;
	}

	/**
	 * @param tipoPersona the tipoPersona to set
	 */
	public void setTipoPersona(int tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the fechaRegistro
	 */
	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	/**
	 * @param fechaRegistro the fechaRegistro to set
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	/**
	 * @return the regimenTributario
	 */
	public int getRegimenTributario() {
		return regimenTributario;
	}

	/**
	 * @param regimenTributario the regimenTributario to set
	 */
	public void setRegimenTributario(int regimenTributario) {
		this.regimenTributario = regimenTributario;
	}

	/**
	 * @return the ciudad
	 */
	public CiudadDO getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(CiudadDO ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * @return the dpto
	 */
	public DepartamentoDO getDpto() {
		return dpto;
	}

	/**
	 * @param dpto the dpto to set
	 */
	public void setDpto(DepartamentoDO dpto) {
		this.dpto = dpto;
	}

	/**
	 * @return the pais
	 */
	public PaisDO getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(PaisDO pais) {
		this.pais = pais;
	}

	/**
	 * @return the empresa
	 */
	public EmpresaDO getEmpresa() {
		return empresa;
	}

	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(EmpresaDO empresa) {
		this.empresa = empresa;
	}

	/**
	 * @return the terceroTipoSet
	 */
	public Set<TerceroPorTipoDO> getTerceroTipoSet() {
		return terceroTipoSet;
	}

	/**
	 * @param terceroTipoSet the terceroTipoSet to set
	 */
	public void setTerceroTipoSet(Set<TerceroPorTipoDO> terceroTipoSet) {
		this.terceroTipoSet = terceroTipoSet;
	}

	
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
		result = prime * result
				+ ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((dpto == null) ? 0 : dpto.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((numDocumento == null) ? 0 : numDocumento.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result + regimenTributario;
		result = prime * result + sexo;
		result = prime * result
				+ ((telefono == null) ? 0 : telefono.hashCode());
		result = prime * result + tipoDoc;
		result = prime * result + tipoPersona;
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
		TerceroDO other = (TerceroDO) obj;
		if (ciudad == null) {
			if (other.ciudad != null)
				return false;
		} else if (!ciudad.equals(other.ciudad))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (dpto == null) {
			if (other.dpto != null)
				return false;
		} else if (!dpto.equals(other.dpto))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
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
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numDocumento == null) {
			if (other.numDocumento != null)
				return false;
		} else if (!numDocumento.equals(other.numDocumento))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		if (regimenTributario != other.regimenTributario)
			return false;
		if (sexo != other.sexo)
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		if (tipoDoc != other.tipoDoc)
			return false;
		if (tipoPersona != other.tipoPersona)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TerceroDO [id=" + id + ", tipoDoc=" + tipoDoc
				+ ", numDocumento=" + numDocumento + ", nombre=" + nombre
				+ ", sexo=" + sexo + ", direccion=" + direccion + ", telefono="
				+ telefono + ", email=" + email + ", fechaRegistro="
				+ fechaRegistro + ", regimenTributario=" + regimenTributario
				+ ", ciudad=" + ciudad + ", dpto=" + dpto + ", pais=" + pais
				+ ", terceroTipoSet=" + terceroTipoSet + "]";
	}
	


}
