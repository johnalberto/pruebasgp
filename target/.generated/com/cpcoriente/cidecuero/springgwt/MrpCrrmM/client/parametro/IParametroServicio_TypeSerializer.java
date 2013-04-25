package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.client.parametro;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class IParametroServicio_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final Map<String, String> methodMapJava;
  private static final Map<String, String> signatureMapJava;
  
  static {
    methodMapJava = loadMethodsJava();
    signatureMapJava = loadSignaturesJava();
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadMethodsJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.PrecondicionExcepcion/3962951951", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.PrecondicionExcepcion_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion/3156256967", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.ValidacionExcepcion/3895420044", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.ValidacionExcepcion_FieldSerializer");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO/1103826674", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO_FieldSerializer");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO;/2813981842", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO_Array_Rank_1_FieldSerializer");
    result.put("com.google.gwt.i18n.shared.impl.DateRecord/3375188634", "com.google.gwt.i18n.shared.impl.DateRecord_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException/2345075298", "com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.XsrfToken/4254043109", "com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer");
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
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.PrecondicionExcepcion", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.PrecondicionExcepcion/3962951951");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion/3156256967");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.ValidacionExcepcion", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.ValidacionExcepcion/3895420044");
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO", "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO/1103826674");
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO;", "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO;/2813981842");
    result.put("com.google.gwt.i18n.shared.impl.DateRecord", "com.google.gwt.i18n.shared.impl.DateRecord/3375188634");
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException", "com.google.gwt.user.client.rpc.RpcTokenException/2345075298");
    result.put("com.google.gwt.user.client.rpc.XsrfToken", "com.google.gwt.user.client.rpc.XsrfToken/4254043109");
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
  
  public IParametroServicio_TypeSerializer() {
    super(methodMapJava, null, signatureMapJava, null);
  }
  
}
