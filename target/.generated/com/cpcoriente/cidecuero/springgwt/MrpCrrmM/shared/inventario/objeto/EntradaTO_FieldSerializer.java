package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class EntradaTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static boolean getAnulado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance) {
    return (java.lang.Boolean) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO.class, instance, "anulado");
  }
  
  private static void setAnulado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance, boolean value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO.class, instance, "anulado", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO getBodega(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO.class, instance, "bodega");
  }
  
  private static void setBodega(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO.class, instance, "bodega", value);
  }
  
  private static boolean getContabilizado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance) {
    return (java.lang.Boolean) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO.class, instance, "contabilizado");
  }
  
  private static void setContabilizado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance, boolean value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO.class, instance, "contabilizado", value);
  }
  
  private static java.util.List getEntradaDetalleList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance) {
    return (java.util.List) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO.class, instance, "entradaDetalleList");
  }
  
  private static void setEntradaDetalleList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO.class, instance, "entradaDetalleList", value);
  }
  
  private static java.util.Date getFecha(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO.class, instance, "fecha");
  }
  
  private static void setFecha(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO.class, instance, "fecha", value);
  }
  
  private static java.util.Date getFechaRegistro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO.class, instance, "fechaRegistro");
  }
  
  private static void setFechaRegistro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO.class, instance, "fechaRegistro", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO.class, instance, "id", value);
  }
  
  private static java.lang.String getNumDocMov(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO.class, instance, "numDocMov");
  }
  
  private static void setNumDocMov(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO.class, instance, "numDocMov", value);
  }
  
  private static java.lang.String getNumDocRef(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO.class, instance, "numDocRef");
  }
  
  private static void setNumDocRef(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO.class, instance, "numDocRef", value);
  }
  
  private static java.lang.String getObservacion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO.class, instance, "observacion");
  }
  
  private static void setObservacion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO.class, instance, "observacion", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO getTercero(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO.class, instance, "tercero");
  }
  
  private static void setTercero(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO.class, instance, "tercero", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.enumerador.TipoDocumentoEntradaEnum getTipoDocMov(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.enumerador.TipoDocumentoEntradaEnum) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO.class, instance, "tipoDocMov");
  }
  
  private static void setTipoDocMov(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.enumerador.TipoDocumentoEntradaEnum value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO.class, instance, "tipoDocMov", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance) throws SerializationException {
    setAnulado(instance, streamReader.readBoolean());
    setBodega(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO) streamReader.readObject());
    setContabilizado(instance, streamReader.readBoolean());
    setEntradaDetalleList(instance, (java.util.List) streamReader.readObject());
    setFecha(instance, (java.util.Date) streamReader.readObject());
    setFechaRegistro(instance, (java.util.Date) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setNumDocMov(instance, streamReader.readString());
    setNumDocRef(instance, streamReader.readString());
    setObservacion(instance, streamReader.readString());
    setTercero(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO) streamReader.readObject());
    setTipoDocMov(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.enumerador.TipoDocumentoEntradaEnum) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO instance) throws SerializationException {
    streamWriter.writeBoolean(getAnulado(instance));
    streamWriter.writeObject(getBodega(instance));
    streamWriter.writeBoolean(getContabilizado(instance));
    streamWriter.writeObject(getEntradaDetalleList(instance));
    streamWriter.writeObject(getFecha(instance));
    streamWriter.writeObject(getFechaRegistro(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getNumDocMov(instance));
    streamWriter.writeString(getNumDocRef(instance));
    streamWriter.writeString(getObservacion(instance));
    streamWriter.writeObject(getTercero(instance));
    streamWriter.writeObject(getTipoDocMov(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.EntradaTO)object);
  }
  
}
