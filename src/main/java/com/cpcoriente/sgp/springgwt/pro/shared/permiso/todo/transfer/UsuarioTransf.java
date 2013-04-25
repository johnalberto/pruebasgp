/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.permiso.todo.transfer;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IEmpresaDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao.ICiudadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao.IDepartamentoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao.IPaisDAO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioDO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.entity.UsuarioPorTipoDO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.IUsuarioPorTipoDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.enumerador.TipoDocumentoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IEmpresaTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.ICiudadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.IDepartamentoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.IPaisTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.IUsuarioPorTipoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.IUsuarioTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO;

/**
 * @author CPC-04
 *
 */
public class UsuarioTransf implements IUsuarioTransf{

	private static final Logger log = Logger.getLogger(UsuarioTransf.class.getName());

	private ICiudadTransf getCiudadTransf() {
		return TransfFactory.getInstance().getCiudadTransf();
	}

	private ICiudadDAO getCiudadDAO() {
		return DAOFactory.getInstance().getCiudadDao();
	}
	
	private IDepartamentoTransf getDptoTransf() {
		return TransfFactory.getInstance().getDepartamentoTransf();
	}

	private IDepartamentoDAO getDptoDAO() {
		return DAOFactory.getInstance().getDepartamentoDao();
	}
	
	private IPaisTransf getPaisTransf() {
		return TransfFactory.getInstance().getPaisTransf();
	}

	private IPaisDAO getPaisDAO() {
		return DAOFactory.getInstance().getPaisDao();
	}
	

	private IUsuarioPorTipoDAO getUsuarioPorTipoDAO() {
		return DAOFactory.getInstance().getUsuarioPorTipoDao();
	}

	private IUsuarioPorTipoTransf getUsuarioPorTipoTransf() {
		return TransfFactory.getInstance().getUsuarioPorTipoTransf();
	}
	
	private IEmpresaDAO getEmpresaDAO() {
		return DAOFactory.getInstance().getEmpresaDao();
	}

	private IEmpresaTransf getEmpresaTransf() {
		return TransfFactory.getInstance().getEmpresaTransf();
	}
	
	
	/**
	 * 
	 */
	public UsuarioDO transferirTODO(UsuarioTO usuarioTO) {

		UsuarioDO usuarioDO = new UsuarioDO();

		if (usuarioTO.getId() != null) {
			usuarioDO.setId(usuarioTO.getId());
		}
		
		usuarioDO.setNumDoc(usuarioTO.getNumDoc());
		usuarioDO.setNombre(usuarioTO.getNombre());
		usuarioDO.setSexo(usuarioTO.getSexo());
		usuarioDO.setDireccion(usuarioTO.getDireccion());
		usuarioDO.setTelefono(usuarioTO.getTelefono());
		usuarioDO.setUsername(usuarioTO.getUsername());
		usuarioDO.setPassword(usuarioTO.getPassword());
		usuarioDO.setFechaRegistro(usuarioTO.getFechaRegistro());
		usuarioDO.setTipoDocumento(usuarioTO.getTipoDoc().getValor());

		if (usuarioTO.getEmail() != null) {
			usuarioDO.setEmail(usuarioTO.getEmail());
		}


		if (usuarioTO.getEmpresa() != null){
			usuarioDO.setEmpresa(getEmpresaDAO().cargar(usuarioTO.getEmpresa().getId()));
		}

		if (usuarioTO.getCiudad() != null) {
			usuarioDO.setCiudad(getCiudadDAO().cargar(usuarioTO.getCiudad().getId()));
		}

		if (usuarioTO.getDpto() != null) {
			usuarioDO.setDpto(getDptoDAO().cargar(usuarioTO.getDpto().getId()));
		}
		
		if (usuarioTO.getPais() != null) {
			usuarioDO.setPais(getPaisDAO().cargar(usuarioTO.getPais().getId()));
		}
		
		if (usuarioTO.getTipoUsuarioList() != null && usuarioTO.getTipoUsuarioList().size() > 0) {
			UsuarioPorTipoDO tipUsuCargado = null;
			Set<UsuarioPorTipoDO> tipUsuDOSet = new LinkedHashSet<UsuarioPorTipoDO>();
			
			for(UsuarioPorTipoTO tu : usuarioTO.getTipoUsuarioList()) {
				tipUsuCargado = getUsuarioPorTipoDAO().cargar(tu.getId());
				if (tipUsuCargado != null) {
					tipUsuDOSet.add(tipUsuCargado);
				} else {
					log.warning("esta tratando de cargar un tipo de usuario inexistente con id: " + tu.getId());
				}
			}
			if (tipUsuDOSet.size() > 0) {
				usuarioDO.setUsuarioPorTipo(tipUsuDOSet);
			}
		}

		
		usuarioDO.setVersion(usuarioTO.getVersion());
		
		return usuarioDO;
		
	}

	
	
	/**
	 * 
	 */
	public UsuarioTO transferirDOTO(UsuarioDO usuarioDO) {
		UsuarioTO usuarioTO = new UsuarioTO();
		
		usuarioTO.setId(usuarioDO.getId());
		usuarioTO.setTipoDoc(TipoDocumentoEnum.tomarTipoPorValor(usuarioDO.getTipoDocumento()));
		usuarioTO.setNumDoc(usuarioDO.getNumDoc());
		usuarioTO.setNombre(usuarioDO.getNombre());
		usuarioTO.setSexo(usuarioDO.getSexo());
		usuarioTO.setDireccion(usuarioDO.getDireccion());
		usuarioTO.setTelefono(usuarioDO.getTelefono());
		usuarioTO.setUsername(usuarioDO.getUsername());
		usuarioTO.setPassword(usuarioDO.getPassword());
		usuarioTO.setFechaRegistro(usuarioDO.getFechaRegistro());


		if (usuarioDO.getEmail() != null) {
			usuarioTO.setEmail(usuarioDO.getEmail());
		}

		
		if (usuarioDO.getEmpresa() != null){
			usuarioTO.setEmpresa(getEmpresaTransf().transferirDOTO(usuarioDO.getEmpresa()));
		}

		if (usuarioDO.getCiudad() != null) {
			usuarioTO.setCiudad(getCiudadTransf().transferirDOTO(usuarioDO.getCiudad()));
		}
		
		if (usuarioDO.getDpto() != null) {
			usuarioTO.setDpto(getDptoTransf().transferirDOTO(usuarioDO.getDpto()));
		}
		
		if (usuarioDO.getPais() != null) {
			usuarioTO.setPais(getPaisTransf().transferirDOTO(usuarioDO.getPais()));
		}
		
		

		if (usuarioDO.getUsuarioPorTipo()!= null && usuarioDO.getUsuarioPorTipo().size() > 0) {
			UsuarioPorTipoTO tipUsuCargado = null;
			List<UsuarioPorTipoTO> tipUsuTOLista = new ArrayList<UsuarioPorTipoTO>(usuarioDO.getUsuarioPorTipo().size());
			for(UsuarioPorTipoDO tu : usuarioDO.getUsuarioPorTipo()) {
				tipUsuCargado = getUsuarioPorTipoTransf().transferirDOTO(tu);
				tipUsuTOLista.add(tipUsuCargado);
			}
			if (tipUsuTOLista.size() > 0) {
				usuarioTO.setTipoUsuarioList(tipUsuTOLista);
			}
		}
		
		usuarioTO.setVersion(usuarioDO.getVersion());
		
		return usuarioTO;

	}

}
