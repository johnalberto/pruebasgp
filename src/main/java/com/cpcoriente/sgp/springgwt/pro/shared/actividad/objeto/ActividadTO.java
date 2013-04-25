package com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ActividadDO;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador.EstadoProductoEnum;

public class ActividadTO implements Comparable<ActividadTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1310754906561477962L;

	
	
	private Long id;
	
	private int version;
	
	private ProductoTO producto;
	
	private ActividadTO padre;
	
	private List<ActividadDO> hijosLista;
	
	private String codigo;

	private String nombre;
	
	private Date fechaInicio;
	
	private Date fechaFinal;
	
	private Float porcenPeso;
	
	private EstadoProductoEnum estado;
	
	private List<VersionActividadTO> versionLista;
	
	private List<EntregableTO> entregableLista;
	

	
	public int compareTo(ActividadTO o) {
	
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
	 * @return the producto
	 */
	public ProductoTO getProducto() {
		return producto;
	}




	/**
	 * @param producto the producto to set
	 */
	public void setProducto(ProductoTO producto) {
		this.producto = producto;
	}




	/**
	 * @return the padre
	 */
	public ActividadTO getPadre() {
		return padre;
	}




	/**
	 * @param padre the padre to set
	 */
	public void setPadre(ActividadTO padre) {
		this.padre = padre;
	}




	/**
	 * @return the hijosLista
	 */
	public List<ActividadDO> getHijosLista() {
		return hijosLista;
	}




	/**
	 * @param hijosLista the hijosLista to set
	 */
	public void setHijosLista(List<ActividadDO> hijosLista) {
		this.hijosLista = hijosLista;
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
	 * @return the versionLista
	 */
	public List<VersionActividadTO> getVersionLista() {
		return versionLista;
	}




	/**
	 * @param versionLista the versionLista to set
	 */
	public void setVersionLista(List<VersionActividadTO> versionLista) {
		this.versionLista = versionLista;
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
	 * @return the entregableLista
	 */
	public List<EntregableTO> getEntregableLista() {
		return entregableLista;
	}




	/**
	 * @param entregableLista the entregableLista to set
	 */
	public void setEntregableLista(List<EntregableTO> entregableLista) {
		this.entregableLista = entregableLista;
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
				+ ((fechaFinal == null) ? 0 : fechaFinal.hashCode());
		result = prime * result
				+ ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
	
		result = prime * result
				+ ((producto == null) ? 0 : producto.hashCode());
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
		ActividadTO other = (ActividadTO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (estado != other.estado)
			return false;
		if (fechaFinal == null) {
			if (other.fechaFinal != null)
				return false;
		} else if (!fechaFinal.equals(other.fechaFinal))
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
		
		if (producto == null) {
			if (other.producto != null)
				return false;
		} else if (!producto.equals(other.producto))
			return false;
		return true;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ActividadTO [id=" + id + ", producto=" + producto + ", codigo="
				+ codigo + ", nombre=" + nombre + ", fechaInicio="
				+ fechaInicio + ", fechaFinal=" + fechaFinal + ", porcenPeso="
				+ porcenPeso + ", estado=" + estado + "]";
	}
	

}
