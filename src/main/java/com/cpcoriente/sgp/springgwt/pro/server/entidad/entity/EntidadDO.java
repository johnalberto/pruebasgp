package com.cpcoriente.sgp.springgwt.pro.server.entidad.entity;

import java.io.Serializable;
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
import javax.persistence.UniqueConstraint;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.CiudadDO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.DepartamentoDO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.PaisDO;


/**
 * Entity implementation class for Entity: TerceroDO
 *
 */
@Entity
@Table(name="entidad", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"entidad_empresa_id", "entidad_pais_id","entidad_codigo"}),
	    @UniqueConstraint(columnNames = {"entidad_empresa_id", "entidad_pais_id","entidad_departamento_id","entidad_ciudad_id","entidad_nombre"}),
	    @UniqueConstraint(columnNames = {"entidad_empresa_id", "entidad_pais_id","entidad_departamento_id","entidad_ciudad_id","entidad_abreviatura"}),
	    @UniqueConstraint(columnNames = {"entidad_email"}),
	    @UniqueConstraint(columnNames = {"entidad_pais_id", "entidad_tipoDoc","entidad_numDoc"})})
@NamedQueries({
	@NamedQuery(name = "entidadDO.listarTodo", query = "select enti from EntidadDO enti"),
	@NamedQuery(name = "entidadDO.seleccionPorNombre", query = "select en from EntidadDO en where lower(en.nombre) like :terceroNombre order by en.nombre asc"),
	@NamedQuery(name = "entidadDO.seleccionPorCiudad", query = "select en from EntidadDO en where en.ciudad.id = :idCiudad"),
	@NamedQuery(name = "entidadDO.selecPorNumDocPorTipDoc", query = "select en from EntidadDO en where en.numDocumento = :numDoc and en.tipoDocumento = :tipDoc order by en.nombre asc"),
	@NamedQuery(name = "entidadDO.selecPorNumDoc", query = "select en from EntidadDO en where lower(en.numDocumento) like :numDoc order by en.tipoDocumento, en.numDocumento)"),	
	@NamedQuery(name = "entidadDO.selecPorUsuario", query = "select en from EntidadDO en, UsuarioDO usu where usu.entidad.id=en.id and usu.username= :username")	
	})

