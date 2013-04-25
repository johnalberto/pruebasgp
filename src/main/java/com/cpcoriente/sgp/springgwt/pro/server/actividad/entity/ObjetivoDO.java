/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.actividad.entity;

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
import javax.persistence.Version;

import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ProyectoDO;

/**
 * @author CPC-04
 *
 */


@Entity
@Table(name="objetivo", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"objetivo_proyecto_id","objetivo_codigo"}),
	    @UniqueConstraint(columnNames = {"objetivo_proyecto_id","objetivo_nombre"})})
@NamedQueries({
	@NamedQuery(name = "objetivoDO.listarTodo", query = "select obj from ObjetivoDO obj where obj.proyecto.id = :idProyecto order by obj.codigo"),
	@NamedQuery(name = "objetivoDO.seleccionPorCodigoNombre", query = "select obj from ObjetivoDO obj where obj.proyecto.id = :idProyecto and (lower(obj.nombre) like :parteNombre  OR lower(obj.codigo) = :parteCodigo) order by obj.codigo, obj.nombre"),
	@NamedQuery(name = "objetivoDO.seleccionPorEstado", query = "select obj from ObjetivoDO obj where obj.proyecto.id = :idProyecto and obj.estado = :estado order by obj.codigo, obj.nombre")
	})

public class ObjetivoDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -223200203525925521L;
	
	public ObjetivoDO() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "objetivo_id", nullable = false, unique = true)
	private Long id;
	
	
	@Version 
	@Column(name="objetivo_version")
	private int version;
	
	
	@Column(name = "objetivo_codigo", nullable = false, unique = false)
	private String codigo;
		
	@Column(name = "objetivo_nombre", nullable = false, unique = false)
	private String nombre;
	
	@Column(name = "objetivo_descripcion", nullable = false, unique = false)
	private String descripcion;
	
	@Column(name = "objetivo_estado", nullable = false, unique = false)
	private int estado;
	
	
	@Column(name = "objetivo_porcenPeso", nullable = false, unique = false)
	private Float porcenPeso;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "objetivo")
	private Set<ProductoDO> productoSet;

	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "objetivo")
	private Set<VersionObjetivoDO> versionSet;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "objetivo_proyecto_id", referencedColumnName = "proyecto_id", nullable = false)
	private ProyectoDO proyecto;
	
	
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
	 * @return the proyecto
	 */
	public ProyectoDO getProyecto() {
		return proyecto;
	}

	/**
	 * @param proyecto the proyecto to set
	 */
	public void setProyecto(ProyectoDO proyecto) {
		this.proyecto = proyecto;
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	 * @return the productoSet
	 */
	public Set<ProductoDO> getProductoSet() {
		return productoSet;
	}

	/**
	 * @param productoSet the productoSet to set
	 */
	public void setProductoSet(Set<ProductoDO> productoSet) {
		this.productoSet = productoSet;
	}	
	
	/**
	 * @return the versionSet
	 */
	public Set<VersionObjetivoDO> getVersionSet() {
		return versionSet;
	}

	/**
	 * @param versionSet the versionSet to set
	 */
	public void setVersionSet(Set<VersionObjetivoDO> versionSet) {
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
		return "ObjetivoDO [id=" + id + ", codigo=" + codigo + ", nombre="
				+ nombre + ", descripcion=" + descripcion + ", estado="
				+ estado + ", porcenPeso=" + porcenPeso + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + estado;
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
		ObjetivoDO other = (ObjetivoDO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (estado != other.estado)
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







