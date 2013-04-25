package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class LogUsuarioTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO getAccion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO.class, instance, "accion");
  }
  
  private static void setAccion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO.class, instance, "accion", value);
  }
  
  private static java.util.Date getFecha(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO.class, instance, "fecha");
  }
  
  private static void setFecha(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO.class, instance, "fecha", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO.class, instance, "id", value);
  }
  
  private static java.lang.String getIp(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO.class, instance, "ip");
  }
  
  private static void setIp(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO.class, instance, "ip", value);
  }
  
  private static java.lang.String getObservacion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO.class, instance, "observacion");
  }
  
  private static void setObservacion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO.class, instance, "observacion", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO getPagina(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO.class, instance, "pagina");
  }
  
  private static void setPagina(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO.class, instance, "pagina", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO getUsuario(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO.class, instance, "usuario");
  }
  
  private static void setUsuario(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO.class, instance, "usuario", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO instance) throws SerializationException {
    setAccion(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO) streamReader.readObject());
    setFecha(instance, (java.util.Date) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setIp(instance, streamReader.readString());
    setObservacion(instance, streamReader.readString());
    setPagina(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO) streamReader.readObject());
    setUsuario(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO instance) throws SerializationException {
    streamWriter.writeObject(getAccion(instance));
    streamWriter.writeObject(getFecha(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getIp(instance));
    streamWriter.writeString(getObservacion(instance));
    streamWriter.writeObject(getPagina(instance));
    streamWriter.writeObject(getUsuario(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.LogUsuarioTO)object);
  }
  
}
