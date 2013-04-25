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

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.EmpresaDO;


@Entity()
@Table(name="parametrogeneral")
@NamedQueries({
	@NamedQuery(name = "parametroGeneralDO.listarTodo", query = "select para from ParametroDO para where para.empresa.id = :idEmpresa"),	
	@NamedQuery(name = "parametroGeneralDO.seleccionPorNombre", query = "select par from ParametroDO par where para.empresa.id = :idEmpresa and lower(par.descripcion) like :descripcion")

})
public class ParametroGeneralDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5525064860360852639L;
	
	public ParametroGeneralDO() {
		super();
	}
	
	
	@Id
	@Column(name = "parametro_id", nullable = false, unique = true)
	private String id;
	

	@Column(name = "parametro_descripcion", nullable = false)
	private String descripcion;


	@Column(name = "parametro_valor", nullable = false)
	private String valor;
	
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "parametro_fecha_modificacion", nullable = false)
	private Date fechaModificacion;
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "parametro_empresa_id", referencedColumnName = "empresa_id", nullable = false)
	private EmpresaDO empresa;
	
	
	
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
	 * @return the empresa
	 */
	public EmpresaDO getEmpresa() {
		return empresa;
	}


	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(EmpresaDO empresa) {
		this.empresa = empresa;
	}
	
	
	@Override
	public String toString() {
		return "ParametroDO [id=" + id + ", descripcion=" + descripcion
				+ ", valor=" + valor + ", fechaModificacion="
				+ fechaModificacion + "]";
	}


	
	
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




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParametroGeneralDO other = (ParametroGeneralDO) obj;
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
	
	
	
}
