package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;

public class ITerceroServicio_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
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
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.PrecondicionExcepcion/3962951951", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.PrecondicionExcepcion_FieldSerializer.Handler());
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion/3156256967", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion_FieldSerializer.Handler());
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.ValidacionExcepcion/3895420044", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.ValidacionExcepcion_FieldSerializer.Handler());
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO/107247759", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO_FieldSerializer.Handler());
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO;/2353288679", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO/2196607964", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO_FieldSerializer.Handler());
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO;/4135415681", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.PaisTO/3905716214", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.PaisTO_FieldSerializer.Handler());
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO/2116547732", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO_FieldSerializer.Handler());
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO;/2582082404", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO/2051581134", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO_FieldSerializer.Handler());
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.ModuloTO/3902070747", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.ModuloTO_FieldSerializer.Handler());
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO/3012985834", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO_FieldSerializer.Handler());
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO;/223140564", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO/1090978033", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO_FieldSerializer.Handler());
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO;/4175494050", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO/3422968205", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO_FieldSerializer.Handler());
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO;/1196314005", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO/2546060900", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO_FieldSerializer.Handler());
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO;/1410531560", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO/396720511", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO_FieldSerializer.Handler());
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO;/3355109098", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO/625543263", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO_FieldSerializer.Handler());
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO;/397630", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO/3916539120", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO_FieldSerializer.Handler());
    result.put("[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO;/2478861475", new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.google.gwt.i18n.client.impl.DateRecord/112389920", new com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer.Handler());
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533", new com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer.Handler());
    result.put("java.lang.Long/4227064769", new com.google.gwt.user.client.rpc.core.java.lang.Long_FieldSerializer.Handler());
    result.put("java.lang.String/2004016611", new com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer.Handler());
    result.put("java.sql.Date/3996530531", new com.google.gwt.user.client.rpc.core.java.sql.Date_FieldSerializer.Handler());
    result.put("java.sql.Time/831929183", new com.google.gwt.user.client.rpc.core.java.sql.Time_FieldSerializer.Handler());
    result.put("java.sql.Timestamp/1769758459", new com.google.gwt.user.client.rpc.core.java.sql.Timestamp_FieldSerializer.Handler());
    result.put("java.util.ArrayList/3821976829", new com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer.Handler());
    result.put("java.util.Arrays$ArrayList/1243019747", new com.google.gwt.user.client.rpc.core.java.util.Arrays_ArrayList_FieldSerializer.Handler());
    result.put("java.util.Collections$EmptyList/3012082351", new com.google.gwt.user.client.rpc.core.java.util.Collections_EmptyList_FieldSerializer.Handler());
    result.put("java.util.Collections$SingletonList/833432284", new com.google.gwt.user.client.rpc.core.java.util.Collections_SingletonList_FieldSerializer.Handler());
    result.put("java.util.Date/1659716317", new com.google.gwt.user.client.rpc.core.java.util.Date_FieldSerializer.Handler());
    result.put("java.util.LinkedList/1060625595", new com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer.Handler());
    result.put("java.util.Stack/1031431137", new com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer.Handler());
    result.put("java.util.Vector/3125574444", new com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer.Handler());
    return result;
  }
  
  @SuppressWarnings("deprecation")
  private static native MethodMap loadMethodsNative() /*-{
    var result = {};
    result["com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.PrecondicionExcepcion/3962951951"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.PrecondicionExcepcion_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.PrecondicionExcepcion_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/excepciones/PrecondicionExcepcion;),
      ];
    
    result["com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion/3156256967"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/excepciones/RecursoExcepcion;),
      ];
    
    result["com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.ValidacionExcepcion/3895420044"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.ValidacionExcepcion_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.ValidacionExcepcion_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/excepciones/ValidacionExcepcion;),
      ];
    
    result["com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO/107247759"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/localidad/objeto/CiudadTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/localidad/objeto/CiudadTO;)
      ];
    
    result["[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO;/2353288679"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/localidad/objeto/CiudadTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/localidad/objeto/CiudadTO;)
      ];
    
    result["com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO/2196607964"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/localidad/objeto/DepartamentoTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/localidad/objeto/DepartamentoTO;)
      ];
    
    result["[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO;/4135415681"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/localidad/objeto/DepartamentoTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/localidad/objeto/DepartamentoTO;)
      ];
    
    result["com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.PaisTO/3905716214"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.PaisTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.PaisTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/localidad/objeto/PaisTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.PaisTO_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/localidad/objeto/PaisTO;)
      ];
    
    result["com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO/2116547732"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/permiso/objeto/AccionModuloPaginaTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/permiso/objeto/AccionModuloPaginaTO;)
      ];
    
    result["[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO;/2582082404"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/permiso/objeto/AccionModuloPaginaTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/permiso/objeto/AccionModuloPaginaTO;)
      ];
    
    result["com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO/2051581134"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/permiso/objeto/AccionTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/permiso/objeto/AccionTO;)
      ];
    
    result["com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.ModuloTO/3902070747"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.ModuloTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.ModuloTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/permiso/objeto/ModuloTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.ModuloTO_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/permiso/objeto/ModuloTO;)
      ];
    
    result["com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO/3012985834"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/permiso/objeto/PaginaTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/permiso/objeto/PaginaTO;)
      ];
    
    result["[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO;/223140564"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/permiso/objeto/PaginaTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/permiso/objeto/PaginaTO;)
      ];
    
    result["com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO/1090978033"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/permiso/objeto/TipoUsuarioTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/permiso/objeto/TipoUsuarioTO;)
      ];
    
    result["[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO;/4175494050"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/permiso/objeto/TipoUsuarioTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/permiso/objeto/TipoUsuarioTO;)
      ];
    
    result["com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO/3422968205"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/permiso/objeto/UsuarioTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/permiso/objeto/UsuarioTO;)
      ];
    
    result["[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO;/1196314005"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/permiso/objeto/UsuarioTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/permiso/objeto/UsuarioTO;)
      ];
    
    result["com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO/2546060900"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/tercero/objeto/LineaTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/tercero/objeto/LineaTO;)
      ];
    
    result["[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO;/1410531560"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/tercero/objeto/LineaTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/tercero/objeto/LineaTO;)
      ];
    
    result["com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO/396720511"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/tercero/objeto/TerceroTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/tercero/objeto/TerceroTO;)
      ];
    
    result["[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO;/3355109098"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/tercero/objeto/TerceroTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/tercero/objeto/TerceroTO;)
      ];
    
    result["com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO/625543263"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/tercero/objeto/TipoDocumentoTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/tercero/objeto/TipoDocumentoTO;)
      ];
    
    result["[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO;/397630"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/tercero/objeto/TipoDocumentoTO;),
      ];
    
    result["com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO/3916539120"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/tercero/objeto/TipoTerceroTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/tercero/objeto/TipoTerceroTO;)
      ];
    
    result["[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO;/2478861475"] = [
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/tercero/objeto/TipoTerceroTO;),
        @com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/cpcoriente/cidecuero/springgwt/MrpCrrmM/shared/tercero/objeto/TipoTerceroTO;)
      ];
    
    result["com.google.gwt.i18n.client.impl.DateRecord/112389920"] = [
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/i18n/client/impl/DateRecord;),
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/i18n/client/impl/DateRecord;)
      ];
    
    result["com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533"] = [
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;)
      ];
    
    result["java.lang.Long/4227064769"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Long;),
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Long;)
      ];
    
    result["java.lang.String/2004016611"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ];
    
    result["java.sql.Date/3996530531"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Date;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Date;)
      ];
    
    result["java.sql.Time/831929183"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Time;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Time;)
      ];
    
    result["java.sql.Timestamp/1769758459"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Timestamp;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Timestamp;)
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
    
    result["java.util.Date/1659716317"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Date;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Date;)
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
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.PrecondicionExcepcion_FieldSerializer.concreteType(), "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.PrecondicionExcepcion/3962951951");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion_FieldSerializer.concreteType(), "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion/3156256967");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.ValidacionExcepcion_FieldSerializer.concreteType(), "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.ValidacionExcepcion/3895420044");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO_FieldSerializer.concreteType(), "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO/107247759");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO;/2353288679");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO_FieldSerializer.concreteType(), "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO/2196607964");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO;/4135415681");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.PaisTO_FieldSerializer.concreteType(), "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.PaisTO/3905716214");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO_FieldSerializer.concreteType(), "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO/2116547732");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO;/2582082404");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO_FieldSerializer.concreteType(), "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO/2051581134");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.ModuloTO_FieldSerializer.concreteType(), "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.ModuloTO/3902070747");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO_FieldSerializer.concreteType(), "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO/3012985834");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO;/223140564");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO_FieldSerializer.concreteType(), "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO/1090978033");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO;/4175494050");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO_FieldSerializer.concreteType(), "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO/3422968205");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO;/1196314005");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO_FieldSerializer.concreteType(), "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO/2546060900");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO;/1410531560");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO_FieldSerializer.concreteType(), "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO/396720511");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO;/3355109098");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO_FieldSerializer.concreteType(), "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO/625543263");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO;/397630");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO_FieldSerializer.concreteType(), "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO/3916539120");
    result.put(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO;/2478861475");
    result.put(com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer.concreteType(), "com.google.gwt.i18n.client.impl.DateRecord/112389920");
    result.put(com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer.concreteType(), "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.Long_FieldSerializer.concreteType(), "java.lang.Long/4227064769");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer.concreteType(), "java.lang.String/2004016611");
    result.put(com.google.gwt.user.client.rpc.core.java.sql.Date_FieldSerializer.concreteType(), "java.sql.Date/3996530531");
    result.put(com.google.gwt.user.client.rpc.core.java.sql.Time_FieldSerializer.concreteType(), "java.sql.Time/831929183");
    result.put(com.google.gwt.user.client.rpc.core.java.sql.Timestamp_FieldSerializer.concreteType(), "java.sql.Timestamp/1769758459");
    result.put(com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer.concreteType(), "java.util.ArrayList/3821976829");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer.concreteType(), "java.util.Arrays$ArrayList/1243019747");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer.concreteType(), "java.util.Collections$EmptyList/3012082351");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer.concreteType(), "java.util.Collections$SingletonList/833432284");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Date_FieldSerializer.concreteType(), "java.util.Date/1659716317");
    result.put(com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer.concreteType(), "java.util.LinkedList/1060625595");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer.concreteType(), "java.util.Stack/1031431137");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer.concreteType(), "java.util.Vector/3125574444");
    return result;
  }
  
  @SuppressWarnings("deprecation")
  private static native JsArrayString loadSignaturesNative() /*-{
    var result = [];
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.PrecondicionExcepcion::class)] = "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.PrecondicionExcepcion/3962951951";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion::class)] = "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion/3156256967";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.ValidacionExcepcion::class)] = "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.ValidacionExcepcion/3895420044";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO::class)] = "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO/107247759";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO[]::class)] = "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO;/2353288679";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO::class)] = "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO/2196607964";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO[]::class)] = "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO;/4135415681";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.PaisTO::class)] = "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.PaisTO/3905716214";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO::class)] = "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO/2116547732";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO[]::class)] = "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO;/2582082404";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO::class)] = "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO/2051581134";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.ModuloTO::class)] = "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.ModuloTO/3902070747";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO::class)] = "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO/3012985834";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO[]::class)] = "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO;/223140564";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO::class)] = "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO/1090978033";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO[]::class)] = "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO;/4175494050";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO::class)] = "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO/3422968205";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO[]::class)] = "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO;/1196314005";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO::class)] = "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO/2546060900";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO[]::class)] = "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.LineaTO;/1410531560";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO::class)] = "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO/396720511";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO[]::class)] = "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO;/3355109098";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO::class)] = "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO/625543263";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO[]::class)] = "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO;/397630";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO::class)] = "com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO/3916539120";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO[]::class)] = "[Lcom.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoTerceroTO;/2478861475";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.i18n.client.impl.DateRecord::class)] = "com.google.gwt.i18n.client.impl.DateRecord/112389920";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException::class)] = "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Long::class)] = "java.lang.Long/4227064769";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String::class)] = "java.lang.String/2004016611";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Date::class)] = "java.sql.Date/3996530531";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Time::class)] = "java.sql.Time/831929183";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Timestamp::class)] = "java.sql.Timestamp/1769758459";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.ArrayList::class)] = "java.util.ArrayList/3821976829";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Arrays$ArrayList::class)] = "java.util.Arrays$ArrayList/1243019747";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections$EmptyList::class)] = "java.util.Collections$EmptyList/3012082351";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections$SingletonList::class)] = "java.util.Collections$SingletonList/833432284";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Date::class)] = "java.util.Date/1659716317";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedList::class)] = "java.util.LinkedList/1060625595";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Stack::class)] = "java.util.Stack/1031431137";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Vector::class)] = "java.util.Vector/3125574444";
    return result;
  }-*/;
  
  public ITerceroServicio_TypeSerializer() {
    super(methodMapJava, methodMapNative, signatureMapJava, signatureMapNative);
  }
  
}