package com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.todo.tranfer;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.entity.DestinoMensajeDO;
import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.entity.DocMensajeDO;
import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.entity.MensajeDO;
import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.interfaces.dao.IDestinoMensajeDAO;
import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.interfaces.dao.IDocMensajeDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.IUsuarioProyectoEntidadDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.enumerador.EstadoMensajeEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.enumerador.NaturalezaMensajeEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.enumerador.PrioridadMensajeEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.enumerador.TipoMensajeEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.interfaces.transfer.IDestinoMensajeTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.interfaces.transfer.IDocMensajeTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.interfaces.transfer.IMensajeTrasf;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.objeto.DestinoMensajeTO;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.objeto.DocMensajeTO;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.objeto.MensajeTO;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.IUsuarioProyectoEntidadTransf;

public class MensajeTransf implements IMensajeTrasf {

	/*
	 *##############falata hacer el transfer de persona
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.interfaces.tranfer.IMensajeTrasfer#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.objeto.MensajeTO)
	 */
	
	
	private static final Logger log = Logger.getLogger(MensajeTransf.class.getName());

	private IUsuarioProyectoEntidadTransf getUsuProEntTransfer() {
		return TransfFactory.getInstance().getUsuProEntTransf();
	}
	
	private IUsuarioProyectoEntidadDAO getUsuProEntDao() {
		return DAOFactory.getInstance().getUsuarioProEntDao();
	}
	

	private IDocMensajeTransf getDocMensajeTransfer() {
		return TransfFactory.getInstance().getDocMensajeTransf();
	}
	
	private IDocMensajeDAO getDocMensajeDao() {
		return DAOFactory.getInstance().getDocMensajeDao();
	}

	private IDestinoMensajeTransf getDesMensajeTransfer() {
		return TransfFactory.getInstance().getDestinoMensajeTransf();
	}
	
	private IDestinoMensajeDAO getDesMensajeDao() {
		return DAOFactory.getInstance().getDestinoMensajeDao();
	}

	
	public MensajeDO transferirTODO(MensajeTO mensajeTO) {
		
		
		MensajeDO mensajeDO= new MensajeDO();

		if (mensajeTO.getId() != null) {
			mensajeDO.setId(mensajeTO.getId());
		}

		mensajeDO.setAsunto(mensajeTO.getAsunto());
		mensajeDO.setCodigo(mensajeTO.getCodigo());
		mensajeDO.setCuerpo(mensajeTO.getCuerpo());
		mensajeDO.setEstado(mensajeTO.getEstado().getValor());
		mensajeDO.setFechaRegistro(mensajeTO.getFechaRegistro());
		
		
		mensajeDO.setPrioridad(mensajeTO.getPrioridad().getValor());
		
				
		mensajeDO.setTipo(mensajeTO.getTipo().getValor());
		mensajeDO.setNaturaleza(mensajeTO.getNaturaleza().getValor());
		
		mensajeDO.setUsuario(getUsuProEntDao().cargar(mensajeTO.getUsuario().getId()));
		
		if(mensajeTO.getDocMensajeList()!= null && mensajeTO.getDocMensajeList().size() > 0) {
			DocMensajeDO terminoCargado = null;
			Set<DocMensajeDO> terminoDOSet = new LinkedHashSet<DocMensajeDO>();
			for(DocMensajeTO termino : mensajeTO.getDocMensajeList()) {
				terminoCargado = getDocMensajeDao().cargar(termino.getId()); 
                 if (terminoCargado != null) {
                	 terminoCargado.setMensaje(mensajeDO);
                	 terminoDOSet.add(terminoCargado);
                 } else {
                     log.warning("esta tratando de cargar un termino inexistente: " + termino.getId());
                 }
			}
			if (terminoDOSet.size() > 0) {
				mensajeDO.setDocMensajeSet(terminoDOSet);
			}
		}
		
		if(mensajeTO.getDesMensajeList()!= null && mensajeTO.getDesMensajeList().size() > 0) {
			DestinoMensajeDO terminoCargado = null;
			Set<DestinoMensajeDO> terminoDOSet = new LinkedHashSet<DestinoMensajeDO>();
			for(DestinoMensajeTO termino : mensajeTO.getDesMensajeList()) {
				terminoCargado = getDesMensajeDao().cargar(termino.getId()); 
                 if (terminoCargado != null) {
                	 terminoCargado.setMensaje(mensajeDO);
                	 terminoDOSet.add(terminoCargado);
                 } else {
                     log.warning("esta tratando de cargar un termino inexistente: " + termino.getId());
                 }
			}
			if (terminoDOSet.size() > 0) {
				mensajeDO.setDesMensajeSet(terminoDOSet);
			}
		}
		
		return mensajeDO;
	}

	public MensajeTO transferirDOTO(MensajeDO mensajeDO) {
		
		MensajeTO mensajeTO =new MensajeTO();
		
		if (mensajeDO.getId()!=null) {
			
			mensajeTO.setId(mensajeDO.getId());
		}
		
		mensajeTO.setAsunto(mensajeDO.getAsunto());
		mensajeTO.setCodigo(mensajeDO.getCodigo());
		mensajeTO.setCuerpo(mensajeDO.getCuerpo());
		mensajeTO.setEstado(EstadoMensajeEnum.tomarTipoPorValor(mensajeDO.getEstado()));
		mensajeTO.setFechaRegistro(mensajeDO.getFechaRegistro());
		mensajeTO.setPrioridad(PrioridadMensajeEnum.tomarTipoPorValor(mensajeDO.getPrioridad()));
		mensajeTO.setTipo(TipoMensajeEnum.tomarTipoPorValor(mensajeDO.getTipo()));
		mensajeTO.setNaturaleza(NaturalezaMensajeEnum.tomarTipoPorValor(mensajeDO.getNaturaleza()));
		
		mensajeTO.setUsuario(getUsuProEntTransfer().transferirDOTO(mensajeDO.getUsuario()));
		
		if (mensajeDO.getDocMensajeSet() != null && mensajeDO.getDocMensajeSet().size() > 0) {
			
			List<DocMensajeTO> docTOLista = new ArrayList<DocMensajeTO>(mensajeDO.getDocMensajeSet().size());
			DocMensajeTO docProv = null;
			for (DocMensajeDO documento : mensajeDO.getDocMensajeSet()) {
				docProv = getDocMensajeTransfer().transferirDOTO(documento);
				docTOLista.add(docProv);
			}
			if (docTOLista.size() > 0) {
				
				mensajeTO.setDocMensajeList(docTOLista);
			}
		}

		if (mensajeDO.getDesMensajeSet() != null && mensajeDO.getDesMensajeSet().size() > 0) {
			
			List<DestinoMensajeTO> destinoTOLista = new ArrayList<DestinoMensajeTO>(mensajeDO.getDesMensajeSet().size());
			DestinoMensajeTO destinoProv = null;
			for (DestinoMensajeDO destino : mensajeDO.getDesMensajeSet()) {
				destinoProv = getDesMensajeTransfer().transferirDOTO(destino);
				destinoTOLista.add(destinoProv);
			}
			if (destinoTOLista.size() > 0) {
				
				mensajeTO.setDesMensajeList(destinoTOLista);
			}
		}
		
		
		return mensajeTO;
	}

}
