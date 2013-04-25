package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PagoTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static boolean getAnulado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO instance) {
    return (java.lang.Boolean) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO.class, instance, "anulado");
  }
  
  private static void setAnulado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO instance, boolean value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO.class, instance, "anulado", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO getFactura(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO.class, instance, "factura");
  }
  
  private static void setFactura(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO.class, instance, "factura", value);
  }
  
  private static java.util.Date getFechaPago(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO.class, instance, "fechaPago");
  }
  
  private static void setFechaPago(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO.class, instance, "fechaPago", value);
  }
  
  private static java.util.Date getFechaRegistro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO.class, instance, "fechaRegistro");
  }
  
  private static void setFechaRegistro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO.class, instance, "fechaRegistro", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO.class, instance, "id", value);
  }
  
  private static java.lang.String getObservacion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO.class, instance, "observacion");
  }
  
  private static void setObservacion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO.class, instance, "observacion", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.enumerador.TipoPagoEnum getTipoPago(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.enumerador.TipoPagoEnum) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO.class, instance, "tipoPago");
  }
  
  private static void setTipoPago(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.enumerador.TipoPagoEnum value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO.class, instance, "tipoPago", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO getUsuario(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO.class, instance, "usuario");
  }
  
  private static void setUsuario(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO.class, instance, "usuario", value);
  }
  
  private static java.lang.Float getValorPago(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO.class, instance, "valorPago");
  }
  
  private static void setValorPago(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO instance, java.lang.Float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO.class, instance, "valorPago", value);
  }
  
  private static java.lang.Float getValorSaldo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO.class, instance, "valorSaldo");
  }
  
  private static void setValorSaldo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO instance, java.lang.Float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO.class, instance, "valorSaldo", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO instance) throws SerializationException {
    setAnulado(instance, streamReader.readBoolean());
    setFactura(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.FacturaTO) streamReader.readObject());
    setFechaPago(instance, (java.util.Date) streamReader.readObject());
    setFechaRegistro(instance, (java.util.Date) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setObservacion(instance, streamReader.readString());
    setTipoPago(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.enumerador.TipoPagoEnum) streamReader.readObject());
    setUsuario(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.permiso.objeto.UsuarioTO) streamReader.readObject());
    setValorPago(instance, (java.lang.Float) streamReader.readObject());
    setValorSaldo(instance, (java.lang.Float) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO instance) throws SerializationException {
    streamWriter.writeBoolean(getAnulado(instance));
    streamWriter.writeObject(getFactura(instance));
    streamWriter.writeObject(getFechaPago(instance));
    streamWriter.writeObject(getFechaRegistro(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getObservacion(instance));
    streamWriter.writeObject(getTipoPago(instance));
    streamWriter.writeObject(getUsuario(instance));
    streamWriter.writeObject(getValorPago(instance));
    streamWriter.writeObject(getValorSaldo(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.cartera.objeto.PagoTO)object);
  }
  
}
