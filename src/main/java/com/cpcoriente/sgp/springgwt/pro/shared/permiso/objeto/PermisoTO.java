package com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto;

import java.io.Serializable;

import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EmpresaTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.AccionEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.PaginaEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum;

public class PermisoTO implements Comparable<UsuarioTO>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int compareTo(UsuarioTO o) {
		// TODO Auto-generated method stub
		return 0;
	}

	private Long id;
	
	private PaginaEnum pagina;
	
	private AccionEnum accion;
	
	private TipoUsuarioEnum tipoUsuario;
	
	private EmpresaTO empresa;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PaginaEnum getPagina() {
		return pagina;
	}

	public void setPagina(PaginaEnum pagina) {
		this.pagina = pagina;
	}

	public AccionEnum getAccion() {
		return accion;
	}

	public void setAccion(AccionEnum accion) {
		this.accion = accion;
	}

	public TipoUsuarioEnum getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuarioEnum tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public EmpresaTO getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaTO empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "PermisoTO [id=" + id + ", pagina=" + pagina + ", accion="
				+ accion + ", tipoUsuario=" + tipoUsuario + ", empresa="
				+ empresa + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accion == null) ? 0 : accion.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((pagina == null) ? 0 : pagina.hashCode());
		result = prime * result
				+ ((tipoUsuario == null) ? 0 : tipoUsuario.hashCode());
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
		PermisoTO other = (PermisoTO) obj;
		if (accion != other.accion)
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (id != other.id)
			return false;
		if (pagina != other.pagina)
			return false;
		if (tipoUsuario != other.tipoUsuario)
			return false;
		return true;
	}
	
	
}
