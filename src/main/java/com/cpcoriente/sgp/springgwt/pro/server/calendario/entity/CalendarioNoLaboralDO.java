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
import javax.persistence.Version;

import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ProyectoDO;

/**
 * @author CPC-04
 *
 */

@Entity
@Table(name = "calendarionolaboral", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"calenda_proyecto_id","calenda_dia_fecha"})})

@NamedQueries({
	@NamedQuery(name = "calendarioNoLaboralDO.listarTodoPorProyecto", query = "select cal from CalendarioNoLaboralDO cal where cal.proyecto.id = :idProyecto order by cal.fechaDia"),
	@NamedQuery(name = "calendarioNoLaboralDO.seleccionPorRangoFechas", query = "select cal from CalendarioNoLaboralDO cal where act.proyecto.id = :idProyecto and (cal.fechaDia >= :fechaInicio and cal.fechaDia <= :fechaFin ) order by cal.fechaDia")
	
})
	




public class CalendarioNoLaboralDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4278904636920972101L;
	
	
	public CalendarioNoLaboralDO() {
		super();
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "calenda_id", nullable = false, unique = true)
	private Long id;
	
	
	@Version 
	@Column(name="calenda_version")
	private int version;
	
	@Column(name = "calenda_descripcion", nullable = false, unique = false)
	private String descripcion;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "calenda_dia_fecha", nullable = false, unique = false)
	private Date fechaDia;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "calenda_proyecto_id", referencedColumnName = "proyecto_id", nullable = false)
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
		result = prime * result
				+ ((fechaDia == null) ? 0 : fechaDia.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		CalendarioNoLaboralDO other = (CalendarioNoLaboralDO) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
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
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CalendarioNoLaboralDO [id=" + id + ", descripcion="
				+ descripcion + ", fechaDia=" + fechaDia + "]";
	}
	
	
}
