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

import com.cpcoriente.sgp.springgwt.pro.client.ejecucion.IEjecucionServicio;
import com.cpcoriente.sgp.springgwt.pro.server.ejecucion.entity.DocEjecucionPresupuestoDO;
import com.cpcoriente.sgp.springgwt.pro.server.ejecucion.entity.EjecucionPresupuestoDO;
import com.cpcoriente.sgp.springgwt.pro.server.ejecucion.interfaces.dao.IDocEjecucionPresupuestoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.ejecucion.interfaces.dao.IEjecucionPresupuestoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.interfaces.transfer.IDocEjecucionPresupuestoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.interfaces.transfer.IEjecucionPresupuestoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.objeto.DocEjecucionPresupuestoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.objeto.EjecucionPresupuestoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * @author CPC-04
 *
 */

@Service
public class EjecucionServicioImpl extends RemoteServiceServlet implements IEjecucionServicio {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5705696772710652776L;
	
	
	public void init() {

	}
	
	private IEjecucionPresupuestoTransf getEjecucionPresupuestoTransf() {
		return TransfFactory.getInstance().getEjecucionPresupuestoTransf();
	}
	
	private IEjecucionPresupuestoDAO getEjecucionPresupuestoDAO() {
		return DAOFactory.getInstance().getEjecucionPresupuestoDao();
	}
	
	private IDocEjecucionPresupuestoTransf getDocEjecucionPresupuestoTransf() {
		return TransfFactory.getInstance().getDocEjecucionPresupuestoTransf();
	}
	
