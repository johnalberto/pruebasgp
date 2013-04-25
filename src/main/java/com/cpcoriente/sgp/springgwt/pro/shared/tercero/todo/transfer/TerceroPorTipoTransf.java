/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.tercero.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.tercero.entity.TerceroPorTipoDO;
import com.cpcoriente.sgp.springgwt.pro.server.tercero.interfaces.dao.ITerceroDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoTerceroEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.tercero.interfaces.transfer.ITerceroPorTipoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TerceroPorTipoTO;

/**
 * @author CPC-04
 *
 */
public class TerceroPorTipoTransf implements ITerceroPorTipoTransf{

	
	private ITerceroDAO getTerceroDAO() {
		return DAOFactory.getInstance().getTerceroDao();
	}
	
	public TerceroPorTipoDO transferirTODO(TerceroPorTipoTO terceroPorTipoTO) {

		TerceroPorTipoDO terceroPorTipoDO = new TerceroPorTipoDO();
		
		if (terceroPorTipoTO.getId() != null) {
			terceroPorTipoDO.setId(terceroPorTipoTO.getId());
		}
		
		terceroPorTipoDO.setTipoTercero(terceroPorTipoTO.getTipoTercero().getValor());
		
		if (terceroPorTipoTO.getTercero() != null) {
			terceroPorTipoDO.setTercero(getTerceroDAO().cargar(terceroPorTipoTO.getTercero().getId()));
		}
		
		return terceroPorTipoDO;
	}

	public TerceroPorTipoTO transferirDOTO(TerceroPorTipoDO terceroPorTipoDO) {

		TerceroPorTipoTO terceroPorTipoTO = new TerceroPorTipoTO();
		
		if (terceroPorTipoDO.getId() != null) {
			terceroPorTipoTO.setId(terceroPorTipoDO.getId());
		}
		
		terceroPorTipoTO.setTipoTercero(TipoTerceroEnum.tomarTipoPorValor(terceroPorTipoDO.getTipoTercero()));
		
		return terceroPorTipoTO;
	}

}
