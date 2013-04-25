package com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto;

import java.io.Serializable;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador.EstadoObjetivoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.ProyectoTO;



public class ObjetivoTO implements Comparable<ObjetivoTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1896151323694499392L;

	
	private Long id;
	
	private int version;
	
	private ProyectoTO proyecto;
	
	private String codigo;
	
	private String nombre;
	
	private String descripcion;
	
	private EstadoObjetivoEnum estado;
	
	private Float porcenPeso; 
	
	private List<DocObjetivoTO> documentoList;
	
	private ObjetivoTO objetivo_padre; 
	
	private List<ProductoTO> productoList;
	
	private List<VersionObjetivoTO> versionObjetivosList;
	
	
	
	
	public int compareTo(ObjetivoTO o) {
		
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
	 * @return the proyecto
	 */
	public ProyectoTO getProyecto() {
		return proyecto;
	}




	/**
	 * @param proyecto the proyecto to set
	 */
	public void setProyecto(ProyectoTO proyecto) {
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
	public EstadoObjetivoEnum getEstado() {
		return estado;
	}




	/**
	 * @param estado the estado to set
	 */
	public void setEstado(EstadoObjetivoEnum estado) {
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
	 * @return the documentoList
	 */
	public List<DocObjetivoTO> getDocumentoList() {
		return documentoList;
	}




	/**
	 * @param documentoList the documentoList to set
	 */
	public void setDocumentoList(List<DocObjetivoTO> documentoList) {
		this.documentoList = documentoList;
	}




	/**
	 * @return the objetivo_padre
	 */
	public ObjetivoTO getObjetivo_padre() {
		return objetivo_padre;
	}




	/**
	 * @param objetivo_padre the objetivo_padre to set
	 */
	public void setObjetivo_padre(ObjetivoTO objetivo_padre) {
		this.objetivo_padre = objetivo_padre;
	}




	/**
	 * @return the productoList
	 */
	public List<ProductoTO> getProductoList() {
		return productoList;
	}




	/**
	 * @param productoList the productoList to set
	 */
	public void setProductoList(List<ProductoTO> productoList) {
		this.productoList = productoList;
	}




	/**
	 * @return the versionObjetivosList
	 */
	public List<VersionObjetivoTO> getVersionObjetivosList() {
		return versionObjetivosList;
	}




	/**
	 * @param versionObjetivosList the versionObjetivosList to set
	 */
	public void setVersionObjetivosList(List<VersionObjetivoTO> versionObjetivosList) {
		this.versionObjetivosList = versionObjetivosList;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ObjetivoTO [id=" + id + ", codigo=" + codigo + ", nombre="
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
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		
		result = prime * result
				+ ((proyecto == null) ? 0 : proyecto.hashCode());
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
		ObjetivoTO other = (ObjetivoTO) obj;
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
		
		if (proyecto == null) {
			if (other.proyecto != null)
				return false;
		} else if (!proyecto.equals(other.proyecto))
			return false;
		return true;
	}
	
	
}
