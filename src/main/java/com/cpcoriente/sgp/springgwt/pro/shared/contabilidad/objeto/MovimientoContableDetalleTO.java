/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.objeto;

import java.io.Serializable;

import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.enumerador.TipoMovimientoContableEnum;

/**
 * @author CPC-04
 *
 */
public class MovimientoContableDetalleTO implements Comparable<MovimientoContableDetalleTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2793866536792414916L;



	/**
	 * 
	 */
	
	public int compareTo(MovimientoContableDetalleTO o) {

		return getId().compareTo(o.getId());
	}
	
	
    private Long id;
	
    private  PucPorProyectoTO pucProy;
    
    private float valor;
	
	private TipoMovimientoContableEnum tipo;
		
	private MovimientoContableTO movCont;

		

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
		public TipoMovimientoContableEnum getTipo() {
			return tipo;
		}

		/**
		 * @param tipo the tipo to set
		 */
		public void setTipo(TipoMovimientoContableEnum tipo) {
			this.tipo = tipo;
		}

		/**
		 * @return the pucProy
		 */
		public PucPorProyectoTO getPucProy() {
			return pucProy;
		}

		/**
		 * @param pucProy the pucProy to set
		 */
		public void setPucProy(PucPorProyectoTO pucProy) {
			this.pucProy = pucProy;
		}

		/**
		 * @return the movCont
		 */
		public MovimientoContableTO getMovCont() {
			return movCont;
		}

		/**
		 * @param movCont the movCont to set
		 */
		public void setMovCont(MovimientoContableTO movCont) {
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
			result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
			MovimientoContableDetalleTO other = (MovimientoContableDetalleTO) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (tipo != other.tipo)
				return false;
			if (Float.floatToIntBits(valor) != Float
					.floatToIntBits(other.valor))
				return false;
			return true;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "MovimientoContableDetalleTO [id=" + id + ", valor=" + valor
					+ ", tipo=" + tipo + "]";
		}

			

}