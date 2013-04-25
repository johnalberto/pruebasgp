package com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class UsuarioPorTipoTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.Long getId(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO.class, instance, "id", value);
  }
  
  private static com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum getTipoUsuario(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO instance) {
    return (com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO.class, instance, "tipoUsuario");
  }
  
  private static void setTipoUsuario(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO instance, com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO.class, instance, "tipoUsuario", value);
  }
  
  private static com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO getUsuario(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO instance) {
    return (com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO.class, instance, "usuario");
  }
  
  private static void setUsuario(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO instance, com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO.class, instance, "usuario", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO instance) throws SerializationException {
    setId(instance, (java.lang.Long) streamReader.readObject());
    setTipoUsuario(instance, (com.cpcoriente.sgp.springgwt.pro.shared.permiso.enumerador.TipoUsuarioEnum) streamReader.readObject());
    setUsuario(instance, (com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO instance) throws SerializationException {
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getTipoUsuario(instance));
    streamWriter.writeObject(getUsuario(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO_FieldSerializer.deserialize(reader, (com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO_FieldSerializer.serialize(writer, (com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioPorTipoTO)object);
  }
  
}
