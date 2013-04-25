package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class SalidaDetalleTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static boolean getAnulado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO instance) {
    return (java.lang.Boolean) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO.class, instance, "anulado");
  }
  
  private static void setAnulado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO instance, boolean value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO.class, instance, "anulado", value);
  }
  
  private static java.lang.Float getCantidad(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO.class, instance, "cantidad");
  }
  
  private static void setCantidad(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO instance, java.lang.Float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO.class, instance, "cantidad", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO.class, instance, "id", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO getReferencia(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO.class, instance, "referencia");
  }
  
  private static void setReferencia(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO.class, instance, "referencia", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO getSalidaInv(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO.class, instance, "salidaInv");
  }
  
  private static void setSalidaInv(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO.class, instance, "salidaInv", value);
  }
  
  private static java.lang.Float getValorUnitario(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO.class, instance, "valorUnitario");
  }
  
  private static void setValorUnitario(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO instance, java.lang.Float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO.class, instance, "valorUnitario", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO instance) throws SerializationException {
    setAnulado(instance, streamReader.readBoolean());
    setCantidad(instance, (java.lang.Float) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setReferencia(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO) streamReader.readObject());
    setSalidaInv(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaTO) streamReader.readObject());
    setValorUnitario(instance, (java.lang.Float) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO instance) throws SerializationException {
    streamWriter.writeBoolean(getAnulado(instance));
    streamWriter.writeObject(getCantidad(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getReferencia(instance));
    streamWriter.writeObject(getSalidaInv(instance));
    streamWriter.writeObject(getValorUnitario(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.SalidaDetalleTO)object);
  }
  
}
