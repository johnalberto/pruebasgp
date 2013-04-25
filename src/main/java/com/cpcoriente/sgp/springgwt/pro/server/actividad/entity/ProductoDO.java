/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.actividad.entity;

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

/**
 * @author CPC-04
 *
 */

@Entity
@Table(name="producto", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"producto_objetivo_id","producto_codigo"}),
	    @UniqueConstraint(columnNames = {"producto_objetivo_id","producto_nombre"})})
@NamedQueries({
	@NamedQuery(name = "productoDO.listarTodo", query = "select pro from ProductoDO pro where pro.objetivo.id = :idObjetivo order by pro.codigo"),
	@NamedQuery(name = "productoDO.seleccionPorCodigoNombre", query = "select pro from ProductoDO pro where pro.objetivo.id = :idObjetivo and (lower(pro.nombre) like :parteNombre  OR lower(pro.codigo) = :parteCodigo) order by pro.codigo, pro.nombre"),
	@NamedQuery(name = "productoDO.seleccionPorEstado", query = "select pro from ProductoDO pro where pro.objetivo.id = :idObjetivo and pro.estado = :estado order by pro.codigo, pro.nombre")
	})
public class ProductoDO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8944308790231766891L;
	
	public ProductoDO() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "producto_id", nullable = false, unique = true)
	private Long id;
	
	
	@Version 
	@Column(name="producto_version")
	private int version;
	
	@Column(name = "producto_codigo", nullable = false, unique = false)
	private String codigo;
		
	@Column(name = "producto_nombre", nullable = false, unique = false)
	private String nombre;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "producto_fechaInicio", nullable = false, unique = false)
	private Date fechaInicio;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "producto_fechaFin", nullable = false, unique = false)
	private Date fechaFin;
	
	@Column(name = "producto_estado", nullable = false, unique = false)
	private int estado;
	
	@Column(name = "producto_porcenPeso", nullable = false, unique = false)
	private Float porcenPeso;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "producto")
	private Set<ActividadDO> actividadSet;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "producto")
	private Set<VersionProductoDO> versionSet;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "producto_objetivo_id", referencedColumnName = "objetivo_id", nullable = false)
	private ObjetivoDO objetivo;
		
	
	
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
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	 * @return the fechaInicio
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * @return the fechaFin
	 */
	public Date getFechaFin() {
		return fechaFin;
	}

	/**
	 * @param fechaFin the fechaFin to set
	 */
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	/**
	 * @return the estado
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	/**
	 * @return the porcenPeso
	 */
	public Float getPorcenPeso() {
		return porcenPeso;
	}

	/**
	 * @param porcenPeso the porcenPeso to set
	 */
	public void setPorcenPeso(Float porcenPeso) {
		this.porcenPeso = porcenPeso;
	}

	/**
	 * @return the objetivo
	 */
	public ObjetivoDO getObjetivo() {
		return objetivo;
	}

	/**
	 * @param objetivo the objetivo to set
	 */
	public void setObjetivo(ObjetivoDO objetivo) {
		this.objetivo = objetivo;
	}

	/**
	 * @return the actividadSet
	 */
	public Set<ActividadDO> getActividadSet() {
		return actividadSet;
	}

	/**
	 * @param actividadSet the actividadSet to set
	 */
	public void setActividadSet(Set<ActividadDO> actividadSet) {
		this.actividadSet = actividadSet;
	}	
	
	/**
	 * @return the versionSet
	 */
	public Set<VersionProductoDO> getVersionSet() {
		return versionSet;
	}

	/**
	 * @param versionSet the versionSet to set
	 */
	public void setVersionSet(Set<VersionProductoDO> versionSet) {
		this.versionSet = versionSet;
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

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProductoDO [id=" + id + ", codigo=" + codigo + ", nombre="
				+ nombre + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + ", estado=" + estado + ", porcenPeso="
				+ porcenPeso + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + estado;
		result = prime * result
				+ ((fechaFin == null) ? 0 : fechaFin.hashCode());
		result = prime * result
				+ ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((porcenPeso == null) ? 0 : porcenPeso.hashCode());
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
		ProductoDO other = (ProductoDO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (estado != other.estado)
			return false;
		if (fechaFin == null) {
			if (other.fechaFin != null)
				return false;
		} else if (!fechaFin.equals(other.fechaFin))
			return false;
		if (fechaInicio == null) {
			if (other.fechaInicio != null)
				return false;
		} else if (!fechaInicio.equals(other.fechaInicio))
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
		if (porcenPeso == null) {
			if (other.porcenPeso != null)
				return false;
		} else if (!porcenPeso.equals(other.porcenPeso))
			return false;
		return true;
	}
	

}
