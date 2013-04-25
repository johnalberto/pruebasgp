/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.localidad.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.CiudadDO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao.IDepartamentoDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.ICiudadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO;


/**
 * @author CPC-04
 *
 */
public class CiudadTransf implements ICiudadTransf{


	private IDepartamentoDAO getDepartamentoDAO() {
		return DAOFactory.getInstance().getDepartamentoDao();
	}

	public CiudadDO transferirTODO(CiudadTO ciudadTO) {

		CiudadDO ciudadDO = new CiudadDO();

		if (ciudadTO.getId() != null) {
			ciudadDO.setId(ciudadTO.getId());
		}
		
		ciudadDO.setCodigo(ciudadTO.getCodigo());
		ciudadDO.setNombre(ciudadTO.getNombre());

		if (ciudadTO.getDpto() != null) {
			ciudadDO.setDpto(getDepartamentoDAO().cargar(ciudadTO.getDpto().getId()));
		}

		
		return ciudadDO;
	}

	public CiudadTO transferirDOTO(CiudadDO ciudadDO) {

		CiudadTO ciudadTO = new CiudadTO();

		ciudadTO.setId(ciudadDO.getId());
		ciudadTO.setCodigo(ciudadDO.getCodigo());
		ciudadTO.setNombre(ciudadDO.getNombre());

		return ciudadTO;
	}

}
