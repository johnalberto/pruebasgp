package com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PaginaTO_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.PaginaTO[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.PaginaTO[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.PaginaTO[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.PaginaTO[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.PaginaTO_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.PaginaTO_Array_Rank_1_FieldSerializer.deserialize(reader, (com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.PaginaTO[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.PaginaTO_Array_Rank_1_FieldSerializer.serialize(writer, (com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.PaginaTO[])object);
  }
  
}
