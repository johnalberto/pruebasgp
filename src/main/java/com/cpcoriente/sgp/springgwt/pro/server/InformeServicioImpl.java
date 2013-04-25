/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.cpcoriente.sgp.springgwt.pro.client.informe.IInformeServicio;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.DocInformeDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InfoInterEntregableDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InfoInterProductoDetalleDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.entity.InformeDO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IDocInformeDAO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IInfoInterEntregableDetalleDAO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IInfoInterProductoDetalleDAO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IInformeDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IDocInformeTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInfoInterEntregableDetalleTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInfoInterProductoDetalleTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInformeTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.DocInformeTO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InfoInterEntregableDetalleTO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InfoInterProductoDetalleTO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InformeDetalleTO;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InformeTO;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * @author CPC-04
 *
 */

@Service
public class InformeServicioImpl extends RemoteServiceServlet implements IInformeServicio{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1411545016203010539L;
	

	public void init() {

	}
	
	private IInformeDAO getInformeDAO() {
		return  DAOFactory.getInstance().getInformeDao();
	}

	private IInformeTransf getInformeTransf() {
		return  TransfFactory.getInstance().getInformeTransf();
	}
	
	private IDocInformeDAO getDocInformeDAO() {
		return  DAOFactory.getInstance().getDocInformeDao();
	}

	private IDocInformeTransf getDocInformeTransf() {
		return  TransfFactory.getInstance().getDocInformeTransf();
	}
	
	private IInfoInterEntregableDetalleDAO getInfoInterEntregableDetalleDAO() {
		return  DAOFactory.getInstance().getInfoInterEntregableDetalleDao();
	}

	private IInfoInterEntregableDetalleTransf getInfoInterEntregableDetalleTransf() {
		return  TransfFactory.getInstance().getInfoInterEntregableDetalleTransf();
	}
	
	private IInfoInterProductoDetalleDAO getInfoInterProductoDetalleDAO() {
		return  DAOFactory.getInstance().getInfoInterProductoDetalleDao();
	}

	private IInfoInterProductoDetalleTransf getInfoInterProductoDetalleTransf() {
		return  TransfFactory.getInstance().getInfoInterProductoDetalleTransf();
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.informe.IInformeServicio#cargarDocInforme(java.lang.Long)
	 */
	public DocInformeTO cargarDocInforme(Long idDocInforme) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		DocInformeTO docInformeTO = null;
		DocInformeDO docInformeDO = null;

		if (idDocInforme == null) {
			throw new ValidacionExcepcion("falta.id.documento.informe");
		}

		docInformeDO = getDocInformeDAO().cargar(idDocInforme);

		if (docInformeDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.documento.informe");
		}

		docInformeTO = getDocInformeTransf().transferirDOTO(docInformeDO);

		return docInformeTO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.informe.IInformeServicio#crearDocInforme(java.util.List)
	 */
	public List<DocInformeTO> crearDocInforme(List<DocInformeTO> docInformeList) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		List<DocInformeDO> docInformeListRes = null;
		if (docInformeList != null && docInformeList.size() > 0) {
			for (DocInformeTO doc : docInformeList) {
				if (doc.getNombre() == null || doc.getNombre().trim().length() == 0 || doc.getNombre().trim() == "") {
					throw new ValidacionExcepcion("falta.Nombre.documento")	;
				}
				if (doc.getDescripcion() == null || doc.getDescripcion().trim().length() == 0 || doc.getDescripcion().trim() == "") {
					throw new ValidacionExcepcion("falta.descripci\u00f3n.documento")	;
				}

				if (doc.getIdInforme() == null) {
					throw new ValidacionExcepcion("falta.informe.documento")	;
				}	
			}

			Set<DocInformeDO> docInformeListAgregar = new LinkedHashSet<DocInformeDO>();


			for (DocInformeTO docTO : docInformeList) {
				DocInformeDO docDO = new DocInformeDO();
				docDO = getDocInformeTransf().transferirTODO(docTO);
				docInformeListAgregar.add(docDO);
			}
			docInformeListRes = getDocInformeDAO().persistir(docInformeListAgregar);


			if (docInformeListRes == null || docInformeListRes.size() != docInformeListAgregar.size()) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.documento.informe");
			}

			docInformeList.clear();
			for (DocInformeDO docInfDO : docInformeListRes) {
				DocInformeTO docInfTO = new DocInformeTO();
				docInfTO = getDocInformeTransf().transferirDOTO(docInfDO);
				docInformeList.add(docInfTO);
			}

		} else {
			throw new ValidacionExcepcion("falta.informaci\u00f3n.documento.informe")	;
		}


