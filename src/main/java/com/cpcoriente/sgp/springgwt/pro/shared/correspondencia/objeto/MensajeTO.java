package com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.objeto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.enumerador.EstadoMensajeEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.enumerador.NaturalezaMensajeEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.enumerador.PrioridadMensajeEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.enumerador.TipoMensajeEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioProyectoEntidadTO;

public class MensajeTO implements Comparable<MensajeTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5921418578501515024L;

	public int compareTo(MensajeTO o) {
		
		return getId().compareTo(o.getId());

	}
	
	private Long id;
		
	private String asunto;
	
	private String codigo;
	
	private String cuerpo;
	
	private TipoMensajeEnum tipo;
	
	private EstadoMensajeEnum estado;
	
	private PrioridadMensajeEnum prioridad;
	
	private Date fechaRegistro;
	
	
	private UsuarioProyectoEntidadTO usuario;
	
	
    private NaturalezaMensajeEnum naturaleza;
    
	private List<DocMensajeTO> docMensajeList; 

    private List<DestinoMensajeTO> desMensajeList;

	
	@Override
	public String toString() {
		return "MensajeTO [id=" + id + ", asunto=" + asunto + ", codigo="
				+ codigo + ", cuerpo=" + cuerpo + ", tipo=" + tipo
				+ ", estado=" + estado + ", prioridad=" + prioridad
				+ ", fechaRegistro=" + fechaRegistro + ", usuario=" + usuario
				+ ", naturaleza=" + naturaleza + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((asunto == null) ? 0 : asunto.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((cuerpo == null) ? 0 : cuerpo.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((naturaleza == null) ? 0 : naturaleza.hashCode());
		result = prime * result
				+ ((prioridad == null) ? 0 : prioridad.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		MensajeTO other = (MensajeTO) obj;
		if (asunto == null) {
			if (other.asunto != null)
				return false;
		} else if (!asunto.equals(other.asunto))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (cuerpo == null) {
			if (other.cuerpo != null)
				return false;
		} else if (!cuerpo.equals(other.cuerpo))
			return false;
		if (estado != other.estado)
			return false;
		if (fechaRegistro == null) {
			if (other.fechaRegistro != null)
				return false;
		} else if (!fechaRegistro.equals(other.fechaRegistro))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (naturaleza != other.naturaleza)
			return false;
		if (prioridad != other.prioridad)
			return false;
		if (tipo != other.tipo)
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public TipoMensajeEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoMensajeEnum tipo) {
		this.tipo = tipo;
	}

	public EstadoMensajeEnum getEstado() {
		return estado;
	}

	public void setEstado(EstadoMensajeEnum estado) {
		this.estado = estado;
	}

	public PrioridadMensajeEnum getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(PrioridadMensajeEnum prioridad) {
		this.prioridad = prioridad;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	
	public NaturalezaMensajeEnum getNaturaleza() {
		return naturaleza;
	}

	public void setNaturaleza(NaturalezaMensajeEnum naturaleza) {
		this.naturaleza = naturaleza;
	}

	public UsuarioProyectoEntidadTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioProyectoEntidadTO usuario) {
		this.usuario = usuario;
	}

	public List<DocMensajeTO> getDocMensajeList() {
		return docMensajeList;
	}

	public void setDocMensajeList(List<DocMensajeTO> docMensajeList) {
		this.docMensajeList = docMensajeList;
	}

	public List<DestinoMensajeTO> getDesMensajeList() {
		return desMensajeList;
	}

	public void setDesMensajeList(List<DestinoMensajeTO> desMensajeList) {
		this.desMensajeList = desMensajeList;
	}

    
    
	

}
