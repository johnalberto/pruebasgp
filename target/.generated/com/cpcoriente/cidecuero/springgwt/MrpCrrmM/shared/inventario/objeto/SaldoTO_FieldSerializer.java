package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class SaldoTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static boolean getAnulado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO instance) {
    return (java.lang.Boolean) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO.class, instance, "anulado");
  }
  
  private static void setAnulado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO instance, boolean value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO.class, instance, "anulado", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO getBodega(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO.class, instance, "bodega");
  }
  
  private static void setBodega(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO.class, instance, "bodega", value);
  }
  
  private static java.util.Date getFechaFin(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO.class, instance, "fechaFin");
  }
  
  private static void setFechaFin(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO.class, instance, "fechaFin", value);
  }
  
  private static java.util.Date getFechaInicio(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO.class, instance, "fechaInicio");
  }
  
  private static void setFechaInicio(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO.class, instance, "fechaInicio", value);
  }
  
  private static java.util.Date getFechaRegistro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO.class, instance, "fechaRegistro");
  }
  
  private static void setFechaRegistro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO.class, instance, "fechaRegistro", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO.class, instance, "id", value);
  }
  
  private static java.util.List getSaldoDetalleLista(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO instance) {
    return (java.util.List) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO.class, instance, "saldoDetalleLista");
  }
  
  private static void setSaldoDetalleLista(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO.class, instance, "saldoDetalleLista", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO instance) throws SerializationException {
    setAnulado(instance, streamReader.readBoolean());
    setBodega(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO) streamReader.readObject());
    setFechaFin(instance, (java.util.Date) streamReader.readObject());
    setFechaInicio(instance, (java.util.Date) streamReader.readObject());
    setFechaRegistro(instance, (java.util.Date) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setSaldoDetalleLista(instance, (java.util.List) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO instance) throws SerializationException {
    streamWriter.writeBoolean(getAnulado(instance));
    streamWriter.writeObject(getBodega(instance));
    streamWriter.writeObject(getFechaFin(instance));
    streamWriter.writeObject(getFechaInicio(instance));
    streamWriter.writeObject(getFechaRegistro(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getSaldoDetalleLista(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SaldoTO)object);
  }
  
}
