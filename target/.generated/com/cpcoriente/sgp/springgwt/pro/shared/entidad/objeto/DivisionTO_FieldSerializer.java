package com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class DivisionTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getCodigo(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO.class, instance, "codigo");
  }
  
  private static void setCodigo(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO.class, instance, "codigo", value);
  }
  
  private static com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO getEntidad(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO instance) {
    return (com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO.class, instance, "entidad");
  }
  
  private static void setEntidad(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO instance, com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO.class, instance, "entidad", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO.class, instance, "id", value);
  }
  
  private static java.lang.String getNombre(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO.class, instance, "nombre");
  }
  
  private static void setNombre(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO.class, instance, "nombre", value);
  }
  
  private static com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO getPadre(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO instance) {
    return (com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO.class, instance, "padre");
  }
  
  private static void setPadre(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO instance, com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO.class, instance, "padre", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO instance) throws SerializationException {
    setCodigo(instance, streamReader.readString());
    setEntidad(instance, (com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setNombre(instance, streamReader.readString());
    setPadre(instance, (com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO instance) throws SerializationException {
    streamWriter.writeString(getCodigo(instance));
    streamWriter.writeObject(getEntidad(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getNombre(instance));
    streamWriter.writeObject(getPadre(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO_FieldSerializer.deserialize(reader, (com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO_FieldSerializer.serialize(writer, (com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.DivisionTO)object);
  }
  
}
