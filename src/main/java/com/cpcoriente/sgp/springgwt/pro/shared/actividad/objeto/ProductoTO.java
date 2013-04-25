package com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador.EstadoProductoEnum;

public class ProductoTO implements Comparable<ProductoTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5915217769686451442L;
	
	
	
	private Long id;
	
	private int version;
	
	private ObjetivoTO objetivo;
	
	private String codigo;
	
	private String nombre;
	
	private Date fechaInicio;
	
	private Date fechaFin;
	
	private EstadoProductoEnum estado;
	
	private Float porcenPeso;
	
	private List<ActividadTO> actividadList;
	
	private List<VersionProductoTO> versionProductoList;
	
	

	
	public int compareTo(ProductoTO o) {
		
		return getId().compareTo(o.getId());

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
	 * @return the objetivo
	 */
	public ObjetivoTO getObjetivo() {
		return objetivo;
	}





	/**
	 * @param objetivo the objetivo to set
	 */
	public void setObjetivo(ObjetivoTO objetivo) {
		this.objetivo = objetivo;
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
	public EstadoProductoEnum getEstado() {
		return estado;
	}





	/**
	 * @param estado the estado to set
	 */
	public void setEstado(EstadoProductoEnum estado) {
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
	 * @return the actividadList
	 */
	public List<ActividadTO> getActividadList() {
		return actividadList;
	}





	/**
	 * @param actividadList the actividadList to set
	 */
	public void setActividadList(List<ActividadTO> actividadList) {
		this.actividadList = actividadList;
	}





	/**
	 * @return the versionProductoList
	 */
	public List<VersionProductoTO> getVersionProductoList() {
		return versionProductoList;
	}





	/**
	 * @param versionProductoList the versionProductoList to set
	 */
	public void setVersionProductoList(List<VersionProductoTO> versionProductoList) {
		this.versionProductoList = versionProductoList;
	}





	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProductoTO [id=" + id + ", codigo=" + codigo + ", nombre="
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
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result
				+ ((fechaFin == null) ? 0 : fechaFin.hashCode());
		result = prime * result
				+ ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((objetivo == null) ? 0 : objetivo.hashCode());
		
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
		ProductoTO other = (ProductoTO) obj;
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
		if (objetivo == null) {
			if (other.objetivo != null)
				return false;
		} else if (!objetivo.equals(other.objetivo))
			return false;
		
		return true;
	}


	

}
