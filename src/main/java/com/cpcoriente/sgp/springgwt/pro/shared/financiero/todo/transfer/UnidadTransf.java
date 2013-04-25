package com.cpcoriente.sgp.springgwt.pro.shared.financiero.todo.transfer;

import com.cpcoriente.sgp.springgwt.pro.server.financiero.entity.UnidadDO;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.enumerador.TipoUnidadEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IUnidadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.objeto.UnidadTO;

public class UnidadTransf implements IUnidadTransf {

	
	
	public UnidadDO transferirTODO(UnidadTO unidadTO) {
		
		UnidadDO unidadDO = new UnidadDO();
		
		if (unidadTO.getId()!=null) {
			
			unidadDO.setId(unidadTO.getId());
		}
		
		unidadDO.setAbreviatura(unidadTO.getAbreviatura());
		unidadDO.setNombre(unidadTO.getNombre());
		unidadDO.setTipo(unidadTO.getTipoUnidad().getValor());
		
		return unidadDO;
	}

	public UnidadTO transferirDOTO(UnidadDO unidadDO) {
		
		UnidadTO unidadTO = new UnidadTO();
		
		if (unidadDO.getId()!=null) {
			
			unidadTO.setId(unidadDO.getId());
		}
		
		unidadTO.setAbreviatura(unidadDO.getAbreviatura());
		unidadTO.setNombre(unidadDO.getNombre());
		unidadTO.setTipoUnidad(TipoUnidadEnum.tomarTipoPorValor(unidadDO.getTipo()));
		
		return unidadTO;
	}

}
