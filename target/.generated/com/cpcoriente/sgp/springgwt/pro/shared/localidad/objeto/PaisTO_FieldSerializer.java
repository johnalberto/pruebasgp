package com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PaisTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.util.List getDptoList(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO instance) {
    return (java.util.List) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO.class, instance, "dptoList");
  }
  
  private static void setDptoList(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO.class, instance, "dptoList", value);
  }
  
  private static java.lang.String getId(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO.class, instance, "id", value);
  }
  
  private static java.lang.String getNombre(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO.class, instance, "nombre");
  }
  
  private static void setNombre(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO.class, instance, "nombre", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO instance) throws SerializationException {
    setDptoList(instance, (java.util.List) streamReader.readObject());
    setId(instance, streamReader.readString());
    setNombre(instance, streamReader.readString());
    
  }
  
  public static com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO instance) throws SerializationException {
    streamWriter.writeObject(getDptoList(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getNombre(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO_FieldSerializer.deserialize(reader, (com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO_FieldSerializer.serialize(writer, (com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO)object);
  }
  
}
