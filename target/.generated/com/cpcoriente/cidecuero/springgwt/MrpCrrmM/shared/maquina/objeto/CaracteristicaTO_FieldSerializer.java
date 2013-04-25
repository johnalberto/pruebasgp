package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class CaracteristicaTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO.class, instance, "descripcion");
  }
  
  private static void setDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO.class, instance, "descripcion", value);
  }
  
  private static java.lang.Long getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO.class, instance, "id", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO getMaquina(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO.class, instance, "maquina");
  }
  
  private static void setMaquina(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO.class, instance, "maquina", value);
  }
  
  private static java.lang.String getNombre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO.class, instance, "nombre");
  }
  
  private static void setNombre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO.class, instance, "nombre", value);
  }
  
  private static java.lang.String getValor(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO.class, instance, "valor");
  }
  
  private static void setValor(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO.class, instance, "valor", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO instance) throws SerializationException {
    setDescripcion(instance, streamReader.readString());
    setId(instance, (java.lang.Long) streamReader.readObject());
    setMaquina(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.MaquinaTO) streamReader.readObject());
    setNombre(instance, streamReader.readString());
    setValor(instance, streamReader.readString());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO instance) throws SerializationException {
    streamWriter.writeString(getDescripcion(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getMaquina(instance));
    streamWriter.writeString(getNombre(instance));
    streamWriter.writeString(getValor(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.maquina.objeto.CaracteristicaTO)object);
  }
  
}
