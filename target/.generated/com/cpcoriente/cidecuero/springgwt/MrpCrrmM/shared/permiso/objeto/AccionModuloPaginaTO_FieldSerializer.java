package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class AccionModuloPaginaTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO getAccion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO.class, instance, "accion");
  }
  
  private static void setAccion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO.class, instance, "accion", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO.class, instance, "id", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO getPagina(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO.class, instance, "pagina");
  }
  
  private static void setPagina(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO.class, instance, "pagina", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO getTipoUsuario(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO.class, instance, "tipoUsuario");
  }
  
  private static void setTipoUsuario(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO.class, instance, "tipoUsuario", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO instance) throws SerializationException {
    setAccion(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionTO) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setPagina(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.PaginaTO) streamReader.readObject());
    setTipoUsuario(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.TipoUsuarioTO) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO instance) throws SerializationException {
    streamWriter.writeObject(getAccion(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getPagina(instance));
    streamWriter.writeObject(getTipoUsuario(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.AccionModuloPaginaTO)object);
  }
  
}
