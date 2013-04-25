/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.todo.transfer;


import com.cpcoriente.sgp.springgwt.pro.server.ejecucion.entity.DocEjecucionPresupuestoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.interfaces.transfer.IDocEjecucionPresupuestoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.objeto.DocEjecucionPresupuestoTO;

/**
 * @author CPC-04
 *
 */
public class DocEjecucionPresupuestoTransf implements IDocEjecucionPresupuestoTransf{

	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.interfaces.transfer.IDocEjecucionPresupuestoTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.objeto.DocEjecucionPresupuestoTO)
	 */
	public DocEjecucionPresupuestoDO transferirTODO(DocEjecucionPresupuestoTO docEjecucionPresupuestoTO) {

        DocEjecucionPresupuestoDO docEjecucionPresupuestoDO = new DocEjecucionPresupuestoDO();
		
		if (docEjecucionPresupuestoTO.getId() != null) {
			docEjecucionPresupuestoDO.setId(docEjecucionPresupuestoTO.getId());
		}
		
		
		docEjecucionPresupuestoDO.setDescripcion(docEjecucionPresupuestoTO.getDescripcion());
		docEjecucionPresupuestoDO.setDocumento(docEjecucionPresupuestoTO.getDocumento());
		docEjecucionPresupuestoDO.setFechaRegistro(docEjecucionPresupuestoTO.getFechaRegistro());
		docEjecucionPresupuestoDO.setNombre(docEjecucionPresupuestoTO.getNombre());
		docEjecucionPresupuestoDO.setVersion(docEjecucionPresupuestoTO.getVersion());
		
		if (docEjecucionPresupuestoTO.getIdEjecPres() != null) {
			docEjecucionPresupuestoDO.setIdEjecPres(docEjecucionPresupuestoTO.getIdEjecPres());
		}
		
		
		return docEjecucionPresupuestoDO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.interfaces.transfer.IDocEjecucionPresupuestoTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.ejecucion.entity.DocEjecucionPresupuestoDO)
	 */
	public DocEjecucionPresupuestoTO transferirDOTO(DocEjecucionPresupuestoDO docEjecucionPresupuestoDO) {

		DocEjecucionPresupuestoTO docEjecucionPresupuestoTO = new DocEjecucionPresupuestoTO();
			
			docEjecucionPresupuestoDO.setId(docEjecucionPresupuestoTO.getId());
		
			docEjecucionPresupuestoTO.setDescripcion(docEjecucionPresupuestoDO.getDescripcion());
			docEjecucionPresupuestoTO.setDocumento(docEjecucionPresupuestoDO.getDocumento());
			docEjecucionPresupuestoTO.setFechaRegistro(docEjecucionPresupuestoDO.getFechaRegistro());
			docEjecucionPresupuestoTO.setNombre(docEjecucionPresupuestoDO.getNombre());
			docEjecucionPresupuestoTO.setVersion(docEjecucionPresupuestoDO.getVersion());
			
			if (docEjecucionPresupuestoDO.getIdEjecPres() != null) {
				docEjecucionPresupuestoTO.setIdEjecPres(docEjecucionPresupuestoDO.getIdEjecPres());
			}
		
		return docEjecucionPresupuestoTO;
	}
	
	
	
	
}
