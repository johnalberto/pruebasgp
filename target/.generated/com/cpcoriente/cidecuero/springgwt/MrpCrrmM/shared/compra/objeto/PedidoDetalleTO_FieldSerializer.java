package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PedidoDetalleTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static double getCantidad(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO instance) {
    return (java.lang.Double) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO.class, instance, "cantidad");
  }
  
  private static void setCantidad(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO instance, double value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO.class, instance, "cantidad", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.enumerador.TipoEstadoPedidoEnum getEstado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.enumerador.TipoEstadoPedidoEnum) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO.class, instance, "estado");
  }
  
  private static void setEstado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.enumerador.TipoEstadoPedidoEnum value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO.class, instance, "estado", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO.class, instance, "id", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO getPedido(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO.class, instance, "pedido");
  }
  
  private static void setPedido(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO.class, instance, "pedido", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO getReferencia(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO.class, instance, "referencia");
  }
  
  private static void setReferencia(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO.class, instance, "referencia", value);
  }
  
  private static java.lang.Float getValorUnitario(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO.class, instance, "valorUnitario");
  }
  
  private static void setValorUnitario(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO instance, java.lang.Float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO.class, instance, "valorUnitario", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO instance) throws SerializationException {
    setCantidad(instance, streamReader.readDouble());
    setEstado(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.enumerador.TipoEstadoPedidoEnum) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setPedido(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoTO) streamReader.readObject());
    setReferencia(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO) streamReader.readObject());
    setValorUnitario(instance, (java.lang.Float) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO instance) throws SerializationException {
    streamWriter.writeDouble(getCantidad(instance));
    streamWriter.writeObject(getEstado(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getPedido(instance));
    streamWriter.writeObject(getReferencia(instance));
    streamWriter.writeObject(getValorUnitario(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.compra.objeto.PedidoDetalleTO)object);
  }
  
}
