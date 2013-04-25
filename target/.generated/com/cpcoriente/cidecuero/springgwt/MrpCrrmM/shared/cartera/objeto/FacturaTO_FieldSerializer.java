package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class FacturaTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static boolean getACredito(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance) {
    return (java.lang.Boolean) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "aCredito");
  }
  
  private static void setACredito(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance, boolean value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "aCredito", value);
  }
  
  private static boolean getAnulada(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance) {
    return (java.lang.Boolean) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "anulada");
  }
  
  private static void setAnulada(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance, boolean value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "anulada", value);
  }
  
  private static java.lang.String getDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "descripcion");
  }
  
  private static void setDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "descripcion", value);
  }
  
  private static float getDescuentoComercial(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "descuentoComercial");
  }
  
  private static void setDescuentoComercial(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance, float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "descuentoComercial", value);
  }
  
  private static java.util.List getFacturaDetalleLista(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance) {
    return (java.util.List) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "facturaDetalleLista");
  }
  
  private static void setFacturaDetalleLista(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "facturaDetalleLista", value);
  }
  
  private static java.util.List getFacturaImpuestoLista(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance) {
    return (java.util.List) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "facturaImpuestoLista");
  }
  
  private static void setFacturaImpuestoLista(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "facturaImpuestoLista", value);
  }
  
  private static java.util.Date getFechaFacturacion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "fechaFacturacion");
  }
  
  private static void setFechaFacturacion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "fechaFacturacion", value);
  }
  
  private static java.util.Date getFechaPago(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "fechaPago");
  }
  
  private static void setFechaPago(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "fechaPago", value);
  }
  
  private static java.util.Date getFechaRegistro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "fechaRegistro");
  }
  
  private static void setFechaRegistro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "fechaRegistro", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "id", value);
  }
  
  private static java.lang.String getNumFact(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "numFact");
  }
  
  private static void setNumFact(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "numFact", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO getTercero(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "tercero");
  }
  
  private static void setTercero(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "tercero", value);
  }
  
  private static float getTotalNeto(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "totalNeto");
  }
  
  private static void setTotalNeto(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance, float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO.class, instance, "totalNeto", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance) throws SerializationException {
    setACredito(instance, streamReader.readBoolean());
    setAnulada(instance, streamReader.readBoolean());
    setDescripcion(instance, streamReader.readString());
    setDescuentoComercial(instance, streamReader.readFloat());
    setFacturaDetalleLista(instance, (java.util.List) streamReader.readObject());
    setFacturaImpuestoLista(instance, (java.util.List) streamReader.readObject());
    setFechaFacturacion(instance, (java.util.Date) streamReader.readObject());
    setFechaPago(instance, (java.util.Date) streamReader.readObject());
    setFechaRegistro(instance, (java.util.Date) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setNumFact(instance, streamReader.readString());
    setTercero(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO) streamReader.readObject());
    setTotalNeto(instance, streamReader.readFloat());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO instance) throws SerializationException {
    streamWriter.writeBoolean(getACredito(instance));
    streamWriter.writeBoolean(getAnulada(instance));
    streamWriter.writeString(getDescripcion(instance));
    streamWriter.writeFloat(getDescuentoComercial(instance));
    streamWriter.writeObject(getFacturaDetalleLista(instance));
    streamWriter.writeObject(getFacturaImpuestoLista(instance));
    streamWriter.writeObject(getFechaFacturacion(instance));
    streamWriter.writeObject(getFechaPago(instance));
    streamWriter.writeObject(getFechaRegistro(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getNumFact(instance));
    streamWriter.writeObject(getTercero(instance));
    streamWriter.writeFloat(getTotalNeto(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO)object);
  }
  
}
