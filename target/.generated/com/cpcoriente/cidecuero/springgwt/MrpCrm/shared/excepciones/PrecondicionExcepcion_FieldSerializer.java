package com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class PrecondicionExcepcion_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.PrecondicionExcepcion_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.PrecondicionExcepcion)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.PrecondicionExcepcion_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.PrecondicionExcepcion_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.PrecondicionExcepcion)object);
    }
  }
  public static Class<?> concreteType() {
    return com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.PrecondicionExcepcion.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.PrecondicionExcepcion instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.PrecondicionExcepcion instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.PrecondicionExcepcion();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.excepciones.PrecondicionExcepcion instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
