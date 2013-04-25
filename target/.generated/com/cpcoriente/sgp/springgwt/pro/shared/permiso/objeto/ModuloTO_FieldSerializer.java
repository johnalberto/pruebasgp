package com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ModuloTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getDescripcion(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO.class, instance, "descripcion");
  }
  
  private static void setDescripcion(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO.class, instance, "descripcion", value);
  }
  
  private static java.lang.String getId(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO.class, instance, "id", value);
  }
  
  private static java.lang.String getNombre(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO.class, instance, "nombre");
  }
  
  private static void setNombre(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO.class, instance, "nombre", value);
  }
  
  private static java.util.List getPaginaList(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO instance) {
    return (java.util.List) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO.class, instance, "paginaList");
  }
  
  private static void setPaginaList(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO.class, instance, "paginaList", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO instance) throws SerializationException {
    setDescripcion(instance, streamReader.readString());
    setId(instance, streamReader.readString());
    setNombre(instance, streamReader.readString());
    setPaginaList(instance, (java.util.List) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO instance) throws SerializationException {
    streamWriter.writeString(getDescripcion(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getNombre(instance));
    streamWriter.writeObject(getPaginaList(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO_FieldSerializer.deserialize(reader, (com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO_FieldSerializer.serialize(writer, (com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.ModuloTO)object);
  }
  
}
