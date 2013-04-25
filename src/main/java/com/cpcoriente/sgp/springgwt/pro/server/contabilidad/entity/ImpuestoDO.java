/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity;

import java.io.Serializable;

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
import javax.persistence.UniqueConstraint;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.EmpresaDO;

/**
 * @author CPC-04
 *
 */


@Entity
@Table(name = "impuesto", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"impto_nombre","impto_empresa_id"})
})


@NamedQueries({
	@NamedQuery(name = "impuestoDO.listarTodo", query = "select imp from ImpuestoDO imp where imp.empresa.id = :idEmpresa order by imp.nombre"),
	@NamedQuery(name = "impuestoDO.seleccionPorNombre", query = "select imp from ImpuestoDO imp where imp.empresa.id = :idEmpresa and lower(imp.nombre) like :parteNombre  order by imp.nombre"),
	
})


public class ImpuestoDO implements Serializable {
		
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9068963909731641377L;


	public ImpuestoDO() {
		super();
	}	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "impto_id", nullable = false, unique =true)
	private Long id;

	@Column(name = "impto_nombre", nullable = false, unique = false)
	private String nombre;


	@Column(name = "impto_descripcion", nullable = false, unique = false)
	private String descripcion;


	@Column(name = "impto_tipo", nullable = false, unique = false)
	private int tipo;

	
	@Column(name = "impto_porcenCobro", nullable = false, unique =false)
	private Float porcenCobro;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "impto_empresa_id", referencedColumnName = "empresa_id", nullable = false)
	private EmpresaDO empresa;
	
	

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
	 * @return the tipo
	 */
	public int getTipo() {
		return tipo;
	}


	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	/**
	 * @return the porcenCobro
	 */
	public Float getPorcenCobro() {
		return porcenCobro;
	}


	/**
	 * @param porcenCobro the porcenCobro to set
	 */
	public void setPorcenCobro(Float porcenCobro) {
		this.porcenCobro = porcenCobro;
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


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((porcenCobro == null) ? 0 : porcenCobro.hashCode());
		result = prime * result + tipo;
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
		ImpuestoDO other = (ImpuestoDO) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
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
		if (porcenCobro == null) {
			if (other.porcenCobro != null)
				return false;
		} else if (!porcenCobro.equals(other.porcenCobro))
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ImpuestoDO [id=" + id + ", nombre=" + nombre + ", descripcion="
				+ descripcion + ", tipo=" + tipo + ", porcenCobro="
				+ porcenCobro + ", empresa=" + empresa + "]";
	}
	
	

}
