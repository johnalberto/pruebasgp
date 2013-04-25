package com.cpcoriente.sgp.springgwt.pro.client.entidad;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class IEntidadServicio_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final Map<String, String> methodMapJava;
  private static final Map<String, String> signatureMapJava;
  
  static {
    methodMapJava = loadMethodsJava();
    signatureMapJava = loadSignaturesJava();
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadMethodsJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.entidad.enumerador.TipoDocumentoEnum/752190200", "com.cpcoriente.sgp.springgwt.pro.shared.entidad.enumerador.TipoDocumentoEnum_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO/1634112906", "com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO;/2524190883", "com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO/2631547671", "com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO;/327816083", "com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion/283109803", "com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion/2845935112", "com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion/3814985598", "com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO/2292539984", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO;/403098455", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO/874787135", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO;/728196731", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO/3170237346", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum/2562893721", "com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO/2358724441", "com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO;/1508150416", "com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO/3701632561", "com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO;/1799497324", "com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO_Array_Rank_1_FieldSerializer");
    result.put("com.google.gwt.i18n.shared.impl.DateRecord/3375188634", "com.google.gwt.i18n.shared.impl.DateRecord_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException/2345075298", "com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.XsrfToken/4254043109", "com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer");
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
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.entidad.enumerador.TipoDocumentoEnum", "com.cpcoriente.sgp.springgwt.pro.shared.entidad.enumerador.TipoDocumentoEnum/752190200");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO", "com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO/1634112906");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO;", "[Lcom.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO;/2524190883");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO", "com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO/2631547671");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO;", "[Lcom.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO;/327816083");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion", "com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion/283109803");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion", "com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion/2845935112");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion", "com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion/3814985598");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO/2292539984");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO;", "[Lcom.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO;/403098455");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO/874787135");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO;", "[Lcom.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO;/728196731");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO/3170237346");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum", "com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum/2562893721");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO", "com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO/2358724441");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO;", "[Lcom.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO;/1508150416");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO", "com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO/3701632561");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO;", "[Lcom.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO;/1799497324");
    result.put("com.google.gwt.i18n.shared.impl.DateRecord", "com.google.gwt.i18n.shared.impl.DateRecord/3375188634");
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException", "com.google.gwt.user.client.rpc.RpcTokenException/2345075298");
    result.put("com.google.gwt.user.client.rpc.XsrfToken", "com.google.gwt.user.client.rpc.XsrfToken/4254043109");
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
  
  public IEntidadServicio_TypeSerializer() {
    super(methodMapJava, null, signatureMapJava, null);
  }
  
}
