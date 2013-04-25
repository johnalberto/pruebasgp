package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class InventarioActualTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO getBodega(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO.class, instance, "bodega");
  }
  
  private static void setBodega(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO.class, instance, "bodega", value);
  }
  
  private static java.util.Date getFechaActualizacion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO.class, instance, "fechaActualizacion");
  }
  
  private static void setFechaActualizacion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO.class, instance, "fechaActualizacion", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO.class, instance, "id", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO getReferencia(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO.class, instance, "referencia");
  }
  
  private static void setReferencia(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO.class, instance, "referencia", value);
  }
  
  private static java.lang.Float getSumaCantidad(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO.class, instance, "sumaCantidad");
  }
  
  private static void setSumaCantidad(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO instance, java.lang.Float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO.class, instance, "sumaCantidad", value);
  }
  
  private static java.lang.Float getSumaValor(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO.class, instance, "sumaValor");
  }
  
  private static void setSumaValor(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO instance, java.lang.Float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO.class, instance, "sumaValor", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO instance) throws SerializationException {
    setBodega(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO) streamReader.readObject());
    setFechaActualizacion(instance, (java.util.Date) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setReferencia(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO) streamReader.readObject());
    setSumaCantidad(instance, (java.lang.Float) streamReader.readObject());
    setSumaValor(instance, (java.lang.Float) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO instance) throws SerializationException {
    streamWriter.writeObject(getBodega(instance));
    streamWriter.writeObject(getFechaActualizacion(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getReferencia(instance));
    streamWriter.writeObject(getSumaCantidad(instance));
    streamWriter.writeObject(getSumaValor(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.InventarioActualTO)object);
  }
  
}
