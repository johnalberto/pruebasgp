package com.cpcoriente.sgp.springgwt.pro.server.informe.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ObjetivoDO;

@Entity
@Table(name="infointerobjetivodetalle",uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"infIntObjDet_infoInter_id", "infIntObjDet_objetivo_id","infIntObjDet_fechaReg"})
	    })
public class InfoInterObjetivoDetalleDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6422688622792106319L;
	
	public InfoInterObjetivoDetalleDO(){
		
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "infIntObjDet_id", nullable =  false)
	private Long id;

	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "infIntObjDet_objetivo_id", referencedColumnName = "objetivo_id", nullable = false)
	private ObjetivoDO objetivo;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "infIntObjDet_infoInter_id", referencedColumnName = "infoInter_id", nullable = false)
	private InformeInterventorDO infInterventor;
	
	@Column(name = "infIntObjDet_comentario", nullable = false )
	private String comentario;
	
	@Column(name = "infIntObjDet_calif", nullable = false)
	private float CalifObjetivo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "infIntObjDet_fechaReg", nullable = false)
	private Date fechaRegistro;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ObjetivoDO getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(ObjetivoDO objetivo) {
		this.objetivo = objetivo;
	}

	public InformeInterventorDO getInfInterventor() {
		return infInterventor;
	}

	public void setInfInterventor(InformeInterventorDO infInterventor) {
		this.infInterventor = infInterventor;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public float getCalifObjetivo() {
		return CalifObjetivo;
	}

	public void setCalifObjetivo(float califObjetivo) {
		CalifObjetivo = califObjetivo;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	@Override
	public String toString() {
		return "InformeInterventorObjetivoDO [id=" + id + ", objetivo="
				+ objetivo + ", infInterventor=" + infInterventor
				+ ", comentario=" + comentario + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((comentario == null) ? 0 : comentario.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((infInterventor == null) ? 0 : infInterventor.hashCode());
		result = prime * result
				+ ((objetivo == null) ? 0 : objetivo.hashCode());
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
		InfoInterObjetivoDetalleDO other = (InfoInterObjetivoDetalleDO) obj;
		if (comentario == null) {
			if (other.comentario != null)
				return false;
		} else if (!comentario.equals(other.comentario))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (infInterventor == null) {
			if (other.infInterventor != null)
				return false;
		} else if (!infInterventor.equals(other.infInterventor))
			return false;
		if (objetivo == null) {
			if (other.objetivo != null)
				return false;
		} else if (!objetivo.equals(other.objetivo))
			return false;
		return true;
	}
	
	
	
}
