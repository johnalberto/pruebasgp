package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class MaquinaTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.util.List getCaracteristicasList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO instance) {
    return (java.util.List) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO.class, instance, "caracteristicasList");
  }
  
  private static void setCaracteristicasList(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO.class, instance, "caracteristicasList", value);
  }
  
  private static java.lang.String getCodigo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO.class, instance, "codigo");
  }
  
  private static void setCodigo(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO.class, instance, "codigo", value);
  }
  
  private static java.lang.String getDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO.class, instance, "descripcion");
  }
  
  private static void setDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO.class, instance, "descripcion", value);
  }
  
  private static java.util.Date getFechaAdquisicion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO.class, instance, "fechaAdquisicion");
  }
  
  private static void setFechaAdquisicion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO.class, instance, "fechaAdquisicion", value);
  }
  
  private static java.util.Date getFechaMantenimiento(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO.class, instance, "fechaMantenimiento");
  }
  
  private static void setFechaMantenimiento(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO.class, instance, "fechaMantenimiento", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO.class, instance, "id", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO instance) throws SerializationException {
    setCaracteristicasList(instance, (java.util.List) streamReader.readObject());
    setCodigo(instance, streamReader.readString());
    setDescripcion(instance, streamReader.readString());
    setFechaAdquisicion(instance, (java.util.Date) streamReader.readObject());
    setFechaMantenimiento(instance, (java.util.Date) streamReader.readObject());
    setId(instance, (java.lang.Long) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO instance) throws SerializationException {
    streamWriter.writeObject(getCaracteristicasList(instance));
    streamWriter.writeString(getCodigo(instance));
    streamWriter.writeString(getDescripcion(instance));
    streamWriter.writeObject(getFechaAdquisicion(instance));
    streamWriter.writeObject(getFechaMantenimiento(instance));
    streamWriter.writeObject(getId(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO)object);
  }
  
}
