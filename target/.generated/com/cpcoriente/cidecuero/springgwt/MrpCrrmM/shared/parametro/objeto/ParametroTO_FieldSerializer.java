package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ParametroTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO.class, instance, "descripcion");
  }
  
  private static void setDescripcion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO.class, instance, "descripcion", value);
  }
  
  private static java.util.Date getFechaModificacion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO instance) {
    return (java.util.Date) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO.class, instance, "fechaModificacion");
  }
  
  private static void setFechaModificacion(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO instance, java.util.Date value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO.class, instance, "fechaModificacion", value);
  }
  
  private static java.lang.String getId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO.class, instance, "id");
  }
  
  private static void setId(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO.class, instance, "id", value);
  }
  
  private static java.lang.String getValor(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO.class, instance, "valor");
  }
  
  private static void setValor(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO.class, instance, "valor", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO instance) throws SerializationException {
    setDescripcion(instance, streamReader.readString());
    setFechaModificacion(instance, (java.util.Date) streamReader.readObject());
    setId(instance, streamReader.readString());
    setValor(instance, streamReader.readString());
    
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO instance) throws SerializationException {
    streamWriter.writeString(getDescripcion(instance));
    streamWriter.writeObject(getFechaModificacion(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getValor(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.parametro.objeto.ParametroTO)object);
  }
  
}
