package com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TipoTerceroTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getDescripcion(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO.class, instance, "descripcion");
  }
  
  private static void setDescripcion(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO.class, instance, "descripcion", value);
  }
  
  private static java.lang.String getId(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO.class, instance, "id", value);
  }
  
  private static java.lang.String getNombre(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO.class, instance, "nombre");
  }
  
  private static void setNombre(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO.class, instance, "nombre", value);
  }
  
  private static java.util.List getTerceroList(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO instance) {
    return (java.util.List) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO.class, instance, "terceroList");
  }
  
  private static void setTerceroList(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO.class, instance, "terceroList", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO instance) throws SerializationException {
    setDescripcion(instance, streamReader.readString());
    setId(instance, streamReader.readString());
    setNombre(instance, streamReader.readString());
    setTerceroList(instance, (java.util.List) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO instance) throws SerializationException {
    streamWriter.writeString(getDescripcion(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getNombre(instance));
    streamWriter.writeObject(getTerceroList(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO_FieldSerializer.deserialize(reader, (com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO_FieldSerializer.serialize(writer, (com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoTerceroTO)object);
  }
  
}
