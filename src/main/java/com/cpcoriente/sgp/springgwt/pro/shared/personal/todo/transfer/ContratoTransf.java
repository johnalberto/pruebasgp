/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.personal.todo.transfer;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;


import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.ClausulaContratoDO;
import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.ContratoDO;
import com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao.ICargoPorPersonalDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.enumerador.EstadoContratoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.enumerador.TipoContratoEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.enumerador.TipoTiempoDedicacionEnum;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.IClausulaContratoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.IContratoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.ClausulaContratoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.ContratoTO;

/**
 * @author CPC-04
 *
 */
public class ContratoTransf implements IContratoTransf {

	
	private static final Logger log = Logger.getLogger(ContratoTransf.class.getName());
	
	private ICargoPorPersonalDAO getCargoPorPersonalDAO() {
        return DAOFactory.getInstance().getCargoPorPersonalDao();
    }
	
	private IClausulaContratoTransf getClausulaContratoTransf() {
        return TransfFactory.getInstance().getClausulaContratoTransf();
    }
	
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.IContratoTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.ContratoTO)
	 */
	public ContratoDO transferirTODO(ContratoTO contratoTO) {
		
		ContratoDO contratoDO = new ContratoDO();
		
		if (contratoTO.getId() != null) {
			contratoDO.setId(contratoTO.getId());
		}
		
		contratoDO.setCodigo(contratoTO.getCodigo());
		contratoDO.setEstado(contratoTO.getEstado().getValor());
		contratoDO.setFechaInicio(contratoTO.getFechaInicio());
		contratoDO.setFechaFin(contratoTO.getFechaFin());
		contratoDO.setTiempoDedicado(contratoTO.getTiempoDedicado().getValor());
		contratoDO.setTipo(contratoTO.getTipo().getValor());
		contratoDO.setValorMensual(contratoTO.getValorMensual());
		contratoDO.setValorTotal(contratoTO.getValorTotal());
		contratoDO.setVersion(contratoTO.getVersion());
		
		if (contratoTO.getCpp() != null) {
			contratoDO.setCpp(getCargoPorPersonalDAO().cargar(contratoTO.getCpp().getId()));
		}
		
		if(contratoTO.getClausulaLista() != null && contratoTO.getClausulaLista().size() > 0) {
			ClausulaContratoDO clausulaCargada = null;
			Set<ClausulaContratoDO> clausulaDOSet = new LinkedHashSet<ClausulaContratoDO>();
			for(ClausulaContratoTO clausula : contratoTO.getClausulaLista()) {
				clausulaCargada = getClausulaContratoTransf().transferirTODO(clausula);
                 if (clausulaCargada != null) {
                	 clausulaCargada.setContrato(contratoDO);
                	 clausulaDOSet.add(clausulaCargada);
                 } else {
                     log.warning("esta tratando de cargar un detalle de Contrato inexistente con id: " + clausula.getId());
                 }
			}
			if (clausulaDOSet.size() > 0) {
				contratoDO.setClausulaSet(clausulaDOSet);
			}
		}
		
		return contratoDO;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.IContratoTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.personal.entity.ContratoDO)
	 */
	public ContratoTO transferirDOTO(ContratoDO contratoDO) {

		ContratoTO contratoTO = new ContratoTO();
		
		contratoTO.setId(contratoTO.getId());
		
		contratoTO.setCodigo(contratoDO.getCodigo());
		contratoTO.setEstado(EstadoContratoEnum.tomarTipoPorValor(contratoDO.getEstado()));
		contratoTO.setFechaInicio(contratoDO.getFechaInicio());
		contratoTO.setFechaFin(contratoDO.getFechaFin());
		contratoTO.setTiempoDedicado(TipoTiempoDedicacionEnum.tomarTipoPorValor(contratoDO.getTiempoDedicado()));
		contratoTO.setTipo(TipoContratoEnum.tomarTipoPorValor(contratoDO.getTipo()));
		contratoTO.setValorMensual(contratoDO.getValorMensual());
		contratoTO.setValorTotal(contratoDO.getValorTotal());
		contratoTO.setVersion(contratoDO.getVersion());
		
		if(contratoDO.getClausulaSet() != null && contratoDO.getClausulaSet().size() > 0) {
			ClausulaContratoTO clausulaCargada = null;
			List<ClausulaContratoTO> clausulaTOList = new ArrayList<ClausulaContratoTO>(contratoDO.getClausulaSet().size());
			
			for(ClausulaContratoDO clausula : contratoDO.getClausulaSet()) {
				clausulaCargada = getClausulaContratoTransf().transferirDOTO(clausula);
				clausulaTOList.add(clausulaCargada);                 
			}
			if (clausulaTOList.size() > 0) {
				contratoTO.setClausulaLista(clausulaTOList);
			}
		}
		
		
		
		return contratoTO;
	}

}
