/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.localidad.todo.transfer;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.DepartamentoDO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.entity.PaisDO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao.IDepartamentoDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.IDepartamentoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.IPaisTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO;



/**
 * @author CPC-04
 *
 */
public class PaisTransf implements IPaisTransf{

	private static final Logger log = Logger.getLogger(PaisTransf.class.getName());
	
	private IDepartamentoTransf getDepartamentoTransf() {
        return TransfFactory.getInstance().getDepartamentoTransf();
    }

	private IDepartamentoDAO getDepartamentoDAO() {
        return DAOFactory.getInstance().getDepartamentoDao();
    }
	
	public PaisDO transferirTODO(PaisTO paisTO) {

		PaisDO paisDO = new PaisDO();
		
		  
		if (paisTO.getId() != null) {
			paisDO.setId(paisTO.getId());
		}
		
		paisDO.setCodigo(paisTO.getCodigo());
		paisDO.setNombre(paisTO.getNombre());		
		
		if(paisTO.getDptoList() != null && paisTO.getDptoList().size() > 0) {
			DepartamentoDO dptoCargado = null;
			Set<DepartamentoDO> dptoDOSet = new LinkedHashSet<DepartamentoDO>();
			for(DepartamentoTO dpto : paisTO.getDptoList()) {
				dptoCargado = getDepartamentoDAO().cargar(dpto.getId());
                 if (dptoCargado != null) {
                	 dptoCargado.setPais(paisDO);
                	 dptoDOSet.add(dptoCargado);
                 } else {
                     log.warning("esta tratando de cargar un departamento inexistente con id: " + dpto.getId());
                 }
			}
			if (dptoDOSet.size() > 0) {
				paisDO.setDptoSet(dptoDOSet);
			}
		}
		
		return paisDO;
	}

	public PaisTO transferirDOTO(PaisDO paisDO) {

		PaisTO paisTO = new PaisTO();
		
		paisTO.setId(paisDO.getId());
		paisTO.setCodigo(paisDO.getCodigo());
		paisTO.setNombre(paisDO.getNombre());
		
	    if (paisDO.getDptoSet() != null && paisDO.getDptoSet().size() > 0) {
	    	List<DepartamentoTO> dptoTOLista = new ArrayList<DepartamentoTO>(paisDO.getDptoSet().size());
	    	DepartamentoTO dptoProv = null;
	    	for( DepartamentoDO dpto : paisDO.getDptoSet() ){
	    		dptoProv = getDepartamentoTransf().transferirDOTO(dpto);
	    		dptoTOLista.add(dptoProv);
	    	}
	    	if (dptoTOLista.size() > 0){
	    		paisTO.setDptoList(dptoTOLista);
	    	}
	    }
		
		return paisTO;
	}

}
