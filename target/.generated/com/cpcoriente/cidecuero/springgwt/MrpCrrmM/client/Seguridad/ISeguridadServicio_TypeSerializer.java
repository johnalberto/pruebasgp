package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.client.seguridad;

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
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.ValidacionExcepcion/3895420044", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.ValidacionExcepcion_FieldSerializer");
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
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoEstadoCarteraEnum/1377828177", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoEstadoCarteraEnum_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum/1450514325", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO/4011891919", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO;/3548511879", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO/625543263", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO/3916539120", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO;/2478861475", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO_Array_Rank_1_FieldSerializer");
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
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.ValidacionExcepcion", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.ValidacionExcepcion/3895420044");
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
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoEstadoCarteraEnum", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoEstadoCarteraEnum/1377828177");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.enumerador.TipoRegimenTributarioEnum/1450514325");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO/4011891919");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO;", "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO;/3548511879");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO/625543263");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO/3916539120");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO;", "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO;/2478861475");
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
