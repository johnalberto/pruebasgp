/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.cpcoriente.sgp.springgwt.pro.shared.entidad.enumerador.TipoDocumentoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EmpresaTO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO;

/**
 * @author CPC-04
 *
 */
public class UsuarioTO implements Comparable<UsuarioTO>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2799154901110632170L;

	private Long id;
	
	private int version;
	
	private String numDoc;
	
	private String nombre;
	
	
	private char sexo;
	
	private String direccion;
	
	private String telefono;
	
	private String email;

	private Date fechaRegistro;

	private String username;

	private String password;
		
	private TipoDocumentoEnum tipoDoc;
	
	private CiudadTO ciudad;
	
	private DepartamentoTO dpto;
	
	private PaisTO pais;
	
	private List<UsuarioPorTipoTO> tipoUsuarioList;
	
	private EmpresaTO empresa;
	
	
	public int compareTo(UsuarioTO o) {
		return getId().compareTo(o.getId());
	}


	public TipoDocumentoEnum getTipoDoc() {
		return tipoDoc;
	}


	public void setTipoDoc(TipoDocumentoEnum tipoDoc) {
		this.tipoDoc = tipoDoc;
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
	 * @return the numDoc
	 */
	public String getNumDoc() {
		return numDoc;
	}


	/**
	 * @param numDoc the numDoc to set
	 */
	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}


	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	


	
	
	/**
	 * @return the tipoDoc
	 */

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
	 * @return the tipoUsuarioList
	 */
	public List<UsuarioPorTipoTO> getTipoUsuarioList() {
		return tipoUsuarioList;
	}


	/**
	 * @param tipoUsuarioList the tipoUsuarioList to set
	 */
	public void setTipoUsuarioList(List<UsuarioPorTipoTO> tipoUsuarioList) {
		this.tipoUsuarioList = tipoUsuarioList;
	}

	
	

	@Override
	public String toString() {
		return "UsuarioTO [id=" + id + ", numDoc=" + numDoc + ", nombre="
				+ nombre + ", sexo=" + sexo + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", email=" + email
				+ ", fechaRegistro=" + fechaRegistro + ", username=" + username
				+ ", password=" + password + ", tipoDoc=" + tipoDoc
				+ ", ciudad=" + ciudad + ", dpto=" + dpto + ", pais=" + pais
				+ ", empresa=" + empresa + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
		result = prime * result
				+ ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((dpto == null) ? 0 : dpto.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result
				+ ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((numDoc == null) ? 0 : numDoc.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + sexo;
		result = prime * result
				+ ((telefono == null) ? 0 : telefono.hashCode());
		result = prime * result + ((tipoDoc == null) ? 0 : tipoDoc.hashCode());
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
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
		UsuarioTO other = (UsuarioTO) obj;
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
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
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
		if (numDoc == null) {
			if (other.numDoc != null)
				return false;
		} else if (!numDoc.equals(other.numDoc))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
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
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}


	public EmpresaTO getEmpresa() {
		return empresa;
	}


	public void setEmpresa(EmpresaTO empresa) {
		this.empresa = empresa;
	}


	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}
	
}
