package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TipoUsuarioTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static boolean getAccAlertStock(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO instance) {
    return (java.lang.Boolean) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO.class, instance, "accAlertStock");
  }
  
  private static void setAccAlertStock(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO instance, boolean value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO.class, instance, "accAlertStock", value);
  }
  
  private static java.util.List getAmpList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO instance) {
    return (java.util.List) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO.class, instance, "ampList");
  }
  
  private static void setAmpList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO.class, instance, "ampList", value);
  }
  
  private static java.lang.String getDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO.class, instance, "descripcion");
  }
  
  private static void setDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO.class, instance, "descripcion", value);
  }
  
  private static java.lang.String getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO.class, instance, "id", value);
  }
  
  private static java.lang.String getNombre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO.class, instance, "nombre");
  }
  
  private static void setNombre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO.class, instance, "nombre", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO instance) throws SerializationException {
    setAccAlertStock(instance, streamReader.readBoolean());
    setAmpList(instance, (java.util.List) streamReader.readObject());
    setDescripcion(instance, streamReader.readString());
    setId(instance, streamReader.readString());
    setNombre(instance, streamReader.readString());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO instance) throws SerializationException {
    streamWriter.writeBoolean(getAccAlertStock(instance));
    streamWriter.writeObject(getAmpList(instance));
    streamWriter.writeString(getDescripcion(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getNombre(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO)object);
  }
  
}
