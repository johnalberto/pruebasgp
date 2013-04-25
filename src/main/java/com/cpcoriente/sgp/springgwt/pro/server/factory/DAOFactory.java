/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IActividadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IActividadPorPersonalDAO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IDocObjetivoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IEntregableDAO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IObjetivoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IProductoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IVersionActividadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IVersionEntregableDAO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IVersionObjetivoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.actividad.interfaces.dao.IVersionProductoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.calendario.interfaces.dao.ICalendarioNoLaboralDAO;
import com.cpcoriente.sgp.springgwt.pro.server.calendario.interfaces.dao.IDiaNoLaboralDAO;
import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.interfaces.dao.IImpuestoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.interfaces.dao.IMovimientoContableDAO;
import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.interfaces.dao.IMovimientoContableDetalleDAO;
import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.interfaces.dao.IPucDAO;
import com.cpcoriente.sgp.springgwt.pro.server.contabilidad.interfaces.dao.IPucPorProyectoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.interfaces.dao.IDestinoMensajeDAO;
import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.interfaces.dao.IDocMensajeDAO;
import com.cpcoriente.sgp.springgwt.pro.server.correspondencia.interfaces.dao.IMensajeDAO;
import com.cpcoriente.sgp.springgwt.pro.server.ejecucion.interfaces.dao.IDocEjecucionPresupuestoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.ejecucion.interfaces.dao.IEjecucionPresupuestoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IActividadEconomicaDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IConvocatoriaDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IDivisionDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IDocTerminoConvocatoriaDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IEmpresaDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IEntidadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IFotoEntidadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.ITerminoConvocatoriaDAO;
import com.cpcoriente.sgp.springgwt.pro.server.entidad.interfaces.dao.IVersionTerminoConvocatoriaDAO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IRecursoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IRecursoDetalleDAO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IRubroDAO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IRubroProyectoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IUnidadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IVersionRecursoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.financiero.interfaces.dao.IVersionRecursoDetalleDAO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IDocInformeDAO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IInfoInterEntregableDetalleDAO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IInfoInterProductoDetalleDAO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IInformeDAO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IInformeDetalleDAO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IInformeInterventorDAO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IRevInterventorFinDAO;
import com.cpcoriente.sgp.springgwt.pro.server.informe.interfaces.dao.IRevInterventorFinDetDAO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao.ICiudadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao.IDepartamentoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.localidad.interfaces.dao.IPaisDAO;
import com.cpcoriente.sgp.springgwt.pro.server.parametro.interfaces.dao.IParametroGeneralDAO;
import com.cpcoriente.sgp.springgwt.pro.server.parametro.interfaces.dao.IParametroPorProyectoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.ILogUsuarioDAO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.IPermisoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.IUsuarioDAO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.IUsuarioEntidadTipoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.IUsuarioPorTipoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.permiso.interfaces.dao.IUsuarioProyectoEntidadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao.ICargoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao.ICargoPorPersonalDAO;
import com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao.IClausulaContratoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao.IClausulaTipoContratoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao.IContratoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao.IDocContratoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.personal.interfaces.dao.IPersonalDAO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IContactoProyectoEntidadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IDocProyectoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IProyectoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IProyectoEntidadDAO;
import com.cpcoriente.sgp.springgwt.pro.server.proyecto.interfaces.dao.IVersionProyectoDAO;
import com.cpcoriente.sgp.springgwt.pro.server.tercero.interfaces.dao.ITerceroDAO;
import com.cpcoriente.sgp.springgwt.pro.server.tercero.interfaces.dao.ITerceroPorTipoDAO;

/**
 * @author CPC-04
 *
 */
public class DAOFactory {
	
	private static DAOFactory instance;

	private synchronized static DAOFactory newInstance() {
		return new DAOFactory();
	}
	private BeanFactory factory;

