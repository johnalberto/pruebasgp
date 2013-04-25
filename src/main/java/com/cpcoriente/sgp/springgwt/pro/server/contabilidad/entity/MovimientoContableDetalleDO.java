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
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author CPC-04
 *
 */


@Entity
@Table(name = "movimientocontabledetalle", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"movContDet_movCont_id", "movContDet_pucProy_id"})
})



public class MovimientoContableDetalleDO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -92338283040296332L;


	public MovimientoContableDetalleDO() {
		super();
	}

	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "movContDet_id", nullable = false, unique = true)
	private Long id;
	

	@Column(name = "movContDet_valor", nullable = false)
	private float valor;
	
	@Column(name = "movContDet_tipo", nullable = false)
	private int tipo;

	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "movContDet_pucProy_id", referencedColumnName = "pucProy_id", nullable = false, insertable = true, updatable = true)
	private  PucPorProyectoDO pucProy;

	
	@ManyToOne(optional = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "movContDet_movCont_id", referencedColumnName = "movCont_id", nullable = false, insertable = true, updatable = true)
	private MovimientoContableDO movCont;
	
	
	
	
	
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
	 * @return the valor
	 */
	public float getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(float valor) {
		this.valor = valor;
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
	 * @return the pucProy
	 */
	public PucPorProyectoDO getPucProy() {
		return pucProy;
	}

	/**
	 * @param pucProy the pucProy to set
	 */
	public void setPucProy(PucPorProyectoDO pucProy) {
		this.pucProy = pucProy;
	}
	
	/**
	 * @return the movCont
	 */
	public MovimientoContableDO getMovCont() {
		return movCont;
	}

	/**
	 * @param movCont the movCont to set
	 */
	public void setMovCont(MovimientoContableDO movCont) {
		this.movCont = movCont;
	}

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + tipo;
		result = prime * result + Float.floatToIntBits(valor);
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
		MovimientoContableDetalleDO other = (MovimientoContableDetalleDO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tipo != other.tipo)
			return false;
		if (Float.floatToIntBits(valor) != Float.floatToIntBits(other.valor))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MovimientoContableDetalleDO [id=" + id + ", valor=" + valor
				+ ", tipo=" + tipo + "]";
	}



}