public class EntidadDO implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	public EntidadDO() {
		super();
	}

	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "entidad_id", nullable = false, unique = true)
	private Long id;
	
	
	@Column(name = "entidad_codigo", nullable = false)
	private String codigo;
	
	
	@Column(name = "entidad_tipoDoc", nullable = false)
	private Integer tipoDocumento;
	
	@Column(name = "entidad_numDoc", nullable = false)
	private String numDocumento;
	
	
	@Column(name = "entidad_tipo", nullable = false)
	private Integer tipoPersona;
	
	@Column(name = "entidad_nombre", nullable = true)
	private String nombre;
	
	@Column(name = "entidad_abreviatura", nullable = true)
	private String abreviatura;
	
	@Column(name = "entidad_direccion", nullable = false)
	private String direccion;
	
	@Column(name = "entidad_telefono", nullable = false)
	private String telefono;
	
	@Column(name = "entidad_email", nullable = true)
	private String email;
	
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "entidad_ciudad_id", referencedColumnName = "ciudad_id", nullable = false)
	private CiudadDO ciudad;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "entidad_departamento_id", referencedColumnName = "departamento_id", nullable = false)
	private DepartamentoDO dpto;

	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "entidad_pais_id", referencedColumnName = "pais_id", nullable = false)
	private PaisDO pais;
	
	@Column(name = "entidad_regTributario", nullable = false)
	private Integer regimenTributario;
	
	@Column(name = "entidad_repLeg", nullable = true)
	private String nombreRepLegal;

	@Column(name = "entidad_tipoDocRepLegal", nullable = false)
	private Integer tipoDocRepLegal;
	
	@Column(name = "entidad_numDocRepLegal", nullable = true)
	private String numDocRepLegal;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "entidad_empresa_id", referencedColumnName = "empresa_id", nullable = false)
	private EmpresaDO empresa;

	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "entidad_empresa_id", referencedColumnName = "empresa_id", nullable = false)
	private ActividadEconomicaDO actEconomica;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "entidad")
	private Set<DivisionDO> divisionSet;
	
	
	
	public Set<DivisionDO> getDivisionSet() {
		return divisionSet;
	}

	public void setDivisionSet(Set<DivisionDO> divisionSet) {
		this.divisionSet = divisionSet;
	}

	public Integer getRegimenTributario() {
		return regimenTributario;
	}

	public void setRegimenTributario(Integer regimenTributario) {
		this.regimenTributario = regimenTributario;
	}

	public String getNombreRepLegal() {
		return nombreRepLegal;
	}

	public void setNombreRepLegal(String nombreRepLegal) {
		this.nombreRepLegal = nombreRepLegal;
	}

	public Integer getTipoDocRepLegal() {
		return tipoDocRepLegal;
	}

	public void setTipoDocRepLegal(Integer tipoDocRepLegal) {
		this.tipoDocRepLegal = tipoDocRepLegal;
	}

	public String getNumDocRepLegal() {
		return numDocRepLegal;
	}

	public void setNumDocRepLegal(String numDocRepLegal) {
		this.numDocRepLegal = numDocRepLegal;
	}

	public ActividadEconomicaDO getActEconomica() {
		return actEconomica;
	}

	public void setActEconomica(ActividadEconomicaDO actEconomica) {
		this.actEconomica = actEconomica;
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

	
	
	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}
	
	
	
	@Override
	public String toString() {
		return "EntidadDO [id=" + id + ", codigo=" + codigo
				+ ", tipoDocumento=" + tipoDocumento + ", numDocumento="
				+ numDocumento + ", tipo=" + tipoPersona + ", nombre=" + nombre
				+ ", abreviatura=" + abreviatura + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", email=" + email + ", ciudad="
				+ ciudad + ", dpto=" + dpto + ", pais=" + pais
				+ ", regimenTributario=" + regimenTributario
				+ ", nombreRepLegal=" + nombreRepLegal + ", tipoDocRepLegal="
				+ tipoDocRepLegal + ", numDocRepLegal=" + numDocRepLegal
				+ ", empresa=" + empresa + ", actEconomica=" + actEconomica
				+ "]";
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((abreviatura == null) ? 0 : abreviatura.hashCode());
		result = prime * result
				+ ((actEconomica == null) ? 0 : actEconomica.hashCode());
		result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((dpto == null) ? 0 : dpto.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((nombreRepLegal == null) ? 0 : nombreRepLegal.hashCode());
		result = prime * result
				+ ((numDocRepLegal == null) ? 0 : numDocRepLegal.hashCode());
		result = prime * result
				+ ((numDocumento == null) ? 0 : numDocumento.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime
				* result
				+ ((regimenTributario == null) ? 0 : regimenTributario
						.hashCode());
		result = prime * result
				+ ((telefono == null) ? 0 : telefono.hashCode());
		result = prime * result + ((tipoPersona == null) ? 0 : tipoPersona.hashCode());
		result = prime * result
				+ ((tipoDocRepLegal == null) ? 0 : tipoDocRepLegal.hashCode());
		result = prime * result
				+ ((tipoDocumento == null) ? 0 : tipoDocumento.hashCode());
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
		EntidadDO other = (EntidadDO) obj;
		if (abreviatura == null) {
			if (other.abreviatura != null)
				return false;
		} else if (!abreviatura.equals(other.abreviatura))
			return false;
		if (actEconomica == null) {
			if (other.actEconomica != null)
				return false;
		} else if (!actEconomica.equals(other.actEconomica))
			return false;
		if (ciudad == null) {
			if (other.ciudad != null)
				return false;
		} else if (!ciudad.equals(other.ciudad))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
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
		if (nombreRepLegal == null) {
			if (other.nombreRepLegal != null)
				return false;
		} else if (!nombreRepLegal.equals(other.nombreRepLegal))
			return false;
		if (numDocRepLegal == null) {
			if (other.numDocRepLegal != null)
				return false;
		} else if (!numDocRepLegal.equals(other.numDocRepLegal))
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
		if (regimenTributario == null) {
			if (other.regimenTributario != null)
				return false;
		} else if (!regimenTributario.equals(other.regimenTributario))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		if (tipoPersona == null) {
			if (other.tipoPersona != null)
				return false;
		} else if (!tipoPersona.equals(other.tipoPersona))
			return false;
		if (tipoDocRepLegal == null) {
			if (other.tipoDocRepLegal != null)
				return false;
		} else if (!tipoDocRepLegal.equals(other.tipoDocRepLegal))
			return false;
		if (tipoDocumento == null) {
			if (other.tipoDocumento != null)
				return false;
		} else if (!tipoDocumento.equals(other.tipoDocumento))
			return false;
		return true;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(Integer tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public Integer getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(Integer tipo) {
		this.tipoPersona = tipo;
	}

	
	public EmpresaDO getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaDO empresa) {
		this.empresa = empresa;
	}
	

}
