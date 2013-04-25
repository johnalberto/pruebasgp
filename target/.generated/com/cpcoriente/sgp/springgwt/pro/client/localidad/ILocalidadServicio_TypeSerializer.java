package com.cpcoriente.sgp.springgwt.pro.client.localidad;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class ILocalidadServicio_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final Map<String, String> methodMapJava;
  private static final Map<String, String> signatureMapJava;
  
  static {
    methodMapJava = loadMethodsJava();
    signatureMapJava = loadSignaturesJava();
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadMethodsJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion/283109803", "com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion/2845935112", "com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion/3814985598", "com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO/2292539984", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO;/403098455", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO/874787135", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO;/728196731", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO_Array_Rank_1_FieldSerializer");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO/3170237346", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO;/2743437973", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO_Array_Rank_1_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException/2345075298", "com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.XsrfToken/4254043109", "com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer");
    result.put("java.lang.String/2004016611", "com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer");
    result.put("java.util.ArrayList/4159755760", "com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer");
    result.put("java.util.Arrays$ArrayList/2507071751", "com.google.gwt.user.client.rpc.core.java.util.Arrays_ArrayList_FieldSerializer");
    result.put("java.util.Collections$EmptyList/4157118744", "com.google.gwt.user.client.rpc.core.java.util.Collections_EmptyList_FieldSerializer");
    result.put("java.util.Collections$SingletonList/1586180994", "com.google.gwt.user.client.rpc.core.java.util.Collections_SingletonList_FieldSerializer");
    result.put("java.util.LinkedList/3953877921", "com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer");
    result.put("java.util.Stack/1346942793", "com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer");
    result.put("java.util.Vector/3057315478", "com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer");
    return result;
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadSignaturesJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion", "com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion/283109803");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion", "com.cpcoriente.sgp.springgwt.pro.shared.excepciones.RecursoExcepcion/2845935112");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion", "com.cpcoriente.sgp.springgwt.pro.shared.excepciones.ValidacionExcepcion/3814985598");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO/2292539984");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO;", "[Lcom.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO;/403098455");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO/874787135");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO;", "[Lcom.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO;/728196731");
    result.put("com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO", "com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO/3170237346");
    result.put("[Lcom.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO;", "[Lcom.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO;/2743437973");
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException", "com.google.gwt.user.client.rpc.RpcTokenException/2345075298");
    result.put("com.google.gwt.user.client.rpc.XsrfToken", "com.google.gwt.user.client.rpc.XsrfToken/4254043109");
    result.put("java.lang.String", "java.lang.String/2004016611");
    result.put("java.util.ArrayList", "java.util.ArrayList/4159755760");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer.concreteType(), "java.util.Arrays$ArrayList/2507071751");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer.concreteType(), "java.util.Collections$EmptyList/4157118744");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer.concreteType(), "java.util.Collections$SingletonList/1586180994");
    result.put("java.util.LinkedList", "java.util.LinkedList/3953877921");
    result.put("java.util.Stack", "java.util.Stack/1346942793");
    result.put("java.util.Vector", "java.util.Vector/3057315478");
    return result;
  }
  
  public ILocalidadServicio_TypeSerializer() {
    super(methodMapJava, null, signatureMapJava, null);
  }
  
}
