package com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class CiudadTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO getDpto(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO instance) {
    return (com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO.class, instance, "dpto");
  }
  
  private static void setDpto(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO instance, com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO.class, instance, "dpto", value);
  }
  
  private static java.lang.String getId(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO.class, instance, "id", value);
  }
  
  private static java.lang.String getNombre(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO.class, instance, "nombre");
  }
  
  private static void setNombre(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO.class, instance, "nombre", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO instance) throws SerializationException {
    setDpto(instance, (com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO) streamReader.readObject());
    setId(instance, streamReader.readString());
    setNombre(instance, streamReader.readString());
    
  }
  
  public static com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO instance) throws SerializationException {
    streamWriter.writeObject(getDpto(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getNombre(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO_FieldSerializer.deserialize(reader, (com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO_FieldSerializer.serialize(writer, (com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO)object);
  }
  
}
