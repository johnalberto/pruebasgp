package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class RequerimientoGlobalTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO.class, instance, "descripcion");
  }
  
  private static void setDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO.class, instance, "descripcion", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum getEstado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO.class, instance, "estado");
  }
  
  private static void setEstado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO.class, instance, "estado", value);
  }
  
  private static java.util.Date getFechaRegistro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO.class, instance, "fechaRegistro");
  }
  
  private static void setFechaRegistro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO.class, instance, "fechaRegistro", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO.class, instance, "id", value);
  }
  
  private static java.util.List getReqGlobalDetList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO instance) {
    return (java.util.List) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO.class, instance, "reqGlobalDetList");
  }
  
  private static void setReqGlobalDetList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO.class, instance, "reqGlobalDetList", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO instance) throws SerializationException {
    setDescripcion(instance, streamReader.readString());
    setEstado(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum) streamReader.readObject());
    setFechaRegistro(instance, (java.util.Date) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setReqGlobalDetList(instance, (java.util.List) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO instance) throws SerializationException {
    streamWriter.writeString(getDescripcion(instance));
    streamWriter.writeObject(getEstado(instance));
    streamWriter.writeObject(getFechaRegistro(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getReqGlobalDetList(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO)object);
  }
  
}
