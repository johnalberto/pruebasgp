package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class RequerimientoGlobalDetalleTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static float getCantidad(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO.class, instance, "cantidad");
  }
  
  private static void setCantidad(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO instance, float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO.class, instance, "cantidad", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum getEstado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO.class, instance, "estado");
  }
  
  private static void setEstado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO.class, instance, "estado", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO.class, instance, "id", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoDetalleTO getReqDetalle(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoDetalleTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO.class, instance, "reqDetalle");
  }
  
  private static void setReqDetalle(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoDetalleTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO.class, instance, "reqDetalle", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO getReqGlobal(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO.class, instance, "reqGlobal");
  }
  
  private static void setReqGlobal(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO.class, instance, "reqGlobal", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO instance) throws SerializationException {
    setCantidad(instance, streamReader.readFloat());
    setEstado(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setReqDetalle(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoDetalleTO) streamReader.readObject());
    setReqGlobal(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalTO) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO instance) throws SerializationException {
    streamWriter.writeFloat(getCantidad(instance));
    streamWriter.writeObject(getEstado(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getReqDetalle(instance));
    streamWriter.writeObject(getReqGlobal(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequerimientoGlobalDetalleTO)object);
  }
  
}
