package com.cpcoriente.sgp.springgwt.pro.server.correspondencia.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioProyectoEntidadDO;

@Entity
@Table(name="mensaje")
@NamedQueries({
	@NamedQuery(name = "mensajeDO.listarTodo", query = "select men from MensajeDO men where men.usuario.proyecto.id = :idProyecto order by men.fechaRegistro"),
	@NamedQuery(name = "mensajeDO.seleccionPorPersonaEnvia", query = "select men from MensajeDO men " +
			"where men.usuario.usuario.id = :idUsuario  order by men.fechaRegistro"),
	@NamedQuery(name = "mensajeDO.seleccionPorPersonaEnviaProyecto", query = "select men from MensajeDO men " +
			"where men.usuario.usuario.id = :idUsuario and " +
			"men.proyectoEntidad.proyecto.id = :idProyecto  order by men.fechaRegistro"),
	@NamedQuery(name = "mensajeDO.seleccionPorPersonaRespuesta", query = "select men from MensajeDO men" +
			" in (men.docMensajeSet) des " +
			" where des.usuario.usuario.id= :idUsuario order by men.fechaRegistro"),
	@NamedQuery(name = "mensajeDO.seleccionPorPersonaRespuestaProyecto", query = "select men from MensajeDO men " +
			"in (men.docMensajeSet) des " +
			"where des.usuario.usuario.id= :idUsuario and men.usuario.proyecto.id = :idProyecto  order by men.fechaRegistro")
    })
public class MensajeDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2851789559915919140L;

	
	public MensajeDO(){
		
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "mensaje_id", nullable = false, unique = true)
	private Long id;
	
	
	@Column(name = "mensaje_asunto", nullable = false, unique = false)
	private String asunto;
	

	@Column(name = "mensaje_codigo", nullable = false, unique = false)
	private String codigo;
	
	
	@Column(name = "mensaje_cuerpo", nullable = false, unique = false)
	private String cuerpo;
	
	
	@Column(name = "mensaje_tipo", nullable = false, unique = false)
	private int tipo;
	
	
	
	@Column(name = "mensaje_estado", nullable = false, unique = false)
	private int estado;
	
	
	
	@Column(name = "mensaje_prioridad", nullable = false, unique = false)
	private int prioridad;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "mensaje_fechaReg", nullable = false, unique = false)
	private Date fechaRegistro;
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "mensaje_usuproyentidad_id", referencedColumnName = "usuproyentidad_id", nullable = false)
	private UsuarioProyectoEntidadDO usuario;
	

	@Column(name = "mensaje_naturaleza", nullable = false, unique = false)
	private int naturaleza;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "mensaje")
	private Set<DocMensajeDO> docMensajeSet;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "mensaje")
	private Set<DestinoMensajeDO> desMensajeSet;

	
	@Override
	public String toString() {
		return "MensajeDO [id=" + id + ", asunto=" + asunto + ", codigo="
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
		result = prime * result + estado;
		result = prime * result
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + naturaleza;
		result = prime * result + prioridad;
		result = prime * result + tipo;
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
		MensajeDO other = (MensajeDO) obj;
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



	public int getTipo() {
		return tipo;
	}



	public void setTipo(int tipo) {
		this.tipo = tipo;
	}



	public int getEstado() {
		return estado;
	}



	public void setEstado(int estado) {
		this.estado = estado;
	}



	public int getPrioridad() {
		return prioridad;
	}



	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}



	public Date getFechaRegistro() {
		return fechaRegistro;
	}



	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}




	public int getNaturaleza() {
		return naturaleza;
	}



	public void setNaturaleza(int naturaleza) {
		this.naturaleza = naturaleza;
	}



	public UsuarioProyectoEntidadDO getUsuario() {
		return usuario;
	}



	public void setUsuario(UsuarioProyectoEntidadDO usuario) {
		this.usuario = usuario;
	}



	public Set<DocMensajeDO> getDocMensajeSet() {
		return docMensajeSet;
	}



	public void setDocMensajeSet(Set<DocMensajeDO> docMensajeSet) {
		this.docMensajeSet = docMensajeSet;
	}



	public Set<DestinoMensajeDO> getDesMensajeSet() {
		return desMensajeSet;
	}



	public void setDesMensajeSet(Set<DestinoMensajeDO> desMensajeSet) {
		this.desMensajeSet = desMensajeSet;
	}
	
	
	
}
