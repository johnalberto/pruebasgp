package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class RecursoExcepcion_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.excepciones.RecursoExcepcion)object);
  }
  
}
