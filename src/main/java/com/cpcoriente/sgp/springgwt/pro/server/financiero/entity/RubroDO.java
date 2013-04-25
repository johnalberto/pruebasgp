package com.cpcoriente.sgp.springgwt.pro.server.financiero.entity;

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
import javax.persistence.Version;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.EntidadDO;



@Entity
@Table(name="rubro",uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"rubro_empresa_id", "rubro_codigo"}),
	    @UniqueConstraint(columnNames = {"rubro_empresa_id", "rubro_nombre"})})
@NamedQueries({
	@NamedQuery(name = "rubroDO.listarTodo", query = "select rub from RubroDO rub order by rub.nombre"),
	@NamedQuery(name = "rubroDO.seleccionPorEmpresa", query = "select rub from RubroDO rub where rub.empresa.id =:idEmpresa order by rub.nombre"),

})

public class RubroDO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1872099806960589795L;

	public RubroDO(){
		super();
	}

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "rubro_id", nullable = false, unique = true)
	private Long id;
	
	
	@Column(name = "rubro_codigo", nullable = false)
	private String codigo;
	
	@Column(name = "rubro_nombre", nullable = false)
	private String nombre;

	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "rubro_entidad_id", referencedColumnName = "entidad_id", nullable = false)
	private EntidadDO entidad;
	
	
	 @Version
	 @Column(name = "rubro_version", nullable = false)
	 private int version;
	
	
	
	@Override
	public String toString() {
		return "RubroDO [id=" + id + ", codigo=" + codigo + ", nombre="
				+ nombre + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		RubroDO other = (RubroDO) obj;
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
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public EntidadDO getEntidad() {
		return entidad;
	}

	public void setEntidad(EntidadDO entidad) {
		this.entidad = entidad;
	}


	
	
	
}
