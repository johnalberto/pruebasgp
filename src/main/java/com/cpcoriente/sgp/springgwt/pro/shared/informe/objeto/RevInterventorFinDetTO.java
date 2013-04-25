package com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto;

import java.io.Serializable;

import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RecursoTO;

public class RevInterventorFinDetTO implements Comparable<RevInterventorFinDetTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8253457584669061345L;

	public int compareTo(RevInterventorFinDetTO o) {
		
		return getId().compareTo(o.getId());

	}
	
	
	private Long id;
	
	private RecursoTO recurso;
	
	private float calificacionRecurso;
	
	private RevInterventorFinTO revInterventorFin;
	
	private String comentarioRecurso;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	
	@Override
	public String toString() {
		return "RevInterventorFinDetTO [id=" + id + ", calificacionRecurso="
				+ calificacionRecurso + "]";
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime
				* result
				+ ((revInterventorFin == null) ? 0 : revInterventorFin
						.hashCode());
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
		RevInterventorFinDetTO other = (RevInterventorFinDetTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (revInterventorFin == null) {
			if (other.revInterventorFin != null)
				return false;
		} else if (!revInterventorFin.equals(other.revInterventorFin))
			return false;
		return true;
	}

	public RecursoTO getRecurso() {
		return recurso;
	}

	public void setRecurso(RecursoTO recurso) {
		this.recurso = recurso;
	}

	public float getCalificacionRecurso() {
		return calificacionRecurso;
	}

	public void setCalificacionRecurso(float calificacionRecurso) {
		this.calificacionRecurso = calificacionRecurso;
	}

	public RevInterventorFinTO getRevInterventorFin() {
		return revInterventorFin;
	}

	public void setRevInterventorFin(RevInterventorFinTO revInterventorFin) {
		this.revInterventorFin = revInterventorFin;
	}

	public String getComentarioRecurso() {
		return comentarioRecurso;
	}

	public void setComentarioRecurso(String comentarioRecurso) {
		this.comentarioRecurso = comentarioRecurso;
	}
	
	
	

}
