package com.cpcoriente.sgp.springgwt.pro.server.correspondencia.entity;

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

import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioProyectoEntidadDO;


@Entity
@Table(name="destinomensaje", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"destino_mensaje_id","destino_usuproyentidad_id"})})
@NamedQueries({
	@NamedQuery(name = "destinoMensajeDO.seleccionPorMensaje", query = "select des from DocMensajeDO des where des.mensaje.id = :idMensaje  order by doc.fechaRegistro")
    })
public class DestinoMensajeDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	public DestinoMensajeDO(){
		
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "destino_id", nullable = false, unique = true)
	private Long id;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "destino_usuproyentidad_id", referencedColumnName = "usuproyentidad_id", nullable = false)
	private UsuarioProyectoEntidadDO usuario;
	
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "destino_mensaje_id", referencedColumnName = "mensaje_id", nullable = false)
	private MensajeDO mensaje;



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public UsuarioProyectoEntidadDO getUsuario() {
		return usuario;
	}


	public void setUsuario(UsuarioProyectoEntidadDO usuario) {
		this.usuario = usuario;
	}


	public MensajeDO getMensaje() {
		return mensaje;
	}


	public void setMensaje(MensajeDO mensaje) {
		this.mensaje = mensaje;
	}


	@Override
	public String toString() {
		return "DestinoMensajeDO [id=" + id + ", usuario=" + usuario
				+ ", mensaje=" + mensaje + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mensaje == null) ? 0 : mensaje.hashCode());
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
		DestinoMensajeDO other = (DestinoMensajeDO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mensaje == null) {
			if (other.mensaje != null)
				return false;
		} else if (!mensaje.equals(other.mensaje))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}
	
	
	
	
}
