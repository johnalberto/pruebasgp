package com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class UsuarioTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO getCiudad(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance) {
    return (com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "ciudad");
  }
  
  private static void setCiudad(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance, com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "ciudad", value);
  }
  
  private static java.lang.String getDireccion(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "direccion");
  }
  
  private static void setDireccion(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "direccion", value);
  }
  
  private static com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO getDpto(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance) {
    return (com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "dpto");
  }
  
  private static void setDpto(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance, com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "dpto", value);
  }
  
  private static java.lang.String getEmail(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "email");
  }
  
  private static void setEmail(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "email", value);
  }
  
  private static com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO getEntidad(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance) {
    return (com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "entidad");
  }
  
  private static void setEntidad(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance, com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "entidad", value);
  }
  
  private static java.util.Date getFechaRegistro(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "fechaRegistro");
  }
  
  private static void setFechaRegistro(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "fechaRegistro", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "id", value);
  }
  
  private static java.lang.String getNombre(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "nombre");
  }
  
  private static void setNombre(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "nombre", value);
  }
  
  private static java.lang.String getNumDoc(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "numDoc");
  }
  
  private static void setNumDoc(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "numDoc", value);
  }
  
  private static com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO getPais(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance) {
    return (com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "pais");
  }
  
  private static void setPais(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance, com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "pais", value);
  }
  
  private static java.lang.String getPassword(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "password");
  }
  
  private static void setPassword(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "password", value);
  }
  
  private static char getSexo(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance) {
    return (java.lang.Character) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "sexo");
  }
  
  private static void setSexo(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance, char value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "sexo", value);
  }
  
  private static java.lang.String getTelefono(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "telefono");
  }
  
  private static void setTelefono(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "telefono", value);
  }
  
  private static com.cpcoriente.sgp.springgwt.pro.shared.entidad.enumerador.TipoDocumentoEnum getTipoDoc(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance) {
    return (com.cpcoriente.sgp.springgwt.pro.shared.entidad.enumerador.TipoDocumentoEnum) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "tipoDoc");
  }
  
  private static void setTipoDoc(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance, com.cpcoriente.sgp.springgwt.pro.shared.entidad.enumerador.TipoDocumentoEnum value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "tipoDoc", value);
  }
  
  private static java.util.List getTipoUsuarioList(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance) {
    return (java.util.List) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "tipoUsuarioList");
  }
  
  private static void setTipoUsuarioList(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "tipoUsuarioList", value);
  }
  
  private static java.lang.String getUsername(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "username");
  }
  
  private static void setUsername(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO.class, instance, "username", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance) throws SerializationException {
    setCiudad(instance, (com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO) streamReader.readObject());
    setDireccion(instance, streamReader.readString());
    setDpto(instance, (com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO) streamReader.readObject());
    setEmail(instance, streamReader.readString());
    setEntidad(instance, (com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO) streamReader.readObject());
    setFechaRegistro(instance, (java.util.Date) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setNombre(instance, streamReader.readString());
    setNumDoc(instance, streamReader.readString());
    setPais(instance, (com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO) streamReader.readObject());
    setPassword(instance, streamReader.readString());
    setSexo(instance, streamReader.readChar());
    setTelefono(instance, streamReader.readString());
    setTipoDoc(instance, (com.cpcoriente.sgp.springgwt.pro.shared.entidad.enumerador.TipoDocumentoEnum) streamReader.readObject());
    setTipoUsuarioList(instance, (java.util.List) streamReader.readObject());
    setUsername(instance, streamReader.readString());
    
  }
  
  public static com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO instance) throws SerializationException {
    streamWriter.writeObject(getCiudad(instance));
    streamWriter.writeString(getDireccion(instance));
    streamWriter.writeObject(getDpto(instance));
    streamWriter.writeString(getEmail(instance));
    streamWriter.writeObject(getEntidad(instance));
    streamWriter.writeObject(getFechaRegistro(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getNombre(instance));
    streamWriter.writeString(getNumDoc(instance));
    streamWriter.writeObject(getPais(instance));
    streamWriter.writeString(getPassword(instance));
    streamWriter.writeChar(getSexo(instance));
    streamWriter.writeString(getTelefono(instance));
    streamWriter.writeObject(getTipoDoc(instance));
    streamWriter.writeObject(getTipoUsuarioList(instance));
    streamWriter.writeString(getUsername(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO_FieldSerializer.deserialize(reader, (com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO_FieldSerializer.serialize(writer, (com.cpcoriente.sgp.springgwt.pro.shared.permiso.objeto.UsuarioTO)object);
  }
  
}
