package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class RequisicionDetalleTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static float getCantidad(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO.class, instance, "cantidad");
  }
  
  private static void setCantidad(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO instance, float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO.class, instance, "cantidad", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequisicionEnum getEstado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequisicionEnum) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO.class, instance, "estado");
  }
  
  private static void setEstado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequisicionEnum value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO.class, instance, "estado", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO.class, instance, "id", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO getReferencia(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO.class, instance, "referencia");
  }
  
  private static void setReferencia(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO.class, instance, "referencia", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO getRequisicion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO.class, instance, "requisicion");
  }
  
  private static void setRequisicion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO.class, instance, "requisicion", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO instance) throws SerializationException {
    setCantidad(instance, streamReader.readFloat());
    setEstado(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequisicionEnum) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setReferencia(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.articulo.objeto.ReferenciaTO) streamReader.readObject());
    setRequisicion(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionTO) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO instance) throws SerializationException {
    streamWriter.writeFloat(getCantidad(instance));
    streamWriter.writeObject(getEstado(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getReferencia(instance));
    streamWriter.writeObject(getRequisicion(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionDetalleTO)object);
  }
  
}
