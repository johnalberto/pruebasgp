package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.client.compra;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class ICompraServicio_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final Map<String, String> methodMapJava;
  private static final Map<String, String> signatureMapJava;
  
  static {
    methodMapJava = loadMethodsJava();
    signatureMapJava = loadSignaturesJava();
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadMethodsJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.enumerador.TipoLineaEnum/1754254792", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.enumerador.TipoLineaEnum_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.enumerador.TipoUnidadEnum/661910455", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.enumerador.TipoUnidadEnum_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO/2368457827", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO/2024419562", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO;/1791144191", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO/2896704599", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO;/572236408", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.UnidadTO/3952433526", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.UnidadTO_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.enumerador.TipoEstadoPedidoEnum/3464530832", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.enumerador.TipoEstadoPedidoEnum_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO/3704081464", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO;/3401603849", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionTO/3053909054", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionTO;/2005829144", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO/2445867435", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO;/3568903563", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO/787081064", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO;/2270022621", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.PrecondicionExcepcion/3962951951", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.PrecondicionExcepcion_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion/3156256967", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.ValidacionExcepcion/3895420044", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.ValidacionExcepcion_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.enumerador.TipoClaseImpuestoEnum/428868843", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.enumerador.TipoClaseImpuestoEnum_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO/768928141", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO/968746486", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO;/3503622629", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO/107247759", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO;/2353288679", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO/2196607964", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO;/4135415681", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.PaisTO/3905716214", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.PaisTO_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO/2116547732", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO;/2582082404", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO/2051581134", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.ModuloTO/3902070747", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.ModuloTO_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO/3012985834", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO;/223140564", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO/1090978033", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO;/4175494050", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO/2370966027", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO;/742080190", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum/973485213", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequisicionEnum/1272501249", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequisicionEnum_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoDetalleTO/3908164883", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoDetalleTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoDetalleTO;/1930963921", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoDetalleTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO/1486489840", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO;/4163035148", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO/3664642846", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoTO/915292737", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoTO_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO/68619052", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO;/3213851004", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionGlobalDetalleTO/3345227604", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionGlobalDetalleTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionGlobalDetalleTO;/442026460", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionGlobalDetalleTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionGlobalTO/1672208539", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionGlobalTO_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO/203549349", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoEstadoCarteraEnum/1377828177", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoEstadoCarteraEnum_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum/1450514325", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO/1662767367", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO;/423890613", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO/625543263", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO/3916539120", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO;/2478861475", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO_Array_Rank_1_FieldSerializer");
    result.put("com.google.gwt.i18n.shared.impl.DateRecord/3375188634", "com.google.gwt.i18n.shared.impl.DateRecord_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException/2345075298", "com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.XsrfToken/4254043109", "com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer");
    result.put("java.lang.Float/1718559123", "com.google.gwt.user.client.rpc.core.java.lang.Float_FieldSerializer");
    result.put("java.lang.Integer/3438268394", "com.google.gwt.user.client.rpc.core.java.lang.Integer_FieldSerializer");
    result.put("java.lang.Long/4227064769", "com.google.gwt.user.client.rpc.core.java.lang.Long_FieldSerializer");
    result.put("java.lang.String/2004016611", "com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer");
    result.put("java.sql.Date/730999118", "com.google.gwt.user.client.rpc.core.java.sql.Date_FieldSerializer");
    result.put("java.sql.Time/1816797103", "com.google.gwt.user.client.rpc.core.java.sql.Time_FieldSerializer");
    result.put("java.sql.Timestamp/3040052672", "com.google.gwt.user.client.rpc.core.java.sql.Timestamp_FieldSerializer");
    result.put("java.util.ArrayList/4159755760", "com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer");
    result.put("java.util.Arrays$ArrayList/2507071751", "com.google.gwt.user.client.rpc.core.java.util.Arrays_ArrayList_FieldSerializer");
    result.put("java.util.Collections$EmptyList/4157118744", "com.google.gwt.user.client.rpc.core.java.util.Collections_EmptyList_FieldSerializer");
    result.put("java.util.Collections$SingletonList/1586180994", "com.google.gwt.user.client.rpc.core.java.util.Collections_SingletonList_FieldSerializer");
    result.put("java.util.Date/3385151746", "com.google.gwt.user.client.rpc.core.java.util.Date_FieldSerializer");
    result.put("java.util.LinkedList/3953877921", "com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer");
    result.put("java.util.Stack/1346942793", "com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer");
    result.put("java.util.Vector/3057315478", "com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer");
    return result;
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadSignaturesJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.enumerador.TipoLineaEnum", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.enumerador.TipoLineaEnum/1754254792");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.enumerador.TipoUnidadEnum", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.enumerador.TipoUnidadEnum/661910455");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ArticuloTO/2368457827");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO/2024419562");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO;", "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.LineaTO;/1791144191");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO/2896704599");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO;", "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO;/572236408");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.UnidadTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.UnidadTO/3952433526");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.enumerador.TipoEstadoPedidoEnum", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.enumerador.TipoEstadoPedidoEnum/3464530832");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO/3704081464");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO;", "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO;/3401603849");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionTO/3053909054");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionTO;", "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionTO;/2005829144");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO/2445867435");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO;", "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO;/3568903563");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO/787081064");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO;", "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO;/2270022621");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.PrecondicionExcepcion", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.PrecondicionExcepcion/3962951951");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion/3156256967");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.ValidacionExcepcion", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.ValidacionExcepcion/3895420044");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.enumerador.TipoClaseImpuestoEnum", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.enumerador.TipoClaseImpuestoEnum/428868843");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ClaseImpuestoTO/768928141");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO/968746486");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO;", "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.impuesto.objeto.ImpuestoPorClaseTO;/3503622629");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO/107247759");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO;", "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO;/2353288679");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO/2196607964");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO;", "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO;/4135415681");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.PaisTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.PaisTO/3905716214");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO/2116547732");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO;", "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO;/2582082404");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO/2051581134");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.ModuloTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.ModuloTO/3902070747");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO/3012985834");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO;", "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO;/223140564");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO/1090978033");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO;", "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO;/4175494050");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO/2370966027");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO;", "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO;/742080190");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum/973485213");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequisicionEnum", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequisicionEnum/1272501249");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoDetalleTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoDetalleTO/3908164883");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoDetalleTO;", "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoDetalleTO;/1930963921");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO/1486489840");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO;", "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO;/4163035148");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO/3664642846");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoTO/915292737");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO/68619052");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO;", "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO;/3213851004");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionGlobalDetalleTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionGlobalDetalleTO/3345227604");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionGlobalDetalleTO;", "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionGlobalDetalleTO;/442026460");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionGlobalTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionGlobalTO/1672208539");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO/203549349");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoEstadoCarteraEnum", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoEstadoCarteraEnum/1377828177");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum/1450514325");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO/1662767367");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO;", "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO;/423890613");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO/625543263");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO/3916539120");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO;", "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO;/2478861475");
    result.put("com.google.gwt.i18n.shared.impl.DateRecord", "com.google.gwt.i18n.shared.impl.DateRecord/3375188634");
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException", "com.google.gwt.user.client.rpc.RpcTokenException/2345075298");
    result.put("com.google.gwt.user.client.rpc.XsrfToken", "com.google.gwt.user.client.rpc.XsrfToken/4254043109");
    result.put("java.lang.Float", "java.lang.Float/1718559123");
    result.put("java.lang.Integer", "java.lang.Integer/3438268394");
    result.put("java.lang.Long", "java.lang.Long/4227064769");
    result.put("java.lang.String", "java.lang.String/2004016611");
    result.put("java.sql.Date", "java.sql.Date/730999118");
    result.put("java.sql.Time", "java.sql.Time/1816797103");
    result.put("java.sql.Timestamp", "java.sql.Timestamp/3040052672");
    result.put("java.util.ArrayList", "java.util.ArrayList/4159755760");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer.concreteType(), "java.util.Arrays$ArrayList/2507071751");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer.concreteType(), "java.util.Collections$EmptyList/4157118744");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer.concreteType(), "java.util.Collections$SingletonList/1586180994");
    result.put("java.util.Date", "java.util.Date/3385151746");
    result.put("java.util.LinkedList", "java.util.LinkedList/3953877921");
    result.put("java.util.Stack", "java.util.Stack/1346942793");
    result.put("java.util.Vector", "java.util.Vector/3057315478");
    return result;
  }
  
  public ICompraServicio_TypeSerializer() {
    super(methodMapJava, null, signatureMapJava, null);
  }
  
}
