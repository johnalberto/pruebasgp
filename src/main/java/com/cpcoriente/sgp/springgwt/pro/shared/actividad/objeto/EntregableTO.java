package com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador.EstadoEntregableEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador.TipoEntregableEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.enumerador.TipoResultadoEntregaEnum;

public class EntregableTO implements Comparable<EntregableTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2677727546329414235L;

	public int compareTo(EntregableTO o) {
		
		return getId().compareTo(o.getId());

	}
	
	private Long id;
	
	private int version;
	
	private String codigo;
	
	private String nombre;
	
	private TipoResultadoEntregaEnum resultadoDe;
	
	private TipoEntregableEnum tipoEntregable;
	
	private EstadoEntregableEnum estado;
	
	private Date fechaEntrega;

	private ActividadTO actividad;
	
	private List<VersionEntregableTO> versionEntregableLista;
	
	



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
	 * @return the tipoResultado
	 */
	public TipoResultadoEntregaEnum getResultadoDe() {
		return resultadoDe;
	}

	/**
	 * @param resultadoDe the tipoResultado to set
	 */
	public void setResultadoDe(TipoResultadoEntregaEnum resultadoDe) {
		this.resultadoDe = resultadoDe;
	}

	/**
	 * @return the tipoEntregable
	 */
	public TipoEntregableEnum getTipoEntregable() {
		return tipoEntregable;
	}

	/**
	 * @param tipoEntregable the tipoEntregable to set
	 */
	public void setTipoEntregable(TipoEntregableEnum tipoEntregable) {
		this.tipoEntregable = tipoEntregable;
	}

	/**
	 * @return the estado
	 */
	public EstadoEntregableEnum getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(EstadoEntregableEnum estado) {
		this.estado = estado;
	}

	/**
	 * @return the fechaEntrega
	 */
	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	/**
	 * @param fechaEntrega the fechaEntrega to set
	 */
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	/**
	 * @return the actividad
	 */
	public ActividadTO getActividad() {
		return actividad;
	}

	/**
	 * @param actividad the actividad to set
	 */
	public void setActividad(ActividadTO actividad) {
		this.actividad = actividad;
	}	

	/**
	 * @return the versionEntregableLista
	 */
	public List<VersionEntregableTO> getVersionEntregableLista() {
		return versionEntregableLista;
	}

	/**
	 * @param versionEntregableLista the versionEntregableLista to set
	 */
	public void setVersionEntregableLista(
			List<VersionEntregableTO> versionEntregableLista) {
		this.versionEntregableLista = versionEntregableLista;
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
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result
				+ ((fechaEntrega == null) ? 0 : fechaEntrega.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((tipoEntregable == null) ? 0 : tipoEntregable.hashCode());
		result = prime * result
				+ ((resultadoDe == null) ? 0 : resultadoDe.hashCode());
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
		EntregableTO other = (EntregableTO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (estado != other.estado)
			return false;
		if (fechaEntrega == null) {
			if (other.fechaEntrega != null)
				return false;
		} else if (!fechaEntrega.equals(other.fechaEntrega))
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
		if (tipoEntregable != other.tipoEntregable)
			return false;
		if (resultadoDe != other.resultadoDe)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EntregableTO [id=" + id + ", codigo=" + codigo + ", nombre="
				+ nombre + ", tipoResultado=" + resultadoDe
				+ ", tipoEntregable=" + tipoEntregable + ", estado=" + estado
				+ ", fechaEntrega=" + fechaEntrega + "]";
	}
	
	


	
}
