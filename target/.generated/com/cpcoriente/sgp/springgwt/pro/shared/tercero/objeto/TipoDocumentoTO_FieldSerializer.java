package com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TipoDocumentoTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getAbreviatura(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO.class, instance, "abreviatura");
  }
  
  private static void setAbreviatura(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO.class, instance, "abreviatura", value);
  }
  
  private static java.lang.String getDescripcion(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO.class, instance, "descripcion");
  }
  
  private static void setDescripcion(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO.class, instance, "descripcion", value);
  }
  
  private static java.lang.String getId(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO.class, instance, "id", value);
  }
  
  private static java.lang.String getNombre(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO.class, instance, "nombre");
  }
  
  private static void setNombre(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO.class, instance, "nombre", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO instance) throws SerializationException {
    setAbreviatura(instance, streamReader.readString());
    setDescripcion(instance, streamReader.readString());
    setId(instance, streamReader.readString());
    setNombre(instance, streamReader.readString());
    
  }
  
  public static com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO instance) throws SerializationException {
    streamWriter.writeString(getAbreviatura(instance));
    streamWriter.writeString(getDescripcion(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getNombre(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO_FieldSerializer.deserialize(reader, (com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO_FieldSerializer.serialize(writer, (com.cpcoriente.sgp.springgwt.pro.shared.tercero.objeto.TipoDocumentoTO)object);
  }
  
}
