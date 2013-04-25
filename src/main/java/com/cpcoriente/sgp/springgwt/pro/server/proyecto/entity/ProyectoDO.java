/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.proyecto.entity;

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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.entity.ObjetivoDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.ConvocatoriaDO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.RubroProyectoDO;

/**
 * @author CPC-04
 *
 */

@Entity
@Table(name="proyecto", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"proyecto_convocatoria_id","proyecto_codigo"}),
	    @UniqueConstraint(columnNames = {"proyecto_convocatoria_id","proyecto_titulo"})})
@NamedQueries({
	@NamedQuery(name = "proyectoDO.listarTodo", query = "select pro from ProyectoDO pro where pro.division.id = :idDivision order by pro.codigo"),
	@NamedQuery(name = "proyectoDO.seleccionPorTitulo", query = "select pro from ProyectoDO pro where lower(pro.titulo) like :parteTitulo order by pro.codigo, pro.titulo"),
	@NamedQuery(name = "proyectoDO.seleccionPorCodigo", query = "select pro from ProyectoDO pro where lower(pro.codigo) like :parteCodigo order by pro.codigo, pro.titulo"),
	@NamedQuery(name = "proyectoDO.seleccionPorFechaInicio", query = "select pro from ProyectoDO pro where pro.fechaInicio >= :fechaInicio and pro.fechaInicio <= :fechaFin order by pro.codigo, pro.titulo"),
	@NamedQuery(name = "proyectoDO.seleccionPorConvocatoria", query = "select pro from ProyectoDO pro where pro.convocatoria.id = : idConvocatoria order by pro.codigo, pro.titulo"),
	@NamedQuery(name = "proyectoDO.seleccionPorEstado", query = "select pro from ProyectoDO pro where pro.estado = : estado order by pro.codigo, pro.titulo")
	})
public class ProyectoDO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -657754260740021779L;
	
	public ProyectoDO() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "proyecto_id", nullable = false, unique = true)
	private Long id;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "proyecto_convocatoria_id", referencedColumnName = "convocatoria_id", nullable = false)
	private ConvocatoriaDO convocatoria;
	

	
	@Column(name = "proyecto_codigo", nullable = false, unique = false)
	private String codigo;
		
	@Column(name = "proyecto_titulo", nullable = false, unique = false)
	private String titulo;
	
	
	@Column(name = "proyecto_estado", nullable = false, unique = false)
	private int estado;
	

	
	@Temporal (TemporalType.DATE)
	@Column(name = "proyecto_fechaInicio", nullable = false)
	private Date fechaInicio;
	
	@Temporal (TemporalType.DATE)
	@Column(name = "proyecto_fechaFin", nullable = false)
	private Date fechaFin;
	
	@Column(name = "proyecto_objGeneral", nullable = false, unique = false)
	private String objGeneral;
	
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "proyecto")
	private Set<ObjetivoDO> objetivoSet;
	
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "proyecto")
	private Set<VersionProyectoDO> versionSet;

	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "rubroporproyecto", joinColumns =
    			@JoinColumn(name = "rubroPorProyecto_proyecto_id", insertable=true, updatable=true),
    			inverseJoinColumns =@JoinColumn(name = "rubroPorProyecto_rubro_id", insertable=true, updatable=true))
	private Set<RubroProyectoDO> rubroProyectoSet;
	
	@Version
	@Column(name = "proyecto_version", nullable = false)
	private int version;
	
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the estado
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}

		
	/**
	 * @return the objetivoSet
	 */
	public Set<ObjetivoDO> getObjetivoSet() {
		return objetivoSet;
	}

	/**
	 * @param objetivoSet the objetivoSet to set
	 */
	public void setObjetivoSet(Set<ObjetivoDO> objetivoSet) {
		this.objetivoSet = objetivoSet;
	}

	/**
	 * @return the versionSet
	 */
	public Set<VersionProyectoDO> getVersionSet() {
		return versionSet;
	}

	/**
	 * @param versionSet the versionSet to set
	 */
	public void setVersionSet(Set<VersionProyectoDO> versionSet) {
		this.versionSet = versionSet;
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

	public Set<RubroProyectoDO> getRubroProyectoSet() {
		return rubroProyectoSet;
	}

	public void setRubroProyectoSet(Set<RubroProyectoDO> rubroProyectoSet) {
		this.rubroProyectoSet = rubroProyectoSet;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProyectoDO [id=" + id + ", codigo=" + codigo + ", titulo="
				+ titulo + ", estado=" + estado + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + estado;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ProyectoDO)) {
			return false;
		}
		ProyectoDO other = (ProyectoDO) obj;
		if (codigo == null) {
			if (other.codigo != null) {
				return false;
			}
		} else if (!codigo.equals(other.codigo)) {
			return false;
		}
		if (estado != other.estado) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (titulo == null) {
			if (other.titulo != null) {
				return false;
			}
		} else if (!titulo.equals(other.titulo)) {
			return false;
		}
		return true;
	}


	public ConvocatoriaDO getConvocatoria() {
		return convocatoria;
	}

	public void setConvocatoria(ConvocatoriaDO convocatoria) {
		this.convocatoria = convocatoria;
	}

	public String getObjGeneral() {
		return objGeneral;
	}

	public void setObjGeneral(String objGeneral) {
		this.objGeneral = objGeneral;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	

}
