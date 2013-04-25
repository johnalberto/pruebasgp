package com.cpcoriente.cidecuero.springgwt.MrpCrm.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;

public class ILocalidadServicio_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final Map<String, TypeHandler> methodMapJava;
  private static final MethodMap methodMapNative;
  private static final Map<Class<?>, String> signatureMapJava;
  private static final JsArrayString signatureMapNative;
  
  static {
    if (GWT.isScript()) {
      methodMapJava = null;
      methodMapNative = loadMethodsNative();
      signatureMapJava = null;
      signatureMapNative = loadSignaturesNative();
    } else {
      methodMapJava = loadMethodsJava();
      methodMapNative = null;
      signatureMapJava = loadSignaturesJava();
      signatureMapNative = null;
    }
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, TypeHandler> loadMethodsJava() {
    Map<String, TypeHandler> result = new HashMap<String, TypeHandler>();
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.PrecondicionExcepcion/1385226525", new com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.PrecondicionExcepcion_FieldSerializer.Handler());
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.RecursoExcepcion/4012312700", new com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.RecursoExcepcion_FieldSerializer.Handler());
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.ValidacionExcepcion/289889380", new com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.ValidacionExcepcion_FieldSerializer.Handler());
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO/1622491800", new com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO_FieldSerializer.Handler());
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO;/852836333", new com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO/1910476979", new com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO_FieldSerializer.Handler());
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO;/1032869995", new com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO/411343346", new com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO_FieldSerializer.Handler());
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO;/795134679", new com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533", new com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer.Handler());
    result.put("java.lang.String/2004016611", new com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer.Handler());
    result.put("java.util.ArrayList/3821976829", new com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer.Handler());
    result.put("java.util.Arrays$ArrayList/1243019747", new com.google.gwt.user.client.rpc.core.java.util.Arrays_ArrayList_FieldSerializer.Handler());
    result.put("java.util.Collections$EmptyList/3012082351", new com.google.gwt.user.client.rpc.core.java.util.Collections_EmptyList_FieldSerializer.Handler());
    result.put("java.util.Collections$SingletonList/833432284", new com.google.gwt.user.client.rpc.core.java.util.Collections_SingletonList_FieldSerializer.Handler());
    result.put("java.util.LinkedList/1060625595", new com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer.Handler());
    result.put("java.util.Stack/1031431137", new com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer.Handler());
    result.put("java.util.Vector/3125574444", new com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer.Handler());
    return result;
  }
  
  @SuppressWarnings("deprecation")
  private static native MethodMap loadMethodsNative() /*-{
    var result = {};
    result["com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.PrecondicionExcepcion/1385226525"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.PrecondicionExcepcion_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.PrecondicionExcepcion_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/cpcoriente/cidecuero/springgwt/MrpCrm/shared/excepciones/PrecondicionExcepcion;),
      ];
    
    result["com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.RecursoExcepcion/4012312700"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.RecursoExcepcion_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.RecursoExcepcion_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/cpcoriente/cidecuero/springgwt/MrpCrm/shared/excepciones/RecursoExcepcion;),
      ];
    
    result["com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.ValidacionExcepcion/289889380"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.ValidacionExcepcion_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.ValidacionExcepcion_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/cpcoriente/cidecuero/springgwt/MrpCrm/shared/excepciones/ValidacionExcepcion;),
      ];
    
    result["com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO/1622491800"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/cpcoriente/cidecuero/springgwt/MrpCrm/shared/localidad/objeto/CiudadTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/cpcoriente/cidecuero/springgwt/MrpCrm/shared/localidad/objeto/CiudadTO;)
      ];
    
    result["[Lcom.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO;/852836333"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/cpcoriente/cidecuero/springgwt/MrpCrm/shared/localidad/objeto/CiudadTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/cpcoriente/cidecuero/springgwt/MrpCrm/shared/localidad/objeto/CiudadTO;)
      ];
    
    result["com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO/1910476979"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/cpcoriente/cidecuero/springgwt/MrpCrm/shared/localidad/objeto/DepartamentoTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/cpcoriente/cidecuero/springgwt/MrpCrm/shared/localidad/objeto/DepartamentoTO;)
      ];
    
    result["[Lcom.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO;/1032869995"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/cpcoriente/cidecuero/springgwt/MrpCrm/shared/localidad/objeto/DepartamentoTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/cpcoriente/cidecuero/springgwt/MrpCrm/shared/localidad/objeto/DepartamentoTO;)
      ];
    
    result["com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO/411343346"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/cpcoriente/cidecuero/springgwt/MrpCrm/shared/localidad/objeto/PaisTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/cpcoriente/cidecuero/springgwt/MrpCrm/shared/localidad/objeto/PaisTO;)
      ];
    
    result["[Lcom.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO;/795134679"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/cpcoriente/cidecuero/springgwt/MrpCrm/shared/localidad/objeto/PaisTO;),
      ];
    
    result["com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533"] = [
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;)
      ];
    
    result["java.lang.String/2004016611"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ];
    
    result["java.util.ArrayList/3821976829"] = [
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/ArrayList;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/ArrayList;)
      ];
    
    result["java.util.Arrays$ArrayList/1243019747"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Collections$EmptyList/3012082351"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Collections$SingletonList/833432284"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.LinkedList/1060625595"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedList;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedList;)
      ];
    
    result["java.util.Stack/1031431137"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Stack;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Stack;)
      ];
    
    result["java.util.Vector/3125574444"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Vector;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Vector;)
      ];
    
    return result;
  }-*/;
  
  @SuppressWarnings("deprecation")
  private static Map<Class<?>, String> loadSignaturesJava() {
    Map<Class<?>, String> result = new HashMap<Class<?>, String>();
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.PrecondicionExcepcion_FieldSerializer.concreteType(), "com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.PrecondicionExcepcion/1385226525");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.RecursoExcepcion_FieldSerializer.concreteType(), "com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.RecursoExcepcion/4012312700");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.ValidacionExcepcion_FieldSerializer.concreteType(), "com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.ValidacionExcepcion/289889380");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO_FieldSerializer.concreteType(), "com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO/1622491800");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO;/852836333");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO_FieldSerializer.concreteType(), "com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO/1910476979");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO;/1032869995");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO_FieldSerializer.concreteType(), "com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO/411343346");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO;/795134679");
    result.put(com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer.concreteType(), "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer.concreteType(), "java.lang.String/2004016611");
    result.put(com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer.concreteType(), "java.util.ArrayList/3821976829");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer.concreteType(), "java.util.Arrays$ArrayList/1243019747");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer.concreteType(), "java.util.Collections$EmptyList/3012082351");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer.concreteType(), "java.util.Collections$SingletonList/833432284");
    result.put(com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer.concreteType(), "java.util.LinkedList/1060625595");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer.concreteType(), "java.util.Stack/1031431137");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer.concreteType(), "java.util.Vector/3125574444");
    return result;
  }
  
  @SuppressWarnings("deprecation")
  private static native JsArrayString loadSignaturesNative() /*-{
    var result = [];
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.PrecondicionExcepcion::class)] = "com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.PrecondicionExcepcion/1385226525";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.RecursoExcepcion::class)] = "com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.RecursoExcepcion/4012312700";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.ValidacionExcepcion::class)] = "com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.ValidacionExcepcion/289889380";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO::class)] = "com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO/1622491800";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO[]::class)] = "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.CiudadTO;/852836333";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO::class)] = "com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO/1910476979";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO[]::class)] = "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.DepartamentoTO;/1032869995";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO::class)] = "com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO/411343346";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO[]::class)] = "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO;/795134679";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException::class)] = "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String::class)] = "java.lang.String/2004016611";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.ArrayList::class)] = "java.util.ArrayList/3821976829";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Arrays$ArrayList::class)] = "java.util.Arrays$ArrayList/1243019747";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections$EmptyList::class)] = "java.util.Collections$EmptyList/3012082351";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections$SingletonList::class)] = "java.util.Collections$SingletonList/833432284";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedList::class)] = "java.util.LinkedList/1060625595";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Stack::class)] = "java.util.Stack/1031431137";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Vector::class)] = "java.util.Vector/3125574444";
    return result;
  }-*/;
  
  public ILocalidadServicio_TypeSerializer() {
    super(methodMapJava, methodMapNative, signatureMapJava, signatureMapNative);
  }
  
}
