package com.cpcoriente.sgp.springgwt.pro.shared.excepciones;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PrecondicionExcepcion_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion_FieldSerializer.deserialize(reader, (com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion_FieldSerializer.serialize(writer, (com.cpcoriente.sgp.springgwt.pro.shared.excepciones.PrecondicionExcepcion)object);
  }
  
}