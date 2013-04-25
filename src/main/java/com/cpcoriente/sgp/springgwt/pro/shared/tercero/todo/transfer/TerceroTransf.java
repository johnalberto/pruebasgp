/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.tercero.todo.transfer;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;


import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.tercero.entity.TerceroDO;
import com.cpcoriente.sgp.springgwt.pro.server.tercero.entity.TerceroPorTipoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.enumerador.TipoDocumentoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.enumerador.TipoPersonaEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IEmpresaTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.ICiudadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.IDepartamentoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.IPaisTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoRegimenTributarioEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.tercero.interfaces.transfer.ITerceroPorTipoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.tercero.interfaces.transfer.ITerceroTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TerceroPorTipoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TerceroTO;

/**
 * @author CPC-04
 *
 */
public class TerceroTransf implements ITerceroTransf{


	private static final Logger log = Logger.getLogger(TerceroTransf.class.getName());
	
	private ICiudadTransf getCiudadTransfer() {
		return TransfFactory.getInstance().getCiudadTransf();
	}
	
	private IDepartamentoTransf getDepartamentoTransfer() {
		return TransfFactory.getInstance().getDepartamentoTransf();
	}
	
	private IPaisTransf getPaisTransfer() {
		return TransfFactory.getInstance().getPaisTransf();
	}
	
	private ITerceroPorTipoTransf getTerceroPorTipoTransfer() {
		return TransfFactory.getInstance().getTerceroPorTipoTransf();
	}

	private IEmpresaTransf getEmpresaTransfer() {
		return TransfFactory.getInstance().getEmpresaTransf();
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.tercero.interfaces.transfer.ITerceroTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TerceroTO)
	 */
	public TerceroDO transferirTODO(TerceroTO terceroTO) {
		
		TerceroDO terceroDO = new TerceroDO();

		if (terceroTO.getId() != null) {
			terceroDO.setId(terceroTO.getId());
		}

		terceroDO.setNumDocumento(terceroTO.getNumDocumento());
		terceroDO.setNombre(terceroTO.getNombre());
		terceroDO.setDireccion(terceroTO.getDireccion());
		terceroDO.setEmail(terceroTO.getEmail());
		terceroDO.setTelefono(terceroTO.getTelefono());
		terceroDO.setRegimenTributario(terceroTO.getRegimenTributario().getValor());
		terceroDO.setVersion(terceroTO.getVersion());
		
		terceroDO.setTipoDoc(terceroTO.getTipoDoc().getValor());
		terceroDO.setFechaRegistro(terceroTO.getFechaRegistro());
		terceroDO.setSexo(terceroTO.getSexo());
		terceroDO.setTipoPersona(terceroTO.getTipoPersona().getValor());
		
		
		if (terceroTO.getEmpresa() != null) {
			terceroDO.setEmpresa(getEmpresaTransfer().transferirTODO(terceroTO.getEmpresa()));
		}
			
		if (terceroTO.getCiudad() != null) {
			terceroDO.setCiudad(getCiudadTransfer().transferirTODO(terceroTO.getCiudad()));
			
		}
		
		if (terceroTO.getDpto() != null) {
			terceroDO.setDpto(getDepartamentoTransfer().transferirTODO(terceroTO.getDpto()));
		}
		
		if (terceroTO.getPais() != null) {
			terceroDO.setPais(getPaisTransfer().transferirTODO(terceroTO.getPais()));
		}

		if(terceroTO.getTerceroTipoLista() != null && terceroTO.getTerceroTipoLista().size() > 0) {
			TerceroPorTipoDO terceroTipoCargada = null;
			Set<TerceroPorTipoDO> terceroTipoDOSet = new LinkedHashSet<TerceroPorTipoDO>();
			for(TerceroPorTipoTO terceroTipo : terceroTO.getTerceroTipoLista()) {
				terceroTipoCargada = getTerceroPorTipoTransfer().transferirTODO(terceroTipo);
                 if (terceroTipoCargada != null) {
                	 terceroTipoCargada.setTercero(terceroDO);
                	 terceroTipoDOSet.add(terceroTipoCargada);
                 } else {
                     log.warning("esta tratando de cargar un tipo de Tercero inexistente con id: " + terceroTipo.getId());
                 }
			}
			if (terceroTipoDOSet.size() > 0) {
				terceroDO.setTerceroTipoSet(terceroTipoDOSet);
			}
		}	
		
	
		return terceroDO;
	}

	
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.tercero.interfaces.transfer.ITerceroTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.tercero.entity.TerceroDO)
	 */
	public TerceroTO transferirDOTO(TerceroDO terceroDO) {
		
		
		TerceroTO terceroTO = new TerceroTO();
		
		terceroTO.setId(terceroDO.getId());
		terceroTO.setNumDocumento(terceroDO.getNumDocumento());
		terceroTO.setNombre(terceroDO.getNombre());
		terceroTO.setDireccion(terceroDO.getDireccion());
		terceroTO.setEmail(terceroDO.getEmail());
		terceroTO.setTelefono(terceroDO.getTelefono());
		terceroTO.setRegimenTributario(TipoRegimenTributarioEnum.tomarTipoPorValor(terceroDO.getRegimenTributario()));
		terceroTO.setVersion(terceroDO.getVersion());
		
		
		terceroTO.setTipoDoc(TipoDocumentoEnum.tomarTipoPorValor(terceroDO.getTipoDoc()));
		terceroTO.setFechaRegistro(terceroDO.getFechaRegistro());
		terceroTO.setSexo(terceroDO.getSexo());
		terceroTO.setTipoPersona(TipoPersonaEnum.tomarTipoPorValor(terceroDO.getTipoPersona()));
		
		
		if (terceroDO.getEmpresa() != null) {
			terceroTO.setEmpresa(getEmpresaTransfer().transferirDOTO(terceroDO.getEmpresa()));
		}
		
		
		if (terceroDO.getPais() != null) {
			terceroTO.setPais(getPaisTransfer().transferirDOTO(terceroDO.getPais()));
		}
		
		if (terceroDO.getDpto() != null) {
			terceroTO.setDpto(getDepartamentoTransfer().transferirDOTO(terceroDO.getDpto()));
		}
		
		if (terceroDO.getCiudad() != null) {
			terceroTO.setCiudad(getCiudadTransfer().transferirDOTO(terceroDO.getCiudad()));
		}
		
		
		if(terceroDO.getTerceroTipoSet() != null && terceroDO.getTerceroTipoSet().size() > 0) {
			TerceroPorTipoTO terceroTipoCargado = null;
			List<TerceroPorTipoTO> terceroTipoTOList = new ArrayList<TerceroPorTipoTO>(terceroDO.getTerceroTipoSet().size());
			
			for(TerceroPorTipoDO terceroTipo : terceroDO.getTerceroTipoSet()) {
				terceroTipoCargado = getTerceroPorTipoTransfer().transferirDOTO(terceroTipo);
				terceroTipoTOList.add(terceroTipoCargado);                 
			}
			if (terceroTipoTOList.size() > 0) {
				terceroTO.setTerceroTipoLista(terceroTipoTOList);
			}
		}
				

		return terceroTO;
			
	}

}
