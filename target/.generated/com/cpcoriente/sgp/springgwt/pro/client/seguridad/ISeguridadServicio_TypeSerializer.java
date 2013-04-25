package com.cpcoriente.sgp.springgwt.pro.client.seguridad;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class ISeguridadServicio_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final Map<String, String> methodMapJava;
  private static final Map<String, String> signatureMapJava;
  
  static {
    methodMapJava = loadMethodsJava();
    signatureMapJava = loadSignaturesJava();
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadMethodsJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion/3814985598", "com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO/2292539984", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO;/403098455", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO/874787135", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO;/728196731", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO/3170237346", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.AccionModuloPaginaTO/3408484688", "com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.AccionModuloPaginaTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.AccionModuloPaginaTO;/668214084", "com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.AccionModuloPaginaTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.AccionTO/546155238", "com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.AccionTO_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO/2569399965", "com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.PaginaTO/4165644459", "com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.PaginaTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.PaginaTO;/2205530613", "com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.PaginaTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.TipoUsuarioTO/2608597751", "com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.TipoUsuarioTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.TipoUsuarioTO;/423629737", "com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.TipoUsuarioTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO/352443547", "com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO;/1999662976", "com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoEstadoCarteraEnum/103184645", "com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoEstadoCarteraEnum_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoRegimenTributarioEnum/2527339627", "com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoRegimenTributarioEnum_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TerceroTO/3627625756", "com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TerceroTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TerceroTO;/2364393076", "com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TerceroTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO/3756304015", "com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO/1556936495", "com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO;/512402509", "com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO_Array_Rank_1_FieldSerializer");
    result.put("com.google.gwt.i18n.shared.impl.DateRecord/3375188634", "com.google.gwt.i18n.shared.impl.DateRecord_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException/2345075298", "com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.XsrfToken/4254043109", "com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer");
    result.put("java.lang.Integer/3438268394", "com.google.gwt.user.client.rpc.core.java.lang.Integer_FieldSerializer");
    result.put("java.lang.Long/4227064769", "com.google.gwt.user.client.rpc.core.java.lang.Long_FieldSerializer");
    result.put("java.lang.String/2004016611", "com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer");
    result.put("java.sql.Date/730999118", "com.google.gwt.user.client.rpc.core.java.sql.Date_FieldSerializer");
    result.put("java.sql.Time/1816797103", "com.google.gwt.user.client.rpc.core.java.sql.Time_FieldSerializer");
    result.put("java.sql.Timestamp/3040052672", "com.google.gwt.user.client.rpc.core.java.sql.Timestamp_FieldSerializer");
    result.put("java.util.ArrayList/4159755760", "com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer");
    result.put("java.util.Arrays$ArrayList/2507071751", "com.google.gwt.user.client.rpc.core.java.util.Arrays_ArrayList_FieldSerializer");
    result.put("java.util.Collections$EmptyList/4157118744", "com.google.gwt.user.client.rpc.core.java.util.Collections_EmptyList_FieldSerializer");
    result.put("java.util.Collections$EmptyMap/4174664486", "com.google.gwt.user.client.rpc.core.java.util.Collections_EmptyMap_FieldSerializer");
    result.put("java.util.Collections$SingletonList/1586180994", "com.google.gwt.user.client.rpc.core.java.util.Collections_SingletonList_FieldSerializer");
    result.put("java.util.Date/3385151746", "com.google.gwt.user.client.rpc.core.java.util.Date_FieldSerializer");
    result.put("java.util.HashMap/1797211028", "com.google.gwt.user.client.rpc.core.java.util.HashMap_FieldSerializer");
    result.put("java.util.IdentityHashMap/1839153020", "com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_FieldSerializer");
    result.put("java.util.LinkedHashMap/3008245022", "com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_FieldSerializer");
    result.put("java.util.LinkedList/3953877921", "com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer");
    result.put("java.util.Stack/1346942793", "com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer");
    result.put("java.util.TreeMap/1493889780", "com.google.gwt.user.client.rpc.core.java.util.TreeMap_FieldSerializer");
    result.put("java.util.Vector/3057315478", "com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer");
    return result;
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadSignaturesJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion", "com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion/3814985598");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO/2292539984");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO;", "[Lcom.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO;/403098455");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO/874787135");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO;", "[Lcom.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO;/728196731");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO/3170237346");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.AccionModuloPaginaTO", "com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.AccionModuloPaginaTO/3408484688");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.AccionModuloPaginaTO;", "[Lcom.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.AccionModuloPaginaTO;/668214084");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.AccionTO", "com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.AccionTO/546155238");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO", "com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO/2569399965");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.PaginaTO", "com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.PaginaTO/4165644459");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.PaginaTO;", "[Lcom.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.PaginaTO;/2205530613");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.TipoUsuarioTO", "com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.TipoUsuarioTO/2608597751");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.TipoUsuarioTO;", "[Lcom.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.TipoUsuarioTO;/423629737");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO", "com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO/352443547");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO;", "[Lcom.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO;/1999662976");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoEstadoCarteraEnum", "com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoEstadoCarteraEnum/103184645");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoRegimenTributarioEnum", "com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoRegimenTributarioEnum/2527339627");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TerceroTO", "com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TerceroTO/3627625756");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TerceroTO;", "[Lcom.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TerceroTO;/2364393076");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO", "com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO/3756304015");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO", "com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO/1556936495");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO;", "[Lcom.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO;/512402509");
    result.put("com.google.gwt.i18n.shared.impl.DateRecord", "com.google.gwt.i18n.shared.impl.DateRecord/3375188634");
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException", "com.google.gwt.user.client.rpc.RpcTokenException/2345075298");
    result.put("com.google.gwt.user.client.rpc.XsrfToken", "com.google.gwt.user.client.rpc.XsrfToken/4254043109");
    result.put("java.lang.Integer", "java.lang.Integer/3438268394");
    result.put("java.lang.Long", "java.lang.Long/4227064769");
    result.put("java.lang.String", "java.lang.String/2004016611");
    result.put("java.sql.Date", "java.sql.Date/730999118");
    result.put("java.sql.Time", "java.sql.Time/1816797103");
    result.put("java.sql.Timestamp", "java.sql.Timestamp/3040052672");
    result.put("java.util.ArrayList", "java.util.ArrayList/4159755760");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer.concreteType(), "java.util.Arrays$ArrayList/2507071751");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer.concreteType(), "java.util.Collections$EmptyList/4157118744");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer.concreteType(), "java.util.Collections$EmptyMap/4174664486");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer.concreteType(), "java.util.Collections$SingletonList/1586180994");
    result.put("java.util.Date", "java.util.Date/3385151746");
    result.put("java.util.HashMap", "java.util.HashMap/1797211028");
    result.put("java.util.IdentityHashMap", "java.util.IdentityHashMap/1839153020");
    result.put("java.util.LinkedHashMap", "java.util.LinkedHashMap/3008245022");
    result.put("java.util.LinkedList", "java.util.LinkedList/3953877921");
    result.put("java.util.Stack", "java.util.Stack/1346942793");
    result.put("java.util.TreeMap", "java.util.TreeMap/1493889780");
    result.put("java.util.Vector", "java.util.Vector/3057315478");
    return result;
  }
  
  public ISeguridadServicio_TypeSerializer() {
    super(methodMapJava, null, signatureMapJava, null);
  }
  
}
