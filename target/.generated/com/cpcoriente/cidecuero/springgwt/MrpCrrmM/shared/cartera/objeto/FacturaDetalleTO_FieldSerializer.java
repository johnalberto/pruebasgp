package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class FacturaDetalleTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.Float getCantidad(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO.class, instance, "cantidad");
  }
  
  private static void setCantidad(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO instance, java.lang.Float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO.class, instance, "cantidad", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO getFactura(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO.class, instance, "factura");
  }
  
  private static void setFactura(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO.class, instance, "factura", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO.class, instance, "id", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO getReferencia(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO.class, instance, "referencia");
  }
  
  private static void setReferencia(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO.class, instance, "referencia", value);
  }
  
  private static java.lang.Float getValorUnitario(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO.class, instance, "valorUnitario");
  }
  
  private static void setValorUnitario(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO instance, java.lang.Float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO.class, instance, "valorUnitario", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO instance) throws SerializationException {
    setCantidad(instance, (java.lang.Float) streamReader.readObject());
    setFactura(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setReferencia(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO) streamReader.readObject());
    setValorUnitario(instance, (java.lang.Float) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO instance) throws SerializationException {
    streamWriter.writeObject(getCantidad(instance));
    streamWriter.writeObject(getFactura(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getReferencia(instance));
    streamWriter.writeObject(getValorUnitario(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaDetalleTO)object);
  }
  
}
