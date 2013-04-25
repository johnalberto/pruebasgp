/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.parametro.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ProyectoDO;

/**
 * @author CPC-04
 *
 */


@Entity()
@Table(name="parametroporproyecto")
@NamedQueries({
	@NamedQuery(name = "parametroProyDO.listarTodo", query = "select para from ParametroDO para where para.proy.id = :idProyecto"),	
	@NamedQuery(name = "parametroProyDO.seleccionPorNombre", query = "select para from ParametroDO para where para.proy.id = :idProyecto and lower(para.descripcion) like :descripcion")

})
public class ParametroPorProyectoDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4265364653918336637L;
	
	public ParametroPorProyectoDO() {
		super();
	}

	@Id
	@Column(name = "parametroProy_id", nullable = false, unique = true)
	private String id;
	

	@Column(name = "parametroProy_descripcion", nullable = false)
	private String descripcion;


	@Column(name = "parametroProy_valor", nullable = false)
	private String valor;
	
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "parametroProy_fecha_modificacion", nullable = false)
	private Date fechaModificacion;
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "parametroProy_proyecto_id", referencedColumnName = "proyecto_id", nullable = false)
	private ProyectoDO proyecto;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}


	/**
	 * @param valor the valor to set
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}


	/**
	 * @return the fechaModificacion
	 */
	public Date getFechaModificacion() {
		return fechaModificacion;
	}


	/**
	 * @param fechaModificacion the fechaModificacion to set
	 */
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
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


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime
				* result
				+ ((fechaModificacion == null) ? 0 : fechaModificacion
						.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
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
		ParametroPorProyectoDO other = (ParametroPorProyectoDO) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (fechaModificacion == null) {
			if (other.fechaModificacion != null)
				return false;
		} else if (!fechaModificacion.equals(other.fechaModificacion))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ParametroPorProyectoDO [id=" + id + ", descripcion="
				+ descripcion + ", valor=" + valor + ", fechaModificacion="
				+ fechaModificacion + "]";
	}
	
	
}
