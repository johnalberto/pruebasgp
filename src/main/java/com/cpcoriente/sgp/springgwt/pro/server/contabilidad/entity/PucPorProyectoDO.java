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

import com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity.ProyectoDO;

/**
 * @author CPC-04
 *
 */


@Entity
@Table(name = "pucporproyecto", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"pucProy_proyecto_id", "pucProy_puc_id"})
})

@NamedQueries({
	@NamedQuery(name = "pucPorProyectoDO.listarTodoPorProyecto", query = "select pucPro from PucPorProyectoDO pucPro where pucPro.proyecto.id = :idProyecto order by pucPro.cuentaPuc.codigo"),
	@NamedQuery(name = "pucPorProyectoDO.seleccionPorCodigoNombre", query = "select pucPro from PucPorProyectoDO puc where pucPro.proyecto.id = :idProyecto and (lower(pucPro.cuentaPuc.nombre) like :parteNombre  OR lower(pucPro.cuentaPuc.codigo) = :parteCodigo) order by pucPro.cuentaPuc.codigo, pucPro.cuentaPuc.nombre")	
    })


public class PucPorProyectoDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8897799631817182662L;
	
	public PucPorProyectoDO() {
		super();
	}

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pucProy_id", nullable = false, unique = true)
	private Long id;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "pucProy_puc_id", referencedColumnName = "puc_id", nullable = false)
	private PucDO cuentaPuc;
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "pucProy_proyecto_id", referencedColumnName = "proyecto_id", nullable = false)
	private ProyectoDO proyecto;
	
	
	@ManyToOne(optional = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "pucProy_impuesto_id", referencedColumnName = "impuesto_id", nullable = false)
	private ImpuestoDO impuesto;


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
	 * @return the cuentaPuc
	 */
	public PucDO getCuentaPuc() {
		return cuentaPuc;
	}


	/**
	 * @param cuentaPuc the cuentaPuc to set
	 */
	public void setCuentaPuc(PucDO cuentaPuc) {
		this.cuentaPuc = cuentaPuc;
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


	/**
	 * @return the impuesto
	 */
	public ImpuestoDO getImpuesto() {
		return impuesto;
	}


	/**
	 * @param impuesto the impuesto to set
	 */
	public void setImpuesto(ImpuestoDO impuesto) {
		this.impuesto = impuesto;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cuentaPuc == null) ? 0 : cuentaPuc.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((impuesto == null) ? 0 : impuesto.hashCode());
		result = prime * result
				+ ((proyecto == null) ? 0 : proyecto.hashCode());
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
		PucPorProyectoDO other = (PucPorProyectoDO) obj;
		if (cuentaPuc == null) {
			if (other.cuentaPuc != null)
				return false;
		} else if (!cuentaPuc.equals(other.cuentaPuc))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (impuesto == null) {
			if (other.impuesto != null)
				return false;
		} else if (!impuesto.equals(other.impuesto))
			return false;
		if (proyecto == null) {
			if (other.proyecto != null)
				return false;
		} else if (!proyecto.equals(other.proyecto))
			return false;
		return true;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PucPorProyectoDO [id=" + id + ", cuentaPuc=" + cuentaPuc
				+ ", proyecto=" + proyecto + "]";
	}
	
	

	
	
}
