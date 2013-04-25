package com.cpcoriente.sgp.springgwt.pro.server.ejecucion.entity;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.entity.MovimientoContableDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RecursoDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.UnidadDO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ProyectoEntidadDO;
import com.cpcoriente.sgp.springgwt.pro.server.tercero.entity.TerceroDO;



@Entity
@Table(name="ejecucionpresupuestal")

public class EjecucionPresupuestoDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8837978964173131980L;

	public EjecucionPresupuestoDO(){
		super();
	}
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ejecPres_id", nullable = false, unique = true)
	private Long id;
	
	@Version 
	@Column(name="ejecPres_version")
	private int version;	
	
	@Temporal (TemporalType.TIMESTAMP)
	@Column(name = "ejecPres_fechaRegistro", nullable = false)
	private Date fechaRegistro;
	
	@Temporal (TemporalType.TIMESTAMP)
	@Column(name = "ejecPres_fechaEjecucion", nullable = false)
	private Date fechaEjecucion;
	
	@Column(name = "ejecPres_tipoComprobante", nullable = false)
	private int tipoComprobante;
	
	@Column(name = "ejecPres_numComprobante", nullable = false)
	private String numComprobante;
	
	@Column(name = "ejectPres_observaciones", nullable = false)
	private String observaciones;
	
		
	@Column(name = "ejecPres_valorRetencionImpuesto", nullable = false, unique = false)
	private Float valorRetencionImpuesto;
	
	@Column(name = "ejecPres_cantidad", nullable = false, unique = false)
	private Float cantidad;
	
	@Column(name = "ejecPres_valorUnitario", nullable = false, unique = false)
	private Float valorUnitario;
	
	
	@Column(name = "ejecPres_aprobado", nullable = false)
	private boolean aprobado;
	
	@Column(name = "ejecPres_ejecutado", nullable = false)
	private boolean ejecutado;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "ejecPres_recurso_id", referencedColumnName = "recurso_id", nullable = false)
	private RecursoDO recurso;
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "ejecPres_proyEnt_id", referencedColumnName = "proyEnt_id", nullable = false)
	private ProyectoEntidadDO proyectoEntidad;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "ejecPres_unidad_id", referencedColumnName = "unidad_id", nullable = false)
	private UnidadDO unidad;
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "ejecPres_tercero_id", referencedColumnName = "tercero_id", nullable = false)
	private TerceroDO tercero;
	
	@OneToOne(optional = false, fetch = FetchType.EAGER, mappedBy = "ejecPres")
	private MovimientoContableDO movimientoContable;
	


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
	 * @return the fechaRegistro
	 */
	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	/**
	 * @param fechaRegistro the fechaRegistro to set
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	/**
	 * @return the fechaEjecucion
	 */
	public Date getFechaEjecucion() {
		return fechaEjecucion;
	}

	/**
	 * @param fechaEjecucion the fechaEjecucion to set
	 */
	public void setFechaEjecucion(Date fechaEjecucion) {
		this.fechaEjecucion = fechaEjecucion;
	}

	/**
	 * @return the tipoComprobante
	 */
	public int getTipoComprobante() {
		return tipoComprobante;
	}

	/**
	 * @param tipoComprobante the tipoComprobante to set
	 */
	public void setTipoComprobante(int tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}

	/**
	 * @return the numComprobante
	 */
	public String getNumComprobante() {
		return numComprobante;
	}

	/**
	 * @param numComprobante the numComprobante to set
	 */
	public void setNumComprobante(String numComprobante) {
		this.numComprobante = numComprobante;
	}

	/**
	 * @return the observaciones
	 */
	public String getObservaciones() {
		return observaciones;
	}

	/**
	 * @param observaciones the observaciones to set
	 */
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	

	/**
	 * @return the valorRetencionImpuesto
	 */
	public Float getValorRetencionImpuesto() {
		return valorRetencionImpuesto;
	}

	/**
	 * @param valorRetencionImpuesto the valorRetencionImpuesto to set
	 */
	public void setValorRetencionImpuesto(Float valorRetencionImpuesto) {
		this.valorRetencionImpuesto = valorRetencionImpuesto;
	}

	/**
	 * @return the cantidad
	 */
	public Float getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(Float cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return the valorUnitario
	 */
	public Float getValorUnitario() {
		return valorUnitario;
	}

	/**
	 * @param valorUnitario the valorUnitario to set
	 */
	public void setValorUnitario(Float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	/**
	 * @return the aprobado
	 */
	public boolean isAprobado() {
		return aprobado;
	}

	/**
	 * @param aprobado the aprobado to set
	 */
	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}

	/**
	 * @return the ejecutado
	 */
	public boolean isEjecutado() {
		return ejecutado;
	}

	/**
	 * @param ejecutado the ejecutado to set
	 */
	public void setEjecutado(boolean ejecutado) {
		this.ejecutado = ejecutado;
	}

	/**
	 * @return the recurso
	 */
	public RecursoDO getRecurso() {
		return recurso;
	}

	/**
	 * @param recurso the recurso to set
	 */
	public void setRecurso(RecursoDO recurso) {
		this.recurso = recurso;
	}

	/**
	 * @return the proyectoEntidad
	 */
	public ProyectoEntidadDO getProyectoEntidad() {
		return proyectoEntidad;
	}

	/**
	 * @param proyectoEntidad the proyectoEntidad to set
	 */
	public void setProyectoEntidad(ProyectoEntidadDO proyectoEntidad) {
		this.proyectoEntidad = proyectoEntidad;
	}

	/**
	 * @return the unidad
	 */
	public UnidadDO getUnidad() {
		return unidad;
	}

	/**
	 * @param unidad the unidad to set
	 */
	public void setUnidad(UnidadDO unidad) {
		this.unidad = unidad;
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
	 * @return the movimientoContable
	 */
	public MovimientoContableDO getMovimientoContable() {
		return movimientoContable;
	}

	/**
	 * @param movimientoContable the movimientoContable to set
	 */
	public void setMovimientoContable(MovimientoContableDO movimientoContable) {
		this.movimientoContable = movimientoContable;
	}

	/**
	 * @return the tercero
	 */
	public TerceroDO getTercero() {
		return tercero;
	}

	/**
	 * @param tercero the tercero to set
	 */
	public void setTercero(TerceroDO tercero) {
		this.tercero = tercero;
	}

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (aprobado ? 1231 : 1237);
		result = prime * result
				+ ((cantidad == null) ? 0 : cantidad.hashCode());
		result = prime * result + (ejecutado ? 1231 : 1237);
		result = prime * result
				+ ((fechaEjecucion == null) ? 0 : fechaEjecucion.hashCode());
		result = prime * result
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((numComprobante == null) ? 0 : numComprobante.hashCode());
		result = prime * result
				+ ((observaciones == null) ? 0 : observaciones.hashCode());
		result = prime * result + ((recurso == null) ? 0 : recurso.hashCode());
		result = prime * result + tipoComprobante;
		result = prime * result + ((unidad == null) ? 0 : unidad.hashCode());
		result = prime
				* result
				+ ((valorRetencionImpuesto == null) ? 0
						: valorRetencionImpuesto.hashCode());
		result = prime * result
				+ ((valorUnitario == null) ? 0 : valorUnitario.hashCode());
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
		EjecucionPresupuestoDO other = (EjecucionPresupuestoDO) obj;
		if (aprobado != other.aprobado)
			return false;
		if (cantidad == null) {
			if (other.cantidad != null)
				return false;
		} else if (!cantidad.equals(other.cantidad))
			return false;
		if (ejecutado != other.ejecutado)
			return false;
		if (fechaEjecucion == null) {
			if (other.fechaEjecucion != null)
				return false;
		} else if (!fechaEjecucion.equals(other.fechaEjecucion))
			return false;
		if (fechaRegistro == null) {
			if (other.fechaRegistro != null)
				return false;
		} else if (!fechaRegistro.equals(other.fechaRegistro))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numComprobante == null) {
			if (other.numComprobante != null)
				return false;
		} else if (!numComprobante.equals(other.numComprobante))
			return false;
		if (observaciones == null) {
			if (other.observaciones != null)
				return false;
		} else if (!observaciones.equals(other.observaciones))
			return false;
		if (recurso == null) {
			if (other.recurso != null)
				return false;
		} else if (!recurso.equals(other.recurso))
			return false;
		if (tipoComprobante != other.tipoComprobante)
			return false;
		if (unidad == null) {
			if (other.unidad != null)
				return false;
		} else if (!unidad.equals(other.unidad))
			return false;
		if (valorRetencionImpuesto == null) {
			if (other.valorRetencionImpuesto != null)
				return false;
		} else if (!valorRetencionImpuesto.equals(other.valorRetencionImpuesto))
			return false;
		if (valorUnitario == null) {
			if (other.valorUnitario != null)
				return false;
		} else if (!valorUnitario.equals(other.valorUnitario))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EjecucionPresupuestoDO [id=" + id + ", fechaRegistro="
				+ fechaRegistro + ", fechaEjecucion=" + fechaEjecucion
				+ ", tipoComprobante=" + tipoComprobante + ", numComprobante="
				+ numComprobante + ", observaciones=" + observaciones
				+ ", valorRetencionImpuesto=" + valorRetencionImpuesto
				+ ", cantidad=" + cantidad + ", valorUnitario=" + valorUnitario
				+ ", aprobado=" + aprobado + ", ejecutado=" + ejecutado
				+ ", recurso=" + recurso + ", unidad=" + unidad + "]";
	}


	
	
	
}
