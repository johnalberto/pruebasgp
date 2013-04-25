package com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto;

import java.io.Serializable;

import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto.MovimientoContableTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.enumerador.TipoAporteEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto.ProyectoEntidadTO;

public class RecursoDetalleTO implements Comparable<RecursoDetalleTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int compareTo(RecursoDetalleTO o) {
		
		return getId().compareTo(o.getId());

	}
	
	private Long id;
	
	private int version;
	
	private RecursoTO recurso;
	
	private ProyectoEntidadTO entProyecto;
	
	private float valEfectivo;
	
	private float valEspecie;
	
	private TipoAporteEnum tipoAporte;
	
	private MovimientoContableTO movimiento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public RecursoTO getRecurso() {
		return recurso;
	}

	public void setRecurso(RecursoTO recurso) {
		this.recurso = recurso;
	}

	public float getValEfectivo() {
		return valEfectivo;
	}

	public void setValEfectivo(float valEfectivo) {
		this.valEfectivo = valEfectivo;
	}

	public float getValEspecie() {
		return valEspecie;
	}

	public void setValEspecie(float valEspecie) {
		this.valEspecie = valEspecie;
	}

	public TipoAporteEnum getTipoAporte() {
		return tipoAporte;
	}

	public void setTipoAporte(TipoAporteEnum tipoAporte) {
		this.tipoAporte = tipoAporte;
	}

	@Override
	public String toString() {
		return "RecursoDetalleTO [id=" + id + ", version=" + version
				+ ", recurso=" + recurso + ", entProyecto=" + entProyecto
				+ ", tipoAporte=" + tipoAporte + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((entProyecto == null) ? 0 : entProyecto.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((recurso == null) ? 0 : recurso.hashCode());
		result = prime * result
				+ ((tipoAporte == null) ? 0 : tipoAporte.hashCode());
		result = prime * result + version;
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
		RecursoDetalleTO other = (RecursoDetalleTO) obj;
		if (entProyecto == null) {
			if (other.entProyecto != null)
				return false;
		} else if (!entProyecto.equals(other.entProyecto))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (recurso == null) {
			if (other.recurso != null)
				return false;
		} else if (!recurso.equals(other.recurso))
			return false;
		if (tipoAporte != other.tipoAporte)
			return false;
		if (version != other.version)
			return false;
		return true;
	}

	public ProyectoEntidadTO getEntProyecto() {
		return entProyecto;
	}

	public void setEntProyecto(ProyectoEntidadTO entProyecto) {
		this.entProyecto = entProyecto;
	}

	public MovimientoContableTO getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(MovimientoContableTO movimiento) {
		this.movimiento = movimiento;
	}
	

}
