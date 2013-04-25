package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class CotizacionDetalleTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.Float getCantidad(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO.class, instance, "cantidad");
  }
  
  private static void setCantidad(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO instance, java.lang.Float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO.class, instance, "cantidad", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionTO getCotizacion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO.class, instance, "cotizacion");
  }
  
  private static void setCotizacion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO.class, instance, "cotizacion", value);
  }
  
  private static java.util.Date getFechaPrecio(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO.class, instance, "fechaPrecio");
  }
  
  private static void setFechaPrecio(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO.class, instance, "fechaPrecio", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO.class, instance, "id", value);
  }
  
  private static java.lang.Float getPrecio(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO.class, instance, "precio");
  }
  
  private static void setPrecio(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO instance, java.lang.Float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO.class, instance, "precio", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO getReferencia(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO.class, instance, "referencia");
  }
  
  private static void setReferencia(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO.class, instance, "referencia", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO instance) throws SerializationException {
    setCantidad(instance, (java.lang.Float) streamReader.readObject());
    setCotizacion(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionTO) streamReader.readObject());
    setFechaPrecio(instance, (java.util.Date) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setPrecio(instance, (java.lang.Float) streamReader.readObject());
    setReferencia(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO instance) throws SerializationException {
    streamWriter.writeObject(getCantidad(instance));
    streamWriter.writeObject(getCotizacion(instance));
    streamWriter.writeObject(getFechaPrecio(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getPrecio(instance));
    streamWriter.writeObject(getReferencia(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.CotizacionDetalleTO)object);
  }
  
}
