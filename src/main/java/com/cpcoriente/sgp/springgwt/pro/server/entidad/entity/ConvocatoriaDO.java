package com.cpcoriente.sgp.springgwt.pro.server.entidad.entity;

import java.io.Serializable;
import java.util.Set;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



@Entity
@Table(name="convocatoria", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"convocatoria_division_id", "convocatoria_codigo"})})
@NamedQueries({
	@NamedQuery(name = "convoDO.listarTodo", query = "select con from ConvocatoriaDO con"),
	@NamedQuery(name = "convoDO.seleccionPorDivision", query = "select con from ConvocatoriaDO con where con.division.id :idDivision order by con.id asc")
	})
public class ConvocatoriaDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	public ConvocatoriaDO(){
		
		super();
	}

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "convocatoria_id", nullable = false, unique = true)
	private Long id;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "convocatoria_division_id", referencedColumnName = "division_id", nullable = false)
	private DivisionDO division;
	
	@Column(name = "convocatoria_codigo", nullable = false)
	private String codigo;

	 
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "convocatoria")
	private Set<TerminoConvocatoriaDO> terminoSet;
	 

	@Override
	public String toString() {
		return "ConvocatoriaDO [id=" + id + ", codigo=" + codigo + "]";
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		ConvocatoriaDO other = (ConvocatoriaDO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
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

	public DivisionDO getDivision() {
		return division;
	}

	public void setDivision(DivisionDO division) {
		this.division = division;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public Set<TerminoConvocatoriaDO> getTerminoSet() {
		return terminoSet;
	}


	public void setTerminoSet(Set<TerminoConvocatoriaDO> terminoSet) {
		this.terminoSet = terminoSet;
	}

	 
}
