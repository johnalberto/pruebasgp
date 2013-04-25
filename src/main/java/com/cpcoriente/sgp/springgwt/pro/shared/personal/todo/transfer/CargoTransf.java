/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.shared.personal.todo.transfer;


import com.cpcoriente.sgp.springgwt.pro.server.factory.TransfFactory;
import com.cpcoriente.sgp.springgwt.pro.server.personal.entity.CargoDO;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.ICargoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.CargoTO;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IProyectoEntidadTransf;

/**
 * @author CPC-04
 *
 */
public class CargoTransf implements ICargoTransf{

	
	private IProyectoEntidadTransf getProyectoEntidadTransf() {
		return TransfFactory.getInstance().getProyectoEntidadTransf();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.ICargoTransf#transferirTODO(com.cpcoriente.sgp.springgwt.pro.shared.personal.objeto.CargoTO)
	 */
	public CargoDO transferirTODO(CargoTO cargoTO) {
		
		CargoDO cargoDO = new CargoDO();
		
		if (cargoTO.getId() != null) {
			cargoDO.setId(cargoTO.getId());
		}
		
		cargoDO.setCodigo(cargoTO.getCodigo());
		cargoDO.setDescripcion(cargoTO.getDescripcion());
		cargoDO.setEducacion(cargoTO.getEducacion());
		cargoDO.setExperiencia(cargoTO.getExperiencia());
		cargoDO.setFormacion(cargoTO.getFormacion());
		cargoDO.setHabilidades(cargoTO.getHabilidades());
		cargoDO.setNombre(cargoTO.getNombre());
		
		if (cargoTO.getProyectoEntidad() != null) {
			cargoDO.setProyectoEntidad(getProyectoEntidadTransf().transferirTODO(cargoTO.getProyectoEntidad()));
		}
		
		return cargoDO;
	}
	

	/*
	 * (non-Javadoc)
	 * @see com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.ICargoTransf#transferirDOTO(com.cpcoriente.sgp.springgwt.pro.server.personal.entity.CargoDO)
	 */
	public CargoTO transferirDOTO(CargoDO cargoDO) {

		CargoTO cargoTO = new CargoTO();
		
		cargoTO.setId(cargoDO.getId());
		
		cargoTO.setCodigo(cargoDO.getCodigo());
		cargoTO.setDescripcion(cargoDO.getDescripcion());
		cargoTO.setEducacion(cargoDO.getEducacion());
		cargoTO.setExperiencia(cargoDO.getExperiencia());
		cargoTO.setFormacion(cargoDO.getFormacion());
		cargoTO.setHabilidades(cargoDO.getHabilidades());
		cargoTO.setNombre(cargoDO.getNombre());
		
		if (cargoDO.getProyectoEntidad() != null) {
			cargoTO.setProyectoEntidad(getProyectoEntidadTransf().transferirDOTO(cargoDO.getProyectoEntidad()));
		}
		
		return cargoTO;
	}

}