		return docInformeList;

		
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.informe.IInformeServicio#modificarDocInforme(com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.DocInformeTO)
	 */
	public boolean modificarDocInforme(DocInformeTO docInforme) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		DocInformeDO docInformeProv = getDocInformeTransf().transferirTODO(docInforme);

		try {

			DocInformeDO docInformeMod = getDocInformeDAO().modificar(docInformeProv);
			if(docInformeMod == null){
				throw new RecursoExcepcion("fallo.modificaci\u00f3n.documento.informe");
			}

			return true;


		} catch (DataAccessException e) {

			String error = "";
			if (e.getMostSpecificCause().getMessage().contains("Duplicate entry")) {
				error = "Este registro ya existe en la base de datos, por favor revise que los campos no est\u00e9n duplicados";
			} else {
				error = "error recursos de base de datos";
			}

			throw new PrecondicionExcepcion(error);
		}	

		
		
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.informe.IInformeServicio#eliminarDocInforme(java.util.List)
	 */
	public boolean eliminarDocInforme(List<Long> idDocInformeLista) throws PrecondicionExcepcion, ValidacionExcepcion {


		if (idDocInformeLista == null) {
			throw new ValidacionExcepcion("falta.identificador.documento.informe");
		}

		try {

			boolean res = getDocInformeDAO().eliminar(idDocInformeLista);

			return res;
		} catch (DataAccessException e) {
			String error = "";
			if (e.getMostSpecificCause().getMessage().contains("Cannot delete or update a parent row: a foreign key constraint fails")) {
				error = "Este registro no puede ser eliminado ya que su identificador se encuentra relacionado en otros registros del sistema";
			} else {
				error = "error recursos de base de datos";
			}

			throw new PrecondicionExcepcion(error);
		}
		
		
	}

	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.informe.IInformeServicio#seleccionDocInformePorInforme(java.lang.Long)
	 */
	public List<DocInformeTO> seleccionDocInformePorInforme(Long idInforme)	throws PrecondicionExcepcion, ValidacionExcepcion {


		if (idInforme == null) {
			throw new ValidacionExcepcion("falta.identificador.informe");
		}


		List<DocInformeDO> docInformeLista = getDocInformeDAO().seleccionPorInforme(idInforme);

		if (docInformeLista == null || docInformeLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.documento.informe");
		}

		DocInformeTO docInformeTO = null;
		List<DocInformeTO> docInformeTOLista = new ArrayList<DocInformeTO>(docInformeLista.size());
		for (DocInformeDO doc : docInformeLista) {

			docInformeTO = getDocInformeTransf().transferirDOTO(doc);
			docInformeTOLista.add(docInformeTO);
		}

		return docInformeTOLista;
		
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.informe.IInformeServicio#cargarInforme(java.lang.Long)
	 */
	public InformeTO cargarInforme(Long idInforme) throws ValidacionExcepcion,	RecursoExcepcion, PrecondicionExcepcion {
		
		InformeTO informeTO = null;
		InformeDO informeDO = null;

		if (idInforme == null) {
			throw new ValidacionExcepcion("falta.id.informe");
		}

		informeDO = getInformeDAO().cargar(idInforme);

		if (informeDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.informe");
		}

		informeTO = getInformeTransf().transferirDOTO(informeDO);
		return informeTO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.informe.IInformeServicio#crearInforme(com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InformeTO)
	 */
	public Long crearInforme(InformeTO informe) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		if(informe == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.informe");
		}

		try {


			InformeDO informeProv = null;

			Long idRegistrado = null;

			informeProv = getInformeTransf().transferirTODO(informe);
			InformeDO informeReg = getInformeDAO().persistir(informeProv);
			if (informeReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.informe");
			}

			if (informe.getDocumentoLista() != null && informe.getDocumentoLista().size() > 0) {
				List<DocInformeDO> docInfListRes = null;
				
				for (DocInformeTO doc : informe.getDocumentoLista()) {
					if (doc.getNombre() == null || doc.getNombre().trim().length() == 0 || doc.getNombre().trim() == "") {
						throw new ValidacionExcepcion("falta.Nombre.documento")	;
					}
					if (doc.getDescripcion() == null || doc.getDescripcion().trim().length() == 0 || doc.getDescripcion().trim() == "") {
						throw new ValidacionExcepcion("falta.descripci\u00f3n.documento")	;
					}
				}

				Set<DocInformeDO> documentoListAgregar = new LinkedHashSet<DocInformeDO>();


				for (DocInformeTO docInfTO : informe.getDocumentoLista()) {
					DocInformeDO documentoInformeDO = new DocInformeDO();
					documentoInformeDO = getDocInformeTransf().transferirTODO(docInfTO);
					documentoInformeDO.setIdInforme(informeReg.getId());
					documentoListAgregar.add(documentoInformeDO);
				}
				docInfListRes = getDocInformeDAO().persistir(documentoListAgregar);


				if (docInfListRes == null || docInfListRes.size() != documentoListAgregar.size()) {
					throw new RecursoExcepcion("fallo.creaci\u00f3n.documento");
				}

			} 

			idRegistrado = informeReg.getId();

			return idRegistrado;


		} catch (DataAccessException e) {


			String error = "";
			if (e.getMostSpecificCause().getMessage().contains("Duplicate entry")) {
				error = "Este registro ya existe en la base de datos, por favor revise que los campos no est\u00e9n duplicados";
			} else {
				error = "error recursos de base de datos";
			}

			throw new PrecondicionExcepcion(error);
		}

		
	}

	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.informe.IInformeServicio#modificarInforme(com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InformeTO)
	 */
	public boolean modificarInforme(InformeTO informe)throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {


		InformeDO informeProv = getInformeTransf().transferirTODO(informe);

		try {

			InformeDO informeMod = getInformeDAO().modificar(informeProv);
			if(informeMod == null){
				throw new RecursoExcepcion("fallo.modificaci\u00f3n.informe");
			}
			
			return true;


		} catch (DataAccessException e) {

			String error = "";
			if (e.getMostSpecificCause().getMessage().contains("Duplicate entry")) {
				error = "Este registro ya existe en la base de datos, por favor revise que los campos no est\u00e9n duplicados";
			} else {
				error = "error recursos de base de datos";
			}

			throw new PrecondicionExcepcion(error);
		}

	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.informe.IInformeServicio#eliminarInforne(java.lang.Long)
	 */
	public boolean eliminarInforne(Long idInforme) throws PrecondicionExcepcion, ValidacionExcepcion {
		
		if (idInforme == null) {
			throw new ValidacionExcepcion("falta.identificador.informe");
		}

		try {

			boolean res = getInformeDAO().eliminar(idInforme);

			return res;
		} catch (DataAccessException e) {
			String error = "";
			if (e.getMostSpecificCause().getMessage().contains("Cannot delete or update a parent row: a foreign key constraint fails")) {
				error = "Este registro no puede ser eliminado ya que su identificador se encuentra relacionado en otros registros del sistema";
			} else {
				error = "error recursos de base de datos";
			}

			throw new PrecondicionExcepcion(error);
		}
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.informe.IInformeServicio#listarSeleccionGeneralInforme(java.lang.Long, java.lang.Long, java.util.Date, java.util.Date, java.lang.Boolean, java.lang.String)
	 */
	public List<InformeTO> listarSeleccionGeneralInforme(Long idPersona, Long idInfoInterEntregableDetalle, Date fechaRegIni, Date fechaRegFin, Boolean vobo,
			String codigo) throws PrecondicionExcepcion, ValidacionExcepcion {


		if ((fechaRegIni == null && fechaRegFin != null) || (fechaRegFin == null && fechaRegIni != null) || (fechaRegIni != null && fechaRegFin != null && fechaRegIni.after(fechaRegFin)) ) {
			throw new ValidacionExcepcion("error.rango.registro.fechas");
		}
		
		List<InformeDO> informeLista = getInformeDAO().listarSeleccionGeneral(idPersona, idInfoInterEntregableDetalle, fechaRegIni, fechaRegFin, vobo, codigo);
				

		if (informeLista == null || informeLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.informe");
		}

		InformeTO informeTO = null;
		List<InformeTO> informeTOLista = new ArrayList<InformeTO>(informeLista.size());
		for (InformeDO ejecPres : informeLista) {

			informeTO = getInformeTransf().transferirDOTO(ejecPres);
			informeTOLista.add(informeTO);
		}

		return informeTOLista;
		
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.informe.IInformeServicio#cargarInfoInterEntregableDetalle(java.lang.Long)
	 */
	public InfoInterEntregableDetalleTO cargarInfoInterEntregableDetalle(Long idInfoInterEntregableDetalle) throws ValidacionExcepcion,
			RecursoExcepcion, PrecondicionExcepcion {
		
		InfoInterEntregableDetalleTO infoInterEntregableDetalleTO = null;
		InfoInterEntregableDetalleDO infoInterEntregableDetalleDO = null;

		if (idInfoInterEntregableDetalle == null) {
			throw new ValidacionExcepcion("falta.id.informe.interventor.entregable.detalle");
		}

		infoInterEntregableDetalleDO = getInfoInterEntregableDetalleDAO().cargar(idInfoInterEntregableDetalle);

		if (infoInterEntregableDetalleDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.interventor.entregable.detalle");
		}

		infoInterEntregableDetalleTO = getInfoInterEntregableDetalleTransf().transferirDOTO(infoInterEntregableDetalleDO);

		return infoInterEntregableDetalleTO;

	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.informe.IInformeServicio#crearInfoInterEntregableDetalle(com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InfoInterEntregableDetalleTO)
	 */
	public Long crearInfoInterEntregableDetalle(InfoInterEntregableDetalleTO infoInterEntregableDetalle)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {


		if(infoInterEntregableDetalle == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.informe.interventor.entregable.detalle")	;
		}

		InfoInterEntregableDetalleDO infoInterEntregableDetalleProv = null;

		Long idRegistrado = null;

		infoInterEntregableDetalleProv = getInfoInterEntregableDetalleTransf().transferirTODO(infoInterEntregableDetalle);

		try {

			InfoInterEntregableDetalleDO infoInterEntregableDetalleReg = getInfoInterEntregableDetalleDAO().persistir(infoInterEntregableDetalleProv);
			if (infoInterEntregableDetalleReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.informe.interventor.entregable.detalle");
			}

			idRegistrado = infoInterEntregableDetalleReg.getId();
					

			return idRegistrado;


		} catch (DataAccessException e) {


			String error = "";
			if (e.getMostSpecificCause().getMessage().contains("Duplicate entry")) {
				error = "Este registro ya existe en la base de datos, por favor revise que los campos no est\u00e9n duplicados";
			} else {
				error = "error recursos de base de datos";
			}

			throw new PrecondicionExcepcion(error);

		}

		
	}

	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.informe.IInformeServicio#modificarInfoInterEntregableDetalle(com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InfoInterEntregableDetalleTO)
	 */
	public boolean modificarInfoInterEntregableDetalle(InfoInterEntregableDetalleTO infoInterEntregableDetalle)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {


		InfoInterEntregableDetalleDO infoInterEntregableDetalleProv = getInfoInterEntregableDetalleTransf().transferirTODO(infoInterEntregableDetalle);

		try {

			InfoInterEntregableDetalleDO infoInterEntregableDetalleMod = getInfoInterEntregableDetalleDAO().modificar(infoInterEntregableDetalleProv);
			if(infoInterEntregableDetalleMod == null){
				throw new RecursoExcepcion("fallo.modificaci\u00f3n.interventor.entregable.detalle");
			}
			
			return true;


		} catch (DataAccessException e) {

			String error = "";
			if (e.getMostSpecificCause().getMessage().contains("Duplicate entry")) {
				error = "Este registro ya existe en la base de datos, por favor revise que los campos no est\u00e9n duplicados";
			} else {
				error = "error recursos de base de datos";
			}

			throw new PrecondicionExcepcion(error);
		}
		
	}

	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.informe.IInformeServicio#eliminarInfoInterEntregableDetalle(java.lang.Long)
	 */
	public boolean eliminarInfoInterEntregableDetalle(Long idInfoInterEntregableDetalle) throws PrecondicionExcepcion,
			ValidacionExcepcion {

		if (idInfoInterEntregableDetalle == null) {
			throw new ValidacionExcepcion("falta.identificador.interventor.entregable.detalle");
		}

		try {

			boolean res = getInfoInterEntregableDetalleDAO().eliminar(idInfoInterEntregableDetalle);

			return res;
		} catch (DataAccessException e) {
			String error = "";
			if (e.getMostSpecificCause().getMessage().contains("Cannot delete or update a parent row: a foreign key constraint fails")) {
				error = "Este registro no puede ser eliminado ya que su identificador se encuentra relacionado en otros registros del sistema";
			} else {
				error = "error recursos de base de datos";
			}

			throw new PrecondicionExcepcion(error);
		}
		
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.informe.IInformeServicio#cargarInfoInterProductoDetalle(java.lang.Long)
	 */
	public InfoInterProductoDetalleTO cargarInfoInterProductoDetalle(Long idInfoInterProductoDetalle) throws ValidacionExcepcion,
			RecursoExcepcion, PrecondicionExcepcion {
		
		InfoInterProductoDetalleTO infoInterProductoDetalleTO = null;
		InfoInterProductoDetalleDO infoInterProductoDetalleDO = null;

		if (idInfoInterProductoDetalle == null) {
			throw new ValidacionExcepcion("falta.id.informe.interventor.producto.detalle");
		}

		infoInterProductoDetalleDO = getInfoInterProductoDetalleDAO().cargar(idInfoInterProductoDetalle);

		if (infoInterProductoDetalleDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.interventor.producto.detalle");
		}

		infoInterProductoDetalleTO = getInfoInterProductoDetalleTransf().transferirDOTO(infoInterProductoDetalleDO);

		return infoInterProductoDetalleTO;
		
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.informe.IInformeServicio#crearInfoInterProductoDetalle(com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InfoInterProductoDetalleTO)
	 */
	public Long crearInfoInterProductoDetalle(InfoInterProductoDetalleTO infoInterProductoDetalle)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(infoInterProductoDetalle == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.informe.interventor.producto.detalle")	;
		}

		InfoInterProductoDetalleDO infoInterProductoDetalleProv = null;

		Long idRegistrado = null;

		infoInterProductoDetalleProv = getInfoInterProductoDetalleTransf().transferirTODO(infoInterProductoDetalle);

		try {

			InfoInterProductoDetalleDO infoInterProductoDetalleReg = getInfoInterProductoDetalleDAO().persistir(infoInterProductoDetalleProv);
			if (infoInterProductoDetalleReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.informe.interventor.producto.detalle");
			}

			idRegistrado = infoInterProductoDetalleReg.getId();
					

			return idRegistrado;


		} catch (DataAccessException e) {


			String error = "";
			if (e.getMostSpecificCause().getMessage().contains("Duplicate entry")) {
				error = "Este registro ya existe en la base de datos, por favor revise que los campos no est\u00e9n duplicados";
			} else {
				error = "error recursos de base de datos";
			}

			throw new PrecondicionExcepcion(error);

		}
		
	}

	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.informe.IInformeServicio#modificarInfoInterProductoDetalle(com.cpcoriente.sgp.springgwt.pro.shared.informe.objeto.InfoInterProductoDetalleTO)
	 */
	public boolean modificarInfoInterProductoDetalle(InfoInterProductoDetalleTO infoInterProductoDetalle)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {


		InfoInterProductoDetalleDO infoInterProductoDetalleProv = getInfoInterProductoDetalleTransf().transferirTODO(infoInterProductoDetalle);

		try {

			InfoInterProductoDetalleDO infoInterProductoDetalleMod = getInfoInterProductoDetalleDAO().modificar(infoInterProductoDetalleProv);
			if(infoInterProductoDetalleMod == null){
				throw new RecursoExcepcion("fallo.modificaci\u00f3n.interventor.producto.detalle");
			}
			
			return true;


		} catch (DataAccessException e) {

			String error = "";
			if (e.getMostSpecificCause().getMessage().contains("Duplicate entry")) {
				error = "Este registro ya existe en la base de datos, por favor revise que los campos no est\u00e9n duplicados";
			} else {
				error = "error recursos de base de datos";
			}

			throw new PrecondicionExcepcion(error);
		}
		
	}

	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.informe.IInformeServicio#eliminarInfoInterProductoDetalle(java.lang.Long)
	 */
	public boolean eliminarInfoInterProductoDetalle(Long idInfoInterProductoDetalle) throws PrecondicionExcepcion,
			ValidacionExcepcion {
		
		if (idInfoInterProductoDetalle == null) {
			throw new ValidacionExcepcion("falta.identificador.interventor.producto.detalle");
		}

		try {

			boolean res = getInfoInterProductoDetalleDAO().eliminar(idInfoInterProductoDetalle);

			return res;
		} catch (DataAccessException e) {
			String error = "";
			if (e.getMostSpecificCause().getMessage().contains("Cannot delete or update a parent row: a foreign key constraint fails")) {
				error = "Este registro no puede ser eliminado ya que su identificador se encuentra relacionado en otros registros del sistema";
			} else {
				error = "error recursos de base de datos";
			}

			throw new PrecondicionExcepcion(error);
		}
		
		
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.informe.IInformeServicio#cargarInformeDetalle(java.lang.Long)
	 */
	public InformeDetalleTO cargarInformeDetalle(Long idInformeDetalle)	throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		// TODO Auto-generated method stub
		return null;
	}

	public List<InformeDetalleTO> crearInformeDetalle(List<InformeDetalleTO> informeDetalleList)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean modificarInformeDetalle(InformeDetalleTO informeDetalle)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean eliminarInformeDetalle(Long idInformeDetalle)
			throws PrecondicionExcepcion, ValidacionExcepcion {
		// TODO Auto-generated method stub
		return false;
	}

}
