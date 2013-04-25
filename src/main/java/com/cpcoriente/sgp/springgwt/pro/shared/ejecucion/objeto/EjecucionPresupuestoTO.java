package com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.objeto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.MovimientoContableTO;
import com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.enumerador.TipoComprobanteEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RecursoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.UnidadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.ProyectoEntidadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TerceroTO;


public class EjecucionPresupuestoTO implements Comparable<EjecucionPresupuestoTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3590051269885940600L;

	public int compareTo(EjecucionPresupuestoTO o) {
		
		return getId().compareTo(o.getId());

		
	}
	
	private Long id;
	
	private int version;
	
	private Date fechaRegistro;
	
	private Date fechaEjecucion;
	
	private TipoComprobanteEnum tipoComprobante;
	
	private String numeroComprobante;
	
	private String observaciones;
	
	private Float valorRetencionImpuesto;
	
	private Float cantidad;
	
	private Float valorUnitario;
	
	private boolean aprobado;
	
	private boolean ejecutado;
	
	private RecursoTO recurso;
	
	private ProyectoEntidadTO proyectoPorEntidad;
	
	private UnidadTO unidad;
	
	private TerceroTO tercero;
	
	private List<DocEjecucionPresupuestoTO> documentoLista;
	
	private MovimientoContableTO movimientoContable;
	
	
	
	

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
	public TipoComprobanteEnum getTipoComprobante() {
		return tipoComprobante;
	}

	/**
	 * @param tipoComprobante the tipoComprobante to set
	 */
	public void setTipoComprobante(TipoComprobanteEnum tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}

	/**
	 * @return the numeroComprobante
	 */
	public String getNumeroComprobante() {
		return numeroComprobante;
	}

	/**
	 * @param numeroComprobante the numeroComprobante to set
	 */
	public void setNumeroComprobante(String numeroComprobante) {
		this.numeroComprobante = numeroComprobante;
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
	public RecursoTO getRecurso() {
		return recurso;
	}

	/**
	 * @param recurso the recurso to set
	 */
	public void setRecurso(RecursoTO recurso) {
		this.recurso = recurso;
	}

	/**
	 * @return the proyectoPorEntidad
	 */
	public ProyectoEntidadTO getProyectoPorEntidad() {
		return proyectoPorEntidad;
	}

	/**
	 * @param proyectoPorEntidad the proyectoPorEntidad to set
	 */
	public void setProyectoPorEntidad(ProyectoEntidadTO proyectoPorEntidad) {
		this.proyectoPorEntidad = proyectoPorEntidad;
	}

	/**
	 * @return the unidad
	 */
	public UnidadTO getUnidad() {
		return unidad;
	}

	/**
	 * @param unidad the unidad to set
	 */
	public void setUnidad(UnidadTO unidad) {
		this.unidad = unidad;
	}

	
	/**
	 * @return the documentoLista
	 */
	public List<DocEjecucionPresupuestoTO> getDocumentoLista() {
		return documentoLista;
	}

	/**
	 * @param documentoLista the documentoLista to set
	 */
	public void setDocumentoLista(List<DocEjecucionPresupuestoTO> documentoLista) {
		this.documentoLista = documentoLista;
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
	public MovimientoContableTO getMovimientoContable() {
		return movimientoContable;
	}

	/**
	 * @param movimientoContable the movimientoContable to set
	 */
	public void setMovimientoContable(MovimientoContableTO movimientoContable) {
		this.movimientoContable = movimientoContable;
	}

	/**
	 * @return the tercero
	 */
	public TerceroTO getTercero() {
		return tercero;
	}

	/**
	 * @param tercero the tercero to set
	 */
	public void setTercero(TerceroTO tercero) {
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
		result = prime
				* result
				+ ((numeroComprobante == null) ? 0 : numeroComprobante
						.hashCode());
		result = prime * result
				+ ((observaciones == null) ? 0 : observaciones.hashCode());
		result = prime * result
				+ ((tipoComprobante == null) ? 0 : tipoComprobante.hashCode());
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
		EjecucionPresupuestoTO other = (EjecucionPresupuestoTO) obj;
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
		if (numeroComprobante == null) {
			if (other.numeroComprobante != null)
				return false;
		} else if (!numeroComprobante.equals(other.numeroComprobante))
			return false;
		if (observaciones == null) {
			if (other.observaciones != null)
				return false;
		} else if (!observaciones.equals(other.observaciones))
			return false;
		if (tipoComprobante != other.tipoComprobante)
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
		return "EjecucionPresupuestoTO [id=" + id + ", fechaRegistro="
				+ fechaRegistro + ", fechaEjecucion=" + fechaEjecucion
				+ ", tipoComprobante=" + tipoComprobante
				+ ", numeroComprobante=" + numeroComprobante
				+ ", observaciones=" + observaciones
				+ ", valorRetencionImpuesto=" + valorRetencionImpuesto
				+ ", cantidad=" + cantidad + ", valorUnitario=" + valorUnitario
				+ ", aprobado=" + aprobado + ", ejecutado=" + ejecutado + "]";
	}
	
	

}
