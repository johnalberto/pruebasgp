package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class SalidaTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static boolean getAnulado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance) {
    return (java.lang.Boolean) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO.class, instance, "anulado");
  }
  
  private static void setAnulado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance, boolean value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO.class, instance, "anulado", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO getBodega(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO.class, instance, "bodega");
  }
  
  private static void setBodega(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO.class, instance, "bodega", value);
  }
  
  private static boolean getContabilizado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance) {
    return (java.lang.Boolean) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO.class, instance, "contabilizado");
  }
  
  private static void setContabilizado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance, boolean value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO.class, instance, "contabilizado", value);
  }
  
  private static java.util.Date getFecha(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO.class, instance, "fecha");
  }
  
  private static void setFecha(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO.class, instance, "fecha", value);
  }
  
  private static java.util.Date getFechaRegistro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO.class, instance, "fechaRegistro");
  }
  
  private static void setFechaRegistro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO.class, instance, "fechaRegistro", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO.class, instance, "id", value);
  }
  
  private static java.lang.String getNumDocMov(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO.class, instance, "numDocMov");
  }
  
  private static void setNumDocMov(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO.class, instance, "numDocMov", value);
  }
  
  private static java.lang.String getNumDocRef(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO.class, instance, "numDocRef");
  }
  
  private static void setNumDocRef(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO.class, instance, "numDocRef", value);
  }
  
  private static java.lang.String getObservacion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO.class, instance, "observacion");
  }
  
  private static void setObservacion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO.class, instance, "observacion", value);
  }
  
  private static java.util.List getSalidaDetalleList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance) {
    return (java.util.List) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO.class, instance, "salidaDetalleList");
  }
  
  private static void setSalidaDetalleList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO.class, instance, "salidaDetalleList", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO getTercero(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO.class, instance, "tercero");
  }
  
  private static void setTercero(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO.class, instance, "tercero", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.enumerador.TipoDocumentoSalidaEnum getTipoDocMov(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.enumerador.TipoDocumentoSalidaEnum) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO.class, instance, "tipoDocMov");
  }
  
  private static void setTipoDocMov(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.enumerador.TipoDocumentoSalidaEnum value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO.class, instance, "tipoDocMov", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance) throws SerializationException {
    setAnulado(instance, streamReader.readBoolean());
    setBodega(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO) streamReader.readObject());
    setContabilizado(instance, streamReader.readBoolean());
    setFecha(instance, (java.util.Date) streamReader.readObject());
    setFechaRegistro(instance, (java.util.Date) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setNumDocMov(instance, streamReader.readString());
    setNumDocRef(instance, streamReader.readString());
    setObservacion(instance, streamReader.readString());
    setSalidaDetalleList(instance, (java.util.List) streamReader.readObject());
    setTercero(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO) streamReader.readObject());
    setTipoDocMov(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.enumerador.TipoDocumentoSalidaEnum) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO instance) throws SerializationException {
    streamWriter.writeBoolean(getAnulado(instance));
    streamWriter.writeObject(getBodega(instance));
    streamWriter.writeBoolean(getContabilizado(instance));
    streamWriter.writeObject(getFecha(instance));
    streamWriter.writeObject(getFechaRegistro(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getNumDocMov(instance));
    streamWriter.writeString(getNumDocRef(instance));
    streamWriter.writeString(getObservacion(instance));
    streamWriter.writeObject(getSalidaDetalleList(instance));
    streamWriter.writeObject(getTercero(instance));
    streamWriter.writeObject(getTipoDocMov(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO)object);
  }
  
}
