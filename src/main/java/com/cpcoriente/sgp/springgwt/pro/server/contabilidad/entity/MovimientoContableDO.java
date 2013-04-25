/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.cpcoriente.sgp.springgwt.pro.server.ejecucion.entity.EjecucionPresupuestoDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RecursoDetalleDO;

/**
 * @author CPC-04
 *
 */

@Entity
@Table(name = "movimientocontable")

@NamedQueries({
	@NamedQuery(name = "movimientoContableDO.listarTodoPorProyecto", query = "select movCon from MovimientoContableDO movCon where movCon.pucProy.proyecto.id = :idProyecto order by movCon.fechaMov, movCon.ejecPres, movCon.recDet, movCon.pucProy.cuentaPuc.codigo"),
	@NamedQuery(name = "movimientoContableDO.seleccionPorCuenta", query = "select movCon from MovimientoContableDO movCon, in (movCon.movContDetalleSet) detalle where movCon.pucProy.proyecto.id = :idProyecto and movCon.id = detalle.movCon.id and detalle.pucProy.cuentaPuc.id = :idCuentaPuc order by movCon.fechaMov"),
	@NamedQuery(name = "movimientoContableDO.seleccionPorRangofechas", query = "select movCon from MovimientoContableDO movCon where movCon.pucProy.proyecto.id = :idProyecto and movCon.fechaMov >= :fechaInicio and movCon.fechaMov <= :fechaFin order by  movCon.fechaMov, movCon.ejecPres, movCon.recDet,  movCon.pucProy.cuentaPuc.codigo"),
	@NamedQuery(name = "movimientoContableDO.seleccionPorEjecPres", query = "select movCon from MovimientoContableDO movCon where movCon.pucProy.proyecto.id = :idProyecto and movCon.ejecPres.id = idEjecPres order by  movCon.fechaMov, movCon.ejecPres, movCon.pucProy.cuentaPuc.codigo"),
	@NamedQuery(name = "movimientoContableDO.seleccionPorRecursoDet", query = "select movCon from MovimientoContableDO movCon where movCon.pucProy.proyecto.id = :idProyecto and movCon.recDet.id = idRecursoDet order by  movCon.fechaMov, movCon.recDet, movCon.pucProy.cuentaPuc.codigo")
    })
public class MovimientoContableDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7601164096220519931L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "movCont_id", nullable = false, unique = true)
	private Long id;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "movCont_fechaReg", nullable = false)
	private Date fechaReg;

	@Temporal(TemporalType.DATE)
	@Column(name = "movCont_fechaMov", nullable = false)
	private Date fechaMov;
	
	
	@OneToOne(optional = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "movCont_ejecPres_id", referencedColumnName = "ejecPres_id", nullable = false)
	private EjecucionPresupuestoDO ejecPres;
	
	
	@OneToOne(optional = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "movCont_recDet_id", referencedColumnName = "recDet_id", nullable = false)
	private RecursoDetalleDO recDet;
	
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "movCont")
	@OrderBy(value="id") 	
	private Set<MovimientoContableDetalleDO> movContDetalleSet;
	
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
	 * @return the fechaReg
	 */
	public Date getFechaReg() {
		return fechaReg;
	}

	/**
	 * @param fechaReg the fechaReg to set
	 */
	public void setFechaReg(Date fechaReg) {
		this.fechaReg = fechaReg;
	}

	/**
	 * @return the fechaMov
	 */
	public Date getFechaMov() {
		return fechaMov;
	}

	/**
	 * @param fechaMov the fechaMov to set
	 */
	public void setFechaMov(Date fechaMov) {
		this.fechaMov = fechaMov;
	}
	
	
	/**
	 * @return the ejecPres
	 */
	public EjecucionPresupuestoDO getEjecPres() {
		return ejecPres;
	}

	/**
	 * @param ejecPres the ejecPres to set
	 */
	public void setEjecPres(EjecucionPresupuestoDO ejecPres) {
		this.ejecPres = ejecPres;
	}

	/**
	 * @return the recDet
	 */
	public RecursoDetalleDO getRecDet() {
		return recDet;
	}

	/**
	 * @param recDet the recDet to set
	 */
	public void setRecDet(RecursoDetalleDO recDet) {
		this.recDet = recDet;
	}
	
	/**
	 * @return the movContDetalleSet
	 */
	public Set<MovimientoContableDetalleDO> getMovContDetalleSet() {
		return movContDetalleSet;
	}

	/**
	 * @param movContDetalleSet the movContDetalleSet to set
	 */
	public void setMovContDetalleSet(
			Set<MovimientoContableDetalleDO> movContDetalleSet) {
		this.movContDetalleSet = movContDetalleSet;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((fechaMov == null) ? 0 : fechaMov.hashCode());
		result = prime * result
				+ ((fechaReg == null) ? 0 : fechaReg.hashCode());
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
		MovimientoContableDO other = (MovimientoContableDO) obj;
		if (fechaMov == null) {
			if (other.fechaMov != null)
				return false;
		} else if (!fechaMov.equals(other.fechaMov))
			return false;
		if (fechaReg == null) {
			if (other.fechaReg != null)
				return false;
		} else if (!fechaReg.equals(other.fechaReg))
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
		return "MovimientoContableDO [id=" + id + ", fechaReg=" + fechaReg
				+ ", fechaMov=" + fechaMov + "]";
	}

	
	
	
	
	
	
    

}
