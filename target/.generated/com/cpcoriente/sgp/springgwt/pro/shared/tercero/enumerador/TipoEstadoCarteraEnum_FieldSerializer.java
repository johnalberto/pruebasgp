package com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TipoEstadoCarteraEnum_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getNameToken(com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoEstadoCarteraEnum instance) {
    return (java.lang.String) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoEstadoCarteraEnum.class, instance, "nameToken");
  }
  
  private static void setNameToken(com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoEstadoCarteraEnum instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoEstadoCarteraEnum.class, instance, "nameToken", value);
  }
  
  private static int getValor(com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoEstadoCarteraEnum instance) {
    return (java.lang.Integer) ReflectionHelper.getField(com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoEstadoCarteraEnum.class, instance, "valor");
  }
  
  private static void setValor(com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoEstadoCarteraEnum instance, int value) 
  {
    ReflectionHelper.setField(com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoEstadoCarteraEnum.class, instance, "valor", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoEstadoCarteraEnum instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoEstadoCarteraEnum instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoEstadoCarteraEnum[] values = com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoEstadoCarteraEnum.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoEstadoCarteraEnum instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoEstadoCarteraEnum_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoEstadoCarteraEnum_FieldSerializer.deserialize(reader, (com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoEstadoCarteraEnum)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoEstadoCarteraEnum_FieldSerializer.serialize(writer, (com.cpcoriente.sgp.springgwt.pro.shared.tercero.enumerador.TipoEstadoCarteraEnum)object);
  }
  
}
