/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.calendario.entity;

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
import javax.persistence.UniqueConstraint;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.EmpresaDO;

/**
 * @author CPC-04
 *
 */

@Entity
@Table(name = "dianolaboral", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"dia_empresa_id","dia_fecha"})})

@NamedQueries({
	@NamedQuery(name = "diaNoLaboralDO.listarTodoPorEmpresa", query = "select dia from DiaNoLaboralDO dia where dia.empresa.id = :idEmpresa order by dia.fechaDia"),
	@NamedQuery(name = "diaNoLaboralDO.seleccionPorRangoFechas", query = "select dia from DiaNoLaboralDO dia where dia.empresa.id = :idEmpresa and (dia.fechaDia >= :fechaInicio and dia.fechaDia <= :fechaFin ) order by dia.fechaDia")
	
})

public class DiaNoLaboralDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1199355199415359168L;
	
	public DiaNoLaboralDO() {
		super();
	}

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "dia_id", nullable = false, unique = true)
	private Long id;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dia_fecha", nullable = false, unique = false)
	private Date fechaDia;
	
	@Column(name = "dia_descripcion", nullable = false, unique = false)
	private String descripcion;
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "dia_empresa_id", referencedColumnName = "empresa_id", nullable = false)
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
	 * @return the fechaDia
	 */
	public Date getFechaDia() {
		return fechaDia;
	}


	/**
	 * @param fechaDia the fechaDia to set
	 */
	public void setFechaDia(Date fechaDia) {
		this.fechaDia = fechaDia;
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
				+ ((fechaDia == null) ? 0 : fechaDia.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
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
		DiaNoLaboralDO other = (DiaNoLaboralDO) obj;
		if (fechaDia == null) {
			if (other.fechaDia != null)
				return false;
		} else if (!fechaDia.equals(other.fechaDia))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		return true;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DiaNoLaboralDO [id=" + id + ", fechaDia=" + fechaDia
				+ ", nombre=" + descripcion + "]";
	}
	
	

}



