/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.personal.enumerador.EstadoContratoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.enumerador.TipoContratoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.enumerador.TipoTiempoDedicacionEnum;

/**
 * @author CPC-04
 *
 */
public class ContratoTO implements Comparable<ContratoTO>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4925407468117459854L;

	public int compareTo(ContratoTO obj) {
		
		return getId().compareTo(obj.getId());
	}

	
	
	private Long id;
	
	private int version;
	
	private String codigo;
	
	private TipoContratoEnum tipo;
	
	private EstadoContratoEnum estado;
	
	private TipoTiempoDedicacionEnum tiempoDedicado;

	private Date fechaInicio;
	
	private Date fechaFin;
	
	private Float valorTotal;
	
	private Float valorMensual;
	
	private CargoPorPersonalTO cpp;
	
	private List<DocContratoTO> documentoList;
	
	private List<ClausulaContratoTO> clausulaLista;
	
	
	

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
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the tipo
	 */
	public TipoContratoEnum getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoContratoEnum tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the estado
	 */
	public EstadoContratoEnum getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(EstadoContratoEnum estado) {
		this.estado = estado;
	}

	/**
	 * @return the tiempoDedicado
	 */
	public TipoTiempoDedicacionEnum getTiempoDedicado() {
		return tiempoDedicado;
	}

	/**
	 * @param tiempoDedicado the tiempoDedicado to set
	 */
	public void setTiempoDedicado(TipoTiempoDedicacionEnum tiempoDedicado) {
		this.tiempoDedicado = tiempoDedicado;
	}


	/**
	 * @return the fechaInicio
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * @return the fechaFin
	 */
	public Date getFechaFin() {
		return fechaFin;
	}

	/**
	 * @param fechaFin the fechaFin to set
	 */
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	/**
	 * @return the valorTotal
	 */
	public Float getValorTotal() {
		return valorTotal;
	}

	/**
	 * @param valorTotal the valorTotal to set
	 */
	public void setValorTotal(Float valorTotal) {
		this.valorTotal = valorTotal;
	}

	/**
	 * @return the valorMensual
	 */
	public Float getValorMensual() {
		return valorMensual;
	}

	/**
	 * @param valorMensual the valorMensual to set
	 */
	public void setValorMensual(Float valorMensual) {
		this.valorMensual = valorMensual;
	}

	/**
	 * @return the documentoList
	 */
	public List<DocContratoTO> getDocumentoList() {
		return documentoList;
	}

	/**
	 * @param documentoList the documentoList to set
	 */
	public void setDocumentoList(List<DocContratoTO> documentoList) {
		this.documentoList = documentoList;
	}

	/**
	 * @return the cpp
	 */
	public CargoPorPersonalTO getCpp() {
		return cpp;
	}

	/**
	 * @param cpp the cpp to set
	 */
	public void setCpp(CargoPorPersonalTO cpp) {
		this.cpp = cpp;
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
	 * @return the clausulaLista
	 */
	public List<ClausulaContratoTO> getClausulaLista() {
		return clausulaLista;
	}

	/**
	 * @param clausulaLista the clausulaSet to set
	 */
	public void setClausulaLista(List<ClausulaContratoTO> clausulaLista) {
		this.clausulaLista = clausulaLista;
	}

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result
				+ ((fechaFin == null) ? 0 : fechaFin.hashCode());
		result = prime * result
				+ ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((tiempoDedicado == null) ? 0 : tiempoDedicado.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result
				+ ((valorMensual == null) ? 0 : valorMensual.hashCode());
		result = prime * result
				+ ((valorTotal == null) ? 0 : valorTotal.hashCode());
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
		ContratoTO other = (ContratoTO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (estado != other.estado)
			return false;
		if (fechaFin == null) {
			if (other.fechaFin != null)
				return false;
		} else if (!fechaFin.equals(other.fechaFin))
			return false;
		if (fechaInicio == null) {
			if (other.fechaInicio != null)
				return false;
		} else if (!fechaInicio.equals(other.fechaInicio))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tiempoDedicado != other.tiempoDedicado)
			return false;
		if (tipo != other.tipo)
			return false;
		if (valorMensual == null) {
			if (other.valorMensual != null)
				return false;
		} else if (!valorMensual.equals(other.valorMensual))
			return false;
		if (valorTotal == null) {
			if (other.valorTotal != null)
				return false;
		} else if (!valorTotal.equals(other.valorTotal))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ContratoTO [id=" + id + ", codigo=" + codigo + ", tipo=" + tipo
				+ ", estado=" + estado + ", tiempoDedicado=" + tiempoDedicado
				+ ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ ", valorTotal=" + valorTotal + ", valorMensual="
				+ valorMensual + "]";
	}
	
	
}
