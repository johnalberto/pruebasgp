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
@Table(name="actividad", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"actividad_producto_id","actividad_codigo"}),
	    @UniqueConstraint(columnNames = {"actividad_producto_id","actividad_nombre"})})
@NamedQueries({
	@NamedQuery(name = "actividadDO.listarTodo", query = "select act from ActividadDO act where act.producto.id = :idProducto order by act.codigo"),
	@NamedQuery(name = "actividadDO.seleccionPorCodigoNombre", query = "select act from ActividadDO act where act.producto.id = :idProducto and (lower(act.nombre) like :parteNombre  OR lower(act.codigo) = :parteCodigo) order by act.codigo, act.nombre"),
	
	@NamedQuery(name = "actividadDO.seleccionPorNombreCodigoPadre", query = "select act from ActividadDO act where act.padre.id = :idPadre AND (lower(act.nombre) like :parteNombre or lower(act.codigo) like :parteCodigo) order by act.codigo, act.nombre"),
	@NamedQuery(name = "actividadDO.seleccionPorPadre", query = "select act from ActividadDO act where act.padre.id = :idPadre order by act.codigo, act.nombre"),
	@NamedQuery(name = "actividadDO.seleccionPadres", query = "select act from ActividadDO act where act.producto.id = :idProducto and act.padre.id = null order by act.codigo, act.nombre"),
	@NamedQuery(name = "actividadDO.seleccionPadresPorNomCod", query = "select act from ActividadDO act where act.producto.id = :idProducto and act.padre.id = null AND (lower(act.nombre) like :parteNombre or lower(act.codigo) like :parteCodigo) order by act.codigo, act.nombre"),
	@NamedQuery(name = "actividadDO.seleccionPorEstado", query = "select act from ActividadDO act where act.producto.id = :idProducto and act.estado = :estado order by act.codigo, act.nombre"),
	@NamedQuery(name = "actividadDO.seleccionPorRangofechas", query = "select act from ActividadDO act where act.producto.id = :idProducto and act.fechaInicio >= :fechaInicio and act.fechaFinal <= :fechaFin order by act.codigo, act.nombre"),
	@NamedQuery(name = "actividadDO.seleccionPorFechaInicial", query = "select act from ActividadDO act where act.producto.id = :idProducto and act.fechaInicio >= :fechaInicio order by act.codigo, act.nombre"),
	@NamedQuery(name = "actividadDO.seleccionPorFechaFinal", query = "select act from ActividadDO act where act.producto.id = :idProducto and act.fechaFinal <= :fechaFin order by act.codigo, act.nombre")
	
    })

public class ActividadDO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5131520181045402507L;
	
	public ActividadDO() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "actividad_id", nullable = false, unique = true)
	private Long id;
		
	
	@Version 
	@Column(name="actividad_version")
	private int version;
	
	
	@Column(name = "actividad_codigo", nullable = false, unique = false)
	private String codigo;
		
	@Column(name = "actividad_nombre", nullable = false, unique = false)
	private String nombre;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "actividad_fechaInicio", nullable = false, unique = false)
	private Date fechaInicio;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "actividad_fechaFinal", nullable = false, unique = false)
	private Date fechaFinal;
	
	@Column(name = "actividad_porcenPeso", nullable = false, unique = false)
	private Float porcenPeso;
	
	@Column(name = "actividad_estado", nullable = false, unique = false)
	private int estado;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "actividad_padre_id", referencedColumnName = "actividad_id", nullable = true)
	private ActividadDO padre;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "actividad_producto_id", referencedColumnName = "producto_id", nullable = false)
	private ProductoDO producto;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "padre")
	private Set<ActividadDO> hijos;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "actividad")
	private Set<VersionActividadDO> versionSet;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "actividad")
	private Set<EntregableDO> entregableSet;
	


	
	
	
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
	 * @return the fechaFinal
	 */
	public Date getFechaFinal() {
		return fechaFinal;
	}

	/**
	 * @param fechaFinal the fechaFinal to set
	 */
	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
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
	 * @return the producto
	 */
	public ProductoDO getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(ProductoDO producto) {
		this.producto = producto;
	}

	/**
	 * @return the padre
	 */
	public ActividadDO getPadre() {
		return padre;
	}

	/**
	 * @param padre the padre to set
	 */
	public void setPadre(ActividadDO padre) {
		this.padre = padre;
	}

	/**
	 * @return the hijos
	 */
	public Set<ActividadDO> getHijos() {
		return hijos;
	}

	/**
	 * @param hijos the hijos to set
	 */
	public void setHijos(Set<ActividadDO> hijos) {
		this.hijos = hijos;
	}	
	
	/**
	 * @return the versionSet
	 */
	public Set<VersionActividadDO> getVersionSet() {
		return versionSet;
	}

	/**
	 * @param versionSet the versionSet to set
	 */
	public void setVersionSet(Set<VersionActividadDO> versionSet) {
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
	
	/**
	 * @return the entregableSet
	 */
	public Set<EntregableDO> getEntregableSet() {
		return entregableSet;
	}

	/**
	 * @param entregableSet the entregableSet to set
	 */
	public void setEntregableSet(Set<EntregableDO> entregableSet) {
		this.entregableSet = entregableSet;
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
				+ ((fechaFinal == null) ? 0 : fechaFinal.hashCode());
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
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ActividadDO)) {
			return false;
		}
		ActividadDO other = (ActividadDO) obj;
		if (codigo == null) {
			if (other.codigo != null) {
				return false;
			}
		} else if (!codigo.equals(other.codigo)) {
			return false;
		}
		if (estado != other.estado) {
			return false;
		}
		if (fechaFinal == null) {
			if (other.fechaFinal != null) {
				return false;
			}
		} else if (!fechaFinal.equals(other.fechaFinal)) {
			return false;
		}
		if (fechaInicio == null) {
			if (other.fechaInicio != null) {
				return false;
			}
		} else if (!fechaInicio.equals(other.fechaInicio)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (nombre == null) {
			if (other.nombre != null) {
				return false;
			}
		} else if (!nombre.equals(other.nombre)) {
			return false;
		}
		if (porcenPeso == null) {
			if (other.porcenPeso != null) {
				return false;
			}
		} else if (!porcenPeso.equals(other.porcenPeso)) {
			return false;
		}
		return true;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ActividadDO [id=" + id + ", codigo=" + codigo + ", nombre="
				+ nombre + ", fechaInicio=" + fechaInicio + ", fechaFinal="
				+ fechaFinal + ", porcenPeso=" + porcenPeso + ", estado="
				+ estado + "]";
	}

	
	

}





