package com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class EstadoRequerimientoEnum_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getNameToken(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum.class, instance, "nameToken");
  }
  
  private static void setNameToken(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum.class, instance, "nameToken", value);
  }
  
  private static int getValor(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum instance) {
    return (java.lang.Integer) ReflectionHelper.getField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum.class, instance, "valor");
  }
  
  private static void setValor(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum instance, int value) 
  {
    ReflectionHelper.setField(com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum.class, instance, "valor", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum[] values = com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum_FieldSerializer.deserialize(reader, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum_FieldSerializer.serialize(writer, (com.cpcoriente.cidecuero.springgwt.MrpCrrmM.shared.requerimiento.enumerador.EstadoRequerimientoEnum)object);
  }
  
}
