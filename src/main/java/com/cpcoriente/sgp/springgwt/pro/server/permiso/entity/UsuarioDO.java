package com.cpcoriente.sgp.springgwt.pro.server.permiso.entity;

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
 * Entity implementation class for Entity: UsuarioDO
 *
 */
@Entity
@Table(name="usuario", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"usuario_tipoDoc", "usuario_numDoc"}),
	    @UniqueConstraint(columnNames = {"usuario_empresa_id", "usuario_username"})})
@NamedQueries({
	@NamedQuery(name = "usuarioDO.listarTodo", query = "select us from UsuarioDO us"),
	@NamedQuery(name = "usuarioDO.seleccionPorNombre", query = "select us from UsuarioDO us where lower(us.nombre) like :usuarioNombre "),
	@NamedQuery(name = "usuarioDO.seleccionPorCiudad", query = "select us from UsuarioDO us where us.ciudad.id = :idCiudad"),
	@NamedQuery(name = "usuarioDO.seleccionPorTercero", query = "select us from UsuarioDO us where us.entidad.id = :idTercero"),
	@NamedQuery(name = "usuarioDO.seleccionPorTipoUsuario", query = "select us from UsuarioDO us, in (us.usuarioPorTipo) tipoUs where tipoUs.tipoUsuario = :idTipoUsuario"),
	@NamedQuery(name = "usuarioDO.seleccionPorTipoYDocumento", query = "select us from UsuarioDO us where us.tipoDocumento = :idTipoDocumento and us.numDoc = :numDoc"),
	@NamedQuery(name = "usuarioDO.ValidarUsUarioPassword", query = "select us from UsuarioDO us where us.username = :userName and us.password = :passWord "),
	@NamedQuery(name = "usuarioDO.SeleccionPorUsername", query = "select us from UsuarioDO us where us.username = :userName ")
	})
public class UsuarioDO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7803144935473816788L;


	public UsuarioDO() {
		super();
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "usuario_id", nullable = false, unique = true)
	private Long id;
	
	@Column(name = "usuario_numDoc", nullable = false, unique = true)
	private String numDoc;
	
	@Column(name = "usuario_nombre", nullable = false)
	private String nombre;
	
	@Column(name = "usuario_sexo", nullable = false)
	private char sexo;
	
	@Column(name ="usuario_direccion", nullable = false)
	private String direccion;
	
	@Column(name = "usuario_telefono", nullable = false)
	private String telefono;
	
	@Column(name = "usuario_email", nullable = true)
	private String email;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "usuario_fecha_registro", nullable = false)
	private Date fechaRegistro;
	
	@Column(name = "usuario_username", nullable = false, unique = true)
	private String username;
	
	@Column(name = "usuario_contrasena", nullable = false)
	private String password;
	
	@Column(name = "usuario_tipoDoc", nullable = false)
	private Integer tipoDocumento;

	
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "usuario_ciudad_id", referencedColumnName = "ciudad_id", nullable = false)
	private CiudadDO ciudad;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "usuario_departamento_id", referencedColumnName = "departamento_id", nullable = false)
	private DepartamentoDO dpto;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "usuario_pais_id", referencedColumnName = "pais_id", nullable = false)
	private PaisDO pais;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "usuario")
	private Set<UsuarioPorTipoDO> usuarioPorTipo;

	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "usuario_empresa_id", referencedColumnName = "empresa_id", nullable = false)
	private EmpresaDO empresa;
	
	@Version 
	@Column(name="usuario_version")
	private int version;
	
	public Integer getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(Integer tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	

	public Set<UsuarioPorTipoDO> getUsuarioPorTipo() {
		return usuarioPorTipo;
	}

	public void setUsuarioPorTipo(Set<UsuarioPorTipoDO> usuarioPorTipo) {
		this.usuarioPorTipo = usuarioPorTipo;
	}

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
	 * @return the numDoc
	 */
	public String getNumDoc() {
		return numDoc;
	}

	/**
	 * @param numDoc the numDoc to set
	 */
	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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

	

	@Override
	public String toString() {
		return "UsuarioDO [id=" + id + ", numDoc=" + numDoc + ", nombre="
				+ nombre + ", sexo=" + sexo + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", email=" + email
				+ ", fechaRegistro=" + fechaRegistro + ", username=" + username
				+ ", password=" + password + ", tipoDocumento=" + tipoDocumento
				+ ", ciudad=" + ciudad + ", dpto=" + dpto + ", pais=" + pais
				+ ", empresa=" + empresa + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
		result = prime * result
				+ ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((dpto == null) ? 0 : dpto.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((numDoc == null) ? 0 : numDoc.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + sexo;
		result = prime * result
				+ ((telefono == null) ? 0 : telefono.hashCode());
		result = prime * result
				+ ((tipoDocumento == null) ? 0 : tipoDocumento.hashCode());
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
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
		UsuarioDO other = (UsuarioDO) obj;
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
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
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
		if (numDoc == null) {
			if (other.numDoc != null)
				return false;
		} else if (!numDoc.equals(other.numDoc))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (sexo != other.sexo)
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		if (tipoDocumento == null) {
			if (other.tipoDocumento != null)
				return false;
		} else if (!tipoDocumento.equals(other.tipoDocumento))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	public EmpresaDO getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaDO empresa) {
		this.empresa = empresa;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	


	

	

	
   
}
