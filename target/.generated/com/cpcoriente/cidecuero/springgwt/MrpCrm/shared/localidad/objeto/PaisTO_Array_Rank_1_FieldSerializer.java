package com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class PaisTO_Array_Rank_1_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO_Array_Rank_1_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO[])object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO_Array_Rank_1_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO_Array_Rank_1_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO[])object);
    }
  }
  public static Class<?> concreteType() {
    return com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO[].class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrm.shared.localidad.objeto.PaisTO[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
}