	private IDocEjecucionPresupuestoDAO getDocEjecucionPresupuestoDAO() {
		return DAOFactory.getInstance().getDocEjecucionPresupuestoDao();
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.ejecucion.IEjecucionServicio#cargarDocEjecucion(java.lang.Long)
	 */
	public DocEjecucionPresupuestoTO cargarDocEjecucion(Long idDocEjecucionPresupuesto) throws ValidacionExcepcion,	RecursoExcepcion, PrecondicionExcepcion {
		
		DocEjecucionPresupuestoTO docEjecucionTO = null;
		DocEjecucionPresupuestoDO docEjecucionDO = null;

		if (idDocEjecucionPresupuesto == null) {
			throw new ValidacionExcepcion("falta.id.documento.ejecuci\u00f3n");
		}

		docEjecucionDO = getDocEjecucionPresupuestoDAO().cargar(idDocEjecucionPresupuesto);

		if (docEjecucionDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.documento.ejecuci\u00f3n");
		}

		docEjecucionTO = getDocEjecucionPresupuestoTransf().transferirDOTO(docEjecucionDO);

		return docEjecucionTO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.ejecucion.IEjecucionServicio#crearDocEjecucion(java.util.Set)
	 */
	public List<DocEjecucionPresupuestoTO> crearDocEjecucion(List<DocEjecucionPresupuestoTO> docEjecucionPresupuestoList) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		List<DocEjecucionPresupuestoDO> docEjecucionPresupuestoListRes = null;
		if (docEjecucionPresupuestoList != null && docEjecucionPresupuestoList.size() > 0) {
			for (DocEjecucionPresupuestoTO doc : docEjecucionPresupuestoList) {
				if (doc.getNombre() == null || doc.getNombre().trim().length() == 0 || doc.getNombre().trim() == "") {
					throw new ValidacionExcepcion("falta.Nombre.documento")	;
				}
				if (doc.getDescripcion() == null || doc.getDescripcion().trim().length() == 0 || doc.getDescripcion().trim() == "") {
					throw new ValidacionExcepcion("falta.descripci\u00f3n.documento")	;
				}

				if (doc.getIdEjecPres() == null) {
					throw new ValidacionExcepcion("falta.ejecuci\u00f3n.presupuesto.documento")	;
				}	
			}

			Set<DocEjecucionPresupuestoDO> docEjecucionPresupuestoListAgregar = new LinkedHashSet<DocEjecucionPresupuestoDO>();


			for (DocEjecucionPresupuestoTO docTO : docEjecucionPresupuestoList) {
				DocEjecucionPresupuestoDO docDO = new DocEjecucionPresupuestoDO();
				docDO = getDocEjecucionPresupuestoTransf().transferirTODO(docTO);
				docEjecucionPresupuestoListAgregar.add(docDO);
			}
			docEjecucionPresupuestoListRes = getDocEjecucionPresupuestoDAO().persistir(docEjecucionPresupuestoListAgregar);


			if (docEjecucionPresupuestoListRes == null || docEjecucionPresupuestoListRes.size() != docEjecucionPresupuestoListAgregar.size()) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.documento.ejecuci\u00f3n");
			}

			docEjecucionPresupuestoList.clear();
			for (DocEjecucionPresupuestoDO docObjeDO : docEjecucionPresupuestoListRes) {
				DocEjecucionPresupuestoTO docObjTO = new DocEjecucionPresupuestoTO();
				docObjTO = getDocEjecucionPresupuestoTransf().transferirDOTO(docObjeDO);
				docEjecucionPresupuestoList.add(docObjTO);
			}

		} else {
			throw new ValidacionExcepcion("falta.informaci\u00f3n.documento.ejecuci\u00f3n")	;
		}


		return docEjecucionPresupuestoList;

	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.ejecucion.IEjecucionServicio#modificarDocEjecucion(com.cpcoriente.sgp.springgwt.pro.server.ejecucion.entity.DocEjecucionPresupuestoDO)
	 */
	public boolean modificarDocEjecucion(DocEjecucionPresupuestoTO docEjecucionPresupuesto)	throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		DocEjecucionPresupuestoDO docEjecucionPresupuestoProv = getDocEjecucionPresupuestoTransf().transferirTODO(docEjecucionPresupuesto);

		try {

			DocEjecucionPresupuestoDO docEjecucionPresupuestoMod = getDocEjecucionPresupuestoDAO().modificar(docEjecucionPresupuestoProv);
			if(docEjecucionPresupuestoMod == null){
				throw new RecursoExcepcion("fallo.modificaci\u00f3n.documento.ejecuci\u00f3n");
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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.ejecucion.IEjecucionServicio#eliminarDocEjecucion(java.util.List)
	 */
	public boolean eliminarDocEjecucion(List<Long> idDocEjecucionPresupuestoLista) throws ValidacionExcepcion, PrecondicionExcepcion {
		
		if (idDocEjecucionPresupuestoLista == null) {
			throw new ValidacionExcepcion("falta.identificador.documento.ejecuci\u00f3n.presupuesto");
		}

		try {

			boolean res = getDocEjecucionPresupuestoDAO().eliminar(idDocEjecucionPresupuestoLista);

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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.ejecucion.IEjecucionServicio#seleccionDocPorEjecucionPresupuesto(java.lang.Long)
	 */
	public List<DocEjecucionPresupuestoTO> seleccionDocPorEjecucionPresupuesto(Long idEjecucionPresupuesto) throws ValidacionExcepcion, PrecondicionExcepcion {


		if (idEjecucionPresupuesto == null) {
			throw new ValidacionExcepcion("falta.identificador.objetivo");
		}


		List<DocEjecucionPresupuestoDO> docEjecucionPresupuestoLista = getDocEjecucionPresupuestoDAO().seleccionPorEjecucionPresupuesto(idEjecucionPresupuesto);

		if (docEjecucionPresupuestoLista == null || docEjecucionPresupuestoLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.documento.ejecuci\u00f3n.presupuesto");
		}

		DocEjecucionPresupuestoTO docEjecucionPresupuestoTO = null;
		List<DocEjecucionPresupuestoTO> docEjecucionPresupuestoTOLista = new ArrayList<DocEjecucionPresupuestoTO>(docEjecucionPresupuestoLista.size());
		for (DocEjecucionPresupuestoDO doc : docEjecucionPresupuestoLista) {

			docEjecucionPresupuestoTO = getDocEjecucionPresupuestoTransf().transferirDOTO(doc);
			docEjecucionPresupuestoTOLista.add(docEjecucionPresupuestoTO);
		}

		return docEjecucionPresupuestoTOLista;
		
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.ejecucion.IEjecucionServicio#cargarEjecucion(java.lang.Long)
	 */
	public EjecucionPresupuestoTO cargarEjecucion(Long idEjecucionPresupuesto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		EjecucionPresupuestoTO ejecucionTO = null;
		EjecucionPresupuestoDO ejecucionDO = null;

		if (idEjecucionPresupuesto == null) {
			throw new ValidacionExcepcion("falta.id.ejecuci\u00f3n");
		}

		ejecucionDO = getEjecucionPresupuestoDAO().cargar(idEjecucionPresupuesto);

		if (ejecucionDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.ejecuci\u00f3n");
		}

		ejecucionTO = getEjecucionPresupuestoTransf().transferirDOTO(ejecucionDO);

		return ejecucionTO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.client.ejecucion.IEjecucionServicio#crearEjecucion(com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.objeto.EjecucionPresupuestoTO)
	 */
	public Long crearEjecucion(EjecucionPresupuestoTO ejecucionPresupuesto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		if(ejecucionPresupuesto == null){
			throw new ValidacionExcepcion("falta.informaci\u00f3n.ejecuci\u00f3n.presupuesto");
		}

		try {


			EjecucionPresupuestoDO ejecucionPresupuestoProv = null;

			Long idRegistrado = null;

			ejecucionPresupuestoProv = getEjecucionPresupuestoTransf().transferirTODO(ejecucionPresupuesto);
			EjecucionPresupuestoDO ejecucionPresupuestoReg = getEjecucionPresupuestoDAO().persistir(ejecucionPresupuestoProv);
			if (ejecucionPresupuestoReg == null) {
				throw new RecursoExcepcion("fallo.creaci\u00f3n.ejecuci\u00f3n.presupuesto");
			}

			if (ejecucionPresupuesto.getDocumentoLista() != null && ejecucionPresupuesto.getDocumentoLista().size() > 0) {
				List<DocEjecucionPresupuestoDO> docListRes = null;
				
				for (DocEjecucionPresupuestoTO doc : ejecucionPresupuesto.getDocumentoLista()) {
					if (doc.getNombre() == null || doc.getNombre().trim().length() == 0 || doc.getNombre().trim() == "") {
						throw new ValidacionExcepcion("falta.Nombre.documento")	;
					}
					if (doc.getDescripcion() == null || doc.getDescripcion().trim().length() == 0 || doc.getDescripcion().trim() == "") {
						throw new ValidacionExcepcion("falta.descripci\u00f3n.documento")	;
					}
				}

				Set<DocEjecucionPresupuestoDO> docListAgregar = new LinkedHashSet<DocEjecucionPresupuestoDO>();


				for (DocEjecucionPresupuestoTO docEjecPresTO : ejecucionPresupuesto.getDocumentoLista()) {
					DocEjecucionPresupuestoDO docEjecPresDO = new DocEjecucionPresupuestoDO();
					docEjecPresDO = getDocEjecucionPresupuestoTransf().transferirTODO(docEjecPresTO);
					docEjecPresDO.setIdEjecPres(ejecucionPresupuestoReg.getId());
					docListAgregar.add(docEjecPresDO);
				}
				docListRes = getDocEjecucionPresupuestoDAO().persistir(docListAgregar);


				if (docListRes == null || docListRes.size() != docListAgregar.size()) {
					throw new RecursoExcepcion("fallo.creaci\u00f3n.documento");
				}

			} 

			idRegistrado = ejecucionPresupuestoReg.getId();

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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.ejecucion.IEjecucionServicio#modificarEjecucion(com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.objeto.EjecucionPresupuestoTO)
	 */
	public boolean modificarEjecucion(EjecucionPresupuestoTO ejecucionPresupuesto) throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
		
		
		EjecucionPresupuestoDO ejecucionPresupuestoProv = getEjecucionPresupuestoTransf().transferirTODO(ejecucionPresupuesto);

		try {

			EjecucionPresupuestoDO ejecucionPresupuestoMod = getEjecucionPresupuestoDAO().modificar(ejecucionPresupuestoProv);
			if(ejecucionPresupuestoMod == null){
				throw new RecursoExcepcion("fallo.modificaci\u00f3n.ejecuci\u00f3n.presupuesto");
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
	 * @see com.cpcoriente.sgp.springgwt.pro.client.ejecucion.IEjecucionServicio#seleccionGeneralEjecucion(java.lang.Long, int, java.lang.String, java.util.Date, java.util.Date, java.util.Date, java.util.Date, java.lang.Boolean, java.lang.Boolean, java.lang.Long, java.lang.Long)
	 */
	public List<EjecucionPresupuestoTO> seleccionGeneralEjecucion(Long idTercero, int tipoComprobante, String numComprobante, Date fechaRegIni, Date fechaRegFin, Date fechaEjecIni, Date fechaEjecFin, Boolean aprobado, Boolean ejecutado,
			Long idRecurso, Long idProyectoEntidad) throws ValidacionExcepcion, PrecondicionExcepcion {
		
		
		if ((fechaRegIni == null && fechaRegFin != null) || (fechaRegFin == null && fechaRegIni != null) || (fechaRegIni != null && fechaRegFin != null && fechaRegIni.after(fechaRegFin)) ) {
			throw new ValidacionExcepcion("error.rango.registro.fechas");
		}

		if ((fechaEjecIni == null && fechaEjecFin != null) || (fechaEjecFin == null && fechaEjecIni != null) || (fechaEjecIni != null && fechaEjecFin != null && fechaEjecIni.after(fechaEjecFin)) ) {
			throw new ValidacionExcepcion("error.rango.ejecuci\u00f3n.fechas");
		}
		

		List<EjecucionPresupuestoDO> ejecucionPresupuestoLista = getEjecucionPresupuestoDAO().seleccionGeneral(idTercero, tipoComprobante, numComprobante, fechaRegIni, fechaRegFin, fechaEjecIni, fechaEjecFin, aprobado, ejecutado, idRecurso, idProyectoEntidad);
				

		if (ejecucionPresupuestoLista == null || ejecucionPresupuestoLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.ejecuci\u00f3n.presupuesto");
		}

		EjecucionPresupuestoTO ejecucionPresupuestoTO = null;
		List<EjecucionPresupuestoTO> ejecucionPresupuestoTOLista = new ArrayList<EjecucionPresupuestoTO>(ejecucionPresupuestoLista.size());
		for (EjecucionPresupuestoDO ejecPres : ejecucionPresupuestoLista) {

			ejecucionPresupuestoTO = getEjecucionPresupuestoTransf().transferirDOTO(ejecPres);
			ejecucionPresupuestoTOLista.add(ejecucionPresupuestoTO);
		}

		return ejecucionPresupuestoTOLista;
	}
	
	
	

}
