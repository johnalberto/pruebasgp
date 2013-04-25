package com.cpcoriente.sgp.springgwt.pro.shared.permiso.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IEmpresaDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.PermisoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IEmpresaTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.AccionEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.PaginaEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.IPermisoTranfs;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.PermisoTO;

public class PermisoTransf implements IPermisoTranfs {

	private IEmpresaDAO getEmpresaDAO() {
		return DAOFactory.getInstance().getEmpresaDao();
	}

	private IEmpresaTransf getEmpresaTransf() {
		return TransfFactory.getInstance().getEmpresaTransf();
	}

	
	public PermisoDO transferirTODO(PermisoTO permisoTO) {
		PermisoDO permisoDO = new PermisoDO();
		
		if (permisoTO.getId() !=null) {
			
			permisoDO.setId(permisoTO.getId());
		}
		
		permisoDO.setAccion(permisoTO.getAccion().getValor());
		
		permisoDO.setEmpresa(getEmpresaDAO().cargar(permisoTO.getEmpresa().getId()));
		
		permisoDO.setTipoUsuario(permisoTO.getTipoUsuario().getValor());
		
		return permisoDO;
	}

	public PermisoTO transferirDOTO(PermisoDO permisoDO) {
		
		PermisoTO permisoTO = new PermisoTO();

		permisoTO.setId(permisoDO.getId());
		
		permisoTO.setAccion(AccionEnum.tomarTipoPorValor(permisoDO.getAccion()));
		
		permisoTO.setEmpresa(getEmpresaTransf().transferirDOTO(permisoDO.getEmpresa()));
		
		permisoTO.setPagina(PaginaEnum.tomarTipoPorValor(permisoDO.getPagina()));
		
		permisoTO.setTipoUsuario(TipoUsuarioEnum.tomarTipoPorValor(permisoDO.getTipoUsuario()));
		
		return permisoTO;
	}

}
