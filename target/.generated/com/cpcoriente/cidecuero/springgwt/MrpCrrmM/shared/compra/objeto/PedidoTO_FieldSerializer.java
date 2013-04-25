package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PedidoTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.enumerador.TipoEstadoPedidoEnum getEstado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.enumerador.TipoEstadoPedidoEnum) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO.class, instance, "estado");
  }
  
  private static void setEstado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.enumerador.TipoEstadoPedidoEnum value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO.class, instance, "estado", value);
  }
  
  private static java.util.Date getFechaOpRecibido(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO.class, instance, "fechaOpRecibido");
  }
  
  private static void setFechaOpRecibido(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO.class, instance, "fechaOpRecibido", value);
  }
  
  private static java.util.Date getFechaRegistro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO.class, instance, "fechaRegistro");
  }
  
  private static void setFechaRegistro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO.class, instance, "fechaRegistro", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO.class, instance, "id", value);
  }
  
  private static java.util.List getPedDetList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO instance) {
    return (java.util.List) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO.class, instance, "pedDetList");
  }
  
  private static void setPedDetList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO.class, instance, "pedDetList", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO getTercero(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO.class, instance, "tercero");
  }
  
  private static void setTercero(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO.class, instance, "tercero", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO instance) throws SerializationException {
    setEstado(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.enumerador.TipoEstadoPedidoEnum) streamReader.readObject());
    setFechaOpRecibido(instance, (java.util.Date) streamReader.readObject());
    setFechaRegistro(instance, (java.util.Date) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setPedDetList(instance, (java.util.List) streamReader.readObject());
    setTercero(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.tercero.objeto.TerceroTO) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO instance) throws SerializationException {
    streamWriter.writeObject(getEstado(instance));
    streamWriter.writeObject(getFechaOpRecibido(instance));
    streamWriter.writeObject(getFechaRegistro(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getPedDetList(instance));
    streamWriter.writeObject(getTercero(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO)object);
  }
  
}
