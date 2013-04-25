package com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto;

import java.io.Serializable;
import java.util.List;

public class ConvocatoriaTO implements Comparable<ConvocatoriaTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1238950575866298719L;

	public int compareTo(ConvocatoriaTO o) {
		
		return getId().compareTo(o.getId());

	}

	
	private Long id;
	
	private DivisionTO division;
	
	private String codigo;

	private List<TerminoConvocatoriaTO> terminoList;

	
	
	@Override
	public String toString() {
		return "ConvocatoriaTO [id=" + id + ", division=" + division
				+ ", codigo=" + codigo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((division == null) ? 0 : division.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		ConvocatoriaTO other = (ConvocatoriaTO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (division == null) {
			if (other.division != null)
				return false;
		} else if (!division.equals(other.division))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DivisionTO getDivision() {
		return division;
	}

	public void setDivision(DivisionTO division) {
		this.division = division;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<TerminoConvocatoriaTO> getTerminoList() {
		return terminoList;
	}

	public void setTerminoList(List<TerminoConvocatoriaTO> terminoList) {
		this.terminoList = terminoList;
	}
	
	
	
}
