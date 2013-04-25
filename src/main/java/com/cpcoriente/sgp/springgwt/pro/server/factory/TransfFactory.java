/**
 * 
 */
package com.cpcoriente.sgp.springgwt.pro.server.factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IActividadPorPersonalTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IActividadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IDocObjetivoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IEntregableTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IObjetivoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IProductoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IVersionActividadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IVersionEntregableTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IVersionObjetivoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.actividad.interfaces.transfer.IVersionProductoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.calendario.interfaces.transfer.ICalendarioNoLaboralTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.calendario.interfaces.transfer.IDiaNoLaboralTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IImpuestoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IMovimientoContableDetalleTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IMovimientoContableTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IPucPorProyectoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.contabilidad.interfaces.transfer.IPucTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.interfaces.transfer.IDestinoMensajeTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.interfaces.transfer.IDocMensajeTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.correspondencia.interfaces.transfer.IMensajeTrasf;
import com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.interfaces.transfer.IDocEjecucionPresupuestoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.ejecucion.interfaces.transfer.IEjecucionPresupuestoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IActividadEconomicaTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IConvocatoriaTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IDivisionTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IDocTerminoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IEmpresaTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IEntidadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IFotoEntidadTranf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.ITerminoConvocatoriaTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.entidad.interfaces.transfer.IVersionTerminoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IRecursoDetalleTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IRecursoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IRubroProyectoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IRubroTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IUnidadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IVersionRecursoDetalleTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.financiero.interfaces.transfer.IVersionRecursoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IDocInformeTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInfoInterEntregableDetalleTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInfoInterProductoDetalleTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInformeDetalleTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInformeInterventorTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IInformeTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IRevInterventorFinDetTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.informe.interfaces.transfer.IRevInterventorFinTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.ICiudadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.IDepartamentoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.localidad.interfaces.transfer.IPaisTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.parametro.interfaces.transfer.IParametroGeneralTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.parametro.interfaces.transfer.IParametroPorProyectoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.ILogUsuarioTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.IPermisoTranfs;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.IUsuarioEntidadTipoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.IUsuarioPorTipoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.IUsuarioProyectoEntidadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.permiso.interfaces.transfer.IUsuarioTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.ICargoPorPersonalTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.ICargoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.IClausulaContratoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.IClausulaTipoContratoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.IContratoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.IDocContratoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.personal.interfaces.transfer.IPersonalTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IContactoProyectoEntidadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IDocProyectoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IProyectoEntidadTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IProyectoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.proyecto.interfaces.transfer.IVersionProyectoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.tercero.interfaces.transfer.ITerceroPorTipoTransf;
import com.cpcoriente.sgp.springgwt.pro.shared.tercero.interfaces.transfer.ITerceroTransf;



/**
 * @author CPC-04
 *
 */
public class TransfFactory {
	
	private static TransfFactory instance;

	private synchronized static TransfFactory newInstance() {
		return new TransfFactory();
	}
	private BeanFactory factory;

