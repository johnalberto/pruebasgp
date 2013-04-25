package com.cpcoriente.sgp.springgwt.pro.shared.localidad.todo.transfer;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.CiudadDO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.DepartamentoDO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao.ICiudadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao.IPaisDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.ICiudadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.IDepartamentoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO;



public class DepartamentoTransf implements IDepartamentoTransf{

	private static final Logger log = Logger.getLogger(DepartamentoTransf.class.getName());
	
	private ICiudadTransf getCiudadTransf() {
        return TransfFactory.getInstance().getCiudadTransf();
    }

	private ICiudadDAO getCiudadDAO() {
        return DAOFactory.getInstance().getCiudadDao();
    }
	
	private IPaisDAO getPaisDAO() {
        return DAOFactory.getInstance().getPaisDao();
    }
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.IDepartamentoTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO)
	 */
	public DepartamentoDO transferirTODO(DepartamentoTO dptoTO) {

		DepartamentoDO dptoDO = new DepartamentoDO();
		
		if(dptoTO.getId() != null){
			dptoDO.setId(dptoTO.getId());
		}
		
		dptoDO.setCodigo(dptoTO.getCodigo());
		dptoDO.setNombre(dptoTO.getNombre());
		

		if(dptoTO.getCiudadList() != null && dptoTO.getCiudadList().size() > 0) {
			CiudadDO ciudadCargado = null;
			Set<CiudadDO> ciudadDOSet = new LinkedHashSet<CiudadDO>();
			for(CiudadTO ciu : dptoTO.getCiudadList()) {
				ciudadCargado = getCiudadDAO().cargar(ciu.getId());
                 if (ciudadCargado != null) {
                	 ciudadCargado.setDpto(dptoDO);
                	 ciudadDOSet.add(ciudadCargado);
                 } else {
                     log.warning("esta tratando de cargar una ciudad inexistente con id: " + ciu.getId());
                 }
			}
			if (ciudadDOSet.size() > 0) {
				dptoDO.setCiudadSet(ciudadDOSet);
			}
		}

		if (dptoTO.getPais() != null) {
			dptoDO.setPais(getPaisDAO().cargar(dptoTO.getPais().getId()));
		}
		
		return dptoDO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.IDepartamentoTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.DepartamentoDO)
	 */
	public DepartamentoTO transferirDOTO(DepartamentoDO dptoDO) {

		DepartamentoTO dptoTO = new DepartamentoTO();
		
		dptoTO.setId(dptoDO.getId());
		dptoTO.setCodigo(dptoDO.getCodigo());
		dptoTO.setNombre(dptoDO.getNombre());
		
		if (dptoDO.getCiudadSet() != null && dptoDO.getCiudadSet().size() > 0) {
			List<CiudadTO> ciudadTOLista = new ArrayList<CiudadTO>(dptoDO.getCiudadSet().size());
			CiudadTO ciuProv = null;
			for (CiudadDO ciu : dptoDO.getCiudadSet()) {
				ciuProv = getCiudadTransf().transferirDOTO(ciu);
				ciudadTOLista.add(ciuProv);
			}
			if (ciudadTOLista.size() > 0) {
				dptoTO.setCiudadList(ciudadTOLista);
			}
		}

		
		return dptoTO;
	}
	
	

}
