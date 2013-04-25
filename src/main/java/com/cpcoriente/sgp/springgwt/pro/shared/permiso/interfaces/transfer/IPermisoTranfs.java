package com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.PermisoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.PermisoTO;

public interface IPermisoTranfs {

	public abstract PermisoDO transferirTODO(PermisoTO permisoTO);
	public abstract PermisoTO transferirDOTO(PermisoDO permisoDO);
}
