package com.cpcoriente.sgp.springgwt.pro.server.informe.entity;

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
import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RecursoDO;


@Entity
@Table(name="revisioninterventorfindetalle")
public class RevInterventorFinDetDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6784053505221167294L;
	
	public RevInterventorFinDetDO(){
		
		super();
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "revInterFinDet_id", nullable =  false)
	private Long id;
	
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "revInterFinDet_recurso_id", referencedColumnName = "recurso_id", nullable = false)
	private RecursoDO recurso;

	
	
	@Column(name = "revInterFinDet_recurso_comentario", nullable = false )
	private String recursoComentario;
	
	
	@Column(name = "revInterFinDet_recurso_calif", nullable = false )
	private float recursoCali;
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "revInterFinDet_revInterFin_id", referencedColumnName = "recurso_id", nullable = false)
	private RevInterventorFinDO revIntFin;

	
	
	@Override
	public String toString() {
		return "RevInterventorFinDetDO [id=" + id + ", recurso=" + recurso
				+ ", recursoComentario=" + recursoComentario + ", revIntFin="
				+ revIntFin + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((recurso == null) ? 0 : recurso.hashCode());
		result = prime
				* result
				+ ((recursoComentario == null) ? 0 : recursoComentario
						.hashCode());
		result = prime * result
				+ ((revIntFin == null) ? 0 : revIntFin.hashCode());
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
		RevInterventorFinDetDO other = (RevInterventorFinDetDO) obj;
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
		if (recursoComentario == null) {
			if (other.recursoComentario != null)
				return false;
		} else if (!recursoComentario.equals(other.recursoComentario))
			return false;
		if (revIntFin == null) {
			if (other.revIntFin != null)
				return false;
		} else if (!revIntFin.equals(other.revIntFin))
			return false;
		return true;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public RecursoDO getRecurso() {
		return recurso;
	}


	public void setRecurso(RecursoDO recurso) {
		this.recurso = recurso;
	}


	public String getRecursoComentario() {
		return recursoComentario;
	}


	public void setRecursoComentario(String recursoComentario) {
		this.recursoComentario = recursoComentario;
	}


	public float getRecursoCali() {
		return recursoCali;
	}


	public void setRecursoCali(float recursoCali) {
		this.recursoCali = recursoCali;
	}


	public RevInterventorFinDO getRevIntFin() {
		return revIntFin;
	}


	public void setRevIntFin(RevInterventorFinDO revIntFin) {
		this.revIntFin = revIntFin;
	}
	
	
	
}
