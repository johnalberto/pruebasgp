/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.actividad.entity;

import java.io.Serializable;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author CPC-04
 *
 */

@Entity
@Table(name="versionproducto")
@NamedQueries({
	@NamedQuery(name = "verProductoDO.seleccionPorFecha", query = "select ver from VersionProductoDO ver where ver.producto.id = :idProducto and ver.fechaRegistro >= :fechaIni and ver.fechaRegistro <= :fechaFin  order by ver.fechaRegistro, ver.codigo")
	})
public class VersionProductoDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6065751112508277665L;
	
	public VersionProductoDO() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "verProducto_id", nullable = false, unique = true)
	private Long id;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "verProducto_producto_id", referencedColumnName = "producto_id", nullable = false)
	private ProductoDO producto;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "verProducto_fechaRegistro", nullable = false, unique = false)
	private Date fechaRegistro;
	
	@Column(name = "verProducto_observacion", nullable = false, unique = false)
	private String observacion;
	
	@Column(name = "verProducto_codigo", nullable = false, unique = false)
	private String codigo;
		
	@Column(name = "verProducto_nombre", nullable = false, unique = false)
	private String nombre;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "verProducto_fechaInicio", nullable = false, unique = false)
	private Date fechaInicio;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "verProducto_fechaFin", nullable = false, unique = false)
	private Date fechaFin;
	
	@Column(name = "verProducto_estado", nullable = false, unique = false)
	private int estado;
	
	@Column(name = "verProducto_porcenPeso", nullable = false, unique = false)
	private Float porcenPeso;

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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VersionProductoDO [id=" + id + ", fechaRegistro="
				+ fechaRegistro + ", observacion=" + observacion + ", codigo="
				+ codigo + ", nombre=" + nombre + ", fechaInicio="
				+ fechaInicio + ", fechaFin=" + fechaFin + ", estado=" + estado
				+ ", porcenPeso=" + porcenPeso + "]";
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
		result = prime * result
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((observacion == null) ? 0 : observacion.hashCode());
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
		VersionProductoDO other = (VersionProductoDO) obj;
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
		if (observacion == null) {
			if (other.observacion != null)
				return false;
		} else if (!observacion.equals(other.observacion))
			return false;
		if (porcenPeso == null) {
			if (other.porcenPeso != null)
				return false;
		} else if (!porcenPeso.equals(other.porcenPeso))
			return false;
		return true;
	}	
	

}
















