package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class RequisicionConsultaTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO.class, instance, "descripcion");
  }
  
  private static void setDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO.class, instance, "descripcion", value);
  }
  
  private static java.lang.Integer getEstado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO instance) {
    return (java.lang.Integer) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO.class, instance, "estado");
  }
  
  private static void setEstado(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO instance, java.lang.Integer value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO.class, instance, "estado", value);
  }
  
  private static java.util.Date getFechaOpRecibido(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO.class, instance, "fechaOpRecibido");
  }
  
  private static void setFechaOpRecibido(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO.class, instance, "fechaOpRecibido", value);
  }
  
  private static java.util.Date getFechaRegistro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO.class, instance, "fechaRegistro");
  }
  
  private static void setFechaRegistro(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO.class, instance, "fechaRegistro", value);
  }
  
  private static java.lang.Long getIdReqGlobal(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO.class, instance, "idReqGlobal");
  }
  
  private static void setIdReqGlobal(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO.class, instance, "idReqGlobal", value);
  }
  
  private static java.lang.Long getIdRequisicion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO.class, instance, "idRequisicion");
  }
  
  private static void setIdRequisicion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO.class, instance, "idRequisicion", value);
  }
  
  private static short getTipo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO instance) {
    return (java.lang.Short) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO.class, instance, "tipo");
  }
  
  private static void setTipo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO instance, short value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO.class, instance, "tipo", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO instance) throws SerializationException {
    setDescripcion(instance, streamReader.readString());
    setEstado(instance, (java.lang.Integer) streamReader.readObject());
    setFechaOpRecibido(instance, (java.util.Date) streamReader.readObject());
    setFechaRegistro(instance, (java.util.Date) streamReader.readObject());
    setIdReqGlobal(instance, (java.lang.Long) streamReader.readObject());
    setIdRequisicion(instance, (java.lang.Long) streamReader.readObject());
    setTipo(instance, streamReader.readShort());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO instance) throws SerializationException {
    streamWriter.writeString(getDescripcion(instance));
    streamWriter.writeObject(getEstado(instance));
    streamWriter.writeObject(getFechaOpRecibido(instance));
    streamWriter.writeObject(getFechaRegistro(instance));
    streamWriter.writeObject(getIdReqGlobal(instance));
    streamWriter.writeObject(getIdRequisicion(instance));
    streamWriter.writeShort(getTipo(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.objeto.RequisicionConsultaTO)object);
  }
  
}
