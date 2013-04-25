package com.cpcoriente.sgp.springgwt.pro.shared.proyecto.objeto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.actividad.objeto.ObjetivoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.ConvocatoriaTO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.RubroProyectoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.enumerador.EstadoProyectoEnum;

public class ProyectoTO implements Comparable<ProyectoTO>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2312946443246067877L;

	public int compareTo(ProyectoTO o) {
		
		return getId().compareTo(o.getId());

	}

	
	private Long id;
	
	private ConvocatoriaTO convocatoria;
	
	private String codigo;
	
	private String titulo;
	
	private EstadoProyectoEnum estado;
	
	
	private Date fechaInicio;
	
	private Date fechaFin;
	
	private float porFinanziado;
	
	private float porContrapartida;
	
	private List<ObjetivoTO> objetivosList;
	
	private List<VersionProyectoTO> versionProyectoList;
	
	private List<RubroProyectoTO> rubroProyectoList;

	private int version;
	
	
	@Override
	public String toString() {
		return "ProyectoTO [id=" + id + ", codigo=" + codigo + ", titulo="
				+ titulo + ", estado=" + estado + ", fechaInicio="
				+ fechaInicio + ", fechaFin=" + fechaFin + "]";
	}

	
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
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		ProyectoTO other = (ProyectoTO) obj;
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
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public EstadoProyectoEnum getEstado() {
		return estado;
	}

	public void setEstado(EstadoProyectoEnum estado) {
		this.estado = estado;
	}

	

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public List<ObjetivoTO> getObjetivosList() {
		return objetivosList;
	}

	public void setObjetivosList(List<ObjetivoTO> objetivosList) {
		this.objetivosList = objetivosList;
	}

	public List<VersionProyectoTO> getVersionProyectoList() {
		return versionProyectoList;
	}

	public void setVersionProyectoList(List<VersionProyectoTO> versionProyectoList) {
		this.versionProyectoList = versionProyectoList;
	}


	public float getPorFinanziado() {
		return porFinanziado;
	}


	public void setPorFinanziado(float porFinanziado) {
		this.porFinanziado = porFinanziado;
	}


	public float getPorContrapartida() {
		return porContrapartida;
	}


	public void setPorContrapartida(float porContrapartida) {
		this.porContrapartida = porContrapartida;
	}


	public List<RubroProyectoTO> getRubroProyectoList() {
		return rubroProyectoList;
	}


	public void setRubroProyectoList(List<RubroProyectoTO> rubroProyectoList) {
		this.rubroProyectoList = rubroProyectoList;
	}


	public ConvocatoriaTO getConvocatoria() {
		return convocatoria;
	}


	public void setConvocatoria(ConvocatoriaTO convocatoria) {
		this.convocatoria = convocatoria;
	}


	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	
	
	


		
		
}
