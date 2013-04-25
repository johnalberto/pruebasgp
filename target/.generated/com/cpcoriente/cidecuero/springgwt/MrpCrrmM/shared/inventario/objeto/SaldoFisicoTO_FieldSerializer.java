package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class SaldoFisicoTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO getBodega(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO.class, instance, "bodega");
  }
  
  private static void setBodega(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO.class, instance, "bodega", value);
  }
  
  private static boolean getDefinitivo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO instance) {
    return (java.lang.Boolean) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO.class, instance, "definitivo");
  }
  
  private static void setDefinitivo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO instance, boolean value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO.class, instance, "definitivo", value);
  }
  
  private static java.util.Date getFecha(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO.class, instance, "fecha");
  }
  
  private static void setFecha(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO.class, instance, "fecha", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO.class, instance, "id", value);
  }
  
  private static java.util.List getSaldoFisicoDetalleList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO instance) {
    return (java.util.List) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO.class, instance, "saldoFisicoDetalleList");
  }
  
  private static void setSaldoFisicoDetalleList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO.class, instance, "saldoFisicoDetalleList", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO instance) throws SerializationException {
    setBodega(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO) streamReader.readObject());
    setDefinitivo(instance, streamReader.readBoolean());
    setFecha(instance, (java.util.Date) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setSaldoFisicoDetalleList(instance, (java.util.List) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO instance) throws SerializationException {
    streamWriter.writeObject(getBodega(instance));
    streamWriter.writeBoolean(getDefinitivo(instance));
    streamWriter.writeObject(getFecha(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getSaldoFisicoDetalleList(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoFisicoTO)object);
  }
  
}
