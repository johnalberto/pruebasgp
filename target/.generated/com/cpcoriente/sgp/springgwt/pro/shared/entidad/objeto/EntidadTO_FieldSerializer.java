package com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class EntidadTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getAbreviatura(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "abreviatura");
  }
  
  private static void setAbreviatura(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "abreviatura", value);
  }
  
  private static com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO getCiudad(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance) {
    return (com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "ciudad");
  }
  
  private static void setCiudad(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance, com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "ciudad", value);
  }
  
  private static java.lang.String getCodigo(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "codigo");
  }
  
  private static void setCodigo(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "codigo", value);
  }
  
  private static java.lang.String getDireccion(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "direccion");
  }
  
  private static void setDireccion(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "direccion", value);
  }
  
  private static java.util.List getDivisionList(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance) {
    return (java.util.List) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "divisionList");
  }
  
  private static void setDivisionList(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "divisionList", value);
  }
  
  private static com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO getDpto(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance) {
    return (com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "dpto");
  }
  
  private static void setDpto(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance, com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "dpto", value);
  }
  
  private static java.lang.String getEmail(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "email");
  }
  
  private static void setEmail(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "email", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "id", value);
  }
  
  private static java.lang.String getNombre(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "nombre");
  }
  
  private static void setNombre(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "nombre", value);
  }
  
  private static java.lang.String getNumDoc(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "numDoc");
  }
  
  private static void setNumDoc(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "numDoc", value);
  }
  
  private static com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO getPais(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance) {
    return (com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "pais");
  }
  
  private static void setPais(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance, com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "pais", value);
  }
  
  private static java.lang.String getTelefono(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "telefono");
  }
  
  private static void setTelefono(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "telefono", value);
  }
  
  private static com.cpcoriente.sgp.springgwt.pro.shared.entidad.enumerador.TipoDocumentoEnum getTipoDocumento(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance) {
    return (com.cpcoriente.sgp.springgwt.pro.shared.entidad.enumerador.TipoDocumentoEnum) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "tipoDocumento");
  }
  
  private static void setTipoDocumento(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance, com.cpcoriente.sgp.springgwt.pro.shared.entidad.enumerador.TipoDocumentoEnum value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "tipoDocumento", value);
  }
  
  private static java.util.List getUsuarioList(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance) {
    return (java.util.List) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "usuarioList");
  }
  
  private static void setUsuarioList(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO.class, instance, "usuarioList", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance) throws SerializationException {
    setAbreviatura(instance, streamReader.readString());
    setCiudad(instance, (com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.CiudadTO) streamReader.readObject());
    setCodigo(instance, streamReader.readString());
    setDireccion(instance, streamReader.readString());
    setDivisionList(instance, (java.util.List) streamReader.readObject());
    setDpto(instance, (com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.DepartamentoTO) streamReader.readObject());
    setEmail(instance, streamReader.readString());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setNombre(instance, streamReader.readString());
    setNumDoc(instance, streamReader.readString());
    setPais(instance, (com.cpcoriente.sgp.springgwt.pro.shared.localidad.objeto.PaisTO) streamReader.readObject());
    setTelefono(instance, streamReader.readString());
    setTipoDocumento(instance, (com.cpcoriente.sgp.springgwt.pro.shared.entidad.enumerador.TipoDocumentoEnum) streamReader.readObject());
    setUsuarioList(instance, (java.util.List) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO instance) throws SerializationException {
    streamWriter.writeString(getAbreviatura(instance));
    streamWriter.writeObject(getCiudad(instance));
    streamWriter.writeString(getCodigo(instance));
    streamWriter.writeString(getDireccion(instance));
    streamWriter.writeObject(getDivisionList(instance));
    streamWriter.writeObject(getDpto(instance));
    streamWriter.writeString(getEmail(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getNombre(instance));
    streamWriter.writeString(getNumDoc(instance));
    streamWriter.writeObject(getPais(instance));
    streamWriter.writeString(getTelefono(instance));
    streamWriter.writeObject(getTipoDocumento(instance));
    streamWriter.writeObject(getUsuarioList(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO_FieldSerializer.deserialize(reader, (com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO_FieldSerializer.serialize(writer, (com.cpcoriente.sgp.springgwt.pro.shared.entidad.objeto.EntidadTO)object);
  }
  
}
