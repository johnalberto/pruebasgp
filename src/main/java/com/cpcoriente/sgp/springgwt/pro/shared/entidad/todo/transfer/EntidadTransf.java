/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.entidad.todo.transfer;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.logging.Logger;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.DivisionDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.entity.EntidadDO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IActividadEconomicaDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IEmpresaDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao.ICiudadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao.IDepartamentoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao.IPaisDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.enumerador.TipoDocumentoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.enumerador.TipoPersonaEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IActividadEconomicaTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IDivisionTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IEmpresaTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IEntidadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.ICiudadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.IDepartamentoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.IPaisTransf;

/**
 * @author CPC-04
 *
 */
	
	
public class EntidadTransf implements IEntidadTransf{

	private static final Logger log = Logger.getLogger(EntidadTransf.class.getName());
	
	

	

	
	private ICiudadTransf getCiudadTransfer() {
		return TransfFactory.getInstance().getCiudadTransf();
	}
	
	private IDepartamentoTransf getDepartamentoTransfer() {
		return TransfFactory.getInstance().getDepartamentoTransf();
	}
	
	private IPaisTransf getPaisTransfer() {
		return TransfFactory.getInstance().getPaisTransf();
	}
	
	
	
	private ICiudadDAO getCiudadDAO() {
		return DAOFactory.getInstance().getCiudadDao();
	}
	
	private IDepartamentoDAO getDptoDAO() {
		return DAOFactory.getInstance().getDepartamentoDao();
	}
	
	private IPaisDAO getPaisDAO() {
		return DAOFactory.getInstance().getPaisDao();
	}
	
	
	

	private IEmpresaDAO getEmpresaDAO(){
		return DAOFactory.getInstance().getEmpresaDao();
	}
	
	private IDivisionTransf getDivisionTransfer() {
		return TransfFactory.getInstance().getDivisionTransf();
	}
	
	private IEmpresaTransf getEmpresaTranfer(){
		
		return TransfFactory.getInstance().getEmpresaTransf();
	}
	
	
	private IActividadEconomicaDAO getActEconomicaDAO(){
		return DAOFactory.getInstance().getActEconomicaDao();
	}
	
	private IActividadEconomicaTransf getActEconomicaTranfer(){
		
		return TransfFactory.getInstance().getActEconomicaTransf();
	}
	
	public EntidadDO transferirTODO(EntidadTO entidadTO) {
		
		EntidadDO entidadDO = new EntidadDO();

		

		if (entidadTO.getId() != null) {
			entidadDO.setId(entidadTO.getId());
		}

		entidadDO.setAbreviatura(entidadTO.getAbreviatura());
		entidadDO.setCodigo(entidadTO.getCodigo());
		entidadDO.setTipoDocumento(entidadTO.getTipoDocumento().getValor());
		entidadDO.setNumDocumento(entidadTO.getNumDoc());
		entidadDO.setNombre(entidadTO.getNombre());
		entidadDO.setDireccion(entidadTO.getDireccion());
		entidadDO.setEmail(entidadTO.getEmail());
		entidadDO.setTelefono(entidadTO.getTelefono());
	

		
			
		if (entidadTO.getCiudad() != null) {
			entidadDO.setCiudad(getCiudadDAO().cargar(entidadTO.getCiudad().getId()));
			
		}
		
		if (entidadTO.getDpto() != null) {
			entidadDO.setDpto(getDptoDAO().cargar(entidadTO.getDpto().getId()));
		}
		
		if (entidadTO.getPais() != null) {
			entidadDO.setPais(getPaisDAO().cargar(entidadTO.getPais().getId()));
		}

		
		if (entidadTO.getEmpresa() !=null) {
			
			entidadDO.setEmpresa(getEmpresaDAO().cargar(entidadTO.getEmpresa().getId()));
		}
		
		
		entidadDO.setTipoPersona(entidadTO.getTipoPersona().getValor());
		
		entidadDO.setNombreRepLegal(entidadTO.getNombreRepLegal());
		
		entidadDO.setNumDocRepLegal(entidadTO.getNumDocRepLegal());
		
		entidadDO.setTipoDocRepLegal(entidadTO.getTipoDocRepLegal().getValor());
		
		entidadDO.setActEconomica(getActEconomicaDAO().cargar(entidadTO.getActEconomica().getId()));
		
		
		if(entidadTO.getDivisionList() != null && entidadTO.getDivisionList().size() > 0) {
			DivisionDO terminoCargado = null;
			Set<DivisionDO> terminoDOSet = new LinkedHashSet<DivisionDO>();
			for(DivisionTO termino : entidadTO.getDivisionList()) {
				terminoCargado = getDivisionTransfer().transferirTODO(termino); 
                 if (terminoCargado != null) {
                	 terminoCargado.setEntidad(entidadDO);
                	 terminoDOSet.add(terminoCargado);
                 } else {
                     log.warning("esta tratando de cargar una entidad inexistente: " + termino.getId());
                 }
			}
			if (terminoDOSet.size() > 0) {
				
				entidadDO.setDivisionSet(terminoDOSet);
			}
		}
		
		return entidadDO;
	}

	public EntidadTO transferirDOTO(EntidadDO entidadDO) {
		
		
		EntidadTO entidadTO = new EntidadTO();
		
		entidadTO.setId(entidadDO.getId());
		entidadTO.setAbreviatura(entidadDO.getAbreviatura());
		entidadTO.setCodigo(entidadDO.getCodigo());
		entidadTO.setTipoDocumento(TipoDocumentoEnum.tomarTipoPorValor(entidadDO.getTipoDocumento()));
		entidadTO.setNumDoc(entidadDO.getNumDocumento());
		entidadTO.setNombre(entidadDO.getNombre());
		entidadTO.setDireccion(entidadDO.getDireccion());
		entidadTO.setEmail(entidadDO.getEmail());
		entidadTO.setTelefono(entidadDO.getTelefono());
			
		if (entidadDO.getPais() != null) {
			entidadTO.setPais(getPaisTransfer().transferirDOTO(entidadDO.getPais()));
		}
		
		if (entidadDO.getDpto() != null) {
			entidadTO.setDpto(getDepartamentoTransfer().transferirDOTO(entidadDO.getDpto()));
		}
		
		if (entidadDO.getCiudad() != null) {
			entidadTO.setCiudad(getCiudadTransfer().transferirDOTO(entidadDO.getCiudad()));
		}
	
		
		if (entidadDO.getEmpresa()!=null) {
			
			entidadTO.setEmpresa(getEmpresaTranfer().transferirDOTO(entidadDO.getEmpresa()));
		}
		
		entidadTO.setTipoPersona(TipoPersonaEnum.tomarTipoPorValor(entidadDO.getTipoPersona()));
		
		entidadTO.setNombreRepLegal(entidadDO.getNombreRepLegal());
		
		entidadTO.setNumDocRepLegal(entidadDO.getNumDocRepLegal());
		
		entidadTO.setTipoDocRepLegal(TipoDocumentoEnum.tomarTipoPorValor(entidadDO.getTipoDocRepLegal()));
		
		entidadTO.setActEconomica(getActEconomicaTranfer().transferirDOTO(entidadDO.getActEconomica()));
		
		return entidadTO;
			
	}

}
