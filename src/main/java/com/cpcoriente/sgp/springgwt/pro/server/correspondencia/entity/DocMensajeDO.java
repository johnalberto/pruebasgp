package com.cpcoriente.sgp.springgwt.pro.server.correspondencia.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


@Entity
@Table(name="docmensaje", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"docMen_mensaje_id","docMen_nombre"})})
@NamedQueries({
	@NamedQuery(name = "docMensajeDO.seleccionPorMensaje", query = "select doc from DocMensajeDO doc where doc.mensaje.id = :idMensaje  order by doc.fechaRegistro")
    })
public class DocMensajeDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DocMensajeDO(){
		
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "docMen_id", nullable = false, unique = true)
	private Long id;
	
	@Version 
	@Column(name="docMen_version")
	private int version;
	
	@Column(name = "docMen_descripcion", nullable = false)
	private String descripcion;

	@Column(name = "docMen_nombre", nullable = false)
	private String nombre;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "mensaje_fechaReg", nullable = false, unique = false)
	private Date fechaRegistro;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "docMen_mensaje_id", referencedColumnName = "mensaje_id", nullable = false)
	private MensajeDO mensaje;
	
	@Lob
	@Column(name = "docMen_documento", length=32768)
	private byte[] documento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public MensajeDO getMensaje() {
		return mensaje;
	}

	public void setMensaje(MensajeDO mensaje) {
		this.mensaje = mensaje;
	}

	public byte[] getDocumento() {
		return documento;
	}

	public void setDocumento(byte[] documento) {
		this.documento = documento;
	}

	@Override
	public String toString() {
		return "DocMensajeDO [id=" + id + ", version=" + version
				+ ", descripcion=" + descripcion + ", nombre=" + nombre
				+ ", fechaRegistro=" + fechaRegistro + ", mensaje=" + mensaje
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mensaje == null) ? 0 : mensaje.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + version;
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
		DocMensajeDO other = (DocMensajeDO) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
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
		if (mensaje == null) {
			if (other.mensaje != null)
				return false;
		} else if (!mensaje.equals(other.mensaje))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (version != other.version)
			return false;
		return true;
	}

	
	
	
}
