/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto;

import java.io.Serializable;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.entidad.enumerador.TipoDocumentoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.enumerador.TipoPersonaEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO;
import com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoRegimenTributarioEnum;


/**
 * @author CPC-04
 *
 */
public class EntidadTO implements Comparable<EntidadTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2956909329120047507L;

	
	private Long id;
	
	private String codigo;
	
	private TipoDocumentoEnum tipoDocumento;
	
	private String numDoc;
	
	private String nombre;
	
	private String abreviatura;
	
	private String direccion;
	
	private String telefono;
	
	private String email;
	
	private CiudadTO ciudad;
	
	private DepartamentoTO dpto;
	
	private PaisTO pais;
	
	private TipoPersonaEnum tipoPersona;
	
	private TipoRegimenTributarioEnum tipoRegimen;
	
	private EmpresaTO empresa;
	
	private String nombreRepLegal;
	
	private String numDocRepLegal;
	
	private TipoDocumentoEnum tipoDocRepLegal;
	
	private ActividadEconomicaTO actEconomica;
	
	private List<DivisionTO> divisionList;
	

	public TipoPersonaEnum getTipoPersona() {
		return tipoPersona;
	}


	public void setTipoPersona(TipoPersonaEnum tipoPersona) {
		this.tipoPersona = tipoPersona;
	}


	public TipoRegimenTributarioEnum getTipoRegimen() {
		return tipoRegimen;
	}


	public void setTipoRegimen(TipoRegimenTributarioEnum tipoRegimen) {
		this.tipoRegimen = tipoRegimen;
	}


	public String getNombreRepLegal() {
		return nombreRepLegal;
	}


	public void setNombreRepLegal(String nombreRepLegal) {
		this.nombreRepLegal = nombreRepLegal;
	}


	public String getNumDocRepLegal() {
		return numDocRepLegal;
	}


	public void setNumDocRepLegal(String numDocRepLegal) {
		this.numDocRepLegal = numDocRepLegal;
	}


	public TipoDocumentoEnum getTipoDocRepLegal() {
		return tipoDocRepLegal;
	}


	public void setTipoDocRepLegal(TipoDocumentoEnum tipoDocRepLegal) {
		this.tipoDocRepLegal = tipoDocRepLegal;
	}


	public ActividadEconomicaTO getActEconomica() {
		return actEconomica;
	}


	public void setActEconomica(ActividadEconomicaTO actEconomica) {
		this.actEconomica = actEconomica;
	}


	public int compareTo(EntidadTO o) {
		return getId().compareTo(o.getId());
	}
	

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


	
	
	public String getNumDoc() {
		return numDoc;
	}


	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}
	
	public String getAbreviatura() {
		return abreviatura;
	}



	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}



	@Override
	public String toString() {
		return "EntidadTO [id=" + id + ", codigo=" + codigo
				+ ", tipoDocumento=" + tipoDocumento + ", numDoc=" + numDoc
				+ ", nombre=" + nombre + ", abreviatura=" + abreviatura
				+ ", direccion=" + direccion + ", telefono=" + telefono
				+ ", email=" + email + ", ciudad=" + ciudad + ", dpto=" + dpto
				+ ", pais=" + pais + ", tipoPersona=" + tipoPersona
				+ ", tipoRegimen=" + tipoRegimen + ", empresa=" + empresa
				+ ", nombreRepLegal=" + nombreRepLegal + ", numDocRepLegal="
				+ numDocRepLegal + ", tipoDocRepLegal=" + tipoDocRepLegal
				+ ", actEconomica=" + actEconomica + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((abreviatura == null) ? 0 : abreviatura.hashCode());
		result = prime * result
				+ ((actEconomica == null) ? 0 : actEconomica.hashCode());
		result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((dpto == null) ? 0 : dpto.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((nombreRepLegal == null) ? 0 : nombreRepLegal.hashCode());
		result = prime * result + ((numDoc == null) ? 0 : numDoc.hashCode());
		result = prime * result
				+ ((numDocRepLegal == null) ? 0 : numDocRepLegal.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result
				+ ((telefono == null) ? 0 : telefono.hashCode());
		result = prime * result
				+ ((tipoDocRepLegal == null) ? 0 : tipoDocRepLegal.hashCode());
		result = prime * result
				+ ((tipoDocumento == null) ? 0 : tipoDocumento.hashCode());
		result = prime * result
				+ ((tipoPersona == null) ? 0 : tipoPersona.hashCode());
		result = prime * result
				+ ((tipoRegimen == null) ? 0 : tipoRegimen.hashCode());
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
		EntidadTO other = (EntidadTO) obj;
		if (abreviatura == null) {
			if (other.abreviatura != null)
				return false;
		} else if (!abreviatura.equals(other.abreviatura))
			return false;
		if (actEconomica == null) {
			if (other.actEconomica != null)
				return false;
		} else if (!actEconomica.equals(other.actEconomica))
			return false;
		if (ciudad == null) {
			if (other.ciudad != null)
				return false;
		} else if (!ciudad.equals(other.ciudad))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
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
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
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
		if (nombreRepLegal == null) {
			if (other.nombreRepLegal != null)
				return false;
		} else if (!nombreRepLegal.equals(other.nombreRepLegal))
			return false;
		if (numDoc == null) {
			if (other.numDoc != null)
				return false;
		} else if (!numDoc.equals(other.numDoc))
			return false;
		if (numDocRepLegal == null) {
			if (other.numDocRepLegal != null)
				return false;
		} else if (!numDocRepLegal.equals(other.numDocRepLegal))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		if (tipoDocRepLegal != other.tipoDocRepLegal)
			return false;
		if (tipoDocumento != other.tipoDocumento)
			return false;
		if (tipoPersona != other.tipoPersona)
			return false;
		if (tipoRegimen != other.tipoRegimen)
			return false;
		return true;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public TipoDocumentoEnum getTipoDocumento() {
		return tipoDocumento;
	}



	public void setTipoDocumento(TipoDocumentoEnum tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	public EmpresaTO getEmpresa() {
		return empresa;
	}



	public void setEmpresa(EmpresaTO empresa) {
		this.empresa = empresa;
	}


	public List<DivisionTO> getDivisionList() {
		return divisionList;
	}


	public void setDivisionList(List<DivisionTO> divisionList) {
		this.divisionList = divisionList;
	}
	
	
}
