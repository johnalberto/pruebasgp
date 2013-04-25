package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class RequisicionTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO.class, instance, "descripcion");
  }
  
  private static void setDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO.class, instance, "descripcion", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequisicionEnum getEstado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequisicionEnum) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO.class, instance, "estado");
  }
  
  private static void setEstado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequisicionEnum value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO.class, instance, "estado", value);
  }
  
  private static java.util.Date getFechaOpRecibido(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO.class, instance, "fechaOpRecibido");
  }
  
  private static void setFechaOpRecibido(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO.class, instance, "fechaOpRecibido", value);
  }
  
  private static java.util.Date getFechaRegistro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO.class, instance, "fechaRegistro");
  }
  
  private static void setFechaRegistro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO.class, instance, "fechaRegistro", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO.class, instance, "id", value);
  }
  
  private static java.util.List getReqDetList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO instance) {
    return (java.util.List) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO.class, instance, "reqDetList");
  }
  
  private static void setReqDetList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO.class, instance, "reqDetList", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO getReqGlobal(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO.class, instance, "reqGlobal");
  }
  
  private static void setReqGlobal(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO.class, instance, "reqGlobal", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO instance) throws SerializationException {
    setDescripcion(instance, streamReader.readString());
    setEstado(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequisicionEnum) streamReader.readObject());
    setFechaOpRecibido(instance, (java.util.Date) streamReader.readObject());
    setFechaRegistro(instance, (java.util.Date) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setReqDetList(instance, (java.util.List) streamReader.readObject());
    setReqGlobal(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO instance) throws SerializationException {
    streamWriter.writeString(getDescripcion(instance));
    streamWriter.writeObject(getEstado(instance));
    streamWriter.writeObject(getFechaOpRecibido(instance));
    streamWriter.writeObject(getFechaRegistro(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getReqDetList(instance));
    streamWriter.writeObject(getReqGlobal(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO)object);
  }
  
}
