package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class BodegaTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.Float getCapacidad(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO instance) {
    return (java.lang.Float) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO.class, instance, "capacidad");
  }
  
  private static void setCapacidad(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO instance, java.lang.Float value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO.class, instance, "capacidad", value);
  }
  
  private static java.lang.String getDireccion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO.class, instance, "direccion");
  }
  
  private static void setDireccion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO.class, instance, "direccion", value);
  }
  
  private static java.lang.String getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO.class, instance, "id", value);
  }
  
  private static java.lang.String getNombre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO.class, instance, "nombre");
  }
  
  private static void setNombre(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO.class, instance, "nombre", value);
  }
  
  private static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.TipoBodegaTO getTipoBod(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO instance) {
    return (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.TipoBodegaTO) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO.class, instance, "tipoBod");
  }
  
  private static void setTipoBod(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO instance, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.TipoBodegaTO value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO.class, instance, "tipoBod", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO instance) throws SerializationException {
    setCapacidad(instance, (java.lang.Float) streamReader.readObject());
    setDireccion(instance, streamReader.readString());
    setId(instance, streamReader.readString());
    setNombre(instance, streamReader.readString());
    setTipoBod(instance, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.TipoBodegaTO) streamReader.readObject());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO instance) throws SerializationException {
    streamWriter.writeObject(getCapacidad(instance));
    streamWriter.writeString(getDireccion(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getNombre(instance));
    streamWriter.writeObject(getTipoBod(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.inventario.objeto.BodegaTO)object);
  }
  
}