	private DAOFactory() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/app-config.xml");
		factory = (BeanFactory) ctx;
	}

	public static DAOFactory getInstance() {
		if (instance == null) {
			instance = newInstance();
		}
		return instance;
	}

	public IPaisDAO getPaisDao() {
		return (IPaisDAO) factory.getBean("paisDao");
	}

	public IDepartamentoDAO getDepartamentoDao() {
		return (IDepartamentoDAO) factory.getBean("dptoDao");
	}

	public ICiudadDAO getCiudadDao() {
		return (ICiudadDAO) factory.getBean("ciudadDao");
	}

	public IEntidadDAO getEntidadoDao() {
		return (IEntidadDAO) factory.getBean("entidadDao");
	}

	

	public IUsuarioPorTipoDAO getUsuarioPorTipoDao() {
		return (IUsuarioPorTipoDAO) factory.getBean("usuarioPorTipoDao");
	}

	public IUsuarioDAO getUsuarioDao() {
		return (IUsuarioDAO) factory.getBean("usuarioDao");
	}

	
	public IParametroGeneralDAO getParametroGeneralDao() {
		return (IParametroGeneralDAO) factory.getBean("parametroGeneralDao");
	}
	
	public IParametroPorProyectoDAO getParametroPorProyectoDao() {
		return (IParametroPorProyectoDAO) factory.getBean("parametroPorProyectoDao");
	}
	
	
	public ILogUsuarioDAO getLogUsuarioDao() {
		return (ILogUsuarioDAO) factory.getBean("logUsuarioDao");
	}
	
	public ICargoDAO getCargoDao() {
		return (ICargoDAO) factory.getBean("cargoDao");
	}
	
	public ICargoPorPersonalDAO getCargoPorPersonalDao() {
		return (ICargoPorPersonalDAO) factory.getBean("cargoPorPersonalDao");
	}
	
	public IClausulaTipoContratoDAO getClausulaTipoContratoDao() {
		return (IClausulaTipoContratoDAO) factory.getBean("clausulaTipoContratoDao");
	}
	
	public IClausulaContratoDAO getClausulaContratoDao() {
		return (IClausulaContratoDAO) factory.getBean("clausulaContratoDao");
	}
	
	public IContratoDAO getContratoDao() {
		return (IContratoDAO) factory.getBean("contratoDao");
	}
	
	public IDocContratoDAO getDocContratoDao() {
		return (IDocContratoDAO) factory.getBean("docContratoDao");
	}
	
	public IPersonalDAO getPersonalDao() {
		return (IPersonalDAO) factory.getBean("personalDao");
	}
	
	public ITerceroDAO getTerceroDao() {
		return (ITerceroDAO) factory.getBean("terceroDao");
	}
	
	public ITerceroPorTipoDAO getTerceroPorTipoDao() {
		return (ITerceroPorTipoDAO) factory.getBean("terceroPorTipoDao");
	}
	
	public IDivisionDAO getDivisionDao() {
		return (IDivisionDAO) factory.getBean("divisionDao");
	}
	
	public IEmpresaDAO getEmpresaDao(){	
		return (IEmpresaDAO) factory.getBean("empresaDao");
	}
	
	public IProyectoDAO getProyectoDao(){
		return (IProyectoDAO) factory.getBean("proyectoDao");
	}

	
	public IMensajeDAO getMensajeDao(){
		
		return (IMensajeDAO) factory.getBean("mensajeDao");
	}
	
	public ITerminoConvocatoriaDAO getTerminosDao(){
		
		return (ITerminoConvocatoriaDAO) factory.getBean("terminoDao");
	}
	
	public IVersionTerminoConvocatoriaDAO getVersionTerminosDao(){
		
		return (IVersionTerminoConvocatoriaDAO) factory.getBean("versionTerminoDao");
	}

	
	public IObjetivoDAO getObjetivoDao() {
		return (IObjetivoDAO) factory.getBean("objetivoDao");
	}
	
	public IProductoDAO getProductoDao() {
		return (IProductoDAO) factory.getBean("productoDao");
	}
	
	public IActividadDAO getActividadDao() {
		return (IActividadDAO) factory.getBean("actividadDao");
	}
	
	public IActividadPorPersonalDAO getActividadPorPersonalDao() {
		return (IActividadPorPersonalDAO) factory.getBean("actividadPorPersonalDao");
	}
	
	public IDocObjetivoDAO getDocObjetivoDao() {
		return (IDocObjetivoDAO) factory.getBean("docObjetivoDao");
	}
	
	public IEntregableDAO getEntregableDao() {
		return (IEntregableDAO) factory.getBean("entregableDao");
	}
	
	public IVersionObjetivoDAO getVersionObjetivoDao() {
		return (IVersionObjetivoDAO) factory.getBean("versionObjetivoDao");
	}
	
	public IVersionProductoDAO getVersionProductoDao() {
		return (IVersionProductoDAO) factory.getBean("versionProductoDao");
	}
	
	public IVersionActividadDAO getVersionActividadDao() {
		return (IVersionActividadDAO) factory.getBean("versionActividadDao");
	}
	
	public IVersionEntregableDAO getVersionEntregableDao() {
		return (IVersionEntregableDAO) factory.getBean("versionEntregableDao");
	}
	
	
	public ICalendarioNoLaboralDAO getCalendarioNoLaboralDao() {
		return (ICalendarioNoLaboralDAO) factory.getBean("calendarioNoLaboralDao");
	}
	
	public IDiaNoLaboralDAO getDiaNoLaboralDao() {
		return (IDiaNoLaboralDAO) factory.getBean("diaNoLaboralDao");
	}
	
	public IImpuestoDAO getImpuestoDao() {
		return (IImpuestoDAO) factory.getBean("impuestoDao");
	}
	
	public IMovimientoContableDAO getMovimientoContableDao() {
		return (IMovimientoContableDAO) factory.getBean("movimientoContableDao");
	}
	
	public IMovimientoContableDetalleDAO getMovimientoContableDetalleDao() {
		return (IMovimientoContableDetalleDAO) factory.getBean("movimientoContableDetalleDao");
	}
	
	public IPucDAO getPucDao() {
		return (IPucDAO) factory.getBean("pucDao");
	}
	
	public IPucPorProyectoDAO getPucPorProyectoDao() {
		return (IPucPorProyectoDAO) factory.getBean("pucPorProyectoDao");
	}
	
	public IDocEjecucionPresupuestoDAO getDocEjecucionPresupuestoDao() {
		return (IDocEjecucionPresupuestoDAO) factory.getBean("docEjecucionPresupuestoDao");
	}
	
	public IEjecucionPresupuestoDAO getEjecucionPresupuestoDao() {
		return (IEjecucionPresupuestoDAO) factory.getBean("ejecucionPresupuestoDao");
	}
	
	public IInformeDAO getInformeDao() {
		return (IInformeDAO) factory.getBean("informeDao");
	}
	
	public IInformeDetalleDAO getInformeDetalleDao() {
		return (IInformeDetalleDAO) factory.getBean("informeDetalleDao");
	}
	
	public IDocInformeDAO getDocInformeDao() {
		return (IDocInformeDAO) factory.getBean("docInformeDao");
	}
	
	public IInfoInterProductoDetalleDAO getInfoInterProductoDetalleDao() {
		return (IInfoInterProductoDetalleDAO) factory.getBean("infoInterProductoDetalleDao");
	}
	
	public IInfoInterEntregableDetalleDAO getInfoInterEntregableDetalleDao() {
		return (IInfoInterEntregableDetalleDAO) factory.getBean("infoInterEntregableDetalleDao");
	}
	
	
	public IRubroDAO getRubroDao() {
		return (IRubroDAO) factory.getBean("rubroDao");
	}
	
	public IRubroProyectoDAO getRubroProyectoDao() {
		return (IRubroProyectoDAO) factory.getBean("rubroProyectoDao");
	}

	public IVersionProyectoDAO getVersionProyectoDao() {
		return (IVersionProyectoDAO) factory.getBean("versionProyectoDao");
	}
	
	
	public IProyectoEntidadDAO getProyectoEntidadDao() {
		return (IProyectoEntidadDAO) factory.getBean("proyectoEntidadDao");
	}
	
	
	public IUsuarioProyectoEntidadDAO getUsuarioProEntDao() {
		return (IUsuarioProyectoEntidadDAO) factory.getBean("usuProEntDao");
	}
	
	public IInformeInterventorDAO getInfInterventorDao() {
		return (IInformeInterventorDAO) factory.getBean("infInterventorDao");
	}
	
	
	
	
	public IRevInterventorFinDAO getRevIntFinDao() {
		return (IRevInterventorFinDAO) factory.getBean("revIntFinDao");
	}
	
	public IRevInterventorFinDetDAO getRevIntFinDetDao() {
		return (IRevInterventorFinDetDAO) factory.getBean("revIntFinDetDao");
	}
	
	
	public IRecursoDAO getRecursoDao() {
		return (IRecursoDAO) factory.getBean("recursoDao");
	}
	
	public IConvocatoriaDAO getConvocatoriaDao() {
		return (IConvocatoriaDAO) factory.getBean("convocatoriaDao");
	}

	public IActividadEconomicaDAO getActEconomicaDao() {
		return (IActividadEconomicaDAO) factory.getBean("actEconomicaDao");
	}
	
	
	public IRecursoDetalleDAO getRecursoDetalleDao() {
		return (IRecursoDetalleDAO) factory.getBean("recursoDetalleDao");
	}
	
	public IVersionRecursoDAO getVersionRecursoDao() {
		return (IVersionRecursoDAO) factory.getBean("versionRecursoDao");
	}
	
	public IDocMensajeDAO getDocMensajeDao() {
		return (IDocMensajeDAO) factory.getBean("docMensajeDao");
	}
	
	
	public IDestinoMensajeDAO getDestinoMensajeDao() {
		return (IDestinoMensajeDAO) factory.getBean("destinoMensajeDao");
	}
	
	public IDocTerminoConvocatoriaDAO getDocTerminoDao() {
		return (IDocTerminoConvocatoriaDAO) factory.getBean("docTerminoDao");
	}
	
	
	public IFotoEntidadDAO getFotoEntidadDao() {
		return (IFotoEntidadDAO) factory.getBean("fotoDao");
	}
	
	public IContactoProyectoEntidadDAO getContactoEntidadDao() {
		return (IContactoProyectoEntidadDAO) factory.getBean("contactoDao");
	}
	
	public IDocProyectoDAO getDocProyectoDao() {
		return (IDocProyectoDAO) factory.getBean("docProyectoDao");
	}
	
	public IPermisoDAO getPermisoDao() {
		return (IPermisoDAO) factory.getBean("permisoDao");
	}
	
	public IUsuarioEntidadTipoDAO getUsuEntidadTipoDao() {
		return (IUsuarioEntidadTipoDAO) factory.getBean("usuTipoEntidadDao");
	}
	
	public IUnidadDAO getUnidadDao() {
		return (IUnidadDAO) factory.getBean("unidadDao");
	}
	
	public IVersionRecursoDetalleDAO getVersionRecDetDao() {
		return (IVersionRecursoDetalleDAO) factory.getBean("verRecDetDao");
	}
		
}
