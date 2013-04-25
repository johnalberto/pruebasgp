/**
 * 
 */
package com.cpcoriente.cidecuero.springgwt.MrpCrm.test.servicio;

/**
 * @author CPC-04
 *
 */


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cpcoriente.cidecuero.springgwt.MrpCrm.client.ILocalidadServicio;
import com.cpcoriente.cidecuero.springgwt.MrpCrm.server.factory.ServicioFactory;
import com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.PrecondicionExcepcion;
import com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.RecursoExcepcion;
import com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.ValidacionExcepcion;
import com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO;
import com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO;
import com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.permiso.todo.transfer.ModuloTransf;



/**
 * @author CPC-04
 *
 */
public class LoscalidadServicioImplTest {

	
/**
 * @throws java.lang.Exception
 */

private static ILocalidadServicio ls;

private static final Logger log = Logger.getLogger(ModuloTransf.class.getName());
@BeforeClass
public static  void setUpBeforeClass() throws Exception {
	
	ls = (ILocalidadServicio) ServicioFactory.getInstance().getLocalidadServicio();
}


/**
 * @throws java.lang.Exception
 */
@AfterClass
public static void tearDownAfterClass() throws Exception {
}

/**
 * @throws java.lang.Exception
 */
@Before
public void setUp() throws Exception {
}

/**
 * @throws java.lang.Exception
 */
@After
public void tearDown() throws Exception {
}

/**
 * Test method for {@link com.cpcoriente.cidecuero.springgwt.MrpCrm.servicio.LocalidadServicio#crearPais(com.cpcoriente.cidecuero.springgwt.MrpCrm.localidad.objeto.PaisTO)}.
 * @throws RecursoExcepcion 
 * @throws ValidacionExcepcion 
 * @throws PrecondicionExcepcion 
 */
@Test
public void testCrearPais() throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion  {
	PaisTO pais = new PaisTO();
	pais.setId("0021");
	pais.setNombre("España");
	String idReg = ls.crearPais(pais);
	assertTrue(idReg == pais.getId());

}

/**
 * Test method for {@link com.cpcoriente.cidecuero.springgwt.MrpCrm.servicio.LocalidadServicio#crearDpto(com.cpcoriente.cidecuero.springgwt.MrpCrm.localidad.objeto.DepartamentoTO)}.
 * @throws RecursoExcepcion 
 * @throws PrecondicionExcepcion 
 * @throws ValidacionExcepcion 
 * @throws RecursoExcepcion 
 * @throw throws ValidacionExcepcion, PrecondicionExcepcion, RecursoExcepcions PrecondicionExcepcion 
 */
@Test
public void testCrearDpto() throws ValidacionExcepcion, RecursoExcepcion, PrecondicionExcepcion {
	PaisTO pais = new PaisTO();
	pais.setId("0022");
	pais.setNombre("Venezuela");
	String idRegp = ls.crearPais(pais);

	
	PaisTO paisPrueba = ls.cargarPais("0021");
	
	//log.info("INFORMACION DEL PAIS : " +paisPrueba.getNombre() + " --> "+paisPrueba.getId()  );
	DepartamentoTO dpto = new DepartamentoTO();
	dpto.setId("005");
	dpto.setNombre("departameto 5");
	dpto.setPais(paisPrueba);
	String idReg = ls.crearDpto(dpto);
	assertTrue(idReg == dpto.getId());
	
	DepartamentoTO dpto2 = new DepartamentoTO();
	dpto2.setId("006");
	dpto2.setNombre("departameto 6");
	dpto2.setPais(paisPrueba);
	String idReg2 = ls.crearDpto(dpto2);
	
	DepartamentoTO dpto3 = new DepartamentoTO();
	dpto3.setId("007");
	dpto3.setNombre("departameto7");
	dpto3.setPais(paisPrueba);
	String idReg3 = ls.crearDpto(dpto3);
	
	assertTrue(idReg == dpto.getId() && idReg2 == dpto2.getId() && idReg3 == dpto3.getId());

	
}

/**
 * Test method for {@link com.cpcoriente.cidecuero.springgwt.MrpCrm.servicio.LocalidadServicio#crearCiudad(com.cpcoriente.cidecuero.springgwt.MrpCrm.localidad.objeto.CiudadTO)}.
 */
@Test
public void testCrearCiudad() {
	fail("Not yet implemented");
}

}
