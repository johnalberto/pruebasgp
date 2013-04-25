package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class UsuarioTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static boolean getActivo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance) {
    return (java.lang.Boolean) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "activo");
  }
  
  private static void setActivo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance, boolean value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "activo", value);
  }
  
  private static java.lang.String getApellido(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "apellido");
  }
  
  private static void setApellido(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "apellido", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO getCiudad(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "ciudad");
  }
  
  private static void setCiudad(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "ciudad", value);
  }
  
  private static java.lang.String getDireccion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "direccion");
  }
  
  private static void setDireccion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "direccion", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO getDpto(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "dpto");
  }
  
  private static void setDpto(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "dpto", value);
  }
  
  private static java.lang.String getEmail(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "email");
  }
  
  private static void setEmail(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "email", value);
  }
  
  private static java.util.Date getFechaRegistro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "fechaRegistro");
  }
  
  private static void setFechaRegistro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "fechaRegistro", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "id", value);
  }
  
  private static java.lang.String getNombre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "nombre");
  }
  
  private static void setNombre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "nombre", value);
  }
  
  private static java.lang.String getNumDoc(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "numDoc");
  }
  
  private static void setNumDoc(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "numDoc", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.PaisTO getPais(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.PaisTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "pais");
  }
  
  private static void setPais(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.PaisTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "pais", value);
  }
  
  private static java.lang.String getPassword(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "password");
  }
  
  private static void setPassword(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "password", value);
  }
  
  private static char getSexo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance) {
    return (java.lang.Character) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "sexo");
  }
  
  private static void setSexo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance, char value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "sexo", value);
  }
  
  private static java.lang.String getTelefono(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "telefono");
  }
  
  private static void setTelefono(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "telefono", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO getTercero(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "tercero");
  }
  
  private static void setTercero(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "tercero", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO getTipoDoc(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "tipoDoc");
  }
  
  private static void setTipoDoc(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "tipoDoc", value);
  }
  
  private static java.util.List getTipoUsuarioList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance) {
    return (java.util.List) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "tipoUsuarioList");
  }
  
  private static void setTipoUsuarioList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "tipoUsuarioList", value);
  }
  
  private static java.lang.String getUsername(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "username");
  }
  
  private static void setUsername(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO.class, instance, "username", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance) throws SerializationException {
    setActivo(instance, streamReader.readBoolean());
    setApellido(instance, streamReader.readString());
    setCiudad(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.CiudadTO) streamReader.readObject());
    setDireccion(instance, streamReader.readString());
    setDpto(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.DepartamentoTO) streamReader.readObject());
    setEmail(instance, streamReader.readString());
    setFechaRegistro(instance, (java.util.Date) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setNombre(instance, streamReader.readString());
    setNumDoc(instance, streamReader.readString());
    setPais(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.localidad.objeto.PaisTO) streamReader.readObject());
    setPassword(instance, streamReader.readString());
    setSexo(instance, streamReader.readChar());
    setTelefono(instance, streamReader.readString());
    setTercero(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO) streamReader.readObject());
    setTipoDoc(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TipoDocumentoTO) streamReader.readObject());
    setTipoUsuarioList(instance, (java.util.List) streamReader.readObject());
    setUsername(instance, streamReader.readString());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO instance) throws SerializationException {
    streamWriter.writeBoolean(getActivo(instance));
    streamWriter.writeString(getApellido(instance));
    streamWriter.writeObject(getCiudad(instance));
    streamWriter.writeString(getDireccion(instance));
    streamWriter.writeObject(getDpto(instance));
    streamWriter.writeString(getEmail(instance));
    streamWriter.writeObject(getFechaRegistro(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getNombre(instance));
    streamWriter.writeString(getNumDoc(instance));
    streamWriter.writeObject(getPais(instance));
    streamWriter.writeString(getPassword(instance));
    streamWriter.writeChar(getSexo(instance));
    streamWriter.writeString(getTelefono(instance));
    streamWriter.writeObject(getTercero(instance));
    streamWriter.writeObject(getTipoDoc(instance));
    streamWriter.writeObject(getTipoUsuarioList(instance));
    streamWriter.writeString(getUsername(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO)object);
  }
  
}
