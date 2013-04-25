package com.cpcoriente.sgp.springgwt.pro.server;

import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.cpcoriente.sgp.springgwt.pro.client.parametro.IParametroServicio;
import com.cpcoriente.sgp.springgwt.pro.server.factory.DAOFactory;
import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.parametro.entity.ParametroGeneralDO;
import com.cpcoriente.sgp.springgwt.pro.server.parametro.interfaces.dao.IParametroGeneralDAO;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion;
import com.cpcoriente.sgp.springgwt.pro.shared.parametro.interfaces.transfer.IParametroGeneralTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.parametro.objeto.ParametroGeneralTO;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;


@Service
public class ParametroServicioImpl extends RemoteServiceServlet  implements IParametroServicio {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6738018632448354854L;

	
	private IParametroGeneralDAO getParametroDAO() {
		return DAOFactory.getInstance().getParametroGeneralDao();
	}

	private IParametroGeneralTransf getParametroTransf() {
		return TransfFactory.getInstance().getParametroTransf();
	}
	
	public void init() {

	}
	
	
	public ParametroGeneralTO cargarParametro(String parametroId)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		ParametroGeneralTO parametroTO = null;
		ParametroGeneralDO parametroDO = null;

		if (parametroId == null || parametroId.trim().isEmpty() || parametroId.contains(" ")  ) {
			throw new ValidacionExcepcion("falta.id.parametro");
		}

		parametroDO = getParametroDAO().cargar(parametroId);

		if (parametroDO == null) {
			throw new PrecondicionExcepcion("inexistente.id.parametro");
		}

		parametroTO = getParametroTransf().transferirDOTO(parametroDO);
		
		return parametroTO;
	}
	


	public boolean modificarParametro(ParametroGeneralTO parametro)
			throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {

		if(parametro == null){
			throw new ValidacionExcepcion("falta.informacion.parametro")	;
		}
		if(parametro.getId() == null || parametro.getId().trim().isEmpty() || parametro.getId().contains(" ") ){
			throw new ValidacionExcepcion("falta.identificador.parametro")	;
		}
		
		if(parametro.getDescripcion() == null || parametro.getDescripcion().trim().isEmpty() ){
			throw new ValidacionExcepcion("falta.descripcion.parametro")	;
		}
		
		if(parametro.getValor() == null || parametro.getValor().trim().isEmpty()){
			throw new ValidacionExcepcion("falta.nombre.parametro")	;
		}

		ParametroGeneralDO lineaProv = getParametroDAO().cargar(parametro.getId());
		if (lineaProv == null) {
			throw new PrecondicionExcepcion("inexistente.identificador.parametro");
		}

		lineaProv = getParametroTransf().transferirTODO(parametro); 
		ParametroGeneralDO lineaMod = getParametroDAO().modificar(lineaProv);
		if (lineaMod == null) {
			throw new RecursoExcepcion("fallo.creacion.parametro");
		}

		return true;	
		
	}

	public boolean eliminarParametro(String idParamatro)
			throws ValidacionExcepcion, PrecondicionExcepcion {
		
		  try {
	            ParametroGeneralDO parametro = null;
	            parametro = getParametroDAO().cargar(idParamatro);
	            if (parametro == null) {
	                throw new PrecondicionExcepcion("inexistente.identificador.parametro");
	            }
	            boolean res = getParametroDAO().eliminar(idParamatro);

	            return res;
	        } catch (DataAccessException e) {
	            throw new PrecondicionExcepcion("inexistente.identificdor.parametro" + e.getMessage());
	        }
		
      	}

	public List<ParametroGeneralTO> listarTodosParametro()
			throws PrecondicionExcepcion {
		
		List<ParametroGeneralDO> parametroLista = getParametroDAO().listarTodo();
		if (parametroLista == null || parametroLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.articulo");
		}

		ParametroGeneralTO parametroTO = null;
		List<ParametroGeneralTO> articuloTOLista = new ArrayList<ParametroGeneralTO>(parametroLista.size());
		for (ParametroGeneralDO parametro : parametroLista) {
			parametroTO = getParametroTransf().transferirDOTO(parametro);
			articuloTOLista.add(parametroTO);
		}
		return articuloTOLista;
	}

	public List<ParametroGeneralTO> buscarParametrosPorDescripcion(String descripcion)
			throws PrecondicionExcepcion, ValidacionExcepcion {
		
		if (descripcion == null || descripcion.trim().isEmpty()) {
            throw new ValidacionExcepcion("falta.descripcion.parametro");
        }
		
		List<ParametroGeneralDO> parametroLista = getParametroDAO().buscarPorDescripcion(descripcion);
		if (parametroLista == null || parametroLista.size() < 0) {
			throw new PrecondicionExcepcion("inexistente.listado.parametro.con.descripcion");
		}
		
		ParametroGeneralTO paisTO = null;
		List<ParametroGeneralTO> paisTOLista = new ArrayList<ParametroGeneralTO>(parametroLista.size());
		for (ParametroGeneralDO pais : parametroLista) {
			paisTO = getParametroTransf().transferirDOTO(pais);
			paisTOLista.add(paisTO);
		}
		
		return paisTOLista;
		
	}


	

}
