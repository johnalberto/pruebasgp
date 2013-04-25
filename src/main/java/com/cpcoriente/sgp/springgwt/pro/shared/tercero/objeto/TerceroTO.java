/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.entidad.enumerador.TipoDocumentoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.enumerador.TipoPersonaEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EmpresaTO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO;
import com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoRegimenTributarioEnum;

/**
 * @author CPC-04
 *
 */
public class TerceroTO implements Comparable<TerceroTO>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4248883271454696522L;

	public int compareTo(TerceroTO obj) {
		
		return obj.getId().compareTo(obj.getId());
	}

	
	private Long id;
	
	private int version;
	
	private TipoDocumentoEnum tipoDoc;
	
	private String numDocumento;
	
	private String nombre;
	
	private char sexo;
	
	private String direccion;
	
	private String telefono;
	
	private String email;
		
	private Date fechaRegistro;
	
	private TipoPersonaEnum tipoPersona;
	
	private TipoRegimenTributarioEnum regimenTributario;
	
	private CiudadTO ciudad;
	
	private DepartamentoTO dpto;
	
	private PaisTO pais;
	
	private EmpresaTO empresa;
	
	private List<TerceroPorTipoTO> terceroTipoLista;
	


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
	 * @return the tipoDoc
	 */
	public TipoDocumentoEnum getTipoDoc() {
		return tipoDoc;
	}

	/**
	 * @param tipoDoc the tipoDoc to set
	 */
	public void setTipoDoc(TipoDocumentoEnum tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	/**
	 * @return the numDocumento
	 */
	public String getNumDocumento() {
		return numDocumento;
	}

	/**
	 * @param numDocumento the numDocumento to set
	 */
	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the fechaRegistro
	 */
	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	/**
	 * @param fechaRegistro the fechaRegistro to set
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	/**
	 * @return the regimenTributario
	 */
	public TipoRegimenTributarioEnum getRegimenTributario() {
		return regimenTributario;
	}

	/**
	 * @param regimenTributario the regimenTributario to set
	 */
	public void setRegimenTributario(TipoRegimenTributarioEnum regimenTributario) {
		this.regimenTributario = regimenTributario;
	}

	/**
	 * @return the ciudad
	 */
	public CiudadTO getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(CiudadTO ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * @return the dpto
	 */
	public DepartamentoTO getDpto() {
		return dpto;
	}

	/**
	 * @param dpto the dpto to set
	 */
	public void setDpto(DepartamentoTO dpto) {
		this.dpto = dpto;
	}

	/**
	 * @return the pais
	 */
	public PaisTO getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(PaisTO pais) {
		this.pais = pais;
	}

	/**
	 * @return the empresa
	 */
	public EmpresaTO getEmpresa() {
		return empresa;
	}

	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(EmpresaTO empresa) {
		this.empresa = empresa;
	}

	/**
	 * @return the terceroTipoLista
	 */
	public List<TerceroPorTipoTO> getTerceroTipoLista() {
		return terceroTipoLista;
	}

	/**
	 * @param terceroTipoLista the terceroTipoLista to set
	 */
	public void setTerceroTipoLista(List<TerceroPorTipoTO> terceroTipoLista) {
		this.terceroTipoLista = terceroTipoLista;
	}


	
	
	/**
	 * @return the version
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(int version) {
		this.version = version;
	}

	/**
	 * @return the tipoPersona
	 */
	public TipoPersonaEnum getTipoPersona() {
		return tipoPersona;
	}

	/**
	 * @param tipoPersona the tipoPersona to set
	 */
	public void setTipoPersona(TipoPersonaEnum tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	/**
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
		result = prime * result
				+ ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((dpto == null) ? 0 : dpto.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((numDocumento == null) ? 0 : numDocumento.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime
				* result
				+ ((regimenTributario == null) ? 0 : regimenTributario
						.hashCode());
		result = prime * result + sexo;
		result = prime * result
				+ ((telefono == null) ? 0 : telefono.hashCode());
		result = prime * result + ((tipoDoc == null) ? 0 : tipoDoc.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TerceroTO other = (TerceroTO) obj;
		if (ciudad == null) {
			if (other.ciudad != null)
				return false;
		} else if (!ciudad.equals(other.ciudad))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (dpto == null) {
			if (other.dpto != null)
				return false;
		} else if (!dpto.equals(other.dpto))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
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
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numDocumento == null) {
			if (other.numDocumento != null)
				return false;
		} else if (!numDocumento.equals(other.numDocumento))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		if (regimenTributario != other.regimenTributario)
			return false;
		if (sexo != other.sexo)
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		if (tipoDoc != other.tipoDoc)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TerceroTO [id=" + id + ", tipoDoc=" + tipoDoc
				+ ", numDocumento=" + numDocumento + ", nombre=" + nombre
				+ ", sexo=" + sexo + ", direccion=" + direccion + ", telefono="
				+ telefono + ", email=" + email + ", fechaRegistro="
				+ fechaRegistro + ", regimenTributario=" + regimenTributario
				+ ", ciudad=" + ciudad + ", dpto=" + dpto + ", pais=" + pais
				+ "]";
	}


	
	
}