	private TransfFactory() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/app-config.xml");
		factory = (BeanFactory) ctx;
	}

	public static TransfFactory getInstance() {
		if (instance == null) {
			instance = newInstance();
		}
		return instance;
	}

	public IPaisTransf getPaisTransf() {
		return (IPaisTransf) factory.getBean("paisTransf");
	}

	public IDepartamentoTransf getDepartamentoTransf() {
		return (IDepartamentoTransf) factory.getBean("dptoTransf");
	}

	public ICiudadTransf getCiudadTransf() {
		return (ICiudadTransf) factory.getBean("ciudadTransf");
	}

	public IEntidadTransf getEntidadTransf() {
		return (IEntidadTransf) factory.getBean("entidadTransf");
	}

	public IUsuarioPorTipoTransf getUsuarioPorTipoTransf() {
		return (IUsuarioPorTipoTransf) factory.getBean("usuarioPorTipoTransf");
	}

	public IUsuarioTransf getUsuarioTransf() {
		return (IUsuarioTransf) factory.getBean("usuarioTransf");
	}

		
	public IParametroGeneralTransf getParametroTransf() {
		return (IParametroGeneralTransf) factory.getBean("parametroTransf");
	}
	
	
	public IDivisionTransf getDivisionTransf() {
		return (IDivisionTransf) factory.getBean("divisionTransf");
	}
	
	public IEmpresaTransf getEmpresaTransf() {
		return (IEmpresaTransf) factory.getBean("empresaTransf");
	}	
	
	
	public IProyectoTransf getProyectoTransf(){
		return (IProyectoTransf) factory.getBean("proyectoTransf");
	}

	
	public IMensajeTrasf getMensajeTransf(){
		
		return (IMensajeTrasf) factory.getBean("mensajeTransf");
	}
	
	public ITerminoConvocatoriaTransf getTerminoTransf(){
		
		return (ITerminoConvocatoriaTransf) factory.getBean("terminoTransf");
	}
	
	public IVersionTerminoTransf getVersionTerminoTransf(){
		
		return (IVersionTerminoTransf) factory.getBean("versionTerminoTransf");
	}

	
	public IObjetivoTransf getObjetivoTransf(){
		return (IObjetivoTransf) factory.getBean("objetivoTransf");
	}	
	
	public IRubroTransf getRubroTransf(){
		return (IRubroTransf) factory.getBean("rubroTransf");
	}
	
	public IRubroProyectoTransf getRubroProyectoTransf(){
		return (IRubroProyectoTransf) factory.getBean("rubroProyectoTransf");
	}

	public IVersionProyectoTransf getVersionProyectoTransf(){
		return (IVersionProyectoTransf) factory.getBean("versionProyectoTransf");
	}
	
	public IProyectoEntidadTransf getProyectoEntidadTransf(){
		return (IProyectoEntidadTransf) factory.getBean("proyectoEntidadTransf");
	}
	
	
	public IUsuarioProyectoEntidadTransf getUsuProEntTransf(){
		return (IUsuarioProyectoEntidadTransf) factory.getBean("usuProEntTransf");
	}
	
	public IInformeInterventorTransf getInfInterventorTransf(){
		return (IInformeInterventorTransf) factory.getBean("infInterventorTransf");
	}
	

	
	public IRevInterventorFinTransf getRevIntFinTransf(){
		return (IRevInterventorFinTransf) factory.getBean("revIntFinTransf");
	}
	
	public IRevInterventorFinDetTransf getRevIntFinDetTransf(){
		return (IRevInterventorFinDetTransf) factory.getBean("revIntFinDetTransf");
	}
	
	public IRecursoTransf getRecursoTransf(){
		return (IRecursoTransf) factory.getBean("recursoTransf");
	}
	
	public IUnidadTransf getUnidadTransf(){
		return (IUnidadTransf) factory.getBean("unidadTransf");
	}
	
	
	public IConvocatoriaTransf getConvocatoriaTransf(){
		return (IConvocatoriaTransf) factory.getBean("convocatoriaTransf");
	}
	
	public IActividadEconomicaTransf getActEconomicaTransf(){
		return (IActividadEconomicaTransf) factory.getBean("actEconomicaTransf");
	}
	
	
	public IRecursoDetalleTransf getRecursoDetalleTransf(){
		return (IRecursoDetalleTransf) factory.getBean("recursoDetalleTransf");
	}

	public IVersionRecursoTransf getVersionRecursoTransf(){
		return (IVersionRecursoTransf) factory.getBean("versionRecursoTransf");
	}

	public IDocMensajeTransf getDocMensajeTransf(){
		return (IDocMensajeTransf) factory.getBean("docMensajeTransf");
	}
	
	public IDestinoMensajeTransf getDestinoMensajeTransf(){
		return (IDestinoMensajeTransf) factory.getBean("destinoMensajeTransf");
	}

	public IActividadTransf getActividadTransf(){
		return (IActividadTransf) factory.getBean("actividadTransf");
	}
	
	public IDocTerminoTransf getDocTerminoTransf(){
		return (IDocTerminoTransf) factory.getBean("docTerminoTransf");
	}
	
	public IFotoEntidadTranf getFotoEntidadTransf(){
		return (IFotoEntidadTranf) factory.getBean("fotoEntidadTransf");
	}
	
	public IProductoTransf getProductoTransf(){
		return (IProductoTransf) factory.getBean("productoTransf");
	}
	
	public IActividadPorPersonalTransf getActividadPorPersonalTransf(){
		return (IActividadPorPersonalTransf) factory.getBean("actividadPorPersonalTransf");
	}
	
	public IDocObjetivoTransf getDocObjetivoTransf(){
		return (IDocObjetivoTransf) factory.getBean("docObjetivoTransf");
	}
	
	public IEntregableTransf getEntregableTransf(){
		return (IEntregableTransf) factory.getBean("entregableTransf");
	}
	
	public IVersionActividadTransf getVersionActividadTransf(){
		return (IVersionActividadTransf) factory.getBean("versionActividadTransf");
	}
	
	public IVersionProductoTransf getVersionProductoTransf(){
		return (IVersionProductoTransf) factory.getBean("versionProductoTransf");
	}
	
	public IVersionObjetivoTransf getVersionObjetivoTransf(){
		return (IVersionObjetivoTransf) factory.getBean("versionObjetivoTransf");
	}
	
	public IVersionEntregableTransf getVersionEntregableTransf(){
		return (IVersionEntregableTransf) factory.getBean("versionEntregableTransf");
	}
	
	public ICalendarioNoLaboralTransf getCalendarioNoLaboralTransf(){
		return (ICalendarioNoLaboralTransf) factory.getBean("calendarioNoLaboralTransf");
	}
	
	public IDiaNoLaboralTransf getDiaNoLaboralTransf(){
		return (IDiaNoLaboralTransf) factory.getBean("diaNoLaboralTransf");
	}
	
	public IImpuestoTransf getImpuestoTransf(){
		return (IImpuestoTransf) factory.getBean("impuestoTransf");
	}
	
	public IMovimientoContableTransf getMovimientoContableTransf(){
		return (IMovimientoContableTransf) factory.getBean("movimientoContableTransf");
	}
	
	public IMovimientoContableDetalleTransf getMovimientoContableDetalleTransf(){
		return (IMovimientoContableDetalleTransf) factory.getBean("movimientoContableDetalleTransf");
	}
	
	public IPucPorProyectoTransf getPucPorProyectoTransf(){
		return (IPucPorProyectoTransf) factory.getBean("pucPorProyectoTransf");
	}
	
	public IPucTransf getPucTransf(){
		return (IPucTransf) factory.getBean("pucTransf");
	}
	
	public IDocEjecucionPresupuestoTransf getDocEjecucionPresupuestoTransf(){
		return (IDocEjecucionPresupuestoTransf) factory.getBean("docEjecucionPresupuestoTransf");
	}
	
	public IEjecucionPresupuestoTransf getEjecucionPresupuestoTransf(){
		return (IEjecucionPresupuestoTransf) factory.getBean("ejecucionPresupuestoTransf");
	}
	
	public IDocInformeTransf getDocInformeTransf(){
		return (IDocInformeTransf) factory.getBean("docInformeTransf");
	}
	
	public IInformeTransf getInformeTransf(){
		return (IInformeTransf) factory.getBean("informeTransf");
	}
	
	public IInformeDetalleTransf getInformeDetalleTransf(){
		return (IInformeDetalleTransf) factory.getBean("informeDetalleTransf");
	}
	
	public IInfoInterEntregableDetalleTransf getInfoInterEntregableDetalleTransf(){
		return (IInfoInterEntregableDetalleTransf) factory.getBean("infoInterEntregableDetalleTransf");
	}
	
	public IInfoInterProductoDetalleTransf getInfoInterProductoDetalleTransf(){
		return (IInfoInterProductoDetalleTransf) factory.getBean("infoInterProductoDetalleTransf");
	}
	
	public IParametroGeneralTransf getParametroGeneralTransf(){
		return (IParametroGeneralTransf) factory.getBean("parametroGeneralTransf");
	}
	
	public IParametroPorProyectoTransf getParametroPorProyectoTransf(){
		return (IParametroPorProyectoTransf) factory.getBean("parametroPorProyectoTransf");
	}
	
	public ILogUsuarioTransf getLogUsuarioTransf(){
		return (ILogUsuarioTransf) factory.getBean("logUsuarioTransf");
	}
	
	public ICargoPorPersonalTransf getCargoPorPersonalTransf(){
		return (ICargoPorPersonalTransf) factory.getBean("cargoPorPersonalTransf");
	}
	
	public ICargoTransf getCargoTransf(){
		return (ICargoTransf) factory.getBean("cargoTransf");
	}
	
	public IClausulaTipoContratoTransf getClausulaTipoContratoTransf(){
		return (IClausulaTipoContratoTransf) factory.getBean("clausulaTipoContratoTransf");
	}
	
	public IClausulaContratoTransf getClausulaContratoTransf(){
		return (IClausulaContratoTransf) factory.getBean("clausulaContratoTransf");
	}
	
	public IContratoTransf getContratoTransf(){
		return (IContratoTransf) factory.getBean("contratoTransf");
	}
	
	public IDocContratoTransf getDocContratoTransf(){
		return (IDocContratoTransf) factory.getBean("docContratoTransf");
	}
	
	public IPersonalTransf getPersonalTransf(){
		return (IPersonalTransf) factory.getBean("personalTransf");
	}
	
	public ITerceroPorTipoTransf getTerceroPorTipoTransf(){
		return (ITerceroPorTipoTransf) factory.getBean("terceroPorTipoTransf");
	}
	
	public ITerceroTransf getTerceroTransf(){
		return (ITerceroTransf) factory.getBean("terceroTransf");
	}
	
	
	public IContactoProyectoEntidadTransf getContactoTransf(){
		return (IContactoProyectoEntidadTransf) factory.getBean("contactoTransf");
	}

	public IDocProyectoTransf getDocProyectoTransf(){
		return (IDocProyectoTransf) factory.getBean("docProyectoTransf");
	}
	
	public IPermisoTranfs getPermisoTransf(){
		return (IPermisoTranfs) factory.getBean("permisoTransf");
	}
	
	public IUsuarioEntidadTipoTransf getUsuEntidadTipoTransf(){
		return (IUsuarioEntidadTipoTransf) factory.getBean("usuTipoEntidadTransf");
	}
	
	public IVersionRecursoDetalleTransf getVersionRecDetTransf(){
		return (IVersionRecursoDetalleTransf) factory.getBean("versionRecDetTransf");
	}
	
	
}