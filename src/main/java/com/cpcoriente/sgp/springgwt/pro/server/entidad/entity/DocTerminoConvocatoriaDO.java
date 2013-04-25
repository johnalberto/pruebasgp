package com.cpcoriente.sgp.springgwt.pro.server.entidad.entity;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

@Entity
@Table(name="docterminoconvocatoria", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"docTermConv_terminoConv_id", "docTermConv_nombre"})})
@NamedQueries({
	@NamedQuery(name = "docTermino.seleccionPorTermino", query = "select docTer from DocTerminoConvocatoriaDO docTer where docTer.idTermino = :idTermino order by docTer.nombre")
})
public class DocTerminoConvocatoriaDO implements Serializable {

	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DocTerminoConvocatoriaDO(){
		
		super();
	}
	
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "docTermConv_id", nullable = false, unique = true)
	private Long id;
	
	 @Version
	 @Column(name = "docTermConv_version", nullable = false)
	 private int version;
	
	 
	 @Column(name = "docTermConv_descripcion", nullable = false)
	 private String descripcion;
	 
	 @Column(name = "docTermConv_nombre", nullable = false)
	 private String nombre;
	
	 @Column(name = "docTermConv_terminoConv_id", nullable = false)
	 private Long idTermino;
	 
	 @Lob
	 @Column(name = "docTermConv_documento", length=32768)
	 private byte[] foto;
	 
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

		public Long getIdTermino() {
			return idTermino;
		}

		public void setIdTermino(Long idTermino) {
			this.idTermino = idTermino;
		}

		public byte[] getFoto() {
			return foto;
		}

		public void setFoto(byte[] foto) {
			this.foto = foto;
		}

		@Override
		public String toString() {
			return "DocTerminoConvocatoriaDO [id=" + id + ", version="
					+ version + ", descripcion=" + descripcion + ", nombre="
					+ nombre + ", idTermino=" + idTermino + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((descripcion == null) ? 0 : descripcion.hashCode());
			result = prime * result + Arrays.hashCode(foto);
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result
					+ ((idTermino == null) ? 0 : idTermino.hashCode());
			result = prime * result
					+ ((nombre == null) ? 0 : nombre.hashCode());
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
			DocTerminoConvocatoriaDO other = (DocTerminoConvocatoriaDO) obj;
			if (descripcion == null) {
				if (other.descripcion != null)
					return false;
			} else if (!descripcion.equals(other.descripcion))
				return false;
			if (!Arrays.equals(foto, other.foto))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (idTermino == null) {
				if (other.idTermino != null)
					return false;
			} else if (!idTermino.equals(other.idTermino))
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
